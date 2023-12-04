/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.fcde;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * Attributi di bilancio per l'accantonamento
 * @author Alessandro Marchino
 * @version 1.0.0 - 02/04/2021
 *
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio extends EntitaEnte {

	/** Per la serializzazione */
	private static final long serialVersionUID = -1281875089195042389L;

	private Bilancio bilancio;
	private TipoAccantonamentoFondiDubbiaEsigibilita tipoAccantonamentoFondiDubbiaEsigibilita;
	private StatoAccantonamentoFondiDubbiaEsigibilita statoAccantonamentoFondiDubbiaEsigibilita;
	private BigDecimal accantonamentoGraduale;
	private Integer quinquennioRiferimento;
	private Boolean riscossioneVirtuosa;
	private BigDecimal creditiStralciati;
	private BigDecimal creditiStralciatiFcde;
	private BigDecimal accertamentiAnniSuccessivi;
	private BigDecimal accertamentiAnniSuccessiviFcde;
	private Integer versione;
	
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return this.bilancio;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	/**
	 * @return the tipoAccantonamentoFondiDubbiaEsigibilita
	 */
	public TipoAccantonamentoFondiDubbiaEsigibilita getTipoAccantonamentoFondiDubbiaEsigibilita() {
		return this.tipoAccantonamentoFondiDubbiaEsigibilita;
	}
	/**
	 * @param tipoAccantonamentoFondiDubbiaEsigibilita the tipoAccantonamentoFondiDubbiaEsigibilita to set
	 */
	public void setTipoAccantonamentoFondiDubbiaEsigibilita(
			TipoAccantonamentoFondiDubbiaEsigibilita tipoAccantonamentoFondiDubbiaEsigibilita) {
		this.tipoAccantonamentoFondiDubbiaEsigibilita = tipoAccantonamentoFondiDubbiaEsigibilita;
	}
	/**
	 * @return the statoAccantonamentoFondiDubbiaEsigibilita
	 */
	public StatoAccantonamentoFondiDubbiaEsigibilita getStatoAccantonamentoFondiDubbiaEsigibilita() {
		return this.statoAccantonamentoFondiDubbiaEsigibilita;
	}
	/**
	 * @param statoAccantonamentoFondiDubbiaEsigibilita the statoAccantonamentoFondiDubbiaEsigibilita to set
	 */
	public void setStatoAccantonamentoFondiDubbiaEsigibilita(
			StatoAccantonamentoFondiDubbiaEsigibilita statoAccantonamentoFondiDubbiaEsigibilita) {
		this.statoAccantonamentoFondiDubbiaEsigibilita = statoAccantonamentoFondiDubbiaEsigibilita;
	}
	/**
	 * @return the accantonamentoGraduale
	 */
	public BigDecimal getAccantonamentoGraduale() {
		return this.accantonamentoGraduale;
	}
	/**
	 * @param accantonamentoGraduale the accantonamentoGraduale to set
	 */
	public void setAccantonamentoGraduale(BigDecimal accantonamentoGraduale) {
		this.accantonamentoGraduale = accantonamentoGraduale;
	}
	/**
	 * @return the quinquennioRiferimento
	 */
	public Integer getQuinquennioRiferimento() {
		return this.quinquennioRiferimento;
	}
	/**
	 * @param quinquennioRiferimento the quinquennioRiferimento to set
	 */
	public void setQuinquennioRiferimento(Integer quinquennioRiferimento) {
		this.quinquennioRiferimento = quinquennioRiferimento;
	}
	/**
	 * @return the riscossioneVirtuosa
	 */
	public Boolean getRiscossioneVirtuosa() {
		return this.riscossioneVirtuosa;
	}
	/**
	 * @param riscossioneVirtuosa the riscossioneVirtuosa to set
	 */
	public void setRiscossioneVirtuosa(Boolean riscossioneVirtuosa) {
		this.riscossioneVirtuosa = riscossioneVirtuosa;
	}
	/**
	 * @return the creditiStralciati
	 */
	public BigDecimal getCreditiStralciati() {
		return this.creditiStralciati;
	}
	/**
	 * @param creditiStralciati the creditiStralciati to set
	 */
	public void setCreditiStralciati(BigDecimal creditiStralciati) {
		this.creditiStralciati = creditiStralciati;
	}
	/**
	 * @return the creditiStralciatiFcde
	 */
	public BigDecimal getCreditiStralciatiFcde() {
		return this.creditiStralciatiFcde;
	}
	/**
	 * @param creditiStralciatiFcde the creditiStralciatiFcde to set
	 */
	public void setCreditiStralciatiFcde(BigDecimal creditiStralciatiFcde) {
		this.creditiStralciatiFcde = creditiStralciatiFcde;
	}
	/**
	 * @return the accertamentiAnniSuccessivi
	 */
	public BigDecimal getAccertamentiAnniSuccessivi() {
		return this.accertamentiAnniSuccessivi;
	}
	/**
	 * @param accertamentiAnniSuccessivi the accertamentiAnniSuccessivi to set
	 */
	public void setAccertamentiAnniSuccessivi(BigDecimal accertamentiAnniSuccessivi) {
		this.accertamentiAnniSuccessivi = accertamentiAnniSuccessivi;
	}
	/**
	 * @return the accertamentiAnniSuccessiviFcde
	 */
	public BigDecimal getAccertamentiAnniSuccessiviFcde() {
		return this.accertamentiAnniSuccessiviFcde;
	}
	/**
	 * @param accertamentiAnniSuccessiviFcde the accertamentiAnniSuccessiviFcde to set
	 */
	public void setAccertamentiAnniSuccessiviFcde(BigDecimal accertamentiAnniSuccessiviFcde) {
		this.accertamentiAnniSuccessiviFcde = accertamentiAnniSuccessiviFcde;
	}
	/**
	 * @return the versione
	 */
	public Integer getVersione() {
		return this.versione;
	}
	/**
	 * @param versione the versione to set
	 */
	public void setVersione(Integer versione) {
		this.versione = versione;
	}

}
