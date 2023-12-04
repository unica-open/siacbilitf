/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.apache.commons.lang3.time.DateUtils;

//siac_d_periodo_tipo
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum Periodo {
	
	ANNO("SY", PeriodoTipo.ANNUALE, "Anno Solare", 1, 1, 12),
	
	//Mensile
	GENNAIO		("M01", PeriodoTipo.MENSILE, "Gennaio", 1, 1, 1),
	FEBBRAIO	("M02", PeriodoTipo.MENSILE, "Febbraio", 2, 2, 2),
	MARZO		("M03", PeriodoTipo.MENSILE, "Marzo", 3, 3, 3),
	APRILE		("M04", PeriodoTipo.MENSILE, "Aprile", 4, 4, 4),
	MAGGIO		("M05", PeriodoTipo.MENSILE, "Maggio", 5, 5, 5),
	GIUGNO		("M06", PeriodoTipo.MENSILE, "Giugno", 6, 6, 6),
	LUGLIO		("M07", PeriodoTipo.MENSILE, "Luglio", 7, 7, 7),
	AGOSTO		("M08", PeriodoTipo.MENSILE, "Agosto", 8, 8, 8),
	SETTEMBRE	("M09", PeriodoTipo.MENSILE, "Settembre", 9, 9, 9),
	OTTOBRE		("M10", PeriodoTipo.MENSILE, "Ottobre", 10, 10, 10),
	NOVEMBRE	("M11", PeriodoTipo.MENSILE, "Novembre", 11, 11, 11),
	DICEMBRE	("M12", PeriodoTipo.MENSILE, "Dicembre", 12, 12, 12),
	
	//Trimestrale
	GENNAIO_MARZO		("T01", PeriodoTipo.TRIMESTRALE, "Gennaio - Marzo", 1, 1, 3),
	APRILE_GIUGNO		("T02", PeriodoTipo.TRIMESTRALE, "Aprile - Giugno", 2, 4, 6),
	LUGLIO_SETTEMBRE	("T03", PeriodoTipo.TRIMESTRALE, "Luglio - Settembre", 3, 7, 9),
	OTTOBRE_DICEMBRE	("T04", PeriodoTipo.TRIMESTRALE, "Ottobre - Dicembre", 4, 10, 12),
	
	//Quadrimestrale
	GENNAIO_APRILE		("Q01", PeriodoTipo.QUADRIMESTRALE, "Gennaio - Aprile", 1, 1, 4),
	MAGGIO_AGOSTO		("Q02", PeriodoTipo.QUADRIMESTRALE, "Maggio - Agosto", 2, 5, 8),
	SETTEMBRE_DICEMBRE	("Q03", PeriodoTipo.QUADRIMESTRALE, "Settembre - Dicembre", 3, 9, 12),
	
	//Semestrale
	GENNAIO_GIUGNO	("S01", PeriodoTipo.SEMESTRALE, "Gennaio - Giugno", 1, 1, 6),
	LUGLIO_DICEMBRE	("S02", PeriodoTipo.SEMESTRALE, "Luglio - Dicembre", 2, 7, 12),
	
	;
	
	private String codice;
	private PeriodoTipo periodoTipo;
	private String descrizione;
	private Integer ordinalePeriodo;
	private Integer ordinalePrimoMesePeriodo;
	private Integer ordinaleUltimoMesePeriodo;
	
	private Periodo(String codice, PeriodoTipo periodoTipo, String descrizione, Integer ordinalePeriodo, Integer ordinalePrimoMesePeriodo,
			Integer ordinaleUltimoMesePeriodo) {
		this.codice = codice;
		this.periodoTipo = periodoTipo;
		this.descrizione = descrizione;
		this.ordinalePeriodo = ordinalePeriodo;
		this.ordinalePrimoMesePeriodo = ordinalePrimoMesePeriodo;
		this.ordinaleUltimoMesePeriodo = ordinaleUltimoMesePeriodo;
	}
	
	public static List<Periodo> fromPeriodoTipo(PeriodoTipo periodoTipo) {	
		final List<Periodo> result = new ArrayList<Periodo>();
		
		for(Periodo p : values()) {
			if(p.getPeriodoTipo().equals(periodoTipo)) {
				result.add(p);
			}
		}
		return result;
	}
	
	
	public static Periodo fromPeriodoTipoEvenNull(PeriodoTipo pt, Integer i){
		for(Periodo p : fromPeriodoTipo(pt)){
			if(p.getOrdinalePeriodo().equals(i)){
				return p;
			}
		}
		return null;
	}
	
	public static Periodo fromPeriodoTipo(PeriodoTipo pt, Integer i){
		final Periodo p = fromPeriodoTipoEvenNull(pt,i);
		if(p==null){
			throw new IllegalArgumentException("Impossibile trovare il Periodo con ordinale " + i + " per il PeriodoTipo: "+pt);
		}
		return p;
	}
	
	public static List<Periodo> annuale(){
		return fromPeriodoTipo(PeriodoTipo.ANNUALE);
	}
	
	public static Periodo annuale(Integer i){
		return fromPeriodoTipo(PeriodoTipo.ANNUALE,i);
	}
	
	public static List<Periodo> mensile(){
		return fromPeriodoTipo(PeriodoTipo.MENSILE);
	}
	
	public static Periodo mensile(Integer i){
		return fromPeriodoTipo(PeriodoTipo.MENSILE,i);
	}
	
	public static List<Periodo> trimestrale(){
		return fromPeriodoTipo(PeriodoTipo.TRIMESTRALE);
	}
	
	public static Periodo trimestrale(Integer i){
		return fromPeriodoTipo(PeriodoTipo.TRIMESTRALE,i);
	}
	
	public static List<Periodo> quadrimestrale(){
		return fromPeriodoTipo(PeriodoTipo.QUADRIMESTRALE);
	}
	
	public static Periodo quadrimestrale(Integer i){
		return fromPeriodoTipo(PeriodoTipo.QUADRIMESTRALE,i);
	}
	
	public static List<Periodo> semestrale(){
		return fromPeriodoTipo(PeriodoTipo.SEMESTRALE);
	}
	
	public static Periodo semestrale(Integer i){
		return fromPeriodoTipo(PeriodoTipo.SEMESTRALE,i);
	}
	

	
	public static Periodo fromCodice(String codice) {
		for(Periodo tc : values()) {
			if(tc.getCodice().equals(codice)) {
				return tc;
			}
		}
		return null;
	}
	
	public static Periodo fromOrdinalePeriodoAndPeriodoTipo(PeriodoTipo periodoTipo, Integer ordinalePeriodo) {
		final List<Periodo> fromPeriodoTipo = fromPeriodoTipo(periodoTipo);
		for(Periodo p : fromPeriodoTipo) {
			if(p.getOrdinalePeriodo().equals(ordinalePeriodo)) {
				return p;
			}
		}
		return null;
	}
	
	public static Periodo byDateAndTipoChiusura(Date d, TipoChiusura tc){
		return byDateAndPeriodoTipo(d,tc.getPeriodoTipo());
	}
	
	public static Periodo byDateAndPeriodoTipo(Date d, PeriodoTipo pt) { 
		 
		final Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		final int month = cal.get(Calendar.MONTH);
		
		return fromPeriodoTipo(pt,month/pt.getNumeroMesi() + 1);
		
		//NO IF!
//		if(PeriodoTipo.MENSILE.equals(pt)){
//			return mensile(month/1 +1);
//		} else if (PeriodoTipo.TRIMESTRALE.equals(pt)){
//			return trimestrale(month/3+1);
//		} else if (PeriodoTipo.QUADRIMESTRALE.equals(pt)){
//			return quadrimestrale(month/4+1);
//		} else if (PeriodoTipo.SEMESTRALE.equals(pt)){
//			return semestrale(month/6+1);
//		} else if(PeriodoTipo.ANNUALE.equals(pt)){
//			return annuale(month/12+1);
//			//return Periodo.ANNO;
//		}
//		
//		return null;
	}
	
	
	public Periodo successivo(){
		return fromPeriodoTipoEvenNull(this.getPeriodoTipo(),this.getOrdinalePeriodo()+1);
	}
	
	public Periodo precedente(){
		return fromPeriodoTipoEvenNull(this.getPeriodoTipo(),this.getOrdinalePeriodo()-1);
	}
	
	
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @return the periodoTipo
	 */
	public PeriodoTipo getPeriodoTipo() {
		return periodoTipo;
	}

	/**
	 * @return the ordinalePeriodo
	 */
	public Integer getOrdinalePeriodo() {
		return ordinalePeriodo;
	}

	/**
	 * @return the ordinalePrimoMesePeriodo
	 */
	public Integer getOrdinalePrimoMesePeriodo() {
		return ordinalePrimoMesePeriodo;
	}
	
	/**
	 * @return the ordinaleUltimoMesePeriodo
	 */
	public Integer getOrdinaleUltimoMesePeriodo() {
		return ordinaleUltimoMesePeriodo;
	}

	/**
	 * Ottiene la data di inizio del periodo.
	 * 
	 * @param anno l'anno di cui il periodo fa parte
	 * 
	 * @return il data di inizio
	 */
	public Date getInizioPeriodo(Integer anno) {
		final Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.MONTH, getOrdinalePrimoMesePeriodo() - 1);
		cal.set(Calendar.YEAR, anno);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		
		return cal.getTime();
	}
	
	/**
	 * Ottiene la data di fine del periodo.
	 * 
	 * @param anno l'anno di cui il periodo fa parte
	 * 
	 * @return il data di fine
	 */
	public Date getFinePeriodo(Integer anno) {
		final Calendar cal = Calendar.getInstance();
		// Imposto il primo giorno del mese successivo, e tolgo un giorno
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.MONTH, getOrdinaleUltimoMesePeriodo());
		cal.set(Calendar.YEAR, anno);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		
		return DateUtils.addMilliseconds(cal.getTime(), -1);
	}
	
	/**
	 * XmlAdapter per il periodo
	 * @author Marchino Alessandro
	 *
	 */
	public static class PeriodoAdapter extends XmlAdapter<Periodo.PeriodoWrapper, Periodo> {
	
		@Override
		public Periodo unmarshal(PeriodoWrapper p) throws Exception {
			return p != null ? Periodo.valueOf(p.name) : null;
		}

		@Override
		public PeriodoWrapper marshal(Periodo p) throws Exception {
			return p != null ? new PeriodoWrapper(p.name(), p.getCodice(), p.getDescrizione()) : null;
		}
	}
	
	/**
	 * XmlWrapper per il periodo
	 * @author Marchino Alessandro
	 *
	 */
	@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
	public static class PeriodoWrapper {
		@XmlValue
		String name;
		@XmlAttribute
		private String codice;
		@XmlAttribute
		private String descrizione;
		
		public PeriodoWrapper(){
			// Costruttore vuoto
		}
		
		public PeriodoWrapper(String name, String codice, String descrizione) {
			super();
			this.name = name;
			this.codice = codice;
			this.descrizione = descrizione;
		}	
	}

}



