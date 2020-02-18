/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;


import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siacfinser.model.codifiche.ModalitaAccreditoSoggetto;


@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class ModalitaPagamentoDipendente extends Codifica {
	
	private static final long serialVersionUID = -832215927389388759L;
	
	private ModalitaAccreditoSoggetto modalitaAccreditoSoggetto;
	private ModalitaAccreditoCassaEconomale modalitaAccreditoCassaEconomale;
	
	public ModalitaPagamentoDipendente() {
		// Costruttore vuoto
	}
	
	public ModalitaPagamentoDipendente(ModalitaAccreditoSoggetto mas) {
		this.modalitaAccreditoSoggetto = mas;
		impostaCodiceDescrizioneDaCodifica(mas);
	}
	
	public ModalitaPagamentoDipendente(ModalitaAccreditoCassaEconomale tace) {
		this.modalitaAccreditoCassaEconomale = tace;
		impostaCodiceDescrizioneDaCodifica(tace);
	}


	/**
	 * @return the modalitaAccreditoSoggetto
	 */
	public ModalitaAccreditoSoggetto getModalitaAccreditoSoggetto() {
		return modalitaAccreditoSoggetto;
	}

	/**
	 * @param modalitaAccreditoSoggetto the modalitaAccreditoSoggetto to set
	 */
	public void setModalitaAccreditoSoggetto(
			ModalitaAccreditoSoggetto mas) {
		
		this.modalitaAccreditoSoggetto = mas;
		impostaCodiceDescrizioneDaCodifica(mas);
	}

	/**
	 * @return the tipoAccreditoCassaEconomale
	 */
	public ModalitaAccreditoCassaEconomale getModalitaAccreditoCassaEconomale() {
		return modalitaAccreditoCassaEconomale;
	}

	/**
	 * @param modalitaAccreditoCassaEconomale the modalitaAccreditoCassaEconomale to set
	 */
	public void setModalitaAccreditoCassaEconomale(
			ModalitaAccreditoCassaEconomale mace) {
		
		this.modalitaAccreditoCassaEconomale = mace;
		impostaCodiceDescrizioneDaCodifica(mace);
	}
	
	/**
	 * Impostazione del codice e descrizione a partire dalla codifica fornita
	 * @param codifica la codifica da cui recuperare codice e descrizione
	 */
	private void impostaCodiceDescrizioneDaCodifica(Codifica codifica) {
		if(codifica != null){
			setCodice(codifica.getCodice());
			setDescrizione(codifica.getDescrizione());
		}
	}
}