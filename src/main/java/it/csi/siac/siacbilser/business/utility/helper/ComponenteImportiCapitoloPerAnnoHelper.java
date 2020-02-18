/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.business.utility.helper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import it.csi.siac.siacbilser.model.ComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.DettaglioComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.ImportiCapitolo;
import it.csi.siac.siacbilser.model.ImportiCapitoloUG;
import it.csi.siac.siacbilser.model.ImportiCapitoloUP;
import it.csi.siac.siacbilser.model.TipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.TipoDettaglioComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.wrapper.ImportiCapitoloPerComponente;

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

		if (!importiCapitoloList.isEmpty()) {
			if (importiCapitoloList.get(1).getListaComponenteImportiCapitolo() != null
					&& !importiCapitoloList.get(1).getListaComponenteImportiCapitolo().isEmpty()) {
				// numero componenti
				int numComponenti = importiCapitoloList.get(1).getListaComponenteImportiCapitolo().size();
				for (int i = 0; i < numComponenti; i++) {
					if (importiCapitoloList.get(1).getListaComponenteImportiCapitolo().get(i)
							.getListaDettaglioComponenteImportiCapitolo() != null
							&& !importiCapitoloList.get(1).getListaComponenteImportiCapitolo().get(i)
									.getListaDettaglioComponenteImportiCapitolo().isEmpty()) {
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
							icpc.setDettaglioResidui(new DettaglioComponenteImportiCapitolo());
							// ANNO 0
							icpc.setDettaglioAnno0(buildDettaglioComponente(importiCapitoloList, i, k, 1));
							// ANNO 1
							icpc.setDettaglioAnno1(buildDettaglioComponente(importiCapitoloList, i, k, 2));
							// ANNO 2
							icpc.setDettaglioAnno2(buildDettaglioComponente(importiCapitoloList, i, k, 3));
							// SUCCESSIVO
							icpc.setDettaglioAnniSucc(new DettaglioComponenteImportiCapitolo());
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
					icpc.setDettaglioResidui(buildDettaglioComponenteResiduo(importiCapitoloResiduo.getListaComponenteImportiCapitolo(),i,k));
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
		popolaDatiAnnoPrecedente(importiCapitolo, listaTemporaneaTransfer);
		
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
	private static void popolaDatiAnnoPrecedente(ImportiCapitolo importiCapitolo, List<ImportiCapitoloPerComponente> listaTemporaneaTransfer) {
		int numComponenti = importiCapitolo.getListaComponenteImportiCapitolo().size();
		for (int i = 0; i < numComponenti; i++) {
			ComponenteImportiCapitolo componenteImportiCapitolo = importiCapitolo.getListaComponenteImportiCapitolo().get(i);
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
			annoPrecedenteI.setImporto(BigDecimal.ZERO);
			competenzaImpegnato.setDettaglioAnnoPrec(annoPrecedenteI);
			
			DettaglioComponenteImportiCapitolo anno0I = new DettaglioComponenteImportiCapitolo();
			anno0I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			anno0I.setEditabile(false);
			anno0I.setImporto(((ImportiCapitoloUP)importiCapitolo.get(1)).getDiCuiImpegnatoAnno1());
			competenzaImpegnato.setDettaglioAnno0(anno0I);
			
			DettaglioComponenteImportiCapitolo anno1I = new DettaglioComponenteImportiCapitolo();
			anno1I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			anno1I.setEditabile(true);
			anno1I.setImporto(((ImportiCapitoloUP)importiCapitolo.get(1)).getDiCuiImpegnatoAnno2());
			competenzaImpegnato.setDettaglioAnno1(anno1I);
			
			DettaglioComponenteImportiCapitolo anno2I = new DettaglioComponenteImportiCapitolo();
			anno2I.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			anno2I.setEditabile(true);
			anno2I.setImporto(((ImportiCapitoloUP)importiCapitolo.get(1)).getDiCuiImpegnatoAnno3());
			competenzaImpegnato.setDettaglioAnno2(anno2I);
			
			DettaglioComponenteImportiCapitolo residuiI = new DettaglioComponenteImportiCapitolo();
			residuiI.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			residuiI.setEditabile(true);
			residuiI.setImporto(residuo!= null ? residuo.getStanziamento() : BigDecimal.ZERO);
			competenzaImpegnato.setDettaglioResidui(residuiI);
			
			DettaglioComponenteImportiCapitolo annoSuccessivoI = new DettaglioComponenteImportiCapitolo();
			annoSuccessivoI.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.IMPEGNATO);
			annoSuccessivoI.setEditabile(false);
			annoSuccessivoI.setImporto(annoSuccessivoImporto!= null ? annoSuccessivoImporto.getStanziamento() : BigDecimal.ZERO);
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
			anno0D.setImporto( competenzaStanziamento.getDettaglioAnno0().getImporto().subtract(competenzaImpegnato.getDettaglioAnno0().getImporto())); 
			disponibilita.setDettaglioAnno0(anno0D);
			
			DettaglioComponenteImportiCapitolo anno1D = new DettaglioComponenteImportiCapitolo();
			anno1D.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.DISPONIBILITAIMPEGNARE);
			anno1D.setEditabile(true);
			anno1D.setImporto( competenzaStanziamento.getDettaglioAnno1().getImporto().subtract(competenzaImpegnato.getDettaglioAnno1().getImporto()));
			disponibilita.setDettaglioAnno1(anno1D);
			
			DettaglioComponenteImportiCapitolo anno2D = new DettaglioComponenteImportiCapitolo();
			anno2D.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.DISPONIBILITAIMPEGNARE);
			anno2D.setEditabile(true);
			anno2D.setImporto(competenzaStanziamento.getDettaglioAnno2().getImporto().subtract(competenzaImpegnato.getDettaglioAnno2().getImporto()));
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
			annoPrecedenteD.setImporto(BigDecimal.ZERO);
			residuiD.setImporto(residuo!= null ? residuo.getStanziamento() : BigDecimal.ZERO);
			anno0D.setImporto(((ImportiCapitoloUG)importiCapitolo.get(1)).getDiCuiImpegnatoAnno1UG()); 
			anno1D.setImporto(((ImportiCapitoloUG)importiCapitolo.get(1)).getDiCuiImpegnatoAnno2UG());
			anno2D.setImporto(((ImportiCapitoloUG)importiCapitolo.get(1)).getDiCuiImpegnatoAnno3UG());
			annoSuccessivoD.setImporto(annoSuccessivoImporto!= null ? annoSuccessivoImporto.getStanziamento() : BigDecimal.ZERO);
			
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
			residuiI.setImporto(BigDecimal.ZERO);
			residuoEffettivo.setDettaglioResidui(residuiI);
			
			DettaglioComponenteImportiCapitolo annoSuccessivoI = new DettaglioComponenteImportiCapitolo();
			annoSuccessivoI.setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo.EFFETTIVO);
			annoSuccessivoI.setEditabile(false);
			annoSuccessivoI.setImporto(BigDecimal.ZERO );
			residuoEffettivo.setDettaglioAnniSucc(annoSuccessivoI);
			residuiComponenti.add(residuoEffettivo);
			
		}
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
	

}
