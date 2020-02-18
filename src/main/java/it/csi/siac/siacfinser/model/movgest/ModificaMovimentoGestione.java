/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.movgest;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.MovimentoGestione;
import it.csi.siac.siacfinser.model.codifiche.ClasseSoggetto;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * ModificaMovimentoGestione
 * 
 */

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ModificaMovimentoGestione extends MovimentoGestione {
	
	private static final long serialVersionUID = -4842933560589007498L;
	
	private static final String CODICE_ROR_DA_MANTENERE="RORM";

	private int idModificaMovimentoGestione;
	private int numeroModificaMovimentoGestione;
	private String descrizioneModificaMovimentoGestione;
	private Date dataModificaMovimentoGestione;
	//private Date dataEmissione;
	//private Date dataAnnullamento;
	
	private boolean reimputazione;
	private Integer annoReimputazione;
	
	private BigDecimal importoOld;
	private BigDecimal importoNew;
	
	private Soggetto soggettoNewMovimentoGestione;
	private ClasseSoggetto classeSoggettoNewMovimentoGestione;
	private Soggetto soggettoOldMovimentoGestione;
	private ClasseSoggetto classeSoggettoOldMovimentoGestione;
	
	private String newSoggettoCodeMovimentoGestione;
	private int idClasseSoggettoNewMovimentoGestione;
	private String oldSoggettoCodeMovimentoGestione;
	private int idClasseSoggettoOldMovimentoGestione;
	
	private String attoAmministrativoAnno;
	private Integer attoAmministrativoNumero;
	private String attoAmministrativoTipoCode;
	
	private StatoOperativoModificaMovimentoGestione statoOperativoModificaMovimentoGestione;
	private String codiceStatoOperativoModificaMovimentoGestione; 
	
	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum StatoOperativoModificaMovimentoGestione{
		VALIDO, ANNULLATO
	}

//	private TipoModificaMovimentoGestione tipoModificaMovimentoGestione;
//	@XmlType(namespace = FINDataDictionary.NAMESPACE)
//	public enum TipoModificaMovimentoGestione{IMP, SIM, RIAC, ECON, RIU}
	private String tipoModificaMovimentoGestione;
	
	public int getNumeroModificaMovimentoGestione() {
		return numeroModificaMovimentoGestione;
	}

	public void setNumeroModificaMovimentoGestione(
			int numeroModificaMovimentoGestione) {
		this.numeroModificaMovimentoGestione = numeroModificaMovimentoGestione;
	}

	public String getDescrizioneModificaMovimentoGestione() {
		return descrizioneModificaMovimentoGestione;
	}

	public void setDescrizioneModificaMovimentoGestione(String descrizione) {
		this.descrizioneModificaMovimentoGestione = descrizione;
	}
	
	
	/**
	 * Checks if is modifica di importo.
	 *
	 * @return true, if is modifica di importo
	 */
	public boolean isModificaDiImporto(){
		boolean isModificaRORM = getTipoModificaMovimentoGestione() != null && CODICE_ROR_DA_MANTENERE.equalsIgnoreCase(getTipoModificaMovimentoGestione());
		boolean isImportoZero = this.getImportoOld() != null && BigDecimal.ZERO.compareTo(this.getImportoOld()) == 0; 
		//importo dell movgest precedente alla modifica + importo modifica
		return this.getImportoNew()!=null
				//importo old = importo della modifica
				&& this.getImportoOld() != null
				//SIAC -6586: modifiche di tipo ROR da mantenere devono avere importo zero
				&& ((isModificaRORM && isImportoZero) || !isImportoZero)
				&& !isModificaDiSoggetto()
			;
	}
	
	
	/**
	 * Checks if is modifica di soggetto.
	 *
	 * @return true, if is modifica di soggetto
	 */
	public boolean isModificaDiSoggetto(){
		return this.getSoggettoNewMovimentoGestione() != null
				|| this.getClasseSoggettoNewMovimentoGestione() != null;
	}

//	@XmlSchemaType(name = "dateTime")
//	public Date getDataEmissione() {
//		return dataEmissione;
//	}
//
//	public void setDataEmissione(Date dataEmissione) {
//		this.dataEmissione = dataEmissione;
//	}

//	@XmlSchemaType(name = "dateTime")
//	public Date getDataAnnullamento() {
//		return dataAnnullamento;
//	}
//
//	public void setDataAnnullamento(Date dataAnnullamento) {
//		this.dataAnnullamento = dataAnnullamento;
//	}

	public BigDecimal getImportoNew() {
		return importoNew;
	}

	public void setImportoNew(BigDecimal importo) {
		this.importoNew = importo;
	}

	public int getIdModificaMovimentoGestione() {
		return idModificaMovimentoGestione;
	}

	public void setIdModificaMovimentoGestione(int idModificaMovimentoGestione) {
		this.idModificaMovimentoGestione = idModificaMovimentoGestione;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataModificaMovimentoGestione() {
		return dataModificaMovimentoGestione;
	}

	public void setDataModificaMovimentoGestione(Date dataModificaMovimentoGestione) {
		this.dataModificaMovimentoGestione = dataModificaMovimentoGestione;
	}

	public StatoOperativoModificaMovimentoGestione getStatoOperativoModificaMovimentoGestione() {
		return statoOperativoModificaMovimentoGestione;
	}

	public void setStatoOperativoModificaMovimentoGestione(
			StatoOperativoModificaMovimentoGestione statoOperativoModificaMovimentoGestione) {
		this.statoOperativoModificaMovimentoGestione = statoOperativoModificaMovimentoGestione;
	}

	public BigDecimal getImportoOld() {
		return importoOld;
	}

	public void setImportoOld(BigDecimal importoOld) {
		this.importoOld = importoOld;
	}

	public Soggetto getSoggettoNewMovimentoGestione() {
		return soggettoNewMovimentoGestione;
	}

	public void setSoggettoNewMovimentoGestione(
			Soggetto soggettoNewMovimentoGestione) {
		this.soggettoNewMovimentoGestione = soggettoNewMovimentoGestione;
	}

	public ClasseSoggetto getClasseSoggettoNewMovimentoGestione() {
		return classeSoggettoNewMovimentoGestione;
	}

	public void setClasseSoggettoNewMovimentoGestione(
			ClasseSoggetto classeSoggettoNewMovimentoGestione) {
		this.classeSoggettoNewMovimentoGestione = classeSoggettoNewMovimentoGestione;
	}

	public Soggetto getSoggettoOldMovimentoGestione() {
		return soggettoOldMovimentoGestione;
	}

	public void setSoggettoOldMovimentoGestione(
			Soggetto soggettoOldMovimentoGestione) {
		this.soggettoOldMovimentoGestione = soggettoOldMovimentoGestione;
	}

	public ClasseSoggetto getClasseSoggettoOldMovimentoGestione() {
		return classeSoggettoOldMovimentoGestione;
	}

	public void setClasseSoggettoOldMovimentoGestione(
			ClasseSoggetto classeSoggettoOldMovimentoGestione) {
		this.classeSoggettoOldMovimentoGestione = classeSoggettoOldMovimentoGestione;
	}

	public int getIdClasseSoggettoNewMovimentoGestione() {
		return idClasseSoggettoNewMovimentoGestione;
	}

	public void setIdClasseSoggettoNewMovimentoGestione(
			int idClasseSoggettoNewMovimentoGestione) {
		this.idClasseSoggettoNewMovimentoGestione = idClasseSoggettoNewMovimentoGestione;
	}

	public int getIdClasseSoggettoOldMovimentoGestione() {
		return idClasseSoggettoOldMovimentoGestione;
	}

	public void setIdClasseSoggettoOldMovimentoGestione(
			int idClasseSoggettoOldMovimentoGestione) {
		this.idClasseSoggettoOldMovimentoGestione = idClasseSoggettoOldMovimentoGestione;
	}

	public String getNewSoggettoCodeMovimentoGestione() {
		return newSoggettoCodeMovimentoGestione;
	}

	public void setNewSoggettoCodeMovimentoGestione(
			String newSoggettoCodeMovimentoGestione) {
		this.newSoggettoCodeMovimentoGestione = newSoggettoCodeMovimentoGestione;
	}

	public String getOldSoggettoCodeMovimentoGestione() {
		return oldSoggettoCodeMovimentoGestione;
	}

	public void setOldSoggettoCodeMovimentoGestione(
			String oldSoggettoCodeMovimentoGestione) {
		this.oldSoggettoCodeMovimentoGestione = oldSoggettoCodeMovimentoGestione;
	}

	public String getAttoAmministrativoAnno() {
		return attoAmministrativoAnno;
	}

	public void setAttoAmministrativoAnno(String attoAmministrativoAnno) {
		this.attoAmministrativoAnno = attoAmministrativoAnno;
	}

	public Integer getAttoAmministrativoNumero() {
		return attoAmministrativoNumero;
	}

	public void setAttoAmministrativoNumero(Integer attoAmministrativoNumero) {
		this.attoAmministrativoNumero = attoAmministrativoNumero;
	}

	public String getAttoAmministrativoTipoCode() {
		return attoAmministrativoTipoCode;
	}

	public void setAttoAmministrativoTipoCode(String attoAmministrativoTipoCode) {
		this.attoAmministrativoTipoCode = attoAmministrativoTipoCode;
	}

	public String getCodiceStatoOperativoModificaMovimentoGestione() {
		return codiceStatoOperativoModificaMovimentoGestione;
	}

	public void setCodiceStatoOperativoModificaMovimentoGestione(
			String codiceStatoOperativoModificaMovimentoGestione) {
		this.codiceStatoOperativoModificaMovimentoGestione = codiceStatoOperativoModificaMovimentoGestione;
	}

	public String getTipoModificaMovimentoGestione() {
		return tipoModificaMovimentoGestione;
	}

	public void setTipoModificaMovimentoGestione(String tipoModificaMovimentoGestione) {
		this.tipoModificaMovimentoGestione = tipoModificaMovimentoGestione;
	}

	public boolean isReimputazione() {
		return reimputazione;
	}

	public void setReimputazione(boolean reimputazione) {
		this.reimputazione = reimputazione;
	}

	public Integer getAnnoReimputazione() {
		return annoReimputazione;
	}

	public void setAnnoReimputazione(Integer annoReimputazione) {
		this.annoReimputazione = annoReimputazione;
	}
	
}
