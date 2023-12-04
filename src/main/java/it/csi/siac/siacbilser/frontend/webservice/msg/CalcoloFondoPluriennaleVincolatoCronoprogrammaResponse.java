/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.FondoPluriennaleVincolatoCronoprogramma;
import it.csi.siac.siacbilser.model.FondoPluriennaleVincolatoEntrataCronoprogramma;
import it.csi.siac.siacbilser.model.FondoPluriennaleVincolatoUscitaCronoprogramma;
import it.csi.siac.siacbilser.model.RiepilogoFondoPluriennaleVincolatoEntrataCronoprogramma;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
@Deprecated
public class CalcoloFondoPluriennaleVincolatoCronoprogrammaResponse extends ServiceResponse {
	
	private List<FondoPluriennaleVincolatoEntrataCronoprogramma> listaFondoPluriennaleVincolatoEntrataCronoprogramma = new ArrayList<FondoPluriennaleVincolatoEntrataCronoprogramma>();	
	//AGGIUNTI in data 17_07_2015
	private List<Integer> listaAnniEntrataUscitaComplessiva = new ArrayList<Integer>();
	private List<FondoPluriennaleVincolatoUscitaCronoprogramma> listaFondoPluriennaleVincolatoUscitaCronoprogramma = new ArrayList<FondoPluriennaleVincolatoUscitaCronoprogramma>();

	/**
	 * @return the listaFondoPluriennaleVincolatoEntrataCronoprogramma
	 */
	public List<FondoPluriennaleVincolatoEntrataCronoprogramma> getListaFondoPluriennaleVincolatoEntrataCronoprogramma() {
		return listaFondoPluriennaleVincolatoEntrataCronoprogramma;
	}

	/**
	 * @param listaFondoPluriennaleVincolatoEntrataCronoprogramma the listaFondoPluriennaleVincolatoEntrataCronoprogramma to set
	 */
	public void setListaFondoPluriennaleVincolatoEntrataCronoprogramma(List<FondoPluriennaleVincolatoEntrataCronoprogramma> listaFondoPluriennaleVincolatoEntrataCronoprogramma) {
		this.listaFondoPluriennaleVincolatoEntrataCronoprogramma = listaFondoPluriennaleVincolatoEntrataCronoprogramma;
	}

	/**
	 * @return the listaAnniEntrataUscitaComplessiva
	 */
	public List<Integer> getListaAnniEntrataUscitaComplessiva() {
		return listaAnniEntrataUscitaComplessiva;
	}

	/**
	 * @param listaAnniEntrataUscitaComplessiva the listaAnniEntrataUscitaComplessiva to set
	 */
	public void setListaAnniEntrataUscitaComplessiva(List<Integer> listaAnniEntrataUscitaComplessiva) {
		this.listaAnniEntrataUscitaComplessiva = listaAnniEntrataUscitaComplessiva;
	}

	/**
	 * @return the listaFondoPluriennaleVincolatoUscitaCronoprogramma
	 */
	public List<FondoPluriennaleVincolatoUscitaCronoprogramma> getListaFondoPluriennaleVincolatoUscitaCronoprogramma() {
		return listaFondoPluriennaleVincolatoUscitaCronoprogramma;
	}

	/**
	 * @param listaFondoPluriennaleVincolatoUscitaCronoprogramma the listaFondoPluriennaleVincolatoUscitaCronoprogramma to set
	 */
	public void setListaFondoPluriennaleVincolatoUscitaCronoprogramma(List<FondoPluriennaleVincolatoUscitaCronoprogramma> listaFondoPluriennaleVincolatoUscitaCronoprogramma) {
		this.listaFondoPluriennaleVincolatoUscitaCronoprogramma = listaFondoPluriennaleVincolatoUscitaCronoprogramma;
	}

