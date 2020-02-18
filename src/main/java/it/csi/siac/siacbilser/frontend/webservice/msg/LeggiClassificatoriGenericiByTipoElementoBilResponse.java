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
import it.csi.siac.siacbilser.model.PerimetroSanitarioEntrata;
import it.csi.siac.siacbilser.model.PerimetroSanitarioSpesa;
import it.csi.siac.siacbilser.model.PoliticheRegionaliUnitarie;
import it.csi.siac.siacbilser.model.RicorrenteEntrata;
import it.csi.siac.siacbilser.model.RicorrenteSpesa;
import it.csi.siac.siacbilser.model.TipoAmbito;
import it.csi.siac.siacbilser.model.TipoFinanziamento;
import it.csi.siac.siacbilser.model.TipoFondo;
import it.csi.siac.siacbilser.model.TipoVincolo;
import it.csi.siac.siacbilser.model.TransazioneUnioneEuropeaEntrata;
import it.csi.siac.siacbilser.model.TransazioneUnioneEuropeaSpesa;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.TipologiaClassificatore;

/**
 * Messaggio di risposta per la lista dei classificatori ricercati per: anno
 * idEnteProprietario codiceTipoElementoBilancio.
 *
 * @author Domenico
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class LeggiClassificatoriGenericiByTipoElementoBilResponse extends
		ServiceResponse {
	
	
	@XmlElements({
		@XmlElement(name="classificatoreGenerico", type=ClassificatoreGenerico.class),
		
		//Generici
		@XmlElement(name="perimetroSanitarioSpesa", type=PerimetroSanitarioSpesa.class),
		@XmlElement(name="perimetroSanitarioEntrata", type=PerimetroSanitarioEntrata.class),
		@XmlElement(name="politicheRegionaliUnitarie", type=PoliticheRegionaliUnitarie.class),
		@XmlElement(name="ricorrenteEntrata", type=RicorrenteEntrata.class),
		@XmlElement(name="ricorrenteSpesa", type=RicorrenteSpesa.class),
		@XmlElement(name="tipoAmbito", type=TipoAmbito.class),
		@XmlElement(name="tipoAtto", type=TipoAtto.class),
		@XmlElement(name="tipoFinanziamento", type=TipoFinanziamento.class),
		@XmlElement(name="tipoFondo", type=TipoFondo.class),
		@XmlElement(name="tipoVincolo", type=TipoVincolo.class),
		@XmlElement(name="transazioneUnioneEuropeaEntrata", type=TransazioneUnioneEuropeaEntrata.class),
		@XmlElement(name="transazioneUnioneEuropeaSpesa", type=TransazioneUnioneEuropeaSpesa.class),
		
		})
	private List<ClassificatoreGenerico> classificatori = new ArrayList<ClassificatoreGenerico>();
	
	/**
	 * Gets the classificatori.
	 *
	 * @return the classificatori
	 */
	@XmlTransient
	public List<ClassificatoreGenerico> getClassificatori() {
		return classificatori;
	}

	/**
	 * Sets the classificatori.
	 *
	 * @param classificatori the new classificatori
	 */
	public void setClassificatori(List<ClassificatoreGenerico> classificatori) {
		this.classificatori = classificatori;
	}
	
	/**
	 * Ottiene i classificatori di un determinato tipo.
	 *
	 * @param <T> the generic type
	 * @param classifClazz - Classe del classificatore
	 * @return lisa dei classificatori del tipo specificato
	 */
	@SuppressWarnings("unchecked")
	public<T extends ClassificatoreGenerico> List<T> getClassificatori(Class<T> classifClazz) {
		
		final List<T> result = new ArrayList<T>();
		
		for (ClassificatoreGenerico c : classificatori) {			
			if(classifClazz.isInstance(c)){				
				result.add((T)c);
			}
		}
		
		return result;
	}
	
	/**
	 * Ottiene i classificatori ti una determinata {@link TipologiaClassificatore}.
	 *
	 * @param <T> the generic type
	 * @param tipologiaClassificatore the tipologia classificatore
	 * @return the classificatori
	 */
	@SuppressWarnings("unchecked")
	public<T extends ClassificatoreGenerico> List<T> getClassificatori(TipologiaClassificatore  tipologiaClassificatore) {
		
		final List<T> result = new ArrayList<T>();
		
		for (ClassificatoreGenerico c : classificatori) {		
			final String codiceTipologiaClassificatore = c.getTipoClassificatore()!=null?c.getTipoClassificatore().getCodice():null;
			if(tipologiaClassificatore.name().equals(codiceTipologiaClassificatore)){
				result.add((T)c);
			}
		}
		
		return result;
	}

	

	/**
	 * Gets the classificatori generici.
	 *
	 * @return the classificatori generici
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici() {
		return getClassificatori(ClassificatoreGenerico.class);
	}
	
	/**
	 * Gets the classificatori tipo fondo.
	 *
	 * @return the classificatori tipo fondo
	 */
	public List<TipoFondo> getClassificatoriTipoFondo() {
		return getClassificatori(TipoFondo.class);
	}
	
	/**
	 * Gets the classificatori tipo finanziamento.
	 *
	 * @return the classificatori tipo finanziamento
	 */
	public List<TipoFinanziamento> getClassificatoriTipoFinanziamento() {
		return getClassificatori(TipoFinanziamento.class);
	}
	
	/**
	 * Gets the classificatori politiche regionali unitarie.
	 *
	 * @return the classificatori politiche regionali unitarie
	 */
	public List<PoliticheRegionaliUnitarie> getClassificatoriPoliticheRegionaliUnitarie() {
		return getClassificatori(PoliticheRegionaliUnitarie.class);
	}
	
	/**
	 * Gets the classificatori ricorrente entrata.
	 *
	 * @return the classificatori ricorrente entrata
	 */
	public List<RicorrenteEntrata> getClassificatoriRicorrenteEntrata() {
		return getClassificatori(RicorrenteEntrata.class);
	}
	
	/**
	 * Gets the classificatori perimetro sanitario entrata.
	 *
	 * @return the classificatori perimetro sanitario entrata
	 */
	public List<PerimetroSanitarioEntrata> getClassificatoriPerimetroSanitarioEntrata() {
		return getClassificatori(PerimetroSanitarioEntrata.class);
	}
	
	/**
	 * Gets the classificatori transazione unione europea entrata.
	 *
	 * @return the classificatori transazione unione europea entrata
	 */
	public List<TransazioneUnioneEuropeaEntrata> getClassificatoriTransazioneUnioneEuropeaEntrata() {
		return getClassificatori(TransazioneUnioneEuropeaEntrata.class);
	}
	
	/**
	 * Gets the classificatori ricorrente spesa.
	 *
	 * @return the classificatori ricorrente spesa
	 */
	public List<RicorrenteSpesa> getClassificatoriRicorrenteSpesa() {
		return getClassificatori(RicorrenteSpesa.class);
	}
	
	/**
	 * Gets the classificatori perimetro sanitario spesa.
	 *
	 * @return the classificatori perimetro sanitario spesa
	 */
	public List<PerimetroSanitarioSpesa> getClassificatoriPerimetroSanitarioSpesa() {
		return getClassificatori(PerimetroSanitarioSpesa.class);
	}
	
	/**
	 * Gets the classificatori transazione unione europea spesa.
	 *
	 * @return the classificatori transazione unione europea spesa
	 */
	public List<TransazioneUnioneEuropeaSpesa> getClassificatoriTransazioneUnioneEuropeaSpesa() {
		return getClassificatori(TransazioneUnioneEuropeaSpesa.class);
	}
	
	/**
	 * Gets the classificatori generici1.
	 *
	 * @return the classificatori generici1
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici1() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_1);
	}
	
	/**
	 * Gets the classificatori generici2.
	 *
	 * @return the classificatori generici2
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici2() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_2);
	}
	
	/**
	 * Gets the classificatori generici3.
	 *
	 * @return the classificatori generici3
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici3() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_3);
	}
	
	/**
	 * Gets the classificatori generici4.
	 *
	 * @return the classificatori generici4
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici4() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_4);
	}
	
	/**
	 * Gets the classificatori generici5.
	 *
	 * @return the classificatori generici5
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici5() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_5);
	}
	
	/**
	 * Gets the classificatori generici6.
	 *
	 * @return the classificatori generici6
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici6() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_6);
	}
	
	/**
	 * Gets the classificatori generici7.
	 *
	 * @return the classificatori generici7
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici7() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_7);
	}
	
	/**
	 * Gets the classificatori generici8.
	 *
	 * @return the classificatori generici8
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici8() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_8);
	}
	
	/**
	 * Gets the classificatori generici9.
	 *
	 * @return the classificatori generici9
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici9() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_9);
	}
	
	/**
	 * Gets the classificatori generici10.
	 *
	 * @return the classificatori generici10
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici10() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_10);
	}
	
	/**
	 * Gets the classificatori generici31.
	 *
	 * @return the classificatori generici31
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici31() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_31);
	}
	
	/**
	 * Gets the classificatori generici32.
	 *
	 * @return the classificatori generici32
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici32() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_32);
	}
	
	/**
	 * Gets the classificatori generici33.
	 *
	 * @return the classificatori generici33
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici33() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_33);
	}
	
	/**
	 * Gets the classificatori generici34.
	 *
	 * @return the classificatori generici34
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici34() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_34);
	}
	
	/**
	 * Gets the classificatori generici35.
	 *
	 * @return the classificatori generici35
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici35() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_35);
	}
	
	/**
	 * Gets the classificatori generici36.
	 *
	 * @return the classificatori generici36
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici36() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_36);
	}
	
	/**
	 * Gets the classificatori generici37.
	 *
	 * @return the classificatori generici37
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici37() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_37);
	}
	
	/**
	 * Gets the classificatori generici38.
	 *
	 * @return the classificatori generici38
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici38() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_38);
	}
	
	/**
	 * Gets the classificatori generici39.
	 *
	 * @return the classificatori generici39
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici39() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_39);
	}
	
	/**
	 * Gets the classificatori generici40.
	 *
	 * @return the classificatori generici40
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici40() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_40);
	}
	
	/**
	 * Gets the classificatori generici41.
	 *
	 * @return the classificatori generici41
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici41() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_41);
	}
	
	/**
	 * Gets the classificatori generici42.
	 *
	 * @return the classificatori generici42
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici42() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_42);
	}
	
	/**
	 * Gets the classificatori generici43.
	 *
	 * @return the classificatori generici43
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici43() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_43);
	}
	
	/**
	 * Gets the classificatori generici44.
	 *
	 * @return the classificatori generici44
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici44() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_44);
	}
	
	/**
	 * Gets the classificatori generici45.
	 *
	 * @return the classificatori generici45
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici45() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_45);
	}
	
	/**
	 * Gets the classificatori generici46.
	 *
	 * @return the classificatori generici46
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici46() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_46);
	}
	
	/**
	 * Gets the classificatori generici47.
	 *
	 * @return the classificatori generici47
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici47() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_47);
	}
	
	/**
	 * Gets the classificatori generici48.
	 *
	 * @return the classificatori generici48
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici48() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_48);
	}
	
	/**
	 * Gets the classificatori generici49.
	 *
	 * @return the classificatori generici49
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici49() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_49);
	}
	
	/**
	 * Gets the classificatori generici50.
	 *
	 * @return the classificatori generici50
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici50() {
		return getClassificatori(TipologiaClassificatore.CLASSIFICATORE_50);
	}
	
}
