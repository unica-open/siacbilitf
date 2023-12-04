/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.movgest;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ComponenteBilancio extends EntitaEnte {

	private static final long serialVersionUID = 32235458569790087L;

	private BigDecimal importoComponente;
	private Integer idTipoComponente; // si riferisce a TipoComponenteImportiCapitolo.uid
	private String descrizioneTipoComponente;
	private Integer idMacroTipoComponente;
	private String descrizioneMacroComponente;
	private String descrizioneSottoTipoComponente;

	@Override
	public int getUid() {
		return getIdTipoComponente()!=null ? getIdTipoComponente().intValue() : 0;
	}

	@Override
	public void setUid(int uid) {
		setIdTipoComponente(Integer.valueOf(uid));
	}

	public Integer getIdTipoComponente() {
		return idTipoComponente;
	}

	public void setIdTipoComponente(Integer idTipoComponente) {
		this.idTipoComponente = idTipoComponente;
	}

	public String getDescrizioneTipoComponente() {
		return descrizioneTipoComponente;
	}

	public void setDescrizioneTipoComponente(String descrizioneTipoComponente) {
		this.descrizioneTipoComponente = descrizioneTipoComponente;
	}

	public Integer getIdMacroTipoComponente() {
		return idMacroTipoComponente;
	}

	public void setIdMacroTipoComponente(Integer idMacroTipoComponente) {
		this.idMacroTipoComponente = idMacroTipoComponente;
	}

	public String getDescrizioneMacroComponente() {
		return descrizioneMacroComponente;
	}

	public void setDescrizioneMacroComponente(String descrizioneMacroComponente) {
		this.descrizioneMacroComponente = descrizioneMacroComponente;
	}

	public String getDescrizioneSottoTipoComponente() {
		return descrizioneSottoTipoComponente;
	}

	public void setDescrizioneSottoTipoComponente(String descrizioneSottoTipoComponente) {
		this.descrizioneSottoTipoComponente = descrizioneSottoTipoComponente;
	}

	public BigDecimal getImportoComponente() {
		return importoComponente;
	}

	public void setImportoComponente(BigDecimal importoComponente) {
		this.importoComponente = importoComponente;
	}

}
