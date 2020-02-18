/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.PrimaNota;

import javax.xml.bind.annotation.XmlType;

/**
 * @author elisa
 * @version 1.0.0 - 20-11-2018
 *
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RifiutaPrimaNotaSuRegistroACespiteResponse extends ServiceResponse {

	private PrimaNota primaNotaContabilitaGenerale;
	private PrimaNota primaNotaInventario;
	
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
	
}
