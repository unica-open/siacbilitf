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
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubImpegno;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;
import it.csi.siac.siacfinser.model.siopeplus.SiopeAssenzaMotivazione;
import it.csi.siac.siacfinser.model.siopeplus.SiopeScadenzaMotivo;
import it.csi.siac.siacfinser.model.siopeplus.SiopeTipoDebito;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;

/**
 * Subdocumento Spesa.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class SubdocumentoSpesa extends Subdocumento<DocumentoSpesa,SubdocumentoIvaSpesa> {
	
	/** per la serializzazione */
	private static final long serialVersionUID = -5136057811404710487L;

	//Legami con tabelle di codifica
	private CommissioniDocumento commissioniDocumento;
	
	//Fields su siac_r_subdoc_attr
	private String causaleOrdinativo;
	private String cig;
	private String cup;
	private Date dataEsecuzionePagamento;
	
	// Lotto K - attributi
	// SIAC-5311
	@Deprecated
	private Date dataSospensione;
	@Deprecated
	private String causaleSospensione;
	@Deprecated
	private Date dataRiattivazione;
	private Date dataScadenzaDopoSospensione;
	
	private Boolean pagamentoSospeso;
	
	//private String tipoConvalida;
	
	private Impegno impegno;
	private SubImpegno subImpegno;
	private DatiCertificazioneCrediti datiCertificazioneCrediti;
	private Liquidazione liquidazione;
	//private CommissioniDocumento commissioniDocumento;
	// Lotto K - legami
	private ContoTesoreria contoTesoreria;
	private PreDocumentoSpesa preDocumentoSpesa;
	
	@XmlElementWrapper(name = "listaRegistriComunicazioniPCC")
	@XmlElement(name = "registroComunicazionePCC")
	private List<RegistroComunicazioniPCC> listaRegistriComunicazioniPCC = new ArrayList<RegistroComunicazioniPCC>();
	
	//siac_r_subdoc_modpag
	private ModalitaPagamentoSoggetto modalitaPagamentoSoggetto;
	
	// Lotto L
	private TipoIvaSplitReverse tipoIvaSplitReverse;
	private BigDecimal importoSplitReverse;
	private Boolean pagatoInCEC = Boolean.FALSE;
	private Date dataPagamentoCEC;
	private Boolean hasRitenute;
	
	// SIAC-4765
	private Boolean hasRitenuteDiverseSplit;
	
	// SIAC-5311 SIOPE+
	private SiopeTipoDebito siopeTipoDebito;
	private SiopeAssenzaMotivazione siopeAssenzaMotivazione;
	private SiopeScadenzaMotivo siopeScadenzaMotivo;
	
	//SIAC-8153
	private StrutturaAmministrativoContabile strutturaCompetenteQuota;
	
	// SIAC-5115
	@XmlElementWrapper(name = "sospensioni")
	@XmlElement(name = "sospensione")
	private List<SospensioneSubdocumento> sospensioni = new ArrayList<SospensioneSubdocumento>();
	
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
	/**
	 * @return the dataEsecuzionePagamento
	 */
	public Date getDataEsecuzionePagamento() {
		return dataEsecuzionePagamento;
	}
	/**
	 * @param dataEsecuzionePagamento the dataEsecuzionePagamento to set
	 */
	public void setDataEsecuzionePagamento(Date dataEsecuzionePagamento) {
		this.dataEsecuzionePagamento = dataEsecuzionePagamento;
	}
	/**
	 * @return the causaleOrdinativo
	 */
	public String getCausaleOrdinativo() {
		return causaleOrdinativo;
	}
	/**
	 * @param causaleOrdinativo the causaleOrdinativo to set
	 */
	public void setCausaleOrdinativo(String causaleOrdinativo) {
		this.causaleOrdinativo = causaleOrdinativo;
	}
	/**
	 * @return the importoDaPagare
	 */
	public BigDecimal getImportoDaPagare() {
		return getImportoNotNull().subtract(getImportoDaDedurreNotNull());
	}
	/**
	 * @return the dataSospensione
	 * @deprecated gestite in {@link #sospensioni}
	 */
	@Deprecated
	public Date getDataSospensione() {
		return dataSospensione;
	}
	/**
	 * @param dataSospensione the dataSospensione to set
	 * @deprecated gestite in {@link #sospensioni}
	 */
	@Deprecated
	public void setDataSospensione(Date dataSospensione) {
		this.dataSospensione = dataSospensione;
	}
	/**
	 * @return the causaleSospensione
	 * @deprecated gestite in {@link #sospensioni}
	 */
	@Deprecated
	public String getCausaleSospensione() {
		return causaleSospensione;
	}
	/**
	 * @param causaleSospensione the causaleSospensione to set
	 * @deprecated gestite in {@link #sospensioni}
	 */
	@Deprecated
	public void setCausaleSospensione(String causaleSospensione) {
		this.causaleSospensione = causaleSospensione;
	}
	/**
	 * @return the dataRiattivazione
	 * @deprecated gestite in {@link #sospensioni}
	 */
	@Deprecated
	public Date getDataRiattivazione() {
		return dataRiattivazione;
	}
	/**
	 * @param dataRiattivazione the dataRiattivazione to set
	 * @deprecated gestite in {@link #sospensioni}
	 */
	@Deprecated
	public void setDataRiattivazione(Date dataRiattivazione) {
		this.dataRiattivazione = dataRiattivazione;
	}
	/**
	 * @return the dataScadenzaDopoSospensione
	 */
	public Date getDataScadenzaDopoSospensione() {
		return dataScadenzaDopoSospensione;
	}
	/**
	 * @param dataScadenzaDopoSospensione the dataScadenzaDopoSospensione to set
	 */
	public void setDataScadenzaDopoSospensione(Date dataScadenzaDopoSospensione) {
		this.dataScadenzaDopoSospensione = dataScadenzaDopoSospensione;
	}
	/**
	 * @return the pagamentoSospeso
	 */
	public Boolean getPagamentoSospeso() {
		return pagamentoSospeso;
	}
	/**
	 * @param pagamentoSospeso the pagamentoSospeso to set
	 */
	public void setPagamentoSospeso(Boolean pagamentoSospeso) {
		this.pagamentoSospeso = pagamentoSospeso;
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
	 * Ottiene il subimpegno se valorizzato, altrimenti l'impegno
	 * 
	 * @return impegno o subimpegno
	 */
	public Impegno getImpegnoOSubImpegno(){
		if(this.getSubImpegno() != null  && this.getSubImpegno().getUid() !=0){
			return this.getSubImpegno();
		} else if(this.getImpegno() != null && this.getImpegno().getUid() !=0){
			return this.getImpegno();
		}
		
		return null;
	}
	/**
	 * @return the datiCertificazioneCrediti
	 */
	public DatiCertificazioneCrediti getDatiCertificazioneCrediti() {
		return datiCertificazioneCrediti;
	}
	/**
	 * @param datiCertificazioneCrediti the datiCertificazioneCrediti to set
	 */
	public void setDatiCertificazioneCrediti(
			DatiCertificazioneCrediti datiCertificazioneCrediti) {
		this.datiCertificazioneCrediti = datiCertificazioneCrediti;
	}	
	
	/**
	 * @return the liquidazione
	 */
	public Liquidazione getLiquidazione() {
		return liquidazione;
	}
	/**
	 * @param liquidazione the liquidazione to set
	 */
	public void setLiquidazione(Liquidazione liquidazione) {
		this.liquidazione = liquidazione;
	}
	/**
	 * @return the commissioniDocumento
	 */
	public CommissioniDocumento getCommissioniDocumento() {
		return commissioniDocumento;
	}
	/**
	 * @param commissioniDocumento the commissioniDocumento to set
	 */
	public void setCommissioniDocumento(CommissioniDocumento tipoCommissione) {
		this.commissioniDocumento = tipoCommissione;
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
	 * @return the preDocumentoSpesa
	 */
	public PreDocumentoSpesa getPreDocumentoSpesa() {
		return preDocumentoSpesa;
	}
	/**
	 * @param preDocumentoSpesa the preDocumentoSpesa to set
	 */
	public void setPreDocumentoSpesa(PreDocumentoSpesa preDocumentoSpesa) {
		this.preDocumentoSpesa = preDocumentoSpesa;
	}
	/**
	 * @return the listaRegistriComunicazioniPCC
	 */
	@XmlTransient
	public List<RegistroComunicazioniPCC> getListaRegistriComunicazioniPCC() {
		return listaRegistriComunicazioniPCC;
	}
	/**
	 * @param listaRegistriComunicazioniPCC the listaRegistriComunicazioniPCC to set
	 */
	public void setListaRegistriComunicazioniPCC(
			List<RegistroComunicazioniPCC> listaRegistriComunicazioniPCC) {
		this.listaRegistriComunicazioniPCC = listaRegistriComunicazioniPCC != null ? listaRegistriComunicazioniPCC : new ArrayList<RegistroComunicazioniPCC>();
	}
	/**
	 * @return the modalitaPagamentoSoggetto
	 */
	public ModalitaPagamentoSoggetto getModalitaPagamentoSoggetto() {
		return modalitaPagamentoSoggetto;
	}
	/**
	 * @param modalitaPagamentoSoggetto the modalitaPagamentoSoggetto to set
	 */
	public void setModalitaPagamentoSoggetto(
			ModalitaPagamentoSoggetto modalitaPagamentoSoggetto) {
		this.modalitaPagamentoSoggetto = modalitaPagamentoSoggetto;
	}
	
	
	/**
	 * @return the tipoIvaSplitReverse
	 */
	@XmlJavaTypeAdapter(TipoIvaSplitReverse.TipoIvaSplitReverseAdapter.class)
	public final TipoIvaSplitReverse getTipoIvaSplitReverse() {
		return tipoIvaSplitReverse;
	}
	/**
	 * @param tipoIvaSplitReverse the tipoIvaSplitReverse to set
	 */
	public final void setTipoIvaSplitReverse(TipoIvaSplitReverse tipoIvaSplitReverse) {
		this.tipoIvaSplitReverse = tipoIvaSplitReverse;
	}
	/**
	 * @return the importoSplitReverse
	 */
	public final BigDecimal getImportoSplitReverse() {
		return importoSplitReverse;
	}
	/**
	 * @param importoSplitReverse the importoSplitReverse to set
	 */
	public final void setImportoSplitReverse(BigDecimal importoSplitReverse) {
		this.importoSplitReverse = importoSplitReverse;
	}
	/**
	 * @return the importoSplitReverseNotNull
	 */
	public final BigDecimal getImportoSplitReverseNotNull() {
		return importoSplitReverse == null ? BigDecimal.ZERO : importoSplitReverse;
	}
	/**
	 * @return the pagatoInCEC
	 */
	public Boolean getPagatoInCEC() {
		return pagatoInCEC;
	}
	/**
	 * @param pagatoInCEC the pagatoInCEC to set
	 */
	public void setPagatoInCEC(Boolean pagatoInCEC) {
		this.pagatoInCEC = pagatoInCEC;
	}
	/**
	 * @return the dataPagamentoCEC
	 */
	public Date getDataPagamentoCEC() {
		return dataPagamentoCEC;
	}
	/**
	 * @param dataPagamentoCEC the dataPagamentoCEC to set
	 */
	public void setDataPagamentoCEC(Date dataPagamentoCEC) {
		this.dataPagamentoCEC = dataPagamentoCEC;
	}
	/**
	 * @return the hasRitenute
	 */
	public Boolean getHasRitenute() {
		return hasRitenute;
	}
	/**
	 * @param hasRitenute the hasRitenute to set
	 */
	public void setHasRitenute(Boolean hasRitenute) {
		this.hasRitenute = hasRitenute;
	}
	/**
	 * @return the hasRitenuteDiverseSplit
	 */
	public Boolean getHasRitenuteDiverseSplit() {
		return hasRitenuteDiverseSplit;
	}
	/**
	 * @param hasRitenuteDiverseSplit the hasRitenuteDiverseSplit to set
	 */
	public void setHasRitenuteDiverseSplit(Boolean hasRitenuteDiverseSplit) {
		this.hasRitenuteDiverseSplit = hasRitenuteDiverseSplit;
	}
	/**
	 * @return the siopeTipoDebito
	 */
	public SiopeTipoDebito getSiopeTipoDebito() {
		return siopeTipoDebito;
	}
	/**
	 * @param siopeTipoDebito the siopeTipoDebito to set
	 */
	public void setSiopeTipoDebito(SiopeTipoDebito siopeTipoDebito) {
		this.siopeTipoDebito = siopeTipoDebito;
	}
	/**
	 * @return the siopeAssenzaMotivazione
	 */
	public SiopeAssenzaMotivazione getSiopeAssenzaMotivazione() {
		return siopeAssenzaMotivazione;
	}
	/**
	 * @param siopeAssenzaMotivazione the siopeAssenzaMotivazione to set
	 */
	public void setSiopeAssenzaMotivazione(SiopeAssenzaMotivazione siopeAssenzaMotivazione) {
		this.siopeAssenzaMotivazione = siopeAssenzaMotivazione;
	}
	/**
	 * @return the siopeScadenzaMotivo
	 */
	public SiopeScadenzaMotivo getSiopeScadenzaMotivo() {
		return siopeScadenzaMotivo;
	}
	/**
	 * @param siopeScadenzaMotivo the siopeScadenzaMotivo to set
	 */
	public void setSiopeScadenzaMotivo(SiopeScadenzaMotivo siopeScadenzaMotivo) {
		this.siopeScadenzaMotivo = siopeScadenzaMotivo;
	}
	/**
	 * @return the sospensioni
	 */
	@XmlTransient
	public List<SospensioneSubdocumento> getSospensioni() {
		return sospensioni;
	}
	/**
	 * @param sospensioni the sospensioni to set
	 */
	public void setSospensioni(List<SospensioneSubdocumento> sospensioni) {
		this.sospensioni = sospensioni != null ? sospensioni : new ArrayList<SospensioneSubdocumento>();
	}
	/**
	 * @return the strutturaCompetenteQuota
	 */
	public StrutturaAmministrativoContabile getStrutturaCompetenteQuota() {
		return strutturaCompetenteQuota;
	}
	/**
	 * @param strutturaCompetenteQuota the strutturaCompetenteQuota to set
	 */
	public void setStrutturaCompetenteQuota(StrutturaAmministrativoContabile strutturaCompetenteQuota) {
		this.strutturaCompetenteQuota = strutturaCompetenteQuota;
	}
	
}
