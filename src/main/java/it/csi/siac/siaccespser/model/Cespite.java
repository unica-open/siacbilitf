/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.EntitaExt;


/**
 * Cespiti
 * @author 71027
 * @version 1.0
 * @created 31-giu-2018
 */
@XmlType(namespace = CESPDataDictionary.NAMESPACE)
public class Cespite extends EntitaExt {

	/** Per la serializzazione */
	private static final long serialVersionUID = -918940173366942960L;
	
	private String codice;
	private String descrizione;
	private String numeroInventario;
	private Date dataAccessoInventario;
	private Date dataCessazione;
	private BigDecimal valoreIniziale;
	private BigDecimal valoreAttuale;
	private Boolean flagSoggettoTutelaBeniCulturali;
	private Boolean flagStatoBene;
	private String descrizioneStato;
	private String ubicazione;
	private String note;
	private Boolean flgDonazioneRinvenimento;
	
	private Ente ente;
	private TipoBeneCespite tipoBeneCespite;
	private ClassificazioneGiuridicaCespite classificazioneGiuridicaCespite;
	
	private DismissioneCespite dismissioneCespite;
	
	// SIAC-6374
	private String numeroInventarioPrefisso;
	private Integer numeroInventarioNumero;
	
	private BigDecimal fondoAmmortamento;
	
	private Boolean isCollegatoAPrimeNote;
	
	private AmmortamentoAnnuoCespite ammortamentoAnnuoCespite;
	
