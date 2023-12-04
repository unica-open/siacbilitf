/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Ambito;
import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import it.csi.siac.siaccespser.model.CategoriaCespiti;
import it.csi.siac.siaccorser.model.EntitaEnteExt;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * elemento di un Piano dei Conti
 * 
 * un conto può essere  valido per più anni di bilancio
 * l'inizio validità corrsiponde sempre all'1/1 dell'anno 0
 * la fine validità corrisponde sempre al 31/12 dell'anno n
 * 
 * @author 1080
 * @version 1.0
 * @created 06-mar-2015 16.32.14
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class Conto extends EntitaEnteExt  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7623830318194561863L;

	
	private Integer livello;
	private String ordine;
	private String codice;
	private String descrizione;
	//serve?
	private Integer annoCatalogazione;
	private Boolean ammortamento;
	
	private PianoDeiConti pianoDeiConti;
	
	// Lotto N
	private Ambito ambito;
	
	/**
	 * indica che il conto esiste nel bilancio, ma non verrà usato nelle regstrazioni
	 * Esso risulterà comunque nei prospetti analitici di bilancio e nella
	 * reportistica.
	 * 
	 * attributo che può variare da un bilancio ad un altro
	 */
	private Boolean attivo;
	
	/**
	 * codifica ad uso interno dell'ente
	 * 
	 * attributo che può variare da un bilancio ad un altro
	 */
	private String codiceInterno;
	
	/**
	 * indica che è il conto sul quale verranno configurate le causali e fatte le
	 * scritture
	 * e su cui sarà possibile fare le scritture contabili
	 * 
	 * attributo che può variare da un bilancio ad un altro
	 */
	private Boolean contoFoglia;
	
	/**
	 * indica che è il conto previsto dalla norma
	 * 
	 * attributo che può variare da un bilancio ad un altro
	 */
	private Boolean contoDiLegge;
	private Boolean contoAPartite;
	
	private TipoConto tipoConto;
	
	
	private CategoriaCespiti categoriaCespiti;
	
	//Classificatori legati da siac_r_pdce_conto_class
	//Codifica di bilancio
	private CodiceBilancio codiceBilancio;
	//Codice Conto Finanziario //Corrisponde a ElementoContoEconomico?
	private ElementoPianoDeiConti elementoPianoDeiConti;
	
	/**
	 * Conto di livello -1 rispetto a this. (i livelli sono 0 based)
	 */
	private Conto contoPadre;
	
	/**
	 * Conto collegato con un tipoLegame Specifico
	 */
	//siac_r_pdce_conto con siac_d_pdce_rel_tipo 
	private Conto contoCollegato;
	
	/**
	 * Tipo di legame del contoCollegato
	 */
	private TipoLegame tipoLegame;
	
	private Soggetto soggetto;
	
	
	
	//mi serve?
	private List<CausaleEP> causaliEP = new ArrayList<CausaleEP>();

	private Date dataInizioValiditaFiltro;

	/**
	 * @return the pianoDeiConti
	 */
	public PianoDeiConti getPianoDeiConti() {
		return pianoDeiConti;
	}

	/**
	 * @param pianoDeiConti the pianoDeiConti to set
	 */
	public void setPianoDeiConti(PianoDeiConti pianoDeiConti) {
		this.pianoDeiConti = pianoDeiConti;
	}

	/**
	 * @return the contoFoglia
	 */
	public Boolean getContoFoglia() {
		return contoFoglia;
	}

	/**
	 * @param contoFoglia the contoFoglia to set
	 */
	public void setContoFoglia(Boolean contoFoglia) {
		this.contoFoglia = contoFoglia;
	}

	/**
	 * @return the attivo
	 */
	public Boolean getAttivo() {
		return attivo;
	}

	/**
	 * @param attivo the attivo to set
	 */
	public void setAttivo(Boolean attivo) {
		this.attivo = attivo;
	}

	/**
	 * @return the contoDiLegge
	 */
	public Boolean getContoDiLegge() {
		return contoDiLegge;
	}

	/**
	 * @param contoDiLegge the contoDiLegge to set
	 */
	public void setContoDiLegge(Boolean contoDiLegge) {
		this.contoDiLegge = contoDiLegge;
	}

	/**
	 * @return the codiceInterno
	 */
	public String getCodiceInterno() {
		return codiceInterno;
	}

	/**
	 * @param codiceInterno the codiceInterno to set
	 */
	public void setCodiceInterno(String codiceInterno) {
		this.codiceInterno = codiceInterno;
	}

	/**
	 * @return the contoAPartite
	 */
	public Boolean getContoAPartite() {
		return contoAPartite;
	}

	/**
	 * @param contoAPartite the contoAPartite to set
	 */
	public void setContoAPartite(Boolean aPartite) {
		this.contoAPartite = aPartite;
	}

	/**
	 * @return the tipoConto
	 */
	public TipoConto getTipoConto() {
		return tipoConto;
	}

	/**
	 * @param tipoConto the tipoConto to set
	 */
	public void setTipoConto(TipoConto tipoConto) {
		this.tipoConto = tipoConto;
	}

	/**
	 * @return the categoriaCespiti
	 */
	public CategoriaCespiti getCategoriaCespiti() {
		return categoriaCespiti;
	}

	/**
	 * @param categoriaCespiti the categoriaCespiti to set
	 */
	public void setCategoriaCespiti(CategoriaCespiti categoriaCespiti) {
		this.categoriaCespiti = categoriaCespiti;
	}

	/**
	 * @return the codiceBilancio
	 */
	public CodiceBilancio getCodiceBilancio() {
		return codiceBilancio;
	}

	/**
	 * @param codiceBilancio the codiceBilancio to set
	 */
	public void setCodiceBilancio(CodiceBilancio codiceBilancio) {
		this.codiceBilancio = codiceBilancio;
	}

	/**
	 * @return the contoCollegato
	 */
	public Conto getContoCollegato() {
		return contoCollegato;
	}

	/**
	 * @param contoCollegato the contoCollegato to set
	 */
	public void setContoCollegato(Conto contoCollegato) {
		this.contoCollegato = contoCollegato;
	}

	/**
	 * @return the tipoLegame
	 */
	public TipoLegame getTipoLegame() {
		return tipoLegame;
	}

	/**
	 * @param tipoLegame the tipoLegame to set
	 */
	public void setTipoLegame(TipoLegame tipoLegame) {
		this.tipoLegame = tipoLegame;
	}

	/**
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return soggetto;
	}

	/**
	 * @param soggetto the soggetto to set
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}

	/**
	 * @return the causaliEP
	 */
	public List<CausaleEP> getCausaliEP() {
		return causaliEP;
	}

	/**
	 * @param causaliEP the causaliEP to set
	 */
	public void setCausaliEP(List<CausaleEP> causaliEP) {
		this.causaliEP = causaliEP;
	}

	
	

	
	

	/**
	 * @return the elementoPianoDeiConti
	 */
	public ElementoPianoDeiConti getElementoPianoDeiConti() {
		return elementoPianoDeiConti;
	}

	/**
	 * @param elementoPianoDeiConti the elementoPianoDeiConti to set
	 */
	public void setElementoPianoDeiConti(ElementoPianoDeiConti elementoPianoDeiConti) {
		this.elementoPianoDeiConti = elementoPianoDeiConti;
	}

	/**
	 * @return the contoPadre
	 */
	public Conto getContoPadre() {
		return contoPadre;
	}

	/**
	 * @param contoPadre the contoPadre to set
	 */
	public void setContoPadre(Conto contoPadre) {
		this.contoPadre = contoPadre;
	}

	/**
	 * @return the livello
	 */
	public Integer getLivello() {
		return livello;
	}

	/**
	 * @param livello the livello to set
	 */
	public void setLivello(Integer livello) {
		this.livello = livello;
	}

	/**
	 * @return the ordine
	 */
	public String getOrdine() {
		return ordine;
	}

	/**
	 * @param ordine the ordine to set
	 */
	public void setOrdine(String ordine) {
		this.ordine = ordine;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
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
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the annoCatalogazione
	 */
	public Integer getAnnoCatalogazione() {
		return annoCatalogazione;
	}

	/**
	 * @param annoCatalogazione the annoCatalogazione to set
	 */
	public void setAnnoCatalogazione(Integer annoCatalogazione) {
		this.annoCatalogazione = annoCatalogazione;
	}
	
	
	/**
	 * @return the ammortamento
	 */
	public Boolean getAmmortamento() {
		return ammortamento;
	}

	/**
	 * @param ammortamento the ammortamento to set
	 */
	public void setAmmortamento(Boolean ammortamento) {
		this.ammortamento = ammortamento;
	}

	/**
	 * Gets the data modifica conto.
	 *
	 * @return the data modifica conto
	 */
	public Date getDataModificaConto() {
		return super.getDataModifica();
	}
	
	/**
	 * Sets the data modifica conto.
	 *
	 * @param dataModifica the new data modifica conto
	 */
	public void setDataModificaConto(Date dataModifica) {
		super.setDataModifica(dataModifica);
	}

	/**
	 * Sets the data inizio validita filtro.
	 *
	 * @param dataInizioValiditaFiltro the new data inizio validita filtro
	 */
	public void setDataInizioValiditaFiltro(Date dataInizioValiditaFiltro) {
		this.dataInizioValiditaFiltro = dataInizioValiditaFiltro;
	}

	/**
	 * @return the dataInizioValiditaFiltro
	 */
	public Date getDataInizioValiditaFiltro() {
		return dataInizioValiditaFiltro;
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
	
	
	


}