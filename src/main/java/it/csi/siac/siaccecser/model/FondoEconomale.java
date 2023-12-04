/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.09
 */


@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class FondoEconomale extends EntitaEnte {

	private static final long serialVersionUID = -8270971379940405782L;
	
	private String codice;
	private String descrizione;
	/**
	 * Rendiconto a carico dell'ufficio personale
	 */
	private Boolean rendicontoUfficioPersonale;
	private Impegno impegno;
	private Capitolo<?, ?> capitolo;
	private Soggetto soggetto;
	private RichiestaEconomale richiestaEconomale;
	private StatoOperativoFondoEconomale statoOperativoFondoEconomale;
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
	 * @return the rendicontoUfficioPersonale
	 */
	public Boolean getRendicontoUfficioPersonale() {
		return rendicontoUfficioPersonale;
	}
	/**
	 * @param rendicontoUfficioPersonale the rendicontoUfficioPersonale to set
	 */
	public void setRendicontoUfficioPersonale(Boolean rendicontoUfficioPersonale) {
		this.rendicontoUfficioPersonale = rendicontoUfficioPersonale;
	}
	/**
	 * @return the impegno
	 */
	public Impegno getImpegno() {
		return impegno;
	}
	/**
	 * @param impegno the impegno to set
	 */
	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}
	/**
	 * @return the capitolo
	 */
	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}
	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}
	/**
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return soggetto;
	}
	/**
	 * @param soggetto the soggetto to set
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
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
	 * @return the statoOperativoFondoEconomale
	 */
	public StatoOperativoFondoEconomale getStatoOperativoFondoEconomale() {
		return statoOperativoFondoEconomale;
	}
	/**
	 * @param statoOperativoFondoEconomale the statoOperativoFondoEconomale to set
	 */
	public void setStatoOperativoFondoEconomale(StatoOperativoFondoEconomale statoOperativoFondoEconomale) {
		this.statoOperativoFondoEconomale = statoOperativoFondoEconomale;
	}

}