	private Boolean inserimentoContestualeRegistroA;
	private BigDecimal importoSuRegistroA;	
	private Integer uidPrimaNotaRegistroAFiltro;

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return this.codice;
	}
	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return this.descrizione;
	}
	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
	 * @return the numeroInventario
	 */
	public String getNumeroInventario() {
		return this.numeroInventario;
	}
	/**
	 * @param numeroInventario the numeroInventario to set
	 */
	public void setNumeroInventario(String numeroInventario) {
		this.numeroInventario = numeroInventario;
	}
	/**
	 * @return the dataAccessoInventario
	 */
	public Date getDataAccessoInventario() {
		return this.dataAccessoInventario;
	}
	/**
	 * @param dataAccessoInventario the dataAccessoInventario to set
	 */
	public void setDataAccessoInventario(Date dataAccessoInventario) {
		this.dataAccessoInventario = dataAccessoInventario;
	}
	/**
	 * @return the dataCessazione
	 */
	public Date getDataCessazione() {
		return dataCessazione;
	}
	/**
	 * @param dataCessazione the dataCessazione to set
	 */
	public void setDataCessazione(Date dataCessazione) {
		this.dataCessazione = dataCessazione;
	}
	/**
	 * @return the valoreIniziale
	 */
	public BigDecimal getValoreIniziale() {
		return this.valoreIniziale;
	}
	/**
	 * @param valoreIniziale the valoreIniziale to set
	 */
	public void setValoreIniziale(BigDecimal valoreIniziale) {
		this.valoreIniziale = valoreIniziale;
	}
	/**
	 * @return the valoreAttuale
	 */
	public BigDecimal getValoreAttuale() {
		return this.valoreAttuale;
	}
	/**
	 * @param valoreAttuale the valoreAttuale to set
	 */
	public void setValoreAttuale(BigDecimal valoreAttuale) {
		this.valoreAttuale = valoreAttuale;
	}
	/**
	 * @return the flagSoggettoTutelaBeniCulturali
	 */
	public Boolean getFlagSoggettoTutelaBeniCulturali() {
		return this.flagSoggettoTutelaBeniCulturali;
	}
	/**
	 * @param flagSoggettoTutelaBeniCulturali the flagSoggettoTutelaBeniCulturali to set
	 */
	public void setFlagSoggettoTutelaBeniCulturali(Boolean flagSoggettoTutelaBeniCulturali) {
		this.flagSoggettoTutelaBeniCulturali = flagSoggettoTutelaBeniCulturali;
	}
	/**
	 * @return the flagStatoBene
	 */
	public Boolean getFlagStatoBene() {
		return this.flagStatoBene;
	}
	/**
	 * @param flagStatoBene the flagStatoBene to set
	 */
	public void setFlagStatoBene(Boolean flagStatoBene) {
		this.flagStatoBene = flagStatoBene;
	}
	/**
	 * @return the descrizioneStato
	 */
	public String getDescrizioneStato() {
		return this.descrizioneStato;
	}
	/**
	 * @param descrizioneStato the descrizioneStato to set
	 */
	public void setDescrizioneStato(String descrizioneStato) {
		this.descrizioneStato = descrizioneStato;
	}
	/**
	 * @return the ubicazione
	 */
	public String getUbicazione() {
		return this.ubicazione;
	}
	/**
	 * @param ubicazione the ubicazione to set
	 */
	public void setUbicazione(String ubicazione) {
		this.ubicazione = ubicazione;
	}
	/**
	 * @return the note
	 */
	public String getNote() {
		return this.note;
	}
	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * @return the flgDonazioneRinvenimento
	 */
	public Boolean getFlgDonazioneRinvenimento() {
		return this.flgDonazioneRinvenimento;
	}
	/**
	 * @param flgDonazioneRinvenimento the flgDonazioneRinvenimento to set
	 */
	public void setFlgDonazioneRinvenimento(Boolean flgDonazioneRinvenimento) {
		this.flgDonazioneRinvenimento = flgDonazioneRinvenimento;
	}
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return this.ente;
	}
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	/**
	 * @return the tipoBeneCespite
	 */
	public TipoBeneCespite getTipoBeneCespite() {
		return this.tipoBeneCespite;
	}
	/**
	 * @param tipoBeneCespite the tipoBeneCespite to set
	 */
	public void setTipoBeneCespite(TipoBeneCespite tipoBeneCespite) {
		this.tipoBeneCespite = tipoBeneCespite;
	}
	/**
	 * @return the classificazioneGiuridicaCespite
	 */
	public ClassificazioneGiuridicaCespite getClassificazioneGiuridicaCespite() {
		return this.classificazioneGiuridicaCespite;
	}
	/**
	 * @param classificazioneGiuridicaCespite the classificazioneGiuridicaCespite to set
	 */
	public void setClassificazioneGiuridicaCespite(ClassificazioneGiuridicaCespite classificazioneGiuridicaCespite) {
		this.classificazioneGiuridicaCespite = classificazioneGiuridicaCespite;
	}
	
	/**
	 * @return the numeroInventarioPrefisso
	 */
	public String getNumeroInventarioPrefisso() {
		return this.numeroInventarioPrefisso;
	}
	/**
	 * @param numeroInventarioPrefisso the numeroInventarioPrefisso to set
	 */
	public void setNumeroInventarioPrefisso(String numeroInventarioPrefisso) {
		this.numeroInventarioPrefisso = numeroInventarioPrefisso;
	}
	/**
	 * @return the numeroInventarioNumero
	 */
	public Integer getNumeroInventarioNumero() {
		return this.numeroInventarioNumero;
	}
	/**
	 * @param numeroInventarioNumero the numeroInventarioNumero to set
	 */
	public void setNumeroInventarioNumero(Integer numeroInventarioNumero) {
		this.numeroInventarioNumero = numeroInventarioNumero;
	}
	/**
	 * @return the fondoAmmortamento
	 */
	public BigDecimal getFondoAmmortamento() {
		return fondoAmmortamento;
	}
	/**
	 * @param fondoAmmortamento the fondoAmmortamento to set
	 */
	public void setFondoAmmortamento(BigDecimal fondoAmmortamento) {
		this.fondoAmmortamento = fondoAmmortamento;
	}
	
	/**
	 * @return the dismissione
	 */
	public DismissioneCespite getDismissioneCespite() {
		return dismissioneCespite;
	}
	/**
	 * @param dismissione the dismissione to set
	 */
	public void setDismissioneCespite(DismissioneCespite dismissione) {
		this.dismissioneCespite = dismissione;
	}
	
	/**
	 * @return the collegatoPrimeNote
	 */
	public Boolean getIsCollegatoPrimeNote() {
		return isCollegatoAPrimeNote;
	}
	
	/**
	 * Sets the checks if is collegato prime note.
	 *
	 * @param isCollegatoAPrimeNote the new checks if is collegato prime note
	 */
	public void setIsCollegatoPrimeNote(Boolean isCollegatoAPrimeNote) {
		this.isCollegatoAPrimeNote = isCollegatoAPrimeNote;
	}
	/**
	 * Gets the valore attuale not null.
	 *
	 * @return the valore attuale not null, zero altrimenti
	 */
	public BigDecimal getValoreAttualeNotNull() {
		return getValoreAttuale() != null? getValoreAttuale() : BigDecimal.ZERO;
	}
	
	/**
	 * @return the residuoAmmortamento
	 */
	public BigDecimal getResiduoAmmortamento() {
		return getFondoAmmortamento()!= null? getValoreAttualeNotNull().subtract(getFondoAmmortamento()) : null;
	}
	/**
	 * @return the ammortamentoAnnuoCespite
	 */
	public AmmortamentoAnnuoCespite getAmmortamentoAnnuoCespite() {
		return ammortamentoAnnuoCespite;
	}
	/**
	 * @param ammortamentoAnnuoCespite the ammortamentoAnnuoCespite to set
	 */
	public void setAmmortamentoAnnuoCespite(AmmortamentoAnnuoCespite ammortamentoAnnuoCespite) {
		this.ammortamentoAnnuoCespite = ammortamentoAnnuoCespite;
	}
	/**
	 * @return the inserimentoContestualeRegistroA
	 */
	public Boolean getInserimentoContestualeRegistroA() {
		return inserimentoContestualeRegistroA;
	}
	/**
	 * @param inserimentoContestualeRegistroA the inserimentoContestualeRegistroA to set
	 */
	public void setInserimentoContestualeRegistroA(Boolean inserimentoContestualeRegistroA) {
		this.inserimentoContestualeRegistroA = inserimentoContestualeRegistroA;
	}
	/**
	 * @return the valoreAttualeSuRegistroA
	 */
	public BigDecimal getImportoSuRegistroA() {
		return importoSuRegistroA;
	}
	
	/**
	 * Sets the importo su registro A.
	 *
	 * @param importoSuRegistroA the new importo su registro A
	 */
	public void setImportoSuRegistroA(BigDecimal importoSuRegistroA) {
		this.importoSuRegistroA = importoSuRegistroA;
	}
	/**
	 * @return the uidPrimaNotaRegistroAFiltro
	 */
	public Integer getUidPrimaNotaRegistroAFiltro() {
		return uidPrimaNotaRegistroAFiltro;
	}
	/**
	 * @param uidPrimaNotaRegistroAFiltro the uidPrimaNotaRegistroAFiltro to set
	 */
	public void setUidPrimaNotaRegistroAFiltro(Integer uidPrimaNotaRegistroAFiltro) {
		this.uidPrimaNotaRegistroAFiltro = uidPrimaNotaRegistroAFiltro;
	}
	
	
	
	
}