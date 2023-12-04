/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.sirfelser.frontend.webservice.FELSvcDictionary;
import it.csi.siac.sirfelser.model.FatturaFEL;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FELSvcDictionary.NAMESPACE)
public class RicercaSinteticaFatturaElettronica extends ServiceRequest {
	
	private FatturaFEL fatturaFEL;
	private Date dataFatturaDa;
	private Date dataFatturaA;
	private ParametriPaginazione parametriPaginazione;

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
	 * @return the dataFatturaDa
	 */
	public Date getDataFatturaDa() {
		return dataFatturaDa;
	}

	/**
	 * @param dataFatturaDa the dataFatturaDa to set
	 */
	public void setDataFatturaDa(Date dataFatturaDa) {
		this.dataFatturaDa = dataFatturaDa;
	}

	/**
	 * @return the dataFatturaA
	 */
	public Date getDataFatturaA() {
		return dataFatturaA;
	}

	/**
	 * @param dataFatturaA the dataFatturaA to set
	 */
	public void setDataFatturaA(Date dataFatturaA) {
		this.dataFatturaA = dataFatturaA;
	}

	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}
	
	
	
	
}
