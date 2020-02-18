/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class Cronoprogramma extends Entita {
	
	private static final long serialVersionUID = -4609080711847384626L;
	
	private Ente ente;
	private Bilancio bilancio;
	private String codice;
	private String descrizione;
	private String note;
	private StatoOperativoCronoprogramma statoOperativoCronoprogramma;
	
	private Progetto progetto;
	//campo nuovo 10_03_2015
	private Boolean usatoPerFpv;
	
	@XmlElementWrapper(name = "listaDettagliUscita")	    
	@XmlElement(name = "dettaglioUscita")
	private List<DettaglioUscitaCronoprogramma> capitoliUscita = new ArrayList<DettaglioUscitaCronoprogramma>();
	
	@XmlElementWrapper(name = "listaDettagliEntrata")	    
	@XmlElement(name = "dettaglioEntrata")
	private List<DettaglioEntrataCronoprogramma> capitoliEntrata = new ArrayList<DettaglioEntrataCronoprogramma>();
	
	private Boolean cronoprogrammaDaDefinire;
	
	//SIAC-6255
	private AttoAmministrativo attoAmministrativo;
	private Date dataApprovazioneFattibilita;
	private Date dataApprovazioneProgettoDefinitivo;
	private Date dataApprovazioneProgettoEsecutivo;
	private Date dataAvvioProcedura;
	private Date dataAggiudicazioneLavori;
	private Date dataInizioLavori;
	private Date dataFineLavori;
	private Date dataCollaudo;
	private Integer durataInGiorni;
	private Boolean gestioneQuadroEconomico;
	private Boolean usatoPerFpvProv;
	
	
	
	public String getCodice() {
		return codice;
	}
	/**
	 * O Versione del cronoprogramma
	 * @param codice
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public StatoOperativoCronoprogramma getStatoOperativoCronoprogramma() {
		return statoOperativoCronoprogramma;
	}
	public void setStatoOperativoCronoprogramma(StatoOperativoCronoprogramma statoOperativoCronoprogramma) {
		this.statoOperativoCronoprogramma = statoOperativoCronoprogramma;
	}
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public Bilancio getBilancio() {
		return bilancio;
	}
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@XmlTransient
	public List<DettaglioUscitaCronoprogramma> getCapitoliUscita() {
		return capitoliUscita;
	}
	public void setCapitoliUscita(List<DettaglioUscitaCronoprogramma> capitoliUscita) {
		this.capitoliUscita = capitoliUscita;
	}
	
	@XmlTransient
	public List<DettaglioEntrataCronoprogramma> getCapitoliEntrata() {
		return capitoliEntrata;
	}
	public void setCapitoliEntrata(List<DettaglioEntrataCronoprogramma> capitoliEntrata) {
		this.capitoliEntrata = capitoliEntrata;
	}
	/**
	 * restutisce il Progetto a cui è associato il Cronoprogramma 
	 * @return
	 */
	public Progetto getProgetto() {
		return progetto;
	}
	/**
	 * imposta il Progetto a cui è associato il Cronoprogramma.
	 * Per l'inserimento di un cronoprogramma basta impostare l'uid.
	 */
	public void setProgetto(Progetto progetto) {
		this.progetto = progetto;
	}
	public Boolean getUsatoPerFpv() {
		return usatoPerFpv;
	}
	public void setUsatoPerFpv(Boolean usatoPerFpv) {
		this.usatoPerFpv = usatoPerFpv;
	}
	
	/**
	 * @return the usatoPerFpvProv
	 */
	public Boolean getUsatoPerFpvProv() {
		return usatoPerFpvProv;
	}
	/**
	 * @param usatoPerFpvProv the usatoPerFpvProv to set
	 */
	public void setUsatoPerFpvProv(Boolean usatoPerFpvProv) {
		this.usatoPerFpvProv = usatoPerFpvProv;
	}
	/**
	 * @return the cronoprogrammaDaDefinire
	 */
	public Boolean getCronoprogrammaDaDefinire() {
		return cronoprogrammaDaDefinire;
	}
	/**
	 * @param cronoprogrammaDaDefinire the cronoprogrammaDaDefinire to set
	 */
	public void setCronoprogrammaDaDefinire(Boolean cronoprogrammaDaDefinire) {
		this.cronoprogrammaDaDefinire = cronoprogrammaDaDefinire;
	}
	/**
	 * @return the dataApprovazioneFattibilita
	 */
	public Date getDataApprovazioneFattibilita() {
		return dataApprovazioneFattibilita;
	}
	/**
	 * @param dataApprovazioneFattibilita the dataApprovazioneFattibilita to set
	 */
	public void setDataApprovazioneFattibilita(Date dataApprovazioneFattibilita) {
		this.dataApprovazioneFattibilita = dataApprovazioneFattibilita;
	}
	/**
	 * @return the dataApprovazioneProgettoDefinitivo
	 */
	public Date getDataApprovazioneProgettoDefinitivo() {
		return dataApprovazioneProgettoDefinitivo;
	}
	/**
	 * @param dataApprovazioneProgettoDefinitivo the dataApprovazioneProgettoDefinitivo to set
	 */
	public void setDataApprovazioneProgettoDefinitivo(Date dataApprovazioneProgettoDefinitivo) {
		this.dataApprovazioneProgettoDefinitivo = dataApprovazioneProgettoDefinitivo;
	}
	/**
	 * @return the dataApprovazioneProgrettoEsecutivo
	 */
	public Date getDataApprovazioneProgettoEsecutivo() {
		return dataApprovazioneProgettoEsecutivo;
	}
	
	/**
	 * Sets the data approvazione progetto esecutivo.
	 *
	 * @param dataApprovazioneProgettoEsecutivo the new data approvazione progetto esecutivo
	 */
	public void setDataApprovazioneProgettoEsecutivo(Date dataApprovazioneProgettoEsecutivo) {
		this.dataApprovazioneProgettoEsecutivo = dataApprovazioneProgettoEsecutivo;
	}
	/**
	 * @return the dataAvvioProcedura
	 */
	public Date getDataAvvioProcedura() {
		return dataAvvioProcedura;
	}
	/**
	 * @param dataAvvioProcedura the dataAvvioProcedura to set
	 */
	public void setDataAvvioProcedura(Date dataAvvioProcedura) {
		this.dataAvvioProcedura = dataAvvioProcedura;
	}
	/**
	 * @return the dataAggiudicazioneLavori
	 */
	public Date getDataAggiudicazioneLavori() {
		return dataAggiudicazioneLavori;
	}
	/**
	 * @param dataAggiudicazioneLavori the dataAggiudicazioneLavori to set
	 */
	public void setDataAggiudicazioneLavori(Date dataAggiudicazioneLavori) {
		this.dataAggiudicazioneLavori = dataAggiudicazioneLavori;
	}
	/**
	 * @return the dataInizioLavori
	 */
	public Date getDataInizioLavori() {
		return dataInizioLavori;
	}
	/**
	 * @param dataInizioLavori the dataInizioLavori to set
	 */
	public void setDataInizioLavori(Date dataInizioLavori) {
		this.dataInizioLavori = dataInizioLavori;
	}
	/**
	 * @return the dataFineLavori
	 */
	public Date getDataFineLavori() {
		return dataFineLavori;
	}
	/**
	 * @param dataFineLavori the dataFineLavori to set
	 */
	public void setDataFineLavori(Date dataFineLavori) {
		this.dataFineLavori = dataFineLavori;
	}
	/**
	 * @return the dataCollaudo
	 */
	public Date getDataCollaudo() {
		return dataCollaudo;
	}
	/**
	 * @param dataCollaudo the dataCollaudo to set
	 */
	public void setDataCollaudo(Date dataCollaudo) {
		this.dataCollaudo = dataCollaudo;
	}
	/**
	 * @return the gestioneQuadroEconomico
	 */
	public Boolean getGestioneQuadroEconomico() {
		return gestioneQuadroEconomico;
	}
	/**
	 * @param gestioneQuadroEconomico the gestioneQuadroEconomico to set
	 */
	public void setGestioneQuadroEconomico(Boolean gestioneQuadroEconomico) {
		this.gestioneQuadroEconomico = gestioneQuadroEconomico;
	}
	/**
	 * @return the attoAmministrativo
	 */
	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}
	/**
	 * @param attoAmministrativo the attoAmministrativo to set
	 */
	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}
	
	
	
