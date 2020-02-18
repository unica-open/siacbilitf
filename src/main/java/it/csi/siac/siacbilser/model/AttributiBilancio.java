/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;

/**
 * Attributi del bilancio
 * @author Alessandro Marchino
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AttributiBilancio implements Serializable {
	private static final long serialVersionUID = -8794684673301276874L;

	private Boolean flagReimputaSpese;
	private Boolean flagReimputaEntrate;
	private Boolean accantonamentoGraduale;
	private Boolean riscossioneVirtuosa;
	private TipoMediaPrescelta mediaApplicata;
	private BigDecimal percentualeAccantonamentoAnno;
	private BigDecimal percentualeAccantonamentoAnno1;
	private BigDecimal percentualeAccantonamentoAnno2;
	private Integer ultimoAnnoApprovato;
	/**
	 * @return the flagReimputaSpese
	 */
	public Boolean getFlagReimputaSpese() {
		return flagReimputaSpese;
	}
	/**
	 * @param flagReimputaSpese the flagReimputaSpese to set
	 */
	public void setFlagReimputaSpese(Boolean flagReimputaSpese) {
		this.flagReimputaSpese = flagReimputaSpese;
	}
	/**
	 * @return the flagReimputaEntrate
	 */
	public Boolean getFlagReimputaEntrate() {
		return flagReimputaEntrate;
	}
	/**
	 * @param flagReimputaEntrate the flagReimputaEntrate to set
	 */
	public void setFlagReimputaEntrate(Boolean flagReimputaEntrate) {
		this.flagReimputaEntrate = flagReimputaEntrate;
	}
	/**
	 * @return the accantonamentoGraduale
	 */
	public Boolean getAccantonamentoGraduale() {
		return accantonamentoGraduale;
	}
	/**
	 * @param accantonamentoGraduale the accantonamentoGraduale to set
	 */
	public void setAccantonamentoGraduale(Boolean accantonamentoGraduale) {
		this.accantonamentoGraduale = accantonamentoGraduale;
	}
	/**
	 * @return the riscossioneVirtuosa
	 */
	public Boolean getRiscossioneVirtuosa() {
		return riscossioneVirtuosa;
	}
	/**
	 * @param riscossioneVirtuosa the riscossioneVirtuosa to set
	 */
	public void setRiscossioneVirtuosa(Boolean riscossioneVirtuosa) {
		this.riscossioneVirtuosa = riscossioneVirtuosa;
	}
	/**
	 * @return the mediaApplicata
	 */
	public TipoMediaPrescelta getMediaApplicata() {
		return mediaApplicata;
	}
	/**
	 * @param mediaApplicata the mediaApplicata to set
	 */
	public void setMediaApplicata(TipoMediaPrescelta mediaApplicata) {
		this.mediaApplicata = mediaApplicata;
	}
	/**
	 * @return the percentualeAccantonamentoAnno
	 */
	public BigDecimal getPercentualeAccantonamentoAnno() {
		return percentualeAccantonamentoAnno;
	}
	/**
	 * @param percentualeAccantonamentoAnno the percentualeAccantonamentoAnno to set
	 */
	public void setPercentualeAccantonamentoAnno(BigDecimal percentualeAccantonamentoAnno) {
		this.percentualeAccantonamentoAnno = percentualeAccantonamentoAnno;
	}
	/**
	 * @return the percentualeAccantonamentoAnno1
	 */
	public BigDecimal getPercentualeAccantonamentoAnno1() {
		return percentualeAccantonamentoAnno1;
	}
	/**
	 * @param percentualeAccantonamentoAnno1 the percentualeAccantonamentoAnno1 to set
	 */
	public void setPercentualeAccantonamentoAnno1(BigDecimal percentualeAccantonamentoAnno1) {
		this.percentualeAccantonamentoAnno1 = percentualeAccantonamentoAnno1;
	}
	/**
	 * @return the percentualeAccantonamentoAnno2
	 */
	public BigDecimal getPercentualeAccantonamentoAnno2() {
		return percentualeAccantonamentoAnno2;
	}
	/**
	 * @param percentualeAccantonamentoAnno2 the percentualeAccantonamentoAnno2 to set
	 */
	public void setPercentualeAccantonamentoAnno2(BigDecimal percentualeAccantonamentoAnno2) {
		this.percentualeAccantonamentoAnno2 = percentualeAccantonamentoAnno2;
	}
	/**
	 * @return the ultimoAnnoApprovato
	 */
	public Integer getUltimoAnnoApprovato() {
		return ultimoAnnoApprovato;
	}
	/**
	 * @param ultimoAnnoApprovato the ultimoAnnoApprovato to set
	 */
	public void setUltimoAnnoApprovato(Integer ultimoAnnoApprovato) {
		this.ultimoAnnoApprovato = ultimoAnnoApprovato;
	}

}
