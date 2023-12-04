/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

import javax.xml.bind.annotation.XmlType;

/**
 * Codifica per il Codice della Piattaforma di Certificazione del Credito
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class CodicePCC extends Codifica {
	
	//maps the siac_d_pcc_codice

	private static final long serialVersionUID = -9056808474639434435L;
	
	// siac_r_pcc_codice_class
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;

	/**
	 * @return the strutturaAmministrativoContabile
	 */
	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
		return strutturaAmministrativoContabile;
	}

	/**
	 * @param strutturaAmministrativoContabile the strutturaAmministrativoContabile to set
	 */
	public void setStrutturaAmministrativoContabile(
			StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
	}
	
}
