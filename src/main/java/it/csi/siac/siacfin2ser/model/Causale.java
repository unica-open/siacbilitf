/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class Causale extends Codifica { //siac_d_causale

	private static final long serialVersionUID = -4624255417480576523L;
	
	private Ente ente;
	
	private Date dataAnnullamento;	
	private Date dataScadenza;
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;	
	private StatoOperativoCausale statoOperativoCausale;
	
	//siac_r_causale_tipo	
	private TipoCausale tipoCausale;
	
	//ImputazioniCausaleSpesa
	//siac_r_causale_atto_amm	
	private AttoAmministrativo attoAmministrativo;
	//siac_r_causale_soggetto
	private Soggetto soggetto;
	
	private ModelloCausale modelloCausale;
	
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	/**
	 * @return the dataAnnullamento
	 */
	public Date getDataAnnullamento() {
		return dataAnnullamento;
	}
	/**
	 * @param dataAnnullamento the dataAnnullamento to set
	 */
	public void setDataAnnullamento(Date dataAnnullamento) {
		this.dataAnnullamento = dataAnnullamento;
	}
	/**
	 * @return the strutturaAmministrativoContabile
	 */
	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
		return strutturaAmministrativoContabile;
	}
	/**
	 * @param strutturaAmministrativoContabile the strutturaAmministrativoContabile to set
	 */
	public void setStrutturaAmministrativoContabile(StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
	}
	/**
	 * @return the statoOperativoCausale
	 */
	public StatoOperativoCausale getStatoOperativoCausale() {
		return statoOperativoCausale;
	}
	/**
	 * @param statoOperativoCausale the statoOperativoCausale to set
	 */
	public void setStatoOperativoCausale(StatoOperativoCausale statoOperativoCausale) {
		this.statoOperativoCausale = statoOperativoCausale;
	}
	/**
	 * @return the attoAmministrativo
	 */
	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}
	/**
	 * @param attoAmministrativo the attoAmministrativo to set
	 */
	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
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
	 * @return the tipoCausale
	 */
	public TipoCausale getTipoCausale() {
		return tipoCausale;
	}
	/**
	 * @param tipoCausale the tipoCausale to set
	 */
	public void setTipoCausale(TipoCausale tipoCausale) {
		this.tipoCausale = tipoCausale;
	}
	/**
	 * @return the dataScadenza
	 */
	public Date getDataScadenza() {
		return dataScadenza;
	}
	/**
	 * @param dataScadenza the dataScadenza to set
	 */
	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	/**
	 * @return the modelloCausale
	 */
	public ModelloCausale getModelloCausale() {
		return modelloCausale;
	}
	/**
	 * @param modelloCausale the modelloCausale to set
	 */
	public void setModelloCausale(ModelloCausale modelloCausale) {
		this.modelloCausale = modelloCausale;
	}
	
	/**
	 * @return the dataCreazioneCausale
	 */
	public Date getDataCreazioneCausale() {
		return this.getDataCreazione();
	}
	/**
	 * @param dataCreazioneCausale the dataCreazioneCausale to set
	 */
	public void setDataCreazioneCausale(Date dataCreazioneCausale) {
		this.setDataCreazione(dataCreazioneCausale);
	}
	
	/**
	 * Gets the data inizio validita Causale.
	 *
	 * @return the dataFineValiditaCausale
	 */
	public Date getDataInizioValiditaCausale() {
		return this.getDataInizioValidita();
	}
	
	/**
	 * Sets the data inizio validita Causale.
	 *
	 * @param dataInizioValiditaCausale the dataInizioValiditaCausale to set
	 */
	public void setDataInizioValiditaCausale(Date dataInizioValiditaCausale) {
		this.setDataInizioValidita(dataInizioValiditaCausale);
	}
	
	
	/**
	 * Gets the data fine validita Causale.
	 *
	 * @return the dataFineValiditaCausale
	 */
	public Date getDataFineValiditaCausale() {
		return this.getDataFineValidita();
	}
	
	/**
	 * Sets the data fine validita Causale.
	 *
	 * @param dataFineValiditaCausale the dataFineValiditaCausale to set
	 */
	public void setDataFineValiditaCausale(Date dataFineValiditaCausale) {
		this.setDataFineValidita(dataFineValiditaCausale);
	}
	
	
	/**
	 * Gets the data modifica Causale.
	 *
	 * @return the data modifica Causale
	 */
	public Date getDataModificaCausale() {
		return this.getDataModifica();
	}
	
	/**
	 * Sets the data modifica Causale.
	 *
	 * @param dataModifica the new data modifica Causale
	 */
	public void setDataModificaCausale(Date dataModifica) {
		this.setDataModifica(dataModifica);
	}
	
	
	
	

}
