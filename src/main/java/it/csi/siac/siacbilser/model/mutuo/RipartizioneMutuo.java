/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.mutuo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siaccorser.model.EntitaEnteExt;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class RipartizioneMutuo extends EntitaEnteExt {

	private static final long serialVersionUID = 1L;
	
	private TipoRipartizioneMutuo tipoRipartizioneMutuo;
	private CapitoloUscitaGestione capitolo;
	private BigDecimal ripartizioneImporto;
	private BigDecimal ripartizionePercentuale;
	
	public TipoRipartizioneMutuo getTipoRipartizioneMutuo() {
		return tipoRipartizioneMutuo;
	}
	public void setTipoRipartizioneMutuo(TipoRipartizioneMutuo tipoRipartizioneMutuo) {
		this.tipoRipartizioneMutuo = tipoRipartizioneMutuo;
	}
	public CapitoloUscitaGestione getCapitolo() {
		return capitolo;
	}
	public void setCapitolo(CapitoloUscitaGestione capitolo) {
		this.capitolo = capitolo;
	}
	public BigDecimal getRipartizioneImporto() {
		return ripartizioneImporto;
	}
	public void setRipartizioneImporto(BigDecimal ripartizioneImporto) {
		this.ripartizioneImporto = ripartizioneImporto;
	}
	public BigDecimal getRipartizionePercentuale() {
		return ripartizionePercentuale;
	}
	public void setRipartizionePercentuale(BigDecimal ripartizionePercentuale) {
		this.ripartizionePercentuale = ripartizionePercentuale;
	}	
}
