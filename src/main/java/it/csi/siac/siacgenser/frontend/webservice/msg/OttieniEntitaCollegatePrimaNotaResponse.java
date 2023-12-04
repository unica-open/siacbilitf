/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubAccertamento;
import it.csi.siac.siacfinser.model.SubImpegno;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;
import it.csi.siac.siacfinser.model.movgest.ModificaMovimentoGestioneEntrata;
import it.csi.siac.siacfinser.model.movgest.ModificaMovimentoGestioneSpesa;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;

/**
 * Classe di response per il servizio di recupero entit&agrave; collegate alla prima nota
 * @author Alessandro Marchino
 *
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class OttieniEntitaCollegatePrimaNotaResponse extends RicercaSinteticaBaseResponse<Entita> {

	@XmlElementWrapper(name = "entitaCollegate")
	@XmlElements({
		@XmlElement(name = "accertamento", type = Accertamento.class),
		@XmlElement(name = "subAccertamento", type = SubAccertamento.class),
		@XmlElement(name = "modificaMovimentoGestioneEntrata", type = ModificaMovimentoGestioneEntrata.class),
		
		@XmlElement(name = "impegno", type = Impegno.class),
		@XmlElement(name = "subImpegno", type = SubImpegno.class),
		@XmlElement(name = "modificaMovimentoGestioneSpesa", type = ModificaMovimentoGestioneSpesa.class),
		
		@XmlElement(name = "liquidazione", type = Liquidazione.class),
		
		@XmlElement(name = "subdocumentoEntrata", type = SubdocumentoEntrata.class),
		@XmlElement(name = "subdocumentoSpesa", type = SubdocumentoSpesa.class),
		@XmlElement(name = "entita", type = Entita.class),
	})
	private ListaPaginata<Entita> entitaCollegate = new ListaPaginataImpl<Entita>();

	/**
	 * @return the entitaCollegate
	 */
	@XmlTransient
	public ListaPaginata<Entita> getEntitaCollegate() {
		return entitaCollegate;
	}

	/**
	 * @param entitaCollegate the entitaCollegate to set
	 */
	public void setEntitaCollegate(ListaPaginata<Entita> entitaCollegate) {
		this.entitaCollegate = entitaCollegate != null ? entitaCollegate : new ListaPaginataImpl<Entita>();
	}

	@Override
	protected ListaPaginataImpl<Entita> getAsListaPaginata() {
		return (ListaPaginataImpl<Entita>) getEntitaCollegate();
	}
	
	
}
