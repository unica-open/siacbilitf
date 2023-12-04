/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Ambito;
import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import it.csi.siac.siaccecser.model.RendicontoRichiesta;
import it.csi.siac.siaccecser.model.RichiestaEconomale;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubAccertamento;
import it.csi.siac.siacfinser.model.SubImpegno;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;
import it.csi.siac.siacfinser.model.movgest.ModificaMovimentoGestioneEntrata;
import it.csi.siac.siacfinser.model.movgest.ModificaMovimentoGestioneSpesa;
import it.csi.siac.siacfinser.model.ordinativo.Ordinativo;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoIncasso;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoPagamento;

/**

 * @version 1.0
 * @created 14-apr-2015
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class RegistrazioneMovFin extends EntitaEnte{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3964782380039468612L;

	private Bilancio bilancio;
	
	private Conto conto; 
	private ElementoPianoDeiConti elementoPianoDeiContiIniziale;
	private ElementoPianoDeiConti elementoPianoDeiContiAggiornato;
	
	@XmlElements({
		@XmlElement(name="impegno", type=Impegno.class),
		@XmlElement(name="accertamento", type=Accertamento.class), 
		@XmlElement(name="liquidazione", type=Liquidazione.class), 
		@XmlElement(name="documentoEntrata", type=DocumentoEntrata.class),
		@XmlElement(name="documentoSpesa", type=DocumentoSpesa.class),
		@XmlElement(name="subdocumentoEntrata", type=SubdocumentoEntrata.class),
		@XmlElement(name="subdocumentoSpesa", type=SubdocumentoSpesa.class),
		@XmlElement(name="ordinativoPagamento", type=OrdinativoPagamento.class),
		@XmlElement(name="ordinativoIncasso", type=OrdinativoIncasso.class),
		@XmlElement(name="ordinativo", type=Ordinativo.class),
		@XmlElement(name="primaNota", type=PrimaNota.class),
		
		//Nuovi Lotto M
		@XmlElement(name="subImpegno", type=SubImpegno.class), 
		@XmlElement(name="subAccertamento", type=SubAccertamento.class),
		@XmlElement(name="modificaMovimentoGestioneSpesa", type=ModificaMovimentoGestioneSpesa.class), 
		@XmlElement(name="modificaMovimentoGestioneEntrata", type=ModificaMovimentoGestioneEntrata.class),
		@XmlElement(name="richiestaEconomale", type=RichiestaEconomale.class), 
		@XmlElement(name="rendicontoRichiesta", type=RendicontoRichiesta.class),
		
		@XmlElement(name="rateo", type=Rateo.class),
		@XmlElement(name="risconto", type=Risconto.class),
		
		//fallback
		@XmlElement(name="entita", type=Entita.class),
		
		
	})
	private Entita movimento;
	
	
	@XmlElements({
		@XmlElement(name="subdocumentoEntrataCollegato", type=SubdocumentoEntrata.class),
		@XmlElement(name="subdocumentoSpesaCollegato", type=SubdocumentoSpesa.class),
		
		//fallback
		@XmlElement(name="entitaCollegata", type=Entita.class)
	})
	private Entita movimentoCollegato;
	
	
	private Evento evento;
	private List<MovimentoEP> listaMovimentiEP = new ArrayList<MovimentoEP>();
	
	private StatoOperativoRegistrazioneMovFin statoOperativoRegistrazioneMovFin;
	
	// Lotto N
	private Ambito ambito;
	
	//SIAC_4644
	private Boolean isCollegataAMovimentoResiduo;

	
	
	

	
	

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
	 * @return the conto
	 */
	public Conto getConto() {
		return conto;
	}

	/**
	 * @param conto the conto to set
	 */
	public void setConto(Conto conto) {
		this.conto = conto;
	}

	/**
	 * @return the elementoPianoDeiContiIniziale
	 */
	public ElementoPianoDeiConti getElementoPianoDeiContiIniziale() {
		return elementoPianoDeiContiIniziale;
	}

	/**
	 * @param elementoPianoDeiContiIniziale the elementoPianoDeiContiIniziale to set
	 */
	public void setElementoPianoDeiContiIniziale(
			ElementoPianoDeiConti elementoPianoDeiContiIniziale) {
		this.elementoPianoDeiContiIniziale = elementoPianoDeiContiIniziale;
	}

	/**
	 * @return the elementoPianoDeiContiAggiornato
	 */
	public ElementoPianoDeiConti getElementoPianoDeiContiAggiornato() {
		//20160615 workaround: attualmente e' popolato solo elementoPianoDeiContiIniziale. Questo consente di far runzionare le registrazioni inserite in precedenza.
		//finita la transizione si potra' eliminare questa if perche' l'elementoPianoDeiContiIniziale sara' sempre presente.
		if(elementoPianoDeiContiAggiornato==null) {
			return getElementoPianoDeiContiIniziale();
		}
		return elementoPianoDeiContiAggiornato;
	}

	/**
	 * @param elementoPianoDeiContiAggiornato the elementoPianoDeiContiAggiornato to set
	 */
	public void setElementoPianoDeiContiAggiornato(
			ElementoPianoDeiConti elementoPianoDeiContiAggiornato) {
		this.elementoPianoDeiContiAggiornato = elementoPianoDeiContiAggiornato;
	}

