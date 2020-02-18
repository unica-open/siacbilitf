/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class StornoUEB extends VariazioneImportoCapitolo {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6512062156307006416L;
	
	
	private Capitolo<?, ?> capitoloSorgente;
	private Capitolo<?, ?> capitoloDestinazione;
	
	
	

	/**
	 * @return the capitoloSorgente
	 */
	public Capitolo<?, ?> getCapitoloSorgente() {
		return capitoloSorgente;
	}

	/**
	 * @param capitoloSorgente the capitoloSorgente to set
	 */
	public void setCapitoloSorgente(Capitolo<?, ?> capitoloSorgente) {
		this.capitoloSorgente = capitoloSorgente;
	}

	/**
	 * @return the capitoloDestinazione
	 */
	public Capitolo<?, ?> getCapitoloDestinazione() {
		return capitoloDestinazione;
	}

	/**
	 * @param capitoloDestinazione the capitoloDestinazione to set
	 */
	public void setCapitoloDestinazione(Capitolo<?, ?> capitoloDestinazione) {
		this.capitoloDestinazione = capitoloDestinazione;
	}
	
	


	
	
	
	
	
	//private Storno storno;
	
	
	
	

}
