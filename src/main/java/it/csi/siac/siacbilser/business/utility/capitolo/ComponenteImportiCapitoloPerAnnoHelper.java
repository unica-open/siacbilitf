/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.business.utility.capitolo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import it.csi.siac.siacbilser.model.ComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.DettaglioComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.ImportiCapitolo;
import it.csi.siac.siacbilser.model.ImportiCapitoloUG;
import it.csi.siac.siacbilser.model.ImportiCapitoloUP;
import it.csi.siac.siacbilser.model.MacrotipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.TipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.TipoDettaglioComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.wrapper.ImportiCapitoloPerComponente;
import it.csi.siac.siacbilser.model.wrapper.ImportiImpegnatoPerComponenteAnniSuccNoStanz;
import it.csi.siac.siacbilser.model.wrapper.ImportiImpegnatoPerComponenteTriennioNoStanz;

public final class ComponenteImportiCapitoloPerAnnoHelper {

	private ComponenteImportiCapitoloPerAnnoHelper() {

	}

	
	/**
	 * Costruzione componenti per anno 
	 * @param importiCapitoloList
	 * @return
	 */
	public static List<ImportiCapitoloPerComponente> toComponentiImportiCapitoloPerAnno(
			List<ImportiCapitolo> importiCapitoloList ) {

		List<ImportiCapitoloPerComponente> importiComponentiCapitolo = new ArrayList<ImportiCapitoloPerComponente>();
		int j=0;
		if (!importiCapitoloList.isEmpty()) {
			if (importiCapitoloList.get(1).getListaComponenteImportiCapitolo() != null
					&& !importiCapitoloList.get(1).getListaComponenteImportiCapitolo().isEmpty()) {
				// numero componenti
				int numComponenti = importiCapitoloList.get(1).getListaComponenteImportiCapitolo().size();
				for (int i = 0; i < numComponenti; i++) {
					int idComponente = 0;
					//SIAC-7349 - Start - MR - SR200 - 15/04/2020 - componente da mappare
					ComponenteImportiCapitolo componenteImportiCapitolo = importiCapitoloList.get(1).getListaComponenteImportiCapitolo().get(i);
					//SIAC-7349 - End

					if (importiCapitoloList.get(1).getListaComponenteImportiCapitolo().get(i)
							.getListaDettaglioComponenteImportiCapitolo() != null
							&& !importiCapitoloList.get(1).getListaComponenteImportiCapitolo().get(i)
									.getListaDettaglioComponenteImportiCapitolo().isEmpty()) {
						idComponente = importiCapitoloList.get(1).getListaComponenteImportiCapitolo().get(i).getUid();
						int numDettagli = importiCapitoloList.get(1).getListaComponenteImportiCapitolo().get(i)
								.getListaDettaglioComponenteImportiCapitolo().size();
						
						for (int k = 0; k < numDettagli; k++) {
							// FACCIAMO LA SINGOLA RIGA 
							DettaglioComponenteImportiCapitolo dettaglio = importiCapitoloList.get(1).getListaComponenteImportiCapitolo().get(i).getListaDettaglioComponenteImportiCapitolo().get(k);
							
							ImportiCapitoloPerComponente icpc = new ImportiCapitoloPerComponente();
							icpc.setTipoComponenteImportiCapitolo(importiCapitoloList.get(1)
									.getListaComponenteImportiCapitolo().get(i).getTipoComponenteImportiCapitolo());
							icpc.setTipoDettaglioComponenteImportiCapitolo(
									dettaglio.getTipoDettaglioComponenteImportiCapitolo());
							// IMPORTI....mettere controlli su anno ...mapppare
							
							//SIAC-7227 si setta a null l'anno precedente per evitare incongruenze di componenti
							// ANNO PRECEDENTE
							icpc.setDettaglioAnnoPrec(buildDettaglioComponente(importiCapitoloList, i, k, 0));
							//
							
							// RESIDUO				
							//SIAC-7349 - SR200 - Start - MR - 15/04/2020 - residui iniziali e finali delle singole componenti
							if(k % 2 == 0){ // devo prendere in considerazione la riga dell' IMPEGNATO che si trova all'indice 1
								icpc.setDettaglioResiduiIniziale(new DettaglioComponenteImportiCapitolo());
								icpc.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());								
							}else{
								BigDecimal importoResiduoIniziale = componenteImportiCapitolo.getImpegnatoResiduoIniziale() != null ? componenteImportiCapitolo.getImpegnatoResiduoIniziale() : BigDecimal.ZERO;
								DettaglioComponenteImportiCapitolo resIniziale = new DettaglioComponenteImportiCapitolo();
								resIniziale.setImporto(importoResiduoIniziale);
								icpc.setDettaglioResiduiIniziale(resIniziale);
								BigDecimal importoResiduoFinale = componenteImportiCapitolo.getImpegnatoResiduoFinale() != null ? componenteImportiCapitolo.getImpegnatoResiduoFinale() : BigDecimal.ZERO;
								DettaglioComponenteImportiCapitolo resFinale = new DettaglioComponenteImportiCapitolo();
								resFinale.setImporto(importoResiduoFinale);
								icpc.setDettaglioResidui(resFinale);
								
							}
							//SIAC-7349 - End
							
							// ANNO 0
							icpc.setDettaglioAnno0(buildDettaglioComponente(importiCapitoloList, i, k, 1));
							// ANNO 1
							icpc.setDettaglioAnno1(buildDettaglioComponente(importiCapitoloList, i, k, 2));
							// ANNO 2
							icpc.setDettaglioAnno2(buildDettaglioComponente(importiCapitoloList, i, k, 3));
							// SUCCESSIVO
							icpc.setDettaglioAnniSucc(new DettaglioComponenteImportiCapitolo());
							
							//SIAC-7349
							icpc.setUidComponente(idComponente);
							
							importiComponentiCapitolo.add(icpc);
						}

					}
				}

			}

		}

