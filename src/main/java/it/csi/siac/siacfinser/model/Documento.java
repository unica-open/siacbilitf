/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * Documento
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public abstract class Documento extends Entita {

	private static final long serialVersionUID = 6545987887830432475L;
	private int anno;
	private Date dataEmissione;
	private Date dataScadenza;
	private String descrizione;
	private String fonte;
	private String note;
	private int numero;
	private String riferimentoEsterno;
	private Protocollo protocollo;
	private AttoAmministrativo atto;
	private Soggetto soggetto;
	private TipoDocumento tipoDocumento;

	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum StatoOperativoDocumento {
		INCOMPLETO, VALIDO, LIQUIDATO, PARZIALMENTE_LIQUIDATO, PARZIALMENTE_EMESSO, EMESSO, ANNULLATO
	}

	@XmlSchemaType(name = "date")
	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	@XmlSchemaType(name = "date")
	public Date getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(Date dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	@XmlSchemaType(name = "date")
	public Date getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRiferimentoEsterno() {
		return riferimentoEsterno;
	}

	public void setRiferimentoEsterno(String riferimentoEsterno) {
		this.riferimentoEsterno = riferimentoEsterno;
	}

	public Protocollo getProtocollo() {
		return protocollo;
	}

	public void setProtocollo(Protocollo protocollo) {
		this.protocollo = protocollo;
	}

	public AttoAmministrativo getAtto() {
		return atto;
	}

	public void setAtto(AttoAmministrativo atto) {
		this.atto = atto;
	}

	public Soggetto getSoggetto() {
		return soggetto;
	}

	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

}
