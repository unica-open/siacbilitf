/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfinser.model.ordinativo.SubOrdinativoIncasso;
import it.csi.siac.siacfinser.model.ordinativo.SubOrdinativoPagamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

/**
 * Dettaglio Onere.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class DettaglioOnere extends EntitaEnte {
	
	private static final long serialVersionUID = 3641801039695278905L;
	
	private BigDecimal importoImponibile = BigDecimal.ZERO;
	private BigDecimal importoCaricoEnte = BigDecimal.ZERO;
	private BigDecimal importoCaricoSoggetto = BigDecimal.ZERO;
	private BigDecimal sommaNonSoggetta = BigDecimal.ZERO;
	
	//onere_id  (siac_d_onere che poi è collegata alla siac_d_onere_tipo (IRPEF,INPS ovvero NaturaOnere)
	private TipoOnere tipoOnere;
	//caus_id
	private Causale770 causale770;
	private CodiceSommaNonSoggetta codiceSommaNonSoggetta;
	
	//private PeriodoAttivita periodoAttivita;
	
	//doc_id
	private DocumentoSpesa documentoSpesa;
	
	//attivitaInizio
	private Date attivitaInizio;
	//attivitaFine
	private Date attivitaFine;
	//onere_att_id
	private AttivitaOnere attivitaOnere;
	
	//private List<OrdinativoIncasso> ordinativi = new ArrayList<OrdinativoIncasso>();
	private List<SubOrdinativoIncasso> subordinativiIncasso = new ArrayList<SubOrdinativoIncasso>();
	private List<SubOrdinativoPagamento> subordinativiPagamento = new ArrayList<SubOrdinativoPagamento>();
	

	/**
	 * @return the importoImponibile
	 */
	public BigDecimal getImportoImponibile() {
		return importoImponibile;
	}

	/**
	 * @param importoImponibile the importoImponibile to set
	 */
	public void setImportoImponibile(BigDecimal importoImponibile) {
		this.importoImponibile = importoImponibile;
	}

	/**
	 * @return the importoCaricoEnte
	 */
	public BigDecimal getImportoCaricoEnte() {
		return importoCaricoEnte;
	}

	/**
	 * @param importoCaricoEnte the importoCaricoEnte to set
	 */
	public void setImportoCaricoEnte(BigDecimal importoCaricoEnte) {
		this.importoCaricoEnte = importoCaricoEnte;
	}

	/**
	 * @return the importoCaricoSoggetto
	 */
	public BigDecimal getImportoCaricoSoggetto() {
		return importoCaricoSoggetto;
	}

	/**
	 * @param importoCaricoSoggetto the importoCaricoSoggetto to set
	 */
	public void setImportoCaricoSoggetto(BigDecimal importoCaricoSoggetto) {
		this.importoCaricoSoggetto = importoCaricoSoggetto;
	}
	
	/**
	 * @return the sommaNonSoggetta
	 */
	public BigDecimal getSommaNonSoggetta() {
		return sommaNonSoggetta;
	}

	/**
	 * @param sommaNonSoggetta the sommaNonSoggetta to set
	 */
	public void setSommaNonSoggetta(BigDecimal sommaNonSoggetta) {
		this.sommaNonSoggetta = sommaNonSoggetta;
	}

	/**
	 * @return the tipoOnere
	 */
	public TipoOnere getTipoOnere() {
		return tipoOnere;
	}

	/**
	 * @param tipoOnere the tipoOnere to set
	 */
	public void setTipoOnere(TipoOnere tipoOnere) {
		this.tipoOnere = tipoOnere;
	}

	/**
	 * @return the listCausali770
	 */
	public Causale770 getCausale770() {
		return causale770;
	}

	/**
	 * @param causale770 the causale770 to set
	 */
	public void setCausale770(Causale770 causale770) {
		this.causale770 = causale770;
	}

	/**
	 * @return the codiceSommaNonSoggetta
	 */
	public CodiceSommaNonSoggetta getCodiceSommaNonSoggetta() {
		return codiceSommaNonSoggetta;
	}

	/**
	 * @param codiceSommaNonSoggetta the codiceSommaNonSoggetta to set
	 */
	public void setCodiceSommaNonSoggetta(
			CodiceSommaNonSoggetta codiceSommaNonSoggetta) {
		this.codiceSommaNonSoggetta = codiceSommaNonSoggetta;
	}

	/**
	 * @return the documentoSpesa
	 */
	public DocumentoSpesa getDocumentoSpesa() {
		return documentoSpesa;
	}

	/**
	 * Impostare solo l'id del documento
	 * 
	 * @param documentoSpesa the documentoSpesa to set
	 */
	public void setDocumentoSpesa(DocumentoSpesa documentoSpesa) {
		this.documentoSpesa = documentoSpesa;
	}

	/**
	 * @return the attivitaInizio
	 */
	public Date getAttivitaInizio() {
		return attivitaInizio;
	}

	/**
	 * @param attivitaInizio the attivitaInizio to set
	 */
	public void setAttivitaInizio(Date dataInizio) {
		this.attivitaInizio = dataInizio;
	}

	/**
	 * @return the attivitaFine
	 */
	public Date getAttivitaFine() {
		return attivitaFine;
	}

	/**
	 * @param attivitaFine the attivitaFine to set
	 */
	public void setAttivitaFine(Date dataFine) {
		this.attivitaFine = dataFine;
	}

	/**
	 * @return the attivitaOnere
	 */
	public AttivitaOnere getAttivitaOnere() {
		return attivitaOnere;
	}

	/**
	 * @param attivitaOnere the attivitaOnere to set
	 */
	public void setAttivitaOnere(AttivitaOnere attivitaOnere) {
		this.attivitaOnere = attivitaOnere;
	}

	/**
	 * @return the subordinativiIncasso
	 */
	public List<SubOrdinativoIncasso> getSubordinativiIncasso() {
		return subordinativiIncasso;
	}

	/**
	 * @param subordinativiIncasso the subordinativiIncasso to set
	 */
	public void setSubordinativiIncasso(
			List<SubOrdinativoIncasso> subordinativiIncasso) {
		this.subordinativiIncasso = subordinativiIncasso;
	}

	/**
	 * @return the subordinativiPagamento
	 */
	public List<SubOrdinativoPagamento> getSubordinativiPagamento() {
		return subordinativiPagamento;
	}

	/**
	 * @param subordinativiPagamento the subordinativiPagamento to set
	 */
	public void setSubordinativiPagamento(
			List<SubOrdinativoPagamento> subordinativiPagamento) {
		this.subordinativiPagamento = subordinativiPagamento;
	}

	
	

	
	
	
	
	
	
	
	
}
