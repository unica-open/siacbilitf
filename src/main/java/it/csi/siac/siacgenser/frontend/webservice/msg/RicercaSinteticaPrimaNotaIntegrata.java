/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siacbilser.model.CapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siacbilser.model.CapitoloUscitaPrevisione;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfin2ser.model.Documento;
import it.csi.siac.siacfinser.model.MovimentoGestione;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.CausaleEP;
import it.csi.siac.siacgenser.model.Conto;
import it.csi.siac.siacgenser.model.Evento;
import it.csi.siac.siacgenser.model.PrimaNota;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;
import it.csi.siac.siacgenser.model.TipoEvento;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaPrimaNotaIntegrata extends ServiceRequest {

	private PrimaNota primaNota;
	private RegistrazioneMovFin registrazioneMovFin;
	private Evento evento;
	private Integer annoMovimento;
	private String numeroMovimento;
	private Integer numeroSubmovimento;
	private TipoEvento tipoEvento;
	private Conto conto;
	private CausaleEP causaleEP;
	private Date dataRegistrazioneDa;
	private Date dataRegistrazioneA;
	private Date dataRegistrazioneProvvisoriaDa;
	private Date dataRegistrazioneProvvisoriaA;
	private String tipoElenco;
	
	//filtro per cercare una eventuale prima nota già collegata ad un documento
	private Documento<?, ?> documento;
	
	
	private Bilancio bilancio;
	
	//SIAC-4644 (nuovi filtri)
	private AttoAmministrativo attoAmministrativo;
	
	private MovimentoGestione movimentoGestione;	
	private MovimentoGestione subMovimentoGestione;					
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;

	private Soggetto soggetto;
	private BigDecimal importoDocumentoDa;
	private BigDecimal importoDocumentoA;
	
	private ParametriPaginazione parametriPaginazione;
	
	// SIAC-5291
	@XmlElements({
		@XmlElement(name="capitoloUscitaPrevisione", type=CapitoloUscitaPrevisione.class),
		@XmlElement(name="capitoloUscitaGestione", type=CapitoloUscitaGestione.class),
		@XmlElement(name="capitoloEntrataPrevisione", type=CapitoloEntrataPrevisione.class),
		@XmlElement(name="capitoloEntrataGestione", type=CapitoloEntrataGestione.class),
	})
	private Capitolo<?, ?> capitolo;

	/**
	 * @return the primaNota
	 */
	public PrimaNota getPrimaNota() {
		return primaNota;
	}

	/**
	 * @param primaNota the primaNota to set
	 */
	public void setPrimaNota(PrimaNota primaNota) {
		this.primaNota = primaNota;
	}

	/**
	 * @return the registrazioneMovFin
	 */
	public RegistrazioneMovFin getRegistrazioneMovFin() {
		return registrazioneMovFin;
	}

	/**
	 * @param registrazioneMovFin the registrazioneMovFin to set
	 */
	public void setRegistrazioneMovFin(RegistrazioneMovFin registrazioneMovFin) {
		this.registrazioneMovFin = registrazioneMovFin;
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
	 * @return the annoMovimento
	 */
	public Integer getAnnoMovimento() {
		return annoMovimento;
	}

	/**
	 * @param annoMovimento the annoMovimento to set
	 */
	public void setAnnoMovimento(Integer annoMovimento) {
		this.annoMovimento = annoMovimento;
	}

	/**
	 * @return the numeroMovimento
	 */
	public String getNumeroMovimento() {
		return numeroMovimento;
	}

	/**
	 * @param numeroMovimento the numeroMovimento to set
	 */
	public void setNumeroMovimento(String numeroMovimento) {
		this.numeroMovimento = numeroMovimento;
	}

	/**
	 * @return the numeroSubmovimento
	 */
	public Integer getNumeroSubmovimento() {
		return numeroSubmovimento;
	}

	/**
	 * @param numeroSubmovimento the numeroSubmovimento to set
	 */
	public void setNumeroSubmovimento(Integer numeroSubmovimento) {
		this.numeroSubmovimento = numeroSubmovimento;
	}

	/**
	 * @return the tipoEvento
	 */
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	/**
	 * @param tipoEvento the tipoEvento to set
	 */
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
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
	 * @return the causaleEP
	 */
	public CausaleEP getCausaleEP() {
		return causaleEP;
	}

	/**
	 * @param causaleEP the causaleEP to set
	 */
	public void setCausaleEP(CausaleEP causaleEP) {
		this.causaleEP = causaleEP;
	}

	/**
	 * @return the dataRegistrazioneDa
	 */
	public Date getDataRegistrazioneDa() {
		return dataRegistrazioneDa;
	}

	/**
	 * @param dataRegistrazioneDa the dataRegistrazioneDa to set
	 */
	public void setDataRegistrazioneDa(Date dataRegistrazioneDa) {
		this.dataRegistrazioneDa = dataRegistrazioneDa;
	}

	/**
	 * @return the dataRegistrazioneA
	 */
	public Date getDataRegistrazioneA() {
		return dataRegistrazioneA;
	}

	/**
	 * @param dataRegistrazioneA the dataRegistrazioneA to set
	 */
	public void setDataRegistrazioneA(Date dataRegistrazioneA) {
		this.dataRegistrazioneA = dataRegistrazioneA;
	}

	/**
	 * @return the dataRegistrazioneProvvisoriaDa
	 */
	public Date getDataRegistrazioneProvvisoriaDa() {
		return dataRegistrazioneProvvisoriaDa;
	}

	/**
	 * @param dataRegistrazioneProvvisoriaDa the dataRegistrazioneProvvisoriaDa to set
	 */
	public void setDataRegistrazioneProvvisoriaDa(Date dataRegistrazioneProvvisoriaDa) {
		this.dataRegistrazioneProvvisoriaDa = dataRegistrazioneProvvisoriaDa;
	}

	/**
	 * @return the dataRegistrazioneProvvisoriaA
	 */
	public Date getDataRegistrazioneProvvisoriaA() {
		return dataRegistrazioneProvvisoriaA;
	}

	/**
	 * @param dataRegistrazioneProvvisoriaA the dataRegistrazioneProvvisoriaA to set
	 */
	public void setDataRegistrazioneProvvisoriaA(Date dataRegistrazioneProvvisoriaA) {
		this.dataRegistrazioneProvvisoriaA = dataRegistrazioneProvvisoriaA;
	}

	/**
	 * @return the tipoElenco
	 */
	public String getTipoElenco() {
		return tipoElenco;
	}

	/**
	 * @param tipoElenco the tipoElenco to set
	 */
	public void setTipoElenco(String tipoElenco) {
		this.tipoElenco = tipoElenco;
	}

	/**
	 * @return the documento
	 */
	public Documento<?, ?> getDocumento() {
		return documento;
	}

	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(Documento<?, ?> documento) {
		this.documento = documento;
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
	 * @return the attoAmministrativo
	 */
	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}

	/**
	 * @param attoAmministrativo the attoAmministrativo to set
	 */
	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
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
	 * @return the importoDocumentoDa
	 */
	public BigDecimal getImportoDocumentoDa() {
		return importoDocumentoDa;
	}

	/**
	 * @param importoDocumentoDa the importoDocumentoDa to set
	 */
	public void setImportoDocumentoDa(BigDecimal importoDocumentoDa) {
		this.importoDocumentoDa = importoDocumentoDa;
	}

	/**
	 * @return the importoDocumentoA
	 */
	public BigDecimal getImportoDocumentoA() {
		return importoDocumentoA;
	}

	/**
	 * @param importoDocumentoA the importoDocumentoA to set
	 */
	public void setImportoDocumentoA(BigDecimal importoDocumentoA) {
		this.importoDocumentoA = importoDocumentoA;
	}

	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

	/**
	 * @return the capitolo
	 */
	@XmlTransient
	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}

	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}

	/**
	 * @return the movimentoGestione
	 */
	public MovimentoGestione getMovimentoGestione() {
		return movimentoGestione;
	}

	/**
	 * @param movimentoGestione the movimentoGestione to set
	 */
	public void setMovimentoGestione(MovimentoGestione movimentoGestione) {
		this.movimentoGestione = movimentoGestione;
	}

	/**
	 * @return the subMovimentoGestione
	 */
	public MovimentoGestione getSubMovimentoGestione() {
		return subMovimentoGestione;
	}

	/**
	 * @param subMovimentoGestione the subMovimentoGestione to set
	 */
	public void setSubMovimentoGestione(MovimentoGestione subMovimentoGestione) {
		this.subMovimentoGestione = subMovimentoGestione;
	}

	/**
	 * @return the strutturaAmministrativoContabile
	 */
	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
		return strutturaAmministrativoContabile;
	}

	/**
	 * @param strutturaAmministrativoContabile the strutturaAmministrativoContabile to set
	 */
	public void setStrutturaAmministrativoContabile(StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
	}

	
}
