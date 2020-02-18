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

import it.csi.siac.siacfinser.model.siopeplus.SiopeDocumentoTipo;
import it.csi.siac.siacfinser.model.siopeplus.SiopeDocumentoTipoAnalogico;
import it.csi.siac.sirfelser.model.FatturaFEL;

/**
 * Documento Spesa.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class DocumentoSpesa extends Documento<SubdocumentoSpesa, SubdocumentoIvaSpesa> {
	
	/** Per la serializzazione */
	private static final long serialVersionUID = 3327995555818808344L;
	
	//Attributi del documento su siac_r_doc_attr
	private String codiceFiscalePignorato;
	//default F
	private Boolean flagBeneficiarioMultiplo = Boolean.FALSE;
	// SIAC-5311: spostato sulle quote
	@Deprecated
	private Date dataSospensione;
	@Deprecated
	private String causaleSospensione;
	@Deprecated
	private Date dataRiattivazione;
	
	//Classificatori
	private TipoImpresa tipoImpresa;
	
	private RitenuteDocumento ritenuteDocumento;
	
	
	//aggiunti Fase K
	//sostituisce RelazFattPortaleContabilia
	private FatturaFEL fatturaFEL;
	private RegistroUnico registroUnico;
	private CodicePCC codicePCC;
	private CodiceUfficioDestinatarioPCC codiceUfficioDestinatario;
	// SIAC-5115: spostato sulle quote
	@Deprecated
	private Date dataScadenzaDopoSospensione;
	
	private Boolean collegatoCEC = Boolean.FALSE;
	
	// Dovrebbe andare sulla quota
	@XmlElementWrapper(name = "registriComunicazioniPCC")
	@XmlElement(name = "registroComunicazioniPCC")
	private List<RegistroComunicazioniPCC> registriComunicazioniPCC;
	
	// Lotto M
	// Campo in realta' derivato, ma potrei non avere a disposizione i dati necessarii per il calcolo. Pertanto, lo imposto come variabile di istanza
	private BigDecimal importoDaPagareNonPagatoInCassaEconomale;
	private List<Ordine> ordini = new ArrayList<Ordine>();
	
	// SIAC-4749
	private DatiFatturaPagataIncassata datiFatturaPagataIncassata;
	
	// SIAC-5311 SIOPE+
	private String siopeIdentificativoLottoSdi;
	private SiopeDocumentoTipo siopeDocumentoTipo;
	private SiopeDocumentoTipoAnalogico siopeDocumentoTipoAnalogico;
	
	//SIAC 6677
	private String codAvvisoPagoPA;
	
	
	public String getCodAvvisoPagoPA() {
		return codAvvisoPagoPA;
	}
	public void setCodAvvisoPagoPA(String codAvvisoPagoPA) {
		this.codAvvisoPagoPA = codAvvisoPagoPA;
	}
	/**
	 * @return the dataSospensione
	 * @deprecated spostato sulle quote
	 */
	@Deprecated
	public Date getDataSospensione() {
		return dataSospensione;
	}
	/**
	 * @param dataSospensione the dataSospensione to set
	 * @deprecated spostato sulle quote
	 */
	@Deprecated
	public void setDataSospensione(Date dataSospensione) {
		this.dataSospensione = dataSospensione;
	}
	/**
	 * @return the causaleSospensione
	 * @deprecated spostato sulle quote
	 */
	@Deprecated
	public String getCausaleSospensione() {
		return causaleSospensione;
	}
	/**
	 * @param causaleSospensione the causaleSospensione to set
	 * @deprecated spostato sulle quote
	 */
	@Deprecated
	public void setCausaleSospensione(String causaleSospensione) {
		this.causaleSospensione = causaleSospensione;
	}
	/**
	 * @return the codiceFiscalePignorato
	 */
	public String getCodiceFiscalePignorato() {
		return codiceFiscalePignorato;
	}
	/**
	 * @param codiceFiscalePignorato the codiceFiscalePignorato to set
	 */
	public void setCodiceFiscalePignorato(String codiceFiscalePignorato) {
		this.codiceFiscalePignorato = codiceFiscalePignorato;
	}
	/**
	 * @return the dataRiattivazione
	 * @deprecated spostato sulle quote
	 */
	@Deprecated
	public Date getDataRiattivazione() {
		return dataRiattivazione;
	}
	/**
	 * @param dataRiattivazione the dataRiattivazione to set
	 * @deprecated spostato sulle quote
	 */
	@Deprecated
	public void setDataRiattivazione(Date dataRiattivazione) {
		this.dataRiattivazione = dataRiattivazione;
	}
	/**
	 * @return the tipoImpresa
	 */
	public TipoImpresa getTipoImpresa() {
		return tipoImpresa;
	}
	/**
	 * @param tipoImpresa the tipoImpresa to set
	 */
	public void setTipoImpresa(TipoImpresa tipoImpresa) {
		this.tipoImpresa = tipoImpresa;
	}
	/**
	 * @return the ritenuteDocumento
	 */
	public RitenuteDocumento getRitenuteDocumento() {
		return ritenuteDocumento;
	}
	/**
	 * @param ritenuteDocumento the ritenuteDocumento to set
	 */
	public void setRitenuteDocumento(RitenuteDocumento ritenuteDocumento) {
		this.ritenuteDocumento = ritenuteDocumento;
	}
	/**
	 * @return the flagBeneficiarioMultiplo
	 */
	public Boolean getFlagBeneficiarioMultiplo() {
		return flagBeneficiarioMultiplo;
	}
	/**
	 * @param flagBeneficiarioMultiplo the flagBeneficiarioMultiplo to set
	 */
	public void setFlagBeneficiarioMultiplo(Boolean flagBeneficiarioMultiplo) {
		this.flagBeneficiarioMultiplo = flagBeneficiarioMultiplo;
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
	 * @return the registroUnico
	 */
	public RegistroUnico getRegistroUnico() {
		return registroUnico;
	}
	/**
	 * @param registroUnico the registroUnico to set
	 */
	public void setRegistroUnico(RegistroUnico registroUnico) {
		this.registroUnico = registroUnico;
	}
	/**
	 * @return the codicePCC
	 */
	public CodicePCC getCodicePCC() {
		return codicePCC;
	}
	/**
	 * @param codicePCC the codicePCC to set
	 */
	public void setCodicePCC(CodicePCC codicePCC) {
		this.codicePCC = codicePCC;
	}
	/**
	 * @return the codiceUfficioDestinatario
	 */
	public CodiceUfficioDestinatarioPCC getCodiceUfficioDestinatario() {
		return codiceUfficioDestinatario;
	}
	/**
	 * @param codiceUfficioDestinatario the codiceUfficioDestinatario to set
	 */
	public void setCodiceUfficioDestinatario(CodiceUfficioDestinatarioPCC codiceUfficioDestinatario) {
		this.codiceUfficioDestinatario = codiceUfficioDestinatario;
	}
	/**
	 * @return the registriComunicazioniPCC
	 */
	@XmlTransient
	public List<RegistroComunicazioniPCC> getRegistriComunicazioniPCC() {
		return registriComunicazioniPCC;
	}
	/**
	 * @param registriComunicazioniPCC the registriComunicazioniPCC to set
	 */
	public void setRegistriComunicazioniPCC(
			List<RegistroComunicazioniPCC> registriComunicazioniPCC) {
		this.registriComunicazioniPCC = registriComunicazioniPCC;
	}
	/**
	 * @return the dataScadenzaDopoSospensione
	 * @deprecated spostato sulla quota
	 */
	@Deprecated
	public Date getDataScadenzaDopoSospensione() {
		return dataScadenzaDopoSospensione;
	}
	/**
	 * @param dataScadenzaDopoSospensione the dataScadenzaDopoSospensione to set
	 * @deprecated spostato sulla quota
	 */
	@Deprecated
	public void setDataScadenzaDopoSospensione(Date dataScadenzaDopoSospensione) {
		this.dataScadenzaDopoSospensione = dataScadenzaDopoSospensione;
	}
	/**
	 * @return the collegatoCEC
	 */
	public Boolean getCollegatoCEC() {
		return collegatoCEC;
	}
	/**
	 * @param collegatoCEC the collegatoCEC to set
	 */
	public void setCollegatoCEC(Boolean collegatoCEC) {
		this.collegatoCEC = collegatoCEC == null ? Boolean.FALSE : collegatoCEC;
	}
	/**
	 * @return the importoDaPagareNonPagatoInCassaEconomale
	 */
	public BigDecimal getImportoDaPagareNonPagatoInCassaEconomale() {
		return importoDaPagareNonPagatoInCassaEconomale;
	}
	/**
	 * @param importoDaPagareNonPagatoInCassaEconomale the importoDaPagareNonPagatoInCassaEconomale to set
	 */
	public void setImportoDaPagareNonPagatoInCassaEconomale(BigDecimal importoDaPagareNonPagatoInCassaEconomale) {
		this.importoDaPagareNonPagatoInCassaEconomale = importoDaPagareNonPagatoInCassaEconomale;
	}
	/**
	 * @return the ordini
	 */
	public List<Ordine> getOrdini() {
		return ordini;
	}
	/**
	 * @param ordini the ordini to set
	 */
	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}
	
	/**
	 * @return the datiFatturaPagataIncassata
	 */
	public DatiFatturaPagataIncassata getDatiFatturaPagataIncassata() {
		return datiFatturaPagataIncassata;
	}
	/**
	 * @param datiFatturaPagataIncassata the datiFatturaPagataIncassata to set
	 */
	public void setDatiFatturaPagataIncassata(DatiFatturaPagataIncassata datiFatturaPagataIncassata) {
		this.datiFatturaPagataIncassata = datiFatturaPagataIncassata;
	}
	/**
	 * @return the siopeIdentificativoLottoSdi
	 */
	public String getSiopeIdentificativoLottoSdi() {
		return siopeIdentificativoLottoSdi;
	}
	/**
	 * @param siopeIdentificativoLottoSdi the siopeIdentificativoLottoSdi to set
	 */
	public void setSiopeIdentificativoLottoSdi(String siopeIdentificativoLottoSdi) {
		this.siopeIdentificativoLottoSdi = siopeIdentificativoLottoSdi;
	}
	/**
	 * @return the siopeDocumentoTipo
	 */
	public SiopeDocumentoTipo getSiopeDocumentoTipo() {
		return siopeDocumentoTipo;
	}
	/**
	 * @param siopeDocumentoTipo the siopeDocumentoTipo to set
	 */
	public void setSiopeDocumentoTipo(SiopeDocumentoTipo siopeDocumentoTipo) {
		this.siopeDocumentoTipo = siopeDocumentoTipo;
	}
	/**
	 * @return the siopeDocumentoTipoAnalogico
	 */
	public SiopeDocumentoTipoAnalogico getSiopeDocumentoTipoAnalogico() {
		return siopeDocumentoTipoAnalogico;
	}
	/**
	 * @param siopeDocumentoTipoAnalogico the siopeDocumentoTipoAnalogico to set
	 */
	public void setSiopeDocumentoTipoAnalogico(SiopeDocumentoTipoAnalogico siopeDocumentoTipoAnalogico) {
		this.siopeDocumentoTipoAnalogico = siopeDocumentoTipoAnalogico;
	}
	/**
	 * Convenience method per il calcolo dell'importo totale degli Oneri con tipo Iva split-reverse Reverse-change.
	 *  
	 * @param tipoIvaSplitReverse
	 * @return importo totale
	 */
	public BigDecimal calcolaTotaleOneriRC(){
		return calcolaTotaleOneri(TipoIvaSplitReverse.REVERSE_CHANGE);
	}
	
	/**
	 * Calcola l'importo totale degli Oneri del tipo Iva split-reverse passato come parametro.
	 *  
	 * @param tipoIvaSplitReverse
	 * @return importo totale
	 */
	public BigDecimal calcolaTotaleOneri(TipoIvaSplitReverse tipoIvaSplitReverse){
		BigDecimal result = BigDecimal.ZERO;
		for(DettaglioOnere onere : getRitenuteDocumento().getListaOnere()){
			if(tipoIvaSplitReverse.equals(onere.getTipoOnere().getTipoIvaSplitReverse())){
				result = result.add(onere.getImportoImponibile());
			}
		}
		return result;
	}
	
}
