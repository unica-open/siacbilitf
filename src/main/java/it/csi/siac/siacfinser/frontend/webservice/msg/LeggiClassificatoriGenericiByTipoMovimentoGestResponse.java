/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Messaggio di risposta per la lista dei classificatori ricercati per: 
 * anno
 * idEnteProprietario 
 * codiceMovimentoGestione
 * 
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class LeggiClassificatoriGenericiByTipoMovimentoGestResponse extends
		ServiceResponse {

	/**
	 * Classificatori generici dell'IMPEGNO
	 * 
	 * IN CORSO DI SVILUPPO AGGIUNGERE QUELLI CHE MANCANO
	 */
	private List<ClassificatoreGenerico> classificatoriGenerici11 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici12 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici13 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici14 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici15 = new ArrayList<ClassificatoreGenerico>();
	
	/**
	 * Classificatori generici dell'ACCERTAMENTO
	 * 
	 * IN CORSO DI SVILUPPO AGGIUNGERE QUELLI CHE MANCANO
	 */
	private List<ClassificatoreGenerico> classificatoriGenerici16 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici17 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici18 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici19 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici20 = new ArrayList<ClassificatoreGenerico>();
	
	
	/**
	 * Classificatori generici dell'ORDINATIVO PAGAMENTO
	 * 
	 * IN CORSO DI SVILUPPO AGGIUNGERE QUELLI CHE MANCANO
	 */
	private List<ClassificatoreGenerico> classificatoriGenerici21 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici22 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici23 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici24 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici25 = new ArrayList<ClassificatoreGenerico>();
	
	
	
	/**
	 * Classificatori generici dell'ORDINATIVO INCASSO
	 * 
	 * IN CORSO DI SVILUPPO AGGIUNGERE QUELLI CHE MANCANO
	 */
	private List<ClassificatoreGenerico> classificatoriGenerici26 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici27 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici28 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici29 = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGenerico> classificatoriGenerici30 = new ArrayList<ClassificatoreGenerico>();
	
	
	public List<ClassificatoreGenerico> getClassificatoriGenerici11() {
		return classificatoriGenerici11;
	}
	public void setClassificatoriGenerici11(
			List<ClassificatoreGenerico> classificatoriGenerici11) {
		this.classificatoriGenerici11 = classificatoriGenerici11;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici12() {
		return classificatoriGenerici12;
	}
	public void setClassificatoriGenerici12(
			List<ClassificatoreGenerico> classificatoriGenerici12) {
		this.classificatoriGenerici12 = classificatoriGenerici12;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici13() {
		return classificatoriGenerici13;
	}
	public void setClassificatoriGenerici13(
			List<ClassificatoreGenerico> classificatoriGenerici13) {
		this.classificatoriGenerici13 = classificatoriGenerici13;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici14() {
		return classificatoriGenerici14;
	}
	public void setClassificatoriGenerici14(
			List<ClassificatoreGenerico> classificatoriGenerici14) {
		this.classificatoriGenerici14 = classificatoriGenerici14;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici15() {
		return classificatoriGenerici15;
	}
	public void setClassificatoriGenerici15(
			List<ClassificatoreGenerico> classificatoriGenerici15) {
		this.classificatoriGenerici15 = classificatoriGenerici15;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici16() {
		return classificatoriGenerici16;
	}
	public void setClassificatoriGenerici16(
			List<ClassificatoreGenerico> classificatoriGenerici16) {
		this.classificatoriGenerici16 = classificatoriGenerici16;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici17() {
		return classificatoriGenerici17;
	}
	public void setClassificatoriGenerici17(
			List<ClassificatoreGenerico> classificatoriGenerici17) {
		this.classificatoriGenerici17 = classificatoriGenerici17;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici18() {
		return classificatoriGenerici18;
	}
	public void setClassificatoriGenerici18(
			List<ClassificatoreGenerico> classificatoriGenerici18) {
		this.classificatoriGenerici18 = classificatoriGenerici18;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici19() {
		return classificatoriGenerici19;
	}
	public void setClassificatoriGenerici19(
			List<ClassificatoreGenerico> classificatoriGenerici19) {
		this.classificatoriGenerici19 = classificatoriGenerici19;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici20() {
		return classificatoriGenerici20;
	}
	public void setClassificatoriGenerici20(
			List<ClassificatoreGenerico> classificatoriGenerici20) {
		this.classificatoriGenerici20 = classificatoriGenerici20;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici21() {
		return classificatoriGenerici21;
	}
	public void setClassificatoriGenerici21(
			List<ClassificatoreGenerico> classificatoriGenerici21) {
		this.classificatoriGenerici21 = classificatoriGenerici21;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici22() {
		return classificatoriGenerici22;
	}
	public void setClassificatoriGenerici22(
			List<ClassificatoreGenerico> classificatoriGenerici22) {
		this.classificatoriGenerici22 = classificatoriGenerici22;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici23() {
		return classificatoriGenerici23;
	}
	public void setClassificatoriGenerici23(
			List<ClassificatoreGenerico> classificatoriGenerici23) {
		this.classificatoriGenerici23 = classificatoriGenerici23;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici24() {
		return classificatoriGenerici24;
	}
	public void setClassificatoriGenerici24(
			List<ClassificatoreGenerico> classificatoriGenerici24) {
		this.classificatoriGenerici24 = classificatoriGenerici24;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici25() {
		return classificatoriGenerici25;
	}
	public void setClassificatoriGenerici25(
			List<ClassificatoreGenerico> classificatoriGenerici25) {
		this.classificatoriGenerici25 = classificatoriGenerici25;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici26() {
		return classificatoriGenerici26;
	}
	public void setClassificatoriGenerici26(
			List<ClassificatoreGenerico> classificatoriGenerici26) {
		this.classificatoriGenerici26 = classificatoriGenerici26;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici27() {
		return classificatoriGenerici27;
	}
	public void setClassificatoriGenerici27(
			List<ClassificatoreGenerico> classificatoriGenerici27) {
		this.classificatoriGenerici27 = classificatoriGenerici27;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici28() {
		return classificatoriGenerici28;
	}
	public void setClassificatoriGenerici28(
			List<ClassificatoreGenerico> classificatoriGenerici28) {
		this.classificatoriGenerici28 = classificatoriGenerici28;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici29() {
		return classificatoriGenerici29;
	}
	public void setClassificatoriGenerici29(
			List<ClassificatoreGenerico> classificatoriGenerici29) {
		this.classificatoriGenerici29 = classificatoriGenerici29;
	}
	public List<ClassificatoreGenerico> getClassificatoriGenerici30() {
		return classificatoriGenerici30;
	}
	public void setClassificatoriGenerici30(
			List<ClassificatoreGenerico> classificatoriGenerici30) {
		this.classificatoriGenerici30 = classificatoriGenerici30;
	}

	


}
