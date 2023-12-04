/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
/**
 * 
 */
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacgenser.model.PrimaNota;
/**
 * @author antonino
 * @version 1.0.0 - 30-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaScrittureRegistroAByCespiteResponse extends RicercaSinteticaBaseResponse<PrimaNota> {

	
	@XmlElementWrapper(name = "primeNoteRegistroA")	    
	@XmlElement(name = "primaNotaRegistroA")
	private ListaPaginata<PrimaNota> listaPrimaNota = new ListaPaginataImpl<PrimaNota>();
	
	
	/**
	 * @return the listaTipoBenePrimaNota
	 */
	@XmlTransient
	public ListaPaginata<PrimaNota> getListaPrimaNota() {
		return listaPrimaNota;
	}

	/**
	 * Sets the lista prima nota.
	 *
	 * @param listaPrimaNota the new lista prima nota
	 */
	public void setListaPrimaNota(ListaPaginata<PrimaNota> listaPrimaNota) {
		this.listaPrimaNota = listaPrimaNota;
	}

	@Override
	protected ListaPaginataImpl<PrimaNota> getAsListaPaginata() {
		return (ListaPaginataImpl<PrimaNota>) getListaPrimaNota();
	}

}
