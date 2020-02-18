/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * RegistroComunicazioniPCC.
 * 
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class RegistroComunicazioniPCC extends Entita implements Cloneable {
	//maps the siac_t_registro_pcc
	private static final long serialVersionUID = 4308930595316867439L;
	
	//rpcc_registrazione_data
	private Date dataInvio;
	//data_scadenza
	private Date dataScadenza;
	
	private DocumentoSpesa documentoSpesa;
	private SubdocumentoSpesa subdocumentoSpesa;
	
	
	//pccop_tipo_id
	private TipoOperazionePCC tipoOperazionePCC;
	//pccdeb_stato_id
	private StatoDebito statoDebito;
	//pcccau_id
	private CausalePCC causalePCC;
	
	//DatiPagamento - Inizio
	//ordinativo_data_emissione
	private Date dataEmissioneOrdinativo;
	//ordinativo_numero
	private Integer numeroOrdinativo;
	//provvisorio_cassa_anno
	private Integer annoProvvisorioCassa;
	//provvisorio_cassa_numero
	private Integer numeroProvvisorioCassa;
	//DatiPagamento - Fine
	
	private String statoRichiesta;
	private Date dataEsito;
	private String codiceEsito;
	private String descrizioneEsito;
	private Date dataQuietanza;
	private Integer numeroQuietanza;
	private BigDecimal importoQuietanza;
	
	private Ente ente;
	
	/**
	 * @return the dateRegistro
	 */
	public Date getDataInvio() {
		return dataInvio;
	}
	/**
	 * @param dateRegistro the dateRegistro to set
	 */
	public void setDataInvio(Date dateRegistro) {
		this.dataInvio = dateRegistro;
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
	 * @return the tipoOperazionePCC
	 */
	public TipoOperazionePCC getTipoOperazionePCC() {
		return tipoOperazionePCC;
	}
	/**
	 * @param tipoOperazionePCC the tipoOperazionePCC to set
	 */
	public void setTipoOperazionePCC(TipoOperazionePCC tipoOperazionePCC) {
		this.tipoOperazionePCC = tipoOperazionePCC;
	}
	/**
	 * @return the statoDebito
	 */
	public StatoDebito getStatoDebito() {
		return statoDebito;
	}
	/**
	 * @param statoDebito the statoDebito to set
	 */
	public void setStatoDebito(StatoDebito statoDebito) {
		this.statoDebito = statoDebito;
	}
	/**
	 * @return the causalePCC
	 */
	public CausalePCC getCausalePCC() {
		return causalePCC;
	}
	/**
	 * @param causalePCC the causalePCC to set
	 */
	public void setCausalePCC(CausalePCC causalePCC) {
		this.causalePCC = causalePCC;
	}
	/**
	 * @return the dataEmissioneOrdinativo
	 */
	public Date getDataEmissioneOrdinativo() {
		return dataEmissioneOrdinativo;
	}
	/**
	 * @param dataEmissioneOrdinativo the dataEmissioneOrdinativo to set
	 */
	public void setDataEmissioneOrdinativo(Date dataEmissioneOrdinativo) {
		this.dataEmissioneOrdinativo = dataEmissioneOrdinativo;
	}
	/**
	 * @return the numeroOrdinativo
	 */
	public Integer getNumeroOrdinativo() {
		return numeroOrdinativo;
	}
	/**
	 * @param numeroOrdinativo the numeroOrdinativo to set
	 */
	public void setNumeroOrdinativo(Integer numeroOrdinativo) {
		this.numeroOrdinativo = numeroOrdinativo;
	}
	/**
	 * @return the annoProvvisorioCassa
	 */
	public Integer getAnnoProvvisorioCassa() {
		return annoProvvisorioCassa;
	}
	/**
	 * @param annoProvvisorioCassa the annoProvvisorioCassa to set
	 */
	public void setAnnoProvvisorioCassa(Integer annoProvvisorioCassa) {
		this.annoProvvisorioCassa = annoProvvisorioCassa;
	}
	/**
	 * @return the numeroProvvisorioCassa
	 */
	public Integer getNumeroProvvisorioCassa() {
		return numeroProvvisorioCassa;
	}
	/**
	 * @param numeroProvvisorioCassa the numeroProvvisorioCassa to set
	 */
	public void setNumeroProvvisorioCassa(Integer numeroProvvisorioCassa) {
		this.numeroProvvisorioCassa = numeroProvvisorioCassa;
	}
	/**
	 * @return the documentoSpesa
	 */
	public DocumentoSpesa getDocumentoSpesa() {
		return documentoSpesa;
	}
	/**
	 * @param documentoSpesa the documentoSpesa to set
	 */
	public void setDocumentoSpesa(DocumentoSpesa documentoSpesa) {
		this.documentoSpesa = documentoSpesa;
	}
	/**
	 * @return the subdocumentoSpesa
	 */
	public SubdocumentoSpesa getSubdocumentoSpesa() {
		return subdocumentoSpesa;
	}
	/**
	 * @param subdocumentoSpesa the subdocumentoSpesa to set
	 */
	public void setSubdocumentoSpesa(SubdocumentoSpesa subdocumentoSpesa) {
		this.subdocumentoSpesa = subdocumentoSpesa;
	}
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
	 * @return the statoRichiesta
	 */
	public String getStatoRichiesta() {
		return statoRichiesta;
	}
	/**
	 * @param statoRichiesta the statoRichiesta to set
	 */
	public void setStatoRichiesta(String statoRichiesta) {
		this.statoRichiesta = statoRichiesta;
	}
	/**
	 * @return the dataEsito
	 */
	public Date getDataEsito() {
		return dataEsito;
	}
	/**
	 * @param dataEsito the dataEsito to set
	 */
	public void setDataEsito(Date dataEsito) {
		this.dataEsito = dataEsito;
	}
	/**
	 * @return the codiceEsito
	 */
	public String getCodiceEsito() {
		return codiceEsito;
	}
	/**
	 * @param codiceEsito the codiceEsito to set
	 */
	public void setCodiceEsito(String codiceEsito) {
		this.codiceEsito = codiceEsito;
	}
	/**
	 * @return the descrizioneEsito
	 */
	public String getDescrizioneEsito() {
		return descrizioneEsito;
	}
	/**
	 * @param descrizioneEsito the descrizioneEsito to set
	 */
	public void setDescrizioneEsito(String descrizioneEsito) {
		this.descrizioneEsito = descrizioneEsito;
	}
	/**
	 * @return the dataQuietanza
	 */
	public Date getDataQuietanza() {
		return dataQuietanza;
	}
	/**
	 * @param dataQuietanza the dataQuietanza to set
	 */
	public void setDataQuietanza(Date dataQuietanza) {
		this.dataQuietanza = dataQuietanza;
	}
	/**
	 * @return the numeroQuietanza
	 */
	public Integer getNumeroQuietanza() {
		return numeroQuietanza;
	}
	/**
	 * @param numeroQuietanza the numeroQuietanza to set
	 */
	public void setNumeroQuietanza(Integer numeroQuietanza) {
		this.numeroQuietanza = numeroQuietanza;
	}
	/**
	 * @return the importoQuietanza
	 */
	public BigDecimal getImportoQuietanza() {
		return importoQuietanza;
	}
	/**
	 * @param importoQuietanza the importoQuietanza to set
	 */
	public void setImportoQuietanza(BigDecimal importoQuietanza) {
		this.importoQuietanza = importoQuietanza;
	}
	
	@Override
	public RegistroComunicazioniPCC clone() {
		// Esposizione pubblica del metodo
		try {
			return (RegistroComunicazioniPCC) super.clone();
		} catch(CloneNotSupportedException cnse) {
			// Non dovrebbe mai succedere
			return this;
		}
	}
	
	/**
	 * Stati per il field statoRichiesta.
	 * Questi stati sono aggiuntivi rispetto a {@link it.csi.siac.pcc.marc.schema.marccommontypes_1.StatoRichiestaType}
	 *
	 */
	public enum StatoRichiesta {
		PREPARAZIONE_INVIO_A_MARC,
		INVIATA_A_MARC,
		ERRORE_BUSINESS_INVIO_A_MARC
	}
	
}
