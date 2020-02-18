/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.TipoAtto;
import it.csi.siac.siaccecser.model.TipoDocumento;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfinser.model.Distinta;
import it.csi.siac.siacfinser.model.provvisoriDiCassa.ProvvisorioDiCassa;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * The Class RicercaQuotaSpesa.
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaQuoteDaEmettereEntrata extends ServiceRequest {
	
	private Integer uidElenco;
	private Integer annoElenco;
	private Integer numeroElenco;
	private Integer numeroElencoDa;
	private Integer numeroElencoA;
	
	private Soggetto soggetto;
	
	private Integer uidProvvedimento;
	private Integer annoProvvedimento;
	private Integer numeroProvvedimento;
	private TipoAtto tipoAtto;
	private StrutturaAmministrativoContabile struttAmmContabile;
	
	private Integer annoCapitolo;
	private Integer numeroCapitolo;
	private Integer numeroArticolo;
	private Integer numeroUEB;
	private TipoDocumento tipoDocumento;
	
	private Boolean flagConvalidaManuale;
	
	private Distinta distinta;
	
	@XmlElementWrapper(name="listProvvisorioDiCassa")
	@XmlElement(name="provvisorioDiCassa")
	private List<ProvvisorioDiCassa> listProvvisorioDiCassa;
 
	
	private ParametriPaginazione parametriPaginazione;
	
	
	/**
	 * Gets the anno elenco.
	 *
	 * @return the anno elenco
	 */
	public Integer getAnnoElenco() {
		return annoElenco;
	}

	/**
	 * Sets the anno elenco.
	 *
	 * @param annoElenco the new anno elenco
	 */
	public void setAnnoElenco(Integer annoElenco) {
		this.annoElenco = annoElenco;
	}

	/**
	 * Gets the numero elenco.
	 *
	 * @return the numero elenco
	 */
	public Integer getNumeroElenco() {
		return numeroElenco;
	}

	/**
	 * Sets the numero elenco.
	 *
	 * @param numeroElenco the new numero elenco
	 */
	public void setNumeroElenco(Integer numeroElenco) {
		this.numeroElenco = numeroElenco;
	}

	/**
	 * Gets the soggetto.
	 *
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return soggetto;
	}

	/**
	 * Sets the soggetto.
	 *
	 * @param soggetto the new soggetto
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}

	/**
	 * Gets the anno provvedimento.
	 *
	 * @return the anno provvedimento
	 */
	public Integer getAnnoProvvedimento() {
		return annoProvvedimento;
	}

	/**
	 * Sets the anno provvedimento.
	 *
	 * @param annoProvvedimento the new anno provvedimento
	 */
	public void setAnnoProvvedimento(Integer annoProvvedimento) {
		this.annoProvvedimento = annoProvvedimento;
	}

	/**
	 * Gets the numero provvedimento.
	 *
	 * @return the numero provvedimento
	 */
	public Integer getNumeroProvvedimento() {
		return numeroProvvedimento;
	}

	/**
	 * Sets the numero provvedimento.
	 *
	 * @param numeroProvvedimento the new numero provvedimento
	 */
	public void setNumeroProvvedimento(Integer numeroProvvedimento) {
		this.numeroProvvedimento = numeroProvvedimento;
	}

	/**
	 * Gets the tipo atto.
	 *
	 * @return the tipo atto
	 */
	public TipoAtto getTipoAtto() {
		return tipoAtto;
	}

	/**
	 * Sets the tipo atto.
	 *
	 * @param tipoAtto the new tipo atto
	 */
	public void setTipoAtto(TipoAtto tipoAtto) {
		this.tipoAtto = tipoAtto;
	}

	/**
	 * Gets the strutt amm contabile.
	 *
	 * @return the strutt amm contabile
	 */
	public StrutturaAmministrativoContabile getStruttAmmContabile() {
		return struttAmmContabile;
	}

	/**
	 * Sets the strutt amm contabile.
	 *
	 * @param struttAmmContabile the new strutt amm contabile
	 */
	public void setStruttAmmContabile(StrutturaAmministrativoContabile struttAmmContabile) {
		this.struttAmmContabile = struttAmmContabile;
	}

	/**
	 * Gets the parametri paginazione.
	 *
	 * @return the parametri paginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	/**
	 * Sets the parametri paginazione.
	 *
	 * @param parametriPaginazione the new parametri paginazione
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

	/**
	 * @return the numeroElencoDa
	 */
	public Integer getNumeroElencoDa() {
		return numeroElencoDa;
	}

	/**
	 * @param numeroElencoDa the numeroElencoDa to set
	 */
	public void setNumeroElencoDa(Integer numeroElencoDa) {
		this.numeroElencoDa = numeroElencoDa;
	}

	/**
	 * @return the numeroElencoA
	 */
	public Integer getNumeroElencoA() {
		return numeroElencoA;
	}

	/**
	 * @param numeroElencoA the numeroElencoA to set
	 */
	public void setNumeroElencoA(Integer numeroElencoA) {
		this.numeroElencoA = numeroElencoA;
	}

	/**
	 * @return the annoCapitolo
	 */
	public Integer getAnnoCapitolo() {
		return annoCapitolo;
	}

	/**
	 * @param annoCapitolo the annoCapitolo to set
	 */
	public void setAnnoCapitolo(Integer annoCapitolo) {
		this.annoCapitolo = annoCapitolo;
	}

	/**
	 * @return the numeroCapitolo
	 */
	public Integer getNumeroCapitolo() {
		return numeroCapitolo;
	}

	/**
	 * @param numeroCapitolo the numeroCapitolo to set
	 */
	public void setNumeroCapitolo(Integer numeroCapitolo) {
		this.numeroCapitolo = numeroCapitolo;
	}

	/**
	 * @return the numeroArticolo
	 */
	public Integer getNumeroArticolo() {
		return numeroArticolo;
	}

	/**
	 * @param numeroArticolo the numeroArticolo to set
	 */
	public void setNumeroArticolo(Integer numeroArticolo) {
		this.numeroArticolo = numeroArticolo;
	}

	/**
	 * @return the numeroUEB
	 */
	public Integer getNumeroUEB() {
		return numeroUEB;
	}

	/**
	 * @param numeroUEB the numeroUEB to set
	 */
	public void setNumeroUEB(Integer numeroUEB) {
		this.numeroUEB = numeroUEB;
	}

	/**
	 * @return the flagConvalidaManuale
	 */
	public Boolean getFlagConvalidaManuale() {
		return flagConvalidaManuale;
	}

	/**
	 * @param flagConvalidaManuale the flagConvalidaManuale to set
	 */
	public void setFlagConvalidaManuale(Boolean flagConvalidaManuale) {
		this.flagConvalidaManuale = flagConvalidaManuale;
	}

	/**
	 * @return the distinta
	 */
	public Distinta getDistinta() {
		return distinta;
	}

	/**
	 * @param distinta the distinta to set
	 */
	public void setDistinta(Distinta distinta) {
		this.distinta = distinta;
	}

	/**
	 * @return the uidElenco
	 */
	public Integer getUidElenco() {
		return uidElenco;
	}

	/**
	 * @param uidElenco the uidElenco to set
	 */
	public void setUidElenco(Integer uidElenco) {
		this.uidElenco = uidElenco;
	}

	/**
	 * @return the uidProvvedimento
	 */
	public Integer getUidProvvedimento() {
		return uidProvvedimento;
	}

	/**
	 * @param uidProvvedimento the uidProvvedimento to set
	 */
	public void setUidProvvedimento(Integer uidProvvedimento) {
		this.uidProvvedimento = uidProvvedimento;
	}

	/**
	 * @return the listProvvisorioDiCassa
	 */
	@XmlTransient
	public List<ProvvisorioDiCassa> getListProvvisorioDiCassa() {
		return listProvvisorioDiCassa;
	}

	/**
	 * @param listProvvisorioDiCassa the listProvvisorioDiCassa to set
	 */
	public void setListProvvisorioDiCassa(List<ProvvisorioDiCassa> listProvvisorioDiCassa) {
		this.listProvvisorioDiCassa = listProvvisorioDiCassa;
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

	
}
