/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.fcde;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.fcde.AccantonamentoFondiDubbiaEsigibilita;
import it.csi.siac.siacbilser.model.fcde.AccantonamentoFondiDubbiaEsigibilitaBase;
import it.csi.siac.siacbilser.model.fcde.AccantonamentoFondiDubbiaEsigibilitaGestione;
import it.csi.siac.siacbilser.model.fcde.AccantonamentoFondiDubbiaEsigibilitaRendiconto;
import it.csi.siac.siaccommon.util.collections.CollectionUtil;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Classe di response standard per l'FCDE
 * @author Alessandro Marchino
 * @version 1.0.0 - 15/04/2021
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public abstract class BaseAccantonamentoFondiDubbiaEsigibilitaResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaAccantonamenti")
	@XmlElements({
		@XmlElement(name = "accantonamentoFondoDubbiaEsigibilita", type = AccantonamentoFondiDubbiaEsigibilita.class),
		@XmlElement(name = "accantonamentoFondoDubbiaEsigibilitaRendiconto", type = AccantonamentoFondiDubbiaEsigibilitaRendiconto.class),
		@XmlElement(name = "accantonamentoFondiDubbiaEsigibilitaGestione", type = AccantonamentoFondiDubbiaEsigibilitaGestione.class),
		@XmlElement(name = "accantonamentoFondoDubbiaEsigibilitaBase", type = AccantonamentoFondiDubbiaEsigibilitaBase.class)
	})
	private List<AccantonamentoFondiDubbiaEsigibilitaBase<?>> listaAccantonamenti = new ArrayList<AccantonamentoFondiDubbiaEsigibilitaBase<?>>();

	/**
	 * @return the listaAccantonamenti
	 */
	public List<AccantonamentoFondiDubbiaEsigibilitaBase<?>> getListaAccantonamenti() {
		return this.listaAccantonamenti;
	}

	/**
	 * @param listaAccantonamenti the listaAccantonamenti to set
	 */
	@XmlTransient
	public void setListaAccantonamenti(List<AccantonamentoFondiDubbiaEsigibilitaBase<?>> listaAccantonamenti) {
		this.listaAccantonamenti = listaAccantonamenti;
	}

	/**
	 * Estrae gli accantonamenti per tipo
	 * @param <A> il tipo di accantonamento
	 * @param clazz la classe da estrarre
	 * @return i record relativi alla classe
	 */
	public <A extends AccantonamentoFondiDubbiaEsigibilitaBase<?>> List<A> extractByType(Class<A> clazz) {
		return CollectionUtil.extractByType(listaAccantonamenti, clazz);
	}
	
}
