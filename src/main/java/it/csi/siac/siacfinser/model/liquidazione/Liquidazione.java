/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.liquidazione;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;
import it.csi.siac.siacfinser.model.ContoTesoreria;
import it.csi.siac.siacfinser.model.Distinta;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubImpegno;
import it.csi.siac.siacfinser.model.TransazioneElementare;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoPagamento;
import it.csi.siac.siacfinser.model.siopeplus.SiopeAssenzaMotivazione;
import it.csi.siac.siacfinser.model.siopeplus.SiopeTipoDebito;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;

/**
 * 
 * @author
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Liquidazione extends TransazioneElementare {

	private static final long serialVersionUID = -1324951649564491905L;

	private Integer idLiquidazione;
	private BigDecimal numeroLiquidazione;
	private String descrizioneLiquidazione;
	private Integer annoLiquidazione;
	private Date dataEmissioneLiquidazione;

	private BigDecimal importoLiquidazione;

	private BigDecimal importoInizialeLiquidazione;
	private BigDecimal importoAttualeLiquidazione;

	// private BigDecimal disponibilitaPagare = new BigDecimal("1234");
	private BigDecimal disponibilitaPagare;

	private Date dataInizioValidita;
	private Date dataFineValidita;
	private Date dataCreazione;
	private Date dataModifica;
	private Date dataCancellazione;

	private String loginCancellazione;
	private String loginCreazione;
	private String loginModifica;

	private Integer numeroMutuo;
	// private Integer numeroMutuoSubImp;

	private Soggetto soggettoLiquidazione;
	private Integer idSoggettoLiquidazione;
	private String codiceSoggettoLiquidazione;
	// private ClasseSoggetto classeSoggettoLiquidazione;
	private String codiceClasseSoggettoLiquidazione;

	private AttoAmministrativo attoAmministrativoLiquidazione;
	private Integer idAttoAmministrativoLiquidazione;
	private Integer annoAttoAmministrativoLiquidazione;
	private Integer numeroAttoAmministrativoLiquidazione;
	private String codiceTipoAttoAmministrativoLiquidazione;

	private CapitoloUscitaGestione capitoloUscitaGestione;
	private int annoCapitoloLiquidazione;
	private int numeroCapitoloLiquidazione;
	private int numeroArticoloLiquidazione;

	private StatoOperativoLiquidazione statoOperativoLiquidazione;

	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum StatoOperativoLiquidazione {
		VALIDO, ANNULLATO, PROVVISORIO
	}

	private ClassificatoreGenerico classificatoreStatoOperativoLiquidazione;
	private Integer idStatoOperativoLiquidazione;
	private Date dataStatoOperativoLiquidazione;
	private Date dataAnnullamento;
	private String codiceStatoOperativoLiquidazione;


	private Impegno impegno;
	private BigDecimal numeroImpegno;
	private Integer annoImpegno;

	private SubImpegno subImpegno;

	private Distinta distinta;

	private ContoTesoreria contoTesoreria;
	private String contoTesoreriaCodice;

	private String cig;

	private String liqAutomatica;
	private String liqManuale;

	private ModalitaPagamentoSoggetto modalitaPagamentoSoggetto;
	private Integer sedeSecondariaSoggetto;

	// Aggiornamento
	private BigDecimal importoLiquidazioneDaAggiornare;
	private Integer annoAttoAmmDaAggiornare;
	private Integer numeroAttoAmmDaAggiornare;
	private String codiceTipoAttoAmmDaAggiornare;
	private String statoOperativoAttoAmmDaAggiornare;
	private StatoOperativoLiquidazione statoOperativoLiquidazioneDaAggiornare;
	private String liqAutomaticaDaAggiornare;
	private String liqManualeDaAggiornare;

	private List<OrdinativoPagamento> listaOrdinativi;
	private SubdocumentoSpesa subdocumentoSpesa;

	// Bypass per la forzatura della disponibilita a liquidare
	private boolean forza = false;

	// private ModalitaPagamentoSoggetto modalitaPagamentoSedeSecondaria;
	//
	// private VoceMutuo voceMutuoImpegno;
	//
	// private VoceMutuo voceMutuoSubImpegno;
	//
	// private SedeSecondariaSoggetto sedeSecondariaSoggetto;
	


	//NUOVI CAMPI PER SIOPE PLUS:

	//assenza motivazione cig:
	private SiopeAssenzaMotivazione siopeAssenzaMotivazione;
	
	//tipo debito siope:
	private SiopeTipoDebito siopeTipoDebito;

	public BigDecimal getNumeroLiquidazione() {
		return numeroLiquidazione;
	}

	public void setNumeroLiquidazione(BigDecimal numeroLiquidazione) {
		this.numeroLiquidazione = numeroLiquidazione;
	}

	public String getDescrizioneLiquidazione() {
		return descrizioneLiquidazione;
	}

	public void setDescrizioneLiquidazione(String descrizioneLiquidazione) {
		this.descrizioneLiquidazione = descrizioneLiquidazione;
	}

	public BigDecimal getImportoInizialeLiquidazione() {
		return importoInizialeLiquidazione;
	}

	public void setImportoInizialeLiquidazione(
			BigDecimal importoInizialeLiquidazione) {
		this.importoInizialeLiquidazione = importoInizialeLiquidazione;
	}

	public BigDecimal getImportoAttualeLiquidazione() {
		return importoAttualeLiquidazione;
	}

	public void setImportoAttualeLiquidazione(
			BigDecimal importoAttualeLiquidazione) {
		this.importoAttualeLiquidazione = importoAttualeLiquidazione;
	}

	@XmlSchemaType(name="dateTime")
	public Date getDataInizioValidita() {
		return dataInizioValidita;
	}

	public void setDataInizioValidita(Date dataInizioValidita) {
		this.dataInizioValidita = dataInizioValidita;
	}

	@XmlSchemaType(name="dateTime")
	public Date getDataFineValidita() {
		return dataFineValidita;
	}

	public void setDataFineValidita(Date dataFineValidita) {
		this.dataFineValidita = dataFineValidita;
	}

	@XmlSchemaType(name="dateTime")
	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	@XmlSchemaType(name="dateTime")
	public Date getDataModifica() {
		return dataModifica;
	}

	public void setDataModifica(Date dataModifica) {
		this.dataModifica = dataModifica;
	}

	@XmlSchemaType(name="dateTime")
	public Date getDataCancellazione() {
		return dataCancellazione;
	}

	public void setDataCancellazione(Date dataCancellazione) {
		this.dataCancellazione = dataCancellazione;
	}

	public String getLoginCancellazione() {
		return loginCancellazione;
	}

	public void setLoginCancellazione(String loginCancellazione) {
		this.loginCancellazione = loginCancellazione;
	}

	public String getLoginCreazione() {
		return loginCreazione;
	}

	public void setLoginCreazione(String loginCreazione) {
		this.loginCreazione = loginCreazione;
	}

	public String getLoginModifica() {
		return loginModifica;
	}

	public void setLoginModifica(String loginModifica) {
		this.loginModifica = loginModifica;
	}

	public Impegno getImpegno() {
		return impegno;
	}

	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

	public Distinta getDistinta() {
		return distinta;
	}

	public void setDistinta(Distinta distinta) {
		this.distinta = distinta;
	}

	public ContoTesoreria getContoTesoreria() {
		return contoTesoreria;
	}

	public void setContoTesoreria(ContoTesoreria contoTesoreria) {
		this.contoTesoreria = contoTesoreria;
	}

	public Soggetto getSoggettoLiquidazione() {
		return soggettoLiquidazione;
	}

	public void setSoggettoLiquidazione(Soggetto soggettoLiquidazione) {
		this.soggettoLiquidazione = soggettoLiquidazione;
	}

	public Integer getIdSoggettoLiquidazione() {
		return idSoggettoLiquidazione;
	}

	public void setIdSoggettoLiquidazione(Integer idSoggettoLiquidazione) {
		this.idSoggettoLiquidazione = idSoggettoLiquidazione;
	}

	public String getCodiceSoggettoLiquidazione() {
		return codiceSoggettoLiquidazione;
	}

	public void setCodiceSoggettoLiquidazione(String codiceSoggettoLiquidazione) {
		this.codiceSoggettoLiquidazione = codiceSoggettoLiquidazione;
	}

	public AttoAmministrativo getAttoAmministrativoLiquidazione() {
		return attoAmministrativoLiquidazione;
	}

	public void setAttoAmministrativoLiquidazione(
			AttoAmministrativo attoAmministrativoLiquidazione) {
		this.attoAmministrativoLiquidazione = attoAmministrativoLiquidazione;
	}

	public Integer getIdAttoAmministrativoLiquidazione() {
		return idAttoAmministrativoLiquidazione;
	}

	public void setIdAttoAmministrativoLiquidazione(
			Integer idAttoAmministrativoLiquidazione) {
		this.idAttoAmministrativoLiquidazione = idAttoAmministrativoLiquidazione;
	}

	public Integer getAnnoAttoAmministrativoLiquidazione() {
		return annoAttoAmministrativoLiquidazione;
	}

	public void setAnnoAttoAmministrativoLiquidazione(
			Integer annoAttoAmministrativoLiquidazione) {
		this.annoAttoAmministrativoLiquidazione = annoAttoAmministrativoLiquidazione;
	}

	public Integer getNumeroAttoAmministrativoLiquidazione() {
		return numeroAttoAmministrativoLiquidazione;
	}

	public void setNumeroAttoAmministrativoLiquidazione(
			Integer numeroAttoAmministrativoLiquidazione) {
		this.numeroAttoAmministrativoLiquidazione = numeroAttoAmministrativoLiquidazione;
	}

	// public ClasseSoggetto getClasseSoggettoLiquidazione() {
	// return classeSoggettoLiquidazione;
	// }
	//
	// public void setClasseSoggettoLiquidazione(
	// ClasseSoggetto classeSoggettoLiquidazione) {
	// this.classeSoggettoLiquidazione = classeSoggettoLiquidazione;
	// }

	public String getCodiceClasseSoggettoLiquidazione() {
		return codiceClasseSoggettoLiquidazione;
	}

	public void setCodiceClasseSoggettoLiquidazione(
			String codiceClasseSoggettoLiquidazione) {
		this.codiceClasseSoggettoLiquidazione = codiceClasseSoggettoLiquidazione;
	}

	public int getAnnoCapitoloLiquidazione() {
		return annoCapitoloLiquidazione;
	}

	public void setAnnoCapitoloLiquidazione(int annoCapitoloLiquidazione) {
		this.annoCapitoloLiquidazione = annoCapitoloLiquidazione;
	}

	public int getNumeroCapitoloLiquidazione() {
		return numeroCapitoloLiquidazione;
	}

	public void setNumeroCapitoloLiquidazione(int numeroCapitoloLiquidazione) {
		this.numeroCapitoloLiquidazione = numeroCapitoloLiquidazione;
	}

	public int getNumeroArticoloLiquidazione() {
		return numeroArticoloLiquidazione;
	}

	public void setNumeroArticoloLiquidazione(int numeroArticoloLiquidazione) {
		this.numeroArticoloLiquidazione = numeroArticoloLiquidazione;
	}

	public CapitoloUscitaGestione getCapitoloUscitaGestione() {
		return capitoloUscitaGestione;
	}

	public void setCapitoloUscitaGestione(
			CapitoloUscitaGestione capitoloUscitaGestione) {
		this.capitoloUscitaGestione = capitoloUscitaGestione;
	}

	public Integer getNumeroMutuo() {
		return numeroMutuo;
	}

	public void setNumeroMutuo(Integer numeroMutuo) {
		this.numeroMutuo = numeroMutuo;
	}

	public String getCig() {
		return cig;
	}

	public void setCig(String cig) {
		this.cig = cig;
	}

	public BigDecimal getImportoLiquidazione() {
		return importoLiquidazione;
	}

	public void setImportoLiquidazione(BigDecimal importoLiquidazione) {
		this.importoLiquidazione = importoLiquidazione;
	}

	public BigDecimal getNumeroImpegno() {
		return numeroImpegno;
	}

	public void setNumeroImpegno(BigDecimal numeroImpegno) {
		this.numeroImpegno = numeroImpegno;
	}

	public Integer getAnnoImpegno() {
		return annoImpegno;
	}

	public void setAnnoImpegno(Integer annoImpegno) {
		this.annoImpegno = annoImpegno;
	}

	public ModalitaPagamentoSoggetto getModalitaPagamentoSoggetto() {
		return modalitaPagamentoSoggetto;
	}

	public void setModalitaPagamentoSoggetto(
			ModalitaPagamentoSoggetto modalitaPagamentoSoggetto) {
		this.modalitaPagamentoSoggetto = modalitaPagamentoSoggetto;
	}

	public StatoOperativoLiquidazione getStatoOperativoLiquidazione() {
		return statoOperativoLiquidazione;
	}

	public void setStatoOperativoLiquidazione(
			StatoOperativoLiquidazione statoOperativoLiquidazione) {
		this.statoOperativoLiquidazione = statoOperativoLiquidazione;
	}

	public Integer getIdLiquidazione() {
		return idLiquidazione;
	}

	public void setIdLiquidazione(Integer idLiquidazione) {
		this.idLiquidazione = idLiquidazione;
	}

	public Integer getAnnoLiquidazione() {
		return annoLiquidazione;
	}

	public void setAnnoLiquidazione(Integer annoLiquidazione) {
		this.annoLiquidazione = annoLiquidazione;
	}

	public Date getDataEmissioneLiquidazione() {
		return dataEmissioneLiquidazione;
	}

	public void setDataEmissioneLiquidazione(Date dataEmissioneLiquidazione) {
		this.dataEmissioneLiquidazione = dataEmissioneLiquidazione;
	}

	public Integer getIdStatoOperativoLiquidazione() {
		return idStatoOperativoLiquidazione;
	}

	public void setIdStatoOperativoLiquidazione(
			Integer idStatoOperativoLiquidazione) {
		this.idStatoOperativoLiquidazione = idStatoOperativoLiquidazione;
	}

	public ClassificatoreGenerico getClassificatoreStatoOperativoLiquidazione() {
		return classificatoreStatoOperativoLiquidazione;
	}

	public void setClassificatoreStatoOperativoLiquidazione(
			ClassificatoreGenerico classificatoreStatoOperativoLiquidazione) {
		this.classificatoreStatoOperativoLiquidazione = classificatoreStatoOperativoLiquidazione;
	}

	public Date getDataStatoOperativoLiquidazione() {
		return dataStatoOperativoLiquidazione;
	}

	public void setDataStatoOperativoLiquidazione(
			Date dataStatoOperativoLiquidazione) {
		this.dataStatoOperativoLiquidazione = dataStatoOperativoLiquidazione;
	}

	public String getContoTesoreriaCodice() {
		return contoTesoreriaCodice;
	}

	public void setContoTesoreriaCodice(String contoTesoreriaCodice) {
		this.contoTesoreriaCodice = contoTesoreriaCodice;
	}

	public SubImpegno getSubImpegno() {
		return subImpegno;
	}

	public void setSubImpegno(SubImpegno subImpegno) {
		this.subImpegno = subImpegno;
	}

	// public BigDecimal getNumeroSubimpegno() {
	// return numeroSubimpegno;
	// }
	//
	// public void setNumeroSubimpegno(BigDecimal numeroSubimpegno) {
	// this.numeroSubimpegno = numeroSubimpegno;
	// }

	public String getCodiceTipoAttoAmministrativoLiquidazione() {
		return codiceTipoAttoAmministrativoLiquidazione;
	}

	public void setCodiceTipoAttoAmministrativoLiquidazione(
			String codiceTipoAttoAmministrativoLiquidazione) {
		this.codiceTipoAttoAmministrativoLiquidazione = codiceTipoAttoAmministrativoLiquidazione;
	}

	// public ModalitaPagamentoSoggetto getModalitaPagamentoSedeSecondaria() {
	// return modalitaPagamentoSedeSecondaria;
	// }
	//
	// public void setModalitaPagamentoSedeSecondaria(
	// ModalitaPagamentoSoggetto modalitaPagamentoSedeSecondaria) {
	// this.modalitaPagamentoSedeSecondaria = modalitaPagamentoSedeSecondaria;
	// }
	//
	// public VoceMutuo getVoceMutuoImpegno() {
	// return voceMutuoImpegno;
	// }
	//
	// public void setVoceMutuoImpegno(VoceMutuo voceMutuoImpegno) {
	// this.voceMutuoImpegno = voceMutuoImpegno;
	// }
	//
	// public VoceMutuo getVoceMutuoSubImpegno() {
	// return voceMutuoSubImpegno;
	// }
	//
	// public void setVoceMutuoSubImpegno(VoceMutuo voceMutuoSubImpegno) {
	// this.voceMutuoSubImpegno = voceMutuoSubImpegno;
	// }
	//
	// public Integer getNumeroMutuoSubImp() {
	// return numeroMutuoSubImp;
	// }
	//
	// public void setNumeroMutuoSubImp(Integer numeroMutuoSubImp) {
	// this.numeroMutuoSubImp = numeroMutuoSubImp;
	// }
	//
	// public SedeSecondariaSoggetto getSedeSecondariaSoggetto() {
	// return sedeSecondariaSoggetto;
	// }
	//
	// public void setSedeSecondariaSoggetto(SedeSecondariaSoggetto
	// sedeSecondariaSoggetto) {
	// this.sedeSecondariaSoggetto = sedeSecondariaSoggetto;
	// }

	public String getLiqAutomatica() {
		return liqAutomatica;
	}

	public void setLiqAutomatica(String liqAutomatica) {
		this.liqAutomatica = liqAutomatica;
	}

	public String getLiqManuale() {
		return liqManuale;
	}

	public void setLiqManuale(String liqManuale) {
		this.liqManuale = liqManuale;
	}

	/*
	 * public String getCodMissione() { return codMissione; }
	 * 
	 * public String getCodProgramma() { return codProgramma; }
	 * 
	 * public String getDescProgramma() { return descProgramma; }
	 * 
	 * public String getCodPdc() { return codPdc; }
	 * 
	 * public String getDescPdc() { return descPdc; }
	 * 
	 * public String getCodContoEconomico() { return codContoEconomico; }
	 * 
	 * public String getDescCodContoEconomico() { return descCodContoEconomico;
	 * }
	 * 
	 * public String getCodCofog() { return codCofog; }
	 * 
	 * public String getCodTransazioneEuropeaSpesa() { return
	 * codTransazioneEuropeaSpesa; }
	 * 
	 * public String getDescTransazioneEuropeaSpesa() { return
	 * descTransazioneEuropeaSpesa; }
	 * 
	 * public String getCodSiope() { return codSiope; }
	 * 
	 * public String getDescCodSiope() { return descCodSiope; }
	 * 
	 * public String getCodRicorrenteSpesa() { return codRicorrenteSpesa; }
	 * 
	 * public String getCodCapitoloSanitarioSpesa() { return
	 * codCapitoloSanitarioSpesa; }
	 * 
	 * public String getCodPrgPolReg() { return codPrgPolReg; }
	 * 
	 * public String getCodClassGen11() { return codClassGen11; }
	 * 
	 * public String getCodClassGen12() { return codClassGen12; }
	 * 
	 * public String getCodClassGen13() { return codClassGen13; }
	 * 
	 * public String getCodClassGen14() { return codClassGen14; }
	 * 
	 * public String getCodClassGen15() { return codClassGen15; }
	 * 
	 * public Integer getIdPdc() { return idPdc; }
	 * 
	 * public Integer getIdSiope() { return idSiope; }
	 * 
	 * public Integer getIdContoEconomico() { return idContoEconomico; }
	 * 
	 * public void setCodMissione(String codMissione) { this.codMissione =
	 * codMissione; }
	 * 
	 * public void setCodProgramma(String codProgramma) { this.codProgramma =
	 * codProgramma; }
	 * 
	 * public void setDescProgramma(String descProgramma) { this.descProgramma =
	 * descProgramma; }
	 * 
	 * public void setCodPdc(String codPdc) { this.codPdc = codPdc; }
	 * 
	 * public void setDescPdc(String descPdc) { this.descPdc = descPdc; }
	 * 
	 * public void setCodContoEconomico(String codContoEconomico) {
	 * this.codContoEconomico = codContoEconomico; }
	 * 
	 * public void setDescCodContoEconomico(String descCodContoEconomico) {
	 * this.descCodContoEconomico = descCodContoEconomico; }
	 * 
	 * public void setCodCofog(String codCofog) { this.codCofog = codCofog; }
	 * 
	 * public void setCodTransazioneEuropeaSpesa(String
	 * codTransazioneEuropeaSpesa) { this.codTransazioneEuropeaSpesa =
	 * codTransazioneEuropeaSpesa; }
	 * 
	 * public void setDescTransazioneEuropeaSpesa(String
	 * descTransazioneEuropeaSpesa) { this.descTransazioneEuropeaSpesa =
	 * descTransazioneEuropeaSpesa; }
	 * 
	 * public void setCodSiope(String codSiope) { this.codSiope = codSiope; }
	 * 
	 * public void setDescCodSiope(String descCodSiope) { this.descCodSiope =
	 * descCodSiope; }
	 * 
	 * public void setCodRicorrenteSpesa(String codRicorrenteSpesa) {
	 * this.codRicorrenteSpesa = codRicorrenteSpesa; }
	 * 
	 * public void setCodCapitoloSanitarioSpesa(String
	 * codCapitoloSanitarioSpesa) { this.codCapitoloSanitarioSpesa =
	 * codCapitoloSanitarioSpesa; }
	 * 
	 * public void setCodPrgPolReg(String codPrgPolReg) { this.codPrgPolReg =
	 * codPrgPolReg; }
	 * 
	 * public void setCodClassGen11(String codClassGen11) { this.codClassGen11 =
	 * codClassGen11; }
	 * 
	 * public void setCodClassGen12(String codClassGen12) { this.codClassGen12 =
	 * codClassGen12; }
	 * 
	 * public void setCodClassGen13(String codClassGen13) { this.codClassGen13 =
	 * codClassGen13; }
	 * 
	 * public void setCodClassGen14(String codClassGen14) { this.codClassGen14 =
	 * codClassGen14; }
	 * 
	 * public void setCodClassGen15(String codClassGen15) { this.codClassGen15 =
	 * codClassGen15; }
	 * 
	 * public void setIdPdc(Integer idPdc) { this.idPdc = idPdc; }
	 * 
	 * public void setIdSiope(Integer idSiope) { this.idSiope = idSiope; }
	 * 
	 * public void setIdContoEconomico(Integer idContoEconomico) {
	 * this.idContoEconomico = idContoEconomico; }
	 */

	public Date getDataAnnullamento() {
		return dataAnnullamento;
	}

	public void setDataAnnullamento(Date dataAnnullamento) {
		this.dataAnnullamento = dataAnnullamento;
	}

	public BigDecimal getDisponibilitaPagare() {
		return disponibilitaPagare;
	}

	public void setDisponibilitaPagare(BigDecimal disponibilitaPagare) {
		this.disponibilitaPagare = disponibilitaPagare;
	}

	public Integer getSedeSecondariaSoggetto() {
		return sedeSecondariaSoggetto;
	}

	public void setSedeSecondariaSoggetto(Integer sedeSecondariaSoggetto) {
		this.sedeSecondariaSoggetto = sedeSecondariaSoggetto;
	}

	public BigDecimal getImportoLiquidazioneDaAggiornare() {
		return importoLiquidazioneDaAggiornare;
	}

	public void setImportoLiquidazioneDaAggiornare(
			BigDecimal importoLiquidazioneDaAggiornare) {
		this.importoLiquidazioneDaAggiornare = importoLiquidazioneDaAggiornare;
	}

	public String getStatoOperativoAttoAmmDaAggiornare() {
		return statoOperativoAttoAmmDaAggiornare;
	}

	public void setStatoOperativoAttoAmmDaAggiornare(
			String statoOperativoAttoAmmDaAggiornare) {
		this.statoOperativoAttoAmmDaAggiornare = statoOperativoAttoAmmDaAggiornare;
	}

	public StatoOperativoLiquidazione getStatoOperativoLiquidazioneDaAggiornare() {
		return statoOperativoLiquidazioneDaAggiornare;
	}

	public void setStatoOperativoLiquidazioneDaAggiornare(
			StatoOperativoLiquidazione statoOperativoLiquidazioneDaAggiornare) {
		this.statoOperativoLiquidazioneDaAggiornare = statoOperativoLiquidazioneDaAggiornare;
	}

	public String getLiqAutomaticaDaAggiornare() {
		return liqAutomaticaDaAggiornare;
	}

	public void setLiqAutomaticaDaAggiornare(String liqAutomaticaDaAggiornare) {
		this.liqAutomaticaDaAggiornare = liqAutomaticaDaAggiornare;
	}

	public String getLiqManualeDaAggiornare() {
		return liqManualeDaAggiornare;
	}

	public void setLiqManualeDaAggiornare(String liqManualeDaAggiornare) {
		this.liqManualeDaAggiornare = liqManualeDaAggiornare;
	}

	public Integer getAnnoAttoAmmDaAggiornare() {
		return annoAttoAmmDaAggiornare;
	}

	public void setAnnoAttoAmmDaAggiornare(Integer annoAttoAmmDaAggiornare) {
		this.annoAttoAmmDaAggiornare = annoAttoAmmDaAggiornare;
	}

	public Integer getNumeroAttoAmmDaAggiornare() {
		return numeroAttoAmmDaAggiornare;
	}

	public void setNumeroAttoAmmDaAggiornare(Integer numeroAttoAmmDaAggiornare) {
		this.numeroAttoAmmDaAggiornare = numeroAttoAmmDaAggiornare;
	}

	public String getCodiceTipoAttoAmmDaAggiornare() {
		return codiceTipoAttoAmmDaAggiornare;
	}

	public void setCodiceTipoAttoAmmDaAggiornare(
			String codiceTipoAttoAmmDaAggiornare) {
		this.codiceTipoAttoAmmDaAggiornare = codiceTipoAttoAmmDaAggiornare;
	}

	public String getCodiceStatoOperativoLiquidazione() {
		return codiceStatoOperativoLiquidazione;
	}

	public void setCodiceStatoOperativoLiquidazione(
			String codiceStatoOperativoLiquidazione) {
		this.codiceStatoOperativoLiquidazione = codiceStatoOperativoLiquidazione;
	}

	public List<OrdinativoPagamento> getListaOrdinativi() {
		return listaOrdinativi;
	}

	public void setListaOrdinativi(List<OrdinativoPagamento> listaOrdinativi) {
		this.listaOrdinativi = listaOrdinativi;
	}

	public SubdocumentoSpesa getSubdocumentoSpesa() {
		return subdocumentoSpesa;
	}

	public void setSubdocumentoSpesa(SubdocumentoSpesa subdocumentoSpesa) {
		this.subdocumentoSpesa = subdocumentoSpesa;
	}

	public boolean isForza() {
		return forza;
	}

	public void setForza(boolean forza) {
		this.forza = forza;
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

}