/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.StringUtils;

import it.csi.siac.siaccommon.util.CoreUtils;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum TipoCapitolo {
	
	CAPITOLO_ENTRATA_PREVISIONE(CapitoloEntrataPrevisione.class, ImportiCapitoloEP.class),
	CAPITOLO_USCITA_PREVISIONE(CapitoloUscitaPrevisione.class, ImportiCapitoloUP.class),
	CAPITOLO_ENTRATA_GESTIONE(CapitoloEntrataGestione.class, ImportiCapitoloEG.class),
	CAPITOLO_USCITA_GESTIONE(CapitoloUscitaGestione.class, ImportiCapitoloUG.class),
	;
	
	private final Class<? extends Capitolo<?, ?>> tipoCapitoloClass;
	private final Class<? extends ImportiCapitolo> importiCapitoloClass;

	private <T extends Capitolo<I, ?>, I extends ImportiCapitolo> TipoCapitolo(Class<T> tipoCapitoloClass, Class<I> importiCapitoloClass) {
		this.tipoCapitoloClass = tipoCapitoloClass;
		this.importiCapitoloClass = importiCapitoloClass;
	}
	
	public static boolean isTipoCapitoloEntrata(Capitolo<?,?> cap){
		return isTipoCapitoloEntrata(cap.getTipoCapitolo());
	}
	
	public static boolean isTipoCapitoloEntrata(TipoCapitolo tipo){
		return CAPITOLO_ENTRATA_PREVISIONE.equals(tipo) || CAPITOLO_ENTRATA_GESTIONE.equals(tipo);
	}	
	
	public static boolean isTipoCapitoloUscita(Capitolo<?,?> cap){
		return isTipoCapitoloUscita(cap.getTipoCapitolo());
	}
	
	public static boolean isTipoCapitoloUscita(TipoCapitolo tipo){
		return CAPITOLO_USCITA_PREVISIONE.equals(tipo) || CAPITOLO_USCITA_GESTIONE.equals(tipo);
	}
		
	public static boolean isTipoCapitoloGestione(Capitolo<?,?> cap){
		return isTipoCapitoloGestione(cap.getTipoCapitolo());
	}
	
	public static boolean isTipoCapitoloGestione(TipoCapitolo tipo){
		return CAPITOLO_USCITA_GESTIONE.equals(tipo) || CAPITOLO_ENTRATA_GESTIONE.equals(tipo);
	}	
	
	public static boolean isTipoCapitoloPrevisione(Capitolo<?,?> cap){
		return isTipoCapitoloPrevisione(cap.getTipoCapitolo());
	}
	
	public static boolean isTipoCapitoloPrevisione(TipoCapitolo tipo){
		return CAPITOLO_USCITA_PREVISIONE.equals(tipo) || CAPITOLO_ENTRATA_PREVISIONE.equals(tipo);
	}
	
	/**
	 * Crea una lista di Tipo Capitolo a partire dai parametri forniti in input.
	 * 
	 * @param entrataUscita
	 * @param previsioneGestione
	 * 
	 * @return una lista dei tipi di capitolo corrispondenti ai parametri
	 */
	public static List<TipoCapitolo> getTipiCapitolo(String entrataUscita, String previsioneGestione) {
		final List<TipoCapitolo> result = new ArrayList<TipoCapitolo>();
		final StringBuilder regexp = new StringBuilder();
		
		// Costruisco la regexp
		regexp.append("CAPITOLO_");
		
		// Capitolo di uscita o entrata
		if(StringUtils.isNotBlank(entrataUscita)) {
			regexp.append(StringUtils.trim(entrataUscita).toUpperCase());
		} else {
			regexp.append("(USCITA|ENTRATA)");
		}
		
		regexp.append("_");
		
		// Capitolo di previsione o gestione
		if(StringUtils.isNotBlank(previsioneGestione)) {
			regexp.append(StringUtils.trim(previsioneGestione).toUpperCase());
		} else {
			regexp.append("(PREVISIONE|GESTIONE)");
		}
		
		// Compilo la regexp
		final Pattern pattern = Pattern.compile(regexp.toString());
		
		for(TipoCapitolo t : values()) {
			if(pattern.matcher(t.name()).matches()) {
				result.add(t);
			}
		}
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Capitolo<?, ?>> Class<T> getTipoCapitoloClass() {
		return (Class<T>) tipoCapitoloClass;
	}
	
	@SuppressWarnings("unchecked")
	public <I extends ImportiCapitolo> Class<I> getImportiCapitoloClass() {
		return (Class<I>) importiCapitoloClass;
	}

	/**
	 * Ottiene una nuova istanza per questo tipo di capitolo
	 * @return
	 */
	public Capitolo<?,?> newCapitoloInstance() {
		return CoreUtils.instantiateNewClass(tipoCapitoloClass);
	}
	/**
	 * Ottiene una nuova istanza degli importi per questo tipo di capitolo
	 * @return
	 */
	public ImportiCapitolo newImportiCapitoloInstance() {
		return CoreUtils.instantiateNewClass(importiCapitoloClass);
	}
	
}
