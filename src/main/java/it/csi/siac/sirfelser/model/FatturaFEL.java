/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import it.csi.siac.siacbilser.model.TipoDocFEL;
import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * FatturaFEL
 * 
 * @author Valentina
 * 
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class FatturaFEL extends EntitaEnte{
	
	private static final long serialVersionUID = 1430656108709886586L;

	
	private Integer idFattura;
	private String numero;
	private String divisa;
	private Date data;
	//private String tipoRitenuta;
	//private BigDecimal importoRitenuta;
	//private BigDecimal aliquotaRitenuta;
	//private String causalePagamento;
	private String bolloVirtuale;
	private BigDecimal importoBollo;
	private BigDecimal importoTotaleDocumento;
	private BigDecimal arrotondamento;
	private BigDecimal importoTotaleNetto;
	private String codiceTrasmittente;
	private String codiceDestinatario;
	private Date dataInserimento;
	private Date dataCaricamento;
//	private String statoFattura;
	
	// CR 2819
	private String note;
	
	private DocumentoSpesa documentoSpesa;
	private PrestatoreFEL prestatore; 
	private TipoDocumentoFEL tipoDocumentoFEL;
	//SIAC-7557
	private TipoDocFEL tipoDocFEL;
	private StatoAcquisizioneFEL statoAcquisizioneFEL;
	
	//SIAC-7557-VG
	private Integer docTipoEntrata;
	private Integer docTipoSpesa;
	
	private PortaleFattureFEL portaleFattureFEL;
	private ProtocolloFEL protocolloFEL;
	
	@XmlElementWrapper(name = "listaRiepiloghiBeni")
	@XmlElement(name = "riepilogoBeniFEL")
	private List<RiepilogoBeniFEL> riepiloghiBeni = new ArrayList<RiepilogoBeniFEL>();
	
	@XmlElementWrapper(name = "listaCassePrevidenziali")
	@XmlElement(name = "cassaPrevidenzialeFEL")
	private List<CassaPrevidenzialeFEL> cassePrevidenziali= new ArrayList<CassaPrevidenzialeFEL>();
	
	@XmlElementWrapper(name = "listaFattureCollegate")
	@XmlElement(name = "fatturaCollegataFEL")
	private List<FattureCollegateFEL> fattureCollegate = new ArrayList<FattureCollegateFEL>();
	
	@XmlElementWrapper(name = "listaFattureContabili")
	@XmlElement(name = "fatturaContabileFEL")
	private List<FatturaContabileFEL>fattureContabili = new ArrayList<FatturaContabileFEL>();
	
	@XmlElementWrapper(name = "listaCausali")
	@XmlElement(name = "causaleFEL")
	private List<CausaleFEL> causaliFEL = new ArrayList<CausaleFEL>();
	
	@XmlElementWrapper(name = "listaPagamenti")
	@XmlElement(name = "pagamentoFEL")
	private List<PagamentoFEL> pagamenti= new ArrayList<PagamentoFEL>();
	
	@XmlElementWrapper(name = "listaDatiGestionali")
	@XmlElement(name = "datiGestionaliFEL")
	private List<DatiGestionaliFEL> datiGestionali = new ArrayList<DatiGestionaliFEL>();
	
	@XmlElementWrapper(name = "listaOrdiniAcquisto")
	@XmlElement(name = "ordineAcquistoFEL")
	private List<OrdineAcquistoFEL> ordiniAcquisti = new ArrayList<OrdineAcquistoFEL>();
	
	//SIAC-7557
	@XmlElementWrapper(name = "listaRitenuta")
	@XmlElement(name = "ritenutaFEL")
	private List<RitenutaFEL> ritenute = new ArrayList<RitenutaFEL>();
	
	
	
	
	/**
	 * @return the ritenuteTest
	 */
	@XmlTransient
	public List<RitenutaFEL> getRitenute() {
		return ritenute;
	}
	/**
	 * @param ritenuteTest the ritenuteTest to set
	 */
	public void setRitenute(List<RitenutaFEL> ritenute) {
		this.ritenute = ritenute;
	}
	/**
	 * @return the idFattura
	 */
	public Integer getIdFattura() {
		return idFattura;
	}
	/**
	 * @param idFattura the idFattura to set
	 */
	public void setIdFattura(Integer idFattura) {
		this.idFattura = idFattura;
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
	 * @return the divisa
	 */
	public String getDivisa() {
		return divisa;
	}
	/**
	 * @param divisa the divisa to set
	 */
	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}
	/**
	 * @return the dataFattura
	 */
	public Date getData() {
		return data;
	}
	/**
	 * @param dataFattura the dataFattura to set
	 */
	public void setData(Date data) {
		this.data = data;
	}
	/*
	SIAC-7557 
	public String getTipoRitenuta() {
		return tipoRitenuta;
	}
	 
	public void setTipoRitenuta(String tipoRitenuta) {
		this.tipoRitenuta = tipoRitenuta;
	}
	public BigDecimal getImportoRitenuta() {
		return importoRitenuta;
	}
	
	public void setImportoRitenuta(BigDecimal importoRitenuta) {
		this.importoRitenuta = importoRitenuta;
	}
	public BigDecimal getAliquotaRitenuta() {
		return aliquotaRitenuta;
	}
	
	public void setAliquotaRitenuta(BigDecimal aliquotaRitenuta) {
		this.aliquotaRitenuta = aliquotaRitenuta;
	}
	public String getCausalePagamento() {
		return causalePagamento;
	}
	
	public void setCausalePagamento(String causalePagamento) {
		this.causalePagamento = causalePagamento;
	}*/
	/**
	 * @return the bollo
	 */
	public String getBolloVirtuale() {
		return bolloVirtuale;
	}
	/**
	 * @param bollo the bollo to set
	 */
	public void setBolloVirtuale(String bolloVirtuale) {
		this.bolloVirtuale = bolloVirtuale;
	}
	/**
	 * @return the importoBollo
	 */
	public BigDecimal getImportoBollo() {
		return importoBollo;
	}
	/**
	 * @param importoBollo the importoBollo to set
	 */
	public void setImportoBollo(BigDecimal importoBollo) {
		this.importoBollo = importoBollo;
	}
	/**
	 * @return the importoTotaleFattura
	 */
	public BigDecimal getImportoTotaleDocumento() {
		return importoTotaleDocumento;
	}
	/**
	 * @param importoTotaleFattura the importoTotaleFattura to set
	 */
	public void setImportoTotaleDocumento(BigDecimal importoTotaleDocumento) {
		this.importoTotaleDocumento = importoTotaleDocumento;
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
		this.arrotondamento = arrotondamento;
	}
	/**
	 * @return the importoTotaleNetto
	 */
	public BigDecimal getImportoTotaleNetto() {
		return importoTotaleNetto;
	}
	/**
	 * @param importoTotaleNetto the importoTotaleNetto to set
	 */
	public void setImportoTotaleNetto(BigDecimal importoTotaleNetto) {
		this.importoTotaleNetto = importoTotaleNetto;
	}
	/**
	 * @return the codiceTrasmittente
	 */
	public String getCodiceTrasmittente() {
		return codiceTrasmittente;
	}
	/**
	 * @param codiceTrasmittente the codiceTrasmittente to set
	 */
	public void setCodiceTrasmittente(String codiceTrasmittente) {
		this.codiceTrasmittente = codiceTrasmittente;
	}
	/**
	 * @return the codiceDestinatario
	 */
	public String getCodiceDestinatario() {
		return codiceDestinatario;
	}
	/**
	 * @param codiceDestinatario the codiceDestinatario to set
	 */
	public void setCodiceDestinatario(String codiceDestinatario) {
		this.codiceDestinatario = codiceDestinatario;
	}
	/**
	 * @return the dataInserimento
	 */
	public Date getDataInserimento() {
		return dataInserimento;
	}
	/**
	 * @param dataInserimento the dataInserimento to set
	 */
	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}
	/**
	 * @return the dataCaricamento
	 */
	public Date getDataCaricamento() {
		return dataCaricamento;
	}
	/**
	 * @param dataCaricamento the dataCaricamento to set
	 */
	public void setDataCaricamento(Date dataCaricamento) {
		this.dataCaricamento = dataCaricamento;
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
//	/**
//	 * @return the statoFattura
//	 */
//	public String getStatoFattura() {
//		return statoFattura;
//	}
//	/**
//	 * @param statoFattura the statoFattura to set
//	 */
//	public void setStatoFattura(String statoFattura) {
//		this.statoFattura = statoFattura;
//	}
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
	 * @return the prestatore
	 */
	public PrestatoreFEL getPrestatore() {
		return prestatore;
	}
	/**
	 * @param prestatore the prestatore to set
	 */
	public void setPrestatore(PrestatoreFEL prestatore) {
		this.prestatore = prestatore;
	}
	
	/**
	 * @return the statoAcquisizioneFEL
	 */
	public StatoAcquisizioneFEL getStatoAcquisizioneFEL() {
		return statoAcquisizioneFEL;
	}
	/**
	 * @param statoAcquisizioneFEL the statoAcquisizioneFEL to set
	 */
	public void setStatoAcquisizioneFEL(StatoAcquisizioneFEL statoAcquisizioneFEL) {
		this.statoAcquisizioneFEL = statoAcquisizioneFEL;
	}
	/**
	 * @return the tipoDocumentoFEL
	 */
	public TipoDocumentoFEL getTipoDocumentoFEL() {
		return tipoDocumentoFEL;
	}
	/**
	 * @param tipoDocumentoFEL the tipoDocumentoFEL to set
	 */
	public void setTipoDocumentoFEL(TipoDocumentoFEL tipoDocumentoFEL) {
		this.tipoDocumentoFEL = tipoDocumentoFEL;
	}
	/**
	 * @return the protocolloFEL
	 */
	public ProtocolloFEL getProtocolloFEL() {
		return protocolloFEL;
	}
	/**
	 * @param protocolloFEL the protocolloFEL to set
	 */
	public void setProtocolloFEL(ProtocolloFEL protocolloFEL) {
		this.protocolloFEL = protocolloFEL;
	}
	/**
	 * @return the riepiloghiBeni
	 */
	@XmlTransient
	public List<RiepilogoBeniFEL> getRiepiloghiBeni() {
		return riepiloghiBeni;
	}
	/**
	 * @param riepiloghiBeni the riepiloghiBeni to set
	 */
	public void setRiepiloghiBeni(List<RiepilogoBeniFEL> riepiloghiBeni) {
		this.riepiloghiBeni = riepiloghiBeni != null ? riepiloghiBeni : new ArrayList<RiepilogoBeniFEL>();
	}
	/**
	 * @return the cassePrevidenziali
	 */
	@XmlTransient
	public List<CassaPrevidenzialeFEL> getCassePrevidenziali() {
		return cassePrevidenziali;
	}
	/**
	 * @param cassePrevidenziali the cassePrevidenziali to set
	 */
	public void setCassePrevidenziali(List<CassaPrevidenzialeFEL> cassePrevidenziali) {
		this.cassePrevidenziali = cassePrevidenziali != null ? cassePrevidenziali : new ArrayList<CassaPrevidenzialeFEL>();
	}
	/**
	 * @return the fattureCollegate
	 */
	@XmlTransient
	public List<FattureCollegateFEL> getFattureCollegate() {
		return fattureCollegate;
	}
	/**
	 * @param fattureCollegate the fattureCollegate to set
	 */
	public void setFattureCollegate(List<FattureCollegateFEL> fattureCollegate) {
		this.fattureCollegate = fattureCollegate != null ? fattureCollegate : new ArrayList<FattureCollegateFEL>();
	}
	/**
	 * @return the fattureContabili
	 */
	@XmlTransient
	public List<FatturaContabileFEL> getFattureContabili() {
		return fattureContabili;
	}
	/**
	 * @param fattureContabili the fattureContabili to set
	 */
	public void setFattureContabili(List<FatturaContabileFEL> fattureContabili) {
		this.fattureContabili = fattureContabili != null ? fattureContabili : new ArrayList<FatturaContabileFEL>();
	}
	/**
	 * @return the causaliFEL
	 */
	@XmlTransient
	public List<CausaleFEL> getCausaliFEL() {
		return causaliFEL;
	}
	/**
	 * @param causaliFEL the causaliFEL to set
	 */
	public void setCausaliFEL(List<CausaleFEL> causaliFEL) {
		this.causaliFEL = causaliFEL != null ? causaliFEL : new ArrayList<CausaleFEL>();
	}
	/**
	 * @return the pagamenti
	 */
	@XmlTransient
	public List<PagamentoFEL> getPagamenti() {
		return pagamenti;
	}
	/**
	 * @param pagamenti the pagamenti to set
	 */
	public void setPagamenti(List<PagamentoFEL> pagamenti) {
		this.pagamenti = pagamenti != null ? pagamenti : new ArrayList<PagamentoFEL>();
	}
	/**
	 * @return the portaleFattureFEL
	 */
	public PortaleFattureFEL getPortaleFattureFEL() {
		return portaleFattureFEL;
	}
	/**
	 * @param portaleFattureFEL the portaleFattureFEL to set
	 */
	public void setPortaleFattureFEL(PortaleFattureFEL portaleFattureFEL) {
		this.portaleFattureFEL = portaleFattureFEL;
	}
	/**
	 * @return the datiGestionali
	 */
	@XmlTransient
	public List<DatiGestionaliFEL> getDatiGestionali() {
		return datiGestionali;
	}
	/**
	 * @param datiGestionali the datiGestionali to set
	 */
	public void setDatiGestionali(List<DatiGestionaliFEL> datiGestionali) {
		this.datiGestionali = datiGestionali != null ? datiGestionali : new ArrayList<DatiGestionaliFEL>();
	}
	/**
	 * @return the ordiniAcquisti
	 */
	@XmlTransient
	public List<OrdineAcquistoFEL> getOrdiniAcquisti() {
		return ordiniAcquisti;
	}
	/**
	 * @param ordiniAcquisti the ordiniAcquisti to set
	 */
	public void setOrdiniAcquisti(List<OrdineAcquistoFEL> ordiniAcquisti) {
		this.ordiniAcquisti = ordiniAcquisti != null ? ordiniAcquisti : new ArrayList<OrdineAcquistoFEL>();
	}
	
	
	
	
	/**
	 * @return the tipoDocFEL
	 */
	public TipoDocFEL getTipoDocFEL()
	{
		return tipoDocFEL;
	}
	/**
	 * @param tipoDocFEL the tipoDocFEL to set
	 */
	public void setTipoDocFEL(TipoDocFEL tipoDocFEL)
	{
		this.tipoDocFEL = tipoDocFEL;
	}
	
	/**
	 * @return the docTipoEntrata
	 */
	public Integer getDocTipoEntrata() {
		return docTipoEntrata;
	}
	/**
	 * @return the docTipoSpesa
	 */
	public Integer getDocTipoSpesa() {
		return docTipoSpesa;
	}
	/**
	 * @param docTipoEntrata the docTipoEntrata to set
	 */
	public void setDocTipoEntrata(Integer docTipoEntrata) {
		this.docTipoEntrata = docTipoEntrata;
	}
	/**
	 * @param docTipoSpesa the docTipoSpesa to set
	 */
	public void setDocTipoSpesa(Integer docTipoSpesa) {
		this.docTipoSpesa = docTipoSpesa;
	}
	
}
