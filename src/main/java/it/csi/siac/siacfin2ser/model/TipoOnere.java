/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.Ente;

/**
 * Tipo Onere.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class TipoOnere extends Codifica {
	
	private static final long serialVersionUID = -7596443540572295032L;
	
	private Ente ente;
	//attributi
//	private BigDecimal aliquotaCaricoSoggetto = BigDecimal.ZERO;
//	private BigDecimal aliquotaCaricoEnte = BigDecimal.ZERO;
	
	private BigDecimal aliquotaCaricoSoggetto;
	private BigDecimal aliquotaCaricoEnte;
	
	private String quadro770;
	
	private NaturaOnere naturaOnere;
	private List<AttivitaOnere> attivitaOnere = new ArrayList<AttivitaOnere>();
	
	@XmlElements({
		@XmlElement(name="causali770", type=Causale770.class),
		@XmlElement(name="causaliSpesa", type=CausaleSpesa.class),
		@XmlElement(name="causaliEntrata", type=CausaleEntrata.class)
	})
	private List<Causale> causali = new ArrayList<Causale>();
	private List<CodiceSommaNonSoggetta> codiciSommaNonSoggetta = new ArrayList<CodiceSommaNonSoggetta>();
	
	
	private transient List<Object> objects = new ArrayList<Object>();
	
	
//	private List<Causale770> causali770 = new ArrayList<Causale770>();
//	private List<CausaleSpesa> causaliSpesa = new ArrayList<CausaleSpesa>();
//	private List<CausaleEntrata> causaliEntrata = new ArrayList<CausaleEntrata>();
	
	// Lotto L
	private TipoIvaSplitReverse tipoIvaSplitReverse;
	
	/**
 * Gets the causali.
 *
 * @return the causali
 */
	@XmlTransient
	public List<Causale> getCausali() {
		return causali;
	}

	/**
	 * Gets the ente.
	 *
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * Sets the ente.
	 *
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	/**
	 * Sets the causali.
	 *
	 * @param causali the causali to set
	 */
	public void setCausali(List<Causale> causali) {
		this.causali = causali != null ? causali : new ArrayList<Causale>();
	}
	
	/**
	 * add causale.
	 *
	 * @param causale the causale
	 */
	public void addCausale(Causale causale) {
		this.causali.add(causale);
	}

	/**
	 * Gets the causali770.
	 *
	 * @return the causali770
	 */
	public List<Causale770> getCausali770() {
		return getCausali(Causale770.class);
	}
	
	/**
	 * Gets the causali spesa.
	 *
	 * @return the CausaleSpesa
	 */
	public List<CausaleSpesa> getCausaliSpesa() {
		return getCausali(CausaleSpesa.class);
	}
	
	/**
	 * Gets the causali entrata.
	 *
	 * @return the CausaleEntrata
	 */
	public List<CausaleEntrata> getCausaliEntrata() {
		return getCausali(CausaleEntrata.class);
	}
	
	/**
	 * Gets the causali.
	 *
	 * @param <T> the generic type
	 * @param clazz the clazz
	 * @return the causali
	 */
	@SuppressWarnings("unchecked")
	public <T extends Causale> List<T> getCausali(Class<T> clazz) {
		final List<T> result = new ArrayList<T>();
		for(Causale c : causali) {
			if(clazz.isInstance(c)) {
				result.add((T)c);
			}
		}
		return result;
	}

	/**
	 * Gets the attivita onere.
	 *
	 * @return the attivitaOnere
	 */
	public List<AttivitaOnere> getAttivitaOnere() {
		return attivitaOnere;
	}

	/**
	 * Sets the attivita onere.
	 *
	 * @param attivitaOnere the attivitaOnere to set
	 */
	public void setAttivitaOnere(List<AttivitaOnere> attivitaOnere) {
		this.attivitaOnere = attivitaOnere != null ? attivitaOnere : new ArrayList<AttivitaOnere>();
	}

	/**
	 * Gets the aliquota carico soggetto.
	 *
	 * @return the aliquotaCaricoSoggetto
	 */
	public BigDecimal getAliquotaCaricoSoggetto() {
		return aliquotaCaricoSoggetto;
	}

	/**
	 * Sets the aliquota carico soggetto.
	 *
	 * @param aliquotaCaricoSoggetto the aliquotaCaricoSoggetto to set
	 */
	public void setAliquotaCaricoSoggetto(BigDecimal aliquotaCaricoSoggetto) {
//		if(aliquotaCaricoSoggetto == null) {
//			aliquotaCaricoSoggetto = BigDecimal.ZERO;
//		}
		this.aliquotaCaricoSoggetto = aliquotaCaricoSoggetto;
	}

	/**
	 * Gets the aliquota carico ente.
	 *
	 * @return the aliquotaCaricoEnte
	 */
	public BigDecimal getAliquotaCaricoEnte() {
		return aliquotaCaricoEnte;
	}

	/**
	 * Sets the aliquota carico ente.
	 *
	 * @param aliquotaCaricoEnte the aliquotaCaricoEnte to set
	 */
	public void setAliquotaCaricoEnte(BigDecimal aliquotaCaricoEnte) {
//		if(aliquotaCaricoEnte == null) {
//			aliquotaCaricoEnte = BigDecimal.ZERO;
//		}
		this.aliquotaCaricoEnte = aliquotaCaricoEnte;
	}

	/**
	 * Gets the quadro770.
	 *
	 * @return the quadro770
	 */
	public String getQuadro770() {
		return quadro770;
	}

	/**
	 * Sets the quadro770.
	 *
	 * @param quadro770 the quadro770 to set
	 */
	public void setQuadro770(String quadro770) {
		this.quadro770 = quadro770;
	}

	/**
	 * Gets the natura onere.
	 *
	 * @return the naturaOnere
	 */
	public NaturaOnere getNaturaOnere() {
		return naturaOnere;
	}

	/**
	 * Sets the natura onere.
	 *
	 * @param naturaOnere the naturaOnere to set
	 */
	public void setNaturaOnere(NaturaOnere naturaOnere) {
		this.naturaOnere = naturaOnere;
	}
	
	/**
	 * @return the tipoIvaSplitReverse
	 */
	public TipoIvaSplitReverse getTipoIvaSplitReverse() {
		return tipoIvaSplitReverse;
	}

	/**
	 * @param tipoIvaSplitReverse the tipoIvaSplitReverse to set
	 */
	public void setTipoIvaSplitReverse(TipoIvaSplitReverse tipoIvaSplitReverse) {
		this.tipoIvaSplitReverse = tipoIvaSplitReverse;
	}
	
	/**
	 * @return the codiciSommaNonSoggetta
	 */
	public List<CodiceSommaNonSoggetta> getCodiciSommaNonSoggetta() {
		return codiciSommaNonSoggetta;
	}

	/**
	 * @param codiciSommaNonSoggetta the codiciSommaNonSoggetta to set
	 */
	public void setCodiciSommaNonSoggetta(List<CodiceSommaNonSoggetta> codiciSommaNonSoggetta) {
		this.codiciSommaNonSoggetta = codiciSommaNonSoggetta != null ? codiciSommaNonSoggetta : new ArrayList<CodiceSommaNonSoggetta>();
	}

	/**
	 * Gets the data creazione onere.
	 *
	 * @return the dataCreazioneOnere
	 */
	public Date getDataCreazioneOnere() {
		return this.getDataCreazione();
	}
	
	/**
	 * Sets the data creazione onere.
	 *
	 * @param dataCreazioneOnere the dataCreazioneCausale to set
	 */
	public void setDataCreazioneOnere(Date dataCreazioneOnere) {
		this.setDataCreazione(dataCreazioneOnere);
	}
	
	
	/**
	 * Gets the data inizio validita onere.
	 *
	 * @return the dataFineValiditaOnere
	 */
	public Date getDataInizioValiditaOnere() {
		return this.getDataInizioValidita();
	}
	
	/**
	 * Sets the data inizio validita onere.
	 *
	 * @param dataInizioValiditaOnere the dataInizioValiditaOnere to set
	 */
	public void setDataInizioValiditaOnere(Date dataInizioValiditaOnere) {
		this.setDataInizioValidita(dataInizioValiditaOnere);
	}
	
	
	/**
	 * Gets the data fine validita onere.
	 *
	 * @return the dataFineValiditaOnere
	 */
	public Date getDataFineValiditaOnere() {
		return this.getDataFineValidita();
	}
	
	/**
	 * Sets the data fine validita onere.
	 *
	 * @param dataFineValiditaOnere the dataFineValiditaOnere to set
	 */
	public void setDataFineValiditaOnere(Date dataFineValiditaOnere) {
		this.setDataFineValidita(dataFineValiditaOnere);
	}
	
	
	/**
	 * Gets the data modifica onere.
	 *
	 * @return the data modifica onere
	 */
	public Date getDataModificaOnere() {
		return this.getDataModifica();
	}
	
	/**
	 * Sets the data modifica onere.
	 *
	 * @param dataModifica the new data modifica onere
	 */
	public void setDataModificaOnere(Date dataModifica) {
		this.setDataModifica(dataModifica);
	}

	public BigDecimal getAliquotaCaricoSoggettoNotNull() {
		return this.getAliquotaCaricoSoggetto() != null ? this.getAliquotaCaricoSoggetto() : BigDecimal.ZERO;
	}

	public BigDecimal getAliquotaCaricoEnteNotNull() {
		return this.getAliquotaCaricoEnte() != null ? this.getAliquotaCaricoEnte() : BigDecimal.ZERO;
	}

	/**
	 * @return the objects
	 */
	@XmlTransient
	public List<Object> getObjects() {
		return objects;
	}

	/**
	 * @param objects the objects to set
	 */
	public void setObjects(List<Object> objects) {
		this.objects = objects != null ? objects : new ArrayList<Object>();
	}
	
	/**
	 * Adds the ojbect.
	 *
	 * @param oject the oject
	 */
	public void addObject(Object oject){
		this.objects.add(oject);
	}
	
}
