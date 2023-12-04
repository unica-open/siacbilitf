/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.visibilita;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siaccorser.model.Azione;
import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * Visibilit&agrave; campi
 * @author Alessandro Marchino
 * @version 1.0.0 - 10/05/2021
 *
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class Visibilita extends EntitaEnte {
	
	private static final long serialVersionUID = 8221473100362800710L;
	
	private String campo;
	private Boolean visibile;
	private String funzionalita;
	private String valoreDefault;
	private TipoCampo tipoCampo;
	private Azione azione;
	
	/**
	 * @return the campo
	 */
	public String getCampo() {
		return this.campo;
	}
	/**
	 * @param campo the campo to set
	 */
	public void setCampo(String campo) {
		this.campo = campo;
	}
	/**
	 * @return the visibile
	 */
	public Boolean getVisibile() {
		return this.visibile;
	}
	/**
	 * @param visibile the visibile to set
	 */
	public void setVisibile(Boolean visibile) {
		this.visibile = visibile;
	}
	/**
	 * @return the funzionalita
	 */
	public String getFunzionalita() {
		return this.funzionalita;
	}
	/**
	 * @param funzionalita the funzionalita to set
	 */
	public void setFunzionalita(String funzionalita) {
		this.funzionalita = funzionalita;
	}
	/**
	 * @return the valoreDefault
	 */
	public String getValoreDefault() {
		return this.valoreDefault;
	}
	/**
	 * @param valoreDefault the valoreDefault to set
	 */
	public void setValoreDefault(String valoreDefault) {
		this.valoreDefault = valoreDefault;
	}
	/**
	 * @return the tipoCampo
	 */
	public TipoCampo getTipoCampo() {
		return this.tipoCampo;
	}
	/**
	 * @param tipoCampo the tipoCampo to set
	 */
	public void setTipoCampo(TipoCampo tipoCampo) {
		this.tipoCampo = tipoCampo;
	}
	/**
	 * @return the azione
	 */
	public Azione getAzione() {
		return this.azione;
	}
	/**
	 * @param azione the azione to set
	 */
	public void setAzione(Azione azione) {
		this.azione = azione;
	}
	
	/**
	 * Ottiene il valore di default parsificato
	 * @param <T> la tipizzazione dell'oggetto di ritorno
	 * @return il default parsificato
	 */
	@SuppressWarnings("unchecked")
	public <T> T getParsedDefault() {
		if(tipoCampo == null) {
			return null;
		}
		return (T) tipoCampo.parse(valoreDefault);
	}
}
