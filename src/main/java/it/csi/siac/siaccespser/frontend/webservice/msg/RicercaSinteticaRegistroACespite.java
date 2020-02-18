/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseRequest;
import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siacbilser.model.CapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siacbilser.model.CapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.model.Missione;
import it.csi.siac.siacbilser.model.ModelDetail;
import it.csi.siac.siacbilser.model.Programma;
import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siacfin2ser.model.Documento;
import it.csi.siac.siacfinser.model.MovimentoGestione;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
import it.csi.siac.siacgenser.model.CausaleEP;
import it.csi.siac.siacgenser.model.Conto;
import it.csi.siac.siacgenser.model.Evento;
import it.csi.siac.siacgenser.model.PrimaNota;
import it.csi.siac.siacgenser.model.PrimaNotaModelDetail;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;
import it.csi.siac.siacgenser.model.TipoEvento;

/**
 * Ricerca sintetica per il registro A
 * @author Marchino Alessandro
 * @version 1.0.0 - 16/10/2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaRegistroACespite extends RicercaSinteticaBaseRequest {

	// Unione di RicercaSintenticaPrimaNota e RicercaSinteticaPrimaNotaIntegrata
	private PrimaNota primaNota;
	private CausaleEP causaleEP;
	private Conto conto;
	private Date dataRegistrazioneDa;
	private Date dataRegistrazioneA;
	private Date dataRegistrazioneProvvisoriaDa;
	private Date dataRegistrazioneProvvisoriaA;
	private BigDecimal importo;
	private Bilancio bilancio;
	private Missione missione;
	private Programma programma;
	
	private RegistrazioneMovFin registrazioneMovFin;
	private Integer annoMovimento;
	private String numeroMovimento;
	private Integer numeroSubmovimento;
	private TipoEvento tipoEvento;
	private String tipoElenco;
	private Documento<?, ?> documento;
	private AttoAmministrativo attoAmministrativo;
	
	private MovimentoGestione movimentoGestione;
	private MovimentoGestione subMovimentoGestione;
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;

	private Soggetto soggetto;
	private BigDecimal importoDocumentoDa;
	private BigDecimal importoDocumentoA;
	
	@XmlElements({
		@XmlElement(name="capitoloUscitaPrevisione", type=CapitoloUscitaPrevisione.class),
		@XmlElement(name="capitoloUscitaGestione", type=CapitoloUscitaGestione.class),
		@XmlElement(name="capitoloEntrataPrevisione", type=CapitoloEntrataPrevisione.class),
		@XmlElement(name="capitoloEntrataGestione", type=CapitoloEntrataGestione.class),
	})
	private Capitolo<?, ?> capitolo;
	
	@XmlElementWrapper(name="eventi")
	@XmlElement(name="evento")
	private List<Evento> eventi = new ArrayList<Evento>();
	
	@XmlElementWrapper(name="modelDetails")
	@XmlElements({
		@XmlElement(name="primaNotaModelDetail", type=PrimaNotaModelDetail.class)
	})
	private ModelDetail[] modelDetails = new ModelDetail[0];

	/**
	 * @return the primaNota
	 */
	public PrimaNota getPrimaNota() {
		return this.primaNota;
	}

	/**
	 * @param primaNota the primaNota to set
	 */
	public void setPrimaNota(PrimaNota primaNota) {
		this.primaNota = primaNota;
	}

	/**
	 * @return the causaleEP
	 */
	public CausaleEP getCausaleEP() {
		return this.causaleEP;
	}

	/**
	 * @param causaleEP the causaleEP to set
	 */
	public void setCausaleEP(CausaleEP causaleEP) {
		this.causaleEP = causaleEP;
	}

	/**
	 * @return the conto
	 */
	public Conto getConto() {
		return this.conto;
	}

	/**
	 * @param conto the conto to set
	 */
	public void setConto(Conto conto) {
		this.conto = conto;
	}

	/**
	 * @return the dataRegistrazioneDa
	 */
	public Date getDataRegistrazioneDa() {
		return this.dataRegistrazioneDa;
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
		return this.dataRegistrazioneA;
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
		return this.dataRegistrazioneProvvisoriaDa;
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
		return this.dataRegistrazioneProvvisoriaA;
	}

	/**
	 * @param dataRegistrazioneProvvisoriaA the dataRegistrazioneProvvisoriaA to set
	 */
	public void setDataRegistrazioneProvvisoriaA(Date dataRegistrazioneProvvisoriaA) {
		this.dataRegistrazioneProvvisoriaA = dataRegistrazioneProvvisoriaA;
	}

	/**
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return this.importo;
	}

	/**
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return this.bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	/**
	 * @return the missione
	 */
	public Missione getMissione() {
		return this.missione;
	}

	/**
	 * @param missione the missione to set
	 */
	public void setMissione(Missione missione) {
		this.missione = missione;
	}

	/**
	 * @return the programma
	 */
	public Programma getProgramma() {
		return this.programma;
	}

	/**
	 * @param programma the programma to set
	 */
	public void setProgramma(Programma programma) {
		this.programma = programma;
	}

	/**
	 * @return the registrazioneMovFin
	 */
	public RegistrazioneMovFin getRegistrazioneMovFin() {
		return this.registrazioneMovFin;
	}

	/**
	 * @param registrazioneMovFin the registrazioneMovFin to set
	 */
	public void setRegistrazioneMovFin(RegistrazioneMovFin registrazioneMovFin) {
		this.registrazioneMovFin = registrazioneMovFin;
	}

	/**
	 * @return the annoMovimento
	 */
	public Integer getAnnoMovimento() {
		return this.annoMovimento;
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
		return this.numeroMovimento;
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
		return this.numeroSubmovimento;
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
		return this.tipoEvento;
	}

	/**
	 * @param tipoEvento the tipoEvento to set
	 */
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	/**
	 * @return the tipoElenco
	 */
	public String getTipoElenco() {
		return this.tipoElenco;
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
		return this.documento;
	}

	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(Documento<?, ?> documento) {
		this.documento = documento;
	}

	/**
	 * @return the attoAmministrativo
	 */
	public AttoAmministrativo getAttoAmministrativo() {
		return this.attoAmministrativo;
	}

	/**
	 * @param attoAmministrativo the attoAmministrativo to set
	 */
	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}

	/**
	 * @return the movimentoGestione
	 */
	public MovimentoGestione getMovimentoGestione() {
		return this.movimentoGestione;
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
		return this.subMovimentoGestione;
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
		return this.strutturaAmministrativoContabile;
	}

	/**
	 * @param strutturaAmministrativoContabile the strutturaAmministrativoContabile to set
	 */
	public void setStrutturaAmministrativoContabile(StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
	}

	/**
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
	 * @return the importoDocumentoDa
	 */
	public BigDecimal getImportoDocumentoDa() {
		return this.importoDocumentoDa;
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
		return this.importoDocumentoA;
	}

	/**
	 * @param importoDocumentoA the importoDocumentoA to set
	 */
	public void setImportoDocumentoA(BigDecimal importoDocumentoA) {
		this.importoDocumentoA = importoDocumentoA;
	}

	/**
	 * @return the capitolo
	 */
	@XmlTransient
	public Capitolo<?, ?> getCapitolo() {
		return this.capitolo;
	}

	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}

	/**
	 * @return the eventi
	 */
	@XmlTransient
	public List<Evento> getEventi() {
		return this.eventi;
	}

	/**
	 * @param eventi the eventi to set
	 */
	public void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}

	/**
	 * @return the modelDetails
	 */
	@XmlTransient
	public ModelDetail[] getModelDetails() {
		return this.modelDetails;
	}

	/**
	 * @param modelDetails the modelDetails to set
	 */
	public void setModelDetails(ModelDetail... modelDetails) {
		this.modelDetails = modelDetails;
	}
	
}
