/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.business.utility.DummyMapper;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siacfin2ser.model.AttivitaIva;

/**
 * Capitolo
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class Capitolo<IC extends ImportiCapitolo, ICE extends ImportiCapitolo> extends EntitaEnte {

	private static final long serialVersionUID = 4367279367824255538L;
	
	private Bilancio bilancio;

	private Integer annoCapitolo;
	private Integer numeroCapitolo;
	private Integer numeroArticolo;
	private Integer annoCreazioneCapitolo;
	private Date dataAnnullamento;
	private String descrizione;
	private BigDecimal disponibilitaVariare;
	private int uidCapitoloEquivalente;
	private int uidExCapitolo;
	private Integer exAnnoCapitolo;
	private Integer exArticolo;
	private Integer exCapitolo;
	private Boolean flagRilevanteIva;
	//Aggiunto 2014/10/27
	private Boolean flagImpegnabile;
	private BigDecimal fondoPluriennaleVinc;
	private BigDecimal fondoPluriennaleVincPrec;
	private String note;
	private StatoOperativoElementoDiBilancio statoOperativoElementoDiBilancio;
	// Campi non presenti su modello da CSI, ma presenti su CDU
	// Aggiunto RTI
	private Integer numeroUEB;
	// Aggiunto RTI
	private String descrizioneArticolo;
	// Aggiunto RTI
	private Integer exUEB;
	
	// Aggiunto RTI
	private TipoCapitolo tipoCapitolo;
	//Aggiunto 2014/10/27
	private CategoriaCapitolo categoriaCapitolo;
	
	// Aggiunto RTI
	private List<ClassificatoreGenerico> classificatoriGenerici = new ArrayList<ClassificatoreGenerico>();
	private TipoFondo tipoFondo;
	private TipoFinanziamento tipoFinanziamento;
	
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
	private ElementoPianoDeiConti elementoPianoDeiConti;
	
	private List<AttoDiLeggeCapitolo> listaAttiDiLeggeCapitolo = new ArrayList<AttoDiLeggeCapitolo>();
	
	private IC importiCapitolo;
	private ICE importiCapitoloEquivalente;
	private List<IC> listaImportiCapitolo = new ArrayList<IC>();
	
	// new 1.8.0
	private List<AttivitaIva> listaAttivitaIva = new ArrayList<AttivitaIva>();
	
	//task-55
	private Boolean flagNonInserireAllegatoA1;


	public Capitolo(){
		// Costruttore vuoto
	}
	
	public Capitolo(TipoCapitolo tipoCapitolo){
		this.tipoCapitolo = tipoCapitolo;
	}
	
	/**
	 * Ottiene una istanza del Capitolo del tipo specifico.
	 * Ad esempio se se tipo capitolo è: TipoCapitolo.CAPITOLO_USCITA_PREVISIONE verrà 
	 * restituita una istanza di CapitoloUscitaPrevisione 
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <TC extends Capitolo<?,?>> TC newSpecificInstanceByTipoCapitolo() {		
		final TipoCapitolo tc = getTipoCapitolo();
		if(tc==null){
			throw new IllegalArgumentException("Il tipo capitolo deve essere impostato.");
		}
		
		final TC cap = (TC) tc.newCapitoloInstance();		
		DummyMapper.mapNotNullNotEmpty(this, cap);
		return cap;
	}
	
	public String getNumeriCapitoloArticolo() {
		return getNumeroCapitolo() + "/" + getNumeroArticolo();
	}

	/**
	 * @deprecated @see getAnnoCapitoloArticolo
	 */
	@Deprecated
	public String getAnnoNumeroArticolo(){
		return getAnnoCapitolo()
			+"/"+getNumeroCapitolo()
			+"/"+getNumeroArticolo();
	}	

	public String getAnnoCapitoloArticolo(){
		return getAnnoNumeroArticolo();
	}	

	public String getAnnoNumeroArticoloUEB(){
		return getAnnoNumeroArticolo() +"/"+getNumeroUEB();
	}
	
	public String getDescBilancioAnnoNumeroArticolo(){
		// issue-13
		return  //getBilancioAnno() +"/"+
			getAnnoCapitolo()
			+"/"+getNumeroCapitolo()
			+"/"+getNumeroArticolo();
	}	
	
	public String getDescBilancioAnnoNumeroArticoloExCapitolo(){		
		// issue-13
		return //getBilancioAnno()+"/"+ 
		getExAnnoCapitolo()
		+"/"+getExCapitolo()
		+"/"+getExArticolo();
	}	
	
	public String getDescBilancioAnnoNumeroArticoloUEB(){
		return getDescBilancioAnnoNumeroArticolo() +"/"+getNumeroUEB();
	}
	
	public String getDescBilancioAnnoNumeroArticoloUEBExCapitolo(){
		return getDescBilancioAnnoNumeroArticoloExCapitolo() +"/"+getExUEB();
	}

	public StatoOperativoElementoDiBilancio getStatoOperativoElementoDiBilancio() {
		return statoOperativoElementoDiBilancio;
	}

	public void setStatoOperativoElementoDiBilancio(
			StatoOperativoElementoDiBilancio statoOperativoElementoDiBilancio) {
		this.statoOperativoElementoDiBilancio = statoOperativoElementoDiBilancio;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataAnnullamento() {
		return dataAnnullamento;
	}

	public void setDataAnnullamento(Date dataAnnullamento) {
		this.dataAnnullamento = dataAnnullamento;
	}

	public Integer getAnnoCapitolo() {
		return annoCapitolo;
	}

	/**
	 * Equivalente a impostare setBilancio().setAnno()
	 * @param annoCapitolo
	 */
	public void setAnnoCapitolo(Integer annoCapitolo) {
		this.annoCapitolo = annoCapitolo;
	}

	public Integer getNumeroArticolo() {
		return numeroArticolo;
	}

	public void setNumeroArticolo(Integer numeroArticolo) {
		this.numeroArticolo = numeroArticolo;
	}

	public Integer getNumeroCapitolo() {
		return numeroCapitolo;
	}

	public void setNumeroCapitolo(Integer numeroCapitolo) {
		this.numeroCapitolo = numeroCapitolo;
	}

	public Integer getAnnoCreazioneCapitolo() {
		return annoCreazioneCapitolo;
	}

	public void setAnnoCreazioneCapitolo(Integer annoCreazioneCapitolo) {
		this.annoCreazioneCapitolo = annoCreazioneCapitolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public BigDecimal getDisponibilitaVariare() {
		return disponibilitaVariare;
	}

	public void setDisponibilitaVariare(BigDecimal disponibilitaVariare) {
		this.disponibilitaVariare = disponibilitaVariare;
	}

	public Integer getExAnnoCapitolo() {
		return exAnnoCapitolo;
	}

	public void setExAnnoCapitolo(Integer exAnnoCapitolo) {
		this.exAnnoCapitolo = exAnnoCapitolo;
	}

	public Integer getExArticolo() {
		return exArticolo;
	}

	public void setExArticolo(Integer exArticolo) {
		this.exArticolo = exArticolo;
	}

	public Integer getExCapitolo() {
		return exCapitolo;
	}

	public void setExCapitolo(Integer exCapitolo) {
		this.exCapitolo = exCapitolo;
	}

	public Boolean getFlagRilevanteIva() {
		return flagRilevanteIva;
	}

	public void setFlagRilevanteIva(Boolean flagRilevanteIva) {
		this.flagRilevanteIva = flagRilevanteIva;
	}

	public BigDecimal getFondoPluriennaleVinc() {
		return fondoPluriennaleVinc;
	}

	public void setFondoPluriennaleVinc(BigDecimal fondoPluriennaleVinc) {
		this.fondoPluriennaleVinc = fondoPluriennaleVinc;
	}

	public BigDecimal getFondoPluriennaleVincPrec() {
		return fondoPluriennaleVincPrec;
	}

	public void setFondoPluriennaleVincPrec(BigDecimal fondoPluriennaleVincPrec) {
		this.fondoPluriennaleVincPrec = fondoPluriennaleVincPrec;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public Integer getNumeroUEB() {
		return numeroUEB;
	}
	
	public void setNumeroUEB(Integer numeroUEB) {
		this.numeroUEB = numeroUEB;
	}
	
	public String getDescrizioneArticolo() {
		return descrizioneArticolo;
	}
	
	public void setDescrizioneArticolo(String descrizioneArticolo) {
		this.descrizioneArticolo = descrizioneArticolo;
	}
	
	public Integer getExUEB() {
		return exUEB;
	}

	public void setExUEB(Integer exUEB) {
		this.exUEB = exUEB;
	}

	public TipoCapitolo getTipoCapitolo() {
		return tipoCapitolo;
	}

	public void setTipoCapitolo(TipoCapitolo tipoCapitolo) {
		this.tipoCapitolo = tipoCapitolo;
	}

	

	

	public Bilancio getBilancio() {
		return bilancio;
	}
	
	/**
	 * Convenience method for access getBilancio().getAnno()
	 * 
	 * @return getBilancio().getAnno() if present, null otherwise
	 */
	public Integer getBilancioAnno() {
		if(getBilancio()!=null && getBilancio().getAnno()!=0){
			return getBilancio().getAnno();
		}		
		return null;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public List<ClassificatoreGenerico> getClassificatoriGenerici() {
		return classificatoriGenerici;
	}

	public void setClassificatoriGenerici(List<ClassificatoreGenerico> classificatoriGenerici) {
		this.classificatoriGenerici = classificatoriGenerici;
	}

	public TipoFondo getTipoFondo() {
		return tipoFondo;
	}

	public void setTipoFondo(TipoFondo tipoFondo) {
		this.tipoFondo = tipoFondo;
	}

	public TipoFinanziamento getTipoFinanziamento() {
		return tipoFinanziamento;
	}

	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
		this.tipoFinanziamento = tipoFinanziamento;
	}

	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
		return strutturaAmministrativoContabile;
	}

	public void setStrutturaAmministrativoContabile(StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
	}

	public ElementoPianoDeiConti getElementoPianoDeiConti() {
		return elementoPianoDeiConti;
	}

	public void setElementoPianoDeiConti(ElementoPianoDeiConti elementoPianoDeiConti) {
		this.elementoPianoDeiConti = elementoPianoDeiConti;
	}

	public IC getImportiCapitolo() {
		return importiCapitolo;
	}

	public void setImportiCapitolo(IC importiCapitolo) {
		this.importiCapitolo = importiCapitolo;
	}

	public ICE getImportiCapitoloEquivalente() {
		return importiCapitoloEquivalente;
	}

	public void setImportiCapitoloEquivalente(ICE importiCapitoloEquivalente) {
		this.importiCapitoloEquivalente = importiCapitoloEquivalente;
	}

	public List<IC> getListaImportiCapitolo() {
		return listaImportiCapitolo;
	}

	public void setListaImportiCapitolo(List<IC> listaImportiCapitolo) {
		this.listaImportiCapitolo = listaImportiCapitolo;
	}

	public List<AttoDiLeggeCapitolo> getListaAttiDiLeggeCapitolo() {
		return listaAttiDiLeggeCapitolo;
	}

	public void setListaAttiDiLeggeCapitolo(List<AttoDiLeggeCapitolo> listaAttiDiLeggeCapitolo) {
		this.listaAttiDiLeggeCapitolo = listaAttiDiLeggeCapitolo;
	}

	/**
	 * @return the uidExCapitolo
	 */
	public int getUidExCapitolo() {
		return uidExCapitolo;
	}

	/**
	 * @param uidExCapitolo the uidExCapitolo to set
	 */
	public void setUidExCapitolo(int uidExCapitolo) {
		this.uidExCapitolo = uidExCapitolo;
	}

	/**
	 * @return the listaAttivitaIva
	 */
	public List<AttivitaIva> getListaAttivitaIva() {
		return listaAttivitaIva;
	}

	/**
	 * @param listaAttivitaIva the listaAttivitaIva to set
	 */
	public void setListaAttivitaIva(List<AttivitaIva> listaAttivitaIva) {
		this.listaAttivitaIva = listaAttivitaIva != null ? listaAttivitaIva : new ArrayList<AttivitaIva>();
	}

	/**
	 * @return the impegnabile
	 */
	public Boolean getFlagImpegnabile() {
		return flagImpegnabile;
	}

	/**
	 * @param impegnabile the impegnabile to set
	 */
	public void setFlagImpegnabile(Boolean impegnabile) {
		this.flagImpegnabile = impegnabile;
	}
	
	/**
	 * @return the categoriaCapitolo
	 */
	public CategoriaCapitolo getCategoriaCapitolo() {
		return categoriaCapitolo;
	}

	/**
	 * @param categoriaCapitolo the tipologiaCapitolo to set
	 */
	public void setCategoriaCapitolo(CategoriaCapitolo categoriaCapitolo) {
		this.categoriaCapitolo = categoriaCapitolo;
	}

	/**
	 * @return the uidCapitoloEquivalente
	 */
	public int getUidCapitoloEquivalente() {
		return uidCapitoloEquivalente;
	}

	/**
	 * @param uidCapitoloEquivalente the uidCapitoloEquivalente to set
	 */
	public void setUidCapitoloEquivalente(int uidCapitoloEquivalente) {
		this.uidCapitoloEquivalente = uidCapitoloEquivalente;
	}

	/**
	 * Restituisce l'importo capitolo per l'anno fornito
	 * @param anno l'anno per cui ottenere l'importo
	 * @return l'importo corrispondente all'anno, se presente; <code>null</code> altrimenti
	 */
	public IC findImportiCapitoloPerAnno(Integer anno) {
		for(IC ic : listaImportiCapitolo) {
			if(ic != null && anno.equals(ic.getAnnoCompetenza())) {
				return ic;
			}
		}
		return null;
	}
	
	//task-55
	public Boolean getFlagNonInserireAllegatoA1() {
		return flagNonInserireAllegatoA1;
	}

	public void setFlagNonInserireAllegatoA1(Boolean flagNonInserireAllegatoA1) {
		this.flagNonInserireAllegatoA1 = flagNonInserireAllegatoA1;
	}
	

}
