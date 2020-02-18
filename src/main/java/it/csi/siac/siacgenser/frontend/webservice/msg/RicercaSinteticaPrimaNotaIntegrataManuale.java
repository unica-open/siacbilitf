/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubAccertamento;
import it.csi.siac.siacfinser.model.SubImpegno;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaPrimaNotaIntegrataManuale extends RicercaSinteticaPrimaNota {

	@XmlElements({
		@XmlElement(name = "subImpegno", type = SubImpegno.class),
		@XmlElement(name = "impegno", type = Impegno.class),
		@XmlElement(name = "subAccertamento", type = SubAccertamento.class),
		@XmlElement(name = "accertamento", type = Accertamento.class)
	})
	private Entita entita;

	/**
	 * @return the entita
	 */
	@XmlTransient
	public Entita getEntita() {
		return this.entita;
	}

	/**
	 * @param entita the entita to set
	 */
	public void setEntita(Entita entita) {
		this.entita = entita;
	}

}
