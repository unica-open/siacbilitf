/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.Ente;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class AliquotaIva extends Codifica {
	
	// siac_t_iva_aliquota
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6095080818899677877L;
	
	
	private BigDecimal percentualeAliquota = BigDecimal.ZERO;
	private BigDecimal percentualeIndetraibilita = BigDecimal.ZERO;
	private Boolean flagIvaSplit = Boolean.FALSE;
	
	private TipoOperazioneIva tipoOperazioneIva;
	private AliquotaIvaTipo aliquotaIvaTipo;
	private Ente ente;
	
	/**
	 * @return the percentualeAliquota
	 */
	public BigDecimal getPercentualeAliquota() {
		return percentualeAliquota;
	}
	/**
	 * @param percentualeAliquota the percentualeAliquota to set
	 */
	public void setPercentualeAliquota(BigDecimal percentualeAliquota) {
		this.percentualeAliquota = percentualeAliquota != null ? percentualeAliquota : BigDecimal.ZERO;
	}
	/**
	 * @return the percentualeIndetraibilita
	 */
	public BigDecimal getPercentualeIndetraibilita() {
		return percentualeIndetraibilita;
	}
	/**
	 * @param percentualeIndetraibilita the percentualeIndetraibilita to set
	 */
	public void setPercentualeIndetraibilita(BigDecimal percentualeIndetraibilita) {
		this.percentualeIndetraibilita = percentualeIndetraibilita != null ? percentualeIndetraibilita : BigDecimal.ZERO;
	}
	/**
	 * @return the tipoOperazioneIva
	 */
	@XmlJavaTypeAdapter(TipoOperazioneIva.TipoOperazioneIvaAdapter.class)
	public TipoOperazioneIva getTipoOperazioneIva() {
		return tipoOperazioneIva;
	}
	/**
	 * @param tipoOperazioneIva the tipoOperazioneIva to set
	 */
	public void setTipoOperazioneIva(TipoOperazioneIva tipoOperazioneIva) {
		this.tipoOperazioneIva = tipoOperazioneIva;
	}
	
	/**
	 * @return the aliquotaIvaTipo
	 */
	public AliquotaIvaTipo getAliquotaIvaTipo() {
		return aliquotaIvaTipo;
	}
	
	/**
	 * @param aliquotaIvaTipo the aliquotaIvaTipo to set
	 */
	public void setAliquotaIvaTipo(AliquotaIvaTipo aliquotaIvaTipo) {
		this.aliquotaIvaTipo = aliquotaIvaTipo;
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
	
	public Boolean getFlagIvaSplit() {
		return flagIvaSplit;
	}
	
	public void setFlagIvaSplit(Boolean flagIvaSplit) {
		this.flagIvaSplit = flagIvaSplit;
	}
	
}
