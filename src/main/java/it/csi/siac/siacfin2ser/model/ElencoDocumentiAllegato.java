/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * The Class ElencoDocumentiAllegato.
 *
 * @author 70604
 * @version 1.0
 * @created 08-set-2014 17.51.48
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class ElencoDocumentiAllegato extends EntitaEnte {
	
	private static final long serialVersionUID = -581871186743144927L;
	
	
	// Primary Key
	private Integer anno;
	/**
	 * Il sistema calcola il progressivo per il REGISTRO ELENCO da inserire: il
	 * progressivo &eacute; calcolato come progressivo univoco nell'ambito dell'anno di
	 * bilancio.
	 */
	private Integer numero;
	
	// Obbligatorii
	
	// Derivati
	/**
	 * Somma dei sub-documenti di spesa non annullati collegati all'elenco escluse i
	 * documenti di tipo <em>nota di credito</em>, tenendo conto che l'importo deve essere
	 * decurtato degli <em>importi da dedurre</em>.
	 */
	private BigDecimal totaleQuoteSpese;
	/**
	 * Somma delle liquidazioni Definitive legate all'elenco senza ordinativo non annullato
	 */
	private BigDecimal totaleDaPagare;
	/**
	 * Somma dei sub-documenti di entrata non annullati collegati all'elenco escluse i
	 * documenti di tipo <em>nota di credito</em>, tenendo conto che l'importo deve essere
	 * decurtato degli <em>importi da dedurre</em>.
	 */
	private BigDecimal totaleQuoteEntrate;
	/**
	 * Somma dei sub-documenti di entrata con tipoConvalida diversa da nullo senza un
	 * ordinativo di incasso non annullato
	 */
	private BigDecimal totaleDaIncassare;
	/**
	 * Somma dei sub-documenti di entrata con tipoConvalida nullo
	 */
	private BigDecimal totaleDaConvalidareEntrata;
	/**
	 * Somma dei sub-documenti di spesa con tipoConvalida nullo
	 */
	private BigDecimal totaleDaConvalidareSpesa;
	/**
	 * &Sigma; importo per tipoConvalida nullo e con flagACopertura nullo dei subdocumenti di spesa legati all'elenco
	 */
	// new
	private BigDecimal totaleDaConvalidareSpesaNoCopertura;
	/**
	 * &Sigma; importo per tipoConvalida nullo e con flagACopertura nullo dei subdocumenti di entrata legati all'elenco
	 */
	// new
	private BigDecimal totaleDaConvalidareEntrataNoCopertura;
	/**
	 * Almeno una delle quote collegate all'elenco &eacute; collegata a un provvisorio di cassa.
	 */
	private Boolean contieneQuoteACopertura;
	
	// Standard
	/**
	 * Data di quando viene ricevuto e caricato l'elenco inviato da un sistema esterno.
	 */
	private Date dataTrasmissione;
	
	/**
	 * Anno elenco del sistema esterno
	 */
	private Integer annoSysEsterno;
	/**
	 * Numero elenco del sistema esterno
	 */
	private String numeroSysEsterno;
	/**
	 * fonte che ha trasmesso i dati
	 */
	private String sysEsterno;
//	private String utenteModifica;
//	private String utenteCancellazione;
//	private String utenteCreazione;
	
	private StatoOperativoElencoDocumenti statoOperativoElencoDocumenti;
	private AllegatoAtto allegatoAtto;
	
	@XmlElementWrapper(name = "subdocumenti")
	@XmlElements({
		@XmlElement(name="subdocumentoSpesa", type=SubdocumentoSpesa.class),
		@XmlElement(name="subdocumentoEntrata", type=SubdocumentoEntrata.class)
	})
	// Subdocumenti di spesa e di entrata
	private List<Subdocumento<?, ?>> subdocumenti = new ArrayList<Subdocumento<?,?>>();

	
	
	
	
	@XmlElementWrapper(name = "subdocumentiIva")
	@XmlElements({
		@XmlElement(name="subdocumentoIvaSpesa", type=SubdocumentoIvaSpesa.class),
		@XmlElement(name="subdocumentoIvaEntrata", type=SubdocumentoIvaEntrata.class)
	})
	// Subdocumenti IVA di spesa e di entrata
	private List<SubdocumentoIva<?, ?, ?>> subdocumentiIva = new ArrayList<SubdocumentoIva<?,?,?>>();
	
	
	/**
	 * Numero delle quote (subdoc spesa e entrata) presenti in elenco.
	 */
	private Long numeroQuoteInElenco;
	
	/**
	 * Se impostato a true l'inserimento nel servizio di ElaboraFileDocumenti viene saltato.
	 */
	@XmlAttribute(name="saltaInserimento", required=false)
	private Boolean saltaInserimentoInCaricaDocumenti;
	
	// SIAC-5043
	private BigDecimal totalePagato;
	private BigDecimal totaleIncassato;
	
	//SIAC-6261
	private Boolean hasImpegnoConfermaDurc;
	private Date dataFineValiditaDurc;

	
	/**
	 * Gets the anno.
	 *
	 * @return the anno
	 */
	public Integer getAnno() {
		return anno;
	}

	/**
	 * Sets the anno.
	 *
	 * @param anno the anno to set
	 */
	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	/**
	 * Gets the numero.
	 *
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * Sets the numero.
	 *
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * Gets the totale quote spese.
	 *
	 * @return the totaleQuoteSpese
	 */
	public BigDecimal getTotaleQuoteSpese() {
		return totaleQuoteSpese;
	}
	/**
	 * Gets the totale quote spese.
	 *
	 * @return the totaleQuoteSpese
	 */
	public BigDecimal getTotaleQuoteSpeseNotNull() {
		return totaleQuoteSpese != null ? totaleQuoteSpese : BigDecimal.ZERO;
	}

	/**
	 * Sets the totale quote spese.
	 *
	 * @param totaleQuoteSpese the totaleQuoteSpese to set
	 */
	public void setTotaleQuoteSpese(BigDecimal totaleQuoteSpese) {
		this.totaleQuoteSpese = totaleQuoteSpese;
	}

	/**
	 * Gets the totale da pagare.
	 *
	 * @return the totaleDaPagare
	 */
	public BigDecimal getTotaleDaPagare() {
		return totaleDaPagare;
	}
	
	/**
	 * Gets the totale da pagare.
	 *
	 * @return the totaleDaPagare
	 */
	public BigDecimal getTotaleDaPagareNotNull() {
		return totaleDaPagare != null ? totaleDaPagare : BigDecimal.ZERO;
	}

	/**
	 * Sets the totale da pagare.
	 *
	 * @param totaleDaPagare the totaleDaPagare to set
	 */
	public void setTotaleDaPagare(BigDecimal totaleDaPagare) {
		this.totaleDaPagare = totaleDaPagare;
	}

	/**
	 * Gets the totale quote entrate.
	 *
	 * @return the totaleQuoteEntrate
	 */
	public BigDecimal getTotaleQuoteEntrate() {
		return totaleQuoteEntrate;
	}
	
	/**
	 * Gets the totale quote entrate.
	 *
	 * @return the totaleQuoteEntrate
	 */
	public BigDecimal getTotaleQuoteEntrateNotNull() {
		return totaleQuoteEntrate != null ? totaleQuoteEntrate : BigDecimal.ZERO;
	}

	/**
	 * Sets the totale quote entrate.
	 *
	 * @param totaleQuoteEntrate the totaleQuoteEntrate to set
	 */
	public void setTotaleQuoteEntrate(BigDecimal totaleQuoteEntrate) {
		this.totaleQuoteEntrate = totaleQuoteEntrate;
	}

	/**
	 * Gets the totale da incassare.
	 *
	 * @return the totaleDaIncassare
	 */
	public BigDecimal getTotaleDaIncassare() {
		return totaleDaIncassare;
	}
	
	/**
	 * Gets the totale da incassare.
	 *
	 * @return the totaleDaIncassare
	 */
	public BigDecimal getTotaleDaIncassareNotNull() {
		return totaleDaIncassare != null ? totaleDaIncassare : BigDecimal.ZERO;
	}

	/**
	 * Sets the totale da incassare.
	 *
	 * @param totaleDaIncassare the totaleDaIncassare to set
	 */
	public void setTotaleDaIncassare(BigDecimal totaleDaIncassare) {
		this.totaleDaIncassare = totaleDaIncassare;
	}

	/**
	 * Gets the totale da convalidare entrata.
	 *
	 * @return the totaleDaConvalidareEntrata
	 */
	public BigDecimal getTotaleDaConvalidareEntrata() {
		return totaleDaConvalidareEntrata;
	}
	
	/**
	 * Gets the totale da convalidare entrata.
	 *
	 * @return the totaleDaConvalidareEntrata
	 */
	public BigDecimal getTotaleDaConvalidareEntrataNotNull() {
		return totaleDaConvalidareEntrata != null ? totaleDaConvalidareEntrata : BigDecimal.ZERO;
	}

	/**
	 * Sets the totale da convalidare entrata.
	 *
	 * @param totaleDaConvalidareEntrata the totaleDaConvalidareEntrata to set
	 */
	public void setTotaleDaConvalidareEntrata(BigDecimal totaleDaConvalidareEntrata) {
		this.totaleDaConvalidareEntrata = totaleDaConvalidareEntrata;
	}

	/**
	 * Gets the totale da convalidare spesa.
	 *
	 * @return the totaleDaConvalidareSpesa
	 */
	public BigDecimal getTotaleDaConvalidareSpesa() {
		return totaleDaConvalidareSpesa;
	}
	
	/**
	 * Gets the totale da convalidare spesa.
	 *
	 * @return the totaleDaConvalidareSpesa
	 */
	public BigDecimal getTotaleDaConvalidareSpesaNotNull() {
		return totaleDaConvalidareSpesa != null ? totaleDaConvalidareSpesa : BigDecimal.ZERO;
	}

	/**
	 * Sets the totale da convalidare spesa.
	 *
	 * @param totaleDaConvalidareSpesa the totaleDaConvalidareSpesa to set
	 */
	public void setTotaleDaConvalidareSpesa(BigDecimal totaleDaConvalidareSpesa) {
		this.totaleDaConvalidareSpesa = totaleDaConvalidareSpesa;
	}

	/**
	 * Gets the totale da convalidare spesa no copertura.
	 *
	 * @return the totaleDaConvalidareSpesaNoCopertura
	 */
	public BigDecimal getTotaleDaConvalidareSpesaNoCopertura() {
		return totaleDaConvalidareSpesaNoCopertura;
	}
	
	/**
	 * Gets the totale da convalidare spesa no copertura.
	 *
	 * @return the totaleDaConvalidareSpesaNoCopertura
	 */
	public BigDecimal getTotaleDaConvalidareSpesaNoCoperturaNotNull() {
		return totaleDaConvalidareSpesaNoCopertura != null ? totaleDaConvalidareSpesaNoCopertura : BigDecimal.ZERO;
	}

	/**
	 * Sets the totale da convalidare spesa no copertura.
	 *
	 * @param totaleDaConvalidareSpesaNoCopertura the totaleDaConvalidareSpesaNoCopertura to set
	 */
	public void setTotaleDaConvalidareSpesaNoCopertura(BigDecimal totaleDaConvalidareSpesaNoCopertura) {
		this.totaleDaConvalidareSpesaNoCopertura = totaleDaConvalidareSpesaNoCopertura;
	}

	/**
	 * Gets the totale da convalidare entrata no copertura.
	 *
	 * @return the totaleDaConvalidareEntrataNoCopertura
	 */
	public BigDecimal getTotaleDaConvalidareEntrataNoCopertura() {
		return totaleDaConvalidareEntrataNoCopertura;
	}
	
	/**
	 * Gets the totale da convalidare entrata no copertura.
	 *
	 * @return the totaleDaConvalidareEntrataNoCopertura
	 */
	public BigDecimal getTotaleDaConvalidareEntrataNoCoperturaNotNull() {
		return totaleDaConvalidareEntrataNoCopertura != null ? totaleDaConvalidareEntrataNoCopertura : BigDecimal.ZERO;
	}

	/**
	 * Sets the totale da convalidare entrata no copertura.
	 *
	 * @param totaleDaConvalidareEntrataNoCopertura the totaleDaConvalidareEntrataNoCopertura to set
	 */
	public void setTotaleDaConvalidareEntrataNoCopertura(BigDecimal totaleDaConvalidareEntrataNoCopertura) {
		this.totaleDaConvalidareEntrataNoCopertura = totaleDaConvalidareEntrataNoCopertura;
	}

	/**
	 * Gets the contiene quote a copertura.
	 *
	 * @return the contieneQuoteACopertura
	 */
	public Boolean getContieneQuoteACopertura() {
		return contieneQuoteACopertura;
	}

	/**
	 * Sets the contiene quote a copertura.
	 *
	 * @param contieneQuoteACopertura the contieneQuoteACopertura to set
	 */
	public void setContieneQuoteACopertura(Boolean contieneQuoteACopertura) {
		this.contieneQuoteACopertura = contieneQuoteACopertura;
	}

	/**
	 * Gets the data trasmissione.
	 *
	 * @return the dataTrasmissione
	 */
	public Date getDataTrasmissione() {
		return dataTrasmissione;
	}

	/**
	 * Sets the data trasmissione.
	 *
	 * @param dataTrasmissione the dataTrasmissione to set
	 */
	public void setDataTrasmissione(Date dataTrasmissione) {
		this.dataTrasmissione = dataTrasmissione;
	}

	/**
	 * Gets the anno sys esterno.
	 *
	 * @return the annoSysEsterno
	 */
	public Integer getAnnoSysEsterno() {
		return annoSysEsterno;
	}

	/**
	 * Sets the anno sys esterno.
	 *
	 * @param annoSysEsterno the annoSysEsterno to set
	 */
	public void setAnnoSysEsterno(Integer annoSysEsterno) {
		this.annoSysEsterno = annoSysEsterno;
	}

	/**
	 * Gets the numero sys esterno.
	 *
	 * @return the numeroSysEsterno
	 */
	public String getNumeroSysEsterno() {
		return numeroSysEsterno;
	}

	/**
	 * Sets the numero sys esterno.
	 *
	 * @param numeroSysEsterno the numeroSysEsterno to set
	 */
	public void setNumeroSysEsterno(String numeroSysEsterno) {
		this.numeroSysEsterno = numeroSysEsterno;
	}

	/**
	 * Gets the sys esterno.
	 *
	 * @return the sysEsterno
	 */
	public String getSysEsterno() {
		return sysEsterno;
	}

	/**
	 * Sets the sys esterno.
	 *
	 * @param sysEsterno the sysEsterno to set
	 */
	public void setSysEsterno(String sysEsterno) {
		this.sysEsterno = sysEsterno;
	}

	/**
	 * Gets the stato operativo elenco documenti.
	 *
	 * @return the statoOperativoElencoDocumenti
	 */
	public StatoOperativoElencoDocumenti getStatoOperativoElencoDocumenti() {
		return statoOperativoElencoDocumenti;
	}

	/**
	 * Sets the stato operativo elenco documenti.
	 *
	 * @param statoOperativoElencoDocumenti the statoOperativoElencoDocumenti to set
	 */
	public void setStatoOperativoElencoDocumenti(StatoOperativoElencoDocumenti statoOperativoElencoDocumenti) {
		this.statoOperativoElencoDocumenti = statoOperativoElencoDocumenti;
	}

	/**
	 * Gets the allegato atto.
	 *
	 * @return the allegatoAtto
	 */
	public AllegatoAtto getAllegatoAtto() {
		return allegatoAtto;
	}

	/**
	 * Sets the allegato atto.
	 *
	 * @param allegatoAtto the allegatoAtto to set
	 */
	public void setAllegatoAtto(AllegatoAtto allegatoAtto) {
		this.allegatoAtto = allegatoAtto;
	}

	/**
	 * Gets the subdocumenti.
	 *
	 * @return the subdocumenti
	 */
	@XmlTransient
	public List<Subdocumento<?, ?>> getSubdocumenti() {
		return subdocumenti;
	}
	
	/**
	 * Gets the subdocumenti IVA.
	 *
	 * @return the subdocumenti IVA
	 */
	@XmlTransient
	public List<SubdocumentoIva<?, ?, ?>> getSubdocumentiIva() {
		return subdocumentiIva;
	}

	/**
	 * Sets the subdocumenti.
	 *
	 * @param subdocumenti the subdocumenti to set
	 */
	public void setSubdocumenti(List<Subdocumento<?, ?>> subdocumenti) {
		this.subdocumenti = subdocumenti != null ? subdocumenti : new ArrayList<Subdocumento<?,?>>();
	}
	
	/**
	 * Sets the subdocumenti IVA.
	 *
	 * @param subdocumentiIva the subdocumenti IVA to set
	 */
	public void setSubdocumentiIva(List<SubdocumentoIva<?,?,?>> subdocumentiIva) {
		this.subdocumentiIva = subdocumentiIva != null ? subdocumentiIva : new ArrayList<SubdocumentoIva<?,?,?>>();
	}
	
	/**
	 * Gets the subdocumenti spesa.
	 *
	 * @return the subdocumentiSpesa
	 */
	public List<SubdocumentoSpesa> getSubdocumentiSpesa() {
		return getSubdocumenti(SubdocumentoSpesa.class);
	}
	
	/**
	 * Gets the subdocumenti entrata.
	 *
	 * @return the subdocumentiEntrata
	 */
	public List<SubdocumentoEntrata> getSubdocumentiEntrata() {
		return getSubdocumenti(SubdocumentoEntrata.class);
	}
	
	
	/**
	 * Gets the subdocumenti Iva spesa.
	 *
	 * @return the subdocumentiIvaSpesa
	 */
	public List<SubdocumentoIvaSpesa> getSubdocumentiIvaSpesa() {
		return getSubdocumentiIva(SubdocumentoIvaSpesa.class);
	}
	
	/**
	 * Gets the subdocumenti Iva entrata.
	 *
	 * @return the subdocumentiIvaEntrata 
	 */
	public List<SubdocumentoIvaEntrata> getSubdocumentiIvaEntrata() {
		return getSubdocumentiIva(SubdocumentoIvaEntrata.class);
	}
	
	
	/**
	 * Ottiene i subdocumenti relativi ad una data classe.
	 *
	 * @param <SD> the generic type
	 * @param clazz la classe dei subdocumenti
	 * @return i subdocumenti di data classe
	 */
	@SuppressWarnings("unchecked")
	private <SD extends Subdocumento<?, ?>> List<SD> getSubdocumenti(Class<SD> clazz) {
		final List<SD> result = new ArrayList<SD>();
		for(Subdocumento<?, ?> sub : subdocumenti) {
			if(clazz.isInstance(sub)) {
				result.add((SD)sub);
			}
		}
		return result;
	}
	
	
	/**
	 * Ottiene i subdocumenti relativi ad una data classe.
	 *
	 * @param <SDI> the generic type
	 * @param clazz la classe dei subdocumenti
	 * @return i subdocumenti di data classe
	 */
	@SuppressWarnings("unchecked")
	private <SDI extends SubdocumentoIva<?, ?, ?>> List<SDI> getSubdocumentiIva(Class<SDI> clazz) {
		final List<SDI> result = new ArrayList<SDI>();
		for(SubdocumentoIva<?, ?, ?> sub : subdocumentiIva) {
			if(clazz.isInstance(sub)) {
				result.add((SDI)sub);
			}
		}
		return result;
	}
	
	
	/**
	 * Calcola totale importo quote spesa.
	 *
	 * @return the big decimal
	 */
	public BigDecimal calcolaTotaleImportoQuoteSpesa() {
		BigDecimal result = BigDecimal.ZERO;
		for (SubdocumentoSpesa ss : getSubdocumentiSpesa()) {
			result = result.add(ss.getImportoNotNull());
		}
		return result;
	}
	
	
	/**
	 * Calcola totale importo quote entrata.
	 *
	 * @return the big decimal
	 */
	public BigDecimal calcolaTotaleImportoQuoteEntrata() {
		BigDecimal result = BigDecimal.ZERO;
		for (SubdocumentoEntrata se : getSubdocumentiEntrata()) {
			result = result.add(se.getImportoNotNull());
		}
		return result;
	}
	
	/**
	 * Gets the totale quote netti.
	 *
	 * @return the totaleQuoteNetti
	 */
	public BigDecimal getTotaleQuoteNetti() {
		return getTotaleQuoteEntrateNotNull().subtract(getTotaleQuoteSpeseNotNull());
	}
	

	/**
	 * @return the numeroQuoteInElenco
	 */
	public Long getNumeroQuoteInElenco() {
		return numeroQuoteInElenco;
	}

	/**
	 * @param numeroQuoteInElenco the numeroQuoteInElenco to set
	 */
	public void setNumeroQuoteInElenco(Long numeroQuoteInElenco) {
		this.numeroQuoteInElenco = numeroQuoteInElenco;
	}

	/**
	 * Gets the ente.
	 *
	 * @return the ente
	 */
	

	/**
	 * Sets the ente.
	 *
	 * @param ente the ente to set
	 */
	

	/**
	 * @return the saltaInserimentoInCaricaDocumenti
	 */
	@XmlTransient
	public Boolean getSaltaInserimentoInCaricaDocumenti() {
		return saltaInserimentoInCaricaDocumenti;
	}

	/**
	 * @param saltaInserimentoInCaricaDocumenti the saltaInserimentoInCaricaDocumenti to set
	 */
	public void setSaltaInserimentoInCaricaDocumenti(Boolean saltaInserimentoInCaricaDocumenti) {
		this.saltaInserimentoInCaricaDocumenti = saltaInserimentoInCaricaDocumenti;
	}

	/**
	 * @return the totalePagato
	 */
	public BigDecimal getTotalePagato() {
		return totalePagato;
	}

	/**
	 * @param totalePagato the totalePagato to set
	 */
	public void setTotalePagato(BigDecimal totalePagato) {
		this.totalePagato = totalePagato;
	}

	/**
	 * @return the totaleIncassato
	 */
	public BigDecimal getTotaleIncassato() {
		return totaleIncassato;
	}

	/**
	 * @param totaleIncassato the totaleIncassato to set
	 */
	public void setTotaleIncassato(BigDecimal totaleIncassato) {
		this.totaleIncassato = totaleIncassato;
	}

	/**
	 * @return the hasImpegnoConfermaDurc
	 */
	public Boolean getHasImpegnoConfermaDurc() {
		return hasImpegnoConfermaDurc;
	}

	/**
	 * @param hasImpegnoConfermaDurc the hasImpegnoConfermaDurc to set
	 */
	public void setHasImpegnoConfermaDurc(Boolean hasImpegnoConfermaDurc) {
		this.hasImpegnoConfermaDurc = hasImpegnoConfermaDurc;
	}

	/**
	 * @return the dataFineValiditaDurc
	 */
	public Date getDataFineValiditaDurc() {
		return dataFineValiditaDurc;
	}

	/**
	 * @param dataFineValiditaDurc the dataFineValiditaDurc to set
	 */
	public void setDataFineValiditaDurc(Date dataFineValiditaDurc) {
		this.dataFineValiditaDurc = dataFineValiditaDurc;
	}

	
	
}