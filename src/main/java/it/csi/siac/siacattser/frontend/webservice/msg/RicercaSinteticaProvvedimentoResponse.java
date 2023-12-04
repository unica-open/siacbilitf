/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;

/**
 * Response del servizio di ricerca sintetica del provvedimento
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaProvvedimentoResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaAttiAmministrativi")
	@XmlElement(name = "attoAmministrativo")
	private ListaPaginata<AttoAmministrativo> attiAmministrativi = new ListaPaginataImpl<AttoAmministrativo>();

	/**
	 * @return the attiAmministrativi
	 */
	@XmlTransient
	public ListaPaginata<AttoAmministrativo> getAttiAmministrativi() {
		return attiAmministrativi;
	}

	/**
	 * @param attiAmministrativi the attiAmministrativi to set
	 */
	public void setAttiAmministrativi(ListaPaginata<AttoAmministrativo> attiAmministrativi) {
		this.attiAmministrativi = attiAmministrativi;
	}

	/**
	 * @param totaleElementi the totaleElementi to set
	 */
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<AttoAmministrativo>)attiAmministrativi).setTotaleElementi(totaleElementi);
	}

	/**
	 * @param totalePagine the totalePagine to set
	 */
	public void setTotalePagine(int totalePagine){
		((ListaPaginataImpl<AttoAmministrativo>)attiAmministrativi).setTotalePagine(totalePagine);
	}

	/**
	 * @param paginaCorrente the paginaCorrente to set
	 */
	public void setPaginaCorrente(int paginaCorrente){
		((ListaPaginataImpl<AttoAmministrativo>)attiAmministrativi).setPaginaCorrente(paginaCorrente);
	}
	
	/**
	 * @return the totaleElementi
	 */
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<AttoAmministrativo>)attiAmministrativi).getTotaleElementi();
	}
	
	/**
	 * @return the totalePagine
	 */
	public int getTotalePagine(){
		return ((ListaPaginataImpl<AttoAmministrativo>)attiAmministrativi).getTotalePagine();
	}
	
	/**
	 * @return the paginaCorrente
	 */
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<AttoAmministrativo>)attiAmministrativi).getPaginaCorrente();
	}
	
	

}
