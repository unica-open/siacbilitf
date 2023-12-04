/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;

import it.csi.siac.siacattser.model.AttoAmministrativoModelDetail;
import it.csi.siac.siacbilser.model.ComponenteImportiCapitoloModelDetail;
import it.csi.siac.siacbilser.model.DettaglioVariazioneComponenteImportoCapitoloModelDetail;
import it.csi.siac.siacbilser.model.QuadroEconomicoModelDetail;
import it.csi.siac.siacbilser.model.VariazioneImportoCapitoloModelDetail;
import it.csi.siac.siacbilser.model.fcde.modeldetail.AccantonamentoFondiDubbiaEsigibilitaModelDetail;
import it.csi.siac.siacbilser.model.fcde.modeldetail.AccantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail;
import it.csi.siac.siaccecser.model.RichiestaEconomaleModelDetail;
import it.csi.siac.siaccecser.model.StampeCassaFileModelDetail;
import it.csi.siac.siaccespser.model.AmmortamentoAnnuoCespiteModelDetail;
import it.csi.siac.siaccespser.model.CategoriaCespitiModelDetail;
import it.csi.siac.siaccespser.model.CespiteModelDetail;
import it.csi.siac.siaccespser.model.DettaglioAmmortamentoAnnuoCespiteModelDetail;
import it.csi.siac.siaccespser.model.DismissioneCespiteModelDetail;
import it.csi.siac.siaccespser.model.TipoBeneCespiteModelDetail;
import it.csi.siac.siaccespser.model.VariazioneCespiteModelDetail;
import it.csi.siac.siaccommon.model.ModelDetailEnum;
import it.csi.siac.siaccorser.model.ServiceRequest;
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
import it.csi.siac.siacfin2ser.model.SubdocumentoIvaModelDetail;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesaModelDetail;
import it.csi.siac.siacfin2ser.model.TipoComponenteImportiCapitoloModelDetail;
import it.csi.siac.siacfin2ser.model.TipoOnereModelDetail;
import it.csi.siac.siacgenser.model.CausaleEPModelDetail;
import it.csi.siac.siacgenser.model.ClassificatoreGSAModelDetail;
import it.csi.siac.siacgenser.model.ContoModelDetail;
import it.csi.siac.siacgenser.model.MovimentoDettaglioModelDetail;
import it.csi.siac.siacgenser.model.MovimentoEPModelDetail;
import it.csi.siac.siacgenser.model.PrimaNotaModelDetail;
import it.csi.siac.siacgenser.model.ProgettoModelDetail;
import it.csi.siac.siacgenser.model.RegistrazioneMovFinModelDetail;

public class ModelDetailAwareServiceRequest extends ServiceRequest {

