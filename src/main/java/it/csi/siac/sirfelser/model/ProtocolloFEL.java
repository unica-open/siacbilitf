/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * ProtocolloFEL
 * 
 * @author Valentina
 * 
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class ProtocolloFEL extends Entita{
	
	private static final long serialVersionUID = -3230927765534800289L;

	private FatturaFEL fattura;
	private Ente ente;
	
	private String idClassificazione;
	private String indiceClassificazioneEstesa;
	private String oggetto;
	private String registroProtocollo;
	private String numeroProtocollo;
	private String annoProtocollo;
	private Date dataRegProtocollo;
	private String principalIdArchiviazione;
	
	/**
	 * @return the fattura
	 */
	public FatturaFEL getFattura() {
		return fattura;
	}
	/**
	 * @param fattura the fattura to set
	 */
	public void setFattura(FatturaFEL fattura) {
		this.fattura = fattura;
	}
	/**
	 * @return the idClassificazione
	 */
	public String getIdClassificazione() {
		return idClassificazione;
	}
	/**
	 * @param idClassificazione the idClassificazione to set
	 */
	public void setIdClassificazione(String idClassificazione) {
		this.idClassificazione = idClassificazione;
	}
	/**
	 * @return the indiceClassificazioneEstesa
	 */
	public String getIndiceClassificazioneEstesa() {
		return indiceClassificazioneEstesa;
	}
	/**
	 * @param indiceClassificazioneEstesa the indiceClassificazioneEstesa to set
	 */
	public void setIndiceClassificazioneEstesa(String indiceClassificazioneEstesa) {
		this.indiceClassificazioneEstesa = indiceClassificazioneEstesa;
	}
	/**
	 * @return the oggetto
	 */
	public String getOggetto() {
		return oggetto;
	}
	/**
	 * @param oggetto the oggetto to set
	 */
	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}
	/**
	 * @return the registroProtocollo
	 */
	public String getRegistroProtocollo() {
		return registroProtocollo;
	}
	/**
	 * @param registroProtocollo the registroProtocollo to set
	 */
	public void setRegistroProtocollo(String registroProtocollo) {
		this.registroProtocollo = registroProtocollo;
	}
	/**
	 * @return the numeroProtocollo
	 */
	public String getNumeroProtocollo() {
		return numeroProtocollo;
	}
	/**
	 * @param numeroProtocollo the numeroProtocollo to set
	 */
	public void setNumeroProtocollo(String numeroProtocollo) {
		this.numeroProtocollo = numeroProtocollo;
	}
	/**
	 * @return the annoProtocollo
	 */
	public String getAnnoProtocollo() {
		return annoProtocollo;
	}
	/**
	 * @param annoProtocollo the annoProtocollo to set
	 */
	public void setAnnoProtocollo(String annoProtocollo) {
		this.annoProtocollo = annoProtocollo;
	}
	/**
	 * @return the dataRegProtocollo
	 */
	public Date getDataRegProtocollo() {
		return dataRegProtocollo;
	}
	/**
	 * @param dataRegProtocollo the dataRegProtocollo to set
	 */
	public void setDataRegProtocollo(Date dataRegProtocollo) {
		this.dataRegProtocollo = dataRegProtocollo;
	}
	/**
	 * @return the principalIdArchiviazione
	 */
	public String getPrincipalIdArchiviazione() {
		return principalIdArchiviazione;
	}
	/**
	 * @param principalIdArchiviazione the principalIdArchiviazione to set
	 */
	public void setPrincipalIdArchiviazione(String principalIdArchiviazione) {
		this.principalIdArchiviazione = principalIdArchiviazione;
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
}
