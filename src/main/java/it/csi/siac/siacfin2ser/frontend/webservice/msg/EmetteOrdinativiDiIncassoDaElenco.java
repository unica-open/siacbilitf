/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ClassificatoreStipendi;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.AllegatoAtto;
import it.csi.siac.siacfin2ser.model.CodiceBollo;
import it.csi.siac.siacfin2ser.model.ContoTesoreria;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegato;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;
import it.csi.siac.siacfinser.model.Distinta;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class EmetteOrdinativiDiIncassoDaElenco extends ServiceRequest {
	
	private Bilancio bilancio;
	
	private List<SubdocumentoEntrata> subdocumenti = new ArrayList<SubdocumentoEntrata>();
	private List<ElencoDocumentiAllegato> elenchi = new ArrayList<ElencoDocumentiAllegato>();
	
	private AllegatoAtto allegatoAtto;
	private Boolean flagConvalidaManuale;
	
	private ContoTesoreria contoTesoreria;
	private Distinta distinta;
	private String note;
	private CodiceBollo codiceBollo;
	private Date dataScadenza;
	private Boolean flagNoDataScadenza;
	//SIAC-6175
	private Boolean flagDaTrasmettere;
	//SIAC-6206
	private ClassificatoreStipendi classificatoreStipendi;

	
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	/**
	 * @return the subdocumenti
	 */
	public List<SubdocumentoEntrata> getSubdocumenti() {
		return subdocumenti;
	}

	/**
	 * @param subdocumenti the subdocumenti to set
	 */
	public void setSubdocumenti(List<SubdocumentoEntrata> subdocumenti) {
		this.subdocumenti = subdocumenti;
	}

	/**
	 * @return the elenchi
	 */
	public List<ElencoDocumentiAllegato> getElenchi() {
		return elenchi;
	}

	/**
	 * @param elenchi the elenchi to set
	 */
	public void setElenchi(List<ElencoDocumentiAllegato> elenchi) {
		this.elenchi = elenchi;
	}

	/**
	 * @return the allegatoAtto
	 */
	public AllegatoAtto getAllegatoAtto() {
		return allegatoAtto;
	}

	/**
	 * @param allegatoAtto the allegatoAtto to set
	 */
	public void setAllegatoAtto(AllegatoAtto allegatoAtto) {
		this.allegatoAtto = allegatoAtto;
	}

	/**
	 * @return the flagConvalidaManuale
	 */
	public Boolean getFlagConvalidaManuale() {
		return flagConvalidaManuale;
	}

	/**
	 * @param flagConvalidaManuale the flagConvalidaManuale to set
	 */
	public void setFlagConvalidaManuale(Boolean flagConvalidaManuale) {
		this.flagConvalidaManuale = flagConvalidaManuale;
	}

	/**
	 * @return the contoTesoreria
	 */
	public ContoTesoreria getContoTesoreria() {
		return contoTesoreria;
	}

	/**
	 * @param contoTesoreria the contoTesoreria to set
	 */
	public void setContoTesoreria(ContoTesoreria contoTesoreria) {
		this.contoTesoreria = contoTesoreria;
	}

	/**
	 * @return the distinta
	 */
	public Distinta getDistinta() {
		return distinta;
	}

	/**
	 * @param distinta the distinta to set
	 */
	public void setDistinta(Distinta distinta) {
		this.distinta = distinta;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the codiceBollo
	 */
	public CodiceBollo getCodiceBollo() {
		return codiceBollo;
	}

	/**
	 * @param codiceBollo the codiceBollo to set
	 */
	public void setCodiceBollo(CodiceBollo codiceBollo) {
		this.codiceBollo = codiceBollo;
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
	 * 
	 * @return the flagNoDataScadenza
	 */
	public Boolean getFlagNoDataScadenza() {
		return flagNoDataScadenza;
	}
	/**
	 * 
	 * @param flagNoDataScadenza
	 */
	public void setFlagNoDataScadenza(Boolean flagNoDataScadenza) {
		this.flagNoDataScadenza = flagNoDataScadenza;
	}

	/**
	 * @return the flagDaTrasmettere
	 */
	public Boolean getFlagDaTrasmettere() {
		return flagDaTrasmettere;
	}

	/**
	 * @param flagDaTrasmettere the flagDaTrasmettere to set
	 */
	public void setFlagDaTrasmettere(Boolean flagDaTrasmettere) {
		this.flagDaTrasmettere = flagDaTrasmettere;
	}

	/**
	 * @return the classificatoreStipendi
	 */
	public ClassificatoreStipendi getClassificatoreStipendi() {
		return classificatoreStipendi;
	}

	/**
	 * @param classificatoreStipendi the classificatoreStipendi to set
	 */
	public void setClassificatoreStipendi(ClassificatoreStipendi classificatoreStipendi) {
		this.classificatoreStipendi = classificatoreStipendi;
	}
	
	
	
}
