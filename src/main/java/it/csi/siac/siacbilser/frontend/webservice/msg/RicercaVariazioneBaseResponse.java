/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.VariazioneDiBilancio;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public abstract class RicercaVariazioneBaseResponse<V extends VariazioneDiBilancio> extends RicercaSinteticaBaseResponse<V> {

	/**
	 * @return the variazioniDiBilancio
	 */
	public abstract ListaPaginata<V> getVariazioniDiBilancio();

	/**
	 * @param variazioniDiBilancio the variazioniDiBilancio to set
	 */
	public abstract void setVariazioniDiBilancio(ListaPaginata<V> variazioneCodifica);

	@Override
	protected ListaPaginataImpl<V> getAsListaPaginata() {
		return (ListaPaginataImpl<V>) getVariazioniDiBilancio();
	}

}
