/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.mutuo.MovimentoGestioneAssociatoMutuo;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfinser.model.MovimentoGestione;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public abstract class RicercaMovimentiGestioneAssociatiMutuoResponse<MG extends MovimentoGestione, T extends MovimentoGestioneAssociatoMutuo<MG>> extends ServiceResponse {

	private List<T> movimentiAssociati = new ListaPaginataImpl<T>();

	protected void setMovimentiAssociati(List<T> listaMovimenti) {
		this.movimentiAssociati = listaMovimenti;
	}

	protected List<T> getMovimentiAssociati() {
		return movimentiAssociati;
	}
	
}
