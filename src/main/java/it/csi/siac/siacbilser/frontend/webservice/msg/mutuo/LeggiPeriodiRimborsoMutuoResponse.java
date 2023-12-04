/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.mutuo.PeriodoRimborsoMutuo;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class LeggiPeriodiRimborsoMutuoResponse extends ServiceResponse {

	private List<PeriodoRimborsoMutuo> listaPeriodoRimborsoMutuo;

	public List<PeriodoRimborsoMutuo> getListaPeriodoRimborsoMutuo() {
		return listaPeriodoRimborsoMutuo;
	}

	public void setListaPeriodoRimborsoMutuo(List<PeriodoRimborsoMutuo> listaPeriodoRimborsoMutuo) {
		this.listaPeriodoRimborsoMutuo = listaPeriodoRimborsoMutuo;
	}


}
