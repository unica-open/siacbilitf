/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

/**
 * CodiceUfficioDestinatario.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class CodiceUfficioDestinatarioPCC extends Codifica {
	
	//maps the siac_d_pcc_ufficio
	
	private static final long serialVersionUID = 763700275022032299L;
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
	private List<CodicePCC> codiciPCC = new ArrayList<CodicePCC>();
	/**
	 * Gets the struttura amministrativo contabile.
	 *
	 * @return the strutturaAmministrativoContabile
	 */
	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
		return strutturaAmministrativoContabile;
	}

	/**
	 * Sets the struttura amministrativo contabile.
	 *
	 * @param strutturaAmministrativoContabile the strutturaAmministrativoContabile to set
	 */
	public void setStrutturaAmministrativoContabile(StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
	}

	/**
	 * @return the codiciPCC
	 */
	public List<CodicePCC> getCodiciPCC() {
		return codiciPCC;
	}

	/**
	 * @param codiciPCC the codiciPCC to set
	 */
	public void setCodiciPCC(List<CodicePCC> codiciPCC) {
		this.codiciPCC = codiciPCC;
	}

}
