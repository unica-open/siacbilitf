/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacbilser.model.fcde;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public enum TipologiaEstrazioniFogliDiCalcolo {

	CREDITI_STRALCIATI(TipoAccantonamentoFondiDubbiaEsigibilita.RENDICONTO, "CREDITI_STRALCIATI", "CreditiStralciati"),
	ACCERTAMENTI_ANNI_SUCCESSIVI(TipoAccantonamentoFondiDubbiaEsigibilita.RENDICONTO, "ACCERTAMENTI_ANNI_SUCCESSIVI", "AccertamentiAnniSuccessivi"),
	;

	TipologiaEstrazioniFogliDiCalcolo(TipoAccantonamentoFondiDubbiaEsigibilita tipoAccantonamento, String codice, String descrizione) {
		this.tipoAccantonamento = tipoAccantonamento;
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	private TipoAccantonamentoFondiDubbiaEsigibilita tipoAccantonamento;
	private String codice;
	private String descrizione;
	
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	
	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the tipoAccantonamento
	 */
	public TipoAccantonamentoFondiDubbiaEsigibilita getTipoAccantonamento() {
		return tipoAccantonamento;
	}

	/**
	 * @param tipoAccantonamento the tipoAccantonamento to set
	 */
	public void setTipoAccantonamento(TipoAccantonamentoFondiDubbiaEsigibilita tipoAccantonamento) {
		this.tipoAccantonamento = tipoAccantonamento;
	}

	public static List<TipologiaEstrazioniFogliDiCalcolo> estraiTipologiePerTipoAccantonamento(TipoAccantonamentoFondiDubbiaEsigibilita tipoAccantonamento) {
		List<TipologiaEstrazioniFogliDiCalcolo> tipologie = new ArrayList<TipologiaEstrazioniFogliDiCalcolo>();
		if(tipoAccantonamento != null) {
			for (TipologiaEstrazioniFogliDiCalcolo tipologia : TipologiaEstrazioniFogliDiCalcolo.values()) {
				if (tipologia.getTipoAccantonamento().getCodice().equals(tipoAccantonamento.getCodice())) {
					tipologie.add(tipologia);
				}
			}
		}
		return tipologie;
	}

	public static TipologiaEstrazioniFogliDiCalcolo estraiTipologiaPerCodice(String codice) {
		if(StringUtils.isNotBlank(codice)) {
			for(TipologiaEstrazioniFogliDiCalcolo tipo : TipologiaEstrazioniFogliDiCalcolo.values()) {
				if(tipo.getCodice().equals(codice)) {
					return tipo;
				}
			}
		}
		throw new IllegalArgumentException("Il codice "+ codice + " non ha un valore corrispondente in TipologiaEstrazioniFogliDiCalcolo");
	}
}
