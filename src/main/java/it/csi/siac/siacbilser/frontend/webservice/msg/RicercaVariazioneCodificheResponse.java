/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.VariazioneCodificaCapitolo;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaVariazioneCodificheResponse extends RicercaVariazioneBaseResponse<VariazioneCodificaCapitolo> {

	@XmlElementWrapper(name = "listaVariazioni")
	@XmlElement(name = "variazione")
	private ListaPaginata<VariazioneCodificaCapitolo> variazioniDiBilancio = new ListaPaginataImpl<VariazioneCodificaCapitolo>();

	/**
	 * @return the VariazioneCodificaCapitolo
	 */
	@XmlTransient
	@Override
	public ListaPaginata<VariazioneCodificaCapitolo> getVariazioniDiBilancio() {
		return variazioniDiBilancio;
	}

	/**
	 * @param VariazioneCodificaCapitolo
	 *            the VariazioneCodificaCapitolo to set
	 */
	@Override
	public void setVariazioniDiBilancio(ListaPaginata<VariazioneCodificaCapitolo> variazioneCodifica) {
		this.variazioniDiBilancio = variazioneCodifica;
	}

}
