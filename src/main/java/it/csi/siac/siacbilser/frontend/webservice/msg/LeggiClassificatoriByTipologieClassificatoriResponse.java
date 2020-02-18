/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ClassificatoreStipendi;
import it.csi.siac.siacbilser.model.ContoCorrentePredocumentoEntrata;
import it.csi.siac.siacbilser.model.Missione;
import it.csi.siac.siacbilser.model.SiopeEntrata;
import it.csi.siac.siacbilser.model.SiopeSpesa;
import it.csi.siac.siacbilser.model.TipoFinanziamento;
import it.csi.siac.siacbilser.model.TitoloEntrata;
import it.csi.siac.siacbilser.model.TitoloSpesa;
import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Response per la ricerca sintetica dei classificatori. 
 * 
 * @author Elisa chiari
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class LeggiClassificatoriByTipologieClassificatoriResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaCodifiche")
	@XmlElements({
		@XmlElement(name = "siopeSpesa", type = SiopeSpesa.class),
		@XmlElement(name = "siopeEntrata", type = SiopeEntrata.class),
		@XmlElement(name = "missione", type = Missione.class),
		@XmlElement(name = "titoloSpesa", type = TitoloSpesa.class),
		@XmlElement(name = "titoloEntrata", type = TitoloEntrata.class),
		@XmlElement(name = "tipoFinanziamento", type = TipoFinanziamento.class),
		@XmlElement(name = "contoCorrentePredocumentoEntrata", type = ContoCorrentePredocumentoEntrata.class),
		@XmlElement(name = "classificatoreStipendi", type = ClassificatoreStipendi.class),
	})
	private List<Codifica> codifiche = new ArrayList<Codifica>();

	/**
	 * @return the codifiche
	 */
	@XmlTransient
	public List<Codifica> getCodifiche() {
		return codifiche;
	}

	/**
	 * @param codifiche the codifiche to set
	 */
	public void setCodifiche(List<Codifica> codifiche) {
		this.codifiche = codifiche != null ? codifiche : new ArrayList<Codifica>();
	}

	/**
	 * Estrae la lista di codifiche relative alla classe fornita
	 * @param clazz la classe da ricercare
	 * @return la lista delle codifiche di data classe
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> extractByClass(Class<T> clazz) {
		final List<T> res = new ArrayList<T>();
		
		for(Codifica c : codifiche) {
			if(clazz.isInstance(c)) {
				res.add((T) c);
			}
		}
		
		return res;
	}


}
