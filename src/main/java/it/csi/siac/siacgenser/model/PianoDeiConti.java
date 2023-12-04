/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Ambito;
import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.Ente;


/**
 * contiene la relazione tra i conti di un Piano dei conti
 * e' caratterizzato da una classe
 * 
 * deve essere precaricato con un conto padre di livello '0' che rappresenta la
 * famiglia
 * @author 1080
 * @version 1.0
 * @created 06-mar-2015 16.32.15
 */
//siac_t_pdce_fam_tree
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class PianoDeiConti extends Codifica {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4462227116302776653L;
	
	private Ente ente;
	
	private ClassePiano classePiano;
	private List<Conto> conti = new ArrayList<Conto>();
	
	// Lotto N
	private Ambito ambito;

	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}


	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}


	/**
	 * @return the classePiano
	 */
	public ClassePiano getClassePiano() {
		return classePiano;
	}

	/**
	 * @param classePiano the classePiano to set
	 */
	public void setClassePiano(ClassePiano classePiano) {
		this.classePiano = classePiano;
	}

	/**
	 * @return the conti
	 */
	public List<Conto> getConti() {
		return conti;
	}

	/**
	 * @param conti the conti to set
	 */
	public void setConti(List<Conto> conti) {
		this.conti = conti;
	}

	/**
	 * @return the ambito
	 */
	public Ambito getAmbito() {
		return ambito;
	}

	/**
	 * @param ambito the ambito to set
	 */
	public void setAmbito(Ambito ambito) {
		this.ambito = ambito;
	}
	
	

}