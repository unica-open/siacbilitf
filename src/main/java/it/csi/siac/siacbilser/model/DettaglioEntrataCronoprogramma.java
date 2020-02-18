/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * The Class DettaglioEntrataCronoprogramma.
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class DettaglioEntrataCronoprogramma extends DettaglioBaseCronoprogramma {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2487403363327411776L;
		
	//@ImportoPersistente private BigDecimal stanziamento = BigDecimal.ZERO;
	
	private TitoloEntrata titoloEntrata;
	private TipologiaTitolo tipologiaTitolo;	
	
	private Capitolo<?,?> capitolo;

	private Boolean isAvanzoAmministrazione;
	

	/**
	 * Gets the titolo entrata.
	 *
	 * @return the titolo entrata
	 */
	public TitoloEntrata getTitoloEntrata() {
		return titoloEntrata;
	}

	/**
	 * Sets the titolo entrata.
	 *
	 * @param titoloEntrata the new titolo entrata
	 */
	public void setTitoloEntrata(TitoloEntrata titoloEntrata) {
		this.titoloEntrata = titoloEntrata;
	}

	/**
	 * Gets the tipologia titolo.
	 *
	 * @return the tipologia titolo
	 */
	public TipologiaTitolo getTipologiaTitolo() {
		return tipologiaTitolo;
	}

	/**
	 * Sets the tipologia titolo.
	 *
	 * @param tipologiaTitolo the new tipologia titolo
	 */
	public void setTipologiaTitolo(TipologiaTitolo tipologiaTitolo) {
		this.tipologiaTitolo = tipologiaTitolo;
	}

	/**
	 * Gets the capitolo.
	 *
	 * @return the capitolo
	 */
	public Capitolo<?,?> getCapitolo() {
		return capitolo;
	}

	/**
	 * Sets the capitolo.
	 *
	 * @param capitoloEntrataPrevisione the capitolo entrata previsione
	 */
	public void setCapitolo(Capitolo<?,?> capitoloEntrataPrevisione) {
		this.capitolo = capitoloEntrataPrevisione;
	}
	
	
	@Override
	public String toString() {
		return "Entrata: "+this.getStanziamento()+ " anno: "+ this.getAnnoCompetenza() 
				+ " TitoloEntrata: "+(this.getTitoloEntrata()!=null?this.getTitoloEntrata().getCodice() + "("+this.getTitoloEntrata().getUid()+")":"null")
				+ " TipologiaTitolo: "+(this.getTipologiaTitolo()!=null?this.getTipologiaTitolo().getCodice() + "("+this.getTipologiaTitolo().getUid()+")":"null");
	}


	/**
	 * @return the dataFineValiditaDettaglioEntrataCronoprogramma
	 */
	public Date getDataFineValiditaDettaglioEntrataCronoprogramma() {
		return getDataFineValidita();
	}

	/**
	 * @param dataFineValiditaDettaglioEntrataCronoprogramma the dataFineValiditaDettaglioEntrataCronoprogramma to set
	 */
	public void setDataFineValiditaDettaglioEntrataCronoprogramma(Date dataFineValiditaDettaglioEntrataCronoprogramma) {
		setDataFineValidita(dataFineValiditaDettaglioEntrataCronoprogramma);
	}

	/**
	 * @return the isAvanzoAmministrazione
	 */
	public Boolean getIsAvanzoAmministrazione() {
		return isAvanzoAmministrazione;
	}

	/**
	 * @param isAvanzoAmministrazione the isAvanzoAmministrazione to set
	 */
	public void setIsAvanzoAmministrazione(Boolean isAvanzoAmministrazione) {
		this.isAvanzoAmministrazione = isAvanzoAmministrazione;
	}

	

	
	
	

}
