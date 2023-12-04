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
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubImpegno;

//TODO Completare parametri e commenti

/**
 * <ModificaCigBackoffice xmlns="http://siac.csi.it/...">
 * 		<impegno>...</impegno>
 * 		<tipoModifica>...</tipoModifica>
 * </ModificaCigBackoffice>
 * */

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class ModificaCigBackoffice extends ServiceRequest {

	@XmlElements({
		@XmlElement(name = "subImpegno", type = SubImpegno.class),
		@XmlElement(name = "impegno", type = Impegno.class) 
		})
	private Impegno impegno;
	private TipoModificaBackofficeCig tipoModifica;
	
	// Evolutiva BackofficeModificaCigRemedy
	private String numeroRemedy;
	
	/**
	 * @return the impegno
	 */
	@XmlTransient
	public Impegno getImpegno() {
		return impegno;
	}

	/**
	 * @param impegno the impegno to set
	 */
	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

	/**
	 * @return the tipoModifica
	 */
	public TipoModificaBackofficeCig getTipoModifica() {
		return tipoModifica;
	}

	/**
	 * @param tipoModifica the tipoModifica to set
	 */
	public void setTipoModifica(TipoModificaBackofficeCig tipoModifica) {
		this.tipoModifica = tipoModifica;
	}

	public static enum TipoModificaBackofficeCig {
		MOVIMENTO("Movimento associato"), QUOTE_E_LIQUIDAZIONI_SENZA_ORDINATIVI_COLLEGATI("Quote e liquidazioni senza ordinativi collegati");
		
		private final String descrizione;
		
		private TipoModificaBackofficeCig(String descrizione) {
			this.descrizione = descrizione;
		}

		/**
		 * @return the descrizione
		 */
		public String getDescrizione() {
			return descrizione;
		}

	}
	/**
	 * @return the numeroRemedy
	 */
	public String getNumeroRemedy() {
		return numeroRemedy;
	}
	/**
	 * @param numeroRemedy the numeroRemedy to set
	 */
	public void setNumeroRemedy(String numeroRemedy) {
		this.numeroRemedy = numeroRemedy;
	}
	
}
