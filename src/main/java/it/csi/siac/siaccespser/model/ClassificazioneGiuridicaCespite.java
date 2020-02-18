/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CESPDataDictionary.NAMESPACE)
public enum ClassificazioneGiuridicaCespite {

	CES_BENE_DISPONIBILE("1", "Bene disponibile"), //BENE_DISPONIBILE
	
	CES_BENE_INDISPONIBILE("2", "Bene indisponibile"), //BENE_INDISPONIBILE
	
	CES_BENE_DEMANIALE("3", "Bene demaniale"), //BENE_DEMANIALE
	;
	
	private String codice;
	private String descrizione;
	
	private ClassificazioneGiuridicaCespite(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	/**
	 * Gets the codice.
	 *
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	
	/**
	 * Gets the descrizione.
	 *
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
	public static ClassificazioneGiuridicaCespite fromCodice(String codice) {
		for (ClassificazioneGiuridicaCespite cgc : ClassificazioneGiuridicaCespite.values()) {
			if (cgc.codice.equals(codice)) {
				return cgc;
			}
		}
		return null;
	}

}
/*
insert into	siac_d_cespiti_classificazione_giuridica (ces_class_giu_code,  ces_class_giu_desc,  ente_proprietario_id,  validita_fine,  data_cancellazione,login_operazione)
VALUES('BENE_DISPONIBILE','BENE_DISPONIBILE',2,null,null,'admin');


insert into	siac_d_cespiti_classificazione_giuridica (ces_class_giu_code,  ces_class_giu_desc,  ente_proprietario_id,  validita_fine,  data_cancellazione, login_operazione)
VALUES('BENE_INDISPONIBILE','BENE_INDISPONIBILE',2,null,null,'admin');


insert into	siac_d_cespiti_classificazione_giuridica (ces_class_giu_code,  ces_class_giu_desc,  ente_proprietario_id,  validita_fine,  data_cancellazione,login_operazione)
VALUES('BENE_DEMANIALE','BENE_DEMANIALE',2,null,null,'admin');
*/



