/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacgenser.model.Conto;
import it.csi.siac.siacgenser.model.OperazioneSegnoConto;

/**
 * DettaglioAnteprimaAmmortamentoAnnuoCespite
 *
 * @author elisa
 * @version 1.0.0 - 25-09-2018
 */
@XmlType(namespace = CESPDataDictionary.NAMESPACE)
public class DettaglioAnteprimaAmmortamentoAnnuoCespite extends EntitaEnte {

	/** Per la serializzazione */
	private static final long serialVersionUID = 6939325447486002342L;

	private AnteprimaAmmortamentoAnnuoCespite anteprimaAmmortamentoAnnuoCespite;
	private Conto conto;
	private BigDecimal importo;
	private OperazioneSegnoConto segno;
	private Integer numeroCespiti;
	
	
	/**
	 * @return the anteprimaAmmortamentoAnnuoCespite
	 */
	public AnteprimaAmmortamentoAnnuoCespite getAnteprimaAmmortamentoAnnuoCespite() {
		return anteprimaAmmortamentoAnnuoCespite;
	}
	/**
	 * @param anteprimaAmmortamentoAnnuoCespite the anteprimaAmmortamentoAnnuoCespite to set
	 */
	public void setAnteprimaAmmortamentoAnnuoCespite(AnteprimaAmmortamentoAnnuoCespite anteprimaAmmortamentoAnnuoCespite) {
		this.anteprimaAmmortamentoAnnuoCespite = anteprimaAmmortamentoAnnuoCespite;
	}
	/**
	 * @return the conto
	 */
	public Conto getConto() {
		return conto;
	}
	/**
	 * @param conto the conto to set
	 */
	public void setConto(Conto conto) {
		this.conto = conto;
	}
	/**
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}
	/**
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	/**
	 * @return the segno
	 */
	public OperazioneSegnoConto getSegno() {
		return segno;
	}
	/**
	 * @param segno the segno to set
	 */
	public void setSegno(OperazioneSegnoConto segno) {
		this.segno = segno;
	}
	/**
	 * @return the numeroCespiti
	 */
	public Integer getNumeroCespiti() {
		return numeroCespiti;
	}
	/**
	 * @param numeroCespiti the numeroCespiti to set
	 */
	public void setNumeroCespiti(Integer numeroCespiti) {
		this.numeroCespiti = numeroCespiti;
	}
}