/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegato;
import it.csi.siac.siacfin2ser.model.PreDocumentoSpesa;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaDocumentoSpesa extends ServiceRequest {
	
	private DocumentoSpesa documentoSpesa;
	private AttoAmministrativo attoAmministrativo;
	private Impegno impegno;
	private Boolean rilevanteIva;
	private ParametriPaginazione parametriPaginazione;
	private ElencoDocumentiAllegato elencoDocumenti;
	private Liquidazione liquidazione;
	private Bilancio bilancioLiquidazione;
	private Boolean contabilizzaGenPcc;

	// Lotto M
	private Boolean collegatoCEC;
	
	//SIAC-6780
	private PreDocumentoSpesa predocumentoSpesa;

	/**
	 * @return the documentoSpesa
	 */
	public DocumentoSpesa getDocumentoSpesa() {
		return documentoSpesa;
	}

	/**
	 * @param documentoSpesa the documentoSpesa to set
	 */
	public void setDocumentoSpesa(DocumentoSpesa documento) {
		this.documentoSpesa = documento;
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

	/**
	 * @return the impegno
	 */
	public Impegno getImpegno() {
		return impegno;
	}

	/**
	 * @param impegno the impegno to set
	 */
	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

	/**
	 * @return the rilevanteIva
	 */
	public Boolean getRilevanteIva() {
		return rilevanteIva;
	}

	/**
	 * @param rilevanteIva the rilevanteIva to set
	 */
	public void setRilevanteIva(Boolean rilevanteIva) {
		this.rilevanteIva = rilevanteIva;
	}

	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

	/**
	 * @return the elencoDocumenti
	 */
	public ElencoDocumentiAllegato getElencoDocumenti() {
		return elencoDocumenti;
	}

	/**
	 * @param elencoDocumenti the elencoDocumenti to set
	 */
	public void setElencoDocumenti(ElencoDocumentiAllegato elencoDocumenti) {
		this.elencoDocumenti = elencoDocumenti;
	}

	/**
	 * @return the liquidazione
	 */
	public Liquidazione getLiquidazione() {
		return liquidazione;
	}

	/**
	 * @param liquidazione the liquidazione to set
	 */
	public void setLiquidazione(Liquidazione liquidazione) {
		this.liquidazione = liquidazione;
	}

	/**
	 * @return the bilancioLiquidazione
	 */
	public Bilancio getBilancioLiquidazione() {
		return bilancioLiquidazione;
	}

	/**
	 * @param bilancioLiquidazione the bilancioLiquidazione to set
	 */
	public void setBilancioLiquidazione(Bilancio bilancioLiquidazione) {
		this.bilancioLiquidazione = bilancioLiquidazione;
	}

	/**
	 * @return the collegatoCEC
	 */
	public Boolean getCollegatoCEC() {
		return collegatoCEC;
	}

	/**
	 * @param collegatoCEC the collegatoCEC to set
	 */
	public void setCollegatoCEC(Boolean collegatoCEC) {
		this.collegatoCEC = collegatoCEC;
	}

	/**
	 * @return the contabilizzaGenPcc
	 */
	public Boolean getContabilizzaGenPcc() {
		return contabilizzaGenPcc;
	}

	/**
	 * @param contabilizzaGenPcc the contabilizzaGenPcc to set
	 */
	public void setContabilizzaGenPcc(Boolean contabilizzaGenPcc) {
		this.contabilizzaGenPcc = contabilizzaGenPcc;
	}

	/**
	 * @return the predocumentoSpesa
	 */
	public PreDocumentoSpesa getPredocumentoSpesa() {
		return predocumentoSpesa;
	}

	/**
	 * @param predocumentoSpesa the predocumentoSpesa to set
	 */
	public void setPredocumentoSpesa(PreDocumentoSpesa predocumentoSpesa) {
		this.predocumentoSpesa = predocumentoSpesa;
	}
	
}
