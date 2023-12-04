/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ClassificazioneCofog;
import it.csi.siac.siacbilser.model.Programma;
import it.csi.siac.siaccorser.frontend.webservice.msg.LeggiClassificatoriByIdPadreResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Messaggio di risposta per la lista dei classificatori ricercati per: 
 * anno, idEnteProprietario e idPadre 
 * (es: ricerco i Programmi per l'idMissione)
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class LeggiClassificatoriGerarchiciByIdPadreResponse extends
		LeggiClassificatoriByIdPadreResponse {

	private List<Programma> classificatoriProgramma = new ArrayList<Programma>();
	private List<ClassificazioneCofog> classificatoriCofog = new ArrayList<ClassificazioneCofog>();

	public List<Programma> getClassificatoriProgramma() {
		return classificatoriProgramma;
	}

	public void setClassificatoriProgramma(
			List<Programma> classificatoriProgramma) {
		this.classificatoriProgramma = classificatoriProgramma;
	}

	public List<ClassificazioneCofog> getClassificatoriCofog() {
		return classificatoriCofog;
	}

	public void setClassificatoriCofog(
			List<ClassificazioneCofog> classificatoriCofog) {
		this.classificatoriCofog = classificatoriCofog;
	}

}
