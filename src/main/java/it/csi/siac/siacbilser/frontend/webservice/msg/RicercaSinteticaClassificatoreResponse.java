/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Missione;
import it.csi.siac.siacbilser.model.SiopeEntrata;
import it.csi.siac.siacbilser.model.SiopeSpesa;
import it.csi.siac.siacbilser.model.TipoFinanziamento;
import it.csi.siac.siacbilser.model.TitoloEntrata;
import it.csi.siac.siacbilser.model.TitoloSpesa;
import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * Response per la ricerca sintetica dei classificatori. 
 * 
 * @author Marchino Alessandro
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaClassificatoreResponse extends RicercaSinteticaBaseResponse<Codifica> {
	
	@XmlElementWrapper(name = "listaCodifiche")
	@XmlElements({
		@XmlElement(name = "siopeSpesa", type = SiopeSpesa.class),
		@XmlElement(name = "siopeEntrata", type = SiopeEntrata.class),
		@XmlElement(name = "missione", type = Missione.class),
		@XmlElement(name = "titoloSpesa", type = TitoloSpesa.class),
		@XmlElement(name = "titoloEntrata", type = TitoloEntrata.class),
		@XmlElement(name = "tipoFinanziamento", type = TipoFinanziamento.class),
	})
	private ListaPaginata<Codifica> codifiche = new ListaPaginataImpl<Codifica>();

	/**
	 * @return the codifiche
	 */
	@XmlTransient
	public ListaPaginata<Codifica> getCodifiche() {
		return codifiche;
	}

	/**
	 * @param codifiche the codifiche to set
	 */
	public void setCodifiche(ListaPaginata<Codifica> codifiche) {
		this.codifiche = codifiche != null ? codifiche : new ListaPaginataImpl<Codifica>();
	}

	@Override
	protected ListaPaginataImpl<Codifica> getAsListaPaginata() {
		return (ListaPaginataImpl<Codifica>) codifiche;
	}

}
