/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacbilser.model.ContoCorrentePredocumentoEntrata;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CausaleEntrata;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.SubAccertamento;
import it.csi.siac.siacfinser.model.provvisoriDiCassa.ProvvisorioDiCassa;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * Request per la definizione del predocumento di entrata
 * @author Marchino Alessandro
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class CompletaDefiniscePreDocumentoEntrata extends ServiceRequest {
	
	// Per ricerca
	private Bilancio bilancio;
	private CausaleEntrata causaleEntrata;
	private Date dataCompetenzaDa;
	private Date dataCompetenzaA;
	//SIAC-6780
	private ContoCorrentePredocumentoEntrata contoCorrente;
	private List<Integer> uidPredocumentiDaFiltrare = new ArrayList<Integer>();
	private RicercaSinteticaPreDocumentoEntrata ricercaSinteticaPredocumentoEntrata;
	
	
	// Per aggiornamento
	private AttoAmministrativo attoAmministrativo;
	private Accertamento accertamento;
	private SubAccertamento subAccertamento;
	private Soggetto soggetto;
	//SIAC-6780
	private ProvvisorioDiCassa provvisorioCassa;
	
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return this.bilancio;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	/**
	 * @return the causaleEntrata
	 */
	public CausaleEntrata getCausaleEntrata() {
		return this.causaleEntrata;
	}
	/**
	 * @param causaleEntrata the causaleEntrata to set
	 */
	public void setCausaleEntrata(CausaleEntrata causaleEntrata) {
		this.causaleEntrata = causaleEntrata;
	}
	/**
	 * @return the dataCompetenzaDa
	 */
	public Date getDataCompetenzaDa() {
		return this.dataCompetenzaDa;
	}
	/**
	 * @param dataCompetenzaDa the dataCompetenzaDa to set
	 */
	public void setDataCompetenzaDa(Date dataCompetenzaDa) {
		this.dataCompetenzaDa = dataCompetenzaDa;
	}
	/**
	 * @return the dataCompetenzaA
	 */
	public Date getDataCompetenzaA() {
		return this.dataCompetenzaA;
	}
	/**
	 * @param dataCompetenzaA the dataCompetenzaA to set
	 */
	public void setDataCompetenzaA(Date dataCompetenzaA) {
		this.dataCompetenzaA = dataCompetenzaA;
	}
	
	/**
	 * @return the contoCorrente
	 */
	public ContoCorrentePredocumentoEntrata getContoCorrente() {
		return contoCorrente;
	}
	/**
	 * @param contoCorrente the contoCorrente to set
	 */
	public void setContoCorrente(ContoCorrentePredocumentoEntrata contoCorrente) {
		this.contoCorrente = contoCorrente;
	}
	/**
	 * @return the uidPredocumentiDaFiltrare
	 */
	public List<Integer> getUidPredocumentiDaFiltrare() {
		return uidPredocumentiDaFiltrare;
	}
	/**
	 * @param uidPredocumentiDaFiltrare the uidPredocumentiDaFiltrare to set
	 */
	public void setUidPredocumentiDaFiltrare(List<Integer> uidPredocumentiDaFiltrare) {
		this.uidPredocumentiDaFiltrare = uidPredocumentiDaFiltrare;
	}
	
	/**
	 * @return the ricercaSinteticaPredocumentoentrata
	 */
	public RicercaSinteticaPreDocumentoEntrata getRicercaSinteticaPredocumentoEntrata() {
		return ricercaSinteticaPredocumentoEntrata;
	}
	/**
	 * @param ricercaSinteticaPredocumentoentrata the ricercaSinteticaPredocumentoentrata to set
	 */
	public void setRicercaSinteticaPredocumentoEntrata(
			RicercaSinteticaPreDocumentoEntrata ricercaSinteticaPredocumentoentrata) {
		this.ricercaSinteticaPredocumentoEntrata = ricercaSinteticaPredocumentoentrata;
	}
	/**
	 * @return the attoAmministrativo
	 */
	public AttoAmministrativo getAttoAmministrativo() {
		return this.attoAmministrativo;
	}
	/**
	 * @param attoAmministrativo the attoAmministrativo to set
	 */
	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}
	/**
	 * @return the accertamento
	 */
	public Accertamento getAccertamento() {
		return this.accertamento;
	}
	/**
	 * @param accertamento the accertamento to set
	 */
	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}
	/**
	 * @return the subAccertamento
	 */
	public SubAccertamento getSubAccertamento() {
		return this.subAccertamento;
	}
	/**
	 * @param subAccertamento the subAccertamento to set
	 */
	public void setSubAccertamento(SubAccertamento subAccertamento) {
		this.subAccertamento = subAccertamento;
	}
	/**
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return this.soggetto;
	}
	/**
	 * @param soggetto the soggetto to set
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}
	/**
	 * @return the provvisorioCassa
	 */
	public ProvvisorioDiCassa getProvvisorioCassa() {
		return provvisorioCassa;
	}
	/**
	 * @param provvisorioCassa the provvisorioCassa to set
	 */
	public void setProvvisorioCassa(ProvvisorioDiCassa provvisorioCassa) {
		this.provvisorioCassa = provvisorioCassa;
	}
	
}
