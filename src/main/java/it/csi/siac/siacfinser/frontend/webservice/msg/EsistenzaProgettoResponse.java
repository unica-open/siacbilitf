/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class EsistenzaProgettoResponse extends ServiceResponse{

	private boolean esisteProgetto;
	private boolean flagEsistenzaFPV;
	private BigDecimal valoreComplessivo;

	public boolean isEsisteProgetto() {
		return esisteProgetto;
	}

	public void setEsisteProgetto(boolean esisteProgetto) {
		this.esisteProgetto = esisteProgetto;
	}

	public boolean isFlagEsistenzaFPV() {
		return flagEsistenzaFPV;
	}

	public void setFlagEsistenzaFPV(boolean flagEsistenzaFPV) {
		this.flagEsistenzaFPV = flagEsistenzaFPV;
	}

	public BigDecimal getValoreComplessivo() {
		return valoreComplessivo;
	}

	public void setValoreComplessivo(BigDecimal valoreComplessivo) {
		this.valoreComplessivo = valoreComplessivo;
	}

}