		return importiComponentiCapitolo;

	}

	/**
	 * 
	 * @param importiCapitoloList
	 * @param nComponente
	 * @param nDettaglio
	 * @param nAnno
	 * @return
	 */
	public static DettaglioComponenteImportiCapitolo buildDettaglioComponente(
			List<ImportiCapitolo> importiCapitoloList, int nComponente, int nDettaglio, int nAnno) {
		DettaglioComponenteImportiCapitolo dettaglio = new DettaglioComponenteImportiCapitolo();

		ComponenteImportiCapitolo cic = new ComponenteImportiCapitolo();

		if (importiCapitoloList.get(nAnno) != null
				&& importiCapitoloList.get(nAnno).getListaComponenteImportiCapitolo() != null
				&& importiCapitoloList.get(nAnno).getListaComponenteImportiCapitolo().size() > nComponente 
				&& importiCapitoloList.get(nAnno).getListaComponenteImportiCapitolo().get(nComponente)
						.getListaDettaglioComponenteImportiCapitolo() != null
				&& importiCapitoloList.get(nAnno).getListaComponenteImportiCapitolo().get(nComponente)
						.getListaDettaglioComponenteImportiCapitolo().size() > nDettaglio) { 

			//SIAC-7227
			//faccio in modo di non passare mai il dato dell'anno precedente
			//creando un oggetto vuoto da popolare in seguito
			if (importiCapitoloList.size() > nAnno && nAnno != 0) { 
	
				dettaglio = importiCapitoloList.get(nAnno).getListaComponenteImportiCapitolo().get(nComponente)
						.getListaDettaglioComponenteImportiCapitolo().get(nDettaglio);
				
				//UID
				cic.setUid(importiCapitoloList.get(nAnno).getListaComponenteImportiCapitolo().get(nComponente).getUid());
				//SIAC-7227
				//passo anche le informazioni del tipo della componente
				//utili per comparare le varie componenti
				cic.setTipoComponenteImportiCapitolo(importiCapitoloList.get(nAnno).getListaComponenteImportiCapitolo().get(nComponente).getTipoComponenteImportiCapitolo());
		
			}
			
		}
		
		dettaglio.setComponenteImportiCapitolo(cic);
		dettaglio.setAnnoCompetenza(importiCapitoloList.get(nAnno).getAnnoCompetenza());
		return dettaglio;
	}


	/**
	 * Costruzione della componente per anno con residuo e anni successivi.
	 *
	 * @param importiCapitoloList the importi capitolo list
	 * @param importiCapitoloResiduo the importi capitolo residuo
	 * @param importiCapitoloAnniSuccessivi the importi capitolo anni successivi
	 * @return the list
	 */
	public static List<ImportiCapitoloPerComponente> toComponentiImportiCapitoloPerAnno(List<ImportiCapitolo> importiCapitoloList, ImportiCapitolo importiCapitoloResiduo,ImportiCapitolo importiCapitoloAnniSuccessivi ) {

		List<ImportiCapitoloPerComponente> importiComponentiCapitolo = new ArrayList<ImportiCapitoloPerComponente>();
		
		if(importiCapitoloList == null || importiCapitoloList.isEmpty()) {
			return importiComponentiCapitolo;
		}
		ImportiCapitolo importiCapitolo1 = importiCapitoloList.get(1);
		if(importiCapitolo1 == null || importiCapitolo1.getListaComponenteImportiCapitolo() == null || importiCapitolo1.getListaComponenteImportiCapitolo().isEmpty()) {
			return importiComponentiCapitolo;
		}
			
		int numComponenti = importiCapitolo1.getListaComponenteImportiCapitolo().size();
		for (int i = 0; i < numComponenti; i++) {
			ComponenteImportiCapitolo componenteImportiCapitolo = importiCapitolo1.getListaComponenteImportiCapitolo().get(i);
			if (componenteImportiCapitolo.getListaDettaglioComponenteImportiCapitolo() != null
					&& !componenteImportiCapitolo.getListaDettaglioComponenteImportiCapitolo().isEmpty()) {
				int numDettagli = componenteImportiCapitolo.getListaDettaglioComponenteImportiCapitolo().size();
				for (int k = 0; k < numDettagli; k++) {
					// SINGOLA RIGA 
					DettaglioComponenteImportiCapitolo dettaglio = componenteImportiCapitolo.getListaDettaglioComponenteImportiCapitolo().get(k);
					
					ImportiCapitoloPerComponente icpc = new ImportiCapitoloPerComponente();
					//SIAC-7156
					if(dettaglio.isPropostaDefault()==true){
						icpc.setPropostaDefault(true);
					}
					icpc.setTipoComponenteImportiCapitolo(componenteImportiCapitolo.getTipoComponenteImportiCapitolo());
					icpc.setTipoDettaglioComponenteImportiCapitolo(
							dettaglio.getTipoDettaglioComponenteImportiCapitolo());
					// IMPORTI....mettere controlli su anno ...mapppare
					// ANNO PRECEDENTE
					icpc.setDettaglioAnnoPrec(buildDettaglioComponente(importiCapitoloList, i, k, 0));
					// RESIDUO
					//SIAC-7349 - SR200 - Start - MR - 15/04/2020 - residui iniziali e finali delle singole componenti
					if(k % 2 == 0){
						icpc.setDettaglioResiduiIniziale(new DettaglioComponenteImportiCapitolo());
						icpc.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());								
					}else{
						DettaglioComponenteImportiCapitolo resIniziale = new DettaglioComponenteImportiCapitolo();
						BigDecimal importoResiduoIniziale = componenteImportiCapitolo.getImpegnatoResiduoIniziale() != null ? componenteImportiCapitolo.getImpegnatoResiduoIniziale() : BigDecimal.ZERO;
						resIniziale.setImporto(importoResiduoIniziale);
						icpc.setDettaglioResiduiIniziale(resIniziale);
						BigDecimal importoResiduoFinale = componenteImportiCapitolo.getImpegnatoResiduoFinale() != null ? componenteImportiCapitolo.getImpegnatoResiduoFinale() : BigDecimal.ZERO;
						DettaglioComponenteImportiCapitolo resFinale = new DettaglioComponenteImportiCapitolo();
						resFinale.setImporto(importoResiduoFinale);
						icpc.setDettaglioResidui(resFinale);
						BigDecimal importoImpegnatoAnniPrec = componenteImportiCapitolo.getImpegnatoAnniPrecedenti() != null ? componenteImportiCapitolo.getImpegnatoAnniPrecedenti() : BigDecimal.ZERO;
						DettaglioComponenteImportiCapitolo anniPrec = new DettaglioComponenteImportiCapitolo();
						anniPrec.setImporto(importoImpegnatoAnniPrec);
						icpc.setDettaglioAnnoPrec(anniPrec);
						
					}
					//SIAC-7349 - End
					//icpc.setDettaglioResidui(buildDettaglioComponenteResiduo(importiCapitoloResiduo.getListaComponenteImportiCapitolo(),i,k));
					// ANNO 0
					icpc.setDettaglioAnno0(buildDettaglioComponente(importiCapitoloList, i, k, 1));
					// ANNO 1
					icpc.setDettaglioAnno1(buildDettaglioComponente(importiCapitoloList, i, k, 2));
					// ANNO 2
					icpc.setDettaglioAnno2(buildDettaglioComponente(importiCapitoloList, i, k, 3));
					// SUCCESSIVI
					icpc.setDettaglioAnniSucc(buildDettaglioComponenteResiduo(importiCapitoloAnniSuccessivi.getListaComponenteImportiCapitolo(),i,k));

					importiComponentiCapitolo.add(icpc);
				}
			}
		}
	
		return importiComponentiCapitolo;
	
	}
	
	//SIAC-7227
	/**
	 * Costruzione della componente per anno precedente con confronto delle componenti.
	 *
	 * @param importiComponentiCapitolo the importi componenti capitolo
	 * @param importiCapitolo the importi capitolo
	 * @return the list
	 */
	public static List<ImportiCapitoloPerComponente> toComponentiImportiCapitoloPerAnnoPrecedente(List<ImportiCapitoloPerComponente> importiComponentiCapitolo, ImportiCapitolo importiCapitolo) {
		
		List<ImportiCapitoloPerComponente> listaTemporaneaTransfer = new ArrayList<ImportiCapitoloPerComponente>();
		
		
		//popolo la mia lista con i vari importi dalle componenti dell'anno precedente
		popolaDatiAnnoPrecedente(importiCapitolo, listaTemporaneaTransfer, false);
		
		//eseguo il match delle componenti con la lista tornatami dal servizio con anche i default
		int numeroDettagli = listaTemporaneaTransfer.size();
		for (int j = 0; j < numeroDettagli; j++) {
			
			int indexToMatch = 0;
			ImportiCapitoloPerComponente daPassare = listaTemporaneaTransfer.get(j);
			Integer int2 = (Integer) daPassare.getTipoComponenteImportiCapitolo().getUid();
			
			//creo una lista temporanea di Uid
			List<Integer> listUid = new ArrayList<Integer>();
			    
			//controllo che la componente da passare abbia corrispondenze nella lista
			for (int k = 0; k < importiComponentiCapitolo.size(); k++) {
				ImportiCapitoloPerComponente importiCapitoloPerComponente = importiComponentiCapitolo.get(k);
				if(importiCapitoloPerComponente == null) {
					continue;
				}
				//confronto gli uid per assicurarmi di non passare lo stesso valore a elementi provenienti dallo stesso tipo
				Integer int1 = (Integer)importiCapitoloPerComponente.getTipoComponenteImportiCapitolo().getUid();

				listUid.add(int1);
				
				String codiceMacroTipo = estraiCodiceMacroTipo(importiCapitoloPerComponente.getTipoComponenteImportiCapitolo());
				
				String codiceMacroTipoRef = estraiCodiceMacroTipo((daPassare.getTipoComponenteImportiCapitolo()));
				
				//controllo anche il macrotipo per sincerarmi che la componente sia davvero quella
				if(codiceMacroTipo.equals(codiceMacroTipoRef) && importiCapitoloPerComponente.getTipoDettaglioComponenteImportiCapitolo().equals(daPassare.getTipoDettaglioComponenteImportiCapitolo())
						&&  int1.compareTo(int2) == 0) {
					//assegno il nuovo valore 
					importiCapitoloPerComponente.setDettaglioAnnoPrec(daPassare.getDettaglioAnnoPrec());
					indexToMatch = k;
				}
				
			}
			
			//se non si trova nessuna corrispondenza nella lista degli importi  || creo io la nuova componente, poiche' presente solo per l'anno precedente
			if(!listUid.contains(int2) || TipoDettaglioComponenteImportiCapitolo.IMPEGNATO.equals(daPassare.getTipoDettaglioComponenteImportiCapitolo())) {
				
				//aggiungo le colonne mancanti alla componente per la tabella
				// RESIDUO
				daPassare.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());
				// ANNO 0
				daPassare.setDettaglioAnno0(new DettaglioComponenteImportiCapitolo());
				// ANNO 1
				daPassare.setDettaglioAnno1(new DettaglioComponenteImportiCapitolo());
				// ANNO 2
				daPassare.setDettaglioAnno2(new DettaglioComponenteImportiCapitolo());
				// SUCCESSIVI
				daPassare.setDettaglioAnniSucc(new DettaglioComponenteImportiCapitolo());
				//
				
				//se l'index e' a 0 vuol dire che non c'erano corrispondenze tra le componenti ritornate dal servizio
				if(!importiComponentiCapitolo.contains(daPassare) && indexToMatch == 0) {
					//aggiungo la nuova componente
					importiComponentiCapitolo.add(daPassare);					
				}
			}
			
		}
		
		Comparator<ImportiCapitoloPerComponente> comparator = new Comparator<ImportiCapitoloPerComponente>() {

			@Override
			public int compare(ImportiCapitoloPerComponente o1, ImportiCapitoloPerComponente o2) {
				Integer o1Int = o1.isPropostaDefault() ? 1 : 0;
				Integer o2Int = o2.isPropostaDefault() ? 1 : 0;
				return o1Int.compareTo(o2Int);
			}
			
		};
		
		Collections.sort(importiComponentiCapitolo, comparator);
		
		return importiComponentiCapitolo;
	}


	/**
	 * @param importiCapitolo
	 * @param listaTemporaneaTransfer
	 */
	//SIAC-7349 - SR200 - MR - Start - 17/04/2020 Aggiunto flag nella firma per mantenere retrocompatibilita
	private static void popolaDatiAnnoPrecedente(ImportiCapitolo importiCapitolo, List<ImportiCapitoloPerComponente> listaTemporaneaTransfer, boolean isNewImplementation) {
		int numComponenti = importiCapitolo.getListaComponenteImportiCapitolo().size();
		for (int i = 0; i < numComponenti; i++) {
			ComponenteImportiCapitolo componenteImportiCapitolo = importiCapitolo.getListaComponenteImportiCapitolo().get(i);
			if(isNewImplementation){
				
				
				
				int resFin = (componenteImportiCapitolo.getImpegnatoResiduoFinale()!=null ) ? componenteImportiCapitolo.getImpegnatoResiduoFinale().compareTo(BigDecimal.ZERO) : 0;
				int resIn = (componenteImportiCapitolo.getImpegnatoResiduoIniziale()!=null) ? componenteImportiCapitolo.getImpegnatoResiduoIniziale().compareTo(BigDecimal.ZERO) : 0;
				//SIAC-7349-fix FL Start SIAC-7716 verifica anche l'importo dello stanziamento della compenente nell'anno precedente 
				int hasImportoImpegnato = componenteImportiCapitolo.getListaDettaglioComponenteImportiCapitolo().get(1).getImporto().compareTo(BigDecimal.ZERO);
				int hasImportoStanziamento = componenteImportiCapitolo.getListaDettaglioComponenteImportiCapitolo().get(0).getImporto().compareTo(BigDecimal.ZERO);
				if(resFin + resIn + hasImportoImpegnato + hasImportoStanziamento == 0){
					continue;
				}
				
			}
			if (componenteImportiCapitolo.getListaDettaglioComponenteImportiCapitolo() != null
					&& !componenteImportiCapitolo.getListaDettaglioComponenteImportiCapitolo().isEmpty()) {
				int numDettagli = componenteImportiCapitolo.getListaDettaglioComponenteImportiCapitolo().size();
				for (int k = 0; k < numDettagli; k++) {
					// SINGOLA RIGA 
					DettaglioComponenteImportiCapitolo dettaglio = componenteImportiCapitolo.getListaDettaglioComponenteImportiCapitolo().get(k);
					
					ImportiCapitoloPerComponente icpc = new ImportiCapitoloPerComponente();
					//SIAC-7156
					if(dettaglio.isPropostaDefault()==true){
						icpc.setPropostaDefault(true);
					}
					
					
					
					
					//SIAC-7349 - SR200 - MR - Start - 17/04/2020 Aggiunto flag  per mantenere retrocompatibilita
					if(isNewImplementation && 
							dettaglio.getTipoDettaglioComponenteImportiCapitolo().equals(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO)){
						BigDecimal importoResiduoIniziale = componenteImportiCapitolo.getImpegnatoResiduoIniziale() != null ? componenteImportiCapitolo.getImpegnatoResiduoIniziale() : BigDecimal.ZERO;
						DettaglioComponenteImportiCapitolo residuoIniziale = new DettaglioComponenteImportiCapitolo();
						residuoIniziale.setImporto(importoResiduoIniziale);
						icpc.setDettaglioResiduiIniziale(residuoIniziale);
						BigDecimal importoResiduoFinale = componenteImportiCapitolo.getImpegnatoResiduoFinale() != null ? componenteImportiCapitolo.getImpegnatoResiduoFinale() : BigDecimal.ZERO;
						DettaglioComponenteImportiCapitolo residuoFinale = new DettaglioComponenteImportiCapitolo();
						residuoFinale.setImporto(importoResiduoFinale);
						icpc.setDettaglioResidui(residuoFinale);
					}else{
						icpc.setDettaglioResiduiIniziale(new DettaglioComponenteImportiCapitolo());
						icpc.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());
					}
					
					icpc.setTipoComponenteImportiCapitolo(componenteImportiCapitolo.getTipoComponenteImportiCapitolo());
					icpc.setTipoDettaglioComponenteImportiCapitolo(dettaglio.getTipoDettaglioComponenteImportiCapitolo());
					
					icpc.setDettaglioAnnoPrec(buildDettaglioComponenteAnnoPrecedente(importiCapitolo, i, k));
					
					listaTemporaneaTransfer.add(icpc);
				}
			}
		}
	}
	
	/**
	 * Estrai codice macro tipo.
	 *
	 * @param tipo the tipo
	 * @return the string
	 */
	private static String estraiCodiceMacroTipo(TipoComponenteImportiCapitolo tipo) {
		return tipo != null && tipo.getMacrotipoComponenteImportiCapitolo() != null? StringUtils.defaultIfBlank(tipo.getMacrotipoComponenteImportiCapitolo().getCodice(), "") : null;
	}
	
	/**
	 * Estrai codice macro tipo.
	 *
	 * @param tipo the tipo
	 * @return the string
	 */
	private static String estraiCodiceDettaglio(TipoComponenteImportiCapitolo tipo) {
		return tipo != null && tipo.getMacrotipoComponenteImportiCapitolo() != null? StringUtils.defaultIfBlank(tipo.getMacrotipoComponenteImportiCapitolo().getCodice(), "") : null;
	}
	//
	
	//SIAC-7227
	/**
	 * Costruzionde del dettaglio dell'anno precedente
	 * @param importiCapitoloList
	 * @param nComponente
	 * @param nDettaglio
	 * @return
	 */
	public static DettaglioComponenteImportiCapitolo buildDettaglioComponenteAnnoPrecedente(
			ImportiCapitolo componenteImportiCapitolo, int nComponente, int nDettaglio) {
		
		DettaglioComponenteImportiCapitolo dettaglio = new DettaglioComponenteImportiCapitolo();		
		ComponenteImportiCapitolo cic = new ComponenteImportiCapitolo();
		
		if (componenteImportiCapitolo != null) {
			
			dettaglio = componenteImportiCapitolo.getListaComponenteImportiCapitolo().get(nComponente)
					.getListaDettaglioComponenteImportiCapitolo().get(nDettaglio);
			
			cic.setUid(componenteImportiCapitolo.getListaComponenteImportiCapitolo().get(nComponente).getUid());
			cic.setTipoComponenteImportiCapitolo(componenteImportiCapitolo.getListaComponenteImportiCapitolo()
					.get(nComponente).getTipoComponenteImportiCapitolo());
		}
		
		dettaglio.setComponenteImportiCapitolo(cic);
			
		return dettaglio;
	}
	//
	
	
	/**
	 * buildDettaglioComponenteResiduo method
	 * @param importiCapitoloList
	 * @param nComponente
	 * @param nDettaglio
	 * @return
	 */
	private static DettaglioComponenteImportiCapitolo buildDettaglioComponenteResiduo(
			List<ComponenteImportiCapitolo> componentImportiCapitoloList, int nComponente, int nDettaglio) {
		DettaglioComponenteImportiCapitolo dettaglio = new DettaglioComponenteImportiCapitolo();

			if ( componentImportiCapitoloList != null
					&& componentImportiCapitoloList.size() > nComponente 
					&& componentImportiCapitoloList.get(nComponente)
							.getListaDettaglioComponenteImportiCapitolo() != null
					&& componentImportiCapitoloList.get(nComponente).getListaDettaglioComponenteImportiCapitolo().size() > nDettaglio) { 
				dettaglio = componentImportiCapitoloList.get(nComponente).getListaDettaglioComponenteImportiCapitolo().get(nDettaglio);
				//UID
				ComponenteImportiCapitolo cic = new ComponenteImportiCapitolo();
				cic.setUid(componentImportiCapitoloList.get(nComponente).getUid());
				dettaglio.setComponenteImportiCapitolo(cic);
			}
		return dettaglio;
	}
	
	
	
	
	/**
	 * BUILD SEZIONE COMPETENZA
	 * @param importiCapitolo
	 * @param residuo
	 * @param annoSuccessivoImporto
	 * @param competenzaComponenti
	 */
	public static void buildCompetenzaRowUP(List<ImportiCapitolo> importiCapitolo, ImportiCapitolo residuo, ImportiCapitolo annoSuccessivoImporto, List<ImportiCapitoloPerComponente> competenzaComponenti){
		if(importiCapitolo!= null && !importiCapitolo.isEmpty() && importiCapitolo.size()>=3 ){
			//STANZIAMNETO
			ImportiCapitoloPerComponente competenzaStanziamento = new ImportiCapitoloPerComponente();
			competenzaStanziamento.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			DettaglioComponenteImportiCapitolo annoPrecedente = new DettaglioComponenteImportiCapitolo();
			annoPrecedente.setImporto(importiCapitolo.get(0).getStanziamento());
			competenzaStanziamento.setDettaglioAnnoPrec(annoPrecedente);
			
			DettaglioComponenteImportiCapitolo anno0 = new DettaglioComponenteImportiCapitolo();
			anno0.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			anno0.setEditabile(false);
			anno0.setImporto(importiCapitolo.get(1).getStanziamento());
			competenzaStanziamento.setDettaglioAnno0(anno0);
			
			DettaglioComponenteImportiCapitolo anno1 = new DettaglioComponenteImportiCapitolo();
			anno1.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			anno1.setEditabile(false);
			anno1.setImporto(importiCapitolo.get(2).getStanziamento());
			competenzaStanziamento.setDettaglioAnno1(anno1);
			
			DettaglioComponenteImportiCapitolo anno2 = new DettaglioComponenteImportiCapitolo();
			anno2.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			anno2.setEditabile(false);
			anno2.setImporto(importiCapitolo.get(3).getStanziamento());
			competenzaStanziamento.setDettaglioAnno2(anno2);
			
			DettaglioComponenteImportiCapitolo residui = new DettaglioComponenteImportiCapitolo();
			residui.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			residui.setEditabile(false);
			residui.setImporto(residuo!= null ? residuo.getStanziamento() : BigDecimal.ZERO);
			competenzaStanziamento.setDettaglioResidui(residui);
			
			DettaglioComponenteImportiCapitolo annoSuccessivo = new DettaglioComponenteImportiCapitolo();
			annoSuccessivo.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			annoSuccessivo.setEditabile(false);
			annoSuccessivo.setImporto(annoSuccessivoImporto!= null ? annoSuccessivoImporto.getStanziamento() : BigDecimal.ZERO);
			competenzaStanziamento.setDettaglioAnniSucc(annoSuccessivo);
			competenzaComponenti.add(competenzaStanziamento);
			
			//IMPEGNATO
			ImportiCapitoloPerComponente competenzaImpegnato = new ImportiCapitoloPerComponente();
			competenzaImpegnato.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			DettaglioComponenteImportiCapitolo annoPrecedenteI = new DettaglioComponenteImportiCapitolo();
			annoPrecedenteI.setImporto(((ImportiCapitoloUP)importiCapitolo.get(1)).getDiCuiImpegnatoAnnoPrec());
			competenzaImpegnato.setDettaglioAnnoPrec(annoPrecedenteI);
			
			DettaglioComponenteImportiCapitolo anno0I = new DettaglioComponenteImportiCapitolo();
			anno0I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			anno0I.setEditabile(false);
			anno0I.setImporto(((ImportiCapitoloUP)importiCapitolo.get(1)).getImpegnatoEffettivoUPAnno1());
			competenzaImpegnato.setDettaglioAnno0(anno0I);
			
			DettaglioComponenteImportiCapitolo anno1I = new DettaglioComponenteImportiCapitolo();
			anno1I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			anno1I.setEditabile(true);
			anno1I.setImporto(((ImportiCapitoloUP)importiCapitolo.get(1)).getImpegnatoEffettivoUPAnno2());
			competenzaImpegnato.setDettaglioAnno1(anno1I);
			
			DettaglioComponenteImportiCapitolo anno2I = new DettaglioComponenteImportiCapitolo();
			anno2I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			anno2I.setEditabile(true);
			anno2I.setImporto(((ImportiCapitoloUP)importiCapitolo.get(1)).getImpegnatoEffettivoUPAnno3());
			competenzaImpegnato.setDettaglioAnno2(anno2I);
			
			DettaglioComponenteImportiCapitolo residuiI = new DettaglioComponenteImportiCapitolo();
			residuiI.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			residuiI.setEditabile(true);
			
			//- SIAC-7349 GS 15/07/2020 riga Competenza.Impegnato - Colonna residuo<N>.Finale deve mostrare lo stesso valore della riga Residuo.EFfettivi - colonna Residuo<N>.Finale
			// residuiI.setImporto(residuo!= null ? residuo.getStanziamento() : BigDecimal.ZERO);
			residuiI.setImporto(calcoloImportoResidui(importiCapitolo, true));
			
			competenzaImpegnato.setDettaglioResidui(residuiI);
			
			DettaglioComponenteImportiCapitolo annoSuccessivoI = new DettaglioComponenteImportiCapitolo();
			annoSuccessivoI.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			annoSuccessivoI.setEditabile(false);
			//SIAC-7349 - Start - MR - SR200 - 15/04/2020 importo impegnato come sommatoria degli impegnati delle componenti
//			BigDecimal importoImpegnatoAnniSucc = BigDecimal.ZERO;
//			if(annoSuccessivoImporto.getListaComponenteImportiCapitolo() != null && !annoSuccessivoImporto.getListaComponenteImportiCapitolo().isEmpty()){
//				for(ComponenteImportiCapitolo cip : annoSuccessivoImporto.getListaComponenteImportiCapitolo()){
//					importoImpegnatoAnniSucc = importoImpegnatoAnniSucc.add(cip.getListaDettaglioComponenteImportiCapitolo().get(1).getImporto());
//				}
//			}
			//annoSuccessivoI.setImporto(annoSuccessivoImporto!= null ? annoSuccessivoImporto.getStanziamento() : BigDecimal.ZERO);
			annoSuccessivoI.setImporto(((ImportiCapitoloUP)importiCapitolo.get(1)).getDiCuiImpegnatoAnniSucc());
			competenzaImpegnato.setDettaglioAnniSucc(annoSuccessivoI);
			competenzaComponenti.add(competenzaImpegnato);
			
			
			//Disponibilita
			ImportiCapitoloPerComponente disponibilita = new ImportiCapitoloPerComponente();
			disponibilita.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.DISPONIBILITAIMPEGNARE);
			DettaglioComponenteImportiCapitolo annoPrecedenteD = new DettaglioComponenteImportiCapitolo();
			annoPrecedenteD.setImporto(BigDecimal.ZERO);
			disponibilita.setDettaglioAnnoPrec(annoPrecedenteD);
			
			DettaglioComponenteImportiCapitolo anno0D = new DettaglioComponenteImportiCapitolo();
			anno0D.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.DISPONIBILITAIMPEGNARE);
			anno0D.setEditabile(false);
			//SIAC-7349 - Start - SR200 - MR/GS - 06/04/2020 - Mapping della disponibilita ad impegnare anno1
			//anno0D.setImporto( competenzaStanziamento.getDettaglioAnno0().getImporto().subtract(competenzaImpegnato.getDettaglioAnno0().getImporto())); 
			anno0D.setImporto(((ImportiCapitoloUP)importiCapitolo.get(1)).getDisponibilitaImpegnareUPAnno1());
			//SIAC-7349 - End
			disponibilita.setDettaglioAnno0(anno0D);
			
			DettaglioComponenteImportiCapitolo anno1D = new DettaglioComponenteImportiCapitolo();
			anno1D.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.DISPONIBILITAIMPEGNARE);
			anno1D.setEditabile(true);
			//SIAC-7349 - Start - SR200 - MR/GS - 06/04/2020 - Mapping della disponibilita ad impegnare anno2
			//anno1D.setImporto( competenzaStanziamento.getDettaglioAnno1().getImporto().subtract(competenzaImpegnato.getDettaglioAnno1().getImporto()));
			anno1D.setImporto(((ImportiCapitoloUP)importiCapitolo.get(1)).getDisponibilitaImpegnareUPAnno2()); 
			//SIAC-7349 - End
			disponibilita.setDettaglioAnno1(anno1D);
			
			DettaglioComponenteImportiCapitolo anno2D = new DettaglioComponenteImportiCapitolo();
			anno2D.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.DISPONIBILITAIMPEGNARE);
			anno2D.setEditabile(true);
			//SIAC-7349 - Start - SR200 - MR/GS - 06/04/2020 - Mapping della disponibilita ad impegnare anno3
			//anno2D.setImporto(competenzaStanziamento.getDettaglioAnno2().getImporto().subtract(competenzaImpegnato.getDettaglioAnno2().getImporto()));
			anno2D.setImporto(((ImportiCapitoloUP)importiCapitolo.get(1)).getDisponibilitaImpegnareUPAnno3()); 
			//SIAC-7349 - End
			disponibilita.setDettaglioAnno2(anno2D);
			
			DettaglioComponenteImportiCapitolo residuiD = new DettaglioComponenteImportiCapitolo();
			residuiD.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.DISPONIBILITAIMPEGNARE);
			residuiD.setEditabile(true);
			residuiD.setImporto(residuo!= null ? residuo.getStanziamento() : BigDecimal.ZERO);
			disponibilita.setDettaglioResidui(residuiD);
			
			DettaglioComponenteImportiCapitolo annoSuccessivoD = new DettaglioComponenteImportiCapitolo();
			annoSuccessivoD.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.DISPONIBILITAIMPEGNARE);
			annoSuccessivoD.setEditabile(false);
			annoSuccessivoD.setImporto(annoSuccessivoImporto!= null ? annoSuccessivoImporto.getStanziamento() : BigDecimal.ZERO);
			disponibilita.setDettaglioAnniSucc(annoSuccessivoD);
			competenzaComponenti.add(disponibilita);
			
		}
	}
	
	//PER UG
	public static void buildCompetenzaRowUG(List<ImportiCapitolo> importiCapitolo, ImportiCapitolo residuo, ImportiCapitolo annoSuccessivoImporto, List<ImportiCapitoloPerComponente> competenzaComponenti){
		if(importiCapitolo!= null && !importiCapitolo.isEmpty() && importiCapitolo.size()>=3 ){

			/**
			 * STANZIAMENTO
			 */
			//Dichiarazione
			ImportiCapitoloPerComponente competenzaStanziamento = new ImportiCapitoloPerComponente();
			DettaglioComponenteImportiCapitolo annoPrecedente = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo residui = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo anno0 = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo anno1 = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo anno2 = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo annoSuccessivo = new DettaglioComponenteImportiCapitolo();
			
			//setTipoDettaglioComponente
			competenzaStanziamento.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			residui.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			anno0.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			anno1.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			anno2.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			annoSuccessivo.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			
			//setImporto
			annoPrecedente.setImporto(importiCapitolo.get(0).getStanziamento());
			residui.setImporto(residuo!= null ? residuo.getStanziamento() : BigDecimal.ZERO);
			anno0.setImporto(importiCapitolo.get(1).getStanziamento());
			anno1.setImporto(importiCapitolo.get(2).getStanziamento());
			anno2.setImporto(importiCapitolo.get(3).getStanziamento());
			annoSuccessivo.setImporto(annoSuccessivoImporto!= null ? annoSuccessivoImporto.getStanziamento() : BigDecimal.ZERO);
			
			//setEditable
			residui.setEditabile(false);
			anno0.setEditabile(false);
			anno1.setEditabile(false);
			anno2.setEditabile(false);
			annoSuccessivo.setEditabile(false);
			
			//setDettaglio
			competenzaStanziamento.setDettaglioAnnoPrec(annoPrecedente);
			competenzaStanziamento.setDettaglioResidui(residui);
			competenzaStanziamento.setDettaglioAnno0(anno0);
			competenzaStanziamento.setDettaglioAnno1(anno1);
			competenzaStanziamento.setDettaglioAnno2(anno2);
			competenzaStanziamento.setDettaglioAnniSucc(annoSuccessivo);

			competenzaComponenti.add(competenzaStanziamento);
			
			//SIAC-7220
			//Inverito l'ordine di presentazione della riga dell'Impegnato e Disponibibilita impegnare
			//
			//FROM:
			//	Stanziamento
			//	Disponibilita Impegnare
			//	Impegnato
			//
			//TO:
			//	Stanziamento
			//	Impegnato
			//	Disponibilita Impegnare
			
			//========================================================================================================================//
			
			/**
			 *	IMPEGNATO
			 */
			//Dichiarazione
			ImportiCapitoloPerComponente competenzaImpegnato = new ImportiCapitoloPerComponente();
			DettaglioComponenteImportiCapitolo annoPrecedenteD = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo anno0D = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo anno1D = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo anno2D = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo residuiD = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo annoSuccessivoD = new DettaglioComponenteImportiCapitolo();
			
			//setTipoDettaglioComponente
			competenzaImpegnato.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			annoSuccessivoD.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			anno0D.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			anno1D.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			anno2D.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			residuiD.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);

			//setImporto
			annoPrecedenteD.setImporto(((ImportiCapitoloUG)importiCapitolo.get(1)).getDiCuiImpegnatoUGAnnoPrec());
			
			//- SIAC-7349 GS 15/07/2020 riga Competenza.Impegnato - Colonna residuo<N>.Finale deve mostrare lo stesso valore della riga Residuo.EFfettivi - colonna Residuo<N>.Finale
			// residuiD.setImporto(residuo!= null ? residuo.getStanziamento() : BigDecimal.ZERO);
			residuiD.setImporto(calcoloImportoResidui(importiCapitolo, true));
			
			
//			anno0D.setImporto(((ImportiCapitoloUG)importiCapitolo.get(1)).getDiCuiImpegnatoAnno1UG()); 
//			anno1D.setImporto(((ImportiCapitoloUG)importiCapitolo.get(1)).getDiCuiImpegnatoAnno2UG());
//			anno2D.setImporto(((ImportiCapitoloUG)importiCapitolo.get(1)).getDiCuiImpegnatoAnno3UG());
			//SIAC-7349 MR SR50Riciclo 21/05/2020 utilizzo nuovo campo che calcola l'effettivo e non il definitivo
			anno0D.setImporto(((ImportiCapitoloUG)importiCapitolo.get(1)).getImpegnatoEffettivoUGAnno1()); 
			anno1D.setImporto(((ImportiCapitoloUG)importiCapitolo.get(1)).getImpegnatoEffettivoUGAnno2());
			anno2D.setImporto(((ImportiCapitoloUG)importiCapitolo.get(1)).getImpegnatoEffettivoUGAnno3());
			//SIAC-7349 - Start - MR - SR210 - 12/05/2020 importo impegnato come sommatoria degli impegnati delle componenti
			/*BigDecimal importoImpegnatoAnniSucc = BigDecimal.ZERO;
			if(annoSuccessivoImporto.getListaComponenteImportiCapitolo() != null && !annoSuccessivoImporto.getListaComponenteImportiCapitolo().isEmpty()){
				for(ComponenteImportiCapitolo cip : annoSuccessivoImporto.getListaComponenteImportiCapitolo()){
					importoImpegnatoAnniSucc = importoImpegnatoAnniSucc.add(cip.getListaDettaglioComponenteImportiCapitolo().get(1).getImporto());
				}
			}
			annoSuccessivoD.setImporto(importoImpegnatoAnniSucc);*/
			
			annoSuccessivoD.setImporto(((ImportiCapitoloUG)importiCapitolo.get(1)).getDiCuiImpegnatoUGAnniSucc());
			competenzaImpegnato.setDettaglioAnniSucc(annoSuccessivoD);
			//competenzaComponenti.add(competenzaImpegnato);
			
			//setEditable
			residuiD.setEditabile(true);
			anno0D.setEditabile(false);
			anno1D.setEditabile(true);
			anno2D.setEditabile(true);
			annoSuccessivoD.setEditabile(false);

			//setDettaglio
			competenzaImpegnato.setDettaglioAnnoPrec(annoPrecedenteD);
			competenzaImpegnato.setDettaglioAnno0(anno0D);
			competenzaImpegnato.setDettaglioAnno1(anno1D);
			competenzaImpegnato.setDettaglioAnno2(anno2D);
			competenzaImpegnato.setDettaglioResidui(residuiD);
			competenzaImpegnato.setDettaglioAnniSucc(annoSuccessivoD);
			
			competenzaComponenti.add(competenzaImpegnato);
			
			//========================================================================================================================//
			
			/**
			 *	DISPONIBILITA AD IMPEGNARE
			 */
			//Dichiarazione
			ImportiCapitoloPerComponente disponibilita = new ImportiCapitoloPerComponente();
			DettaglioComponenteImportiCapitolo annoPrecedenteI = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo anno0I = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo anno1I = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo anno2I = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo residuiI = new DettaglioComponenteImportiCapitolo();
			DettaglioComponenteImportiCapitolo annoSuccessivoI = new DettaglioComponenteImportiCapitolo();
			
			//setTipoDettaglioComponente
			disponibilita.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.DISPONIBILITAIMPEGNARE);
			residuiI.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.DISPONIBILITAIMPEGNARE);
			anno0I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.DISPONIBILITAIMPEGNARE);
			anno1I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.DISPONIBILITAIMPEGNARE);
			anno2I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.DISPONIBILITAIMPEGNARE);
			annoSuccessivoI.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.DISPONIBILITAIMPEGNARE);
			
			//setImporto
			annoPrecedenteI.setImporto(BigDecimal.ZERO);
			residuiI.setImporto(residuo!= null ? residuo.getStanziamento() : BigDecimal.ZERO);
			anno0I.setImporto(((ImportiCapitoloUG)importiCapitolo.get(1)).getDisponibilitaImpegnareAnno1());
			anno1I.setImporto(((ImportiCapitoloUG)importiCapitolo.get(1)).getDisponibilitaImpegnareAnno2());
			anno2I.setImporto(((ImportiCapitoloUG)importiCapitolo.get(1)).getDisponibilitaImpegnareAnno3());
			annoSuccessivoI.setImporto(annoSuccessivoImporto!= null ? annoSuccessivoImporto.getStanziamento() : BigDecimal.ZERO);
			
			//setEditable
			anno0I.setEditabile(false);
			residuiI.setEditabile(true);
			anno1I.setEditabile(true);
			anno2I.setEditabile(true);
			annoSuccessivoI.setEditabile(false);

			//setDettaglio
			disponibilita.setDettaglioAnnoPrec(annoPrecedenteI);
			disponibilita.setDettaglioResidui(residuiI);
			disponibilita.setDettaglioAnno0(anno0I);
			disponibilita.setDettaglioAnno1(anno1I);
			disponibilita.setDettaglioAnno2(anno2I);
			disponibilita.setDettaglioAnniSucc(annoSuccessivoI);
			
			competenzaComponenti.add(disponibilita);
			
		}
	}
	
	
	
	public static void buildResiduiRow(List<ImportiCapitolo> importiCapitolo, ImportiCapitolo residuo, ImportiCapitolo annoSuccessivoImporto,  List<ImportiCapitoloPerComponente> residuiComponenti){
		if(importiCapitolo!= null && !importiCapitolo.isEmpty() && importiCapitolo.size()>=3 ){
			//PRESUNTO
			ImportiCapitoloPerComponente residuoPresunto = new ImportiCapitoloPerComponente();
			residuoPresunto.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.PRESUNTO);
			DettaglioComponenteImportiCapitolo annoPrecedente = new DettaglioComponenteImportiCapitolo();
			annoPrecedente.setImporto(BigDecimal.ZERO);
			residuoPresunto.setDettaglioAnnoPrec(annoPrecedente);
			
			DettaglioComponenteImportiCapitolo anno0 = new DettaglioComponenteImportiCapitolo();
			anno0.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.PRESUNTO);
			anno0.setEditabile(true);
			anno0.setImporto(BigDecimal.ZERO);
			residuoPresunto.setDettaglioAnno0(anno0);
			
			DettaglioComponenteImportiCapitolo anno1 = new DettaglioComponenteImportiCapitolo();
			anno1.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.PRESUNTO);
			anno1.setEditabile(false);
			anno1.setImporto(BigDecimal.ZERO);
			residuoPresunto.setDettaglioAnno1(anno1);
			
			DettaglioComponenteImportiCapitolo anno2 = new DettaglioComponenteImportiCapitolo();
			anno2.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.PRESUNTO);
			anno2.setEditabile(false);
			anno2.setImporto(BigDecimal.ZERO);
			residuoPresunto.setDettaglioAnno2(anno2);
			
			DettaglioComponenteImportiCapitolo residui = new DettaglioComponenteImportiCapitolo();
			residui.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.PRESUNTO);
			residui.setEditabile(false);
			residui.setImporto(importiCapitolo.get(1).getStanziamentoResiduo());
			residuoPresunto.setDettaglioResidui(residui);
			
			DettaglioComponenteImportiCapitolo annoSuccessivo = new DettaglioComponenteImportiCapitolo();
			annoSuccessivo.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.PRESUNTO);
			annoSuccessivo.setEditabile(false);
			annoSuccessivo.setImporto(annoSuccessivoImporto != null ? annoSuccessivoImporto.getStanziamentoResiduo() : BigDecimal.ZERO);
			residuoPresunto.setDettaglioAnniSucc(annoSuccessivo);
			residuiComponenti.add(residuoPresunto);
			
			//EFFETTIVO
			ImportiCapitoloPerComponente residuoEffettivo = new ImportiCapitoloPerComponente();
			residuoEffettivo.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.EFFETTIVO);
			DettaglioComponenteImportiCapitolo annoPrecedenteI = new DettaglioComponenteImportiCapitolo();
			annoPrecedenteI.setImporto(importiCapitolo.get(0).getStanziamentoResiduo());
			residuoEffettivo.setDettaglioAnnoPrec(annoPrecedenteI);
			DettaglioComponenteImportiCapitolo anno0I = new DettaglioComponenteImportiCapitolo();
			anno0I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.EFFETTIVO);
			anno0I.setEditabile(false);			
			anno0I.setImporto(BigDecimal.ZERO);
			residuoEffettivo.setDettaglioAnno0(anno0I);
			
			//SIAC-7349 - Start - SR200 - MR - 15/04/2020 Dettaglio per residuo iniziale
			DettaglioComponenteImportiCapitolo residuoIniziale = new DettaglioComponenteImportiCapitolo();
			residuoIniziale.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.EFFETTIVO);
			residuoIniziale.setEditabile(false);			
			residuoIniziale.setImporto(calcoloImportoResidui(importiCapitolo, false));
			residuoEffettivo.setDettaglioResiduiIniziale(residuoIniziale);
			//SIAC-7349 - END
			
			DettaglioComponenteImportiCapitolo anno1I = new DettaglioComponenteImportiCapitolo();
			anno1I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.EFFETTIVO);
			anno1I.setEditabile(false);
			anno1I.setImporto(BigDecimal.ZERO);
			residuoEffettivo.setDettaglioAnno1(anno1I);
			
			DettaglioComponenteImportiCapitolo anno2I = new DettaglioComponenteImportiCapitolo();
			anno2I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.EFFETTIVO);
			anno2I.setEditabile(false);
			anno2I.setImporto(BigDecimal.ZERO);
			residuoEffettivo.setDettaglioAnno2(anno2I);
			
			DettaglioComponenteImportiCapitolo residuiI = new DettaglioComponenteImportiCapitolo();
			residuiI.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.EFFETTIVO);
			residuiI.setEditabile(false);
			residuiI.setImporto(calcoloImportoResidui(importiCapitolo, true));
			residuoEffettivo.setDettaglioResidui(residuiI);
			
			DettaglioComponenteImportiCapitolo annoSuccessivoI = new DettaglioComponenteImportiCapitolo();
			annoSuccessivoI.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.EFFETTIVO);
			annoSuccessivoI.setEditabile(false);
			annoSuccessivoI.setImporto(BigDecimal.ZERO );
			residuoEffettivo.setDettaglioAnniSucc(annoSuccessivoI);
			residuiComponenti.add(residuoEffettivo);
			
		}
	}
	
	//SIAC-7349 - Start - SR200 - MR - 15/04/2020 - Calcolo dei residui delle componenti del capitolo
	private static BigDecimal calcoloImportoResidui(List<ImportiCapitolo> importiCapitolo, boolean isResiduiFinali) {
		BigDecimal importoResiduiCalcolato = BigDecimal.ZERO;
		//SIAC-8038 controllo formale su lista passata
		if(!CollectionUtils.isEmpty(importiCapitolo)) {
			//SIAC-8038 si rimuove il loop poiche' genera doppioni
//			for(int i=0; i<=1; i++){
				ImportiCapitolo importoCapitolo = importiCapitolo.get(0);
				if(isResiduiFinali){
					for(ComponenteImportiCapitolo cic : importoCapitolo.getListaComponenteImportiCapitolo()){
						BigDecimal residuoFinale = cic.getImpegnatoResiduoFinale() != null ? cic.getImpegnatoResiduoFinale() : BigDecimal.ZERO;
						importoResiduiCalcolato = importoResiduiCalcolato.add(residuoFinale);
					}
					//return importoResiduiCalcolato;
					
				}else{
					for(ComponenteImportiCapitolo cic : importoCapitolo.getListaComponenteImportiCapitolo()){
						BigDecimal residuoIniziale = cic.getImpegnatoResiduoIniziale() != null ? cic.getImpegnatoResiduoIniziale() : BigDecimal.ZERO;
						importoResiduiCalcolato = importoResiduiCalcolato.add(residuoIniziale);
					}
					//return importoResiduiCalcolato;
					
				}
				
//			}
		}
		return importoResiduiCalcolato;
	}


	public static void buildCassaRow(List<ImportiCapitolo> importiCapitolo, ImportiCapitolo residuo, ImportiCapitolo annoSuccessivoImporto,  List<ImportiCapitoloPerComponente> cassaComponenti){
		//STANZIAMNETO
		if(importiCapitolo!= null && !importiCapitolo.isEmpty() && importiCapitolo.size()>=3 ){
			ImportiCapitoloPerComponente cassaStanziamento = new ImportiCapitoloPerComponente();
			cassaStanziamento.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			DettaglioComponenteImportiCapitolo annoPrecedente = new DettaglioComponenteImportiCapitolo();
			annoPrecedente.setImporto(importiCapitolo.get(0).getStanziamentoCassa());
			cassaStanziamento.setDettaglioAnnoPrec(annoPrecedente);
			
			DettaglioComponenteImportiCapitolo anno0 = new DettaglioComponenteImportiCapitolo();
			anno0.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			anno0.setEditabile(true);
			anno0.setImporto(importiCapitolo.get(1).getStanziamentoCassa());
			cassaStanziamento.setDettaglioAnno0(anno0);
			
			DettaglioComponenteImportiCapitolo anno1 = new DettaglioComponenteImportiCapitolo();
			anno1.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			anno1.setEditabile(false);
			anno1.setImporto(BigDecimal.ZERO);
			cassaStanziamento.setDettaglioAnno1(anno1);
			
			DettaglioComponenteImportiCapitolo anno2 = new DettaglioComponenteImportiCapitolo();
			anno2.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			anno2.setEditabile(false);
			anno2.setImporto(BigDecimal.ZERO);
			cassaStanziamento.setDettaglioAnno2(anno2);
			
			DettaglioComponenteImportiCapitolo residui = new DettaglioComponenteImportiCapitolo();
			residui.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			residui.setEditabile(false);
			residui.setImporto(BigDecimal.ZERO);
			cassaStanziamento.setDettaglioResidui(residui);
			
			DettaglioComponenteImportiCapitolo annoSuccessivo = new DettaglioComponenteImportiCapitolo();
			annoSuccessivo.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			annoSuccessivo.setEditabile(false);
			annoSuccessivo.setImporto(BigDecimal.ZERO);
			cassaStanziamento.setDettaglioAnniSucc(annoSuccessivo);
			cassaComponenti.add(cassaStanziamento);
			
			//PAGATO
			ImportiCapitoloPerComponente cassaPagato = new ImportiCapitoloPerComponente();
			cassaPagato.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.PAGATO);
			DettaglioComponenteImportiCapitolo annoPrecedenteI = new DettaglioComponenteImportiCapitolo();
			annoPrecedenteI.setImporto(((ImportiCapitoloUG)importiCapitolo.get(0)).getTotalePagato());
			cassaPagato.setDettaglioAnnoPrec(annoPrecedenteI);
			
			DettaglioComponenteImportiCapitolo anno0I = new DettaglioComponenteImportiCapitolo();
			anno0I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			anno0I.setEditabile(false);
			anno0I.setImporto(BigDecimal.ZERO);
			cassaPagato.setDettaglioAnno0(anno0I);
			
			DettaglioComponenteImportiCapitolo anno1I = new DettaglioComponenteImportiCapitolo();
			anno1I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			anno1I.setEditabile(false);
			anno1I.setImporto(BigDecimal.ZERO);
			cassaPagato.setDettaglioAnno1(anno1I);
			
			DettaglioComponenteImportiCapitolo anno2I = new DettaglioComponenteImportiCapitolo();
			anno2I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			anno2I.setEditabile(false);
			anno2I.setImporto(BigDecimal.ZERO);
			cassaPagato.setDettaglioAnno2(anno2I);
			
			DettaglioComponenteImportiCapitolo residuiI = new DettaglioComponenteImportiCapitolo();
			residuiI.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			residuiI.setEditabile(false);
			residuiI.setImporto(BigDecimal.ZERO);
			cassaPagato.setDettaglioResidui(residuiI);
			
			DettaglioComponenteImportiCapitolo annoSuccessivoI = new DettaglioComponenteImportiCapitolo();
			annoSuccessivoI.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			annoSuccessivoI.setEditabile(false);
			annoSuccessivoI.setImporto(BigDecimal.ZERO);
			cassaPagato.setDettaglioAnniSucc(annoSuccessivoI);
			cassaComponenti.add(cassaPagato);
		}
		
		
	}
	
	//SIAC-7349- Inizio - SR90 - MR - 03/2020  - Duplico metodo per mappare singola componente
	/**
	 * Costruzione componenti per singolo anno  
	 * @param importiCapitoloList, annualita
	 * @return
	 */
	public static List<ImportiCapitoloPerComponente> toComponenteSingoloImportiCapitoloPerAnno(
			List<ImportiCapitolo> importiCapitoloList, int annualita ) {
		//Se l'annualità < ANNO-1 o <ANNO+2 es 2020 -> 2023 (al momento non c'è il calcolo
		List<ImportiCapitoloPerComponente> importiComponentiCapitolo = new ArrayList<ImportiCapitoloPerComponente>();
		if(annualita<-1 || annualita>2){
			ImportiCapitoloPerComponente emptyCip = new ImportiCapitoloPerComponente();
			emptyCip.setUidComponente(0);
			importiComponentiCapitolo.add(emptyCip);
			return importiComponentiCapitolo;
		}
		int anno = annualita +1;
		
		if (!importiCapitoloList.isEmpty()) {
			if (importiCapitoloList.get(anno).getListaComponenteImportiCapitolo() != null
					&& !importiCapitoloList.get(anno).getListaComponenteImportiCapitolo().isEmpty()) {
				// numero componenti
				int numComponenti = importiCapitoloList.get(anno).getListaComponenteImportiCapitolo().size();
				for (int i = 0; i < numComponenti; i++) {
					int idComponente = 0;

					if (importiCapitoloList.get(anno).getListaComponenteImportiCapitolo().get(i)
							.getListaDettaglioComponenteImportiCapitolo() != null
							&& !importiCapitoloList.get(anno).getListaComponenteImportiCapitolo().get(i)
									.getListaDettaglioComponenteImportiCapitolo().isEmpty()) {
						idComponente = importiCapitoloList.get(anno).getListaComponenteImportiCapitolo().get(i).getUid();
						int numDettagli = importiCapitoloList.get(anno).getListaComponenteImportiCapitolo().get(i)
								.getListaDettaglioComponenteImportiCapitolo().size();
						for (int k = 0; k < numDettagli; k++) {
							// FACCIAMO LA SINGOLA RIGA 
							DettaglioComponenteImportiCapitolo dettaglio = importiCapitoloList.get(anno).getListaComponenteImportiCapitolo().get(i).getListaDettaglioComponenteImportiCapitolo().get(k);
							
							ImportiCapitoloPerComponente icpc = new ImportiCapitoloPerComponente();
							icpc.setTipoComponenteImportiCapitolo(importiCapitoloList.get(anno)
									.getListaComponenteImportiCapitolo().get(i).getTipoComponenteImportiCapitolo());
							icpc.setTipoDettaglioComponenteImportiCapitolo(
									dettaglio.getTipoDettaglioComponenteImportiCapitolo());
							// IMPORTI....mettere controlli su anno ...mapppare
							
							//SIAC-7227 si setta a null l'anno precedente per evitare incongruenze di componenti
							// ANNO PRECEDENTE
							icpc.setDettaglioAnnoPrec(buildDettaglioComponente(importiCapitoloList, i, k, 0));
							//
							
							// RESIDUO
							icpc.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());
							// ANNO 0
							icpc.setDettaglioAnno0(buildDettaglioComponente(importiCapitoloList, i, k, 1));
							// ANNO 1
							icpc.setDettaglioAnno1(buildDettaglioComponente(importiCapitoloList, i, k, 2));
							// ANNO 2
							icpc.setDettaglioAnno2(buildDettaglioComponente(importiCapitoloList, i, k, 3));
							// SUCCESSIVO
							icpc.setDettaglioAnniSucc(new DettaglioComponenteImportiCapitolo());
							
							//SIAC-7349
							icpc.setUidComponente(idComponente);
							
							importiComponentiCapitolo.add(icpc);
						}

					}
				}

			}

		}

		return importiComponentiCapitolo;

	}
	//SIAC-7349
	//SIAC-7349 - Start - MR - SR200 - 15/04/2020 - overload del metodo per mappare gli anni successivi.
	/**
	 * Costruzione componenti per anno 
	 * @param importiCapitoloList
	 * @return
	 */
	public static List<ImportiCapitoloPerComponente> toComponentiImportiCapitoloPerAnno(
			List<ImportiCapitolo> importiCapitoloList, ImportiCapitolo anniSuccessivi) {

		List<ImportiCapitoloPerComponente> importiComponentiCapitolo = new ArrayList<ImportiCapitoloPerComponente>();
		int j=0;
		if (!importiCapitoloList.isEmpty()) {
			if (importiCapitoloList.get(1).getListaComponenteImportiCapitolo() != null
					&& !importiCapitoloList.get(1).getListaComponenteImportiCapitolo().isEmpty()) {
				// numero componenti
				int numComponenti = importiCapitoloList.get(1).getListaComponenteImportiCapitolo().size();
				for (int i = 0; i < numComponenti; i++) {
					int idComponente = 0;
					//SIAC-7349 - Start - MR - SR200 - 15/04/2020 - componente da mappare
					ComponenteImportiCapitolo componenteImportiCapitolo = importiCapitoloList.get(1).getListaComponenteImportiCapitolo().get(i);
					//SIAC-7349 - End

					if (importiCapitoloList.get(1).getListaComponenteImportiCapitolo().get(i)
							.getListaDettaglioComponenteImportiCapitolo() != null
							&& !importiCapitoloList.get(1).getListaComponenteImportiCapitolo().get(i)
									.getListaDettaglioComponenteImportiCapitolo().isEmpty()) {
						idComponente = importiCapitoloList.get(1).getListaComponenteImportiCapitolo().get(i).getTipoComponenteImportiCapitolo().getUid();
						int numDettagli = importiCapitoloList.get(1).getListaComponenteImportiCapitolo().get(i)
								.getListaDettaglioComponenteImportiCapitolo().size();
						
						for (int k = 0; k < numDettagli; k++) {
							// FACCIAMO LA SINGOLA RIGA 
							DettaglioComponenteImportiCapitolo dettaglio = importiCapitoloList.get(1).getListaComponenteImportiCapitolo().get(i).getListaDettaglioComponenteImportiCapitolo().get(k);
							
							ImportiCapitoloPerComponente icpc = new ImportiCapitoloPerComponente();
							icpc.setTipoComponenteImportiCapitolo(importiCapitoloList.get(1)
									.getListaComponenteImportiCapitolo().get(i).getTipoComponenteImportiCapitolo());
							icpc.setTipoDettaglioComponenteImportiCapitolo(
									dettaglio.getTipoDettaglioComponenteImportiCapitolo());
							// IMPORTI....mettere controlli su anno ...mapppare
							
							//SIAC-7227 si setta a null l'anno precedente per evitare incongruenze di componenti
							// ANNO PRECEDENTE
							icpc.setDettaglioAnnoPrec(buildDettaglioComponente(importiCapitoloList, i, k, 0));
							//
							
							// RESIDUO				
							//SIAC-7349 - SR200 - Start - MR - 15/04/2020 - residui iniziali e finali delle singole componenti
							List<ComponenteImportiCapitolo> listaAnniSuccessivi = anniSuccessivi.getListaComponenteImportiCapitolo();
							if(k % 2 == 0){ // devo prendere in considerazione la riga dell' IMPEGNATO che si trova all'indice 1
								icpc.setDettaglioResiduiIniziale(new DettaglioComponenteImportiCapitolo());
								icpc.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());
								icpc.setDettaglioAnniSucc(new DettaglioComponenteImportiCapitolo());
							}else{
								BigDecimal importoResiduoIniziale = componenteImportiCapitolo.getImpegnatoResiduoIniziale() != null ? componenteImportiCapitolo.getImpegnatoResiduoIniziale() : BigDecimal.ZERO;
								DettaglioComponenteImportiCapitolo resIniziale = new DettaglioComponenteImportiCapitolo();
								resIniziale.setImporto(importoResiduoIniziale);
								icpc.setDettaglioResiduiIniziale(resIniziale);
								BigDecimal importoResiduoFinale = componenteImportiCapitolo.getImpegnatoResiduoFinale() != null ? componenteImportiCapitolo.getImpegnatoResiduoFinale() : BigDecimal.ZERO;
								DettaglioComponenteImportiCapitolo resFinale = new DettaglioComponenteImportiCapitolo();
								resFinale.setImporto(importoResiduoFinale);
								BigDecimal importoImpegnatoAnniPrec = componenteImportiCapitolo.getImpegnatoAnniPrecedenti() != null ? componenteImportiCapitolo.getImpegnatoAnniPrecedenti() : BigDecimal.ZERO;
								DettaglioComponenteImportiCapitolo anniPrec = new DettaglioComponenteImportiCapitolo();
								anniPrec.setImporto(importoImpegnatoAnniPrec);
								icpc.setDettaglioAnnoPrec(anniPrec);
								icpc.setDettaglioResidui(resFinale);
								// SUCCESSIVO
								icpc.setDettaglioAnniSucc(buildDettaglioAnniSuccessivi(importiCapitoloList, listaAnniSuccessivi, idComponente));
								
							}
							//SIAC-7349 - End
							
							// ANNO 0
							icpc.setDettaglioAnno0(buildDettaglioComponente(importiCapitoloList, i, k, 1));
							// ANNO 1
							icpc.setDettaglioAnno1(buildDettaglioComponente(importiCapitoloList, i, k, 2));
							// ANNO 2
							icpc.setDettaglioAnno2(buildDettaglioComponente(importiCapitoloList, i, k, 3));
							
							//SIAC-7349
							icpc.setUidComponente(idComponente);
							
							importiComponentiCapitolo.add(icpc);
						}

					}
				}

			}

		}

		return importiComponentiCapitolo;

	}
	
	


	//SIAC-7349 - End
	//SIAC-7349 - Start - MR - SR200 - 15/04/2020 - Costruzione dell'importo impegnato anni successivi
	private static DettaglioComponenteImportiCapitolo buildDettaglioAnniSuccessivi(
			List<ImportiCapitolo> importiCapitoloList, List<ComponenteImportiCapitolo> listaAnniSuccessivi, int idComponente) {
		DettaglioComponenteImportiCapitolo detToReturn = new DettaglioComponenteImportiCapitolo();
		ImportiCapitolo importoCorrente = importiCapitoloList.get(1);
		List<ComponenteImportiCapitolo> listaComponenti = importoCorrente.getListaComponenteImportiCapitolo();
		for(int i=0; i< listaComponenti.size(); i++){
			for(int j=0; j<listaAnniSuccessivi.size(); j++){
				if(listaComponenti.get(i).getTipoComponenteImportiCapitolo().getUid()==idComponente 
						&& listaAnniSuccessivi.get(j).getTipoComponenteImportiCapitolo().getUid()==idComponente && 
						listaComponenti.get(i).getTipoComponenteImportiCapitolo().getUid() == listaAnniSuccessivi.get(j).getTipoComponenteImportiCapitolo().getUid()
						){
					
					detToReturn.setImporto(listaAnniSuccessivi.get(j).getListaDettaglioComponenteImportiCapitolo().get(1).getImporto());
				}	
			}	
		}

		return detToReturn;
	}
	//SIAC-7349 - End
	//SIAC-7349 - Start - MR - SR200 - 17/04/2020 - Costruzione dell'impegnato su componenti impegnato in anni precedente
	/**
	 * Costruzione della componente per anno precedente con confronto delle componenti.
	 *
	 * @param importiComponentiCapitolo the importi componenti capitolo
	 * @param importiCapitolo the importi capitolo
	 * @return the list
	 */
	public static List<ImportiCapitoloPerComponente> toComponentiImportiCapitoloPerAnnoPrecedenteNew(List<ImportiCapitoloPerComponente> importiComponentiCapitolo, ImportiCapitolo importiCapitolo) {
		
		List<ImportiCapitoloPerComponente> listaTemporaneaTransfer = new ArrayList<ImportiCapitoloPerComponente>();
		
		
		//popolo la mia lista con i vari importi dalle componenti dell'anno precedente
		popolaDatiAnnoPrecedente(importiCapitolo, listaTemporaneaTransfer, true);
		
		//eseguo il match delle componenti con la lista tornatami dal servizio con anche i default
		int numeroDettagli = listaTemporaneaTransfer.size();
		for (int j = 0; j < numeroDettagli; j++) {
			
			int indexToMatch = 0;
			ImportiCapitoloPerComponente daPassare = listaTemporaneaTransfer.get(j);
			Integer int2 = (Integer) daPassare.getTipoComponenteImportiCapitolo().getUid();
			
			//creo una lista temporanea di Uid
			List<Integer> listUid = new ArrayList<Integer>();
			    
			//controllo che la componente da passare abbia corrispondenze nella lista
			for (int k = 0; k < importiComponentiCapitolo.size(); k++) {
				ImportiCapitoloPerComponente importiCapitoloPerComponente = importiComponentiCapitolo.get(k);
				if(importiCapitoloPerComponente == null) {
					continue;
				}
				//confronto gli uid per assicurarmi di non passare lo stesso valore a elementi provenienti dallo stesso tipo
				Integer int1 = (Integer)importiCapitoloPerComponente.getTipoComponenteImportiCapitolo().getUid();

				listUid.add(int1);
				
				String codiceMacroTipo = estraiCodiceMacroTipo(importiCapitoloPerComponente.getTipoComponenteImportiCapitolo());
				
				String codiceMacroTipoRef = estraiCodiceMacroTipo((daPassare.getTipoComponenteImportiCapitolo()));
				
				//controllo anche il macrotipo per sincerarmi che la componente sia davvero quella
				if(codiceMacroTipo.equals(codiceMacroTipoRef) && importiCapitoloPerComponente.getTipoDettaglioComponenteImportiCapitolo().equals(daPassare.getTipoDettaglioComponenteImportiCapitolo())
						&&  int1.compareTo(int2) == 0) {
					//assegno il nuovo valore 
					importiCapitoloPerComponente.setDettaglioAnnoPrec(daPassare.getDettaglioAnnoPrec());
					indexToMatch = k;
				}
				
			}
			
			//se non si trova nessuna corrispondenza nella lista degli importi  || creo io la nuova componente, poiche' presente solo per l'anno precedente
			if(!listUid.contains(int2) || TipoDettaglioComponenteImportiCapitolo.IMPEGNATO.equals(daPassare.getTipoDettaglioComponenteImportiCapitolo())) {
				
				//aggiungo le colonne mancanti alla componente per la tabella
				// RESIDUO
				//daPassare.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());
				// ANNO 0
				daPassare.setDettaglioAnno0(new DettaglioComponenteImportiCapitolo());
				// ANNO 1
				daPassare.setDettaglioAnno1(new DettaglioComponenteImportiCapitolo());
				// ANNO 2
				daPassare.setDettaglioAnno2(new DettaglioComponenteImportiCapitolo());
				// SUCCESSIVI
				daPassare.setDettaglioAnniSucc(new DettaglioComponenteImportiCapitolo());
				//
				
				//se l'index e' a 0 vuol dire che non c'erano corrispondenze tra le componenti ritornate dal servizio
				if(!importiComponentiCapitolo.contains(daPassare) && indexToMatch == 0) {
					//aggiungo la nuova componente
					importiComponentiCapitolo.add(daPassare);					
				}
			}
			
		}
		
		Comparator<ImportiCapitoloPerComponente> comparator = new Comparator<ImportiCapitoloPerComponente>() {

			@Override
			public int compare(ImportiCapitoloPerComponente o1, ImportiCapitoloPerComponente o2) {
				Integer o1Int = o1.isPropostaDefault() ? 1 : 0;
				Integer o2Int = o2.isPropostaDefault() ? 1 : 0;
				return o1Int.compareTo(o2Int);
			}
			
		};
		
		Collections.sort(importiComponentiCapitolo, comparator);
		
		
		return importiComponentiCapitolo;
	}

	
	//SIAC-7349 - Start - SR200 - MR - 07/05/2020 - Metodo per mappare le componenti degli anni successivi
	public static List<ImportiCapitoloPerComponente> toComponentiImportiCapitoloPerAnniSuccNoStanz(
			List<ImportiCapitoloPerComponente> importiComponentiCapitolo,
			List<ImportiImpegnatoPerComponenteAnniSuccNoStanz> listaImportiCapitoloAnniSuccessiviNoStanz) {
		
		for(ImportiImpegnatoPerComponenteAnniSuccNoStanz iipcasns : listaImportiCapitoloAnniSuccessiviNoStanz){
			ImportiCapitoloPerComponente stanziamento = new ImportiCapitoloPerComponente();
			ImportiCapitoloPerComponente impegnato = new ImportiCapitoloPerComponente();
			//Costruisco riga stanziamento
			stanziamento.setDettaglioAnnoPrec(new DettaglioComponenteImportiCapitolo());
			stanziamento.setDettaglioAnno0(new DettaglioComponenteImportiCapitolo());
			stanziamento.setDettaglioAnno1(new DettaglioComponenteImportiCapitolo());
			stanziamento.setDettaglioAnno2(new DettaglioComponenteImportiCapitolo());
			stanziamento.setDettaglioAnniSucc(new DettaglioComponenteImportiCapitolo());
			stanziamento.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());
			stanziamento.setDettaglioResiduiIniziale(new DettaglioComponenteImportiCapitolo());
			stanziamento.setPropostaDefault(false);
			TipoComponenteImportiCapitolo tds = new TipoComponenteImportiCapitolo();
			tds.setMacrotipoComponenteImportiCapitolo(MacrotipoComponenteImportiCapitolo.getByDesc(iipcasns.getDescrizioneMacrotipoComponente().toUpperCase()));
			tds.setDescrizione(iipcasns.getDescrizioneComponente());
			tds.setUid(iipcasns.getIdComp());
			stanziamento.setTipoComponenteImportiCapitolo(tds);
			stanziamento.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
			importiComponentiCapitolo.add(stanziamento);
			//Costruisco Impegnato
			impegnato.setDettaglioAnnoPrec(new DettaglioComponenteImportiCapitolo());
			impegnato.setDettaglioAnno0(new DettaglioComponenteImportiCapitolo());
			impegnato.setDettaglioAnno1(new DettaglioComponenteImportiCapitolo());
			impegnato.setDettaglioAnno2(new DettaglioComponenteImportiCapitolo());
			DettaglioComponenteImportiCapitolo det = new DettaglioComponenteImportiCapitolo();
			det.setImporto(iipcasns.getImporto());
			impegnato.setDettaglioAnniSucc(det);
			impegnato.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());
			impegnato.setDettaglioResiduiIniziale(new DettaglioComponenteImportiCapitolo());
			impegnato.setPropostaDefault(false);
			TipoComponenteImportiCapitolo tdsi = new TipoComponenteImportiCapitolo();
			tdsi.setMacrotipoComponenteImportiCapitolo(MacrotipoComponenteImportiCapitolo.getByDesc(iipcasns.getDescrizioneMacrotipoComponente().toUpperCase()));
			tdsi.setDescrizione(iipcasns.getDescrizioneComponente());
			tdsi.setUid(iipcasns.getIdComp());
			impegnato.setTipoComponenteImportiCapitolo(tdsi);
			impegnato.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			importiComponentiCapitolo.add(impegnato);
		}
		return importiComponentiCapitolo;
	}
	

	//SIAC-7349 - Start - GS - 20/07/2020 - Metodo per mappare le componenti senza stanziamento nel triennio
	
	public static List<ImportiCapitoloPerComponente> toComponentiImportiCapitoloPerTriennioNoStanz(
			List<ImportiCapitoloPerComponente> importiComponentiCapitolo,
			List<ImportiImpegnatoPerComponenteTriennioNoStanz> listaImportiCapitoloTriennioNoStanz,
			Integer annoBilancio)
		{
		Integer lastIdCompProcessed = 0;	
		
		for(ImportiImpegnatoPerComponenteTriennioNoStanz iipcasns : listaImportiCapitoloTriennioNoStanz){
			
			if (iipcasns.getIdComp() != lastIdCompProcessed)
            {	
				ImportiCapitoloPerComponente stanziamento = new ImportiCapitoloPerComponente();
				ImportiCapitoloPerComponente impegnato = new ImportiCapitoloPerComponente();
				//Costruisco riga stanziamento
				stanziamento.setDettaglioAnnoPrec(new DettaglioComponenteImportiCapitolo());
	
				DettaglioComponenteImportiCapitolo dets = new DettaglioComponenteImportiCapitolo();
				dets.setEditabile(true);
			
				
	            stanziamento.setNonEliminabile(true);
				stanziamento.setDettaglioAnno0(dets);
				stanziamento.setDettaglioAnno1(dets);
				stanziamento.setDettaglioAnno2(dets);
										
				stanziamento.setDettaglioAnniSucc(new DettaglioComponenteImportiCapitolo());
				stanziamento.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());
				stanziamento.setDettaglioResiduiIniziale(new DettaglioComponenteImportiCapitolo());
				TipoComponenteImportiCapitolo tds = new TipoComponenteImportiCapitolo();
				tds.setMacrotipoComponenteImportiCapitolo(MacrotipoComponenteImportiCapitolo.getByDesc(iipcasns.getDescrizioneMacrotipoComponente().toUpperCase()));
				tds.setDescrizione(iipcasns.getDescrizioneComponente());
				tds.setUid(iipcasns.getIdComp());
				stanziamento.setTipoComponenteImportiCapitolo(tds);
				stanziamento.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
				stanziamento.setPropostaDefault(true);
				importiComponentiCapitolo.add(stanziamento);
				//Costruisco Impegnato
				impegnato.setDettaglioAnnoPrec(new DettaglioComponenteImportiCapitolo());
				DettaglioComponenteImportiCapitolo det = new DettaglioComponenteImportiCapitolo();
				det.setImporto(iipcasns.getImporto());
				Integer annoImpegnato = iipcasns.getAnnoImpegnato();
				
		        impegnato.setDettaglioAnno0(new DettaglioComponenteImportiCapitolo());
		        impegnato.setDettaglioAnno1(new DettaglioComponenteImportiCapitolo());
		        impegnato.setDettaglioAnno2(new DettaglioComponenteImportiCapitolo());   
				
				if(annoImpegnato - annoBilancio == 0) {
			        impegnato.setDettaglioAnno0(det);
			    }else if(annoImpegnato - annoBilancio == 1){
			        impegnato.setDettaglioAnno1(det);
			    }else if(annoImpegnato - annoBilancio==2){
			        impegnato.setDettaglioAnno2(det);   
			    }
				
				impegnato.setDettaglioAnniSucc(new DettaglioComponenteImportiCapitolo());
				impegnato.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());
				impegnato.setDettaglioResiduiIniziale(new DettaglioComponenteImportiCapitolo());
				impegnato.setPropostaDefault(true);
				TipoComponenteImportiCapitolo tdsi = new TipoComponenteImportiCapitolo();
				tdsi.setMacrotipoComponenteImportiCapitolo(MacrotipoComponenteImportiCapitolo.getByDesc(iipcasns.getDescrizioneMacrotipoComponente().toUpperCase()));
				tdsi.setDescrizione(iipcasns.getDescrizioneComponente());
				tdsi.setUid(iipcasns.getIdComp());
				impegnato.setTipoComponenteImportiCapitolo(tdsi);
				impegnato.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
				importiComponentiCapitolo.add(impegnato);
				
				lastIdCompProcessed = iipcasns.getIdComp();
			} 
			else
			{
				ImportiCapitoloPerComponente impegnato = new ImportiCapitoloPerComponente();
				impegnato = importiComponentiCapitolo.get(importiComponentiCapitolo.size()-1);
				
				
				Integer annoImpegnato = iipcasns.getAnnoImpegnato();
				DettaglioComponenteImportiCapitolo det = new DettaglioComponenteImportiCapitolo();
				det.setImporto(iipcasns.getImporto());

				if(annoImpegnato - annoBilancio == 0) {
			        impegnato.setDettaglioAnno0(new DettaglioComponenteImportiCapitolo());
			        impegnato.setDettaglioAnno0(det);
			    }else if(annoImpegnato - annoBilancio == 1){
			        impegnato.setDettaglioAnno1(new DettaglioComponenteImportiCapitolo());
			        impegnato.setDettaglioAnno1(det);
			    }else if(annoImpegnato - annoBilancio==2){
			        impegnato.setDettaglioAnno2(new DettaglioComponenteImportiCapitolo());   
			        impegnato.setDettaglioAnno2(det);   
			    }
			}
		}
		return importiComponentiCapitolo;
	}
	
	public static List<ImportiCapitoloPerComponente> toComponentiImportiCapitoloPerTriennioNoStanz(
			List<ImportiCapitoloPerComponente> importiComponentiCapitolo,
			List<ImportiImpegnatoPerComponenteTriennioNoStanz> listaImportiCapitoloTriennioNoStanz,
			Integer annoBilancio,
			Integer addIndex) { 
	
		//SIAC-7882
		List<ImportiImpegnatoPerComponenteTriennioNoStanz> componentiDaAggiornare = new ArrayList<ImportiImpegnatoPerComponenteTriennioNoStanz>();
		List<ImportiImpegnatoPerComponenteTriennioNoStanz> componentiDaInserire = new ArrayList<ImportiImpegnatoPerComponenteTriennioNoStanz>();
		//SIAC-7882: creiamo due strutture contenenti i dati da aggiornare sull'elenco preesistente e quelli da inserire ex novo sullo stesso elenco
		for(ImportiImpegnatoPerComponenteTriennioNoStanz iipcasns : listaImportiCapitoloTriennioNoStanz){
			int idComp =  iipcasns.getIdComp();
			int exist= 0;
			for (ImportiCapitoloPerComponente compDaAggiornare : importiComponentiCapitolo){
				if (compDaAggiornare.getTipoComponenteImportiCapitolo().getUid() == idComp) {
					exist++;
				}
			}
			if (exist > 0) {
				componentiDaAggiornare.add(iipcasns);
			}else {
				componentiDaInserire.add(iipcasns);
			}
		}
		////SIAC-7882: elaboriamo i dati da inserire ex novo in elenco 
		for(ImportiImpegnatoPerComponenteTriennioNoStanz iipcasns : componentiDaInserire){
				ImportiCapitoloPerComponente stanziamento = new ImportiCapitoloPerComponente();
				ImportiCapitoloPerComponente impegnato = new ImportiCapitoloPerComponente();
		
				//Costruisco riga stanziamento
				stanziamento.setDettaglioAnnoPrec(new DettaglioComponenteImportiCapitolo());
				DettaglioComponenteImportiCapitolo dets = new DettaglioComponenteImportiCapitolo();
				dets.setEditabile(true);
				stanziamento.setNonEliminabile(true);
				stanziamento.setDettaglioAnno0(dets);
				stanziamento.setDettaglioAnno1(dets);
				stanziamento.setDettaglioAnno2(dets);
				stanziamento.setDettaglioAnniSucc(new DettaglioComponenteImportiCapitolo());
				stanziamento.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());
				stanziamento.setDettaglioResiduiIniziale(new DettaglioComponenteImportiCapitolo());
				TipoComponenteImportiCapitolo tds = new TipoComponenteImportiCapitolo();
				tds.setMacrotipoComponenteImportiCapitolo(MacrotipoComponenteImportiCapitolo.getByDesc(iipcasns.getDescrizioneMacrotipoComponente().toUpperCase()));
				tds.setDescrizione(iipcasns.getDescrizioneComponente());
				tds.setUid(iipcasns.getIdComp());
				stanziamento.setTipoComponenteImportiCapitolo(tds);
				stanziamento.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
				stanziamento.setPropostaDefault(true);
				importiComponentiCapitolo.add(addIndex, stanziamento);
				
				//Costruisco Impegnato
				impegnato.setDettaglioAnnoPrec(new DettaglioComponenteImportiCapitolo());
				DettaglioComponenteImportiCapitolo det = new DettaglioComponenteImportiCapitolo();
				det.setImporto(iipcasns.getImporto());
				Integer annoImpegnato = iipcasns.getAnnoImpegnato();
				impegnato.setDettaglioAnno0(new DettaglioComponenteImportiCapitolo());
		        impegnato.setDettaglioAnno1(new DettaglioComponenteImportiCapitolo());
		        impegnato.setDettaglioAnno2(new DettaglioComponenteImportiCapitolo());   
				if(annoImpegnato - annoBilancio == 0) {
			        impegnato.setDettaglioAnno0(det);
			    }else if(annoImpegnato - annoBilancio == 1){
			        impegnato.setDettaglioAnno1(det);
			    }else if(annoImpegnato - annoBilancio==2){
			        impegnato.setDettaglioAnno2(det);   
			    }
				impegnato.setDettaglioAnniSucc(new DettaglioComponenteImportiCapitolo());
				impegnato.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());
				impegnato.setDettaglioResiduiIniziale(new DettaglioComponenteImportiCapitolo());
				impegnato.setPropostaDefault(true);
				TipoComponenteImportiCapitolo tdsi = new TipoComponenteImportiCapitolo();
				tdsi.setMacrotipoComponenteImportiCapitolo(MacrotipoComponenteImportiCapitolo.getByDesc(iipcasns.getDescrizioneMacrotipoComponente().toUpperCase()));
				tdsi.setDescrizione(iipcasns.getDescrizioneComponente());
				tdsi.setUid(iipcasns.getIdComp());
				impegnato.setTipoComponenteImportiCapitolo(tdsi);
				impegnato.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
				importiComponentiCapitolo.add(addIndex+1, impegnato);
			} 
		
			//SIAC-7882: elaboriamo i dati da aggiornare, già esistenti in elenco
			for(ImportiImpegnatoPerComponenteTriennioNoStanz iipcasns : componentiDaAggiornare){
				for (ImportiCapitoloPerComponente compDaAggiornare : importiComponentiCapitolo) {
					if (compDaAggiornare.getTipoComponenteImportiCapitolo().getUid() == iipcasns.getIdComp() 
							&& compDaAggiornare.getTipoDettaglioComponenteImportiCapitolo().equals(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO)) {
				
						ImportiCapitoloPerComponente impegnato = new ImportiCapitoloPerComponente();
						impegnato = compDaAggiornare;
						Integer annoImpegnato = iipcasns.getAnnoImpegnato();
						DettaglioComponenteImportiCapitolo det = new DettaglioComponenteImportiCapitolo();
						det.setImporto(iipcasns.getImporto());
						if(annoImpegnato - annoBilancio == 0) {
					        impegnato.setDettaglioAnno0(new DettaglioComponenteImportiCapitolo());
					        impegnato.setDettaglioAnno0(det);
					    }else if(annoImpegnato - annoBilancio == 1){
					        impegnato.setDettaglioAnno1(new DettaglioComponenteImportiCapitolo());
					        impegnato.setDettaglioAnno1(det);
					    }else if(annoImpegnato - annoBilancio==2){
					        impegnato.setDettaglioAnno2(new DettaglioComponenteImportiCapitolo());   
					        impegnato.setDettaglioAnno2(det);   
					    }  
					}
				}
			}
			//FINE SIAC-7882
			return importiComponentiCapitolo;
