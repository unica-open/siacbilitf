/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativoModelDetail;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseRequest;
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilitaModelDetail;
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail;
import it.csi.siac.siacbilser.model.ModelDetail;
import it.csi.siac.siacbilser.model.VariazioneImportoCapitoloModelDetail;
import it.csi.siac.siaccecser.model.RichiestaEconomaleModelDetail;
import it.csi.siac.siaccecser.model.StampeCassaFileModelDetail;
import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.AmmortamentoAnnuoCespiteModelDetail;
import it.csi.siac.siaccespser.model.AnteprimaAmmortamentoAnnuoCespite;
import it.csi.siac.siaccespser.model.CategoriaCespiti;
import it.csi.siac.siaccespser.model.CategoriaCespitiModelDetail;
import it.csi.siac.siaccespser.model.Cespite;
import it.csi.siac.siaccespser.model.CespiteModelDetail;
import it.csi.siac.siaccespser.model.ClassificazioneGiuridicaCespite;
import it.csi.siac.siaccespser.model.DettaglioAnteprimaAmmortamentoAnnuoCespite;
import it.csi.siac.siaccespser.model.DismissioneCespite;
import it.csi.siac.siaccespser.model.TipoBeneCespite;
import it.csi.siac.siaccespser.model.TipoBeneCespiteModelDetail;
import it.csi.siac.siaccespser.model.VariazioneCespiteModelDetail;
import it.csi.siac.siacfin2ser.model.AccertamentoModelDetail;
import it.csi.siac.siacfin2ser.model.AllegatoAttoModelDetail;
import it.csi.siac.siacfin2ser.model.CapitoloEntrataGestioneModelDetail;
import it.csi.siac.siacfin2ser.model.CapitoloEntrataPrevisioneModelDetail;
import it.csi.siac.siacfin2ser.model.CapitoloUscitaGestioneModelDetail;
import it.csi.siac.siacfin2ser.model.CapitoloUscitaPrevisioneModelDetail;
import it.csi.siac.siacfin2ser.model.DocumentoEntrataModelDetail;
import it.csi.siac.siacfin2ser.model.DocumentoSpesaModelDetail;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegatoModelDetail;
import it.csi.siac.siacfin2ser.model.ImpegnoModelDetail;
import it.csi.siac.siacfin2ser.model.LiquidazioneModelDetail;
import it.csi.siac.siacfin2ser.model.PreDocumentoEntrataModelDetail;
import it.csi.siac.siacfin2ser.model.PreDocumentoSpesaModelDetail;
import it.csi.siac.siacfin2ser.model.SubAccertamentoModelDetail;
import it.csi.siac.siacfin2ser.model.SubImpegnoModelDetail;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrataModelDetail;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesaModelDetail;
import it.csi.siac.siacfin2ser.model.TipoOnereModelDetail;
import it.csi.siac.siacgenser.model.CausaleEPModelDetail;
import it.csi.siac.siacgenser.model.ClassificatoreGSAModelDetail;
import it.csi.siac.siacgenser.model.ContoModelDetail;
import it.csi.siac.siacgenser.model.MovimentoDettaglio;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaCespite extends RicercaSinteticaBaseRequest {

	private Cespite cespite;
	
	private TipoBeneCespite tipoBeneCespite;
	private ClassificazioneGiuridicaCespite classificazioneGiuridicaCespite;
	private DismissioneCespite dismissioneCespite;
	
	private Integer numeroInventarioDa;
	private Integer numeroInventarioA;
	
	private Boolean escludiCespitiCollegatiADismissione;
	private Boolean conPianoAmmortamentoCompleto;
	
	private Integer massimoAnnoAmmortato;
	
	private DettaglioAnteprimaAmmortamentoAnnuoCespite dettaglioAnteprimaAmmortamentoAnnuoCespite;
	
	private CategoriaCespiti categoriaCespiti;
	
	private AnteprimaAmmortamentoAnnuoCespite anteprimaAmmortamentoAnnuoCespite;
	
	private MovimentoDettaglio movimentoDettaglio;
	
	
	@XmlElementWrapper(name="modelDetails")
	@XmlElements({
		@XmlElement(name="accantonamentoFondiDubbiaEsigibilitaModelDetail", type=AccantonamentoFondiDubbiaEsigibilitaModelDetail.class),
		@XmlElement(name="accantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail", type=AccantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail.class),
		@XmlElement(name="accertamentoModelDetail", type=AccertamentoModelDetail.class),
		@XmlElement(name="allegatoAttoModelDetail", type=AllegatoAttoModelDetail.class),
		@XmlElement(name="attoAmministrativoModelDetail", type=AttoAmministrativoModelDetail.class),
		@XmlElement(name="capitoloEntrataGestioneModelDetail", type=CapitoloEntrataGestioneModelDetail.class),
		@XmlElement(name="capitoloEntrataPrevisioneModelDetail", type=CapitoloEntrataPrevisioneModelDetail.class),
		@XmlElement(name="capitoloUscitaGestioneModelDetail", type=CapitoloUscitaGestioneModelDetail.class),
		@XmlElement(name="capitoloUscitaPrevisioneModelDetail", type=CapitoloUscitaPrevisioneModelDetail.class),
		@XmlElement(name="categoriaCespitiModelDetail", type=CategoriaCespitiModelDetail.class),
		@XmlElement(name="causaleEPModelDetail", type=CausaleEPModelDetail.class),
		@XmlElement(name="cespiteModelDetail", type=CespiteModelDetail.class),
		@XmlElement(name="classificatoreGSAModelDetail", type=ClassificatoreGSAModelDetail.class),
		@XmlElement(name="contoModelDetail", type=ContoModelDetail.class),
		@XmlElement(name="documentoEntrataModelDetail", type=DocumentoEntrataModelDetail.class),
		@XmlElement(name="documentoSpesaModelDetail", type=DocumentoSpesaModelDetail.class),
		@XmlElement(name="elencoDocumentiAllegatoModelDetail", type=ElencoDocumentiAllegatoModelDetail.class),
		@XmlElement(name="impegnoModelDetail", type=ImpegnoModelDetail.class),
		@XmlElement(name="liquidazioneModelDetail", type=LiquidazioneModelDetail.class),
		@XmlElement(name="preDocumentoEntrataModelDetail", type=PreDocumentoEntrataModelDetail.class),
		@XmlElement(name="preDocumentoSpesaModelDetail", type=PreDocumentoSpesaModelDetail.class),
		@XmlElement(name="richiestaEconomaleModelDetail", type=RichiestaEconomaleModelDetail.class),
		@XmlElement(name="stampeCassaFileModelDetail", type=StampeCassaFileModelDetail.class),
		@XmlElement(name="subAccertamentoModelDetail", type=SubAccertamentoModelDetail.class),
		@XmlElement(name="subdocumentoEntrataModelDetail", type=SubdocumentoEntrataModelDetail.class),
		@XmlElement(name="subdocumentoSpesaModelDetail", type=SubdocumentoSpesaModelDetail.class),
		@XmlElement(name="subImpegnoModelDetail", type=SubImpegnoModelDetail.class),
		@XmlElement(name="tipoBeneCespiteModelDetail", type=TipoBeneCespiteModelDetail.class),
		@XmlElement(name="tipoOnereModelDetail", type=TipoOnereModelDetail.class),
		@XmlElement(name="variazioneCespiteModelDetail", type=VariazioneCespiteModelDetail.class),
		@XmlElement(name="variazioneImportoCapitoloModelDetail", type=VariazioneImportoCapitoloModelDetail.class),
		@XmlElement(name="ammortamentoannuoCespiteModelDetail", type=AmmortamentoAnnuoCespiteModelDetail.class)
	})
	private ModelDetail[] modelDetails;

	/**
	 * @return the cespite
	 */
	public Cespite getCespite() {
		return this.cespite;
	}

	/**
	 * @param cespite the cespite to set
	 */
	public void setCespite(Cespite cespite) {
		this.cespite = cespite;
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
	 * @return the dismissioneCespite
	 */
	public DismissioneCespite getDismissioneCespite() {
		return this.dismissioneCespite;
	}

	/**
	 * @param dismissioneCespite the dismissioneCespite to set
	 */
	public void setDismissioneCespite(DismissioneCespite dismissioneCespite) {
		this.dismissioneCespite = dismissioneCespite;
	}

	/**
	 * @return the numeroInventarioDa
	 */
	public Integer getNumeroInventarioDa() {
		return this.numeroInventarioDa;
	}

	/**
	 * @param numeroInventarioDa the numeroInventarioDa to set
	 */
	public void setNumeroInventarioDa(Integer numeroInventarioDa) {
		this.numeroInventarioDa = numeroInventarioDa;
	}

	/**
	 * @return the numeroInventarioA
	 */
	public Integer getNumeroInventarioA() {
		return this.numeroInventarioA;
	}

	/**
	 * @param numeroInventarioA the numeroInventarioA to set
	 */
	public void setNumeroInventarioA(Integer numeroInventarioA) {
		this.numeroInventarioA = numeroInventarioA;
	}
	
	
	/**
	 * @return the escludiCespitiCollegatiADismissione
	 */
	public Boolean getEscludiCespitiCollegatiADismissione() {
		return escludiCespitiCollegatiADismissione;
	}

	/**
	 * @param escludiCespitiCollegatiADismissione the escludiCespitiCollegatiADismissione to set
	 */
	public void setEscludiCespitiCollegatiADismissione(Boolean escludiCespitiCollegatiADismissione) {
		this.escludiCespitiCollegatiADismissione = escludiCespitiCollegatiADismissione;
	}

	
	
	/**
	 * @return the escludiCespitiConPianoAmmortamentoCompleto
	 */
	public Boolean getConPianoAmmortamentoCompleto() {
		return conPianoAmmortamentoCompleto;
	}

	/**
	 * Sets the con piano ammortamento completo.
	 *
	 * @param conPianoAmmortamentoCompleto the new con piano ammortamento completo
	 */
	public void setConPianoAmmortamentoCompleto(Boolean conPianoAmmortamentoCompleto) {
		this.conPianoAmmortamentoCompleto = conPianoAmmortamentoCompleto;
	}
	
	/**
	 * @return the massimoAnnoAmmortato
	 */
	public Integer getMassimoAnnoAmmortato() {
		return massimoAnnoAmmortato;
	}

	/**
	 * @param massimoAnnoAmmortato the massimoAnnoAmmortato to set
	 */
	public void setMassimoAnnoAmmortato(Integer massimoAnnoAmmortato) {
		this.massimoAnnoAmmortato = massimoAnnoAmmortato;
	}
	

	/**
	 * @return the dettaglioAnteprimaAmmortamentoAnnuoCespite
	 */
	public DettaglioAnteprimaAmmortamentoAnnuoCespite getDettaglioAnteprimaAmmortamentoAnnuoCespite() {
		return dettaglioAnteprimaAmmortamentoAnnuoCespite;
	}

	/**
	 * @param dettaglioAnteprimaAmmortamentoAnnuoCespite the dettaglioAnteprimaAmmortamentoAnnuoCespite to set
	 */
	public void setDettaglioAnteprimaAmmortamentoAnnuoCespite(
			DettaglioAnteprimaAmmortamentoAnnuoCespite dettaglioAnteprimaAmmortamentoAnnuoCespite) {
		this.dettaglioAnteprimaAmmortamentoAnnuoCespite = dettaglioAnteprimaAmmortamentoAnnuoCespite;
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
	 * @return the anteprimaAmmortamentoAnnuoCespite
	 */
	public AnteprimaAmmortamentoAnnuoCespite getAnteprimaAmmortamentoAnnuoCespite() {
		return anteprimaAmmortamentoAnnuoCespite;
	}

	/**
	 * @param anteprimaAmmortamentoAnnuoCespite the anteprimaAmmortamentoAnnuoCespite to set
	 */
	public void setAnteprimaAmmortamentoAnnuoCespite(AnteprimaAmmortamentoAnnuoCespite anteprimaAmmortamentoAnnuoCespite) {
		this.anteprimaAmmortamentoAnnuoCespite = anteprimaAmmortamentoAnnuoCespite;
	}
	
	/**
	 * @return the movimentoDettaglio
	 */
	public MovimentoDettaglio getMovimentoDettaglio() {
		return movimentoDettaglio;
	}

	/**
	 * @param movimentoDettaglio the movimentoDettaglio to set
	 */
	public void setMovimentoDettaglio(MovimentoDettaglio movimentoDettaglio) {
		this.movimentoDettaglio = movimentoDettaglio;
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
