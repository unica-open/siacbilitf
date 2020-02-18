/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ordinativo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacbilser.model.ClassificatoreStipendi;
import it.csi.siac.siacfinser.model.ContoTesoreria;
import it.csi.siac.siacfinser.model.Distinta;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.TransazioneElementare;
import it.csi.siac.siacfinser.model.codifiche.CodiceBollo;
import it.csi.siac.siacfinser.model.codifiche.NoteTesoriere;
import it.csi.siac.siacfinser.model.codifiche.TipoAvviso;
import it.csi.siac.siacfinser.model.provvisoriDiCassa.ProvvisorioDiCassa;
import it.csi.siac.siacfinser.model.siopeplus.SiopeAssenzaMotivazione;
import it.csi.siac.siacfinser.model.siopeplus.SiopeTipoDebito;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Ordinativo  extends TransazioneElementare {
	
	
	private static final long serialVersionUID = 1L;
	
	protected Date dataCreazioneSupport;
	
	private BigDecimal idOrdinativo;
	private Integer annoBilancio;
	private Date dataVariazione;
	private Date dataSpostamento;
	private String note;
	private boolean flagAllegatoCartaceo;
	private boolean flagBeneficiMultiplo;
	
	private String loginCancellazione;
	private String loginModifica;
	
	private Integer anno;
	private Integer numero;
	
	private String descrizione;
	private Date dataEmissione;
	
	private BigDecimal castellettoCompentenza;
	private BigDecimal castellettoEmessi;
	private BigDecimal castellettoCassa;
	private String loginCreazione;
	
	private BigDecimal importoOrdinativo;
	private BigDecimal importoRegolarizzato;

	private boolean flagCopertura;
	private String competenza;
	
	private Boolean flagDaTrasmettere;

	//nuovi campi per siope plus:

	//assenza motivazione cig:
	private SiopeAssenzaMotivazione siopeAssenzaMotivazione;
	
	//tipo debito siope:
	private SiopeTipoDebito siopeTipoDebito;
	
	private StatoOperativoOrdinativo statoOperativoOrdinativo;
	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum StatoOperativoOrdinativo{
		INSERITO, TRASMESSO, FIRMATO, QUIETANZATO, ANNULLATO
	}
	private String codStatoOperativoOrdinativo;
	
	private ContoTesoreria contoTesoreria;
	
	private Distinta distinta;
	
	private TipoAvviso tipoAvviso;
	
	private CodiceBollo codiceBollo;
	
	private NoteTesoriere noteTesoriere;
	
	private BigDecimal totImportiProvvisori;
	private BigDecimal totImportiRegolarizzati;

	// CLASSIFICAZIONE FINANZIARIA GESTIONE

//	private String codificaTransazioneElementare;
	
//	private String codRicorrente, descRicorrente, codMissione, codProgramma, descProgramma, codPdc, descPdc, codContoEconomico, descCodContoEconomico, codCofog, codTransazioneEuropeaSpesa, descTransazioneEuropeaSpesa, codSiope, descCodSiope, codRicorrenteSpesa, codCapitoloSanitarioSpesa, codPrgPolReg;
	
	// atto amministrativo
	private AttoAmministrativo attoAmministrativo;
	private Soggetto soggetto;
	
	private TipoAssociazioneEmissione tipoAssociazioneEmissione;
	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum TipoAssociazioneEmissione{
		SUB_ORD, RIT_ORD, SOS_ORD, SPR, REI_ORD
	}
	
	private SubOrdinativo subOrdinativo;
	
	private DatiOrdinativoTrasmesso datiOrdinativoTrasmesso;
	
	private Date dataModifica;
	
	private Date dataInizioValidita;
	
	private List<RegolarizzazioneProvvisorio> elencoRegolarizzazioneProvvisori;
	
	/**
	 * Quelli ord_id_da verso ord_id_a
	 */
	private List<Ordinativo> elencoOrdinativiCollegati;
	
	private Integer totaleOrdinativiCollegati;
	
	/**
	 *  Quelli ord_id_a verso ord_id_da
	 */
	private List<Ordinativo> elencoOrdinativiACuiSonoCollegato;

	
	private boolean forza = false;
	//SIAC-6206
	private ClassificatoreStipendi classificatoreStipendi;
	
	@Deprecated
	List<ProvvisorioDiCassa> elencoProvvisoriDiCassa;
			
	@Deprecated
	public List<ProvvisorioDiCassa> getElencoProvvisoriDiCassa() {
		return elencoProvvisoriDiCassa;
	}

	@Deprecated
	public void setElencoProvvisoriDiCassa(
			List<ProvvisorioDiCassa> elencoProvvisoriDiCassa) {
		this.elencoProvvisoriDiCassa = elencoProvvisoriDiCassa;
	}

	public Integer getAnnoBilancio() {
		return annoBilancio;
	}

	public void setAnnoBilancio(Integer annoBilancio) {
		this.annoBilancio = annoBilancio;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataVariazione() {
		return dataVariazione;
	}

	public void setDataVariazione(Date dataVariazione) {
		this.dataVariazione = dataVariazione;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataSpostamento() {
		return dataSpostamento;
	}


	public void setDataSpostamento(Date dataSpostamento) {
		this.dataSpostamento = dataSpostamento;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isFlagAllegatoCartaceo() {
		return flagAllegatoCartaceo;
	}

	public void setFlagAllegatoCartaceo(boolean flagAllegatoCartaceo) {
		this.flagAllegatoCartaceo = flagAllegatoCartaceo;
	}

	public boolean isFlagBeneficiMultiplo() {
		return flagBeneficiMultiplo;
	}

	public void setFlagBeneficiMultiplo(boolean flagBeneficiMultiplo) {
		this.flagBeneficiMultiplo = flagBeneficiMultiplo;
	}

	public String getLoginCancellazione() {
		return loginCancellazione;
	}

	public void setLoginCancellazione(String loginCancellazione) {
		this.loginCancellazione = loginCancellazione;
	}

	public String getLoginModifica() {
		return loginModifica;
	}

	public void setLoginModifica(String loginModifica) {
		this.loginModifica = loginModifica;
	}

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Date getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(Date dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	public BigDecimal getCastellettoCompentenza() {
		return castellettoCompentenza;
	}

	public void setCastellettoCompentenza(BigDecimal castellettoCompentenza) {
		this.castellettoCompentenza = castellettoCompentenza;
	}

	public BigDecimal getCastellettoEmessi() {
		return castellettoEmessi;
	}

	public void setCastellettoEmessi(BigDecimal castellettoEmessi) {
		this.castellettoEmessi = castellettoEmessi;
	}

	public BigDecimal getCastellettoCassa() {
		return castellettoCassa;
	}

	public void setCastellettoCassa(BigDecimal castellettoCassa) {
		this.castellettoCassa = castellettoCassa;
	}

	public String getLoginCreazione() {
		return loginCreazione;
	}

	public void setLoginCreazione(String loginCreazione) {
		this.loginCreazione = loginCreazione;
	}

	public BigDecimal getImportoOrdinativo() {
		return importoOrdinativo;
	}

	public void setImportoOrdinativo(BigDecimal importoOrdinativo) {
		this.importoOrdinativo = importoOrdinativo;
	}

	public boolean isFlagCopertura() {
		return flagCopertura;
	}

	public void setFlagCopertura(boolean flagCopertura) {
		this.flagCopertura = flagCopertura;
	}

	public String getCompetenza() {
		return competenza;
	}

	public void setCompetenza(String competenza) {
		this.competenza = competenza;
	}

	public StatoOperativoOrdinativo getStatoOperativoOrdinativo() {
		return statoOperativoOrdinativo;
	}

	public void setStatoOperativoOrdinativo(
			StatoOperativoOrdinativo statoOperativoOrdinativo) {
		this.statoOperativoOrdinativo = statoOperativoOrdinativo;
	}

	public ContoTesoreria getContoTesoreria() {
		return contoTesoreria;
	}

	public void setContoTesoreria(ContoTesoreria contoTesoreria) {
		this.contoTesoreria = contoTesoreria;
	}

	public Distinta getDistinta() {
		return distinta;
	}

	public void setDistinta(Distinta distinta) {
		this.distinta = distinta;
	}

	public TipoAvviso getTipoAvviso() {
		return tipoAvviso;
	}

	public void setTipoAvviso(TipoAvviso tipoAvviso) {
		this.tipoAvviso = tipoAvviso;
	}

	public CodiceBollo getCodiceBollo() {
		return codiceBollo;
	}

	public void setCodiceBollo(CodiceBollo codiceBollo) {
		this.codiceBollo = codiceBollo;
	}

	public NoteTesoriere getNoteTesoriere() {
		return noteTesoriere;
	}

	public void setNoteTesoriere(NoteTesoriere noteTesoriere) {
		this.noteTesoriere = noteTesoriere;
	}

	public List<RegolarizzazioneProvvisorio> getElencoRegolarizzazioneProvvisori() {
		return elencoRegolarizzazioneProvvisori;
	}

	public void setElencoRegolarizzazioneProvvisori(
			List<RegolarizzazioneProvvisorio> elencoRegolarizzazioneProvvisori) {
		this.elencoRegolarizzazioneProvvisori = elencoRegolarizzazioneProvvisori;
	}

	public List<Ordinativo> getElencoOrdinativiCollegati() {
		return this.elencoOrdinativiCollegati;
	}

	public void setElencoOrdinativiCollegati(
			List<Ordinativo> elencoOrdinativiCollegati) {
		this.elencoOrdinativiCollegati = elencoOrdinativiCollegati;
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

	public TipoAssociazioneEmissione getTipoAssociazioneEmissione() {
		return tipoAssociazioneEmissione;
	}

	public void setTipoAssociazioneEmissione(
			TipoAssociazioneEmissione tipoAssociazioneEmissione) {
		this.tipoAssociazioneEmissione = tipoAssociazioneEmissione;
	}

	public SubOrdinativo getSubOrdinativo() {
		return subOrdinativo;
	}

	public void setSubOrdinativo(SubOrdinativo subOrdinativo) {
		this.subOrdinativo = subOrdinativo;
	}

	public DatiOrdinativoTrasmesso getDatiOrdinativoTrasmesso() {
		return datiOrdinativoTrasmesso;
	}

	public void setDatiOrdinativoTrasmesso(
			DatiOrdinativoTrasmesso datiOrdinativoTrasmesso) {
		this.datiOrdinativoTrasmesso = datiOrdinativoTrasmesso;
	}

	public BigDecimal getIdOrdinativo() {
		return idOrdinativo;
	}

	public void setIdOrdinativo(BigDecimal idOrdinativo) {
		this.idOrdinativo = idOrdinativo;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataModifica() {
	    return dataModifica;
	}

	public void setDataModifica(Date dataModifica) {
	    this.dataModifica = dataModifica;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataInizioValidita() {
	    return dataInizioValidita;
	}

	public void setDataInizioValidita(Date dataInizioValidita) {
	    this.dataInizioValidita = dataInizioValidita;
	}

	public String getCodStatoOperativoOrdinativo() {
		return codStatoOperativoOrdinativo;
	}

	public void setCodStatoOperativoOrdinativo(String codStatoOperativoOrdinativo) {
		this.codStatoOperativoOrdinativo = codStatoOperativoOrdinativo;
	}

	public Date getDataCreazioneSupport() {
		return dataCreazioneSupport;
	}

	public void setDataCreazioneSupport(Date dataCreazioneSupport) {
		this.dataCreazioneSupport = dataCreazioneSupport;
	}

	public BigDecimal getTotImportiProvvisori() {
		return totImportiProvvisori;
	}

	public void setTotImportiProvvisori(BigDecimal totImportiProvvisori) {
		this.totImportiProvvisori = totImportiProvvisori;
	}

	public BigDecimal getTotImportiRegolarizzati() {
		return totImportiRegolarizzati;
	}

	public void setTotImportiRegolarizzati(BigDecimal totImportiRegolarizzati) {
		this.totImportiRegolarizzati = totImportiRegolarizzati;
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

	public List<Ordinativo> getElencoOrdinativiACuiSonoCollegato() {
		return elencoOrdinativiACuiSonoCollegato;
	}

	public void setElencoOrdinativiACuiSonoCollegato(List<Ordinativo> elencoOrdinativiACuiSonoCollegato) {
		this.elencoOrdinativiACuiSonoCollegato = elencoOrdinativiACuiSonoCollegato;
	}

	public BigDecimal getImportoRegolarizzato() {
		return importoRegolarizzato;
	}

	public void setImportoRegolarizzato(BigDecimal importoRegolarizzato) {
		this.importoRegolarizzato = importoRegolarizzato;
	}

	public boolean isDaTrasmettere() {
		return flagDaTrasmettere == null || flagDaTrasmettere.booleanValue();
	}

	public Boolean getFlagDaTrasmettere() {
		return flagDaTrasmettere;
	}

	public void setFlagDaTrasmettere(Boolean flagDaTrasmettere) {
		this.flagDaTrasmettere = flagDaTrasmettere;
	}

	public void setDaTrasmettere(Boolean flagDaTrasmettere) {
		this.flagDaTrasmettere = flagDaTrasmettere == null ? Boolean.TRUE : flagDaTrasmettere;
	}

	/**
	 * @return the classificatoreStipendi
	 */
	public ClassificatoreStipendi getClassificatoreStipendi() {
		return classificatoreStipendi;
	}

	/**
	 * @param classificatoreStipendi the classificatoreStipendi to set
	 */
	public void setClassificatoreStipendi(ClassificatoreStipendi classificatoreStipendi) {
		this.classificatoreStipendi = classificatoreStipendi;
	}

	public Integer getTotaleOrdinativiCollegati() {
		return totaleOrdinativiCollegati;
	}

	public void setTotaleOrdinativiCollegati(Integer totaleOrdinativiCollegati) {
		this.totaleOrdinativiCollegati = totaleOrdinativiCollegati;
	}
	
	
}
