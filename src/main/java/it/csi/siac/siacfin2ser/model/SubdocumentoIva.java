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

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class SubdocumentoIva<D extends Documento<?,?>, SD extends Subdocumento<?,?>, SDI extends SubdocumentoIva<D, SD, ?>> extends Entita {
	
	// siac_t_subdoc_iva
	
	private static final long serialVersionUID = 5296066539750729746L;
	
	private Ente ente;
	
	// PK
	private Integer progressivoIVA;
	private Integer annoEsercizio;
	
	private Date dataRegistrazione;
	private Date dataProtocolloDefinitivo;
	private Integer numeroProtocolloDefinitivo;
	private Date dataProtocolloProvvisorio;
	private Integer numeroProtocolloProvvisorio;
	private String descrizioneIva;
	private Integer numeroOrdinativoDocumento;
	private Date dataOrdinativoDocumento;
	private Date dataCassaDocumento;
	
	//siacDValuta.valutaDesc	
	private Valuta valuta;
	private BigDecimal importoInValuta = BigDecimal.ZERO;
		
	//Attributi su siac_r_subdoc_iva_attr 
	private Boolean flagRegistrazioneIva;
	private Boolean flagRilevanteIRAP;
	private Boolean flagIntracomunitario;
	private Boolean flagNotaCredito;
	
	// Derivato
	private Boolean flagStampaDefinitivoProvvisorio;
	private Boolean flagStampaDefinitivoDefinitivo;
	
	@XmlElements({
		@XmlElement(name="subdocumentoIvaSpesa", type=SubdocumentoIvaSpesa.class),
		@XmlElement(name="subdocumentoIvaEntrata", type=SubdocumentoIvaEntrata.class) 
	})
	private SubdocumentoIva<?, ?, ?> subdocumentoIvaPadre;
	
	// Nota di credito
	//private List<SubdocumentoIva<D, SD>> listaNoteDiCredito = new ArrayList<SubdocumentoIva<D, SD>>();
	private List<SDI> listaNoteDiCredito = new ArrayList<SDI>();
	// Quote IVA differita
	private List<SDI> listaQuoteIvaDifferita = new ArrayList<SDI>();
	
	@XmlElements({
		@XmlElement(name="subdocumentoSpesa", type=SubdocumentoSpesa.class),
		@XmlElement(name="subdocumentoEntrata", type=SubdocumentoEntrata.class) 
	})
	private SD subdocumento;
	@XmlElements({
		@XmlElement(name="documentoSpesa", type=DocumentoSpesa.class),
		@XmlElement(name="documentoEntrata", type=DocumentoEntrata.class) 
	})
	private D documento;
	
	@Deprecated
	// field dociva_r_id ?
	private DocumentoIva documentoIva;
	private StatoSubdocumentoIva statoSubdocumentoIva;
	
	//siac_t_iva_registrazione siacDIvaRegistrazioneTipo
	private TipoRegistrazioneIva tipoRegistrazioneIva;
	
	//siac_t_iva_registro.siac_d_iva_registro_tipo	
	//private TipoRegistroIva tipoRegistroIva;
	//siac_t_iva_registro
	private RegistroIva registroIva;
	
	
	private AttivitaIva attivitaIva;
	
	//Aggiunto XmlElementWrapper! stando alla mappatura attuale non dovrebbe avere impatti sui template delle stampe!
	@XmlElementWrapper(name = "aliquote")
	@XmlElement(name = "aliquotaSubdocumentoIva")
	private List<AliquotaSubdocumentoIva> listaAliquotaSubdocumentoIva = new ArrayList<AliquotaSubdocumentoIva>();
	
	private TipoRelazione tipoRelazione;
		
	private BigDecimal totaleMovimentiIva = BigDecimal.ZERO;
	
	/**
	 * @return the progressivoIVA
	 */
	public Integer getProgressivoIVA() {
		return progressivoIVA;
	}
	/**
	 * @param progressivoIVA the progressivoIVA to set
	 */
	public void setProgressivoIVA(Integer progressivoIVA) {
		this.progressivoIVA = progressivoIVA;
	}
	
	public String getNumeroRegistrazioneIVA(){
		return getAnnoEsercizio()  + "/" + getProgressivoIVA();
	}
	/**
	 * @return the annoEsercizio
	 */
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}
	/**
	 * @param annoEsercizio the annoEsercizio to set
	 */
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}
	/**
	 * @return the dataRegistrazione
	 */
	public Date getDataRegistrazione() {
		return dataRegistrazione;
	}
	/**
	 * @param dataRegistrazione the dataRegistrazione to set
	 */
	public void setDataRegistrazione(Date dataRegistrazione) {
		this.dataRegistrazione = dataRegistrazione;
	}
	/**
	 * @return the dataProtocolloDefinitivo
	 */
	public Date getDataProtocolloDefinitivo() {
		return dataProtocolloDefinitivo;
	}
	/**
	 * @param dataProtocolloDefinitivo the dataProtocolloDefinitivo to set
	 */
	public void setDataProtocolloDefinitivo(Date dataProtocolloDefinitivo) {
		this.dataProtocolloDefinitivo = dataProtocolloDefinitivo;
	}
	/**
	 * @return the numeroProtocolloDefinitivo
	 */
	public Integer getNumeroProtocolloDefinitivo() {
		return numeroProtocolloDefinitivo;
	}
	/**
	 * @param numeroProtocolloDefinitivo the numeroProtocolloDefinitivo to set
	 */
	public void setNumeroProtocolloDefinitivo(Integer numeroProtocolloDefinitivo) {
		this.numeroProtocolloDefinitivo = numeroProtocolloDefinitivo;
	}
	/**
	 * @return the dataProtocolloProvvisorio
	 */
	public Date getDataProtocolloProvvisorio() {
		return dataProtocolloProvvisorio;
	}
	/**
	 * @param dataProtocolloProvvisorio the dataProtocolloProvvisorio to set
	 */
	public void setDataProtocolloProvvisorio(Date dataProtocolloProvvisorio) {
		this.dataProtocolloProvvisorio = dataProtocolloProvvisorio;
	}
	/**
	 * @return the numeroProtocolloProvvisorio
	 */
	public Integer getNumeroProtocolloProvvisorio() {
		return numeroProtocolloProvvisorio;
	}
	/**
	 * @param numeroProtocolloProvvisorio the numeroProtocolloProvvisorio to set
	 */
	public void setNumeroProtocolloProvvisorio(Integer numeroProtocolloProvvisorio) {
		this.numeroProtocolloProvvisorio = numeroProtocolloProvvisorio;
	}
	/**
	 * @return the flagRegistrazioneIva
	 */
	public Boolean getFlagRegistrazioneIva() {
		return flagRegistrazioneIva;
	}
	/**
	 * @param flagRegistrazioneIva the flagRegistrazioneIva to set
	 */
	public void setFlagRegistrazioneIva(Boolean flagRegistrazioneIva) {
		this.flagRegistrazioneIva = flagRegistrazioneIva;
	}
	/**
	 * @return the flagRilevanteIRAP
	 */
	public Boolean getFlagRilevanteIRAP() {
		return flagRilevanteIRAP;
	}
	/**
	 * @param flagRilevanteIRAP the flagRilevanteIRAP to set
	 */
	public void setFlagRilevanteIRAP(Boolean flagRilevanteIRAP) {
		this.flagRilevanteIRAP = flagRilevanteIRAP;
	}
	/**
	 * @return the descrizioneIva
	 */
	public String getDescrizioneIva() {
		return descrizioneIva;
	}
	/**
	 * @param descrizioneIva the descrizioneIva to set
	 */
	public void setDescrizioneIva(String descrizioneIva) {
		this.descrizioneIva = descrizioneIva;
	}
	/**
	 * @return the numeroOrdinativoDocumento
	 */
	public Integer getNumeroOrdinativoDocumento() {
		return numeroOrdinativoDocumento;
	}
	/**
	 * @param numeroOrdinativoDocumento the numeroOrdinativoDocumento to set
	 */
	public void setNumeroOrdinativoDocumento(Integer numeroOrdinativoDocumento) {
		this.numeroOrdinativoDocumento = numeroOrdinativoDocumento;
	}
	/**
	 * @return the dataOrdinativoDocumento
	 */
	public Date getDataOrdinativoDocumento() {
		return dataOrdinativoDocumento;
	}
	/**
	 * @param dataOrdinativoDocumento the dataOrdinativoDocumento to set
	 */
	public void setDataOrdinativoDocumento(Date dataOrdinativoDocumento) {
		this.dataOrdinativoDocumento = dataOrdinativoDocumento;
	}
	/**
	 * @return the dataCassaDocumento
	 */
	public Date getDataCassaDocumento() {
		return dataCassaDocumento;
	}
	/**
	 * @param dataCassaDocumento the dataCassaDocumento to set
	 */
	public void setDataCassaDocumento(Date dataCassaDocumento) {
		this.dataCassaDocumento = dataCassaDocumento;
	}
	/**
	 * @return the flagIntracomunitario
	 */
	public Boolean getFlagIntracomunitario() {
		return flagIntracomunitario;
	}
	/**
	 * @param flagIntracomunitario the flagIntracomunitario to set
	 */
	public void setFlagIntracomunitario(Boolean flagIntracomunitario) {
		this.flagIntracomunitario = flagIntracomunitario;
	}
	
	/**
	 * @return the valuta
	 */
	public Valuta getValuta() {
		return valuta;
	}
	/**
	 * @param valuta the valuta to set
	 */
	public void setValuta(Valuta valuta) {
		this.valuta = valuta;
	}
	/**
	 * @return the importoInValuta
	 */
	public BigDecimal getImportoInValuta() {
		return importoInValuta;
	}
	/**
	 * @param importoInValuta the importoInValuta to set
	 */
	public void setImportoInValuta(BigDecimal importoInValuta) {
		this.importoInValuta = importoInValuta != null ? importoInValuta : BigDecimal.ZERO;
	}
	/**
	 * @return the flagNotaCredito
	 */
	public Boolean getFlagNotaCredito() {
		return flagNotaCredito;
	}
	/**
	 * @param flagNotaCredito the flagNotaCredito to set
	 */
	public void setFlagNotaCredito(Boolean flagNotaCredito) {
		this.flagNotaCredito = flagNotaCredito;
	}
	/**
	 * @return the flagStampaDefinitivoProvvisorio
	 */
	public Boolean getFlagStampaDefinitivoProvvisorio() {
		return flagStampaDefinitivoProvvisorio;
	}
	/**
	 * @param flagStampaDefinitivoProvvisorio the flagStampaDefinitivoProvvisorio to set
	 */
	public void setFlagStampaDefinitivoProvvisorio(Boolean flagStampaDefinitivoProvvisorio) {
		this.flagStampaDefinitivoProvvisorio = flagStampaDefinitivoProvvisorio;
	}
	/**
	 * @return the flagStampaDefinitivoDefinitivo
	 */
	public Boolean getFlagStampaDefinitivoDefinitivo() {
		return flagStampaDefinitivoDefinitivo;
	}
	/**
	 * @param flagStampaDefinitivoDefinitivo the flagStampaDefinitivoDefinitivo to set
	 */
	public void setFlagStampaDefinitivoDefinitivo(Boolean flagStampaDefinitivoDefinitivo) {
		this.flagStampaDefinitivoDefinitivo = flagStampaDefinitivoDefinitivo;
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
	 * @return the listaNoteDiCredito
	 */
	public List<SDI> getListaNoteDiCredito() {
		return listaNoteDiCredito;
	}
	/**
	 * @param listaNoteDiCredito the listaNoteDiCredito to set
	 */
	public void setListaNoteDiCredito(List<SDI> notaDiCredito) {
		this.listaNoteDiCredito = notaDiCredito != null ? notaDiCredito : new ArrayList<SDI>();
	}
	
	public void addNotaDiCredito(SDI notaDiCredito) {
		this.listaNoteDiCredito.add(notaDiCredito);
	}
	
	/**
	 * @return the listaQuoteIvaDifferita
	 */
	public List<SDI> getListaQuoteIvaDifferita() {
		return listaQuoteIvaDifferita;
	}
	/**
	 * @param listaQuoteIvaDifferita the listaQuoteIvaDifferita to set
	 */
	public void setListaQuoteIvaDifferita(List<SDI> quoteIvaDifferita) {
		this.listaQuoteIvaDifferita = quoteIvaDifferita != null ? quoteIvaDifferita : new ArrayList<SDI>();
	}
	
	public void addQuotaIvaDifferita(SDI quotaIvaDifferita) {		
		this.listaQuoteIvaDifferita.add(quotaIvaDifferita);
	}
	
//	/**
//	 * @return the listaSubdocumenti
//	 */
//	public List<Subdocumento> getListaSubdocumenti() {
//		return listaSubdocumenti;
//	}
//	/**
//	 * @param listaSubdocumenti the listaSubdocumenti to set
//	 */
//	public void setListaSubdocumenti(List<Subdocumento> listaSubdocumento) {
//		if(listaSubdocumento==null){
//			listaSubdocumento = new ArrayList<Subdocumento>();
//		}
//		this.listaSubdocumenti = listaSubdocumento;
//	}
//	
//	public void addSubdocumento(Subdocumento subdocumento) {
//		this.listaSubdocumenti.add(subdocumento);
//	}
	
	
	/**
	 * @return the subdocumento
	 */
	@XmlTransient
	public SD getSubdocumento() {
		return subdocumento;
	}
	/**
	 * @param subdocumento the subdocumento to set
	 */
	public void setSubdocumento(SD subdocumento) {
		this.subdocumento = subdocumento;
	}
	/**
	 * @return the documento
	 */
	@XmlTransient
	public D getDocumento() {
		return documento;
	}
	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(D documento) {
		this.documento = documento;
	}
	/**
	 * @return the documentoIva
	 */
	@Deprecated
	public DocumentoIva getDocumentoIva() {
		return documentoIva;
	}
	/**
	 * @param documentoIva the documentoIva to set
	 */
	@Deprecated
	public void setDocumentoIva(DocumentoIva documentoIva) {
		this.documentoIva = documentoIva;
	}
	/**
	 * @return the tipoRegistrazioneIva
	 */
	public TipoRegistrazioneIva getTipoRegistrazioneIva() {
		return tipoRegistrazioneIva;
	}
	/**
	 * @param tipoRegistrazioneIva the tipoRegistrazioneIva to set
	 */
	public void setTipoRegistrazioneIva(TipoRegistrazioneIva tipoRegistrazioneIva) {
		this.tipoRegistrazioneIva = tipoRegistrazioneIva;
	}
	/**
	 * @return the statoSubdocumentoIva
	 */
	public StatoSubdocumentoIva getStatoSubdocumentoIva() {
		return statoSubdocumentoIva;
	}
	/**
	 * @param statoSubdocumentoIva the statoSubdocumentoIva to set
	 */
	public void setStatoSubdocumentoIva(StatoSubdocumentoIva statoSubdocumentoIva) {
		this.statoSubdocumentoIva = statoSubdocumentoIva;
	}	
	/**
	 * @return the registroIva
	 */
	public RegistroIva getRegistroIva() {
		return registroIva;
	}
	/**
	 * @param registroIva the registroIva to set
	 */
	public void setRegistroIva(RegistroIva listaRegistroIva) {
		this.registroIva = listaRegistroIva;
	}
	/**
	 * @return the attivitaIva
	 */
	public AttivitaIva getAttivitaIva() {
		return attivitaIva;
	}
	/**
	 * @param attivitaIva the attivitaIva to set
	 */
	public void setAttivitaIva(AttivitaIva attivitaIva) {
		this.attivitaIva = attivitaIva;
	}
	/**
	 * @return the listaAliquotaSubdocumentoIva
	 */
	@XmlTransient
	public List<AliquotaSubdocumentoIva> getListaAliquotaSubdocumentoIva() {
		return listaAliquotaSubdocumentoIva;
	}
	
	
	public BigDecimal calcolaImportoTotaleAliquotaSubdocumentoIva() {		
		BigDecimal result = BigDecimal.ZERO;
		for(AliquotaSubdocumentoIva asi : getListaAliquotaSubdocumentoIva()){
			result = result.add(asi.getTotale());
		}		
		return result;
	}
	
	
	/**
	 * @param listaAliquotaSubdocumentoIva the listaAliquotaSubdocumentoIva to set
	 */
	public void setListaAliquotaSubdocumentoIva(List<AliquotaSubdocumentoIva> listaAliquotaSubdocumentoIva) {
		this.listaAliquotaSubdocumentoIva = listaAliquotaSubdocumentoIva != null ? listaAliquotaSubdocumentoIva : new ArrayList<AliquotaSubdocumentoIva>();
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
	 * Calcola il totale dei movimenti Iva collegati (AliquotaSubdocumentoIva)
	 * 
	 * @return la somma dei totali dei movimenti
	 */
	public BigDecimal calcolaTotaleMovimentiIva() {
		BigDecimal result = BigDecimal.ZERO;
		for(AliquotaSubdocumentoIva asi : getListaAliquotaSubdocumentoIva()) {
			result = result.add(asi.getTotale());
		}
		setTotaleMovimentiIva(result);
		return result;
	}	
	
	/**
	 * Restituisce il Documento sia se collegato direttamente al subdocumentoIva
	 * e sia se collegato al Subdocumento.
	 * @return il documento collegato
	 */
	public Documento<?, ?> getDocumentoCollegato() {
		if(getDocumento()!=null){
			return getDocumento(); 
		} else if (getSubdocumento()!=null) {
			return getSubdocumento().getDocumento();
		} else if (getSubdocumentoIvaPadre()!=null) {
			return getSubdocumentoIvaPadre().getDocumentoCollegato();
		}	
		return null;
	}
	
	/**
	 * Restituisce il Documento sia se collegato direttamente al subdocumentoIva
	 * e sia se collegato al Subdocumento.
	 * <br>
	 * Correttamente castato.
	 * 
	 * @return il documento collegato
	 */
	@SuppressWarnings("unchecked")
	public D getDocumentoCollegatoCastato() {
		if(getDocumento()!=null){
			return getDocumento(); 
		} else if (getSubdocumento()!=null) {
			return (D) getSubdocumento().getDocumento();
		} else if (getSubdocumentoIvaPadre()!=null) {
			return (D) getSubdocumentoIvaPadre().getDocumentoCollegato();
		}	
		return null;
	}
	/**
	 * @return the subdocumentoIvaPadre
	 */
	@XmlTransient
	public SubdocumentoIva<?, ?, ?> getSubdocumentoIvaPadre() {
		return subdocumentoIvaPadre;
	}
	/**
	 * @param subdocumentoIvaPadre the subdocumentoIvaPadre to set
	 */
	public void setSubdocumentoIvaPadre(SubdocumentoIva<?, ?, ?> subdocumentoIvaPadre) {
		this.subdocumentoIvaPadre = subdocumentoIvaPadre;
	}
	/**
	 * @return the totaleMovimentiIva
	 */
	public BigDecimal getTotaleMovimentiIva() {
		return totaleMovimentiIva;
	}
	/**
	 * @param totaleMovimentiIva the totaleMovimentiIva to set
	 */
	public void setTotaleMovimentiIva(BigDecimal totaleMovimentiIva) {
		this.totaleMovimentiIva = totaleMovimentiIva != null ? totaleMovimentiIva : BigDecimal.ZERO;
	}
	
	/**
	 * Ottiene il totale degli imponibili dei MovimentiIva.
	 * 
	 * @return il totale degli imponibili
	 */
	public BigDecimal getTotaleImponibileMovimentiIva() {
		BigDecimal result = BigDecimal.ZERO;
		for (AliquotaSubdocumentoIva asi : listaAliquotaSubdocumentoIva) {
			result = result.add(asi.getImponibile());
		}
		return result;
	}
	
	/**
	 * Ottiene il totale delle imposte dei MovimentiIva.
	 * 
	 * @return il totale delle imposte
	 */
	public BigDecimal getTotaleImpostaMovimentiIva() {
		BigDecimal result = BigDecimal.ZERO;
		for (AliquotaSubdocumentoIva asi : listaAliquotaSubdocumentoIva) {
			result = result.add(asi.getImposta());
		}
		return result;
	}
	
	/**
	 * Ottiene il totale dei totali dei MovimentiIva.
	 * 
	 * @return il totale dei totali
	 */
	public BigDecimal getTotaleTotaleMovimentiIva() {
		BigDecimal result = BigDecimal.ZERO;
		for (AliquotaSubdocumentoIva asi : listaAliquotaSubdocumentoIva) {
			result = result.add(asi.getTotale());
		}
		return result;
	}
	
	/**
	 * Ottiene il totale imposta detraibile dei MovimentiIva.
	 * 
	 * @return totale imposta detraibile
	 */
	public BigDecimal getTotaleImpostaDetraibileMovimentiIva() {
		BigDecimal result = BigDecimal.ZERO;
		for (AliquotaSubdocumentoIva asi : listaAliquotaSubdocumentoIva) {
			result = result.add(asi.getImpostaDetraibile());
		}
		return result;
	}
	
	/**
	 * Ottiene il totale imposta indetraibile dei MovimentiIva.
	 * 
	 * @return totale imposta indetraibile
	 */
	public BigDecimal getTotaleImpostaIndetraibileMovimentiIva() {
		BigDecimal result = BigDecimal.ZERO;
		for (AliquotaSubdocumentoIva asi : listaAliquotaSubdocumentoIva) {
			result = result.add(asi.getImpostaIndetraibile());
		}
		return result;
	}

	

}
