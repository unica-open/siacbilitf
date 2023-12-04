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
import it.csi.siac.siaccorser.model.EntitaEnteExt;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;

/**
 * es.: PAF - PAGAMENTO MANDATO CON FATTURA
 * oppure
 * FPI - FATTURA PASSIVA CON IVA
 * Esempio di Causale con soli CONTI NON CONCILIATI:
 * CFP - CHIUSURA FATTURE PASSIVE
 * 
 * ESEMPIO SIAC:
 * CAUSALE 'ACCEQUAL' PER ACCERTAMENTO CON
 * PdC = E.4.04.01.01.003 E Prezzo di vendita <b>=</b> a valore contabile,
 * collegata ai CONTI:
 * 1.3.2.02.06.01.003 come DARE per Stato Patrimoniale
 * 1.2.2.02.01.03 come AVERE per Stato Patrimoniale
 * come indicato nella matrice di integrazione,
 * quindi 2 righe di dettaglio della scrittura contabile in questo caso.
 * 
 * Esempi di registrazioni non legate alla Finanziaria
 * <i>a) le quote di ammortamento relative ai beni utilizzati</i>
 * <i>b) le eventuali quote di accantonamento ai fondi rischi ed oneri futuri;
 * </i>
 * <i>c) le perdite su crediti e gli accantonamenti al fondo svalutazione crediti;
 * </i>
 * <i>d)le rimanenze iniziali e finali;</i>
 * <i>e) le quote di costo o di ricavo corrispondenti ai ratei e risconti attivi e
 * passivi di competenza dell'esercizio;</i>
 * <i>f) i rischi e le perdite di competenza dell'esercizio anche se conosciuti
 * dopo la chiusura dell'esercizio fino alla data di approvazione della delibera
 * del rendiconto della gestione</i>
 * <i>
 * </i>
 * @author prologicMMA
 * @version 1.0
 * @version 1.1.0 - 26/10/2015 - aggiunta classe di conciliazione
 * @created 06-mar-2015 16.31.23
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class CausaleEP extends EntitaEnteExt  {
	
	private static final long serialVersionUID = -4965941804423080828L;
	

//	private Bilancio bilancio; //??
	private TipoCausale tipoCausale;
	
	private String codice;
	private String descrizione;
	
	private List<Evento> eventi = new ArrayList<Evento>();
	
	private List<ContoTipoOperazione> contiTipoOperazione = new ArrayList<ContoTipoOperazione>();
	
	
//	private PianoDeiContiFinanziario pianoDeiContiFinanziario; //sostituito da elementoPianoDeiConti
	private ElementoPianoDeiConti elementoPianoDeiConti;
	
	private Soggetto soggetto;
	private List<ClassificatoreEP> classificatoriEP  = new ArrayList<ClassificatoreEP>();
	private StatoOperativoCausaleEP statoOperativoCausaleEP;
	
	private Date dataInizioValiditaFiltro;
	
	// Lotto N
	private Boolean causaleDiDefault;
	private Ambito ambito;
	
//	// Lotto O
//	private ClasseDiConciliazione classeDiConciliazione; //SIAC-4596 spostato all'interno di ContoTipoOperazione

	/**
	 * Gets the tipo causale.
	 *
	 * @return the tipoCausale
	 */
	public TipoCausale getTipoCausale() {
		return tipoCausale;
	}


	/**
	 * Sets the tipo causale.
	 *
	 * @param tipoCausale the tipoCausale to set
	 */
	public void setTipoCausale(TipoCausale tipoCausale) {
		this.tipoCausale = tipoCausale;
	}


	/**
	 * Gets the codice.
	 *
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}


	/**
	 * Sets the codice.
	 *
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}


	/**
	 * Gets the descrizione.
	 *
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}


	/**
	 * Sets the descrizione.
	 *
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	/**
	 * Gets the eventi.
	 *
	 * @return the eventi
	 */
	public List<Evento> getEventi() {
		return eventi;
	}


	/**
	 * Sets the eventi.
	 *
	 * @param eventi the eventi to set
	 */
	public void setEventi(List<Evento> eventi) {
		this.eventi = eventi != null ? eventi : new ArrayList<Evento>();
	}
	
	/**
	 * Adds the evento.
	 *
	 * @param evento the evento
	 */
	public void addEvento(Evento evento) {
		getEventi().add(evento);
	}


	/**
	 * Gets the conti tipo operazione.
	 *
	 * @return the contiTipoOperazione
	 */
	public List<ContoTipoOperazione> getContiTipoOperazione() {
		return contiTipoOperazione;
	}


	/**
	 * Sets the conti tipo operazione.
	 *
	 * @param contiTipoOperazione the contiTipoOperazione to set
	 */
	public void setContiTipoOperazione(List<ContoTipoOperazione> contiTipoOperazione) {
		this.contiTipoOperazione = contiTipoOperazione != null ? contiTipoOperazione : new ArrayList<ContoTipoOperazione>();
	}
	
	/**
	 * Adds the conto tipo operazione.
	 *
	 * @param contoTipoOperazione the conto tipo operazione
	 */
	public void addContoTipoOperazione(ContoTipoOperazione contoTipoOperazione) {
		getContiTipoOperazione().add(contoTipoOperazione);
	}


	/**
	 * Gets the soggetto.
	 *
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return soggetto;
	}


	/**
	 * Sets the soggetto.
	 *
	 * @param soggetto the soggetto to set
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}


	/**
	 * Gets the classificatori ep.
	 *
	 * @return the classificatoriEP
	 */
	public List<ClassificatoreEP> getClassificatoriEP() {
		return classificatoriEP;
	}


	/**
	 * Sets the classificatori ep.
	 *
	 * @param classificatoriEP the classificatoriEP to set
	 */
	public void setClassificatoriEP(List<ClassificatoreEP> classificatoriEP) {
		this.classificatoriEP = classificatoriEP != null ? classificatoriEP : new ArrayList<ClassificatoreEP>();
	}
	

	/**
	 * Adds the classificatore ep.
	 *
	 * @param classificatoreEP the classificatore ep
	 */
	public void addClassificatoreEP(ClassificatoreEP classificatoreEP) {
		getClassificatoriEP().add(classificatoreEP);
	}


	/**
	 * Gets the stato operativo causale ep.
	 *
	 * @return the statoOperativoCausaleEP
	 */
	public StatoOperativoCausaleEP getStatoOperativoCausaleEP() {
		return statoOperativoCausaleEP;
	}


	/**
	 * Sets the stato operativo causale ep.
	 *
	 * @param statoOperativoCausaleEP the statoOperativoCausaleEP to set
	 */
	public void setStatoOperativoCausaleEP(
			StatoOperativoCausaleEP statoOperativoCausaleEP) {
		this.statoOperativoCausaleEP = statoOperativoCausaleEP;
	}


	/**
	 * Gets the ente.
	 *
	 * @return the ente
	 */
	


	/**
	 * Sets the ente.
	 *
	 * @param ente the ente to set
	 */
	


	/**
	 * Gets the elemento piano dei conti.
	 *
	 * @return the elementoPianoDeiConti
	 */
	public ElementoPianoDeiConti getElementoPianoDeiConti() {
		return elementoPianoDeiConti;
	}


	/**
	 * Sets the elemento piano dei conti.
	 *
	 * @param elementoPianoDeiConti the elementoPianoDeiConti to set
	 */
	public void setElementoPianoDeiConti(ElementoPianoDeiConti elementoPianoDeiConti) {
		this.elementoPianoDeiConti = elementoPianoDeiConti;
	}


	/**
	 * Gets the data creazione causale ep.
	 *
	 * @return the data creazione causale ep
	 */
	public Date getDataCreazioneCausaleEP() {
		return super.getDataCreazione();
	}

	
	/**
	 * Sets the data creazione causale ep.
	 *
	 * @param dataCreazione the new data creazione causale ep
	 */
	public void setDataCreazioneCausaleEP(Date dataCreazione) {
		super.setDataCreazione(dataCreazione);
	}
	
	
	/**
	 * Gets the data modifica causale ep.
	 *
	 * @return the data modifica causale ep
	 */
	public Date getDataModificaCausaleEP() {
		return super.getDataModifica();
	}
	
	/**
	 * Sets the data modifica causale ep.
	 *
	 * @param dataModifica the new data modifica causale ep
	 */
	public void setDataModificaCausaleEP(Date dataModifica) {
		super.setDataModifica(dataModifica);
	}

	/**
	 * @return the dataInizioValiditaFiltro
	 */
	public Date getDataInizioValiditaFiltro() {
		return dataInizioValiditaFiltro;
	}

	/**
	 * @param dataInizioValiditaFiltro the dataInizioValiditaFiltro to set
	 */
	public void setDataInizioValiditaFiltro(Date dataInizioValiditaFiltro) {
		this.dataInizioValiditaFiltro = dataInizioValiditaFiltro;
	}

	/**
	 * @return the causaleDiDefault
	 */
	public Boolean getCausaleDiDefault() {
		return causaleDiDefault;
	}

	/**
	 * @param causaleDiDefault the causaleDiDefault to set
	 */
	public void setCausaleDiDefault(Boolean causaleDiDefault) {
		this.causaleDiDefault = causaleDiDefault;
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

//	/**
//	 * @return the classeDiConciliazione
//	 */
//	public ClasseDiConciliazione getClasseDiConciliazione() {
//		return classeDiConciliazione;
//	}
//
//	/**
//	 * @param classeDiConciliazione the classeDiConciliazione to set
//	 */
//	public void setClasseDiConciliazione(ClasseDiConciliazione classeDiConciliazione) {
//		this.classeDiConciliazione = classeDiConciliazione;
//	}
	

}