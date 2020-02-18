/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.model;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;


/**
 * Cespiti
 * @author 71027
 * @version 1.0
 * @created 31-giu-2018
 */
@XmlType(namespace = CESPDataDictionary.NAMESPACE)
public class AmmortamentoAnnuoCespite extends Entita {

	/** Per la serializzazione */
	private static final long serialVersionUID = 2066722439497422553L;
	
	private Cespite cespite;
	private Integer ultimoAnnoAmmortato;
	private BigDecimal importoTotaleAmmortato;
	private List<DettaglioAmmortamentoAnnuoCespite> dettagliAmmortamentoAnnuoCespite;
	private Boolean completo;
	private Ente ente;
	
	/**
	 * @return the cespite
	 */
	public Cespite getCespite() {
		return cespite;
	}
	/**
	 * @param cespite the cespite to set
	 */
	public void setCespite(Cespite cespite) {
		this.cespite = cespite;
	}
	/**
	 * @return the ultimoAnno
	 */
	public Integer getUltimoAnnoAmmortato() {
		return ultimoAnnoAmmortato;
	}
	/**
	 * @param ultimoAnno the ultimoAnno to set
	 */
	public void setUltimoAnnoAmmortato(Integer ultimoAnno) {
		this.ultimoAnnoAmmortato = ultimoAnno;
	}
	/**
	 * @return the importoTotaleAmmortato
	 */
	public BigDecimal getImportoTotaleAmmortato() {
		return importoTotaleAmmortato;
	}
	/**
	 * @param importoTotaleAmmortato the importoTotaleAmmortato to set
	 */
	public void setImportoTotaleAmmortato(BigDecimal importoTotaleAmmortato) {
		this.importoTotaleAmmortato = importoTotaleAmmortato;
	}
	/**
	 * @return the dettagliAmmortamentoannuoCespite
	 */
	public List<DettaglioAmmortamentoAnnuoCespite> getDettagliAmmortamentoAnnuoCespite() {
		return dettagliAmmortamentoAnnuoCespite;
	}
	/**
	 * @param dettagliAmmortamentoAnnuoCespite the dettagliAmmortamentoannuoCespite to set
	 */
	public void setDettagliAmmortamentoAnnuoCespite(
			List<DettaglioAmmortamentoAnnuoCespite> dettagliAmmortamentoAnnuoCespite) {
		this.dettagliAmmortamentoAnnuoCespite = dettagliAmmortamentoAnnuoCespite;
	}
	
	/**
	 * @return the completo
	 */
	public Boolean getCompleto() {
		return completo;
	}
	/**
	 * @param completo the completo to set
	 */
	public void setCompleto(Boolean completo) {
		this.completo = completo;
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