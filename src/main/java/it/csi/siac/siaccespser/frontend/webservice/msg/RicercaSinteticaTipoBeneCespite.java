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
import it.csi.siac.siaccespser.model.CategoriaCespiti;
import it.csi.siac.siaccespser.model.CategoriaCespitiModelDetail;
import it.csi.siac.siaccespser.model.CespiteModelDetail;
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
import it.csi.siac.siacgenser.model.Conto;
import it.csi.siac.siacgenser.model.ContoModelDetail;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaTipoBeneCespite extends RicercaSinteticaBaseRequest {
	
	private TipoBeneCespite  tipoBeneCespite;
	private Conto contoPatrimoniale;
	private CategoriaCespiti categoriaCespiti;
	
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
		@XmlElement(name="variazioneImportoCapitoloModelDetail", type=VariazioneImportoCapitoloModelDetail.class)
	})
	private ModelDetail[] modelDetails;

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
	 * @return the contoPatrimoniale
	 */
	public Conto getContoPatrimoniale() {
		return this.contoPatrimoniale;
	}

	/**
	 * @param contoPatrimoniale the contoPatrimoniale to set
	 */
	public void setContoPatrimoniale(Conto contoPatrimoniale) {
		this.contoPatrimoniale = contoPatrimoniale;
	}

	/**
	 * @return the categoriaCespiti
	 */
	public CategoriaCespiti getCategoriaCespiti() {
		return this.categoriaCespiti;
	}

	/**
	 * @param categoriaCespiti the categoriaCespiti to set
	 */
	public void setCategoriaCespiti(CategoriaCespiti categoriaCespiti) {
		this.categoriaCespiti = categoriaCespiti;
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
