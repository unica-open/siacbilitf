/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;


/**
 * Cespiti
 * @author 71027
 * @version 1.0
 * @created 31-giu-2018
 */
@XmlType(namespace = CESPDataDictionary.NAMESPACE)
public class AnteprimaAmmortamentoAnnuoCespite extends Entita {

	/** Per la serializzazione */
	private static final long serialVersionUID = 1434749017865285969L;
	
	private Integer anno;
	private String statoAnteprima;
	private Date dataAnteprima;
	private List<DettaglioAnteprimaAmmortamentoAnnuoCespite> dettagliAnteprimaAmmortamentoAnnuoCespite;
	/**
	 * @return the anno
	 */
	public Integer getAnno() {
		return anno;
	}
	/**
	 * @param anno the anno to set
	 */
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	/**
	 * @return the statoAnteprima
	 */
	public String getStatoAnteprima() {
		return statoAnteprima;
	}
	/**
	 * @param statoAnteprima the statoAnteprima to set
	 */
	public void setStatoAnteprima(String statoAnteprima) {
		this.statoAnteprima = statoAnteprima;
	}
	/**
	 * @return the dataAnteprima
	 */
	public Date getDataAnteprima() {
		return dataAnteprima;
	}
	/**
	 * @param dataAnteprima the dataAnteprima to set
	 */
	public void setDataAnteprima(Date dataAnteprima) {
		this.dataAnteprima = dataAnteprima;
	}
	/**
	 * @return the dettagliAnteprimaAmmortamentoAnnuoCespite
	 */
	public List<DettaglioAnteprimaAmmortamentoAnnuoCespite> getDettagliAnteprimaAmmortamentoAnnuoCespite() {
		return dettagliAnteprimaAmmortamentoAnnuoCespite;
	}
	/**
	 * @param dettagliAnteprimaAmmortamentoAnnuoCespite the dettagliAnteprimaAmmortamentoAnnuoCespite to set
	 */
	public void setDettagliAnteprimaAmmortamentoAnnuoCespite(
			List<DettaglioAnteprimaAmmortamentoAnnuoCespite> dettagliAnteprimaAmmortamentoAnnuoCespite) {
		this.dettagliAnteprimaAmmortamentoAnnuoCespite = dettagliAnteprimaAmmortamentoAnnuoCespite;
	}
}