//		for(ImportiImpegnatoPerComponenteTriennioNoStanz iipcasns : listaImportiCapitoloTriennioNoStanz){
//			if (iipcasns.getIdComp() != lastIdCompProcessed && countRigaComponente == 0 )
//            {	
//				
//				ImportiCapitoloPerComponente stanziamento = new ImportiCapitoloPerComponente();
//				ImportiCapitoloPerComponente impegnato = new ImportiCapitoloPerComponente();
//				//Costruisco riga stanziamento
//				stanziamento.setDettaglioAnnoPrec(new DettaglioComponenteImportiCapitolo());
//	
//				DettaglioComponenteImportiCapitolo dets = new DettaglioComponenteImportiCapitolo();
//				dets.setEditabile(true);
//			
//
//	            stanziamento.setNonEliminabile(true);
//				stanziamento.setDettaglioAnno0(dets);
//				stanziamento.setDettaglioAnno1(dets);
//				stanziamento.setDettaglioAnno2(dets);
//										
//				stanziamento.setDettaglioAnniSucc(new DettaglioComponenteImportiCapitolo());
//				stanziamento.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());
//				stanziamento.setDettaglioResiduiIniziale(new DettaglioComponenteImportiCapitolo());
//		
//				TipoComponenteImportiCapitolo tds = new TipoComponenteImportiCapitolo();
//				tds.setMacrotipoComponenteImportiCapitolo(MacrotipoComponenteImportiCapitolo.getByDesc(iipcasns.getDescrizioneMacrotipoComponente().toUpperCase()));
//				tds.setDescrizione(iipcasns.getDescrizioneComponente());
//				tds.setUid(iipcasns.getIdComp());
//				
//				stanziamento.setTipoComponenteImportiCapitolo(tds);
//				stanziamento.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.STANZIAMENTO);
//				
//				stanziamento.setPropostaDefault(true);
//				importiComponentiCapitolo.add(addIndex, stanziamento);
//				//Costruisco Impegnato
//				impegnato.setDettaglioAnnoPrec(new DettaglioComponenteImportiCapitolo());
//				DettaglioComponenteImportiCapitolo det = new DettaglioComponenteImportiCapitolo();
//				det.setImporto(iipcasns.getImporto());
//				Integer annoImpegnato = iipcasns.getAnnoImpegnato();
//				
//				
//		        impegnato.setDettaglioAnno0(new DettaglioComponenteImportiCapitolo());
//		        impegnato.setDettaglioAnno1(new DettaglioComponenteImportiCapitolo());
//		        impegnato.setDettaglioAnno2(new DettaglioComponenteImportiCapitolo());   
//				
//				if(annoImpegnato - annoBilancio == 0) {
//			        impegnato.setDettaglioAnno0(det);
//			    }else if(annoImpegnato - annoBilancio == 1){
//			        impegnato.setDettaglioAnno1(det);
//			    }else if(annoImpegnato - annoBilancio==2){
//			        impegnato.setDettaglioAnno2(det);   
//			    }
//				
//				impegnato.setDettaglioAnniSucc(new DettaglioComponenteImportiCapitolo());
//				impegnato.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());
//				impegnato.setDettaglioResiduiIniziale(new DettaglioComponenteImportiCapitolo());
//				impegnato.setPropostaDefault(true);
//				TipoComponenteImportiCapitolo tdsi = new TipoComponenteImportiCapitolo();
//				tdsi.setMacrotipoComponenteImportiCapitolo(MacrotipoComponenteImportiCapitolo.getByDesc(iipcasns.getDescrizioneMacrotipoComponente().toUpperCase()));
//				tdsi.setDescrizione(iipcasns.getDescrizioneComponente());
//				tdsi.setUid(iipcasns.getIdComp());
//				impegnato.setTipoComponenteImportiCapitolo(tdsi);
//				impegnato.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
//				importiComponentiCapitolo.add(addIndex+1, impegnato);
//
//				lastIndexProcessed = addIndex+1;
//				lastIdCompProcessed = iipcasns.getIdComp();
//			} 
//			else
//			{
//					
//				ImportiCapitoloPerComponente impegnato = new ImportiCapitoloPerComponente();
//				//SIAC-7882
//				//impegnato = importiComponentiCapitolo.get(lastIndexProcessed);
//				impegnato = importiComponentiCapitolo.get(importiComponentiCapitolo.size()-1);
//				
//				
//				Integer annoImpegnato = iipcasns.getAnnoImpegnato();
//				DettaglioComponenteImportiCapitolo det = new DettaglioComponenteImportiCapitolo();
//				det.setImporto(iipcasns.getImporto());
//				
//				if(annoImpegnato - annoBilancio == 0) {
//			        impegnato.setDettaglioAnno0(new DettaglioComponenteImportiCapitolo());
//			        impegnato.setDettaglioAnno0(det);
//			    }else if(annoImpegnato - annoBilancio == 1){
//			        impegnato.setDettaglioAnno1(new DettaglioComponenteImportiCapitolo());
//			        impegnato.setDettaglioAnno1(det);
//			    }else if(annoImpegnato - annoBilancio==2){
//			        impegnato.setDettaglioAnno2(new DettaglioComponenteImportiCapitolo());   
//			        impegnato.setDettaglioAnno2(det);   
//			    }  
//	          }
//           }
//		return importiComponentiCapitolo;
	}
	//SIAC-7349 - END - GS - 20/07/2020  
	
	
//	//SIAC-7349 - STart - SR200 - MR - 17/04/2020 - metodo che controlla se le componenti degli anni precedenti abbiano residui o impegnati valorizzati
//	public static boolean showComponent(ComponenteImportiCapitolo componente) {
//
//			if(componente.getImpegnatoResiduoFinale().compareTo(BigDecimal.ZERO)<=0 
//					|| componente.getImpegnatoResiduoIniziale().compareTo(BigDecimal.ZERO)<=0 || componente.getListaDettaglioComponenteImportiCapitolo().get(1).getImporto().compareTo(BigDecimal.ZERO)<=0){
//				return false;
//			}
//		return true;
//
//	}
//	//Siac-7349 - End
}