	@XmlElementWrapper(name="modelDetailEnums")
	@XmlElements({
		@XmlElement(name="accantonamentoFondiDubbiaEsigibilitaModelDetail", type=AccantonamentoFondiDubbiaEsigibilitaModelDetail.class),
		@XmlElement(name="accantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail", type=AccantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail.class),
		@XmlElement(name="accertamentoModelDetail", type=AccertamentoModelDetail.class),
		@XmlElement(name="allegatoAttoModelDetail", type=AllegatoAttoModelDetail.class),
		@XmlElement(name="ammortamentoAnnuoCespiteModelDetail", type=AmmortamentoAnnuoCespiteModelDetail.class),
		@XmlElement(name="attoAmministrativoModelDetail", type=AttoAmministrativoModelDetail.class),
		@XmlElement(name="capitoloEntrataGestioneModelDetail", type=CapitoloEntrataGestioneModelDetail.class),
		@XmlElement(name="capitoloEntrataPrevisioneModelDetail", type=CapitoloEntrataPrevisioneModelDetail.class),
		@XmlElement(name="capitoloUscitaGestioneModelDetail", type=CapitoloUscitaGestioneModelDetail.class),
		@XmlElement(name="capitoloUscitaPrevisioneModelDetail", type=CapitoloUscitaPrevisioneModelDetail.class),
		@XmlElement(name="categoriaCespitiModelDetail", type=CategoriaCespitiModelDetail.class),
		@XmlElement(name="causaleEPModelDetail", type=CausaleEPModelDetail.class),
		@XmlElement(name="cespiteModelDetail", type=CespiteModelDetail.class),
		@XmlElement(name="classificatoreGSAModelDetail", type=ClassificatoreGSAModelDetail.class),
		@XmlElement(name="componenteImportiCapitoloModelDetail", type=ComponenteImportiCapitoloModelDetail.class),
		@XmlElement(name="contoModelDetail", type=ContoModelDetail.class),
		@XmlElement(name="dettaglioAmmortamentoAnnuoCespiteModelDetail", type=DettaglioAmmortamentoAnnuoCespiteModelDetail.class),
		@XmlElement(name="dettaglioVariazioneComponenteImportoCapitoloModelDetail", type=DettaglioVariazioneComponenteImportoCapitoloModelDetail.class),
		@XmlElement(name="dismissioneCespiteModelDetail", type=DismissioneCespiteModelDetail.class),
		@XmlElement(name="documentoEntrataModelDetail", type=DocumentoEntrataModelDetail.class),
		@XmlElement(name="documentoSpesaModelDetail", type=DocumentoSpesaModelDetail.class),
		@XmlElement(name="elencoDocumentiAllegatoModelDetail", type=ElencoDocumentiAllegatoModelDetail.class),
		@XmlElement(name="impegnoModelDetail", type=ImpegnoModelDetail.class),
		@XmlElement(name="liquidazioneModelDetail", type=LiquidazioneModelDetail.class),
		@XmlElement(name="movimentoDettaglioModelDetail", type=MovimentoDettaglioModelDetail.class),
		@XmlElement(name="movimentoEPModelDetail", type=MovimentoEPModelDetail.class),
		@XmlElement(name="preDocumentoEntrataModelDetail", type=PreDocumentoEntrataModelDetail.class),
		@XmlElement(name="preDocumentoSpesaModelDetail", type=PreDocumentoSpesaModelDetail.class),
		@XmlElement(name="primaNotaModelDetail", type=PrimaNotaModelDetail.class),
		@XmlElement(name="progettoModelDetail", type=ProgettoModelDetail.class),
		@XmlElement(name="quadroEconomicoModelDetail", type=QuadroEconomicoModelDetail.class),
		@XmlElement(name="registrazioneMovFinModelDetail", type=RegistrazioneMovFinModelDetail.class),
		@XmlElement(name="richiestaEconomaleModelDetail", type=RichiestaEconomaleModelDetail.class),
		@XmlElement(name="stampeCassaFileModelDetail", type=StampeCassaFileModelDetail.class),
		@XmlElement(name="subAccertamentoModelDetail", type=SubAccertamentoModelDetail.class),
		@XmlElement(name="subdocumentoEntrataModelDetail", type=SubdocumentoEntrataModelDetail.class),
		@XmlElement(name="subdocumentoIvaModelDetail", type=SubdocumentoIvaModelDetail.class),
		@XmlElement(name="subdocumentoSpesaModelDetail", type=SubdocumentoSpesaModelDetail.class),
		@XmlElement(name="subImpegnoModelDetail", type=SubImpegnoModelDetail.class),
		@XmlElement(name="tipoBeneCespiteModelDetail", type=TipoBeneCespiteModelDetail.class),
		@XmlElement(name="tipoComponenteImportiCapitoloModelDetail", type=TipoComponenteImportiCapitoloModelDetail.class),
		@XmlElement(name="tipoOnereModelDetail", type=TipoOnereModelDetail.class),
		@XmlElement(name="variazioneCespiteModelDetail", type=VariazioneCespiteModelDetail.class),
		@XmlElement(name="variazioneImportoCapitoloModelDetail", type=VariazioneImportoCapitoloModelDetail.class)
	})
	private ModelDetailEnum[] modelDetailEnums;
	
	/**
	 * @return the modelDetailEnums
	 */
	@XmlTransient
	public ModelDetailEnum[] getModelDetails() {
		return this.modelDetailEnums;
	}

	/**
	 * @param modelDetailEnums the modelDetailEnums to set
	 */
	public void setModelDetails(ModelDetailEnum... modelDetails) {
		this.modelDetailEnums = modelDetails;
	}
}
