/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.mutuo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * I campi riguardante l'atto amministrativo, fanno riferimento al Provvediemnto; 
 * Per ogni mutuo &eacute; possibile trovare una lista di voci di mutuo collegata, interfacciata col il paramentro listaVociMutuo.
 *  @author
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Mutuo extends Entita {

	/**
	 * 
	 */
	private static final long serialVersionUID = -514956087170256276L;
	
	private Integer idMutuo;
	private String codiceMutuo;
	
	private String descrizioneMutuo;
	private Integer durataMutuo;
	private String noteMutuo;
	
	// numero di repertorio assegnato al mutuo da banca/notaio
	private String numeroRegistrazioneMutuo;

	/*
	 * Il disponibile sul mutuo e' calcolato come l'importo attuale del mutuo
	 * decrementato di volta in volta dalle voci di mutuo inserite per finanziare gli impegni.
	 * 
	 * La sommatoria degli importi delle voci di mutuo fornisce quindi il totale impegnato:
	 * disponibileMutuo = (importoAttualeMutuo - totaleImpegnatoVoci)
	 * 
	 */
	private BigDecimal disponibileMutuo;
	private BigDecimal totaleImpegnato;
	private BigDecimal importoInizialeMutuo;
	private BigDecimal importoAttualeMutuo;

	private Date dataInizioMutuo;
	
	// Calcolata come dataInizioMutuo + durataMutuo
	private Date dataFineMutuo;
	
	private Date dataInizioValidita;
	private Date dataFineValidita;
	private Date dataCreazione;
	private Date dataModifica;
	private Date dataCancellazione;
	
	private String loginCancellazione;
	private String loginCreazione;
	private String loginModifica;
	
	// da verificare successivamente quando avremo la tavola sul db (siac_d_mutuo_stato)
	private StatoOperativoMutuo statoOperativoMutuo;
	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum StatoOperativoMutuo{
		DEFINITIVO, ANNULLATO, PROVVISORIO, ESTINTO
	}
	private ClassificatoreGenerico classificatoreStatoOperativoMutuo;
	private Integer idStatoOperativoMutuo;
	private Date dataStatoOperativoMutuo;	
		
	// da verificare successivamente quando avremo la tavola sul db (siac_d_mutuo_tipo)
	private TipoMutuo tipoMutuo;
	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum TipoMutuo{
		RIS, AVL, BOC, FID, GAR, PRE
	}
	private ClassificatoreGenerico classificatoreTipoMutuo;
	private String idTipoMutuo;
	private String descrizioneTipoMutuo;
	
	private Soggetto soggettoMutuo;
	private Integer idSoggettoMutuo;
	private String codiceSoggettoMutuo;
	
	private AttoAmministrativo attoAmministrativoMutuo;
	private Integer idAttoAmministrativoMutuo;
	private Integer annoAttoAmministrativoMutuo;
	private Integer numeroAttoAmministrativoMutuo;
	
	private List<VoceMutuo> listaVociMutuo;
	private VoceMutuo totaleVociMutuo;

	public String getDescrizioneMutuo() {
		return descrizioneMutuo;
	}

	public void setDescrizioneMutuo(String descrizioneMutuo) {
		this.descrizioneMutuo = descrizioneMutuo;
	}

	public String getNoteMutuo() {
		return noteMutuo;
	}

	public void setNoteMutuo(String noteMutuo) {
		this.noteMutuo = noteMutuo;
	}

	public String getNumeroRegistrazioneMutuo() {
		return numeroRegistrazioneMutuo;
	}

	public void setNumeroRegistrazioneMutuo(String numeroRegistrazioneMutuo) {
		this.numeroRegistrazioneMutuo = numeroRegistrazioneMutuo;
	}

	public BigDecimal getDisponibileMutuo() {
		return disponibileMutuo;
	}

	public void setDisponibileMutuo(BigDecimal disponibileMutuo) {
		this.disponibileMutuo = disponibileMutuo;
	}

	public BigDecimal getImportoInizialeMutuo() {
		return importoInizialeMutuo;
	}

	public void setImportoInizialeMutuo(BigDecimal importoInizialeMutuo) {
		this.importoInizialeMutuo = importoInizialeMutuo;
	}

	public BigDecimal getImportoAttualeMutuo() {
		return importoAttualeMutuo;
	}

	public void setImportoAttualeMutuo(BigDecimal importoAttualeMutuo) {
		this.importoAttualeMutuo = importoAttualeMutuo;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataInizioMutuo() {
		return dataInizioMutuo;
	}

	public void setDataInizioMutuo(Date dataInizioMutuo) {
		this.dataInizioMutuo = dataInizioMutuo;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataFineMutuo() {
		return dataFineMutuo;
	}

	public void setDataFineMutuo(Date dataFineMutuo) {
		this.dataFineMutuo = dataFineMutuo;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataInizioValidita() {
		return dataInizioValidita;
	}

	public void setDataInizioValidita(Date dataInizioValidita) {
		this.dataInizioValidita = dataInizioValidita;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataFineValidita() {
		return dataFineValidita;
	}

	public void setDataFineValidita(Date dataFineValidita) {
		this.dataFineValidita = dataFineValidita;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataModifica() {
		return dataModifica;
	}

	public void setDataModifica(Date dataModifica) {
		this.dataModifica = dataModifica;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataCancellazione() {
		return dataCancellazione;
	}

	public void setDataCancellazione(Date dataCancellazione) {
		this.dataCancellazione = dataCancellazione;
	}

	public String getLoginCancellazione() {
		return loginCancellazione;
	}

	public void setLoginCancellazione(String loginCancellazione) {
		this.loginCancellazione = loginCancellazione;
	}

	public String getLoginCreazione() {
		return loginCreazione;
	}

	public void setLoginCreazione(String loginCreazione) {
		this.loginCreazione = loginCreazione;
	}

	public String getLoginModifica() {
		return loginModifica;
	}

	public void setLoginModifica(String loginModifica) {
		this.loginModifica = loginModifica;
	}

	public StatoOperativoMutuo getStatoOperativoMutuo() {
		return statoOperativoMutuo;
	}

	public void setStatoOperativoMutuo(StatoOperativoMutuo statoOperativoMutuo) {
		this.statoOperativoMutuo = statoOperativoMutuo;
	}

	public TipoMutuo getTipoMutuo() {
		return tipoMutuo;
	}

	public void setTipoMutuo(TipoMutuo tipoMutuo) {
		this.tipoMutuo = tipoMutuo;
	}

	public Soggetto getSoggettoMutuo() {
		return soggettoMutuo;
	}

	public void setSoggettoMutuo(Soggetto soggettoMutuo) {
		this.soggettoMutuo = soggettoMutuo;
	}

	public AttoAmministrativo getAttoAmministrativoMutuo() {
		return attoAmministrativoMutuo;
	}

	public void setAttoAmministrativoMutuo(
			AttoAmministrativo attoAmministrativoMutuo) {
		this.attoAmministrativoMutuo = attoAmministrativoMutuo;
	}

	public List<VoceMutuo> getListaVociMutuo() {
		return listaVociMutuo;
	}

	public void setListaVociMutuo(List<VoceMutuo> listaVociMutuo) {
		this.listaVociMutuo = listaVociMutuo;
	}

	public String getCodiceMutuo() {
		return codiceMutuo;
	}

	public void setCodiceMutuo(String codiceMutuo) {
		this.codiceMutuo = codiceMutuo;
	}

	public Integer getIdStatoOperativoMutuo() {
		return idStatoOperativoMutuo;
	}

	public void setIdStatoOperativoMutuo(Integer idStatoOperativoMutuo) {
		this.idStatoOperativoMutuo = idStatoOperativoMutuo;
	}

	public Date getDataStatoOperativoMutuo() {
		return dataStatoOperativoMutuo;
	}

	public void setDataStatoOperativoMutuo(Date dataStatoOperativoMutuo) {
		this.dataStatoOperativoMutuo = dataStatoOperativoMutuo;
	}

	public void setDurataMutuo(Integer durataMutuo) {
		this.durataMutuo = durataMutuo;
	}

	public Integer getDurataMutuo() {
		return durataMutuo;
	}

	public void setIdAttoAmministrativoMutuo(Integer idAttoAmministrativo) {
		this.idAttoAmministrativoMutuo = idAttoAmministrativo;
	}

	public Integer getIdAttoAmministrativoMutuo() {
		return idAttoAmministrativoMutuo;
	}

	public Integer getIdSoggettoMutuo() {
		return idSoggettoMutuo;
	}

	public void setIdSoggettoMutuo(Integer idSoggettoMutuo) {
		this.idSoggettoMutuo = idSoggettoMutuo;
	}

	public Integer getIdMutuo() {
		return idMutuo;
	}

	public void setIdMutuo(Integer idMutuo) {
		this.idMutuo = idMutuo;
	}

	public ClassificatoreGenerico getClassificatoreStatoOperativoMutuo() {
		return classificatoreStatoOperativoMutuo;
	}

	public void setClassificatoreStatoOperativoMutuo(
			ClassificatoreGenerico classificatoreStatoOperativoMutuo) {
		this.classificatoreStatoOperativoMutuo = classificatoreStatoOperativoMutuo;
	}

	public ClassificatoreGenerico getClassificatoreTipoMutuo() {
		return classificatoreTipoMutuo;
	}

	public void setClassificatoreTipoMutuo(
			ClassificatoreGenerico classificatoreTipoMutuo) {
		this.classificatoreTipoMutuo = classificatoreTipoMutuo;
	}

	public Integer getAnnoAttoAmministrativoMutuo() {
		return annoAttoAmministrativoMutuo;
	}

	public void setAnnoAttoAmministrativoMutuo(Integer annoAttoAmministrativoMutuo) {
		this.annoAttoAmministrativoMutuo = annoAttoAmministrativoMutuo;
	}

	public Integer getNumeroAttoAmministrativoMutuo() {
		return numeroAttoAmministrativoMutuo;
	}

	public void setNumeroAttoAmministrativoMutuo(
			Integer numeroAttoAmministrativoMutuo) {
		this.numeroAttoAmministrativoMutuo = numeroAttoAmministrativoMutuo;
	}

	public String getCodiceSoggettoMutuo() {
		return codiceSoggettoMutuo;
	}

	public void setCodiceSoggettoMutuo(String codiceSoggettoMutuo) {
		this.codiceSoggettoMutuo = codiceSoggettoMutuo;
	}

	public String getDescrizioneTipoMutuo() {
		return descrizioneTipoMutuo;
	}

	public void setDescrizioneTipoMutuo(String descrizioneTipoMutuo) {
		this.descrizioneTipoMutuo = descrizioneTipoMutuo;
	}

	public String getIdTipoMutuo() {
		return idTipoMutuo;
	}

	public void setIdTipoMutuo(String idTipoMutuo) {
		this.idTipoMutuo = idTipoMutuo;
	}

	public BigDecimal getTotaleImpegnato() {
		return totaleImpegnato;
	}

	public void setTotaleImpegnato(BigDecimal totaleImpegnato) {
		this.totaleImpegnato = totaleImpegnato;
	}

	public VoceMutuo getTotaleVociMutuo() {
		return totaleVociMutuo;
	}

	public void setTotaleVociMutuo(VoceMutuo totaleVociMutuo) {
		this.totaleVociMutuo = totaleVociMutuo;
	}	
}