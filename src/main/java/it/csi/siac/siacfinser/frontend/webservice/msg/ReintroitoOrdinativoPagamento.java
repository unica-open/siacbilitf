/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.MovimentoKey;
import it.csi.siac.siacfinser.model.ric.OrdinativoKey;
import it.csi.siac.siacfinser.model.ric.ReintroitoRitenutaSplit;
import it.csi.siac.siacfinser.model.ric.ReintroitoRitenute;

/**
 * Richiesta al metodo FIN.OrdinativoService.reintroitoOrdinativoPagamento
 * 
 * @author claudio.picco
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ReintroitoOrdinativoPagamento extends ServiceRequest {

	private Ente ente;
	private Bilancio bilancio;
	
	// Provvedimento da utilizzare per liquidazioni e ordinativi da inserire:
	private AttoAmministrativo attoAmministrativo;
	private boolean utilizzaProvvedimentoDaMovimento;
	//
	
	//Ordinativo di Pagamento da reintroitare (M1 su I1) 
	private OrdinativoKey ordinativoPagamento;
	//
	
	//Numero impegno su cui spostare l'ordinativo (Ipg1)
	private MovimentoKey impegnoSuCuiSpostare;
	//
	
	//SE l'ordinativo ha entrate subordinate (ritenute/split) o e' collegato a un documento commerciale (anche senza ritenute):
	private ReintroitoRitenute ritenute;
	
	//Numero Accertamento (anche piu' di uno) per spostare le entrate (Apg1-n)
	//Numero Impegno (anche piu' di uno) per pagare la quota parte ritenute (Ipg2-n)
	private List<ReintroitoRitenutaSplit> ritenuteSplit;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}

	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}

	public boolean isUtilizzaProvvedimentoDaMovimento() {
		return utilizzaProvvedimentoDaMovimento;
	}

	public void setUtilizzaProvvedimentoDaMovimento(boolean utilizzaProvvedimentoDaMovimento) {
		this.utilizzaProvvedimentoDaMovimento = utilizzaProvvedimentoDaMovimento;
	}

	public OrdinativoKey getOrdinativoPagamento() {
		return ordinativoPagamento;
	}

	public void setOrdinativoPagamento(OrdinativoKey ordinativoPagamento) {
		this.ordinativoPagamento = ordinativoPagamento;
	}

	public MovimentoKey getImpegnoSuCuiSpostare() {
		return impegnoSuCuiSpostare;
	}

	public void setImpegnoSuCuiSpostare(MovimentoKey impegnoSuCuiSpostare) {
		this.impegnoSuCuiSpostare = impegnoSuCuiSpostare;
	}

	public ReintroitoRitenute getRitenute() {
		return ritenute;
	}

	public void setRitenute(ReintroitoRitenute ritenute) {
		this.ritenute = ritenute;
	}

	public List<ReintroitoRitenutaSplit> getRitenuteSplit() {
		return ritenuteSplit;
	}

	public void setRitenuteSplit(List<ReintroitoRitenutaSplit> ritenuteSplit) {
		this.ritenuteSplit = ritenuteSplit;
	}

}
