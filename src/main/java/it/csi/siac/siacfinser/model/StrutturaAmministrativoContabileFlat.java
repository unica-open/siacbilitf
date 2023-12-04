/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class StrutturaAmministrativoContabileFlat extends EntitaEnte {
	private static final long serialVersionUID = 2404706073203340315L;

	private String codice;
	private String descrizione;
	private String codicePadre;

	public StrutturaAmministrativoContabileFlat() {
		super();
	}

	
	public StrutturaAmministrativoContabileFlat(StrutturaAmministrativoContabile strutturaAmministrativoContabile, String codicePadre) {
		setUid(strutturaAmministrativoContabile.getUid());
		setCodice(strutturaAmministrativoContabile.getCodice());
		setDescrizione(strutturaAmministrativoContabile.getDescrizione());
		setCodicePadre(codicePadre);
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCodicePadre() {
		return codicePadre;
	}

	public void setCodicePadre(String codicePadre) {
		this.codicePadre = codicePadre;
	}

	public String getCodiceCompleto() {
		return codicePadre != null ?  String.format("%s-%s", codicePadre, codice) : codice;
	}

//	public String getCodiceCompleto()
//	{
//		return strutturaPadre != null ? 
//				String.format("%s - %s", strutturaPadre.getCodiceCompleto(), getCodice())
//				: getCodice();
//	}

//	public String getCodiceDescrizione()
//	{
//		return String.format("%s %s", getCodiceCompleto(), descrizione);
//	}
}