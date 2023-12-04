/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ParametroRicercaSubOrdinativoIncasso implements Serializable {
	
	private static final long serialVersionUID = -1L;

	private Integer annoEsercizio;

//	private String descrizione;
//	private List<String> statiDaEscludere;
	
	//Ordinativo incasso
//	private BigInteger numeroOrdinativoDa;
//	private BigInteger numeroOrdinativoA;
//	private String statoOperativo;
//	private Date dataEmissioneDa;
//	private Date dataEmissioneA;
//	private Date dataTrasmissioneOIL;
//	private String codiceDistinta;
//	private String contoDelTesoriere;
	
	//Articolo
//	private Integer annoCapitolo;
//	private BigDecimal numeroCapitolo;
//	private BigDecimal numeroArticolo;
//	private Integer numeroUEB;
	
	//Provvedimento
//	private Integer annoProvvedimento;
//	private BigDecimal numeroProvvedimento;
//	private String tipoProvvedimento;
//	private String codiceTipoProvvedimento;
//	private String codiceStrutturaAmministrativa;
//	private Integer uidStrutturaAmministrativoContabile;
//	private Integer uidProvvedimento;
	
//	private String codiceCausale;
	
	//Provvisorio di cassa
	private Integer annoProvvCassa;
	private BigDecimal numeroProvvCassa; 
	//
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}
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
	
}
