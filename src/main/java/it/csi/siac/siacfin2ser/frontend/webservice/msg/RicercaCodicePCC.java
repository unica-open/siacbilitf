/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CodiceUfficioDestinatarioPCC;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaCodicePCC extends ServiceRequest {
	
	private List<StrutturaAmministrativoContabile> struttureAmministrativoContabili = new ArrayList<StrutturaAmministrativoContabile>();
	
	private CodiceUfficioDestinatarioPCC codiceUfficioDestinatarioPCC;

	/**
	 * @return the struttureAmministrativoContabili
	 */
	public List<StrutturaAmministrativoContabile> getStruttureAmministrativoContabili() {
		return struttureAmministrativoContabili;
	}

	/**
	 * @param struttureAmministrativoContabili the struttureAmministrativoContabili to set
	 */
	public void setStruttureAmministrativoContabili(List<StrutturaAmministrativoContabile> struttureAmministrativoContabili) {
		this.struttureAmministrativoContabili = struttureAmministrativoContabili != null ? struttureAmministrativoContabili : new ArrayList<StrutturaAmministrativoContabile>();
	}

	/**
	 * Gets the codice ufficio destinatario PCC.
	 *
	 * @return the codiceUfficioDestinatarioPCC
	 */
	public CodiceUfficioDestinatarioPCC getCodiceUfficioDestinatarioPCC() {
		return codiceUfficioDestinatarioPCC;
	}

	/**
	 * Sets the codice ufficio destinatario PCC.
	 *
	 * @param codiceUfficioDestinatarioPCC the codiceUfficioDestinatarioPCC to set
	 */
	public void setCodiceUfficioDestinatarioPCC(CodiceUfficioDestinatarioPCC codiceUfficioDestinatarioPCC) {
		this.codiceUfficioDestinatarioPCC = codiceUfficioDestinatarioPCC;
	}

}