//	
//	
//	/**
//	 * Gets the giorni durata.
//	 *
//	 * @return the giorni durata
//	 */
//	public int getGiorniDurata() {
//		if(getDataInizioLavori() == null || getDataFineLavori() == null) {
//			return 0;
//		}
//		long diff = getDataInizioLavori().getTime() - getDataFineLavori().getTime();
//		 // Conversions from finer to coarser granularities truncate, so lose precision. 
//		//For example converting 999 milliseconds to seconds results in 0. Use  
//		Long tempoTrascorso = Long.valueOf(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
//		return tempoTrascorso.intValue();
//	}
	
	/**
	 * @return the durataInGiorni
	 */
	public Integer getDurataInGiorni() {
		return durataInGiorni;
	}
	/**
	 * @param durataInGiorni the durataInGiorni to set
	 */
	public void setDurataInGiorni(Integer durataInGiorni) {
		this.durataInGiorni = durataInGiorni;
	}
	/**
	 * Restituisce l'elenco degli anni di tutti i dettagli di uscita
	 * 
	 * @return
	 */
	public List<Integer> getAnniEntrataEUscita() {
		final SortedSet<Integer> anni = getAnniSortedSetUscita(getCapitoliUscita());		
		anni.addAll(getAnniSortedSetEntrata(getCapitoliEntrata()));
		
		return new ArrayList<Integer>(anni);
		
	}
	
	/**
	 * Restituisce l'elenco degli anni di tutti i dettagli di uscita
	 * 
	 * @return
	 */
	public List<Integer> getAnniUscita() {
		return getAnniUscita(getCapitoliUscita());
	}
	
	/**
	 * Restituisce l'elenco degli anni di tutti i dettagli di entrata
	 * 
	 * @return
	 */
	public List<Integer> getAnniEntrata() {
		return getAnniEntrata(getCapitoliEntrata());
	}
	
	protected List<Integer> getAnniEntrata(List<DettaglioEntrataCronoprogramma> dettagli) {
		final SortedSet<Integer> s = getAnniSortedSetEntrata(dettagli);
		return new ArrayList<Integer>(s);
	}
	
	private SortedSet<Integer> getAnniSortedSetEntrata(List<DettaglioEntrataCronoprogramma> dettagli) {
		final SortedSet<Integer> s = new TreeSet<Integer>();
		if(dettagli!=null){
			for(DettaglioEntrataCronoprogramma dett : dettagli) {
				if(dett.getAnnoCompetenza() != null) {
					s.add(dett.getAnnoCompetenza());
				}
			}
		}
		return s;
	}
	
	protected List<Integer> getAnniUscita(List<DettaglioUscitaCronoprogramma> dettagli) {
		final SortedSet<Integer> s = getAnniSortedSetUscita(dettagli);
		return new ArrayList<Integer>(s);
	}
	
	private SortedSet<Integer> getAnniSortedSetUscita(List<DettaglioUscitaCronoprogramma> dettagli) {
		final SortedSet<Integer> s = new TreeSet<Integer>();
		if(dettagli!=null){
			for(DettaglioUscitaCronoprogramma dett : dettagli) {
				if(dett.getAnnoCompetenza() != null) {
					s.add(dett.getAnnoCompetenza());
				}
				if(dett.getAnnoEntrata() != null) {
					s.add(dett.getAnnoEntrata());
				}
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
		String inputString1 = "23/01/1997";
		String inputString2 = "27/01/1997";

		try {
		    Date date1 = myFormat.parse(inputString1);
		    Date date2 = myFormat.parse(inputString2);
		    long diff = date2.getTime() - date1.getTime();
		    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
