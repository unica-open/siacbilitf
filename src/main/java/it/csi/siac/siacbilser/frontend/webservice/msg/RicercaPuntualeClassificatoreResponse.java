/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CategoriaTipologiaTitolo;
import it.csi.siac.siacbilser.model.ClassificazioneCofog;
import it.csi.siac.siacbilser.model.ContoCorrentePredocumentoEntrata;
import it.csi.siac.siacbilser.model.Macroaggregato;
import it.csi.siac.siacbilser.model.Missione;
import it.csi.siac.siacbilser.model.Programma;
import it.csi.siac.siacbilser.model.SiopeEntrata;
import it.csi.siac.siacbilser.model.SiopeSpesa;
import it.csi.siac.siacbilser.model.TipoFinanziamento;
import it.csi.siac.siacbilser.model.TipologiaTitolo;
import it.csi.siac.siacbilser.model.TitoloEntrata;
import it.csi.siac.siacbilser.model.TitoloSpesa;
import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaPuntualeClassificatoreResponse extends ServiceResponse {
	
	@XmlElements({
		@XmlElement(name = "missione", type = Missione.class),
		@XmlElement(name = "programma", type = Programma.class),
		@XmlElement(name = "classificazioneCofog", type = ClassificazioneCofog.class),
		@XmlElement(name = "titoloSpesa", type = TitoloSpesa.class),
		@XmlElement(name = "macroaggregato", type = Macroaggregato.class),
		@XmlElement(name = "siopeSpesa", type = SiopeSpesa.class),
		@XmlElement(name = "titoloEntrata", type = TitoloEntrata.class),
		@XmlElement(name = "tipologiaTitolo", type = TipologiaTitolo.class),
		@XmlElement(name = "categoriaTipologiaTitolo", type = CategoriaTipologiaTitolo.class),
		@XmlElement(name = "siopeEntrata", type = SiopeEntrata.class),
		@XmlElement(name = "tipoFinanziamento", type = TipoFinanziamento.class),
		@XmlElement(name = "contoCorrentePredocumentoEntrata", type = ContoCorrentePredocumentoEntrata.class),
	})
	private Codifica codifica;

	/**
	 * @return the codifica
	 */
	@XmlTransient
	public Codifica getCodifica() {
		return codifica;
	}

	/**
	 * @param codifica the codifica to set
	 */
	public void setCodifica(Codifica codifica) {
		this.codifica = codifica;
	}

	/**
	 * Estrae la lista di codifiche relative alla classe fornita
	 * @param clazz la classe da ricercare
	 * @return la lista delle codifiche di data classe
	 */
	@SuppressWarnings("unchecked")
	public <T> T extractByClass(Class<T> clazz) {
		if(clazz.isInstance(codifica)) {
			return (T) codifica;
		}
		return null;
	}


}
