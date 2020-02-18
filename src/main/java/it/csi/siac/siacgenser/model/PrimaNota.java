/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Ambito;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.EntitaExt;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
/**

 * @version 1.0
 * @created 14-apr-2015
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class PrimaNota extends EntitaExt{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8674567327792375593L;

	private Ente ente;
	private Bilancio bilancio;

	private Integer numero;
	private String descrizione;
	private Date dataRegistrazione;
	private Integer numeroRegistrazioneLibroGiornale;
	private Date dataRegistrazioneLibroGiornale;	
	private StatoOperativoPrimaNota statoOperativoPrimaNota;
	private TipoCausale tipoCausale;	
	//dovrebbe essere sempre 1 solo tranne alcuni casi, come per esempio per documenti/quote
	private List<MovimentoEP> listaMovimentiEP = new ArrayList<MovimentoEP>();	
	// Lotto N
	private Ambito ambito;	
	private String noteCollegamento;
	private TipoRelazionePrimaNota tipoRelazionePrimaNota;
	private List<PrimaNota> listaPrimaNotaPadre = new ArrayList<PrimaNota>();
	private List<PrimaNota> listaPrimaNotaFiglia = new ArrayList<PrimaNota>();
	
	@XmlElementWrapper(name = "listaRateoRisconto")
	@XmlElements({
		@XmlElement(name="rateo", type=Rateo.class),
		@XmlElement(name="risconto", type=Risconto.class),
		@XmlElement(name="rateoRisconto", type=RateoRisconto.class),
	})
	private List<RateoRisconto> listaRateoRisconto = new ArrayList<RateoRisconto>();

	private Soggetto soggetto;

	//SIAC-4644
	private Boolean isCollegataAMovimentoResiduo;
	// SIAC-5336
	private ClassificatoreGSA classificatoreGSA;
	
	private StatoAccettazionePrimaNotaDefinitiva statoAccettazionePrimaNotaDefinitiva;
	private StatoAccettazionePrimaNotaProvvisoria statoAccettazionePrimaNotaProvvisoria;
	
	/* ************************************************* */
	// Campi d'appoggio per le ricerche sintetiche
	private Conto contoInventario;
	private PrimaNota primaNotaInventario;
	
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
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
	 * @return the dataRegistrazione
	 */
	public Date getDataRegistrazione() {
		return dataRegistrazione;
	}
	/**
	 * @param dataRegistrazione the dataRegistrazione to set
	 */
	public void setDataRegistrazione(Date dataRegistrazione) {
		this.dataRegistrazione = dataRegistrazione;
	}
	/**
	 * @return the numeroRegistrazioneLibroGiornale
	 */
	public Integer getNumeroRegistrazioneLibroGiornale() {
		return numeroRegistrazioneLibroGiornale;
		
	}
	/**
	 * @param numeroRegistrazioneLibroGiornale the numeroRegistrazioneLibroGiornale to set
	 */
	public void setNumeroRegistrazioneLibroGiornale(
			Integer numeroRegistrazioneLibroGiornale) {
		this.numeroRegistrazioneLibroGiornale = numeroRegistrazioneLibroGiornale;
	}
	/**
	 * @return the dataRegistrazioneLibroGiornale
	 */
	public Date getDataRegistrazioneLibroGiornale() {
		return dataRegistrazioneLibroGiornale;
	}
	/**
	 * @param dataRegistrazioneLibroGiornale the dataRegistrazioneLibroGiornale to set
	 */
	public void setDataRegistrazioneLibroGiornale(
			Date dataRegistrazioneLibroGiornale) {
		this.dataRegistrazioneLibroGiornale = dataRegistrazioneLibroGiornale;
	}
	/**
	 * @return the statoOperativoPrimaNota
	 */
	public StatoOperativoPrimaNota getStatoOperativoPrimaNota() {
		return statoOperativoPrimaNota;
	}
	/**
	 * @param statoOperativoPrimaNota the statoOperativoPrimaNota to set
	 */
	public void setStatoOperativoPrimaNota(
			StatoOperativoPrimaNota statoOperativoPrimaNota) {
		this.statoOperativoPrimaNota = statoOperativoPrimaNota;
	}
	
	/**
	 * @return the tipoCausale
	 */
	public TipoCausale getTipoCausale() {
		return tipoCausale;
	}
	/**
	 * @param tipoCausale the tipoCausale to set
	 */
	public void setTipoCausale(TipoCausale tipoCausale) {
		this.tipoCausale = tipoCausale;
	}
	/**
	 * @return the listaMovimentiEP
	 */
	public List<MovimentoEP> getListaMovimentiEP() {
		return listaMovimentiEP;
	}
	/**
	 * @param listaMovimentiEP the listaMovimentiEP to set
	 */
	public void setListaMovimentiEP(List<MovimentoEP> listaMovimentiEP) {
		this.listaMovimentiEP = listaMovimentiEP!=null?listaMovimentiEP:new ArrayList<MovimentoEP>();
	}
	/**
	 * Gets the data creazione prima nota
	 *
	 * @return the data creazione cprima nota
	 */
	public Date getDataCreazionePrimaNota() {
		return super.getDataCreazione();
	}
	/**
	 * Sets the data creazione prima nota
	 *
	 * @param dataCreazione the new data creazione prima nota
	 */
	public void setDataCreazionePrimaNota(Date dataCreazione) {
		super.setDataCreazione(dataCreazione);
	}
	/**
	 * Gets the data modifica prima nota
	 *
	 * @return the data modifica prima nota
	 */
	public Date getDataModificaPrimaNota() {
		return super.getDataModifica();
	}
	/**
	 * Sets the data modifica prima nota
	 *
	 * @param dataModifica the new data modifica prima nota
	 */
	public void setDataModificaPrimaNota(Date dataModifica) {
		super.setDataModifica(dataModifica);
	}
	/**
	 * @return the ambito
	 */
	public Ambito getAmbito() {
		return ambito;
	}
	/**
	 * @param ambito the ambito to set
	 */
	public void setAmbito(Ambito ambito) {
		this.ambito = ambito;
	}
	/**
	 * @return the noteCollegamento
	 */
	public String getNoteCollegamento() {
		return noteCollegamento;
	}
	/**
	 * @param noteCollegamento the noteCollegamento to set
	 */
	public void setNoteCollegamento(String noteCollegamento) {
		this.noteCollegamento = noteCollegamento;
	}
	/**
	 * @return the tipoRelazionePrimaNota
	 */
	public TipoRelazionePrimaNota getTipoRelazionePrimaNota() {
		return tipoRelazionePrimaNota;
	}
	/**
	 * @param tipoRelazionePrimaNota the tipoRelazionePrimaNota to set
	 */
	public void setTipoRelazionePrimaNota(TipoRelazionePrimaNota tipoRelazionePrimaNota) {
		this.tipoRelazionePrimaNota = tipoRelazionePrimaNota;
	}
	/**
	 * @return the listaPrimaNotaPadre
	 */
	public List<PrimaNota> getListaPrimaNotaPadre() {
		return listaPrimaNotaPadre;
	}
	/**
	 * @param listaPrimaNotaPadre the listaPrimaNotaPadre to set
	 */
	public void setListaPrimaNotaPadre(List<PrimaNota> listaPrimaNotaPadre) {
		this.listaPrimaNotaPadre = listaPrimaNotaPadre;
	}
	/**
	 * @return the listaPrimaNotaFiglia
	 */
	public List<PrimaNota> getListaPrimaNotaFiglia() {
		return listaPrimaNotaFiglia;
	}
	/**
	 * @param listaPrimaNotaFiglia the listaPrimaNotaFiglia to set
	 */
	public void setListaPrimaNotaFiglia(List<PrimaNota> listaPrimaNotaFiglia) {
		this.listaPrimaNotaFiglia = listaPrimaNotaFiglia;
	}
	/**
	 * @return the listaRateoRisconto
	 */
	@XmlTransient
	public List<RateoRisconto> getListaRateoRisconto() {
		return listaRateoRisconto;
	}
	/**
	 * @param listaRateoRisconto the listaRateoRisconto to set
	 */
	public void setListaRateoRisconto(List<RateoRisconto> listaRateoRisconto) {
		this.listaRateoRisconto = listaRateoRisconto!=null?listaRateoRisconto:new ArrayList<RateoRisconto>();
	}
	
	/**
	 * aggiunge un RateoRisconto.
	 * 
	 * @param rateoRisconto
	 */
	public void addRateoRisconto(RateoRisconto rateoRisconto){
		getListaRateoRisconto().add(rateoRisconto);
	}
	
	/**
	 * Gets the lista rateo risconto.
	 *
	 * @param <T> the generic type
	 * @param c the c
	 * @return the lista rateo risconto
	 */
	@SuppressWarnings("unchecked")
	public <T extends RateoRisconto>  List<T> getListaRateoRisconto(Class<T> c){
		final List<T> result = new ArrayList<T>();
		for(RateoRisconto rateoRisconto : getListaRateoRisconto()){
			if(c.isInstance(rateoRisconto)){
				result.add((T)rateoRisconto);
			}
		}
		return result;
	}
	
	
	/**
	 * Gets the risconti.
	 *
	 * @return the risconti
	 */
	public List<Risconto> getRisconti(){
		return getListaRateoRisconto(Risconto.class);
	}
	
	/**
	 * Gets the ratei.
	 *
	 * @return the ratei
	 */
	public List<Rateo> getRatei(){
		return getListaRateoRisconto(Rateo.class);
	}
	
	/**
	 * Gets the rateo.
	 *
	 * @return the rateo
	 */
	public Rateo getRateo(){
		for(Rateo rateo : getRatei()){
			//Si presume di avere un solo Rateo;
			return rateo; 
		}
		return null;
	}
	
	/**
	 * Gets the soggetto.
	 * 
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return this.soggetto;
	}
	
	/**
	 * @param soggetto the soggetto to set
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}
	
	/**
	 * @return TRUE nel caso in cui la Prima Nota sia collegata ad un impegno o ad un accertamento residuo 
	 * (cio&eacute; con l'anno minore dell'anno di bilancio).
	 * 
	 */
	public Boolean getIsCollegataAMovimentoResiduo() {
		return isCollegataAMovimentoResiduo;
	}
	
	/**
	 * Imposta il valore per isCollegataAMovimentoResiduo
	 * 
	 * @param isCollegataAMovimentoResiduo
	 */
	public void setIsCollegataAMovimentoResiduo(Boolean isCollegataAMovimentoResiduo) {
		this.isCollegataAMovimentoResiduo = isCollegataAMovimentoResiduo;
	}
	/**
	 * @return the classificatoreGSA
	 */
	public ClassificatoreGSA getClassificatoreGSA() {
		return this.classificatoreGSA;
	}
	/**
	 * @param classificatoreGSA the classificatoreGSA to set
	 */
	public void setClassificatoreGSA(ClassificatoreGSA classificatoreGSA) {
		this.classificatoreGSA = classificatoreGSA;
	}
	/**
	 * @return the statoAccettazionePrimaNotaDefinitiva
	 */
	public StatoAccettazionePrimaNotaDefinitiva getStatoAccettazionePrimaNotaDefinitiva() {
		return statoAccettazionePrimaNotaDefinitiva;
	}
	/**
	 * @param statoAccettazionePrimaNotaDefinitiva the statoAccettazionePrimaNotaDefinitiva to set
	 */
	public void setStatoAccettazionePrimaNotaDefinitiva(StatoAccettazionePrimaNotaDefinitiva statoAccettazionePrimaNotaDefinitiva) {
		this.statoAccettazionePrimaNotaDefinitiva = statoAccettazionePrimaNotaDefinitiva;
	}
	/**
	 * @return the statoAccettazionePrimaNotaProvvisoria
	 */
	public StatoAccettazionePrimaNotaProvvisoria getStatoAccettazionePrimaNotaProvvisoria() {
		return statoAccettazionePrimaNotaProvvisoria;
	}
	/**
	 * @param statoAccettazionePrimaNotaProvvisoria the statoAccettazionePrimaNotaProvvisoria to set
	 */
	public void setStatoAccettazionePrimaNotaProvvisoria(StatoAccettazionePrimaNotaProvvisoria statoAccettazionePrimaNotaProvvisoria) {
		this.statoAccettazionePrimaNotaProvvisoria = statoAccettazionePrimaNotaProvvisoria;
	}
	/**
	 * @return the contoInventario
	 */
	public Conto getContoInventario() {
		return this.contoInventario;
	}
	/**
	 * @param contoInventario the contoInventario to set
	 */
	public void setContoInventario(Conto contoInventario) {
		this.contoInventario = contoInventario;
	}
	/**
	 * @return the primaNotaInventario
	 */
	public PrimaNota getPrimaNotaInventario() {
		return this.primaNotaInventario;
	}
	/**
	 * @param primaNotaInventario the primaNotaInventario to set
	 */
	public void setPrimaNotaInventario(PrimaNota primaNotaInventario) {
		this.primaNotaInventario = primaNotaInventario;
	}
	
}