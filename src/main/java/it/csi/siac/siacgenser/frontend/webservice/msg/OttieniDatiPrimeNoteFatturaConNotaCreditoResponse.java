/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.Evento;
import it.csi.siac.siacgenser.model.PrimaNota;
import it.csi.siac.siacgenser.model.TipoCausale;

/**
 * Classe di response per il servizio di recupero entit&agrave; collegate alla prima nota
 * @author Alessandro Marchino
 *
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class OttieniDatiPrimeNoteFatturaConNotaCreditoResponse extends ServiceResponse {
	
	private TipoCausale tipoCausale;
	private Evento eventoPrimaNota;
	private DocumentoSpesa documentoSpesaCheHaGeneratoLaPrimaNota;
	private List<DocumentoSpesa> fattureCollegateANotaDiCredito;
	private List<PrimaNota> primeNoteGenerateDallaFattura;
	private List<DocumentoSpesa> noteCreditoCollegateAFattura;
	private List<PrimaNota> primeNoteGenerateDalleNoteDiCredito;
	
	/**
	 * @return the tipoCausale
	 */
	public TipoCausale getTipoCausale() {
		return tipoCausale;
	}
	/**
	 * @param tipoCausale the tipoCausale to set
	 */
	public void setTipoCausale(TipoCausale tipoCausale) {
		this.tipoCausale = tipoCausale;
	}
	/**
	 * @return the eventoPrimaNota
	 */
	public Evento getEventoPrimaNota() {
		return eventoPrimaNota;
	}
	/**
	 * @param eventoPrimaNota the eventoPrimaNota to set
	 */
	public void setEventoPrimaNota(Evento eventoPrimaNota) {
		this.eventoPrimaNota = eventoPrimaNota;
	}
	/**
	 * @return the documentoSpesaCheHaGeneratoLaPrimaNota
	 */
	public DocumentoSpesa getDocumentoSpesaCheHaGeneratoLaPrimaNota() {
		return documentoSpesaCheHaGeneratoLaPrimaNota;
	}
	/**
	 * @param documentoSpesaCheHaGeneratoLaPrimaNota the documentoSpesaCheHaGeneratoLaPrimaNota to set
	 */
	public void setDocumentoSpesaCheHaGeneratoLaPrimaNota(DocumentoSpesa documentoSpesaCheHaGeneratoLaPrimaNota) {
		this.documentoSpesaCheHaGeneratoLaPrimaNota = documentoSpesaCheHaGeneratoLaPrimaNota;
	}
	/**
	 * @return the fattureCollegateANotaDiCredito
	 */
	public List<DocumentoSpesa> getFattureCollegateANotaDiCredito() {
		return fattureCollegateANotaDiCredito;
	}
	/**
	 * @param fattureCollegateANotaDiCredito the fattureCollegateANotaDiCredito to set
	 */
	public void setFattureCollegateANotaDiCredito(List<DocumentoSpesa> fattureCollegateANotaDiCredito) {
		this.fattureCollegateANotaDiCredito = fattureCollegateANotaDiCredito;
	}
	/**
	 * @return the primeNoteGenerateDallaFattura
	 */
	public List<PrimaNota> getPrimeNoteGenerateDallaFattura() {
		return primeNoteGenerateDallaFattura;
	}
	/**
	 * @param primeNoteGenerateDallaFattura the primeNoteGenerateDallaFattura to set
	 */
	public void setPrimeNoteGenerateDallaFattura(List<PrimaNota> primeNoteGenerateDallaFattura) {
		this.primeNoteGenerateDallaFattura = primeNoteGenerateDallaFattura;
	}
	/**
	 * @return the noteCreditoCollegateAFattura
	 */
	public List<DocumentoSpesa> getNoteCreditoCollegateAFattura() {
		return noteCreditoCollegateAFattura;
	}
	/**
	 * @param noteCreditoCollegateAFattura the noteCreditoCollegateAFattura to set
	 */
	public void setNoteCreditoCollegateAFattura(List<DocumentoSpesa> noteCreditoCollegateAFattura) {
		this.noteCreditoCollegateAFattura = noteCreditoCollegateAFattura;
	}
	/**
	 * @return the primeNoteGenerateDalleNoteDiCredito
	 */
	public List<PrimaNota> getPrimeNoteGenerateDalleNoteDiCredito() {
		return primeNoteGenerateDalleNoteDiCredito;
	}
	/**
	 * @param primeNoteGenerateDalleNoteDiCredito the primeNoteGenerateDalleNoteDiCredito to set
	 */
	public void setPrimeNoteGenerateDalleNoteDiCredito(List<PrimaNota> primeNoteGenerateDalleNoteDiCredito) {
		this.primeNoteGenerateDalleNoteDiCredito = primeNoteGenerateDalleNoteDiCredito;
	}

}
