/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacattser.model.TipoAtto;
import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siacbilser.model.ImportiCapitolo;
import it.csi.siac.siacbilser.model.Progetto;
import it.csi.siac.siacbilser.model.StatoOperativoMovimentoGestione;
import it.csi.siac.siacbilser.model.TipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.movimentogestione.MutuoAssociatoMovimentoGestione;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siacfinser.model.codifiche.ClasseSoggetto;
import it.csi.siac.siacfinser.model.movgest.ComponenteBilancio;
import it.csi.siac.siacfinser.model.siopeplus.SiopeAssenzaMotivazione;
import it.csi.siac.siacfinser.model.siopeplus.SiopeTipoDebito;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * 
 * 
 *
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public /*can't be abstract*/ class MovimentoGestione extends TransazioneElementare {

	private static final long serialVersionUID = -9184089589875390594L;
	
	private Integer annoScritturaEconomicoPatrimoniale;
	
	private String tipoMovimento;
	private String tipoMovimentoDesc;

	protected Capitolo<? extends ImportiCapitolo, ? extends ImportiCapitolo> capitolo;

	protected ComponenteBilancio componenteBilancioMovimentoGestione;
	
	@Deprecated
	@XmlElement(name = "numero")
	private BigDecimal numeroBigDecimal;

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
	
	private boolean byPassControlloDodicesimi = false;

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
	
	//SIAC-6997
	private boolean flagDaReanno;
	private String strutturaCompetente; 
	private StrutturaAmministrativoContabile strutturaCompetenteObj;
	private BigDecimal importoDaRiaccertare;
	private BigDecimal importoMaxDaRiaccertare;
	private BigDecimal importoModifiche;
	private BigDecimal residuoDaMantenere;
	private BigDecimal daCancellareInsussistenza;
	private BigDecimal daCancellareInesigibilita;
	private BigDecimal differitoN;
	private BigDecimal differitoN1;
	private BigDecimal differitoN2;
	private BigDecimal differitoNP;
	private int numeroTotaleModifcheMovimento;
	//SIAC-7599
	private BigDecimal liquidatoAnnoSuccessivo;
	private BigDecimal documentiNoLiqAnnoSuccessivo;
	private BigDecimal documentiNoIncassatiAnnoSuccessivo;
	private BigDecimal incassatoAnnoSuccessivo;
	
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

	private AttributoMovimentoGestione attributoMovimentoGestione;
	
	private boolean flagAttivaGsa;
	
	private boolean presenzaSubNonAnnullati = false;
	private int numeroSubNonAnnullati = 0;
	
	private boolean collegatoALiquidazioni = false;
	private boolean collegatoAOrdinativi = false;
	
	//assenza motivazione cig:
	private SiopeAssenzaMotivazione siopeAssenzaMotivazione;
	
	//tipo debito siope:
	private SiopeTipoDebito siopeTipoDebito;
	
	protected Progetto progetto;
	
	//SIAC-8650
	private Bilancio bilancio;
	
	//SIAC-7689
	private boolean flagSkipInsertMovDoppiaGestione;
	
	
	private StatoOperativoMovimentoGestione statoOperativo;

	private List<MutuoAssociatoMovimentoGestione> elencoMutuiAssociati;
	private Integer totaleMutuiAssociati;
	
	
	@XmlElementWrapper(name = "listaDettagliPerBilancio")
	@XmlElement(name = "dettaglioPerBilancio")
	protected List<? extends MovimentoGestione> dettagliPerBilancio;
	
	/**
	 * @return the flagSkipInsertMovDoppiaGestione
	 */
	public boolean isFlagSkipInsertMovDoppiaGestione() {
		return flagSkipInsertMovDoppiaGestione;
	}

	/**
	 * @param flagSkipInsertMovDoppiaGestione the flagSkipInsertMovDoppiaGestione to set
	 */
	public void setFlagSkipInsertMovDoppiaGestione(boolean flagSkipInsertMovDoppiaGestione) {
		this.flagSkipInsertMovDoppiaGestione = flagSkipInsertMovDoppiaGestione;
	}
	
	public MovimentoGestione(MovimentoGestione movimentoGestione) {
		this();
		setAnnoMovimento(movimentoGestione.annoMovimento);
		setNumeroBigDecimal(movimentoGestione.numeroBigDecimal);
		setCapitolo(movimentoGestione.getCapitolo());
		setAttoAmministrativo(movimentoGestione.getAttoAmministrativo());
		setSoggetto(movimentoGestione.getSoggetto());
		setComponenteBilancioMovimentoGestione(movimentoGestione.getComponenteBilancioMovimentoGestione());
	}
	
	public MovimentoGestione() {
		super();
	}

	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum AttributoMovimentoGestione {
		annoCapitoloOrigine, annoOriginePlur, annoRiaccertato, numeroArticoloOrigine, 
		flagDaRiaccertamento,flagDaReanno,FlagCollegamentoAccertamentoFattura,FlagCollegamentoAccertamentoCorrispettivo,FlagAttivaGsa, numeroCapitoloOrigine,
		numeroOriginePlur, numeroRiaccertato, numeroUEBOrigine, annoFinanziamento, cig, cup, 
		numeroAccFinanziamento, validato,flagPrenotazione,flagPrenotazioneLiquidabile, flagCassaEconomale, 
		flagSDF,flagFrazionabile,annoScritturaEconomicoPatrimoniale,
		flagSoggettoDurc,
		NON_RICONOSCIUTO, annoPrenotazioneOrigine, 
		//SIAC-8178
		codVerbaleAccertamento
	}

	public String getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	@XmlTransient
	public BigDecimal getNumeroBigDecimal() {
		return numeroBigDecimal;
	}


	public Integer getNumero() {
		return numeroBigDecimal == null ? null : numeroBigDecimal.intValue();
	}

	public void setNumeroBigDecimal(BigDecimal numero) {
		this.numeroBigDecimal = numero;
	}

	public void setNumero(Integer numero) {
		this.numeroBigDecimal = numero == null ? null : BigDecimal.valueOf(numero.intValue());
	}

	public int getAnnoMovimento() {
		return annoMovimento;
	}

	public void setAnnoMovimento(int annoMovimento) {
		this.annoMovimento = annoMovimento;
	}
	
	public void setAnno(Integer anno) {
		setAnnoMovimento(anno == null ? 0 : Integer.valueOf(anno));
	}

	public Integer getAnno() {
		return annoMovimento == 0 ? null : Integer.valueOf(annoMovimento);
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

	
	
	/**
	 * @return the flagDaReanno
	 */
	public boolean isFlagDaReanno() {
		return flagDaReanno;
	}

	/**
	 * @param flagDaReanno the flagDaReanno to set
	 */
	public void setFlagDaReanno(boolean flagDaReanno) {
		this.flagDaReanno = flagDaReanno;
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

	/**
	 * @return the strutturaCompetente
	 */
	public String getStrutturaCompetente() {
		return strutturaCompetente;
	}

	/**
	 * @param strutturaCompetente the strutturaCompetente to set
	 */
	public void setStrutturaCompetente(String strutturaCompetente) {
		this.strutturaCompetente = strutturaCompetente;
	}

	/**
	 * @return the importoDaRiaccertare
	 */
	public BigDecimal getImportoDaRiaccertare() {
		return importoDaRiaccertare;
	}

	/**
	 * @return the importoMaxDaRiaccertare
	 */
	public BigDecimal getImportoMaxDaRiaccertare() {
		return importoMaxDaRiaccertare;
	}

	/**
	 * @return the importoModifiche
	 */
	public BigDecimal getImportoModifiche() {
		return importoModifiche;
	}

	/**
	 * @return the residuoDaMantenere
	 */
	public BigDecimal getResiduoDaMantenere() {
		return residuoDaMantenere;
	}

	/**
	 * @return the daCancellareInsussistenza
	 */
	public BigDecimal getDaCancellareInsussistenza() {
		return daCancellareInsussistenza;
	}

	/**
	 * @return the daCancellareInesigibilita
	 */
	public BigDecimal getDaCancellareInesigibilita() {
		return daCancellareInesigibilita;
	}

	/**
	 * @return the differitoN
	 */
	public BigDecimal getDifferitoN() {
		return differitoN;
	}

	/**
	 * @return the differitoN1
	 */
	public BigDecimal getDifferitoN1() {
		return differitoN1;
	}

	/**
	 * @return the differitoN2
	 */
	public BigDecimal getDifferitoN2() {
		return differitoN2;
	}

	/**
	 * @return the differitoNP
	 */
	public BigDecimal getDifferitoNP() {
		return differitoNP;
	}

	/**
	 * @param importoDaRiaccertare the importoDaRiaccertare to set
	 */
	public void setImportoDaRiaccertare(BigDecimal importoDaRiaccertare) {
		this.importoDaRiaccertare = importoDaRiaccertare;
	}

	/**
	 * @param importoMaxDaRiaccertare the importoMaxDaRiaccertare to set
	 */
	public void setImportoMaxDaRiaccertare(BigDecimal importoMaxDaRiaccertare) {
		this.importoMaxDaRiaccertare = importoMaxDaRiaccertare;
	}

	/**
	 * @param importoModifiche the importoModifiche to set
	 */
	public void setImportoModifiche(BigDecimal importoModifiche) {
		this.importoModifiche = importoModifiche;
	}

	/**
	 * @param residuoDaMantenere the residuoDaMantenere to set
	 */
	public void setResiduoDaMantenere(BigDecimal residuoDaMantenere) {
		this.residuoDaMantenere = residuoDaMantenere;
	}

	/**
	 * @param daCancellareInsussistenza the daCancellareInsussistenza to set
	 */
	public void setDaCancellareInsussistenza(BigDecimal daCancellareInsussistenza) {
		this.daCancellareInsussistenza = daCancellareInsussistenza;
	}

	/**
	 * @param daCancellareInesigibilita the daCancellareInesigibilita to set
	 */
	public void setDaCancellareInesigibilita(BigDecimal daCancellareInesigibilita) {
		this.daCancellareInesigibilita = daCancellareInesigibilita;
	}

	/**
	 * @param differitoN the differitoN to set
	 */
	public void setDifferitoN(BigDecimal differitoN) {
		this.differitoN = differitoN;
	}

	/**
	 * @param differitoN1 the differitoN1 to set
	 */
	public void setDifferitoN1(BigDecimal differitoN1) {
		this.differitoN1 = differitoN1;
	}

	/**
	 * @param differitoN2 the differitoN2 to set
	 */
	public void setDifferitoN2(BigDecimal differitoN2) {
		this.differitoN2 = differitoN2;
	}

	/**
	 * @param differitoNP the differitoNP to set
	 */
	public void setDifferitoNP(BigDecimal differitoNP) {
		this.differitoNP = differitoNP;
	}

	/**
	 * @return the strutturaCompetenteObj
	 */
	public StrutturaAmministrativoContabile getStrutturaCompetenteObj() {
		return strutturaCompetenteObj;
	}

	/**
	 * @param strutturaCompetenteObj the strutturaCompetenteObj to set
	 */
	public void setStrutturaCompetenteObj(StrutturaAmministrativoContabile strutturaCompetenteObj) {
		this.strutturaCompetenteObj = strutturaCompetenteObj;
	}

	/**
	 * @return the numeroTotaleModifcheMovimento
	 */
	public int getNumeroTotaleModifcheMovimento() {
		return numeroTotaleModifcheMovimento;
	}

	/**
	 * @param numeroTotaleModifcheMovimento the numeroTotaleModifcheMovimento to set
	 */
	public void setNumeroTotaleModifcheMovimento(int numeroTotaleModifcheMovimento) {
		this.numeroTotaleModifcheMovimento = numeroTotaleModifcheMovimento;
	}

	/**
	 * @return the liquidatoAnnoSuccessivo
	 */
	public BigDecimal getLiquidatoAnnoSuccessivo() {
		return liquidatoAnnoSuccessivo;
	}

	/**
	 * @return the documentiNoLiqAnnoSuccessivo
	 */
	public BigDecimal getDocumentiNoLiqAnnoSuccessivo() {
		return documentiNoLiqAnnoSuccessivo;
	}

	/**
	 * @param liquidatoAnnoSuccessivo the liquidatoAnnoSuccessivo to set
	 */
	public void setLiquidatoAnnoSuccessivo(BigDecimal liquidatoAnnoSuccessivo) {
		this.liquidatoAnnoSuccessivo = liquidatoAnnoSuccessivo;
	}

	/**
	 * @param documentiNoLiqAnnoSuccessivo the documentiNoLiqAnnoSuccessivo to set
	 */
	public void setDocumentiNoLiqAnnoSuccessivo(BigDecimal documentiNoLiqAnnoSuccessivo) {
		this.documentiNoLiqAnnoSuccessivo = documentiNoLiqAnnoSuccessivo;
	}

	/**
	 * @return the documentiNoIncassatiAnnoSuccessivo
	 */
	public BigDecimal getDocumentiNoIncassatiAnnoSuccessivo() {
		return documentiNoIncassatiAnnoSuccessivo;
	}

	/**
	 * @return the incassatoAnnoSuccessivo
	 */
	public BigDecimal getIncassatoAnnoSuccessivo() {
		return incassatoAnnoSuccessivo;
	}

	/**
	 * @param documentiNoIncassatiAnnoSuccessivo the documentiNoIncassatiAnnoSuccessivo to set
	 */
	public void setDocumentiNoIncassatiAnnoSuccessivo(BigDecimal documentiNoIncassatiAnnoSuccessivo) {
		this.documentiNoIncassatiAnnoSuccessivo = documentiNoIncassatiAnnoSuccessivo;
	}

	/**
	 * @param incassatoAnnoSuccessivo the incassatoAnnoSuccessivo to set
	 */
	public void setIncassatoAnnoSuccessivo(BigDecimal incassatoAnnoSuccessivo) {
		this.incassatoAnnoSuccessivo = incassatoAnnoSuccessivo;
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

	public StatoOperativoMovimentoGestione getStatoOperativo() {
		return statoOperativo;
	}

	public void setStatoOperativo(StatoOperativoMovimentoGestione statoOperativo) {
		this.statoOperativo = statoOperativo;
	}

	public List<MutuoAssociatoMovimentoGestione> getElencoMutuiAssociati() {
		return elencoMutuiAssociati;
	}

	public void setElencoMutuiAssociati(List<MutuoAssociatoMovimentoGestione> elencoMutuiAssociati) {
		this.elencoMutuiAssociati = elencoMutuiAssociati;
	}

	public Integer getTotaleMutuiAssociati() {
		return totaleMutuiAssociati;
	}

	public void setTotaleMutuiAssociati(Integer totaleMutuiAssociati) {
		this.totaleMutuiAssociati = totaleMutuiAssociati;
	}

	@XmlTransient
	protected List<? extends MovimentoGestione> getDettagliPerBilancio() {
		return dettagliPerBilancio;
		
	}		
	
	public void setDettagliPerBilancio(List<? extends MovimentoGestione> dettagliPerBilancio) {
		this.dettagliPerBilancio =  dettagliPerBilancio;
	}

	public Capitolo<? extends ImportiCapitolo, ? extends ImportiCapitolo> getCapitolo() {
		return capitolo;
	}

	public void setCapitolo(Capitolo<? extends ImportiCapitolo, ? extends ImportiCapitolo> capitolo) {
		this.capitolo = capitolo; 
	}

	public ComponenteBilancio getComponenteBilancioMovimentoGestione() {
		return componenteBilancioMovimentoGestione;
	}

	public void setComponenteBilancioMovimentoGestione(ComponenteBilancio componenteBilancio) {
		this.componenteBilancioMovimentoGestione = componenteBilancio;
	}

}
