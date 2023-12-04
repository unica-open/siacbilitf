/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfin2ser.model.Valuta;

/**
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.11
 */


@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class Giustificativo extends EntitaEnte {
	
	private static final long serialVersionUID = -5496328596252108398L;

	
	private Integer annoProtocollo;
	private String numeroProtocollo;
	private String numeroGiustificativo;
	private String descrizioneGiustificativo;
	private Date dataEmissione;
	private BigDecimal importoGiustificativo;
	private BigDecimal importoSpettanteGiustificativo;
	private BigDecimal importoGiustificativoInValuta;
	private Boolean flagInclusoNelPagamento = Boolean.TRUE;
	private BigDecimal cambio;
	
	private TipoGiustificativo tipoGiustificativo;
	private RichiestaEconomale richiestaEconomale;
	private RendicontoRichiesta rendicontoRichiesta;
	private Valuta valuta;
	private StatoOperativoGiustificativi statoOperativoGiustificativi;
	
	// Lotto P
	private Integer quantita;
	
	
	
	
	
	
	/**
	 * @return the annoProtocollo
	 */
	public Integer getAnnoProtocollo() {
		return annoProtocollo;
	}
	/**
	 * @param annoProtocollo the annoProtocollo to set
	 */
	public void setAnnoProtocollo(Integer annoProtocollo) {
		this.annoProtocollo = annoProtocollo;
	}
	/**
	 * @return the numeroProtocollo
	 */
	public String getNumeroProtocollo() {
		return numeroProtocollo;
	}
	/**
	 * @param numeroProtocollo the numeroProtocollo to set
	 */
	public void setNumeroProtocollo(String numeroProtocollo) {
		this.numeroProtocollo = numeroProtocollo;
	}
	/**
	 * @return the numeroGiustificativo
	 */
	public String getNumeroGiustificativo() {
		return numeroGiustificativo;
	}
	/**
	 * @param numeroGiustificativo the numeroGiustificativo to set
	 */
	public void setNumeroGiustificativo(String numeroGiustificativo) {
		this.numeroGiustificativo = numeroGiustificativo;
	}
	/**
	 * @return the descrizioneGiustificativo
	 */
	public String getDescrizioneGiustificativo() {
		return descrizioneGiustificativo;
	}
	/**
	 * @param descrizioneGiustificativo the descrizioneGiustificativo to set
	 */
	public void setDescrizioneGiustificativo(String descrizioneGiustificativo) {
		this.descrizioneGiustificativo = descrizioneGiustificativo;
	}
	/**
	 * @return the dataEmissione
	 */
	public Date getDataEmissione() {
		return dataEmissione;
	}
	/**
	 * @param dataEmissione the dataEmissione to set
	 */
	public void setDataEmissione(Date dataEmissione) {
		this.dataEmissione = dataEmissione;
	}
	/**
	 * @return the importoGiustificativo
	 */
	public BigDecimal getImportoGiustificativo() {
		return importoGiustificativo;
	}
	/**
	 * @param importoGiustificativo the importoGiustificativo to set
	 */
	public void setImportoGiustificativo(BigDecimal importoGiustificativo) {
		this.importoGiustificativo = importoGiustificativo;
	}
	/**
	 * @return the importoSpettanteGiustificativo
	 */
	public BigDecimal getImportoSpettanteGiustificativo() {
		return importoSpettanteGiustificativo;
	}
	/**
	 * @param importoSpettanteGiustificativo the importoSpettanteGiustificativo to set
	 */
	public void setImportoSpettanteGiustificativo(
			BigDecimal importoSpettanteGiustificativo) {
		this.importoSpettanteGiustificativo = importoSpettanteGiustificativo;
	}
	/**
	 * @return the importoGiustificativoInValuta
	 */
	public BigDecimal getImportoGiustificativoInValuta() {
		return importoGiustificativoInValuta;
	}
	/**
	 * @param importoGiustificativoInValuta the importoGiustificativoInValuta to set
	 */
	public void setImportoGiustificativoInValuta(
			BigDecimal importoGiustificativoInValuta) {
		this.importoGiustificativoInValuta = importoGiustificativoInValuta;
	}
	/**
	 * @return the flagInclusoNelPagamento
	 */
	public Boolean getFlagInclusoNelPagamento() {
		return flagInclusoNelPagamento;
	}
	/**
	 * @param flagInclusoNelPagamento the flagInclusoNelPagamento to set
	 */
	public void setFlagInclusoNelPagamento(Boolean flagInclusoNelPagamento) {
		this.flagInclusoNelPagamento = flagInclusoNelPagamento != null ? flagInclusoNelPagamento : Boolean.TRUE;
	}
	/**
	 * @return the cambio
	 */
	public BigDecimal getCambio() {
		return cambio;
	}
	/**
	 * @param cambio the cambio to set
	 */
	public void setCambio(BigDecimal cambio) {
		this.cambio = cambio;
	}
	/**
	 * @return the tipoGiustificativo
	 */
	public TipoGiustificativo getTipoGiustificativo() {
		return tipoGiustificativo;
	}
	/**
	 * @param tipoGiustificativo the tipoGiustificativo to set
	 */
	public void setTipoGiustificativo(TipoGiustificativo tipoGiustificativo) {
		this.tipoGiustificativo = tipoGiustificativo;
	}
	/**
	 * @return the richiestaEconomale
	 */
	public RichiestaEconomale getRichiestaEconomale() {
		return richiestaEconomale;
	}
	/**
	 * @param richiestaEconomale the richiestaEconomale to set
	 */
	public void setRichiestaEconomale(RichiestaEconomale richiestaEconomale) {
		this.richiestaEconomale = richiestaEconomale;
	}
	/**
	 * @return the rendicontoRichiesta
	 */
	public RendicontoRichiesta getRendicontoRichiesta() {
		return rendicontoRichiesta;
	}
	/**
	 * @param rendicontoRichiesta the rendicontoRichiesta to set
	 */
	public void setRendicontoRichiesta(RendicontoRichiesta rendicontoRichiesta) {
		this.rendicontoRichiesta = rendicontoRichiesta;
	}
	/**
	 * @return the valuta
	 */
	public Valuta getValuta() {
		return valuta;
	}
	/**
	 * @param valuta the valuta to set
	 */
	public void setValuta(Valuta valuta) {
		this.valuta = valuta;
	}
	/**
	 * @return the statoOperativoGiustificativi
	 */
	public StatoOperativoGiustificativi getStatoOperativoGiustificativi() {
		return statoOperativoGiustificativi;
	}
	/**
	 * @param statoOperativoGiustificativi the statoOperativoGiustificativi to set
	 */
	public void setStatoOperativoGiustificativi(StatoOperativoGiustificativi statoOperativoGiustificativi) {
		this.statoOperativoGiustificativi = statoOperativoGiustificativi;
	}
	
	/**
	 * @return the quantita
	 */
	public Integer getQuantita() {
		return quantita;
	}
	/**
	 * @param quantita the quantita to set
	 */
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	/**
	 * Importo spettante per l'anticipo della missione.
	 * <br/>
	 * Pari a <code>importoGiustificativo &times; tipoGiustificativo.percentualeAnticipoMissione</code>.
	 * 
	 * @return the importoSpettanteAnticipoMissione
	 */
	public BigDecimal getImportoSpettanteAnticipoMissione() {
		if(getImportoGiustificativo() != null && getTipoGiustificativo() != null && getTipoGiustificativo().getPercentualeAnticipoMissione() != null) {
			return getImportoGiustificativo().multiply(getTipoGiustificativo().getPercentualeAnticipoMissioneDecimal());
		}
		return null;
	}
	
	/**
	 * Importo spettante per l'anticipo della missione, not null.
	 * <br/>
	 * Pari a <code>importoGiustificativo &times; tipoGiustificativo.percentualeAnticipoMissione</code>.
	 * 
	 * @return the importoSpettanteAnticipoMissione
	 */
	public BigDecimal getImportoSpettanteAnticipoMissioneNotNull() {
		final BigDecimal result = getImportoSpettanteAnticipoMissione();
		return result != null ? result : BigDecimal.ZERO;
	}
	
	/**
	 * Importo spettante per l'anticipo della trasferta.
	 * <br/>
	 * Pari a <code>importoGiustificativo &times; tipoGiustificativo.percentualeAnticipoTrasferta</code>.
	 * 
	 * @return the importoSpettanteAnticipoMissione
	 */
	public BigDecimal getImportoSpettanteAnticipoTrasferta() {
		if(getImportoGiustificativo() != null && getTipoGiustificativo() != null && getTipoGiustificativo().getPercentualeAnticipoTrasferta() != null) {
			return getImportoGiustificativo().multiply(getTipoGiustificativo().getPercentualeAnticipoTrasfertaDecimal());
		}
		return null;
	}
	
	/**
	 * Importo spettante per l'anticipo della trasferta.
	 * <br/>
	 * Pari a <code>importoGiustificativo &times; tipoGiustificativo.percentualeAnticipoTrasferta</code>.
	 * 
	 * @return the importoSpettanteAnticipoMissione
	 */
	public BigDecimal getImportoSpettanteAnticipoTrasfertaNotNull() {
		final BigDecimal result = getImportoSpettanteAnticipoTrasferta();
		return result != null ? result : BigDecimal.ZERO;
	}
	
}