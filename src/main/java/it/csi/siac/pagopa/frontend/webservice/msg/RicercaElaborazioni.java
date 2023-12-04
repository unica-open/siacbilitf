/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pagopa.frontend.webservice.msg;



import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.pagopa.model.Elaborazione;
import it.csi.siac.pcc.frontend.webservice.PCCSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

@XmlType(namespace = PCCSvcDictionary.NAMESPACE)
public class RicercaElaborazioni extends ServiceRequest {
 
	
	private ParametriPaginazione parametriPaginazione;
	
	private Elaborazione elaborazione;
	
	
	private Date dataEmissioneDa;
	private Date dataEmissioneA;
	
	private Date dataElaborazioneFlussoDa;
	private Date dataElaborazioneFlussoA;
	// SIAC-8046 CM 09/03/2021 Inizio
	private String esitoElaborazioneFlusso;
	

	/**
	 * @return the esitoElaborazioneFlusso
	 */
	public String getEsitoElaborazioneFlusso() {
		return esitoElaborazioneFlusso;
	}

	/**
	 * @param esitoElaborazioneFlusso the esitoElaborazioneFlusso to set
	 */
	public void setEsitoElaborazioneFlusso(String esitoElaborazioneFlusso) {
		this.esitoElaborazioneFlusso = esitoElaborazioneFlusso;
	}

	// SIAC-8046 CM 09/03/2021 Fine

	
	/**
	 * @return the elaborazione
	 */
	public Elaborazione getElaborazione()
	{
		return elaborazione;
	}

	/**
	 * @param elaborazione the elaborazione to set
	 */
	public void setElaborazione(Elaborazione elaborazione)
	{
		this.elaborazione = elaborazione;
	}

	/**
	 * @return the dataEmissioneDa
	 */
	public Date getDataEmissioneDa()
	{
		return dataEmissioneDa;
	}

	/**
	 * @param dataEmissioneDa the dataEmissioneDa to set
	 */
	public void setDataEmissioneDa(Date dataEmissioneDa)
	{
		this.dataEmissioneDa = dataEmissioneDa;
	}

	/**
	 * @return the dataEmissioneA
	 */
	public Date getDataEmissioneA()
	{
		return dataEmissioneA;
	}

	/**
	 * @param dataEmissioneA the dataEmissioneA to set
	 */
	public void setDataEmissioneA(Date dataEmissioneA)
	{
		this.dataEmissioneA = dataEmissioneA;
	}

	/**
	 * @return the dataElaborazioneFlussoDa
	 */
	public Date getDataElaborazioneFlussoDa()
	{
		return dataElaborazioneFlussoDa;
	}

	/**
	 * @param dataElaborazioneFlussoDa the dataElaborazioneFlussoDa to set
	 */
	public void setDataElaborazioneFlussoDa(Date dataElaborazioneFlussoDa)
	{
		this.dataElaborazioneFlussoDa = dataElaborazioneFlussoDa;
	}

	/**
	 * @return the dataElaborazioneFlussoA
	 */
	public Date getDataElaborazioneFlussoA()
	{
		return dataElaborazioneFlussoA;
	}

	/**
	 * @param dataElaborazioneFlussoA the dataElaborazioneFlussoA to set
	 */
	public void setDataElaborazioneFlussoA(Date dataElaborazioneFlussoA)
	{
		this.dataElaborazioneFlussoA = dataElaborazioneFlussoA;
	}

	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione()
	{
		return parametriPaginazione;
	}

	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione)
	{
		this.parametriPaginazione = parametriPaginazione;
	}
	
	
	
	
}
