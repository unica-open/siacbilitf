/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacfin2ser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnteExt;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
import it.csi.siac.sirfelser.model.FatturaFEL;

/**
 * Documento.
   
 * @param <SD> la tipizzazione del subdocumento
 * @param <SDI> la tipizzazione del subdocumento iva
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class Documento<SD extends Subdocumento<?, ?>, SDI extends SubdocumentoIva<?, ?, ?>> extends EntitaEnteExt  {
	
	private static final long serialVersionUID = 18429427971681483L;
	
	
	//Fields su siac_t_doc
	private Integer anno;
	private String numero;

	private String descrizione;
	private BigDecimal importo = BigDecimal.ZERO;

	private Date dataEmissione;
	private Date dataScadenza;
	
	// Attributi del documento su siac_r_doc_attr
	private String numeroRepertorio;
	private Date dataRepertorio;
	private String note;
	private BigDecimal arrotondamento = BigDecimal.ZERO;
	private Integer terminePagamento;
	// Attributo ereditato dalla fattura
	private Date dataRicezionePortale;
	// SIAC-7567 nuovi attributi
	private String cig;
	private String cup;

	//Lotto M
	private String registroRepertorio;
	private Integer annoRepertorio;
	private Boolean contabilizzaGenPcc = Boolean.FALSE;

	// Valutare di spostarlo sul documento NotaCollegata che sarà un Documento con dentro l'importo.
					 
	// campo derivato da calcolo
	private BigDecimal importoTotaleNoteCollegate = BigDecimal.ZERO;
	// campo derivato da calcolo
	private BigDecimal importoTotaleDaDedurreSuFatturaNoteCollegate = BigDecimal.ZERO;

	// siac_d_doc_tipo
	private TipoDocumento tipoDocumento;
	// siac_r_doc_stato
	private StatoOperativoDocumento statoOperativoDocumento;
	// siac_d_codicebollo
	private CodiceBollo codiceBollo;

	// siac_r_doc_sog
	private Soggetto soggetto;

	private Date dataInizioValiditaStato;

	private TipoRelazione tipoRelazione;
	// valorizzato solo per le note di credito collegate ad un doc
	private BigDecimal importoDaDedurreSuFattura = BigDecimal.ZERO;

	// Se impostato a TRUE la registrazione delle quote con impegno/accertamento minore dell'anno di bilancio verra' saltata.
												
	private Boolean flagDisabilitaRegistrazioneResidui;

	// SIAC-6565
	private String statoSDI;
	private String esitoStatoSDI;
	
	// SIAC-7717
	FatturaFEL fatturaFEL;
	
	//siac_t_subdoc
	@XmlElements({
		@XmlElement(name = "subdocumentoSpesa", type=SubdocumentoSpesa.class),
		@XmlElement(name = "subdocumentoEntrata", type=SubdocumentoEntrata.class) 
	})
	private List<SD> listaSubdocumenti = new ArrayList<SD>();

//	@XmlElements({
//		@XmlElement(name="documentoSpesa", type=DocumentoSpesa.class),
//		@XmlElement(name="documentoEntrata", type=DocumentoEntrata.class),		
//		@XmlElement(name="documento", type=Documento.class),
//		})
//	private List<Documento<?>> listaDocumentiCollegati = new ArrayList<Documento<?>>();

	@XmlElementWrapper(name = "documentiSpesaFiglio")
	@XmlElement(name = "documentoSpesa")
	//a
	private List<DocumentoSpesa> listaDocumentiSpesaFiglio= new ArrayList<DocumentoSpesa>();

	//a
	@XmlElementWrapper(name = "documentiEntrataFiglio")
	@XmlElement(name = "documentoEntrata")
	private List<DocumentoEntrata> listaDocumentiEntrataFiglio = new ArrayList<DocumentoEntrata>();

	//da
	@XmlElementWrapper(name = "documentiSpesaPadre")
	@XmlElement(name = "documentoSpesa")
	private List<DocumentoSpesa> listaDocumentiSpesaPadre= new ArrayList<DocumentoSpesa>();

	//da
	@XmlElementWrapper(name = "documentiEntrataPadre")
	@XmlElement(name = "documentoEntrata")
	private List<DocumentoEntrata> listaDocumentiEntrataPadre = new ArrayList<DocumentoEntrata>();

	@XmlElements({
		@XmlElement(name = "subdocumentoIvaSpesa", type=SubdocumentoIvaSpesa.class),
		@XmlElement(name = "subdocumentoIvaEntrata", type=SubdocumentoIvaEntrata.class) 
	})
	private List<SDI> listaSubdocumentoIva = new ArrayList<SDI>();

	// Derivato
	private Boolean collegatoAdAllegatoAtto;

	// SIAC-3965
	private BigDecimal totaleImportoQuote;
	private BigDecimal totaleImportoDaDedurreQuote;
	private BigDecimal totaleImportoDocumentiEntrataFiglio;
	private BigDecimal totaleImportoDocumentiSpesaFiglio;
	private BigDecimal totaleImportoRilevanteIvaQuote;
	private BigDecimal totaleImportoNonRilevanteIvaQuote;
	private Boolean esisteQuotaRilevanteIva;

	// SIAC-4680
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;

	// SIAC-5176
	private Boolean esisteNCDCollegataADocumento;

	/**
	 * Calcola l'importo totale dei subdocumenti
	
	 * @return il totale
	 */
	public BigDecimal calcolaImportoTotaleSubdoumenti(){
		BigDecimal result = BigDecimal.ZERO;
		for(SD ds : getListaSubdocumenti()){
			result = result.add(ds.getImporto());
		}
		return result;
	}
	
	/**
	 * Calcola l'importo totale rilevante IVA dei subdocumenti
	
	 * @return il totale
	 */
	public BigDecimal calcolaImportoTotaleRilevanteIVASubdoumenti(){
		BigDecimal result = BigDecimal.ZERO;
		for(SD ds : getListaSubdocumenti()) {
			if(Boolean.TRUE.equals(ds.getFlagRilevanteIVA())) {
				result = result.add(ds.getImporto());
			}
		}
		return result;
	}
	
	/**
	 * Calcola l'importo totale non rilevante IVA dei subdocumenti
	
	 * @return il totale
	 */
	public BigDecimal calcolaImportoTotaleNonRilevanteIVASubdoumenti(){
		BigDecimal result = BigDecimal.ZERO;
		for(SD ds : getListaSubdocumenti()) {
			if(!Boolean.TRUE.equals(ds.getFlagRilevanteIVA())) {
				result = result.add(ds.getImporto());
			}
		}
		return result;
	}
	
	/**
	 * Calcola l'importo totale da dedurre dei subdocumenti 
	 * presenti nella lista subdocumenti
	 * 
	 * @return il totale
	 */
	public BigDecimal calcolaImportoTotaleDaDedurreSobdocumenti(){
		BigDecimal result = BigDecimal.ZERO;
		for(SD ds : getListaSubdocumenti()){
			result = result.add(ds.getImportoDaDedurreNotNull());
		}
		return result;
	}
	
	/**
	 * Calcola l'importo totale delle note collegate di spesa
	
	 * @return il totale
	 */
	public BigDecimal calcolaImportoTotaleNoteCollegateSpesa(){
		BigDecimal result = BigDecimal.ZERO;
		for(DocumentoSpesa ds : getListaNoteCreditoSpesaFiglio()){
			result = result.add(ds.getImporto());
		}
		return result;
	}
	
	/**
	 * Calcola l'importo totale delle note collegate di spesa non annullate
	
	 * @return il totale
	 */
	public BigDecimal calcolaImportoTotaleNoteCollegateSpesaNonAnnullate(){
		BigDecimal result = BigDecimal.ZERO;
		for(DocumentoSpesa ds : getListaNoteCreditoSpesaFiglio()){
			if(!StatoOperativoDocumento.ANNULLATO.equals(ds.getStatoOperativoDocumento())){
				result = result.add(ds.getImporto());
			}
		}
		return result;
	}
	
	/**
	 * Calcola l'importo totale delle note collegate di entrata
	
	 * @return il totale
	 */
	public BigDecimal calcolaImportoTotaleNoteCollegateEntrata(){
		BigDecimal result = BigDecimal.ZERO;
		for(DocumentoEntrata ds : getListaNoteCreditoEntrataFiglio()){
			result = result.add(ds.getImporto());
		}
		return result;
	}
	
	/**
	 * Calcola l'importo totale delle note collegate di entrata non annullate
	
	 * @return il totale
	 */
	public BigDecimal calcolaImportoTotaleNoteCollegateEntrataNonAnnullate(){
		BigDecimal result = BigDecimal.ZERO;
		for(DocumentoEntrata de : getListaNoteCreditoEntrataFiglio()){
			if(!StatoOperativoDocumento.ANNULLATO.equals(de.getStatoOperativoDocumento())){
				result = result.add(de.getImporto());
			}
		}
		return result;
	}
	
	/**
	 * @return descrizione della chiave del documento
	 */
	public String getDescAnnoNumeroTipoDocSoggettoStato() {		
		return getDescAnnoNumeroTipoDoc()  + "/" 
				+ (getSoggetto()!=null?getSoggetto().getCodiceSoggetto():"null") +  "/" 
				+ getStatoOperativoDocumento();
	}
	
	/**
	 * @return descrizione della chiave del documento
	 */
	public String getDescAnnoNumeroUidTipoDocUidSoggettoStato() {		
		return getDescAnnoNumeroTipoDoc()  + "/" 
				+ (getSoggetto()!=null?getSoggetto().getUid():"null") +  "/" 
				+ getStatoOperativoDocumento();
	}
	
	/**
	 * @return descrizione della chiave del documento
	 */
	public String getDescAnnoNumeroTipoDoc() {		
		return getAnno() + "/" 
				+ (getTipoDocumento()!=null?getTipoDocumento().getCodice():"null")  + "/"
				+ getNumero() ;
	}
	
	
	
	

	
	

	/**
	 * @return the numeroRepertorio
	 */
	public String getNumeroRepertorio() {
		return numeroRepertorio;
	}

	/**
	 * @param numeroRepertorio the numeroRepertorio to set
	 */
	public void setNumeroRepertorio(String numeroRepertorio) {
		this.numeroRepertorio = numeroRepertorio;
	}

	/**
	 * @return the dataRepertorio
	 */
	public Date getDataRepertorio() {
		return dataRepertorio;
	}

	/**
	 * @param dataRepertorio the dataRepertorio to set
	 */
	public void setDataRepertorio(Date dataRepertorio) {
		this.dataRepertorio = dataRepertorio;
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
	 * @return the arrotondamento
	 */
	public BigDecimal getArrotondamento() {
		return arrotondamento;
	}

	/**
	 * @param arrotondamento the arrotondamento to set
	 */
	public void setArrotondamento(BigDecimal arrotondamento) {
		this.arrotondamento = arrotondamento != null ? arrotondamento : BigDecimal.ZERO;
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
	 * @return the terminePagamento
	 */
	public Integer getTerminePagamento() {
		return terminePagamento;
	}

	/**
	 * @param terminePagamento the terminePagamento to set
	 */
	public void setTerminePagamento(Integer terminePagamento) {
		this.terminePagamento = terminePagamento;
	}

	/**
	 * @return the dataRicezionePortale
	 */
	public Date getDataRicezionePortale() {
		return dataRicezionePortale;
	}

	/**
	 * @param dataRicezionePortale the dataRicezionePortale to set
	 */
	public void setDataRicezionePortale(Date dataRicezionePortale) {
		this.dataRicezionePortale = dataRicezionePortale;
	}

	/**
	 * @return the registroRepertorio
	 */
	public String getRegistroRepertorio() {
		return registroRepertorio;
	}

	/**
	 * @param registroRepertorio the registroRepertorio to set
	 */
	public void setRegistroRepertorio(String registroRepertorio) {
		this.registroRepertorio = registroRepertorio;
	}

	/**
	 * @return the annorepertorio
	 */
	public Integer getAnnoRepertorio() {
		return annoRepertorio;
	}

	/**
	 * @param annoRepertorio the annorepertorio to set
	 */
	public void setAnnoRepertorio(Integer annoRepertorio) {
		this.annoRepertorio = annoRepertorio;
	}

	/**
	 * @return the contabilizzaGenPcc
	 */
	public Boolean getContabilizzaGenPcc() {
		return contabilizzaGenPcc;
	}

	/**
	 * @param contabilizzaGenPcc the contabilizzaGenPcc to set
	 */
	public void setContabilizzaGenPcc(Boolean contabilizzaGenPcc) {
		this.contabilizzaGenPcc = contabilizzaGenPcc == null ? Boolean.FALSE : contabilizzaGenPcc;
	}

	/**
	 * @return the anno
	 */
	public Integer getAnno() {
		return anno;
	}

	/**
	 * @param anno the anno to set
	 */
	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
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
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}
	
	/**
	 * @return the importo netto
	 */
	public BigDecimal getImportoNetto() {
		return importo.add(arrotondamento);
	}	

	/**
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo != null ? importo : BigDecimal.ZERO;
	}

	/**
	 * @return the importoNotaCollegata
	 */
	public BigDecimal getImportoTotaleNoteCollegate() {
		return importoTotaleNoteCollegate;
	}

	/**
	 * @param importoNotaCollegata the importoNotaCollegata to set
	 */
	public void setImportoTotaleNoteCollegate(BigDecimal importoNotaCollegata) {
		this.importoTotaleNoteCollegate = importoNotaCollegata;
	}

	/**
	 * @return the importoTotaleDaDedurreSuFatturaNoteCollegate
	 */
	public BigDecimal getImportoTotaleDaDedurreSuFatturaNoteCollegate() {
		return importoTotaleDaDedurreSuFatturaNoteCollegate;
	}

	/**
	 * @param importoTotaleDaDedurreSuFatturaNoteCollegate the importoTotaleDaDedurreSuFatturaNoteCollegate to set
																									
															  
	 */
	public void setImportoTotaleDaDedurreSuFatturaNoteCollegate(
			BigDecimal importoTotaleDaDedurreSuFatturaNoteCollegate) {
		this.importoTotaleDaDedurreSuFatturaNoteCollegate = importoTotaleDaDedurreSuFatturaNoteCollegate;
	}

	/**
	 * @return the tipoDocumento
	 */
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the statoOperativoDocumento
	 */
	public StatoOperativoDocumento getStatoOperativoDocumento() {
		return statoOperativoDocumento;
	}

	/**
	 * @param statoOperativoDocumento the statoOperativoDocumento to set
	 */
	public void setStatoOperativoDocumento(StatoOperativoDocumento statoOperativoDocumento) {
		this.statoOperativoDocumento = statoOperativoDocumento;
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
	 * Data inzio validita dello Stato Operativo del Documento
	
	 * @return the dataInizioValiditaStato
	 */
	public Date getDataInizioValiditaStato() {
		return dataInizioValiditaStato;
	}

	/**
	 * Data inzio validita dello Stato Operativo del Documento
	
	 * @param dataInizioValiditaStato the dataInizioValiditaStato to set
	 */
	public void setDataInizioValiditaStato(Date dataInizioValiditaStato) {
		this.dataInizioValiditaStato = dataInizioValiditaStato;
	}

	/**
	 * @return the listSubdocumento
	 */
	@XmlTransient
	public List<SD> getListaSubdocumenti() {
		return listaSubdocumenti;
	}

	/**
	 * @param listaSubdocumenti the listSubdocumento to set
	 */
	public void setListaSubdocumenti(List<SD> listaSubdocumenti) {
		this.listaSubdocumenti = listaSubdocumenti != null ? listaSubdocumenti : new ArrayList<SD>();
	}
	
	/**
	 * @return the fatturaFEL
	 */
	public FatturaFEL getFatturaFEL() {
		return fatturaFEL;
	}
	/**
	 * @param fatturaFEL the fatturaFEL to set
	 */
	public void setFatturaFEL(FatturaFEL fatturaFEL) {
		this.fatturaFEL = fatturaFEL;
	}
	
	/**
	 * Ottiene le note di credito figlio spesa
	
	 * @return la lista delle note
	 */
	public List<DocumentoSpesa> getListaNoteCreditoSpesaFiglio(){
		return getListaDocumentiSpesaFiglioByTipoGruppo(TipoGruppoDocumento.NOTA_DI_CREDITO);
	}
	
	/**
	 * Ottiene le note di credito figlio entrata
	
	 * @return la lista delle note
	 */
	public List<DocumentoEntrata> getListaNoteCreditoEntrataFiglio(){
		return getListaDocumentiEntrataFiglioByTipoGruppo(TipoGruppoDocumento.NOTA_DI_CREDITO);
	}
	
	/**
	 * Ottiene i documenti entrata figlio per tipo gruppo
	
	 * @param tipoGruppoDocumento il tipo di gruppo
	 * @return i documenti entrata figlio di dato gruppo
	 */
	public List<DocumentoEntrata> getListaDocumentiEntrataFiglioByTipoGruppo(TipoGruppoDocumento tipoGruppoDocumento){
		final List<DocumentoEntrata> result = new ArrayList<DocumentoEntrata>();
		for(DocumentoEntrata ds : listaDocumentiEntrataFiglio){
			if(tipoGruppoDocumento.getCodice().equals(ds.getTipoDocumento().getCodiceGruppo())){
				result.add(ds);
			}
		}
		return result;
	}
	
	/**
	 * Ottiene i documenti spesa figlio per tipo gruppo
	
	 * @param tipoGruppoDocumento il tipo di gruppo
	 * @return i documenti spesa figlio di dato gruppo
	 */
	public List<DocumentoSpesa> getListaDocumentiSpesaFiglioByTipoGruppo(TipoGruppoDocumento tipoGruppoDocumento){
		final List<DocumentoSpesa> result = new ArrayList<DocumentoSpesa>();
		for(DocumentoSpesa ds : listaDocumentiSpesaFiglio){
			if(tipoGruppoDocumento.getCodice().equals(ds.getTipoDocumento().getCodiceGruppo())){
				result.add(ds);
			}
		}
		return result;
	}
	
	
	/**
	 * @return the listaDocumentiSpesaFiglio
	 */
	@XmlTransient
	public List<DocumentoSpesa> getListaDocumentiSpesaFiglio() {
		return listaDocumentiSpesaFiglio;
	}

	/**
	 * @param listaDocumentiSpesaFiglio the listaDocumentiSpesaFiglio to set
	 */
	public void setListaDocumentiSpesaFiglio(List<DocumentoSpesa> listaDocumentiSpesaFiglio) {
		this.listaDocumentiSpesaFiglio = listaDocumentiSpesaFiglio != null ? listaDocumentiSpesaFiglio : new ArrayList<DocumentoSpesa>();
									  
	}
	
	/**
	 * Aggiunge un documento di spesa figlio
	
	 * @param documentoSpesa il documento da aggiungere
	 */
	public void addDocumentoSpesaFiglio(DocumentoSpesa documentoSpesa) {
		this.listaDocumentiSpesaFiglio.add(documentoSpesa);
	}
	
	/**
	 * @return the listaDocumentiEntrataFiglio
	 */
	@XmlTransient
	public List<DocumentoEntrata> getListaDocumentiEntrataFiglio() {
		return listaDocumentiEntrataFiglio;
	}

	/**
	 * @param listaDocumentiEntrataFiglio the listaDocumentiEntrataFiglio to set
	 */
	public void setListaDocumentiEntrataFiglio(List<DocumentoEntrata> listaDocumentiEntrataFiglio) {
		this.listaDocumentiEntrataFiglio = listaDocumentiEntrataFiglio != null ? listaDocumentiEntrataFiglio : new ArrayList<DocumentoEntrata>();
										
	}
	
	/**
	 * Aggiunge un documento di entrata figlio
	
	 * @param documentoEntrata il documento da aggiungere
	 */
	public void addDocumentoEntrataFiglio(DocumentoEntrata documentoEntrata) {
		this.listaDocumentiEntrataFiglio.add(documentoEntrata);
	}
	
	/**
	 * @return the listaDocumentiSpesaPadre
	 */
	@XmlTransient
	public List<DocumentoSpesa> getListaDocumentiSpesaPadre() {
		return listaDocumentiSpesaPadre;
	}

	/**
	 * @param listaDocumentiSpesaPadre the listaDocumentiSpesaPadre to set
	 */
	public void setListaDocumentiSpesaPadre(List<DocumentoSpesa> listaDocumentiSpesaPadre) {
		this.listaDocumentiSpesaPadre = listaDocumentiSpesaPadre != null ? listaDocumentiSpesaPadre : new ArrayList<DocumentoSpesa>();
									  
	}
	
	/**
	 * Aggiunge un documento di spesa padre
	
	 * @param documentiSpesaPadre il documento da aggiungere
	 */
	public void addDocumentoSpesaPadre(DocumentoSpesa documentiSpesaPadre) {
		this.listaDocumentiSpesaPadre.add(documentiSpesaPadre);
	}
	
	/**
	 * @return the listaDocumentiEntrataPadre
	 */
	@XmlTransient
	public List<DocumentoEntrata> getListaDocumentiEntrataPadre() {
		return listaDocumentiEntrataPadre;
	}

	/**
	 * @param listaDocumentiEntrataPadre the listaDocumentiEntrataPadre to set
	 */
	public void setListaDocumentiEntrataPadre(List<DocumentoEntrata> listaDocumentiEntrataPadre) {
		this.listaDocumentiEntrataPadre = listaDocumentiEntrataPadre != null ? listaDocumentiEntrataPadre : new ArrayList<DocumentoEntrata>();
										
	}	
	
	/**
	 * Aggiunge un documento di entrata padre
	
	 * @param documentoEntrataPadre il documento da aggiungere
	 */
	public void addDocumentoEntrataPadre(DocumentoEntrata documentoEntrataPadre) {
		this.listaDocumentiEntrataPadre.add(documentoEntrataPadre);
	}

	/**
	 * @return the tipoRelazione
	 */
	public TipoRelazione getTipoRelazione() {
		return tipoRelazione;
	}

	/**
	 * @param tipoRelazione the tipoRelazione to set
	 */
	public void setTipoRelazione(TipoRelazione tipoRelazione) {
		this.tipoRelazione = tipoRelazione;
	}
	
	/**
	 * @return the importoDaDedurreSuFattura
	 */
	public BigDecimal getImportoDaDedurreSuFattura() {
		return importoDaDedurreSuFattura;
	}

	/**
	 * @param importoDaDedurreSuFattura the importoDaDedurreSuFattura to set
	 */
	public void setImportoDaDedurreSuFattura(BigDecimal importoDaDedurreSuFattura) {
		this.importoDaDedurreSuFattura = importoDaDedurreSuFattura;
	}

	/**
	 * @return the listaSubdocumentoIva
	 */
	@XmlTransient
	public List<SDI> getListaSubdocumentoIva() {
		return listaSubdocumentoIva;
	}
	
	/**
	 * Ottiene la lista dei subdocumenti iva di data classe
	
	 * @param classifClazz il tipo di subdocIva
	 * @return i subdoc di data classe
	 */
	@SuppressWarnings({ "unchecked"})
	public<T extends SubdocumentoIva<?, ?, ?>> List<T> getListaSubdocumentoIva(Class<T> classifClazz) {
		
		final List<T> result = new ArrayList<T>();
		
		for (SDI c : listaSubdocumentoIva) {
			if(classifClazz.isInstance(c)){
				result.add((T)c);
			}
		}
		
		return result;
	}

	/**
	 * @param listaSubdocumentoIva the listaSubdocumentoIva to set
	 */
	public void setListaSubdocumentoIva(List<SDI> listaSubdocumentoIva) {
		this.listaSubdocumentoIva = listaSubdocumentoIva != null ? listaSubdocumentoIva : new ArrayList<SDI>();
	}

	/**
	 * @return the collegatoAdAllegatoAtto
	 */
	public Boolean getCollegatoAdAllegatoAtto() {
		return collegatoAdAllegatoAtto;
	}

	/**
	 * @param collegatoAdAllegatoAtto the collegatoAdAllegatoAtto to set
	 */
	public void setCollegatoAdAllegatoAtto(Boolean collegatoAdAllegatoAtto) {
		this.collegatoAdAllegatoAtto = collegatoAdAllegatoAtto;
	}
	
	/**
	 * @return the dataCreazioneDocumento
	 */
	public Date getDataCreazioneDocumento() {
		return this.getDataCreazione();
	}

	/**
	 * @param dataCreazione the dataCreazione to set
	 */
	public void setDataCreazioneDocumento(Date dataCreazione) {
		this.setDataCreazione(dataCreazione);
	}
	
	/**
	 * @return the dataModificaDocumento
	 */
	public Date getDataModificaDocumento() {
		return this.getDataModifica();
	}

	/**
	 * @param dataModificaDocumento the dataModificaDocumento to set
	 */
	public void setDataModificaDocumento(Date dataModificaDocumento) {
		this.setDataModifica(dataModificaDocumento);
	}

	/**
	 * @return the flagDisabilitaRegistrazioneResidui
	 */
	public Boolean getFlagDisabilitaRegistrazioneResidui() {
		return flagDisabilitaRegistrazioneResidui;
	}

	/**
	 * @param flagDisabilitaRegistrazioneResidui the flagDisabilitaRegistrazioneResidui to set
																				
													
	 */
	public void setFlagDisabilitaRegistrazioneResidui(Boolean flagDisabilitaRegistrazioneResidui) {
		this.flagDisabilitaRegistrazioneResidui = flagDisabilitaRegistrazioneResidui;
	}

	/**
	 * @return the totaleImportoQuote
	 */
	public BigDecimal getTotaleImportoQuote() {
		return totaleImportoQuote;
	}

	/**
	 * @param totaleImportoQuote the totaleImportoQuote to set
	 */
	public void setTotaleImportoQuote(BigDecimal totaleImportoQuote) {
		this.totaleImportoQuote = totaleImportoQuote;
	}

	/**
	 * @return the totaleImportoDaDedurreQuote
	 */
	public BigDecimal getTotaleImportoDaDedurreQuote() {
		return totaleImportoDaDedurreQuote;
	}

	/**
	 * @param totaleImportoDaDedurreQuote the totaleImportoDaDedurreQuote to set
	 */
	public void setTotaleImportoDaDedurreQuote(BigDecimal totaleImportoDaDedurreQuote) {
		this.totaleImportoDaDedurreQuote = totaleImportoDaDedurreQuote;
	}

	/**
	 * @return the totaleImportoDocumentiEntrataFiglio
	 */
	public BigDecimal getTotaleImportoDocumentiEntrataFiglio() {
		return totaleImportoDocumentiEntrataFiglio;
	}

	/**
	 * @param totaleImportoDocumentiEntrataFiglio the totaleImportoDocumentiEntrataFiglio to set
																				  
													 
	 */
	public void setTotaleImportoDocumentiEntrataFiglio(BigDecimal totaleImportoDocumentiEntrataFiglio) {
		this.totaleImportoDocumentiEntrataFiglio = totaleImportoDocumentiEntrataFiglio;
	}

	/**
	 * @return the totaleImportoDocumentiSpesaFiglio
	 */
	public BigDecimal getTotaleImportoDocumentiSpesaFiglio() {
		return totaleImportoDocumentiSpesaFiglio;
	}

	/**
	 * @param totaleImportoDocumentiSpesaFiglio the totaleImportoDocumentiSpesaFiglio to set
																				 
												
	 */
	public void setTotaleImportoDocumentiSpesaFiglio(BigDecimal totaleImportoDocumentiSpesaFiglio) {
		this.totaleImportoDocumentiSpesaFiglio = totaleImportoDocumentiSpesaFiglio;
	}

	/**
	 * @return the totaleImportoRilevanteIvaQuote
	 */
	public BigDecimal getTotaleImportoRilevanteIvaQuote() {
		return totaleImportoRilevanteIvaQuote;
	}

	/**
	 * @param totaleImportoRilevanteIvaQuote the totaleImportoRilevanteIvaQuote to set
											 
	 */
	public void setTotaleImportoRilevanteIvaQuote(BigDecimal totaleImportoRilevanteIvaQuote) {
		this.totaleImportoRilevanteIvaQuote = totaleImportoRilevanteIvaQuote;
	}

	/**
	 * @return the totaleImportoNonRilevanteIvaQuote
	 */
	public BigDecimal getTotaleImportoNonRilevanteIvaQuote() {
		return totaleImportoNonRilevanteIvaQuote;
	}

	/**
	 * @param totaleImportoNonRilevanteIvaQuote the totaleImportoNonRilevanteIvaQuote to set
																				 
												
	 */
	public void setTotaleImportoNonRilevanteIvaQuote(BigDecimal totaleImportoNonRilevanteIvaQuote) {
		this.totaleImportoNonRilevanteIvaQuote = totaleImportoNonRilevanteIvaQuote;
	}

	/**
	 * @return the esisteQuotaRilevanteIva
	 */
	public Boolean getEsisteQuotaRilevanteIva() {
		return esisteQuotaRilevanteIva;
	}

	/**
	 * @param esisteQuotaRilevanteIva the esisteQuotaRilevanteIva to set
	 */
	public void setEsisteQuotaRilevanteIva(Boolean esisteQuotaRilevanteIva) {
		this.esisteQuotaRilevanteIva = esisteQuotaRilevanteIva;
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
	 * @return the esisteNCDCollegataADocumento
	 */
	public Boolean getEsisteNCDCollegataADocumento() {
		return esisteNCDCollegataADocumento;
	}

	/**
	 * @param esisteNCDCollegataADocumento the esisteNCDCollegataADocumento to set
	 */
	public void setEsisteNCDCollegataADocumento(Boolean esisteNCDCollegataADocumento) {
		this.esisteNCDCollegataADocumento = esisteNCDCollegataADocumento;
	}

	public String getStatoSDI() {
		return statoSDI;
	}

	public void setStatoSDI(String statoSDI) {
		this.statoSDI = statoSDI;
	}

	public String getEsitoStatoSDI() {
		return esitoStatoSDI;
	}

	public void setEsitoStatoSDI(String esitoStatoSDI) {
		this.esitoStatoSDI = esitoStatoSDI;
	}

	/**
	 * @return the cig
	 */
	public String getCig() {
		return cig;
	}

	/**
	 * @param cig the cig to set
	 */
	public void setCig(String cig) {
		this.cig = cig;
	}

	/**
	 * @return the cup
	 */
	public String getCup() {
		return cup;
	}

	/**
	 * @param cup the cup to set
	 */
	public void setCup(String cup) {
		this.cup = cup;
	}
	
	//SIAC-7567
	public boolean isFatturaAttiva() {
		return this.getTipoDocumento() != null && this.getTipoDocumento().getCodice() != null && "FTV".equals(this.getTipoDocumento().getCodice());
	}
}
