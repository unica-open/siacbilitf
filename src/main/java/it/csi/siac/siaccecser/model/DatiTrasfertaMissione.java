/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

/**
 * @author prologicMMA
 * @version 1.0
 * @created 01-dic-2014 09.50.09
 */


@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class DatiTrasfertaMissione extends Entita {

	private static final long serialVersionUID = -4016366695318995943L;
	
	private Ente ente;
	private Date dataInizio;
	private Date dataFine;
	private Boolean flagEstero;
	private String codice;
	private String motivo;
	private String luogo;
	private String unitaOrganizzativa;
	private RichiestaEconomale richiestaEconomale;
	@XmlElements({
		@XmlElement(name="mezzoDiTrasporto", type=MezziDiTrasporto.class),
	})
	@XmlElementWrapper(name = "mezziDiTrasporto")
	private List<MezziDiTrasporto> mezziDiTrasporto;
	
	
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
	 * @return the dataInizio
	 */
	public Date getDataInizio() {
		return dataInizio;
	}
	/**
	 * @param dataInizio the dataInizio to set
	 */
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	/**
	 * @return the dataFine
	 */
	public Date getDataFine() {
		return dataFine;
	}
	/**
	 * @param dataFine the dataFine to set
	 */
	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}
	/**
	 * @return the flagEstero
	 */
	public Boolean getFlagEstero() {
		return flagEstero;
	}
	/**
	 * @param flagEstero the flagEstero to set
	 */
	public void setFlagEstero(Boolean flagEstero) {
		this.flagEstero = flagEstero;
	}
	/**
	 * @return the motivo
	 */
	public String getMotivo() {
		return motivo;
	}
	/**
	 * @param motivo the motivo to set
	 */
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	/**
	 * @return the luogo
	 */
	public String getLuogo() {
		return luogo;
	}
	/**
	 * @param luogo the luogo to set
	 */
	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}
	/**
	 * @return the unitaOrganizzativa
	 */
	public String getUnitaOrganizzativa() {
		return unitaOrganizzativa;
	}
	/**
	 * @param unitaOrganizzativa the unitaOrganizzativa to set
	 */
	public void setUnitaOrganizzativa(String unitaOrganizzativa) {
		this.unitaOrganizzativa = unitaOrganizzativa;
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
	 * @return the mezziDiTrasporto
	 */
	@XmlTransient
	public List<MezziDiTrasporto> getMezziDiTrasporto() {
		return mezziDiTrasporto;
	}
	/**
	 * @param mezziDiTrasporto the mezziDiTrasporto to set
	 */
	public void setMezziDiTrasporto(List<MezziDiTrasporto> mezziDiTrasporto) {
		this.mezziDiTrasporto = mezziDiTrasporto;
	}
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
	

}