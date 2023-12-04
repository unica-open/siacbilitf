/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
/**
 * 
 */
package it.csi.siac.siaccespser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.CategoriaCespiti;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacgenser.model.PrimaNota;

/**
 * @author elisa
 * @version 1.0.0 - 30-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaPrimeNotePerCespiteResponse extends RicercaSinteticaBaseResponse<CategoriaCespiti> {

	private List<PrimaNota> listaPrimaNota;

	/**
	 * @return the listaPrimaNota
	 */
	public List<PrimaNota> getListaPrimaNota() {
		return listaPrimaNota;
	}

	/**
	 * @param listaPrimaNota the listaPrimaNota to set
	 */
	public void setListaPrimaNota(List<PrimaNota> listaPrimaNota) {
		this.listaPrimaNota = listaPrimaNota;
	}

	
	@Override
	protected ListaPaginataImpl<CategoriaCespiti> getAsListaPaginata() {
		// TODO Auto-generated method stub
		return null;
	}

}
