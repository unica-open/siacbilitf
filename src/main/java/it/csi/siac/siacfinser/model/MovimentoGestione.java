/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacattser.model.TipoAtto;
import it.csi.siac.siacbilser.model.Progetto;
import it.csi.siac.siacfinser.model.codifiche.ClasseSoggetto;
import it.csi.siac.siacfinser.model.siopeplus.SiopeAssenzaMotivazione;
import it.csi.siac.siacfinser.model.siopeplus.SiopeTipoDebito;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * 
 * 
 *
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public abstract class MovimentoGestione extends TransazioneElementare {

	private static final long serialVersionUID = -9184089589875390594L;
	
	private Integer annoScritturaEconomicoPatrimoniale;
	
	private String tipoMovimento;
	private String tipoMovimentoDesc;

	// Numero del movimento unico all'interno dell'anno
	private BigDecimal numero;
	private int annoMovimento;

	// Data inserimento nel sistema dell'entit?
	private Date dataEmissione;

	private Date dataEmissioneSupport;

	// Data di inizio validita' dello stato annullato
	private Date dataAnnullamento;
	// Data introdotta dalla 118, dovrebbe appartenere all'anno del movimento
	private Date dataScadenza;
	private Date dataModifica;

	private String descrizione;
	
	private boolean byPassControlloDodicesimi=false;

	// Importo con cui nasce il movimento nell'anno. Questo dato si mantiene
	private BigDecimal importoIniziale;
	
	// Importo che a inizio vita del movimento e' uguale a importoAttuale, in
	// caso di modifiche è questo l'importo che viene variato quindi è l'importo
	// su cui fare
	// tutti i calcoli di diponibilita'
	private BigDecimal importoAttuale;

	// Con articolo e anno tiene memoria in caso di spostamento dell'impegno da
	// un capitolo a un altro o incasodi rinumerazione.
	private int annoCapitoloOrigine;
	private int numeroCapitoloOrigine;
	private int numeroArticoloOrigine;

	private int numeroUEBOrigine;

	// Indica se il movimento nasce da un riaccertamento residui.
	private boolean flagDaRiaccertamento;
	
	private boolean flagSoggettoDurc;
	
	// Anno del movimento riaccertato da cui deriva il presente movimento
	private int annoRiaccertato;

	// Numero del movimento riaccertato da cui deriva il presente movimento
	private BigDecimal numeroRiaccertato;

	// Anno del movimento originale della catena dei pluriennali
	private int annoOriginePlur;

	// Numero del movimento originale della catena dei pluriennali
	private BigDecimal numeroOriginePlur;

	private String utenteCreazione;
	private String utenteModifica;
	private String utenteCancellazione;

	// Usato da enti che prevedono una fase di validazione nell'iter di
	// definizione del movimento di gestione, indipendente dallo stato dell'atto
	// amministrativo
	// collegato al movimento impostato di default a TRUE
	private boolean validato = true;

	private Boolean parereFinanziario = Boolean.FALSE;
	private Date parereFinanziarioDataModifica;
	private String parereFinanziarioLoginOperazione;

	private String soggettoCode;
	private AttoAmministrativo attoAmministrativo;
	private String attoAmmAnno;
	private Integer attoAmmNumero;
	private Integer idStrutturaAmministrativa;
	private TipoAtto attoAmmTipoAtto;
	private Soggetto soggetto;
	private ClasseSoggetto classeSoggetto;
	// private CodificaFin progetto;

	// List<ModificaMovimentoGestioneSpesa>
	// listaModificheMovimentoGestioneSpesa;

	private AttributoMovimentoGestione attributoMovimentoGestione;
	
	private boolean flagAttivaGsa;
	
	private boolean presenzaSubNonAnnullati = false;
	private int numeroSubNonAnnullati = 0;
	
	private boolean collegatoALiquidazioni = false;
	private boolean collegatoAOrdinativi = false;
	
	//nuovi campi per siope plus:

	//assenza motivazione cig:
	private SiopeAssenzaMotivazione siopeAssenzaMotivazione;
	
	//tipo debito siope:
	private SiopeTipoDebito siopeTipoDebito;
	
	protected Progetto progetto;
	
	
	
	
	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum AttributoMovimentoGestione {
		annoCapitoloOrigine, annoOriginePlur, annoRiaccertato, numeroArticoloOrigine, 
		flagDaRiaccertamento,FlagCollegamentoAccertamentoFattura,FlagCollegamentoAccertamentoCorrispettivo,FlagAttivaGsa, numeroCapitoloOrigine,
		numeroOriginePlur, numeroRiaccertato, numeroUEBOrigine, annoFinanziamento, cig, cup, 
		numeroAccFinanziamento, validato,flagPrenotazione,flagPrenotazioneLiquidabile, flagCassaEconomale, 
		flagSDF,flagFrazionabile,annoScritturaEconomicoPatrimoniale,
		flagSoggettoDurc,
		NON_RICONOSCIUTO
	}

	public String getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public BigDecimal getNumero() {
		return numero;
	}

	public void setNumero(BigDecimal numero) {
		this.numero = numero;
	}

	public int getAnnoMovimento() {
		return annoMovimento;
	}

	public void setAnnoMovimento(int annoMovimento) {
		this.annoMovimento = annoMovimento;
	}

	@XmlSchemaType(type = java.util.Date.class, name = "dateTime")
	public Date getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(Date dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataAnnullamento() {
		return dataAnnullamento;
	}

	public void setDataAnnullamento(Date dataAnnullamento) {
		this.dataAnnullamento = dataAnnullamento;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public BigDecimal getImportoIniziale() {
		return importoIniziale;
	}

	public void setImportoIniziale(BigDecimal importoIniziale) {
		this.importoIniziale = importoIniziale;
	}

	public BigDecimal getImportoAttuale() {
		return importoAttuale;
	}

	public void setImportoAttuale(BigDecimal importoAttuale) {
		this.importoAttuale = importoAttuale;
	}

	public int getAnnoCapitoloOrigine() {
		return annoCapitoloOrigine;
	}

	public void setAnnoCapitoloOrigine(int annoCapitoloOrigine) {
		this.annoCapitoloOrigine = annoCapitoloOrigine;
	}

	public int getNumeroCapitoloOrigine() {
		return numeroCapitoloOrigine;
	}

	public void setNumeroCapitoloOrigine(int numeroCapitoloOrigine) {
		this.numeroCapitoloOrigine = numeroCapitoloOrigine;
	}

	public int getNumeroArticoloOrigine() {
		return numeroArticoloOrigine;
	}

	public void setNumeroArticoloOrigine(int numeroArticoloOrigine) {
		this.numeroArticoloOrigine = numeroArticoloOrigine;
	}

	public int getNumeroUEBOrigine() {
		return numeroUEBOrigine;
	}

	public void setNumeroUEBOrigine(int numeroUEBOrigine) {
		this.numeroUEBOrigine = numeroUEBOrigine;
	}

	public boolean isFlagDaRiaccertamento() {
		return flagDaRiaccertamento;
	}

	public void setFlagDaRiaccertamento(boolean flagDaRiaccertamento) {
		this.flagDaRiaccertamento = flagDaRiaccertamento;
	}

	public int getAnnoRiaccertato() {
		return annoRiaccertato;
	}

	public void setAnnoRiaccertato(int annoRiaccertato) {
		this.annoRiaccertato = annoRiaccertato;
	}

	public BigDecimal getNumeroRiaccertato() {
		return numeroRiaccertato;
	}

	public void setNumeroRiaccertato(BigDecimal numeroRiaccertato) {
		this.numeroRiaccertato = numeroRiaccertato;
	}

	public int getAnnoOriginePlur() {
		return annoOriginePlur;
	}

	public void setAnnoOriginePlur(int annoOriginePlur) {
		this.annoOriginePlur = annoOriginePlur;
	}

	public BigDecimal getNumeroOriginePlur() {
		return numeroOriginePlur;
	}

	public void setNumeroOriginePlur(BigDecimal numeroOriginePlur) {
		this.numeroOriginePlur = numeroOriginePlur;
	}

	public String getUtenteCreazione() {
		return utenteCreazione;
	}

	public void setUtenteCreazione(String utenteCreazione) {
		this.utenteCreazione = utenteCreazione;
	}

	public String getUtenteModifica() {
		return utenteModifica;
	}

	public void setUtenteModifica(String utenteModifica) {
		this.utenteModifica = utenteModifica;
	}

	public String getUtenteCancellazione() {
		return utenteCancellazione;
	}

	public void setUtenteCancellazione(String utenteCancellazione) {
		this.utenteCancellazione = utenteCancellazione;
	}

	public boolean isValidato() {
		return validato;
	}

	public void setValidato(boolean validato) {
		this.validato = validato;
	}

	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}

	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}

	public Soggetto getSoggetto() {
		return soggetto;
	}

	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}

	public ClasseSoggetto getClasseSoggetto() {
		return classeSoggetto;
	}

	public void setClasseSoggetto(ClasseSoggetto classeSoggetto) {
		this.classeSoggetto = classeSoggetto;
	}

	// public List<ModificaMovimentoGestioneSpesa>
	// getListaModificheMovimentoGestioneSpesa() {
	// return listaModificheMovimentoGestioneSpesa;
	// }
	//
	// public void setListaModificheMovimentoGestioneSpesa(
	// List<ModificaMovimentoGestioneSpesa>
	// listaModificheMovimentoGestioneSpesa) {
	// this.listaModificheMovimentoGestioneSpesa =
	// listaModificheMovimentoGestioneSpesa;
	// }

	public AttributoMovimentoGestione getAttributoMovimentoGestione() {
		return attributoMovimentoGestione;
	}

	public void setAttributoMovimentoGestione(
			AttributoMovimentoGestione attributoMovimentoGestione) {
		this.attributoMovimentoGestione = attributoMovimentoGestione;
	}

	public String getSoggettoCode() {
		return soggettoCode;
	}

	public void setSoggettoCode(String soggettoCode) {
		this.soggettoCode = soggettoCode;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataModifica() {
		return dataModifica;
	}

	public void setDataModifica(Date dataUltimaModifica) {
		this.dataModifica = dataUltimaModifica;
	}

	public String getTipoMovimentoDesc() {
		return tipoMovimentoDesc;
	}

	public void setTipoMovimentoDesc(String tipoMovimentoDesc) {
		this.tipoMovimentoDesc = tipoMovimentoDesc;
	}

	/*
	 * public String getCodProgramma() { return codProgramma; }
	 * 
	 * public void setCodProgramma(String codProgramma) { this.codProgramma =
	 * codProgramma; }
	 * 
	 * public String getDescProgramma() { return descProgramma; }
	 * 
	 * public void setDescProgramma(String descProgramma) { this.descProgramma =
	 * descProgramma; }
	 * 
	 * public String getCodPdc() { return codPdc; }
	 * 
	 * public void setCodPdc(String codPdc) { this.codPdc = codPdc; }
	 * 
	 * public String getDescPdc() { return descPdc; }
	 * 
	 * public void setDescPdc(String descPdc) { this.descPdc = descPdc; }
	 * 
	 * public String getCodContoEconomico() { return codContoEconomico; }
	 * 
	 * public void setCodContoEconomico(String codContoEconomico) {
	 * this.codContoEconomico = codContoEconomico; }
	 * 
	 * public String getDescCodContoEconomico() { return descCodContoEconomico;
	 * }
	 * 
	 * public void setDescCodContoEconomico(String descCodContoEconomico) {
	 * this.descCodContoEconomico = descCodContoEconomico; }
	 * 
	 * public String getCodCofog() { return codCofog; }
	 * 
	 * public void setCodCofog(String codCofog) { this.codCofog = codCofog; }
	 * 
	 * public String getCodTransazioneEuropeaSpesa() { return
	 * codTransazioneEuropeaSpesa; }
	 * 
	 * public void setCodTransazioneEuropeaSpesa(String
	 * codTransazioneEuropeaSpesa) { this.codTransazioneEuropeaSpesa =
	 * codTransazioneEuropeaSpesa; }
	 * 
	 * public String getDescTransazioneEuropeaSpesa() { return
	 * descTransazioneEuropeaSpesa; }
	 * 
	 * public void setDescTransazioneEuropeaSpesa(String
	 * descTransazioneEuropeaSpesa) { this.descTransazioneEuropeaSpesa =
	 * descTransazioneEuropeaSpesa; }
	 * 
	 * public String getCodSiope() { return codSiope; }
	 * 
	 * public void setCodSiope(String codSiope) { this.codSiope = codSiope; }
	 * 
	 * public String getDescCodSiope() { return descCodSiope; }
	 * 
	 * public void setDescCodSiope(String descCodSiope) { this.descCodSiope =
	 * descCodSiope; }
	 * 
	 * public String getCodRicorrenteSpesa() { return codRicorrenteSpesa; }
	 * 
	 * public void setCodRicorrenteSpesa(String codRicorrenteSpesa) {
	 * this.codRicorrenteSpesa = codRicorrenteSpesa; }
	 * 
	 * public String getCodCapitoloSanitarioSpesa() { return
	 * codCapitoloSanitarioSpesa; }
	 * 
	 * public void setCodCapitoloSanitarioSpesa(String
	 * codCapitoloSanitarioSpesa) { this.codCapitoloSanitarioSpesa =
	 * codCapitoloSanitarioSpesa; }
	 * 
	 * public String getCodPrgPolReg() { return codPrgPolReg; }
	 * 
	 * public void setCodPrgPolReg(String codPrgPolReg) { this.codPrgPolReg =
	 * codPrgPolReg; }
	 * 
	 * public String getCodClassGen11() { return codClassGen11; }
	 * 
	 * public void setCodClassGen11(String codClassGen11) { this.codClassGen11 =
	 * codClassGen11; }
	 * 
	 * public String getCodClassGen12() { return codClassGen12; }
	 * 
	 * public void setCodClassGen12(String codClassGen12) { this.codClassGen12 =
	 * codClassGen12; }
	 * 
	 * public String getCodClassGen13() { return codClassGen13; }
	 * 
	 * public void setCodClassGen13(String codClassGen13) { this.codClassGen13 =
	 * codClassGen13; }
	 * 
	 * public String getCodClassGen14() { return codClassGen14; }
	 * 
	 * public void setCodClassGen14(String codClassGen14) { this.codClassGen14 =
	 * codClassGen14; }
	 * 
	 * public String getCodClassGen15() { return codClassGen15; }
	 * 
	 * public void setCodClassGen15(String codClassGen15) { this.codClassGen15 =
	 * codClassGen15; }
	 * 
	 * public Integer getIdPdc() { return idPdc; }
	 * 
	 * public void setIdPdc(Integer idPdc) { this.idPdc = idPdc; }
	 * 
	 * public Integer getIdSiope() { return idSiope; }
	 * 
	 * public void setIdSiope(Integer idSiope) { this.idSiope = idSiope; }
	 * 
	 * public Integer getIdContoEconomico() { return idContoEconomico; }
	 * 
	 * public void setIdContoEconomico(Integer idContoEconomico) {
	 * this.idContoEconomico = idContoEconomico; }
	 */

	public String getAttoAmmAnno() {
		return attoAmmAnno;
	}

	public void setAttoAmmAnno(String attoAmmAnno) {
		this.attoAmmAnno = attoAmmAnno;
	}

	public Integer getAttoAmmNumero() {
		return attoAmmNumero;
	}

	public void setAttoAmmNumero(Integer attoAmmNumero) {
		this.attoAmmNumero = attoAmmNumero;
	}

	public TipoAtto getAttoAmmTipoAtto() {
		return attoAmmTipoAtto;
	}

	public void setAttoAmmTipoAtto(TipoAtto attoAmmTipoAtto) {
		this.attoAmmTipoAtto = attoAmmTipoAtto;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataEmissioneSupport() {
		return dataEmissioneSupport;
	}

	public void setDataEmissioneSupport(Date dataEmissioneSupport) {
		this.dataEmissioneSupport = dataEmissioneSupport;
	}

	public Integer getIdStrutturaAmministrativa() {
		return idStrutturaAmministrativa;
	}

	public void setIdStrutturaAmministrativa(Integer idStrutturaAmministrativa) {
		this.idStrutturaAmministrativa = idStrutturaAmministrativa;
	}

	/**
	 * @return the parereFinanziario
	 */
	public Boolean getParereFinanziario() {
		return parereFinanziario;
	}

	/**
	 * @param parereFinanziario
	 *            the parereFinanziario to set
	 */
	public void setParereFinanziario(Boolean parereFinanziario) {
		this.parereFinanziario = parereFinanziario;
	}

	public Date getParereFinanziarioDataModifica() {
		return parereFinanziarioDataModifica;
	}

	public void setParereFinanziarioDataModifica(Date parereFinanziarioDataModifica) {
		this.parereFinanziarioDataModifica = parereFinanziarioDataModifica;
	}

	public String getParereFinanziarioLoginOperazione() {
		return parereFinanziarioLoginOperazione;
	}

	public void setParereFinanziarioLoginOperazione(
			String parereFinanziarioLoginOperazione) {
		this.parereFinanziarioLoginOperazione = parereFinanziarioLoginOperazione;
	}

	public boolean isFlagAttivaGsa() {
		return flagAttivaGsa;
	}

	public void setFlagAttivaGsa(boolean flagAttivaGsa) {
		this.flagAttivaGsa = flagAttivaGsa;
	}

	public boolean isPresenzaSubNonAnnullati() {
		return presenzaSubNonAnnullati;
	}

	public void setPresenzaSubNonAnnullati(boolean presenzaSubNonAnnullati) {
		this.presenzaSubNonAnnullati = presenzaSubNonAnnullati;
	}

	public int getNumeroSubNonAnnullati() {
		return numeroSubNonAnnullati;
	}

	public void setNumeroSubNonAnnullati(int numeroSubNonAnnullati) {
		this.numeroSubNonAnnullati = numeroSubNonAnnullati;
	}

	/**
	 * @return the collegatoALiquidazioni
	 */
	public boolean isCollegatoALiquidazioni() {
		return collegatoALiquidazioni;
	}

	/**
	 * @param collegatoALiquidazioni the collegatoALiquidazioni to set
	 */
	public void setCollegatoALiquidazioni(boolean collegatoALiquidazioni) {
		this.collegatoALiquidazioni = collegatoALiquidazioni;
	}

	/**
	 * @return the collegatoAOrdinativi
	 */
	public boolean isCollegatoAOrdinativi() {
		return collegatoAOrdinativi;
	}

	/**
	 * @param collegatoAOrdinativi the collegatoAOrdinativi to set
	 */
	public void setCollegatoAOrdinativi(boolean collegatoAOrdinativi) {
		this.collegatoAOrdinativi = collegatoAOrdinativi;
	}

	public boolean isByPassControlloDodicesimi() {
		return byPassControlloDodicesimi;
	}

	public void setByPassControlloDodicesimi(boolean byPassControlloDodicesimi) {
		this.byPassControlloDodicesimi = byPassControlloDodicesimi;
	}

	public Integer getAnnoScritturaEconomicoPatrimoniale() {
		return annoScritturaEconomicoPatrimoniale;
	}

	public void setAnnoScritturaEconomicoPatrimoniale(Integer annoScritturaEconomicoPatrimoniale) {
		this.annoScritturaEconomicoPatrimoniale = annoScritturaEconomicoPatrimoniale;
	}

	public SiopeAssenzaMotivazione getSiopeAssenzaMotivazione() {
		return siopeAssenzaMotivazione;
	}

	public void setSiopeAssenzaMotivazione(
			SiopeAssenzaMotivazione siopeAssenzaMotivazione) {
		this.siopeAssenzaMotivazione = siopeAssenzaMotivazione;
	}

	public SiopeTipoDebito getSiopeTipoDebito() {
		return siopeTipoDebito;
	}

	public void setSiopeTipoDebito(SiopeTipoDebito siopeTipoDebito) {
		this.siopeTipoDebito = siopeTipoDebito;
	}

	public boolean isFlagSoggettoDurc() {
		return flagSoggettoDurc;
	}

	public void setFlagSoggettoDurc(boolean flagSoggettoDurc) {
		this.flagSoggettoDurc = flagSoggettoDurc;
	}

	public Progetto getProgetto() {
		return progetto;
	}

	public void setProgetto(Progetto progetto) {
		this.progetto = progetto;
	}

	

}
