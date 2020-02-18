/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubImpegno;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class RichiestaEconomale extends Entita {
	
	private static final long serialVersionUID = 4967928814129201030L;

	private Ente ente;
	private Bilancio bilancio;
	
	private Integer numeroRichiesta;
	private String delegatoAllIncasso;
	private String descrizioneDellaRichiesta;
	private String note;
	
	private String matricola;
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private String codiceBeneficiario;
	
	//non dovrebbe servirci e su db non c'è. Ho il cambio sui singoli giustificativi
	//private BigDecimal cambio;
	private BigDecimal importo;
	private Boolean caricataDaProceduraEsterna;
	private String strutturaDiAppartenenza;
	
	private Sospeso sospeso;
	
	private CassaEconomale cassaEconomale;
	private TipoRichiestaEconomale tipoRichiestaEconomale;
	private StatoOperativoRichiestaEconomale statoOperativoRichiestaEconomale;
	private Soggetto soggetto;
	private Impegno impegno;
	private SubImpegno subImpegno;
	private RendicontoRichiesta rendicontoRichiesta;
	private DatiTrasfertaMissione datiTrasfertaMissione;
	private Movimento movimento;
	
	
	private List<ClassificatoreGenerico> classificatoriGenerici = new ArrayList<ClassificatoreGenerico>();
	
	
	@XmlElements({
		@XmlElement(name="giustificativo", type=Giustificativo.class)
	})
	@XmlElementWrapper(name = "giustificativi")
	private List<Giustificativo> giustificativi = new ArrayList<Giustificativo>();
	
	// Lotto M
	@XmlElementWrapper(name="subdocumenti")
	@XmlElements({
		@XmlElement(name="subdocumentoSpesa", type=SubdocumentoSpesa.class)
	})
	private List<SubdocumentoSpesa> subdocumenti = new ArrayList<SubdocumentoSpesa>();
	
	// Campi derivati
	private Integer numeroRendicontoStampato;
	private Date dataRendicontoStampato;
	
	// Lotto P
	private String idMissioneEsterna;
	
	private Boolean flagPagamentoRitenutaSuFattura = Boolean.FALSE;
	// SIAC-5255
	private String dataMissioneEsternaDa;
	private String dataMissioneEsternaA;
	
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
	 * @return the numeroRichiesta
	 */
	public Integer getNumeroRichiesta() {
		return numeroRichiesta;
	}
	/**
	 * @param numeroRichiesta the numeroRichiesta to set
	 */
	public void setNumeroRichiesta(Integer numeroRichiesta) {
		this.numeroRichiesta = numeroRichiesta;
	}
	/**
	 * @return the delegatoAllIncasso
	 */
	public String getDelegatoAllIncasso() {
		return delegatoAllIncasso;
	}
	/**
	 * @param delegatoAllIncasso the delegatoAllIncasso to set
	 */
	public void setDelegatoAllIncasso(String delegatoAllIncasso) {
		this.delegatoAllIncasso = delegatoAllIncasso;
	}
	/**
	 * @return the descrizioneDellaRichiesta
	 */
	public String getDescrizioneDellaRichiesta() {
		return descrizioneDellaRichiesta;
	}
	/**
	 * @param descrizioneDellaRichiesta the descrizioneDellaRichiesta to set
	 */
	public void setDescrizioneDellaRichiesta(String descrizioneDellaRichiesta) {
		this.descrizioneDellaRichiesta = descrizioneDellaRichiesta;
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
	 * @return the matricola
	 */
	public String getMatricola() {
		return matricola;
	}
	/**
	 * @param matricola the matricola to set
	 */
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}
	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	/**
	 * @return the codiceFiscale
	 */
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	/**
	 * @param codiceFiscale the codiceFiscale to set
	 */
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	/**
	 * @return the codiceBeneficiario
	 */
	public String getCodiceBeneficiario() {
		return codiceBeneficiario;
	}
	/**
	 * @param codiceBeneficiario the codiceBeneficiario to set
	 */
	public void setCodiceBeneficiario(String codiceBeneficiario) {
		this.codiceBeneficiario = codiceBeneficiario;
	}
	/**
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}
	/**
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	/**
	 * @return the caricataDaProceduraEsterna
	 */
	public Boolean getCaricataDaProceduraEsterna() {
		return caricataDaProceduraEsterna;
	}
	/**
	 * @param caricataDaProceduraEsterna the caricataDaProceduraEsterna to set
	 */
	public void setCaricataDaProceduraEsterna(Boolean caricataDaProceduraEsterna) {
		this.caricataDaProceduraEsterna = caricataDaProceduraEsterna;
	}
	/**
	 * @return the strutturaDiAppartenenza
	 */
	public String getStrutturaDiAppartenenza() {
		return strutturaDiAppartenenza;
	}
	/**
	 * @param strutturaDiAppartenenza the strutturaDiAppartenenza to set
	 */
	public void setStrutturaDiAppartenenza(String strutturaDiAppartenenza) {
		this.strutturaDiAppartenenza = strutturaDiAppartenenza;
	}
	/**
	 * @return the sospeso
	 */
	public Sospeso getSospeso() {
		return sospeso;
	}
	/**
	 * @param sospeso the sospeso to set
	 */
	public void setSospeso(Sospeso sospeso) {
		this.sospeso = sospeso;
	}
	
	/**
	 * @return the tipoRichiestaEconomale
	 */
	public TipoRichiestaEconomale getTipoRichiestaEconomale() {
		return tipoRichiestaEconomale;
	}
	/**
	 * @param tipoRichiestaEconomale the tipoRichiestaEconomale to set
	 */
	public void setTipoRichiestaEconomale(
			TipoRichiestaEconomale tipoRichiestaEconomale) {
		this.tipoRichiestaEconomale = tipoRichiestaEconomale;
	}
	/**
	 * @return the rendicontoRichiesta
	 */
	public RendicontoRichiesta getRendicontoRichiesta() {
		return rendicontoRichiesta;
	}
	/**
	 * @param rendicontoRichiesta the rendicontoRichiesta to set
	 */
	public void setRendicontoRichiesta(RendicontoRichiesta rendicontoRichiesta) {
		this.rendicontoRichiesta = rendicontoRichiesta;
	}
	/**
	 * @return the statoOperativoRichiestaEconomale
	 */
	public StatoOperativoRichiestaEconomale getStatoOperativoRichiestaEconomale() {
		return statoOperativoRichiestaEconomale;
	}
	/**
	 * @param statoOperativoRichiestaEconomale the statoOperativoRichiestaEconomale to set
	 */
	public void setStatoOperativoRichiestaEconomale(
			StatoOperativoRichiestaEconomale statoOperativoRichiestaEconomale) {
		this.statoOperativoRichiestaEconomale = statoOperativoRichiestaEconomale;
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
	 * @return the subImpegno
	 */
	public SubImpegno getSubImpegno() {
		return subImpegno;
	}
	/**
	 * @param subImpegno the subImpegno to set
	 */
	public void setSubImpegno(SubImpegno subImpegno) {
		this.subImpegno = subImpegno;
	}
	/**
	 * @return the cassaEconomale
	 */
	public CassaEconomale getCassaEconomale() {
		return cassaEconomale;
	}
	/**
	 * @param cassaEconomale the cassaEconomale to set
	 */
	public void setCassaEconomale(CassaEconomale cassaEconomale) {
		this.cassaEconomale = cassaEconomale;
	}
	
	/**
	 * @return the datiTrasfertaMissione
	 */
	public DatiTrasfertaMissione getDatiTrasfertaMissione() {
		return datiTrasfertaMissione;
	}
	/**
	 * @param datiTrasfertaMissione the datiTrasfertaMissione to set
	 */
	public void setDatiTrasfertaMissione(DatiTrasfertaMissione datiTrasfertaMissione) {
		this.datiTrasfertaMissione = datiTrasfertaMissione;
	}
	
	/**
	 * @return the movimento
	 */
	public Movimento getMovimento() {
		return movimento;
	}
	/**
	 * @param movimento the movimento to set
	 */
	public void setMovimento(Movimento movimento) {
		this.movimento = movimento;
	}
	/**
	 * @return the classificatoriGenerici
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici() {
		return classificatoriGenerici;
	}
	/**
	 * @param classificatoriGenerici the classificatoriGenerici to set
	 */
	public void setClassificatoriGenerici(List<ClassificatoreGenerico> classificatoriGenerici) {
		this.classificatoriGenerici = classificatoriGenerici != null ? classificatoriGenerici : new ArrayList<ClassificatoreGenerico>();
	}
	/**
	 * @return the giustificativi
	 */
	@XmlTransient
	public List<Giustificativo> getGiustificativi() {
		return giustificativi;
	}
	/**
	 * @param giustificativi the giustificativi to set
	 */
	public void setGiustificativi(List<Giustificativo> giustificativi) {
		this.giustificativi = giustificativi != null ? giustificativi : new ArrayList<Giustificativo>();
	}
	/**
	 * @return the subdocumenti
	 */
	@XmlTransient
	public List<SubdocumentoSpesa> getSubdocumenti() {
		return subdocumenti;
	}
	/**
	 * @param subdocumenti the subdocumenti to set
	 */
	public void setSubdocumenti(List<SubdocumentoSpesa> subdocumenti) {
		this.subdocumenti = subdocumenti != null ? subdocumenti : new ArrayList<SubdocumentoSpesa>();
	}
	/**
	 * @return the numeroRendicontoStampato
	 */
	public Integer getNumeroRendicontoStampato() {
		return numeroRendicontoStampato;
	}
	/**
	 * @param numeroRendicontoStampato the numeroRendicontoStampato to set
	 */
	public void setNumeroRendicontoStampato(Integer numeroRendicontoStampato) {
		this.numeroRendicontoStampato = numeroRendicontoStampato;
	}
	/**
	 * @return the dataRendicontoStampato
	 */
	public Date getDataRendicontoStampato() {
		return dataRendicontoStampato;
	}
	/**
	 * @param dataRendicontoStampato the dataRendicontoStampato to set
	 */
	public void setDataRendicontoStampato(Date dataRendicontoStampato) {
		this.dataRendicontoStampato = dataRendicontoStampato;
	}
	/**
	 * @return the idMissioneEsterna
	 */
	public String getIdMissioneEsterna() {
		return idMissioneEsterna;
	}
	
	/**
	 * Gets the id missione esterna integer.
	 *
	 * @return the id missione esterna integer
	 */
	public Integer getIdMissioneEsternaInteger() {
		try {
			return Integer.valueOf(idMissioneEsterna);
		} catch (NumberFormatException nfe){
			return null;
		}
	}
	
	/**
	 * @param idMissioneEsterna the idMissioneEsterna to set
	 */
	public void setIdMissioneEsterna(String idMissioneEsterna) {
		this.idMissioneEsterna = idMissioneEsterna;
	}
	
	/**
	 * @return the flagPagamentoRitenutaSuFattura
	 */
	public Boolean getFlagPagamentoRitenutaSuFattura() {
		return flagPagamentoRitenutaSuFattura;
	}
	/**
	 * @param flagPagamentoRitenutaSuFattura the flagPagamentoRitenutaSuFattura to set
	 */
	public void setFlagPagamentoRitenutaSuFattura(
			Boolean flagPagamentoRitenutaSuFattura) {
		this.flagPagamentoRitenutaSuFattura = flagPagamentoRitenutaSuFattura;
	}
	/**
	 * @return the dataMissioneEsternaDa
	 */
	public String getDataMissioneEsternaDa() {
		return dataMissioneEsternaDa;
	}
	/**
	 * @param dataMissioneEsternaDa the dataMissioneEsternaDa to set
	 */
	public void setDataMissioneEsternaDa(String dataMissioneEsternaDa) {
		this.dataMissioneEsternaDa = dataMissioneEsternaDa;
	}
	/**
	 * @return the dataMissioneEsternaA
	 */
	public String getDataMissioneEsternaA() {
		return dataMissioneEsternaA;
	}
	/**
	 * @param dataMissioneEsternaA the dataMissioneEsternaA to set
	 */
	public void setDataMissioneEsternaA(String dataMissioneEsternaA) {
		this.dataMissioneEsternaA = dataMissioneEsternaA;
	}
	/**
	 * @return the dataCreazioneRichiestaEconomale
	 */
	public Date getDataCreazioneRichiestaEconomale() {
		return getDataCreazione();
	}
	/**
	 * @param the dataCreazioneRichiestaEconomale to set
	 */
	public void setDataCreazioneRichiestaEconomale(Date dataCreazione) {
		setDataCreazione(dataCreazione);
	}
	
	/**
	 * @return the dataModificaRichiestaEconomale
	 */
	public Date getDataModificaRichiestaEconomale() {
		return getDataModifica();
	}
	/**
	 * @param the dataModificaRichiestaEconomale to set
	 */
	public void setDataModificaRichiestaEconomale(Date dataModifica) {
		setDataModifica(dataModifica);
	}
	
	
	

}