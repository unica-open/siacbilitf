/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegato;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegatoModelDetail;
import it.csi.siac.siacfin2ser.model.StatoOperativoElencoDocumenti;

/**
 * The Class RicercaElenco.
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaElenco extends ServiceRequest {
	
	private ElencoDocumentiAllegato elencoDocumentiAllegato;
	private AttoAmministrativo attoAmministrativo;
	private List<StatoOperativoElencoDocumenti> statiOperativiElencoDocumenti = new ArrayList<StatoOperativoElencoDocumenti>();
	
	private Boolean importoDaEmettereMaggioreDiZero;
	
	private ParametriPaginazione parametriPaginazione;
	
	private Integer numeroDa;
	
	private Integer numeroA;
	
	@XmlElementWrapper(name="modelDetails")
	@XmlElement(name="modelDetail")
	private ElencoDocumentiAllegatoModelDetail[] modelDetails;
	
	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

	/**
	 * @return the elencoDocumentiAllegato
	 */
	public ElencoDocumentiAllegato getElencoDocumentiAllegato() {
		return elencoDocumentiAllegato;
	}

	/**
	 * @param elencoDocumentiAllegato the elencoDocumentiAllegato to set
	 */
	public void setElencoDocumentiAllegato(ElencoDocumentiAllegato elencoDocumentiAllegato) {
		this.elencoDocumentiAllegato = elencoDocumentiAllegato;
	}

	/**
	 * @return the attoAmministrativo
	 */
	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}

	/**
	 * @param attoAmministrativo the attoAmministrativo to set
	 */
	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}

	/**
	 * @return the statiOperativiElencoDocumenti
	 */
	public List<StatoOperativoElencoDocumenti> getStatiOperativiElencoDocumenti() {
		return statiOperativiElencoDocumenti;
	}

	/**
	 * @param statiOperativiElencoDocumenti the statiOperativiElencoDocumenti to set
	 */
	public void setStatiOperativiElencoDocumenti(List<StatoOperativoElencoDocumenti> statiOperativiElencoDocumenti) {
		this.statiOperativiElencoDocumenti = statiOperativiElencoDocumenti != null ? statiOperativiElencoDocumenti : new ArrayList<StatoOperativoElencoDocumenti>();
	}

	/**
	 * @return the importoDaEmettereMaggioreDiZero
	 */
	public Boolean getImportoDaEmettereMaggioreDiZero() {
		return importoDaEmettereMaggioreDiZero;
	}

	/**
	 * @param importoDaEmettereMaggioreDiZero the importoDaEmettereMaggioreDiZero to set
	 */
	public void setImportoDaEmettereMaggioreDiZero(Boolean importoDaEmettereMaggioreDiZero) {
		this.importoDaEmettereMaggioreDiZero = importoDaEmettereMaggioreDiZero;
	}
	
	

	/**
	 * @return the modelDetails
	 */
	@XmlTransient
	public ElencoDocumentiAllegatoModelDetail[] getModelDetails() {
		return modelDetails;
	}

	/**
	 * @param modelDetails the modelDetails to set
	 */
	public void setModelDetails(ElencoDocumentiAllegatoModelDetail[] modelDetails) {
		this.modelDetails = modelDetails;
	}


	/**
	 * @return the numeroDa
	 */
	public Integer getNumeroDa() {
		return numeroDa;
	}

	/**
	 * @param numeroDa the numeroDa to set
	 */
	public void setNumeroDa(Integer numeroDa) {
		this.numeroDa = numeroDa;
	}

	/**
	 * @return the numeroA
	 */
	public Integer getNumeroA() {
		return numeroA;
	}

	/**
	 * @param numeroA the numeroA to set
	 */
	public void setNumeroA(Integer numeroA) {
		this.numeroA = numeroA;
	}
	
	
	
}
