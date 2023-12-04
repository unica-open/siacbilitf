/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import it.csi.siac.siacgenser.model.TipoCausale;

/**
 * The Enum ContiTipoBeneEnum.
 */
public enum EventoRegistroACespiteSelector {
	
	/** The Acquisto. */                               /* INSERIMENTO, COLLEGAMENTO*/
	Acquisto(new String[] {"ACQ"}, TipoCausale.Libera, Boolean.TRUE,  Boolean.FALSE), // acquisto
	
	/** The Modifica valore. */
	ModificaValore(new String[] {"MVA"}, TipoCausale.Libera,  Boolean.TRUE,  Boolean.FALSE), // modifica valore
	                                                           
	/** The Vendita. */
	Vendita(new String[] {"VEN"}, TipoCausale.Libera,  Boolean.FALSE,  Boolean.TRUE), //vendita
	                                                           
	/** The Giro conto. */
	GiroConto(new String[] {"GIR"}, TipoCausale.Libera,  Boolean.TRUE,  Boolean.TRUE), //rettifica importo
	                                                          
	/** The Fattura passiva. */
	FatturaPassiva(new String[] {"DSI", "DSN", "DSP"}, TipoCausale.Integrata,  Boolean.TRUE,  Boolean.TRUE), //acquisto
	                                                          
	/** The Liquidazione. */
	Liquidazione(new String[] {"LIQ"}, TipoCausale.Integrata,   Boolean.TRUE,  Boolean.TRUE), //acquisto
	                                                          
	/** The Fattura attiva. */
	FatturaAttiva(new String[] {"DEI", "DEN"}, TipoCausale.Integrata,    Boolean.FALSE,  Boolean.TRUE), // vendita
	                                                           
	/** The Nota credito. */
	NotaCredito(new String[] {"NCD", "NCI", "NCP"}, TipoCausale.Integrata,  Boolean.FALSE,  Boolean.TRUE), //nota di credito
	;
	
	private String[] codiciEventoLeciti;
	private TipoCausale tipoCausale;
	private Boolean isInserimentoCespiteContestualePrimaNota;
	private Boolean isCollegabileACespiteEsistente;
	
	/**
	 * Instantiates a new conti tipo bene enum.
	 *
	 * @param codiceClassePiano the codice classe piano
	 * @param codiceTipoBene the codice tipo bene
	 * @param ammortamento the ammortamento
	 * @param attivo the attivo
	 * @param contoFoglia the conto foglia
	 */
	private EventoRegistroACespiteSelector(String[] codiciEventoLeciti, TipoCausale tipoCausale, Boolean isInserimentoCespiteContestualePrimaNota, Boolean isCollegabileACespiteEsistente) {
		this.codiciEventoLeciti = codiciEventoLeciti;
		this.tipoCausale = tipoCausale;
		this.isInserimentoCespiteContestualePrimaNota = isInserimentoCespiteContestualePrimaNota;
		this.isCollegabileACespiteEsistente = isCollegabileACespiteEsistente;
	}

	
	/**
	 * @return the tipoCausale
	 */
	private TipoCausale getTipoCausale() {
		return tipoCausale;
	}

	/**
	 * @return the isInserimentoCespiteContestualePrimaNota
	 */
	public Boolean getIsInserimentoCespiteContestualePrimaNota() {
		return isInserimentoCespiteContestualePrimaNota;
	}


	/**
	 * @return the isCollegabileACespiteEsistente
	 */
	public Boolean getIsCollegabileACespiteEsistente() {
		return isCollegabileACespiteEsistente;
	}


	
	/**
	 * @return the codiciEventoLeciti
	 */
	private String[] getCodiciEventoLeciti() {
		return codiciEventoLeciti;
	}


	/**
	 * Checks if is codice evento presente.
	 *
	 * @param codice the codice
	 * @return true, if is codice evento presente
	 */
	public boolean isCodiceEventoPresente(String codice) {
		for (String codiceLecito : codiciEventoLeciti) {
			//escludo gli eventi annullato
			if(codice != null && codice.startsWith(codiceLecito) && !codice.endsWith("-ANN")) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * By codice evento and tipo causale.
	 *
	 * @param codice the codice
	 * @param tipoCausale the tipo causale
	 * @return the evento registro A cespite selector
	 */
	public static final EventoRegistroACespiteSelector byCodiceEventoAndTipoCausale(String codice, TipoCausale tipoCausale) {
		for (EventoRegistroACespiteSelector evras : EventoRegistroACespiteSelector.values()) {
			if(evras.isCodiceEventoPresente(codice) && (tipoCausale== null || evras.getTipoCausale().equals(tipoCausale))) {
				return evras;
			}
		}
		return null;
	}
	
	public static final boolean isCodiceEventoRegistroA(String codice, TipoCausale tipoCausale) {
		for (EventoRegistroACespiteSelector evras : EventoRegistroACespiteSelector.values()) {
			if(evras.isCodiceEventoPresente(codice) && (tipoCausale== null || evras.getTipoCausale().equals(tipoCausale))) {
				return true;
			}
		}
		return false;
	}

}
