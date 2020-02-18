/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.Date;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;
import it.csi.siac.siacfin2ser.model.PreDocumentoEntrata;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;
import it.csi.siac.siacfin2ser.model.TipoCausale;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoIncasso;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaPreDocumentoEntrata extends RicercaSinteticaBaseRequest {
	
	private PreDocumentoEntrata preDocumentoEntrata;
	private TipoCausale tipoCausale;
	
	private Date dataCompetenzaDa;
	private Date dataCompetenzaA;
	
	private Boolean causaleEntrataMancante = Boolean.FALSE;
	private Boolean contoCorrenteMancante = Boolean.FALSE;
	private Boolean soggettoMancante = Boolean.FALSE;
	private Boolean provvedimentoMancante = Boolean.FALSE;
	
	private Boolean estraiNonIncassato = Boolean.FALSE;
	
	// SIAC-4383
	private Date dataTrasmissioneDa;
	private Date dataTrasmissioneA;
	// SIAC-4384
	private Boolean soloImporto;
	
	// SIAC-4620
	private Boolean nonAnnullati;
	
	// SIAC-4772
	private OrdinativoIncasso ordinativoIncasso;
	
	// SIAC-5250
	private OrdinamentoPreDocumentoEntrata ordinamentoPreDocumentoEntrata;
	
	/**
	 * @return the preDocumentoEntrata
	 */
	public PreDocumentoEntrata getPreDocumentoEntrata() {
		return preDocumentoEntrata;
	}
	/**
	 * @param preDocumentoEntrata the preDocumentoEntrata to set
	 */
	public void setPreDocumentoEntrata(PreDocumentoEntrata preDocumentoEntrata) {
		this.preDocumentoEntrata = preDocumentoEntrata;
	}
	
	/**
	 * @return the tipoCausale
	 */
	public TipoCausale getTipoCausale() {
		return tipoCausale;
	}
	/**
	 * @param tipoCausale the tipoCausale to set
	 */
	public void setTipoCausale(TipoCausale tipoCausale) {
		this.tipoCausale = tipoCausale;
	}
	/**
	 * @return the dataCompetenzaDa
	 */
	public Date getDataCompetenzaDa() {
		return dataCompetenzaDa;
	}
	/**
	 * @param dataCompetenzaDa the dataCompetenzaDa to set
	 */
	public void setDataCompetenzaDa(Date dataCompetenzaDa) {
		this.dataCompetenzaDa = dataCompetenzaDa;
	}
	/**
	 * @return the dataCompetenzaA
	 */
	public Date getDataCompetenzaA() {
		return dataCompetenzaA;
	}
	/**
	 * @param dataCompetenzaA the dataCompetenzaA to set
	 */
	public void setDataCompetenzaA(Date dataCompetenzaA) {
		this.dataCompetenzaA = dataCompetenzaA;
	}
	/**
	 * @return the causaleEntrataMancante
	 */
	public Boolean getCausaleEntrataMancante() {
		return causaleEntrataMancante;
	}
	/**
	 * @param causaleEntrataMancante the causaleEntrataMancante to set
	 */
	public void setCausaleEntrataMancante(Boolean causaleEntrataMancante) {
		this.causaleEntrataMancante = causaleEntrataMancante != null ? causaleEntrataMancante : Boolean.FALSE;
	}
	
	/**
	 * @return the contoCorreteMancante
	 */
	public Boolean getContoCorrenteMancante() {
		return contoCorrenteMancante;
	}
	/**
	 * @param contoCorreteMancante the contoCorreteMancante to set
	 */
	public void setContoCorrenteMancante(Boolean contoCorrenteMancante) {
		this.contoCorrenteMancante = contoCorrenteMancante != null ? contoCorrenteMancante : Boolean.FALSE;
	}
	/**
	 * @return the soggettoMancante
	 */
	public Boolean getSoggettoMancante() {
		return soggettoMancante;
	}
	/**
	 * @param soggettoMancante the soggettoMancante to set
	 */
	public void setSoggettoMancante(Boolean soggettoMancante) {
		this.soggettoMancante = soggettoMancante != null ? soggettoMancante : Boolean.FALSE;
	}
	/**
	 * @return the provvedimentoMancante
	 */
	public Boolean getProvvedimentoMancante() {
		return provvedimentoMancante;
	}
	/**
	 * @param provvedimentoMancante the provvedimentoMancante to set
	 */
	public void setProvvedimentoMancante(Boolean provvedimentoMancante) {
		this.provvedimentoMancante = provvedimentoMancante != null ? provvedimentoMancante : Boolean.FALSE;
	}
	/**
	 * @return the estraiNonIncassato
	 */
	public Boolean getEstraiNonIncassato() {
		return estraiNonIncassato;
	}
	/**
	 * @param estraiNonIncassato the estraiNonIncassato to set
	 */
	public void setEstraiNonIncassato(Boolean estraiNonIncassato) {
		this.estraiNonIncassato = estraiNonIncassato != null ? estraiNonIncassato : Boolean.FALSE;
	}
	/**
	 * @return the dataTrasmissioneDa
	 */
	public Date getDataTrasmissioneDa() {
		return dataTrasmissioneDa;
	}
	/**
	 * @param dataTrasmissioneDa the dataTrasmissioneDa to set
	 */
	public void setDataTrasmissioneDa(Date dataTrasmissioneDa) {
		this.dataTrasmissioneDa = dataTrasmissioneDa;
	}
	/**
	 * @return the dataTrasmissioneA
	 */
	public Date getDataTrasmissioneA() {
		return dataTrasmissioneA;
	}
	/**
	 * @param dataTrasmissioneA the dataTrasmissioneA to set
	 */
	public void setDataTrasmissioneA(Date dataTrasmissioneA) {
		this.dataTrasmissioneA = dataTrasmissioneA;
	}
	@XmlTransient
	public DocumentoEntrata getDocumento() {
		if(preDocumentoEntrata == null || preDocumentoEntrata.getSubDocumento() == null) {
			return null;
		}
		return preDocumentoEntrata.getSubDocumento().getDocumento();
	}
	
	public void setDocumento(DocumentoEntrata documento) {
		if(preDocumentoEntrata == null){
			preDocumentoEntrata = new PreDocumentoEntrata();
		}
		if(preDocumentoEntrata.getSubDocumento()==null){
			preDocumentoEntrata.setSubDocumento(new SubdocumentoEntrata());
		}
		preDocumentoEntrata.getSubDocumento().setDocumento(documento);
	}
	/**
	 * @return the soloImporto
	 */
	public Boolean getSoloImporto() {
		return soloImporto;
	}
	/**
	 * @param soloImporto the soloImporto to set
	 */
	public void setSoloImporto(Boolean soloImporto) {
		this.soloImporto = soloImporto;
	}
	/**
	 * @return the nonAnnullati
	 */
	public Boolean getNonAnnullati() {
		return nonAnnullati;
	}
	/**
	 * @param nonAnnullati the nonAnnullati to set
	 */
	public void setNonAnnullati(Boolean nonAnnullati) {
		this.nonAnnullati = nonAnnullati;
	}
	/**
	 * @return the ordinativoIncasso
	 */
	public OrdinativoIncasso getOrdinativoIncasso() {
		return ordinativoIncasso;
	}
	/**
	 * @param ordinativoIncasso the ordinativoIncasso to set
	 */
	public void setOrdinativoIncasso(OrdinativoIncasso ordinativoIncasso) {
		this.ordinativoIncasso = ordinativoIncasso;
	}
	/**
	 * @return the ordinamentoPreDocumentoEntrata
	 */
	public OrdinamentoPreDocumentoEntrata getOrdinamentoPreDocumentoEntrata() {
		return ordinamentoPreDocumentoEntrata;
	}
	/**
	 * @param ordinamentoPreDocumentoEntrata the ordinamentoPreDocumentoEntrata to set
	 */
	public void setOrdinamentoPreDocumentoEntrata(OrdinamentoPreDocumentoEntrata ordinamentoPreDocumentoEntrata) {
		this.ordinamentoPreDocumentoEntrata = ordinamentoPreDocumentoEntrata;
	}

	
}
