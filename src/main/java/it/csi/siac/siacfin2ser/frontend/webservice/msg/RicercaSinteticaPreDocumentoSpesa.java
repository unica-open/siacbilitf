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
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;
import it.csi.siac.siacfin2ser.model.PreDocumentoSpesa;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;
import it.csi.siac.siacfin2ser.model.TipoCausale;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoPagamento;

/**
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaPreDocumentoSpesa extends RicercaSinteticaBaseRequest {
	
	private PreDocumentoSpesa preDocumentoSpesa;
	private TipoCausale tipoCausale;
	
	private Date dataCompetenzaDa;
	private Date dataCompetenzaA;
	
	private Boolean causaleSpesaMancante = Boolean.FALSE;
	private Boolean contoTesoreriaMancante = Boolean.FALSE;
	private Boolean soggettoMancante = Boolean.FALSE;
	private Boolean provvedimentoMancante = Boolean.FALSE;
	
	
	private Boolean estraiNonPagato = Boolean.FALSE;
	
	// SIAC-4384
	private Boolean soloImporto;
	
	// SIAC-4620
	private Boolean nonAnnullati;
	
	// SIAC-4772
	private OrdinativoPagamento ordinativoPagamento;

	/**
	 * @return the preDocumentoSpesa
	 */
	public PreDocumentoSpesa getPreDocumentoSpesa() {
		return preDocumentoSpesa;
	}
	/**
	 * @param preDocumentoSpesa the preDocumentoSpesa to set
	 */
	public void setPreDocumentoSpesa(PreDocumentoSpesa preDocumentoSpesa) {
		this.preDocumentoSpesa = preDocumentoSpesa;
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
	 * @return the causaleSpesaMancante
	 */
	public Boolean getCausaleSpesaMancante() {
		return causaleSpesaMancante;
	}
	/**
	 * @param causaleSpesaMancante the causaleSpesaMancante to set
	 */
	public void setCausaleSpesaMancante(Boolean causaleSpesaMancante) {
		this.causaleSpesaMancante = causaleSpesaMancante != null ? causaleSpesaMancante : Boolean.FALSE;
	}
	/**
	 * @return the contoTesoreriaMancante
	 */
	public Boolean getContoTesoreriaMancante() {
		return contoTesoreriaMancante;
	}
	/**
	 * @param contoTesoreriaMancante the contoTesoreriaMancante to set
	 */
	public void setContoTesoreriaMancante(Boolean contoTesoreriaMancante) {
		this.contoTesoreriaMancante = contoTesoreriaMancante != null ? contoTesoreriaMancante : Boolean.FALSE;
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
	 * @return the estraiNonPagato
	 */
	public Boolean getEstraiNonPagato() {
		return estraiNonPagato;
	}
	/**
	 * @param estraiNonPagato the estraiNonPagato to set
	 */
	public void setEstraiNonPagato(Boolean estraiNonPagato) {
		this.estraiNonPagato = estraiNonPagato != null ? estraiNonPagato : Boolean.FALSE;
	}
	
	/**
	 * @return the documento
	 */
	@XmlTransient
	public DocumentoSpesa getDocumento() {
		if(preDocumentoSpesa == null || preDocumentoSpesa.getSubDocumento() == null) {
			return null;
		}
		return preDocumentoSpesa.getSubDocumento().getDocumento();
	}
	
	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(DocumentoSpesa documento) {
		if(preDocumentoSpesa==null){
			preDocumentoSpesa = new PreDocumentoSpesa();
		}
		if(preDocumentoSpesa.getSubDocumento()==null){
			preDocumentoSpesa.setSubDocumento(new SubdocumentoSpesa());
		}
		preDocumentoSpesa.getSubDocumento().setDocumento(documento);
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
	 * @return the ordinativoPagamento
	 */
	public OrdinativoPagamento getOrdinativoPagamento() {
		return ordinativoPagamento;
	}
	/**
	 * @param ordinativoPagamento the ordinativoPagamento to set
	 */
	public void setOrdinativoPagamento(OrdinativoPagamento ordinativoPagamento) {
		this.ordinativoPagamento = ordinativoPagamento;
	}
	
}
