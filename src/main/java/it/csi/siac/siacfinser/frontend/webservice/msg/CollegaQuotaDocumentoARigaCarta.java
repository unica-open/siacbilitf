/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.carta.CartaContabile;
import it.csi.siac.siacfinser.model.carta.PreDocumentoCarta;


/**
 * 
 * @author andrea.colombo
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class CollegaQuotaDocumentoARigaCarta extends ServiceRequest {
	
	private Ente ente;
	private Bilancio bilancio;
	
	private SubdocumentoSpesa subDocumentoDaCollegare;
	
	private PreDocumentoCarta rigaCarta;
	
	private CartaContabile cartaContabile;
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public Bilancio getBilancio() {
		return bilancio;
	}
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	public SubdocumentoSpesa getSubDocumentoDaCollegare() {
		return subDocumentoDaCollegare;
	}
	public void setSubDocumentoDaCollegare(SubdocumentoSpesa subDocumentoDaCollegare) {
		this.subDocumentoDaCollegare = subDocumentoDaCollegare;
	}
	public PreDocumentoCarta getRigaCarta() {
		return rigaCarta;
	}
	public void setRigaCarta(PreDocumentoCarta rigaCarta) {
		this.rigaCarta = rigaCarta;
	}
	public CartaContabile getCartaContabile() {
		return cartaContabile;
	}
	public void setCartaContabile(CartaContabile cartaContabile) {
		this.cartaContabile = cartaContabile;
	}
}