	public List<RiepilogoFondoPluriennaleVincolatoEntrataCronoprogramma> raggruppaFondoPluriennaleVincolatoPerEntrate() {
		final Map<Integer, RiepilogoFondoPluriennaleVincolatoEntrataCronoprogramma> map = new TreeMap<Integer, RiepilogoFondoPluriennaleVincolatoEntrataCronoprogramma>();
		
		for(FondoPluriennaleVincolatoEntrataCronoprogramma fpve : listaFondoPluriennaleVincolatoEntrataCronoprogramma){
			final Integer anno = fpve.getAnno();
			RiepilogoFondoPluriennaleVincolatoEntrataCronoprogramma r = map.get(anno);
			if(r==null){
				r = new RiepilogoFondoPluriennaleVincolatoEntrataCronoprogramma();
				r.setAnno(anno);
				map.put(anno, r);
			}
			
			r.addImportoEntrata(fpve.getImporto());
			
			if("2".equals(fpve.getTitoloSpesa().getCodice()) || "3".equals(fpve.getTitoloSpesa().getCodice())) {
				r.addImportoTitolo2(fpve.getImportoFPV());
			} else {
				r.addImportoTitolo1(fpve.getImportoFPV());
			}
			
		}
		
		
		return new ArrayList<RiepilogoFondoPluriennaleVincolatoEntrataCronoprogramma>(map.values());
	}
	
	/**
	 * Raggruppa i fondi pluriennali vincolati per anno.
	 * 
	 * @return una mappa dei fondi per anno. Nell'array dei fondi vincolati, l'ordine &eacute; il seguente:
	 *    <ul>
	 *       <li>fondo pluriennale vincolato di entrata;</li>
	 *       <li>fondo pluriennale vincolato di uscita.</li>
	 *   </ul>
	 */
	public Map<Integer, FondoPluriennaleVincolatoCronoprogramma[]> raggruppaFondoPluriennaleVincolatoPerAnno() {
		
		final Map<Integer, FondoPluriennaleVincolatoCronoprogramma[]> map =  new TreeMap<Integer, FondoPluriennaleVincolatoCronoprogramma[]>();
		
		// Creo i fondi di entrata
		for (FondoPluriennaleVincolatoEntrataCronoprogramma fpvE : listaFondoPluriennaleVincolatoEntrataCronoprogramma) {
			final Integer anno = fpvE.getAnno();
			FondoPluriennaleVincolatoCronoprogramma[] arr = map.get(anno);
			
			FondoPluriennaleVincolatoEntrataCronoprogramma fpvENellaMappa = null;
			
			if(arr == null) {
				arr = new FondoPluriennaleVincolatoCronoprogramma[2];
				final FondoPluriennaleVincolatoUscitaCronoprogramma fpvU = new FondoPluriennaleVincolatoUscitaCronoprogramma();
				fpvU.setAnno(anno);
				arr[1] = fpvU;
				
				fpvENellaMappa = new FondoPluriennaleVincolatoEntrataCronoprogramma();
				fpvENellaMappa.setAnno(anno);
			} else {
				fpvENellaMappa = (FondoPluriennaleVincolatoEntrataCronoprogramma) arr[0];
			}
			
			fpvENellaMappa.setImporto(fpvENellaMappa.getImporto().add(fpvE.getImporto()));
			fpvENellaMappa.setImportoFPV(getFPVSpesaTotale(anno-1));
			
			arr[0] = fpvENellaMappa;
			
			map.put(anno, arr);
		}
		
		// Creo i fondi di uscita
		for (FondoPluriennaleVincolatoUscitaCronoprogramma fpvU : listaFondoPluriennaleVincolatoUscitaCronoprogramma) {
			
			final Integer anno = fpvU.getAnno();
			FondoPluriennaleVincolatoCronoprogramma[] arr = map.get(anno);
			
			FondoPluriennaleVincolatoUscitaCronoprogramma fpvUNellaMappa = null;
			
			if(arr == null) {
				arr = new FondoPluriennaleVincolatoCronoprogramma[2];
				final FondoPluriennaleVincolatoEntrataCronoprogramma fpvE = new FondoPluriennaleVincolatoEntrataCronoprogramma();
				fpvE.setAnno(anno);
				fpvE.setImportoFPV(getFPVSpesaTotale(anno-1));
				arr[0] = fpvE;
				
				fpvUNellaMappa = new FondoPluriennaleVincolatoUscitaCronoprogramma();
				fpvUNellaMappa.setAnno(anno);
			} else {
				fpvUNellaMappa = (FondoPluriennaleVincolatoUscitaCronoprogramma) arr[1];
			}
			
			fpvUNellaMappa.setImporto(fpvUNellaMappa.getImporto().add(fpvU.getImporto()));
			fpvUNellaMappa.setImportoFPV(fpvUNellaMappa.getImportoFPV().add(fpvU.getImportoFPV()));
			
			arr[1] = fpvUNellaMappa;
			
			map.put(anno, arr);
		}
		return map;
	}
	//aggiunto il 18/06/2015
	//calcola l'importo FPV di spesa per un determinato anno 
	private BigDecimal getFPVSpesaTotale(Integer annoSpesa) {
		BigDecimal importoFpvSpesa=BigDecimal.ZERO;
		for(FondoPluriennaleVincolatoUscitaCronoprogramma fpvu :listaFondoPluriennaleVincolatoUscitaCronoprogramma){
			if(fpvu.getAnno().equals(annoSpesa)) {
				importoFpvSpesa = importoFpvSpesa.add(fpvu.getImportoFPV());
			}
		}
		return importoFpvSpesa;
	}
		
//	public List<FondoPluriennaleVincolatoUscitaCronoprogramma> filterFPVUscitaByAnno(Integer anno){
//		return filterFPVByAnno(anno, listaFondoPluriennaleVincolatoUscitaCronoprogramma);
//	}
	
