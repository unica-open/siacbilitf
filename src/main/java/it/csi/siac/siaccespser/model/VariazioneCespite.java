/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

/**
 * Cespiti
 * @author 71027
 * @version 1.0
 * @created 31-giu-2018
 */
@XmlType(namespace = CESPDataDictionary.NAMESPACE)
public class VariazioneCespite extends Entita {
	
	/** Per la serializzazione */
	private static final long serialVersionUID = 2337216234581995320L;
	
	private String descrizione;
	private String annoVariazione;
	private Date dataVariazione;
	private BigDecimal importo;
	private Boolean flagTipoVariazioneIncremento;

	private StatoVariazioneCespite statoVariazioneCespite;
	private Cespite cespite;
	
	private Ente ente;
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
	 * @return the annoVariazione
	 */
	public String getAnnoVariazione() {
		return annoVariazione;
	}
	/**
	 * @param annoVariazione the annoVariazione to set
	 */
	public void setAnnoVariazione(String annoVariazione) {
		this.annoVariazione = annoVariazione;
	}
	/**
	 * @return the dataVariazione
	 */
	public Date getDataVariazione() {
		return dataVariazione;
	}
	/**
	 * @param dataVariazione the dataVariazione to set
	 */
	public void setDataVariazione(Date dataVariazione) {
		this.dataVariazione = dataVariazione;
	}
	/**
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}
	/**
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	/**
	 * @return the flagTipoVariazioneIncremento
	 */
	public Boolean getFlagTipoVariazioneIncremento() {
		return this.flagTipoVariazioneIncremento;
	}
	/**
	 * @param flagTipoVariazioneIncremento the flagTipoVariazioneIncremento to set
	 */
	public void setFlagTipoVariazioneIncremento(Boolean flagTipoVariazioneIncremento) {
		this.flagTipoVariazioneIncremento = flagTipoVariazioneIncremento;
	}
	/**
	 * @return the StatoVariazioneCespite
	 */
	public StatoVariazioneCespite getStatoVariazioneCespite() {
		return statoVariazioneCespite;
	}
	/**
	 * @param statoVariazioneCespite the StatoVariazioneCespite to set
	 */
	public void setStatoVariazioneCespite(StatoVariazioneCespite statoVariazioneCespite) {
		this.statoVariazioneCespite = statoVariazioneCespite;
	}
	/**
	 * @return the cespite
	 */
	public Cespite getCespite() {
		return cespite;
	}
	/**
	 * @param cespite the cespite to set
	 */
	public void setCespite(Cespite cespite) {
		this.cespite = cespite;
	}
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return this.ente;
	}
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

}