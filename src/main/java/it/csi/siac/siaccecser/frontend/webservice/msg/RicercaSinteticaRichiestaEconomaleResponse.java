/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.RichiestaEconomale;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaSinteticaRichiestaEconomaleResponse extends RicercaSinteticaBaseResponse<RichiestaEconomale> {
	
	@XmlElementWrapper(name = "listaRichiesteEconomali")
	@XmlElement(name = "richiestaEconomale")
	private ListaPaginata<RichiestaEconomale> richiesteEconomali = new ListaPaginataImpl<RichiestaEconomale>();
	private BigDecimal totaleImporti;

	@XmlTransient
	public ListaPaginata<RichiestaEconomale> getRichiesteEconomali() {
		return richiesteEconomali;
	}

	public void setRichiesteEconomali(ListaPaginata<RichiestaEconomale> richiesteEconomali) {
		this.richiesteEconomali = richiesteEconomali;
	}
	
	public BigDecimal getTotaleImporti() {
		return totaleImporti;
	}

	public void setTotaleImporti(BigDecimal totaleImporti) {
		this.totaleImporti = totaleImporti;
	}

	@Override
	protected ListaPaginataImpl<RichiestaEconomale> getAsListaPaginata() {
		return (ListaPaginataImpl<RichiestaEconomale>)richiesteEconomali;
	}

}
