/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * 
 * 
 *
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public abstract class TransazioneElementare extends EntitaEnte {
	
	
	private static final long serialVersionUID = -9184089589875390594L;
	
	private String codMissione;
	
	// Prima erano in ImpegnoAbstract, spostati in alto per doppia gestione impegno / accertamento
	private String codProgramma, descProgramma, codPdc, descPdc,codicePdc,  codContoEconomico, descCodContoEconomico, codCofog, codTransazioneEuropeaSpesa, descTransazioneEuropeaSpesa, codTransazioneEuropeaEntrata, descTransazioneEuropeaEntrata, codSiope, descCodSiope, codRicorrenteSpesa, codCapitoloSanitarioSpesa, codPrgPolReg;
	private String codClassGen11, codClassGen12, codClassGen13, codClassGen14, codClassGen15,codClassGen16,codClassGen17,codClassGen18,codClassGen19,codClassGen20;
	private Integer idPdc, idSiope, idContoEconomico;
	
	// Prima erano in ImpegnoAbstract, spostati in alto per doppia gestione impegno / accertamento
	
	private String descCofog;
	
	private String descMissione;
	
	//SIAC-6929
	private String codMacroaggregato;
	private String descMacroaggregato;
	private String codTitolo;
	private String descTitolo;
	private String codCategoria;
	private String descCategoria;
	private String codTipoFinanziamento;
	private String descTipoFinanziamento;
	private String codTipologia;
	private String descTipologia;
	private String codRicorrente;
	private String descRicorrente;
	private String codPerimetroSanitario;
	private String descPerimetroSanitario;
	
	/**
	 * @return the codicePdc
	 */
	public String getCodicePdc() {
		return codicePdc;
	}

	/**
	 * @param codicePdc the codicePdc to set
	 */
	public void setCodicePdc(String codicePdc) {
		this.codicePdc = codicePdc;
	}

	public String getCodClassGen16() {
		return codClassGen16;
	}

	public void setCodClassGen16(String codClassGen16) {
		this.codClassGen16 = codClassGen16;
	}

	public String getCodClassGen17() {
		return codClassGen17;
	}

	public void setCodClassGen17(String codClassGen17) {
		this.codClassGen17 = codClassGen17;
	}

	public String getCodClassGen18() {
		return codClassGen18;
	}

	public void setCodClassGen18(String codClassGen18) {
		this.codClassGen18 = codClassGen18;
	}

	public String getCodClassGen19() {
		return codClassGen19;
	}

	public void setCodClassGen19(String codClassGen19) {
		this.codClassGen19 = codClassGen19;
	}

	public String getCodClassGen20() {
		return codClassGen20;
	}

	public void setCodClassGen20(String codClassGen20) {
		this.codClassGen20 = codClassGen20;
	}

	// Codice Unico di Progetto
	private String cup;//impegno
	
	public String getCodMissione() {
		return codMissione;
	}

	public void setCodMissione(String codMissione) {
		this.codMissione = codMissione;
	}

	public String getCodProgramma() {
		return codProgramma;
	}

	public void setCodProgramma(String codProgramma) {
		this.codProgramma = codProgramma;
	}

	public String getDescProgramma() {
		return descProgramma;
	}

	public void setDescProgramma(String descProgramma) {
		this.descProgramma = descProgramma;
	}

	public String getCodPdc() {
		return codPdc;
	}

	public void setCodPdc(String codPdc) {
		this.codPdc = codPdc;
	}

	public String getDescPdc() {
		return descPdc;
	}

	public void setDescPdc(String descPdc) {
		this.descPdc = descPdc;
	}

	public String getCodContoEconomico() {
		return codContoEconomico;
	}

	public void setCodContoEconomico(String codContoEconomico) {
		this.codContoEconomico = codContoEconomico;
	}

	public String getDescCodContoEconomico() {
		return descCodContoEconomico;
	}

	public void setDescCodContoEconomico(String descCodContoEconomico) {
		this.descCodContoEconomico = descCodContoEconomico;
	}

	public String getCodCofog() {
		return codCofog;
	}

	public void setCodCofog(String codCofog) {
		this.codCofog = codCofog;
	}

	public String getCodTransazioneEuropeaSpesa() {
		return codTransazioneEuropeaSpesa;
	}

	public void setCodTransazioneEuropeaSpesa(String codTransazioneEuropeaSpesa) {
		this.codTransazioneEuropeaSpesa = codTransazioneEuropeaSpesa;
	}

	public String getDescTransazioneEuropeaSpesa() {
		return descTransazioneEuropeaSpesa;
	}

	public void setDescTransazioneEuropeaSpesa(String descTransazioneEuropeaSpesa) {
		this.descTransazioneEuropeaSpesa = descTransazioneEuropeaSpesa;
	}

	public String getCodSiope() {
		return codSiope;
	}

	public void setCodSiope(String codSiope) {
		this.codSiope = codSiope;
	}

	public String getDescCodSiope() {
		return descCodSiope;
	}

	public void setDescCodSiope(String descCodSiope) {
		this.descCodSiope = descCodSiope;
	}

	public String getCodRicorrenteSpesa() {
		return codRicorrenteSpesa;
	}

	public void setCodRicorrenteSpesa(String codRicorrenteSpesa) {
		this.codRicorrenteSpesa = codRicorrenteSpesa;
	}

	public String getCodCapitoloSanitarioSpesa() {
		return codCapitoloSanitarioSpesa;
	}

	public void setCodCapitoloSanitarioSpesa(String codCapitoloSanitarioSpesa) {
		this.codCapitoloSanitarioSpesa = codCapitoloSanitarioSpesa;
	}

	public String getCodPrgPolReg() {
		return codPrgPolReg;
	}

	public void setCodPrgPolReg(String codPrgPolReg) {
		this.codPrgPolReg = codPrgPolReg;
	}

	public String getCodClassGen11() {
		return codClassGen11;
	}

	public void setCodClassGen11(String codClassGen11) {
		this.codClassGen11 = codClassGen11;
	}

	public String getCodClassGen12() {
		return codClassGen12;
	}

	public void setCodClassGen12(String codClassGen12) {
		this.codClassGen12 = codClassGen12;
	}

	public String getCodClassGen13() {
		return codClassGen13;
	}

	public void setCodClassGen13(String codClassGen13) {
		this.codClassGen13 = codClassGen13;
	}

	public String getCodClassGen14() {
		return codClassGen14;
	}

	public void setCodClassGen14(String codClassGen14) {
		this.codClassGen14 = codClassGen14;
	}

	public String getCodClassGen15() {
		return codClassGen15;
	}

	public void setCodClassGen15(String codClassGen15) {
		this.codClassGen15 = codClassGen15;
	}

	public Integer getIdPdc() {
		return idPdc;
	}

	public void setIdPdc(Integer idPdc) {
		this.idPdc = idPdc;
	}

	public Integer getIdSiope() {
		return idSiope;
	}

	public void setIdSiope(Integer idSiope) {
		this.idSiope = idSiope;
	}

	public Integer getIdContoEconomico() {
		return idContoEconomico;
	}

	public void setIdContoEconomico(Integer idContoEconomico) {
		this.idContoEconomico = idContoEconomico;
	}

	public String getCup() {
		return cup;
	}

	public void setCup(String cup) {
		this.cup = cup;
	}

	public String getDescCofog() {
		return descCofog;
	}

	public void setDescCofog(String descCofog) {
		this.descCofog = descCofog;
	}

	public String getDescMissione() {
		return descMissione;
	}

	public void setDescMissione(String descMissione) {
		this.descMissione = descMissione;
	}

	/**
	 * @return the codMacroaggregato
	 */
	public String getCodMacroaggregato() {
		return codMacroaggregato;
	}

	/**
	 * @param codMacroaggregato the codMacroaggregato to set
	 */
	public void setCodMacroaggregato(String codMacroaggregato) {
		this.codMacroaggregato = codMacroaggregato;
	}

	/**
	 * @return the descMacroaggregato
	 */
	public String getDescMacroaggregato() {
		return descMacroaggregato;
	}

	/**
	 * @param descMacroaggregato the descMacroaggregato to set
	 */
	public void setDescMacroaggregato(String descMacroaggregato) {
		this.descMacroaggregato = descMacroaggregato;
	}

	/**
	 * @return the codTitolo
	 */
	public String getCodTitolo() {
		return codTitolo;
	}

	/**
	 * @param codTitolo the codTitolo to set
	 */
	public void setCodTitolo(String codTitolo) {
		this.codTitolo = codTitolo;
	}

	/**
	 * @return the descTitolo
	 */
	public String getDescTitolo() {
		return descTitolo;
	}

	/**
	 * @param descTitolo the descTitolo to set
	 */
	public void setDescTitolo(String descTitolo) {
		this.descTitolo = descTitolo;
	}

	/**
	 * @return the codCategoria
	 */
	public String getCodCategoria() {
		return codCategoria;
	}

	/**
	 * @param codCategoria the codCategoria to set
	 */
	public void setCodCategoria(String codCategoria) {
		this.codCategoria = codCategoria;
	}

	/**
	 * @return the descCategoria
	 */
	public String getDescCategoria() {
		return descCategoria;
	}

	/**
	 * @param descCategoria the descCategoria to set
	 */
	public void setDescCategoria(String descCategoria) {
		this.descCategoria = descCategoria;
	}

	/**
	 * @return the codTipoFinanziamento
	 */
	public String getCodTipoFinanziamento() {
		return codTipoFinanziamento;
	}

	/**
	 * @param codTipoFinanziamento the codTipoFinanziamento to set
	 */
	public void setCodTipoFinanziamento(String codTipoFinanziamento) {
		this.codTipoFinanziamento = codTipoFinanziamento;
	}

	/**
	 * @return the descTipoFinanziamento
	 */
	public String getDescTipoFinanziamento() {
		return descTipoFinanziamento;
	}

	/**
	 * @param descTipoFinanziamento the descTipoFinanziamento to set
	 */
	public void setDescTipoFinanziamento(String descTipoFinanziamento) {
		this.descTipoFinanziamento = descTipoFinanziamento;
	}

	/**
	 * @return the codTipologia
	 */
	public String getCodTipologia() {
		return codTipologia;
	}

	/**
	 * @param codTipologia the codTipologia to set
	 */
	public void setCodTipologia(String codTipologia) {
		this.codTipologia = codTipologia;
	}

	/**
	 * @return the descTipologia
	 */
	public String getDescTipologia() {
		return descTipologia;
	}

	/**
	 * @param descTipologia the descTipologia to set
	 */
	public void setDescTipologia(String descTipologia) {
		this.descTipologia = descTipologia;
	}

	/**
	 * @return the codTransazioneEuropeaEntrata
	 */
	public String getCodTransazioneEuropeaEntrata() {
		return codTransazioneEuropeaEntrata;
	}

	/**
	 * @param codTransazioneEuropeaEntrata the codTransazioneEuropeaEntrata to set
	 */
	public void setCodTransazioneEuropeaEntrata(String codTransazioneEuropeaEntrata) {
		this.codTransazioneEuropeaEntrata = codTransazioneEuropeaEntrata;
	}

	/**
	 * @return the descTransazioneEuropeaEntrata
	 */
	public String getDescTransazioneEuropeaEntrata() {
		return descTransazioneEuropeaEntrata;
	}

	/**
	 * @param descTransazioneEuropeaEntrata the descTransazioneEuropeaEntrata to set
	 */
	public void setDescTransazioneEuropeaEntrata(String descTransazioneEuropeaEntrata) {
		this.descTransazioneEuropeaEntrata = descTransazioneEuropeaEntrata;
	}

	/**
	 * @return the codRicorrente
	 */
	public String getCodRicorrente() {
		return codRicorrente;
	}

	/**
	 * @param codRicorrente the codRicorrente to set
	 */
	public void setCodRicorrente(String codRicorrente) {
		this.codRicorrente = codRicorrente;
	}

	/**
	 * @return the descRicorrente
	 */
	public String getDescRicorrente() {
		return descRicorrente;
	}

	/**
	 * @param descRicorrente the descRicorrente to set
	 */
	public void setDescRicorrente(String descRicorrente) {
		this.descRicorrente = descRicorrente;
	}

	/**
	 * @return the codPerimetroSanitario
	 */
	public String getCodPerimetroSanitario() {
		return codPerimetroSanitario;
	}

	/**
	 * @param codPerimetroSanitario the codPerimetroSanitario to set
	 */
	public void setCodPerimetroSanitario(String codPerimetroSanitario) {
		this.codPerimetroSanitario = codPerimetroSanitario;
	}

	/**
	 * @return the descPerimetroSanitario
	 */
	public String getDescPerimetroSanitario() {
		return descPerimetroSanitario;
	}

	/**
	 * @param descPerimetroSanitario the descPerimetroSanitario to set
	 */
	public void setDescPerimetroSanitario(String descPerimetroSanitario) {
		this.descPerimetroSanitario = descPerimetroSanitario;
	}
}