//	/**
//	 * @return the entitaRegistrazioneMovFin
//	 */
//	public EntitaRegistrazioneMovFin getEntitaRegistrazioneMovFin() {
//		return entitaRegistrazioneMovFin;
//	}
//
//	/**
//	 * @param entitaRegistrazioneMovFin the entitaRegistrazioneMovFin to set
//	 */
//	public void setEntitaRegistrazioneMovFin(
//			EntitaRegistrazioneMovFin entitaRegistrazioneMovFin) {
//		this.entitaRegistrazioneMovFin = entitaRegistrazioneMovFin;
//	}

	/**
	 * @return the statoOperativoRegistrazioneMovFin
	 */
	public StatoOperativoRegistrazioneMovFin getStatoOperativoRegistrazioneMovFin() {
		return statoOperativoRegistrazioneMovFin;
	}

	/**
	 * @param statoOperativoRegistrazioneMovFin the statoOperativoRegistrazioneMovFin to set
	 */
	public void setStatoOperativoRegistrazioneMovFin(
			StatoOperativoRegistrazioneMovFin statoOperativoRegistrazioneMovFin) {
		this.statoOperativoRegistrazioneMovFin = statoOperativoRegistrazioneMovFin;
	}

	/**
	 * Ne avra' sempre un solo in realta'!
	 * 
	 * @return the listaMovimentiEP (un solo elemento)
	 */
	public List<MovimentoEP> getListaMovimentiEP() {
		return listaMovimentiEP;
	}

	/**
	 * @param listaMovimentiEP the listaMovimentiEP to set
	 */
	public void setListaMovimentiEP(List<MovimentoEP> listaMovimentiEP) {
		this.listaMovimentiEP = listaMovimentiEP != null ? listaMovimentiEP : new ArrayList<MovimentoEP>();
	}

	public Date getDataRegistrazione(){
		return super.getDataCreazione();
	}
	
	public void setDataRegistrazione(Date dataRegistrazione){
		super.setDataCreazione(dataRegistrazione);
	}

	/**
	 * @return the movimento
	 */
	@XmlTransient
	public Entita getMovimento() {
		return movimento;
	}

	/**
	 * @param movimento the movimento to set
	 */
	public void setMovimento(Entita movimento) {
		this.movimento = movimento;
	}
	
	

	/**
	 * @return the movimentoCollegato
	 */
	@XmlTransient
	public Entita getMovimentoCollegato() {
		return movimentoCollegato;
	}

	/**
	 * @param movimentoCollegato the movimentoCollegato to set
	 */
	public void setMovimentoCollegato(Entita movimentoCollegato) {
		this.movimentoCollegato = movimentoCollegato;
	}

	/**
	 * @return the evento
	 */
	public Evento getEvento() {
		return evento;
	}

	/**
	 * @param evento the evento to set
	 */
	public void setEvento(Evento evento) {
		this.evento = evento;
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
	
	
	public String getDesc() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Ambito: ").append(getAmbito() != null ? getAmbito().name() : " - ");
		sb.append(", Evento: ").append(getEvento() != null ? getEvento().getCodice() : " - ");
		sb.append(", Movimento: ").append(getMovimento() != null ? getMovimento().getClass().getSimpleName() + " uid:" + getMovimento().getUid() : " - ");
		if(getMovimentoCollegato() != null) {
			sb.append(", Movimento Collegato: ")
				.append(getMovimentoCollegato().getClass().getSimpleName())
				.append(" uid:")
				.append(getMovimentoCollegato().getUid());
		}
		sb.append(", Stato: ").append(getStatoOperativoRegistrazioneMovFin() != null ? getStatoOperativoRegistrazioneMovFin().name() : " - ");
		sb.append(", Conto: ").append(getConto() != null ? getConto().getCodice() : " - ");
		sb.append(", Elemento Piano Dei Conti: ").append(getElementoPianoDeiContiAggiornato() != null ? getElementoPianoDeiContiAggiornato().getCodice() : " - ");
		sb.append(", RegistrazioneMovFin.uid: ").append(getUid());
		
		return sb.toString();
	}

	/**
	 * @return TRUE nel caso in cui la Prima Nota sia collegata ad un impegno o ad un accertamento residuo 
	 */
	public Boolean getIsCollegataAMovimentoResiduo() {
		return isCollegataAMovimentoResiduo;
	}

	/**
	 * @param isCollegataAMovimentoResiduo the isCollegataAMovimentoResiduo to set
	 */
	public void setIsCollegataAMovimentoResiduo(Boolean isCollegataAMovimentoResiduo) {
		this.isCollegataAMovimentoResiduo = isCollegataAMovimentoResiduo;
	}
	
	
	
}