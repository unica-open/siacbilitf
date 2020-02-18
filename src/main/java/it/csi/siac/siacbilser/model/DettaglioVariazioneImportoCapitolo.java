/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

/**
 * DettaglioVariazioneImportoCapitolo
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class DettaglioVariazioneImportoCapitolo extends Entita implements Cloneable {

	private static final long serialVersionUID = 72425391042385818L;

	private Boolean flagAnnullaCapitolo = Boolean.FALSE;
	private Boolean flagNuovoCapitolo = Boolean.FALSE;
	
	// SIAC-6883: rimosso annoCompetenza
	
	private BigDecimal stanziamento = BigDecimal.ZERO;
	
	private BigDecimal stanziamentoCassa = BigDecimal.ZERO;
	private BigDecimal stanziamentoResiduo = BigDecimal.ZERO;
	private BigDecimal fondoPluriennaleVinc = BigDecimal.ZERO;
	
	// SIAC-6883: aggiunti anni del pluriennale - cassa, residuo e FPV previsti ma commentati
	private BigDecimal stanziamento1 = BigDecimal.ZERO;
//	private BigDecimal stanziamentoCassa1 = BigDecimal.ZERO;
//	private BigDecimal stanziamentoResiduo1 = BigDecimal.ZERO;
//	private BigDecimal fondoPluriennaleVinc1 = BigDecimal.ZERO;
	
	private BigDecimal stanziamento2 = BigDecimal.ZERO;
//	private BigDecimal stanziamentoCassa2 = BigDecimal.ZERO;
//	private BigDecimal stanziamentoResiduo2 = BigDecimal.ZERO;
//	private BigDecimal fondoPluriennaleVinc2 = BigDecimal.ZERO;

	@XmlElements({
		@XmlElement(name = "capitoloUscitaPrevisione", type = CapitoloUscitaPrevisione.class),
		@XmlElement(name = "capitoloUscitaGestione", type = CapitoloUscitaGestione.class),
		@XmlElement(name = "capitoloEntrataPrevisione", type = CapitoloEntrataPrevisione.class),
		@XmlElement(name = "capitoloEntrataGestione", type = CapitoloEntrataGestione.class),
		@XmlElement(name = "capitolo", type = Capitolo.class)
	})
	private Capitolo capitolo;
	
	//SIAC-6881
	@XmlElementWrapper(name = "listaDettaglioVariazioneComponenteImportoCapitolo")
	@XmlElement(name = "dettaglioVariazioneComponenteImportoCapitolo")
	private List<DettaglioVariazioneComponenteImportoCapitolo> listaDettaglioVariazioneComponenteImportoCapitolo = new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>();
	// SIAC-6883: aggiunte componenti del pluriennale
	@XmlElementWrapper(name = "listaDettaglioVariazioneComponenteImportoCapitolo1")
	@XmlElement(name = "dettaglioVariazioneComponenteImportoCapitolo")
	private List<DettaglioVariazioneComponenteImportoCapitolo> listaDettaglioVariazioneComponenteImportoCapitolo1 = new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>();
	@XmlElementWrapper(name = "listaDettaglioVariazioneComponenteImportoCapitolo2")
	@XmlElement(name = "dettaglioVariazioneComponenteImportoCapitolo")
	private List<DettaglioVariazioneComponenteImportoCapitolo> listaDettaglioVariazioneComponenteImportoCapitolo2 = new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>();
	
	//aggiunto 2016/05
	private VariazioneImportoCapitolo variazioneImportoCapitolo;
	
	/**
	 * @return the flagAnnullaCapitolo
	 */
	public Boolean getFlagAnnullaCapitolo() {
		return this.flagAnnullaCapitolo;
	}

	/**
	 * @param flagAnnullaCapitolo the flagAnnullaCapitolo to set
	 */
	public void setFlagAnnullaCapitolo(Boolean flagAnnullaCapitolo) {
		this.flagAnnullaCapitolo = flagAnnullaCapitolo;
	}

	/**
	 * @return the flagNuovoCapitolo
	 */
	public Boolean getFlagNuovoCapitolo() {
		return this.flagNuovoCapitolo;
	}

	/**
	 * @param flagNuovoCapitolo the flagNuovoCapitolo to set
	 */
	public void setFlagNuovoCapitolo(Boolean flagNuovoCapitolo) {
		this.flagNuovoCapitolo = flagNuovoCapitolo;
	}

	/**
	 * @return the stanziamento
	 */
	public BigDecimal getStanziamento() {
		return this.stanziamento;
	}

	/**
	 * @param stanziamento the stanziamento to set
	 */
	public void setStanziamento(BigDecimal stanziamento) {
		this.stanziamento = stanziamento;
	}

	/**
	 * @return the stanziamentoCassa
	 */
	public BigDecimal getStanziamentoCassa() {
		return this.stanziamentoCassa;
	}

	/**
	 * @param stanziamentoCassa the stanziamentoCassa to set
	 */
	public void setStanziamentoCassa(BigDecimal stanziamentoCassa) {
		this.stanziamentoCassa = stanziamentoCassa;
	}

	/**
	 * @return the stanziamentoResiduo
	 */
	public BigDecimal getStanziamentoResiduo() {
		return this.stanziamentoResiduo;
	}

	/**
	 * @param stanziamentoResiduo the stanziamentoResiduo to set
	 */
	public void setStanziamentoResiduo(BigDecimal stanziamentoResiduo) {
		this.stanziamentoResiduo = stanziamentoResiduo;
	}

	/**
	 * @return the fondoPluriennaleVinc
	 */
	public BigDecimal getFondoPluriennaleVinc() {
		return this.fondoPluriennaleVinc;
	}

	/**
	 * @param fondoPluriennaleVinc the fondoPluriennaleVinc to set
	 */
	public void setFondoPluriennaleVinc(BigDecimal fondoPluriennaleVinc) {
		this.fondoPluriennaleVinc = fondoPluriennaleVinc;
	}

	/**
	 * @return the stanziamento1
	 */
	public BigDecimal getStanziamento1() {
		return this.stanziamento1;
	}

	/**
	 * @param stanziamento1 the stanziamento1 to set
	 */
	public void setStanziamento1(BigDecimal stanziamento1) {
		this.stanziamento1 = stanziamento1;
	}

	/**
	 * @return the stanziamento2
	 */
	public BigDecimal getStanziamento2() {
		return this.stanziamento2;
	}

	/**
	 * @param stanziamento2 the stanziamento2 to set
	 */
	public void setStanziamento2(BigDecimal stanziamento2) {
		this.stanziamento2 = stanziamento2;
	}

	/**
	 * @return the capitolo
	 */
	@XmlTransient
	public Capitolo getCapitolo() {
		return this.capitolo;
	}

	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(Capitolo capitolo) {
		this.capitolo = capitolo;
	}

	/**
	 * @return the variazioneImportoCapitolo
	 */
	public VariazioneImportoCapitolo getVariazioneImportoCapitolo() {
		return this.variazioneImportoCapitolo;
	}

	/**
	 * @param variazioneImportoCapitolo the variazioneImportoCapitolo to set
	 */
	public void setVariazioneImportoCapitolo(VariazioneImportoCapitolo variazioneImportoCapitolo) {
		this.variazioneImportoCapitolo = variazioneImportoCapitolo;
	}

	/**
	 * @return the listaDettaglioVariazioneComponenteImportoCapitolo
	 */
	@XmlTransient
	public List<DettaglioVariazioneComponenteImportoCapitolo> getListaDettaglioVariazioneComponenteImportoCapitolo() {
		return this.listaDettaglioVariazioneComponenteImportoCapitolo;
	}

	/**
	 * @param listaDettaglioVariazioneComponenteImportoCapitolo the listaDettaglioVariazioneComponenteImportoCapitolo to set
	 */
	public void setListaDettaglioVariazioneComponenteImportoCapitolo(List<DettaglioVariazioneComponenteImportoCapitolo> listaDettaglioVariazioneComponenteImportoCapitolo) {
		this.listaDettaglioVariazioneComponenteImportoCapitolo = listaDettaglioVariazioneComponenteImportoCapitolo != null ? listaDettaglioVariazioneComponenteImportoCapitolo : new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>();
	}

	/**
	 * @return the listaDettaglioVariazioneComponenteImportoCapitolo1
	 */
	@XmlTransient
	public List<DettaglioVariazioneComponenteImportoCapitolo> getListaDettaglioVariazioneComponenteImportoCapitolo1() {
		return this.listaDettaglioVariazioneComponenteImportoCapitolo1;
	}

	/**
	 * @param listaDettaglioVariazioneComponenteImportoCapitolo1 the listaDettaglioVariazioneComponenteImportoCapitolo1 to set
	 */
	public void setListaDettaglioVariazioneComponenteImportoCapitolo1(List<DettaglioVariazioneComponenteImportoCapitolo> listaDettaglioVariazioneComponenteImportoCapitolo1) {
		this.listaDettaglioVariazioneComponenteImportoCapitolo1 = listaDettaglioVariazioneComponenteImportoCapitolo1 != null ? listaDettaglioVariazioneComponenteImportoCapitolo1 : new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>();
	}

	/**
	 * @return the listaDettaglioVariazioneComponenteImportoCapitolo2
	 */
	@XmlTransient
	public List<DettaglioVariazioneComponenteImportoCapitolo> getListaDettaglioVariazioneComponenteImportoCapitolo2() {
		return this.listaDettaglioVariazioneComponenteImportoCapitolo2;
	}

	/**
	 * @param listaDettaglioVariazioneComponenteImportoCapitolo2 the listaDettaglioVariazioneComponenteImportoCapitolo2 to set
	 */
	public void setListaDettaglioVariazioneComponenteImportoCapitolo2(List<DettaglioVariazioneComponenteImportoCapitolo> listaDettaglioVariazioneComponenteImportoCapitolo2) {
		this.listaDettaglioVariazioneComponenteImportoCapitolo2 = listaDettaglioVariazioneComponenteImportoCapitolo2 != null ? listaDettaglioVariazioneComponenteImportoCapitolo2 : new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>();
	}

	@Override
	public DettaglioVariazioneImportoCapitolo clone() {
		DettaglioVariazioneImportoCapitolo dvic;
		try {
			dvic = (DettaglioVariazioneImportoCapitolo) super.clone();
		} catch (CloneNotSupportedException e) {
			// Should never happen... Yet, rethrow
			throw new IllegalStateException("Unsupported clone", e);
		}
		
		// Clear lists
		dvic.setListaDettaglioVariazioneComponenteImportoCapitolo(new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>());
		dvic.setListaDettaglioVariazioneComponenteImportoCapitolo1(new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>());
		dvic.setListaDettaglioVariazioneComponenteImportoCapitolo2(new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>());
		return dvic;
	}
	
	public DettaglioVariazioneImportoCapitolo abs() {
		final DettaglioVariazioneImportoCapitolo dvic = this.clone();
		dvic.setStanziamento(abs(stanziamento));
		dvic.setStanziamento1(abs(stanziamento1));
		dvic.setStanziamento2(abs(stanziamento2));
		dvic.setStanziamentoCassa(abs(stanziamentoCassa));
		dvic.setStanziamentoResiduo(abs(stanziamentoResiduo));
		dvic.setFondoPluriennaleVinc(abs(fondoPluriennaleVinc));
		return dvic;
	}
	
	public DettaglioVariazioneImportoCapitolo add(DettaglioVariazioneImportoCapitolo dvicToAdd) {
		final DettaglioVariazioneImportoCapitolo dvic = this.clone();
		if(dvicToAdd == null){
			return dvic;
		}
		
		dvic.operate(ImportoDettaglioVariazione.STANZIAMENTO,  OperazioneImporto.ADD, dvic.getStanziamento());
		dvic.operate(ImportoDettaglioVariazione.STANZIAMENTO1, OperazioneImporto.ADD, dvic.getStanziamento1());
		dvic.operate(ImportoDettaglioVariazione.STANZIAMENTO2, OperazioneImporto.ADD, dvic.getStanziamento2());
		dvic.operate(ImportoDettaglioVariazione.STANZIAMENTO_CASSA,  OperazioneImporto.ADD, dvic.getStanziamentoCassa());
		dvic.operate(ImportoDettaglioVariazione.STANZIAMENTO_RESIDUO,  OperazioneImporto.ADD, dvic.getStanziamentoResiduo());
		dvic.operate(ImportoDettaglioVariazione.FONDO_PLURIENNALE_VINC,  OperazioneImporto.ADD, dvic.getFondoPluriennaleVinc());
		return dvic;
	}
	
	public DettaglioVariazioneImportoCapitolo subtract(DettaglioVariazioneImportoCapitolo dvicToSubtract) {
		final DettaglioVariazioneImportoCapitolo dvic = this.clone();
		if(dvicToSubtract==null){
			return dvic;
		}
		dvic.operate(ImportoDettaglioVariazione.STANZIAMENTO,  OperazioneImporto.SUBTRACT, dvic.getStanziamento());
		dvic.operate(ImportoDettaglioVariazione.STANZIAMENTO1, OperazioneImporto.SUBTRACT, dvic.getStanziamento1());
		dvic.operate(ImportoDettaglioVariazione.STANZIAMENTO2, OperazioneImporto.SUBTRACT, dvic.getStanziamento2());
		dvic.operate(ImportoDettaglioVariazione.STANZIAMENTO_CASSA,  OperazioneImporto.SUBTRACT, dvic.getStanziamentoCassa());
		dvic.operate(ImportoDettaglioVariazione.STANZIAMENTO_RESIDUO,  OperazioneImporto.SUBTRACT, dvic.getStanziamentoResiduo());
		dvic.operate(ImportoDettaglioVariazione.FONDO_PLURIENNALE_VINC,  OperazioneImporto.SUBTRACT, dvic.getFondoPluriennaleVinc());
		return dvic;
	}
	
	/**
	 * Ottiene la lista di tutti i dettagli della variazione
	 * @return la lista con tutti i dettagli
	 */
	public List<DettaglioVariazioneComponenteImportoCapitolo> obtainAllListaDettaglioVariazioneComponenteImportoCapitolo() {
		List<DettaglioVariazioneComponenteImportoCapitolo> res = new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>();
		res.addAll(listaDettaglioVariazioneComponenteImportoCapitolo);
		res.addAll(listaDettaglioVariazioneComponenteImportoCapitolo1);
		res.addAll(listaDettaglioVariazioneComponenteImportoCapitolo2);
		
		return res;
	}
	
	private void operate(ImportoDettaglioVariazione tipo, OperazioneImporto operazione, BigDecimal value) {
		if(value == null){
			return;
		}
		BigDecimal importoAttuale;
		switch(tipo) {
			case STANZIAMENTO:  importoAttuale = this.stanziamento;  break;
			case STANZIAMENTO1: importoAttuale = this.stanziamento1; break;
			case STANZIAMENTO2: importoAttuale = this.stanziamento2; break;
			case STANZIAMENTO_CASSA: importoAttuale = this.stanziamentoCassa; break;
			case STANZIAMENTO_RESIDUO: importoAttuale = this.stanziamentoResiduo; break;
			case FONDO_PLURIENNALE_VINC: importoAttuale = this.fondoPluriennaleVinc; break;
			default: importoAttuale = null;
		}
		if(importoAttuale == null) {
			importoAttuale = BigDecimal.ZERO;
		}
		BigDecimal result = operazione.operate(importoAttuale, value);
		switch(tipo) {
		case STANZIAMENTO:  this.stanziamento = result;  break;
		case STANZIAMENTO1: this.stanziamento1 = result; break;
		case STANZIAMENTO2: this.stanziamento2 = result; break;
		case STANZIAMENTO_CASSA: this.stanziamentoCassa = result; break;
		case STANZIAMENTO_RESIDUO: this.stanziamentoResiduo = result; break;
		case FONDO_PLURIENNALE_VINC: this.fondoPluriennaleVinc = result; break;
		default: importoAttuale = null;
	}
	}
	/**
	 * Calcola il valore assoluto di un BigDecimal
	 * @param value il valore di cui calcolare il valore assoluto
	 * @return il valore in assoluto
	 */
	private BigDecimal abs(BigDecimal value) {
		return value != null ? value.abs() : null;
	}
	
	/**
	 * Importi del dettaglio della variazione
	 * @author Marchino Alessandro
	 * @version 1.0.0 - 23/10/2019
	 *
	 */
	private static enum ImportoDettaglioVariazione {
		/** Stanziamento per l'anno di esercizio */
		STANZIAMENTO,
		/** Stanziamento di cassa per l'anno di esercizio */
		STANZIAMENTO_CASSA,
		/** Stanziamento residuo per l'anno di esercizio */
		STANZIAMENTO_RESIDUO,
		/** FPV per l'anno di esercizio */
		FONDO_PLURIENNALE_VINC,
		/** Stanziamento per l'anno di esercizio + 1 */
		STANZIAMENTO1,
		/** Stanziamento per l'anno di esercizio + 2 */
		STANZIAMENTO2,
		;
	}
	
	/**
	 * Operazione sugli importi del dettaglio della variazione
	 * @author Marchino Alessandro
	 * @version 1.0.0 - 23/10/2019
	 *
	 */
	private static enum OperazioneImporto {
		/** Aggiunge gli importi */
		ADD {
			@Override
			BigDecimal operate(BigDecimal first, BigDecimal second) {
				return first.add(second);
			}
		},
		/** Sottrae gli importi */
		SUBTRACT {
			@Override
			BigDecimal operate(BigDecimal first, BigDecimal second) {
				return first.subtract(second);
			}
		},
		;
		abstract BigDecimal operate(BigDecimal first, BigDecimal second);
	}
	
}
