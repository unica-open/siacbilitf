/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubImpegno;

/**
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.14
 */
@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class RendicontoRichiesta extends EntitaEnte {

	private static final long serialVersionUID = -237634108226788649L;

	
	private String note;
	private Date dataRendiconto;
	private BigDecimal importoRestituito;
	private BigDecimal importoIntegrato;
	
	private RichiestaEconomale richiestaEconomale;
	
	@XmlElements({
		@XmlElement(name="giustificativo", type=Giustificativo.class)
	})
	@XmlElementWrapper(name = "giustificativi")
	private List<Giustificativo> giustificativi = new ArrayList<Giustificativo>();
	private Movimento movimento;
	private Impegno impegno;
	private SubImpegno subImpegno;
	
	// Lotto M
	// Campi derivati
	private Integer numeroRendicontoStampato;
	private Date dataRendicontoStampato;
	
	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}
	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * @return the dataRendiconto
	 */
	public Date getDataRendiconto() {
		return dataRendiconto;
	}
	/**
	 * @param dataRendiconto the dataRendiconto to set
	 */
	public void setDataRendiconto(Date dataRendiconto) {
		this.dataRendiconto = dataRendiconto;
	}
	/**
	 * @return the importoRestituito
	 */
	public BigDecimal getImportoRestituito() {
		return importoRestituito;
	}
	/**
	 * @param importoRestituito the importoRestituito to set
	 */
	public void setImportoRestituito(BigDecimal importoRestituito) {
		this.importoRestituito = importoRestituito;
	}
	
	/**
	 * Ottiene l'importo del movimento.
	 *
	 * @return importo movimento (positivo quando restituito, negativo quando integrato);
	 */
	public BigDecimal getImportoMovimento(){
		if(importoRestituito==null){
			return importoIntegrato!=null?importoIntegrato.negate():BigDecimal.ZERO;
		} else if(importoIntegrato == null){
			return importoRestituito;
		}
		
		return importoRestituito.subtract(importoIntegrato);
	}
	
	/**
	 * @return the importoIntegrato
	 */
	public BigDecimal getImportoIntegrato() {
		return importoIntegrato;
	}
	/**
	 * @param importoIntegrato the importoIntegrato to set
	 */
	public void setImportoIntegrato(BigDecimal importoIntegrato) {
		this.importoIntegrato = importoIntegrato;
	}
	/**
	 * @return the richiestaEconomale
	 */
	public RichiestaEconomale getRichiestaEconomale() {
		return richiestaEconomale;
	}
	/**
	 * @param richiestaEconomale the richiestaEconomale to set
	 */
	public void setRichiestaEconomale(RichiestaEconomale richiestaEconomale) {
		this.richiestaEconomale = richiestaEconomale;
	}
	/**
	 * @return the giustificativi
	 */
	@XmlTransient
	public List<Giustificativo> getGiustificativi() {
		return giustificativi;
	}
	/**
	 * @param giustificativi the giustificativi to set
	 */
	public void setGiustificativi(List<Giustificativo> giustificativi) {
		this.giustificativi = giustificativi != null ? giustificativi : new ArrayList<Giustificativo>();
	}
	
	public void addGiustificativo(Giustificativo giustificativo){
		getGiustificativi().add(giustificativo);
	}
	
	
	
	
	/**
	 * @return the movimento
	 */
	public Movimento getMovimento() {
		return movimento;
	}
	/**
	 * @param movimento the movimento to set
	 */
	public void setMovimento(Movimento movimento) {
		this.movimento = movimento;
	}
	/**
	 * @return the impegno
	 */
	public Impegno getImpegno() {
		return impegno;
	}
	/**
	 * @param impegno the impegno to set
	 */
	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}
	/**
	 * @return the subImpegno
	 */
	public SubImpegno getSubImpegno() {
		return subImpegno;
	}
	/**
	 * @param subImpegno the subImpegno to set
	 */
	public void setSubImpegno(SubImpegno subImpegno) {
		this.subImpegno = subImpegno;
	}
	/**
	 * @return the numeroRendicontoStampato
	 */
	public Integer getNumeroRendicontoStampato() {
		return numeroRendicontoStampato;
	}
	/**
	 * @param numeroRendicontoStampato the numeroRendicontoStampato to set
	 */
	public void setNumeroRendicontoStampato(Integer numeroRendicontoStampato) {
		this.numeroRendicontoStampato = numeroRendicontoStampato;
	}
	/**
	 * @return the dataRendicontoStampato
	 */
	public Date getDataRendicontoStampato() {
		return dataRendicontoStampato;
	}
	/**
	 * @param dataRendicontoStampato the dataRendicontoStampato to set
	 */
	public void setDataRendicontoStampato(Date dataRendicontoStampato) {
		this.dataRendicontoStampato = dataRendicontoStampato;
	}
	
	
	
	
}