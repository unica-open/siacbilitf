/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.TipoAtto;
import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CategoriaTipologiaTitolo;
import it.csi.siac.siacbilser.model.ClassificazioneCofog;
import it.csi.siac.siacbilser.model.ClassificazioneCofogProgramma;
import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import it.csi.siac.siacbilser.model.Macroaggregato;
import it.csi.siac.siacbilser.model.Missione;
import it.csi.siac.siacbilser.model.PerimetroSanitarioEntrata;
import it.csi.siac.siacbilser.model.PerimetroSanitarioSpesa;
import it.csi.siac.siacbilser.model.PoliticheRegionaliUnitarie;
import it.csi.siac.siacbilser.model.Programma;
import it.csi.siac.siacbilser.model.RicorrenteEntrata;
import it.csi.siac.siacbilser.model.RicorrenteSpesa;
import it.csi.siac.siacbilser.model.SiopeEntrata;
import it.csi.siac.siacbilser.model.SiopeSpesa;
import it.csi.siac.siacbilser.model.TipoAmbito;
import it.csi.siac.siacbilser.model.TipoFinanziamento;
import it.csi.siac.siacbilser.model.TipoFondo;
import it.csi.siac.siacbilser.model.TipoVincolo;
import it.csi.siac.siacbilser.model.TipologiaTitolo;
import it.csi.siac.siacbilser.model.TitoloEntrata;
import it.csi.siac.siacbilser.model.TitoloSpesa;
import it.csi.siac.siacbilser.model.TransazioneUnioneEuropeaEntrata;
import it.csi.siac.siacbilser.model.TransazioneUnioneEuropeaSpesa;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;
import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

/**
 * Messaggio di risposta per la lista dei classificatori 
 * 
 * @author Domenico Lisi
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class LeggiClassificatoriByRelazioneResponse extends ServiceResponse {
	
	

	@XmlElements({
		@XmlElement(name="ClassificatoreGerarchico", type=ClassificatoreGerarchico.class),
		@XmlElement(name="ClassificatoreGenerico", type=ClassificatoreGenerico.class),
		
		//Gerarchici
		@XmlElement(name="CategoriaTipologiaTitolo", type=CategoriaTipologiaTitolo.class),
		@XmlElement(name="ClassificazioneCofog", type=ClassificazioneCofog.class),
		@XmlElement(name="ClassificazioneCofogProgramma", type=ClassificazioneCofogProgramma.class),		
		@XmlElement(name="ElementoPianoDeiConti", type=ElementoPianoDeiConti.class),
		@XmlElement(name="Macroaggregato", type=Macroaggregato.class),
		@XmlElement(name="Missione", type=Missione.class),
		@XmlElement(name="Programma", type=Programma.class),		
		@XmlElement(name="SiopeEntrata", type=SiopeEntrata.class),
		@XmlElement(name="SiopeSpesa", type=SiopeSpesa.class),		
		@XmlElement(name="StrutturaAmministrativoContabile", type=StrutturaAmministrativoContabile.class),		
		@XmlElement(name="TipologiaTitolo", type=TipologiaTitolo.class),		
		@XmlElement(name="TipologiaTitolo", type=TipologiaTitolo.class),
		@XmlElement(name="TitoloSpesa", type=TitoloSpesa.class),
		@XmlElement(name="TitoloEntrata", type=TitoloEntrata.class),
		
		//Generici
		@XmlElement(name="PerimetroSanitarioSpesa", type=PerimetroSanitarioSpesa.class),
		@XmlElement(name="PerimetroSanitarioEntrata", type=PerimetroSanitarioEntrata.class),
		@XmlElement(name="PoliticheRegionaliUnitarie", type=PoliticheRegionaliUnitarie.class),
		@XmlElement(name="RicorrenteEntrata", type=RicorrenteEntrata.class),
		@XmlElement(name="RicorrenteSpesa", type=RicorrenteSpesa.class),
		@XmlElement(name="TipoAmbito", type=TipoAmbito.class),
		@XmlElement(name="TipoAtto", type=TipoAtto.class),
		@XmlElement(name="TipoFinanziamento", type=TipoFinanziamento.class),
		@XmlElement(name="TipoFondo", type=TipoFondo.class),
		@XmlElement(name="TipoVincolo", type=TipoVincolo.class),
		@XmlElement(name="TransazioneUnioneEuropeaEntrata", type=TransazioneUnioneEuropeaEntrata.class),
		@XmlElement(name="TransazioneUnioneEuropeaSpesa", type=TransazioneUnioneEuropeaSpesa.class),
		
		
		
		})
	private List<Codifica> classificatori = new ArrayList<Codifica>();
	
	@XmlTransient
	public List<Codifica> getClassificatori() {
		return classificatori;
	}

	public void setClassificatori(List<Codifica> classificatori) {
		this.classificatori = classificatori;
	}
	
	/**
	 * Ottiene i classificatori di un determinato tipo.
	 * 
	 * @param classifClazz - Classe del classificatore
	 * @return lisa dei classificatori del tipo specificato
	 */
	@SuppressWarnings("unchecked")
	public<T extends Codifica> List<T> getClassificatori(Class<T> classifClazz) {
		
		final List<T> result = new ArrayList<T>();
		
		for (Codifica c : classificatori) {			
			if(classifClazz.isInstance(c)){				
				result.add((T)c);
			}
		}
		
		return result;
	}

	public List<ClassificazioneCofog> getClassificatoriClassificazioneCofog() {
		return getClassificatori(ClassificazioneCofog.class);
	}
	
	public List<ElementoPianoDeiConti> getClassificatoriElementoPianoDeiConti() {
		return getClassificatori(ElementoPianoDeiConti.class);
	}

	public List<ClassificatoreGerarchico> getClassificatoriGerarchici() {		
		return getClassificatori(ClassificatoreGerarchico.class);
	}

	public List<ClassificatoreGenerico> getClassificatoriGenerici() {
		return getClassificatori(ClassificatoreGenerico.class);
	}

	public List<Programma> getClassificatoriProgramma() {
		return getClassificatori(Programma.class);
	}
	
	public List<Macroaggregato> getClassificatoriMacroaggregato() {
		return getClassificatori(Macroaggregato.class);
	}	
	
	public List<TipologiaTitolo> getClassificatoriTipologiaTitolo() {
		return getClassificatori(TipologiaTitolo.class);
	}
	
	public List<TipoFinanziamento> getClassificatoriTipoFinanziamento() {
		return getClassificatori(TipoFinanziamento.class);
	}
	
	public List<CategoriaTipologiaTitolo> getClassificatoriCategoriaTipologiaTitolo() {
		return getClassificatori(CategoriaTipologiaTitolo.class);
	}
	
	public List<TitoloEntrata> getClassificatoriTitoloEntrata() {
		return getClassificatori(TitoloEntrata.class);
	}
	
	public List<TitoloSpesa> getClassificatoriTitoloSpesa() {
		return getClassificatori(TitoloSpesa.class);
	}
	

}