	public List<FondoPluriennaleVincolatoUscitaCronoprogramma> filterFPVUscitaCompleteByAnno(Integer anno){
		return filterFPVByAnno(anno, listaFondoPluriennaleVincolatoUscitaCronoprogramma);
	}
	
	public List<FondoPluriennaleVincolatoEntrataCronoprogramma> filterFPVEntrataByAnno(Integer anno){
		return filterFPVByAnno(anno, listaFondoPluriennaleVincolatoEntrataCronoprogramma);
	}
	
	
	
	private <T extends FondoPluriennaleVincolatoCronoprogramma> List<T> filterFPVByAnno(Integer anno, List<T> list){
		final List<T> result = new ArrayList<T>();
		for(T fpv : list) {			
			if(fpv.getAnno().compareTo(anno)==0){
				result.add(fpv);
			}			
		}
		
		return result;
	}
	
		
	/**
	 * aggiunto in data 12/06/2015 jira (2059) mostra tutti gli anni a partire
	 * dall'anno di spesa o di entrata minore fino all'anno di spesa o di entrata
	 * 
	 * @return listaFPVentrata
	 */
	public List<RiepilogoFondoPluriennaleVincolatoEntrataCronoprogramma> raggruppaFondoPluriennaleVincolatoEntratePerAnni() {
		final Map<Integer, RiepilogoFondoPluriennaleVincolatoEntrataCronoprogramma> map = new TreeMap<Integer, RiepilogoFondoPluriennaleVincolatoEntrataCronoprogramma>();
		final Integer annoInizio = getListaAnniEntrataUscitaComplessiva().get(0);
		final Integer annoFine = getListaAnniEntrataUscitaComplessiva().get(listaAnniEntrataUscitaComplessiva.size() - 1);
		Integer annoIndex = annoInizio;
		while (annoIndex <= annoFine) {
			RiepilogoFondoPluriennaleVincolatoEntrataCronoprogramma r = map.get(annoIndex);
			if (r == null) {
				r = new RiepilogoFondoPluriennaleVincolatoEntrataCronoprogramma();
				r.setAnno(annoIndex);
			}

			for (FondoPluriennaleVincolatoEntrataCronoprogramma fpv : listaFondoPluriennaleVincolatoEntrataCronoprogramma) {
				if (fpv.getAnno().equals(annoIndex)) {
					r.addImportoEntrata(fpv.getImporto());
					break;
				}
			}
            
			for (FondoPluriennaleVincolatoUscitaCronoprogramma fpvu : listaFondoPluriennaleVincolatoUscitaCronoprogramma) {
				if (fpvu.getAnno().equals(annoIndex - 1) && !"2".equals(fpvu.getTitoloSpesa().getCodice()) && !"3".equals(fpvu.getTitoloSpesa().getCodice())) {
					r.addImportoTitolo1(fpvu.getImportoFPV());
				}
				if (fpvu.getAnno().equals(annoIndex - 1) && ("2".equals(fpvu.getTitoloSpesa().getCodice()) || "3".equals(fpvu.getTitoloSpesa().getCodice()))) {
					r.addImportoTitolo2(fpvu.getImportoFPV());
				}
			}

			map.put(annoIndex, r);
			annoIndex++;
		}

		return new ArrayList<RiepilogoFondoPluriennaleVincolatoEntrataCronoprogramma>(map.values());
	}

}
