/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;


/**
 * 
 * Tutti i parametri presenti sono opzionali.
 * Nel caso in cui la ricerca presenti un numero di risultati maggiore di 50 l'applicativo restituira l errore : Ricerca Troppo Ampia, consigliando
 * all utente di rendere piu specifica la propria ricerca
 * 
 * @author Marco
 *
 */

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ParametroRicercaSubOrdinativoPagamento implements Serializable {
	
	private static final long serialVersionUID = -1L;

	private Integer annoEsercizio;
//	private boolean caricaLiquidazione = false;
	
//	private String descrizione;
//	private List<String> statiDaEscludere;
	
	//Ordinativo pagamento
//	private BigInteger numeroOrdinativoDa;
//	private BigInteger numeroOrdinativoA;
//	private Date dataEmissioneDa;
//	private Date dataEmissioneA;
//	private String statoOperativo;
//	private Date dataTrasmissioneOIL;
//	private BigInteger numeroMutuo;
//	private String codiceDistinta;
//	private String contoDelTesoriere;
	
	//Articolo
//	private Integer annoCapitolo;
//	private BigDecimal numeroCapitolo;
//	private BigDecimal numeroArticolo;
//	private Integer numeroUEB;
	
	//Impegno
//	private Integer annoImpegno;
//	private BigDecimal numeroImpegno;
//	private BigDecimal numeroSubImpegno;
	
	//Liquidazione
//	private Integer annoLiquidazione;
//	private BigInteger numeroLiquidazione;
	
	//Provvedimento
//	private Integer annoProvvedimento;
//	private BigDecimal numeroProvvedimento;
//	private String tipoProvvedimento;
//	private String codiceTipoProvvedimento;
//	private String codiceStrutturaAmministrativa;
//	private Integer uidStrutturaAmministrativoContabile;
//	private Integer uidProvvedimento;
	
	//Provvisorio di cassa
	private Integer annoProvvCassa;
	private BigDecimal numeroProvvCassa; 
	//

	public Integer getAnnoProvvCassa() {
		return annoProvvCassa;
	}

	public void setAnnoProvvCassa(Integer annoProvvCassa) {
		this.annoProvvCassa = annoProvvCassa;
	}

	public BigDecimal getNumeroProvvCassa() {
		return numeroProvvCassa;
	}

	public void setNumeroProvvCassa(BigDecimal numeroProvvCassa) {
		this.numeroProvvCassa = numeroProvvCassa;
	}

	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}

	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}
	
}
