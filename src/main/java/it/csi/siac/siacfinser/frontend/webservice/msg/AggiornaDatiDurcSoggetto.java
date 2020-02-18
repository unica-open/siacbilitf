/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaDatiDurcSoggetto extends ServiceRequest {

	private Integer idSoggetto;
	private Date dataFineValiditaDurc;
	private Character tipoFonteDurc;
	private Integer fonteDurcClassifId;
	private String fonteDurcAutomatica;
	private String noteDurc;

	public Date getDataFineValiditaDurc() {
		return dataFineValiditaDurc;
	}

	public void setDataFineValiditaDurc(Date dataFineValiditaDurc) {
		this.dataFineValiditaDurc = dataFineValiditaDurc;
	}

	public Character getTipoFonteDurc() {
		return tipoFonteDurc;
	}

	public void setTipoFonteDurc(Character tipoFonteDurc) {
		this.tipoFonteDurc = tipoFonteDurc;
	}

	public Integer getFonteDurcClassifId() {
		return fonteDurcClassifId;
	}

	public void setFonteDurcClassifId(Integer fonteDurcClassifId) {
		this.fonteDurcClassifId = fonteDurcClassifId;
	}

	public String getFonteDurcAutomatica() {
		return fonteDurcAutomatica;
	}

	public void setFonteDurcAutomatica(String fonteDurcAutomatica) {
		this.fonteDurcAutomatica = fonteDurcAutomatica;
	}

	public String getNoteDurc() {
		return noteDurc;
	}

	public void setNoteDurc(String noteDurc) {
		this.noteDurc = noteDurc;
	}

	public Integer getIdSoggetto() {
		return idSoggetto;
	}

	public void setIdSoggetto(Integer idSoggetto) {
		this.idSoggetto = idSoggetto;
	}

}
