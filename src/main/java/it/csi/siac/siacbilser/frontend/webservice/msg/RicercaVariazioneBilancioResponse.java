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
import it.csi.siac.siacbilser.model.VariazioneImportoCapitolo;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaVariazioneBilancioResponse extends RicercaVariazioneBaseResponse<VariazioneImportoCapitolo> {

	@XmlElementWrapper(name = "listaVariazioni")
	@XmlElement(name = "variazione")
	private ListaPaginata<VariazioneImportoCapitolo> variazioniDiBilancio = new ListaPaginataImpl<VariazioneImportoCapitolo>();

	/**
	 * @return the VariazioneImportoCapitolo
	 */
	@XmlTransient
	@Override
	public ListaPaginata<VariazioneImportoCapitolo> getVariazioniDiBilancio() {
		return variazioniDiBilancio;
	}

	/**
	 * @param VariazioneImportoCapitolo the VariazioneImportoCapitolo to set
	 */
	@Override
	public void setVariazioniDiBilancio(ListaPaginata<VariazioneImportoCapitolo> variazioneDiBilancio) {
		this.variazioniDiBilancio = variazioneDiBilancio;
	}

}
