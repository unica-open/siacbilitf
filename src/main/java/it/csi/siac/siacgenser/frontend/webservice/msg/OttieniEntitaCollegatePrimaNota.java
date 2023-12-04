/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativoModelDetail;
import it.csi.siac.siacbilser.model.VariazioneImportoCapitoloModelDetail;
import it.csi.siac.siacbilser.model.fcde.modeldetail.AccantonamentoFondiDubbiaEsigibilitaModelDetail;
import it.csi.siac.siacbilser.model.fcde.modeldetail.AccantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail;
import it.csi.siac.siaccecser.model.RichiestaEconomaleModelDetail;
import it.csi.siac.siaccecser.model.StampeCassaFileModelDetail;
import it.csi.siac.siaccespser.model.CategoriaCespitiModelDetail;
import it.csi.siac.siaccespser.model.CespiteModelDetail;
import it.csi.siac.siaccespser.model.TipoBeneCespiteModelDetail;
import it.csi.siac.siaccespser.model.VariazioneCespiteModelDetail;
import it.csi.siac.siaccommon.model.ModelDetailEnum;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
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
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.CausaleEPModelDetail;
import it.csi.siac.siacgenser.model.ClassificatoreGSAModelDetail;
import it.csi.siac.siacgenser.model.ContoModelDetail;
import it.csi.siac.siacgenser.model.PrimaNota;
import it.csi.siac.siacgenser.model.TipoCollegamento;

/**
 * Classe di request per il servizio di recupero entit&agrave; collegate alla prima nota
 * @author Alessandro Marchino
 *
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class OttieniEntitaCollegatePrimaNota extends ServiceRequest {

	private PrimaNota primaNota;
	private TipoCollegamento tipoCollegamento;
	private ParametriPaginazione parametriPaginazione;
	
	@XmlElementWrapper(name="modelDetailEnums")
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
	private ModelDetailEnum[] modelDetailEnums;

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
	 * @return the tipoCollegamento
	 */
	public TipoCollegamento getTipoCollegamento() {
		return tipoCollegamento;
	}

	/**
	 * @param tipoCollegamento the tipoCollegamento to set
	 */
	public void setTipoCollegamento(TipoCollegamento tipoCollegamento) {
		this.tipoCollegamento = tipoCollegamento;
	}

	/**
	 * @return the modelDetailEnums
	 */
	@XmlTransient
	public ModelDetailEnum[] getModelDetails() {
		return modelDetailEnums;
	}

	/**
	 * @param modelDetailEnums the modelDetailEnums to set
	 */
	public void setModelDetails(ModelDetailEnum... modelDetails) {
		this.modelDetailEnums = modelDetails;
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
	
}
