/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pagopa.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfin2ser.model.TipoDocumento;

@XmlType(namespace = PagoPADataDictionary.NAMESPACE)
public class RiconciliazioneDoc extends EntitaEnte{

	private static final long serialVersionUID = -2756428528295567275L;

	private String  codiceVoce;
	private String  descrizioneVoce; 
	private String  codiceSottovoce; 
	private String  anno;
	private String  numeroAccertamento;
	private BigDecimal   importoRigaRiconciliazione;
	
	private String  tipoOperazioneDocumento;
	private String  codiceFiscale; 
	private String  ragioneSociale;
	private BigDecimal   Importo;
	private String  IUV;
	private Riconciliazione riconciliazione;
	private Errore errore;
	
	private Elaborazione elaborazione;
	private String riconciliazioneDocTipoCode;
	private TipoDocumento tipoDocumento;
	
	private Integer erroreDettaglio;
	private String messaggioErrore;
	private Integer subDocId;
	

	//SIAC-8123 CM 29/04/2021 Intervento 2 Inizio
	private Boolean riconciliazioneDocFlagConDett;
	private Integer ricDocDettagliElaboratiDiAggregato;
	//SIAC-8123 CM 29/04/2021 Intervento 2 Fine

	// SIAC-8046 CM 16-19/03/2021 Inizio
	private boolean azioneAggiornaAttiva;

	public boolean isAzioneAggiornaAttiva() {
		return azioneAggiornaAttiva;
	}

	public void setAzioneAggiornaAttiva(boolean azioneAggiornaAttiva) {
		this.azioneAggiornaAttiva = azioneAggiornaAttiva;
	}	
	// SIAC-8046 CM 16-19/03/2021 Fine
	
	//SIAC-8123 CM 29/04/2021 Intervento 2 Inizio
	public Boolean getRiconciliazioneDocFlagConDett() {
		return riconciliazioneDocFlagConDett;
	}
	
	public void setRiconciliazioneDocFlagConDett(Boolean riconciliazioneDocFlagConDett) {
		this.riconciliazioneDocFlagConDett = riconciliazioneDocFlagConDett;
	}

	public Integer getRicDocDettagliElaboratiDiAggregato() {
		return ricDocDettagliElaboratiDiAggregato;
	}

