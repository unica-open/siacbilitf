/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siaccorser.model.file.File;
import it.csi.siac.siacfin2ser.model.AllegatoAtto;

/**
 * @author 552
 * @version 1.0
 * @created 06-mar-2015 16.27.46
 */
@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class StampeCassaFile extends Entita {

	/**per serializzazione */
	private static final long serialVersionUID = -7601419756528226723L;
	
	private Ente ente;
	
	private Integer annoEsercizio;
	private String codice;
	private String descrizione;

	//stampaStato
	private TipoStampa tipoStampa;
	//stampaTipo
	private TipoDocumento tipoDocumento;
	
	private Bilancio bilancio;
	

	private StampaRendiconto stampaRendiconto;
	private StampaGiornale stampaGiornale;
	private Integer numeroMovimento;
	
	private List<OperazioneCassa> operazioniCassa = new ArrayList<OperazioneCassa>();
	private List<Movimento> movimenti = new ArrayList<Movimento>();
	
	
	private CassaEconomale cassaEconomale;
	
	//private File file;
	private List<File> files = new ArrayList<File>();

	// SIAC-4799
	private AllegatoAtto allegatoAtto;

	
	
	
	/**
	 * @return the cassaEconomale
	 */
	public CassaEconomale getCassaEconomale() {
		return cassaEconomale;
	}

	/**
	 * @param cassaEconomale the cassaEconomale to set
	 */
	public void setCassaEconomale(CassaEconomale cassaEconomale) {
		this.cassaEconomale = cassaEconomale;
	}

	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	/**
	 * @return the tipoStampa
	 */
	public TipoStampa getTipoStampa() {
		return tipoStampa;
	}

	/**
	 * @param tipoStampa the tipoStampa to set
	 */
	public void setTipoStampa(TipoStampa tipoStampa) {
		this.tipoStampa = tipoStampa;
	}

	/**
	 * @return the tipoDocumento
	 */
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the files
	 */
	public List<File> getFiles() {
		return files;
	}

	/**
	 * @param files the files to set
	 */
	public void setFiles(List<File> files) {
		this.files = files;
	}

	/**
	 * @return the stampaGiornale
	 */
	public StampaGiornale getStampaGiornale() {
		return stampaGiornale;
	}

	/**
	 * @param stampaGiornale the stampaGiornale to set
	 */
	public void setStampaGiornale(StampaGiornale stampaGiornale) {
		this.stampaGiornale = stampaGiornale;
	}

	/**
	 * @return the stampaRendiconto
	 */
	public StampaRendiconto getStampaRendiconto() {
		return stampaRendiconto;
	}

	/**
	 * @param stampaRendiconto the stampaRendiconto to set
	 */
	public void setStampaRendiconto(StampaRendiconto stampaRendiconto) {
		this.stampaRendiconto = stampaRendiconto;
	}

	/**
	 * @return the annoEsercizio
	 */
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}

	/**
	 * @param annoEsercizio the annoEsercizio to set
	 */
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	/**
	 * @return the operazioniCassa
	 */
	public List<OperazioneCassa> getOperazioniCassa() {
		return operazioniCassa;
	}

	/**
	 * @return the numeroMovimento
	 */
	public Integer getNumeroMovimento() {
		return numeroMovimento;
	}

	/**
	 * @param numeroMovimento the numeroMovimento to set
	 */
	public void setNumeroMovimento(Integer numeroMovimento) {
		this.numeroMovimento = numeroMovimento;
	}

	/**
	 * @param operazioniCassa the operazioniCassa to set
	 */
	public void setOperazioniCassa(List<OperazioneCassa> operazioniCassa) {
		this.operazioniCassa = operazioniCassa != null ? operazioniCassa : new ArrayList<OperazioneCassa>();
	}
	
	public void addOperazioneCassa(OperazioneCassa operazioneCassa) {
		getOperazioniCassa().add(operazioneCassa);
	}

	/**
	 * @return the movimenti
	 */
	public List<Movimento> getMovimenti() {
		return movimenti;
	}

	/**
	 * @param movimenti the movimenti to set
	 */
	public void setMovimenti(List<Movimento> movimenti) {
		this.movimenti = movimenti != null ? movimenti : new ArrayList<Movimento>();
	}

	public void addMovimento(Movimento movimento) {
		getMovimenti().add(movimento);
	}
	
	/**
	 * @return the allegatoAtto
	 */
	public AllegatoAtto getAllegatoAtto() {
		return allegatoAtto;
	}

	/**
	 * @param allegatoAtto the allegatoAtto to set
	 */
	public void setAllegatoAtto(AllegatoAtto allegatoAtto) {
		this.allegatoAtto = allegatoAtto;
	}
	
	// Workaround JAXB
	
	/**
	 * @return the dataCreazioneRichiestaEconomale
	 */
	public Date getDataCreazioneStampeCassaFile() {
		return getDataCreazione();
	}
	/**
	 * @return the dataCreazioneRichiestaEconomale to set
	 */
	public void setDataCreazioneStampeCassaFile(Date dataCreazione) {
		setDataCreazione(dataCreazione);
	}


}