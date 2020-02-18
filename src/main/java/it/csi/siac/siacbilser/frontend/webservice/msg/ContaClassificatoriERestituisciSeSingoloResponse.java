/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.SiopeEntrata;
import it.csi.siac.siacbilser.model.SiopeSpesa;
import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class ContaClassificatoriERestituisciSeSingoloResponse extends ServiceResponse {
	
	@XmlElements({
		@XmlElement(name = "siopeSpesa", type = SiopeSpesa.class),
		@XmlElement(name = "siopeEntrata", type = SiopeEntrata.class),
	})
	private Codifica codifica;
	private Long count;
	/**
	 * @return the codifica
	 */
	@XmlTransient
	public Codifica getCodifica() {
		return codifica;
	}
	/**
	 * @param codifica the codifica to set
	 */
	public void setCodifica(Codifica codifica) {
		this.codifica = codifica;
	}
	/**
	 * @return the count
	 */
	public Long getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(Long count) {
		this.count = count;
	}

}
