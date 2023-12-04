/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * OrdineAcquistoFEL
 * 
 * @author Marchino Alessandro
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class OrdineAcquistoFEL extends EntitaEnte {
	
	private static final long serialVersionUID = 4620005225300874685L;

	
	private String numeroDocumento;
	private String cig;
	private String codiceCommessaConvenzione;
	private String cup;
	private Date dataDocumento;
	private String numeroVoce;
	
	private FatturaFEL fatturaFEL;
	
	@XmlElementWrapper(name = "listaDettagli")
	@XmlElement(name = "dettaglioOrdineAcquisto")
	private List<DettaglioOrdineAcquistoFEL> dettagliOrdineAcquisto = new ArrayList<DettaglioOrdineAcquistoFEL>();

	
	

	
	

	/**
	 * @return the numeroDocumento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * @param numeroDocumento the numeroDocumento to set
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * @return the cig
	 */
	public String getCig() {
		return cig;
	}

	/**
	 * @param cig the cig to set
	 */
	public void setCig(String cig) {
		this.cig = cig;
	}

	/**
	 * @return the codiceCommessaConvenzione
	 */
	public String getCodiceCommessaConvenzione() {
		return codiceCommessaConvenzione;
	}

	/**
	 * @param codiceCommessaConvenzione the codiceCommessaConvenzione to set
	 */
	public void setCodiceCommessaConvenzione(String codiceCommessaConvenzione) {
		this.codiceCommessaConvenzione = codiceCommessaConvenzione;
	}

	/**
	 * @return the cup
	 */
	public String getCup() {
		return cup;
	}

	/**
	 * @param cup the cup to set
	 */
	public void setCup(String cup) {
		this.cup = cup;
	}

	/**
	 * @return the dataDocumento
	 */
	public Date getDataDocumento() {
		return dataDocumento;
	}

	/**
	 * @param dataDocumento the dataDocumento to set
	 */
	public void setDataDocumento(Date dataDocumento) {
		this.dataDocumento = dataDocumento;
	}

	/**
	 * @return the numeroVoce
	 */
	public String getNumeroVoce() {
		return numeroVoce;
	}

	/**
	 * @param numeroVoce the numeroVoce to set
	 */
	public void setNumeroVoce(String numeroVoce) {
		this.numeroVoce = numeroVoce;
	}

	/**
	 * @return the fatturaFEL
	 */
	public FatturaFEL getFatturaFEL() {
		return fatturaFEL;
	}

	/**
	 * @param fatturaFEL the fatturaFEL to set
	 */
	public void setFatturaFEL(FatturaFEL fatturaFEL) {
		this.fatturaFEL = fatturaFEL;
	}

	/**
	 * @return the dettagliOrdineAcquisto
	 */
	@XmlTransient
	public List<DettaglioOrdineAcquistoFEL> getDettagliOrdineAcquisto() {
		return dettagliOrdineAcquisto;
	}

	/**
	 * @param dettagliOrdineAcquisto the dettagliOrdineAcquisto to set
	 */
	public void setDettagliOrdineAcquisto(List<DettaglioOrdineAcquistoFEL> dettagliOrdineAcquisto) {
		this.dettagliOrdineAcquisto = dettagliOrdineAcquisto != null ? dettagliOrdineAcquisto : new ArrayList<DettaglioOrdineAcquistoFEL>();
	}

}
