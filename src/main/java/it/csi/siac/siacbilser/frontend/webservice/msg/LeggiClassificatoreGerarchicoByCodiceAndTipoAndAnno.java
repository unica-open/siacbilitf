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
import it.csi.siac.siacbilser.model.ClassificazioneCofogProgramma;
import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import it.csi.siac.siacbilser.model.Macroaggregato;
import it.csi.siac.siacbilser.model.Missione;
import it.csi.siac.siacbilser.model.Programma;
import it.csi.siac.siacbilser.model.SiopeEntrata;
import it.csi.siac.siacbilser.model.SiopeSpesa;
import it.csi.siac.siacbilser.model.TipologiaTitolo;
import it.csi.siac.siacbilser.model.TitoloSpesa;
import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siaccorser.model.TipologiaClassificatore;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class LeggiClassificatoreGerarchicoByCodiceAndTipoAndAnno extends ServiceRequest {
	
	@XmlElements({
		@XmlElement(name="classificatoreGerarchico", type=ClassificatoreGerarchico.class),
		
		//Gerarchici
		@XmlElement(name="categoriaTipologiaTitolo", type=CategoriaTipologiaTitolo.class),
		@XmlElement(name="classificazioneCofog", type=ClassificazioneCofog.class),
		@XmlElement(name="classificazioneCofogProgramma", type=ClassificazioneCofogProgramma.class),
		@XmlElement(name="elementoPianoDeiConti", type=ElementoPianoDeiConti.class),
		@XmlElement(name="macroaggregato", type=Macroaggregato.class),
		@XmlElement(name="missione", type=Missione.class),
		@XmlElement(name="programma", type=Programma.class),
		@XmlElement(name="siopeEntrata", type=SiopeEntrata.class),
		@XmlElement(name="siopeSpesa", type=SiopeSpesa.class),
		@XmlElement(name="strutturaAmministrativoContabile", type=StrutturaAmministrativoContabile.class),
		@XmlElement(name="tipologiaTitolo", type=TipologiaTitolo.class),
		@XmlElement(name="tipologiaTitolo", type=TipologiaTitolo.class),
		@XmlElement(name="titoloSpesa", type=TitoloSpesa.class),
	})
	private ClassificatoreGerarchico classificatore;
	private TipologiaClassificatore tipologiaClassificatore;
	private Integer anno;
	
	/**
	 * @return the classificatore
	 */
	@XmlTransient
	public ClassificatoreGerarchico getClassificatore() {
		return classificatore;
	}
	/**
	 * @param classificatore the classificatore to set
	 */
	public void setClassificatore(ClassificatoreGerarchico classificatore) {
		this.classificatore = classificatore;
	}
	/**
	 * @return the tipologiaClassificatore
	 */
	public TipologiaClassificatore getTipologiaClassificatore() {
		return tipologiaClassificatore;
	}
	/**
	 * @param tipologiaClassificatore the tipologiaClassificatore to set
	 */
	public void setTipologiaClassificatore(
			TipologiaClassificatore tipologiaClassificatore) {
		this.tipologiaClassificatore = tipologiaClassificatore;
	}
	/**
	 * @return the anno
	 */
	public Integer getAnno() {
		return anno;
	}
	/**
	 * @param anno the anno to set
	 */
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	
}
