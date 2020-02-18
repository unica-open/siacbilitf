/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.mutuo;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * 
 *  @author
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class VariazioneImportoVoceMutuo extends Entita {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9160027673900366361L;

	private BigDecimal idVariazioneVoceMutuo;
	private BigDecimal numeroVariazioneVoceMutuo;

	private BigDecimal importoVariazioneVoceMutuo;
	private Date dataInserimentoVariazioneVoceMutuo;
	
	private Date dataInizioValidita;
	private Date dataFineValidita;
	private Date dataCreazione;
	private Date dataModifica;
	private Date dataCancellazione;
	
	private String loginCancellazione;
	private String loginCreazione;
	private String loginModifica;

	// da verificare successivamente quando avremo la tavola sul db (siac_d_mutuo_var_tipo)
	private TipoVariazioneImportoVoceMutuo tipoVariazioneImportoVoceMutuo;
	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum TipoVariazioneImportoVoceMutuo{
		ECONOMIA, RIDUZIONE, STORNO, A_RESIDUO, RETTIFICA
	}
	
	private ClassificatoreGenerico tipoVariazioneImportoVoceMutuoClassificatore;
	
	public BigDecimal getNumeroVariazioneVoceMutuo() {
		return numeroVariazioneVoceMutuo;
	}
	
	public void setNumeroVariazioneVoceMutuo(BigDecimal numeroVariazioneVoceMutuo) {
		this.numeroVariazioneVoceMutuo = numeroVariazioneVoceMutuo;
	}
	
	public BigDecimal getImportoVariazioneVoceMutuo() {
		return importoVariazioneVoceMutuo;
	}
	
	public void setImportoVariazioneVoceMutuo(BigDecimal importoVariazioneVoceMutuo) {
		this.importoVariazioneVoceMutuo = importoVariazioneVoceMutuo;
	}
	
	@XmlSchemaType(name = "dateTime")
	public Date getDataInserimentoVariazioneVoceMutuo() {
		return dataInserimentoVariazioneVoceMutuo;
	}
	
	public void setDataInserimentoVariazioneVoceMutuo(
			Date dataInserimentoVariazioneVoceMutuo) {
		this.dataInserimentoVariazioneVoceMutuo = dataInserimentoVariazioneVoceMutuo;
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
	
	public TipoVariazioneImportoVoceMutuo getTipoVariazioneImportoVoceMutuo() {
		return tipoVariazioneImportoVoceMutuo;
	}
	
	public void setTipoVariazioneImportoVoceMutuo(
			TipoVariazioneImportoVoceMutuo tipoVariazioneImportoVoceMutuo) {
		this.tipoVariazioneImportoVoceMutuo = tipoVariazioneImportoVoceMutuo;
	}

	public ClassificatoreGenerico getTipoVariazioneImportoVoceMutuoClassificatore() {
		return tipoVariazioneImportoVoceMutuoClassificatore;
	}

	public void setTipoVariazioneImportoVoceMutuoClassificatore(
			ClassificatoreGenerico tipoVariazioneImportoVoceMutuoClassificatore) {
		this.tipoVariazioneImportoVoceMutuoClassificatore = tipoVariazioneImportoVoceMutuoClassificatore;
	}

	public BigDecimal getIdVariazioneVoceMutuo() {
		return idVariazioneVoceMutuo;
	}

	public void setIdVariazioneVoceMutuo(BigDecimal idVariazioneVoceMutuo) {
		this.idVariazioneVoceMutuo = idVariazioneVoceMutuo;
	}
}
