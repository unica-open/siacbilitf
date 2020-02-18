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

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseRequest;
import it.csi.siac.siacbilser.model.ModelDetail;
import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.CespiteModelDetail;
import it.csi.siac.siaccespser.model.TipoBeneCespiteModelDetail;
import it.csi.siac.siacgenser.model.CausaleEPModelDetail;
import it.csi.siac.siacgenser.model.ContoModelDetail;
import it.csi.siac.siacgenser.model.MovimentoDettaglioModelDetail;
import it.csi.siac.siacgenser.model.MovimentoEPModelDetail;
import it.csi.siac.siacgenser.model.PrimaNota;
import it.csi.siac.siacgenser.model.PrimaNotaModelDetail;
import it.csi.siac.siacgenser.model.RegistrazioneMovFinModelDetail;

/**
 * Ricerca sintetica per il registro A
 * @author Marchino Alessandro
 * @version 1.0.0 - 16/10/2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaMovimentoDettaglioRegistroACespite extends RicercaSinteticaBaseRequest {

	// Unione di RicercaSintenticaPrimaNota e RicercaSinteticaPrimaNotaIntegrata
	private PrimaNota primaNota;	
	
	@XmlElementWrapper(name="modelDetails")
	@XmlElements({
		@XmlElement(name="primaNotaModelDetail", type=PrimaNotaModelDetail.class),
		@XmlElement(name="cespiteModelDetail", type=CespiteModelDetail.class),
		@XmlElement(name="movimentoEpModelDetail", type=MovimentoEPModelDetail.class),
		@XmlElement(name="movimentoDettaglioModelDetail", type=MovimentoDettaglioModelDetail.class),
		@XmlElement(name="cespiteModelDetail", type=CespiteModelDetail.class),
		@XmlElement(name="tipoBeneCespiteModelDetail", type=TipoBeneCespiteModelDetail.class),
		@XmlElement(name="registrazioneMovFinModelDetail", type=RegistrazioneMovFinModelDetail.class),
		@XmlElement(name="contoModelDetail", type=ContoModelDetail.class),
		@XmlElement(name="causaleEPModelDetail", type=CausaleEPModelDetail.class),
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
