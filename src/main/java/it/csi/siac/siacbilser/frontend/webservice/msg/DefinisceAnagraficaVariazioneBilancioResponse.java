/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.VariazioneImportoCapitolo;
import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class DefinisceAnagraficaVariazioneBilancioResponse extends ServiceResponse {
	
	private VariazioneImportoCapitolo  variazioneImportoCapitolo;
	private Boolean isQuadraturaCorrettaStanziamento = Boolean.FALSE;
	private Boolean isQuadraturaCorrettaStanziamentoCassa = Boolean.FALSE;
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();


	public VariazioneImportoCapitolo getVariazioneImportoCapitolo() {
		return variazioneImportoCapitolo;
	}

	public void setVariazioneImportoCapitolo(VariazioneImportoCapitolo variazioneImportoCapitolo) {
		this.variazioneImportoCapitolo = variazioneImportoCapitolo;
	}

	public Boolean getIsQuadraturaCorrettaStanziamentoCassa() {
		return isQuadraturaCorrettaStanziamentoCassa;
	}

	public void setIsQuadraturaCorrettaStanziamentoCassa(Boolean isQuadraturaCorrettaStanziamentoCassa) {
		this.isQuadraturaCorrettaStanziamentoCassa = isQuadraturaCorrettaStanziamentoCassa;
	}

	public Boolean getIsQuadraturaCorrettaStanziamento() {
		return isQuadraturaCorrettaStanziamento;
	}

	public void setIsQuadraturaCorrettaStanziamento(Boolean isQuadraturaCorrettaStanziamento) {
		this.isQuadraturaCorrettaStanziamento = isQuadraturaCorrettaStanziamento;
	}

	/**
	 * @return messaggi
	 */
	public List<Messaggio> getMessaggi() {
		return messaggi;
	}

	/**
	 * @param messaggi the messaggi to set
	 */
	public void setMessaggi(List<Messaggio> messaggi) {
		this.messaggi = messaggi != null ? messaggi : new ArrayList<Messaggio>();
	}
	
	


}