	public void setRicDocDettagliElaboratiDiAggregato(Integer ricDocDettagliElaboratiDiAggregato) {
		this.ricDocDettagliElaboratiDiAggregato = ricDocDettagliElaboratiDiAggregato;
	}
	//SIAC-8123 CM 29/04/2021 Intervento 2 Fine

	
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
	 * @return the codiceVoce
	 */
	public String getCodiceVoce()
	{
		return codiceVoce;
	}
	/**
	 * @param codiceVoce the codiceVoce to set
	 */
	public void setCodiceVoce(String codiceVoce)
	{
		this.codiceVoce = codiceVoce;
	}
	/**
	 * @return the descrizioneVoce
	 */
	public String getDescrizioneVoce()
	{
		return descrizioneVoce;
	}
	/**
	 * @param descrizioneVoce the descrizioneVoce to set
	 */
	public void setDescrizioneVoce(String descrizioneVoce)
	{
		this.descrizioneVoce = descrizioneVoce;
	}
	/**
	 * @return the codiceSottovoce
	 */
	public String getCodiceSottovoce()
	{
		return codiceSottovoce;
	}
	/**
	 * @param codiceSottovoce the codiceSottovoce to set
	 */
	public void setCodiceSottovoce(String codiceSottovoce)
	{
		this.codiceSottovoce = codiceSottovoce;
	}
	/**
	 * @return the anno
	 */
	public String getAnno()
	{
		return anno;
	}
	/**
	 * @param anno the anno to set
	 */
	public void setAnno(String anno)
	{
		this.anno = anno;
	}
	/**
	 * @return the numeroAccertamento
	 */
	public String getNumeroAccertamento()
	{
		return numeroAccertamento;
	}
	/**
	 * @param numeroAccertamento the numeroAccertamento to set
	 */
	public void setNumeroAccertamento(String numeroAccertamento)
	{
		this.numeroAccertamento = numeroAccertamento;
	}
	/**
	 * @return the importoRigaRiconciliazione
	 */
	public BigDecimal getImportoRigaRiconciliazione()
	{
		return importoRigaRiconciliazione;
	}
	/**
	 * @param importoRigaRiconciliazione the importoRigaRiconciliazione to set
	 */
	public void setImportoRigaRiconciliazione(BigDecimal importoRigaRiconciliazione)
	{
		this.importoRigaRiconciliazione = importoRigaRiconciliazione;
	}
	/**
	 * @return the elaborazione
	 */
	public Elaborazione getElaborazione()
	{
		return elaborazione;
	}
	/**
	 * @param elaborazione the elaborazione to set
	 */
	public void setElaborazione(Elaborazione elaborazione)
	{
		this.elaborazione = elaborazione;
	}
	/**
	 * @return the tipoOperazioneDocumento
	 */
	public String getTipoOperazioneDocumento()
	{
		return tipoOperazioneDocumento;
	}
	/**
	 * @param tipoOperazioneDocumento the tipoOperazioneDocumento to set
	 */
	public void setTipoOperazioneDocumento(String tipoOperazioneDocumento)
	{
		this.tipoOperazioneDocumento = tipoOperazioneDocumento;
	}
	/**
	 * @return the codiceFiscale
	 */
	public String getCodiceFiscale()
	{
		return codiceFiscale;
	}
	/**
	 * @param codiceFiscale the codiceFiscale to set
	 */
	public void setCodiceFiscale(String codiceFiscale)
	{
		this.codiceFiscale = codiceFiscale;
	}
	/**
	 * @return the ragioneSociale
	 */
	public String getRagioneSociale()
	{
		return ragioneSociale;
	}
	/**
	 * @param ragioneSociale the ragioneSociale to set
	 */
	public void setRagioneSociale(String ragioneSociale)
	{
		this.ragioneSociale = ragioneSociale;
	}
	/**
	 * @return the importo
	 */
	public BigDecimal getImporto()
	{
		return Importo;
	}
	/**
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo)
	{
		Importo = importo;
	}
	/**
	 * @return the iUV
	 */
	public String getIUV()
	{
		return IUV;
	}
	/**
	 * @param iUV the iUV to set
	 */
	public void setIUV(String iUV)
	{
		IUV = iUV;
	}
	/**
	 * @return the riconciliazione
	 */
	public Riconciliazione getRiconciliazione()
	{
		return riconciliazione;
	}
	/**
	 * @param riconciliazione the riconciliazione to set
	 */
	public void setRiconciliazione(Riconciliazione riconciliazione)
	{
		this.riconciliazione = riconciliazione;
	}
	/**
	 * @return the errore
	 */
	public Errore getErrore()
	{
		return errore;
	}
	/**
	 * @param errore the errore to set
	 */
	public void setErrore(Errore errore)
	{
		this.errore = errore;
	}
	/**
	 * @return the riconciliazioneDocTipoCode
	 */
	public String getRiconciliazioneDocTipoCode() {
		return riconciliazioneDocTipoCode;
	}
	/**
	 * @param riconciliazioneDocTipoCode the riconciliazioneDocTipoCode to set
	 */
	public void setRiconciliazioneDocTipoCode(String riconciliazioneDocTipoCode) {
		this.riconciliazioneDocTipoCode = riconciliazioneDocTipoCode;
	}
	public Integer getErroreDettaglio() {
		return erroreDettaglio;
	}
	public void setErroreDettaglio(Integer erroreDettaglio) {
		this.erroreDettaglio = erroreDettaglio;
	}
	public String getMessaggioErrore() {
		return messaggioErrore;
	}
	public void setMessaggioErrore(String messaggioErrore) {
		this.messaggioErrore = messaggioErrore;
	}
	public Integer getSubDocId() {
		return subDocId;
	}
	public void setSubDocId(Integer subDocId) {
		this.subDocId = subDocId;
	}
	
	
	
	
}