/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.Ente;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class TipoRegistrazioneIva extends Codifica {
	
	// siac_d_iva_registrazione_tipo
	
	private static final long serialVersionUID = -1396568075991066230L;
	
	// Obbligatorii
	private Boolean flagTipoRegistrazioneIvaEntrata = Boolean.FALSE;
	private Boolean flagTipoRegistrazioneIvaSpesa = Boolean.FALSE;
	
	private Ente ente;
	
	/**
	 * @return the flagTipoRegistrazioneIvaEntrata
	 */
	public Boolean getFlagTipoRegistrazioneIvaEntrata() {
		return flagTipoRegistrazioneIvaEntrata;
	}
	/**
	 * @param flagTipoRegistrazioneIvaEntrata the flagTipoRegistrazioneIvaEntrata to set
	 */
	public void setFlagTipoRegistrazioneIvaEntrata(
			Boolean flagTipoRegistrazioneIvaEntrata) {
		this.flagTipoRegistrazioneIvaEntrata = flagTipoRegistrazioneIvaEntrata;
	}
	/**
	 * @return the flagTipoRegistrazioneIvaEntrataSpesa
	 */
	public Boolean getFlagTipoRegistrazioneIvaEntrataSpesa() {
		return Boolean.TRUE.equals(getFlagTipoRegistrazioneIvaEntrata()) 
				&& Boolean.TRUE.equals(getFlagTipoRegistrazioneIvaSpesa());
	}
	
	/**
	 * @return the flagTipoRegistrazioneIvaSpesa
	 */
	public Boolean getFlagTipoRegistrazioneIvaSpesa() {
		return flagTipoRegistrazioneIvaSpesa;
	}
	/**
	 * @param flagTipoRegistrazioneIvaSpesa the flagTipoRegistrazioneIvaSpesa to set
	 */
	public void setFlagTipoRegistrazioneIvaSpesa(
			Boolean flagTipoRegistrazioneIvaSpesa) {
		this.flagTipoRegistrazioneIvaSpesa = flagTipoRegistrazioneIvaSpesa;
	}
	
	
	/**
	 * Desume il tipoFamigliaDocumento a partire dai flag 
	 * flagTipoRegistrazioneIvaEntrata, flagTipoRegistrazioneIvaSpesa e flagTipoRegistrazioneIvaEntrataSpesa
	 * 
	 * @param tipoRegistrazioneIva
	 * @return ENTRATA/SPESA o null per intendere entrambi o nessuno
	 */
	public TipoFamigliaDocumento getTipoFamigliaDocumento() {		
		if(Boolean.TRUE.equals(getFlagTipoRegistrazioneIvaEntrata()) 
						&& Boolean.TRUE.equals(getFlagTipoRegistrazioneIvaSpesa())) {
			return null;
		} else if(Boolean.TRUE.equals(getFlagTipoRegistrazioneIvaEntrata())){
			return TipoFamigliaDocumento.ENTRATA;
		} else if(Boolean.TRUE.equals(getFlagTipoRegistrazioneIvaSpesa())){
			return TipoFamigliaDocumento.SPESA;
		}
		//throw new IllegalArgumentException("Tipo famiglia documento non deducibile.");
		return null;
	}
	
	
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
	
}
