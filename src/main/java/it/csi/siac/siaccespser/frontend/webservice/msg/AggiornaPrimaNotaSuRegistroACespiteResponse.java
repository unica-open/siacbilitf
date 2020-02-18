/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.PrimaNota;

/**
 * The Class InserisciPrimaNotaSuRegistroACespiteResponse.
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class AggiornaPrimaNotaSuRegistroACespiteResponse extends ServiceResponse {

	private PrimaNota primaNotaContabilitaGenerale;
	private PrimaNota primaNotaInventario;
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	
	/**
	 * @return the primaNotaContabilitaGenerale
	 */
	public PrimaNota getPrimaNotaContabilitaGenerale() {
		return primaNotaContabilitaGenerale;
	}
	/**
	 * @param primaNotaContabilitaGenerale the primaNotaContabilitaGenerale to set
	 */
	public void setPrimaNotaContabilitaGenerale(PrimaNota primaNotaContabilitaGenerale) {
		this.primaNotaContabilitaGenerale = primaNotaContabilitaGenerale;
	}
	/**
	 * @return the primaNotaInventario
	 */
	public PrimaNota getPrimaNotaInventario() {
		return primaNotaInventario;
	}
	/**
	 * @param primaNotaInventario the primaNotaInventario to set
	 */
	public void setPrimaNotaInventario(PrimaNota primaNotaInventario) {
		this.primaNotaInventario = primaNotaInventario;
	}
	/**
	 * @return the messaggi
	 */
	public List<Messaggio> getMessaggi() {
		return messaggi;
	}
	/**
	 * @param messaggi the messaggi to set
	 */
	public void setMessaggi(List<Messaggio> messaggi) {
		this.messaggi = messaggi;
	}
	
	
	/**
	 * Adds the messaggio.
	 *
	 * @param messaggio the messaggio
	 */
	public void addMessaggio(Messaggio messaggio) {
		if(messaggi == null) {
			setMessaggi(new ArrayList<Messaggio>());
		}
		messaggi.add(messaggio);
	}

}
