/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * PortaleFattureFEL
 * 
 * @author Valentina
 * 
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class PortaleFattureFEL extends Entita{
	
	private static final long serialVersionUID = 4146670491731365917L;
	
	private Ente ente;
	
	private Long identificativoFel;
	private Long identificativoSdi;
	private String nomeFileFattura;
	private String esitoUtenteCodice;
	private String esitoUtenteNome;
	private String esitoUtenteCognome;
	private Date esitoDataOra;
	private String esitoStatoFattura;
	private String descrizioneRifiuto;
	private Date dataRicezione;
	
	private FatturaFEL fattura;

	
	/**
	 * @return the nomeFileFattura
	 */
	public String getNomeFileFattura() {
		return nomeFileFattura;
	}

	/**
	 * @param nomeFileFattura the nomeFileFattura to set
	 */
	public void setNomeFileFattura(String nomeFileFattura) {
		this.nomeFileFattura = nomeFileFattura;
	}

	/**
	 * @return the esitoUtenteCodice
	 */
	public String getEsitoUtenteCodice() {
		return esitoUtenteCodice;
	}

	/**
	 * @param esitoUtenteCodice the esitoUtenteCodice to set
	 */
	public void setEsitoUtenteCodice(String esitoUtenteCodice) {
		this.esitoUtenteCodice = esitoUtenteCodice;
	}

	/**
	 * @return the esitoUtenteNome
	 */
	public String getEsitoUtenteNome() {
		return esitoUtenteNome;
	}

	/**
	 * @param esitoUtenteNome the esitoUtenteNome to set
	 */
	public void setEsitoUtenteNome(String esitoUtenteNome) {
		this.esitoUtenteNome = esitoUtenteNome;
	}

	/**
	 * @return the esitoUtenteCognome
	 */
	public String getEsitoUtenteCognome() {
		return esitoUtenteCognome;
	}

	/**
	 * @param esitoUtenteCognome the esitoUtenteCognome to set
	 */
	public void setEsitoUtenteCognome(String esitoUtenteCognome) {
		this.esitoUtenteCognome = esitoUtenteCognome;
	}

	/**
	 * @return the esitoDataOra
	 */
	public Date getEsitoDataOra() {
		return esitoDataOra;
	}

	/**
	 * @param esitoDataOra the esitoDataOra to set
	 */
	public void setEsitoDataOra(Date esitoDataOra) {
		this.esitoDataOra = esitoDataOra;
	}

	/**
	 * @return the esitoStatoFattura
	 */
	public String getEsitoStatoFattura() {
		return esitoStatoFattura;
	}

	/**
	 * @param esitoStatoFattura the esitoStatoFattura to set
	 */
	public void setEsitoStatoFattura(String esitoStatoFattura) {
		this.esitoStatoFattura = esitoStatoFattura;
	}

	/**
	 * @return the descrizioneRifiuto
	 */
	public String getDescrizioneRifiuto() {
		return descrizioneRifiuto;
	}

	/**
	 * @param descrizioneRifiuto the descrizioneRifiuto to set
	 */
	public void setDescrizioneRifiuto(String descrizioneRifiuto) {
		this.descrizioneRifiuto = descrizioneRifiuto;
	}

	/**
	 * @return the dataRicezione
	 */
	public Date getDataRicezione() {
		return dataRicezione;
	}

	/**
	 * @param dataRicezione the dataRicezione to set
	 */
	public void setDataRicezione(Date dataRicezione) {
		this.dataRicezione = dataRicezione;
	}

	/**
	 * @return the fattura
	 */
	public FatturaFEL getFattura() {
		return fattura;
	}

	/**
	 * @param fattura the fattura to set
	 */
	public void setFattura(FatturaFEL fattura) {
		this.fattura = fattura;
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

	/**
	 * @return the identificativoFel
	 */
	public Long getIdentificativoFel() {
		return identificativoFel;
	}

	/**
	 * @param identificativoFel the identificativoFel to set
	 */
	public void setIdentificativoFel(Long identificativoFel) {
		this.identificativoFel = identificativoFel;
	}

	/**
	 * @return the identificativoSdi
	 */
	public Long getIdentificativoSdi() {
		return identificativoSdi;
	}

	/**
	 * @param identificativoSdi the identificativoSdi to set
	 */
	public void setIdentificativoSdi(Long identificativoSdi) {
		this.identificativoSdi = identificativoSdi;
	}
	
}
