/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import org.apache.commons.lang3.StringUtils;

/**
 * The Enum ContiTipoBeneEnum.
 */
public enum ContoTipoBeneSelector {
	//        codiceClassePiano, codiceTipoConto, attivo, contoFoglia, ammortamento, fondoAmmortamento, plusvalenza, minusValenza, incremento, decremento
	/** The Patrimoniale. */
	Patrimoniale(      "AP", "CES", Boolean.TRUE,  Boolean.TRUE, null,         null,         null,         null,         null,         null),
	
	/** The Ammortamento. */
	Ammortamento(      "CE", null,  Boolean.TRUE,  Boolean.TRUE, Boolean.TRUE, null,         null,         null,         null,         null),
	
	/** The Fondo ammortamento. */
	Fondo_Ammortamento("PP", null,  Boolean.TRUE,  Boolean.TRUE, null,         Boolean.TRUE, null,         null,         null,         null),
	
	/** The Plus valenza. */
	PlusValenza(       "RE", null,  Boolean.TRUE,  Boolean.TRUE, null,         null,         Boolean.TRUE, null,         null,         null),
	
	/** The Minus valenza. */
	MinusValenza(      "CE", null,  Boolean.TRUE,  Boolean.TRUE, null,         null,         null,         Boolean.TRUE, null,         null),
	
	/** The Incremento. */
	Incremento(        "" , null,   Boolean.TRUE,  Boolean.TRUE, null,         null,         null,         null,         Boolean.TRUE, null),
	
	/** The Decremento. */
	Decremento(        "", null,    Boolean.TRUE,  Boolean.TRUE, null,         null,         null,         null,         null,         Boolean.TRUE),
	
	/** The Alienazione. */
	Alienazione(       "", null,    Boolean.TRUE,  Boolean.TRUE, null,         null,         null,         null,         null,         null),
	
	/** The Donazione. */
	Donazione(         "", null,    Boolean.TRUE, Boolean.TRUE, null,         null,         null,         null,         null,         null),
	;
	
	private static final String STRINGA_SI = "S&igrave;";
	private static final String STRINGA_NO = "No";
	
	private String codiceClassePiano;
	private String codiceTipoConto;
	private Boolean attivo;
	private Boolean contoFoglia;
	private Boolean ammortamento;
	private Boolean fondoAmmortamento;
	private Boolean plusvalenza;
	private Boolean minusValenza;
	private Boolean incremento;
	private Boolean decremento;
	
	/**
	 * Instantiates a new conti tipo bene enum.
	 *
	 * @param codiceClassePiano the codice classe piano
	 * @param codiceTipoBene the codice tipo bene
	 * @param ammortamento the ammortamento
	 * @param attivo the attivo
	 * @param contoFoglia the conto foglia
	 */
	private ContoTipoBeneSelector(String codiceClassePiano,String codiceTipoBene, Boolean attivo, Boolean contoFoglia, Boolean ammortamento, Boolean fondoAmmortamento, Boolean plusvalenza, Boolean minusValenza, Boolean incremento, Boolean decremento) {
	    this.codiceClassePiano = codiceClassePiano;
		this.codiceTipoConto = codiceTipoBene;
		this.attivo = attivo;
		this.contoFoglia = contoFoglia;
		this.ammortamento = ammortamento;
		this.fondoAmmortamento = fondoAmmortamento;
		this.plusvalenza = plusvalenza;
		this.minusValenza = minusValenza;
		this.incremento = incremento;
		this.decremento = decremento;
	}

	/**
	 * @return the codiceClassePiano
	 */
	public String getCodiceClassePiano() {
		return codiceClassePiano;
	}

	/**
	 * @return the codiceTipoConto
	 */
	public String getCodiceTipoConto() {
		return codiceTipoConto;
	}

	/**
	 * @return the ammortamento
	 */
	public Boolean getAmmortamento() {
		return ammortamento;
	}

	/**
	 * @return the attivo
	 */
	public Boolean getAttivo() {
		return attivo;
	}

	/**
	 * @return the contoFoglia
	 */
	public Boolean getContoFoglia() {
		return contoFoglia;
	}

	/**
	 * @return the fondoAmmortamento
	 */
	public Boolean getFondoAmmortamento() {
		return fondoAmmortamento;
	}

	/**
	 * @return the plusvalenza
	 */
	public Boolean getPlusvalenza() {
		return plusvalenza;
	}

	/**
	 * @return the minusValenza
	 */
	public Boolean getMinusValenza() {
		return minusValenza;
	}

	/**
	 * @return the incremento
	 */
	public Boolean getIncremento() {
		return incremento;
	}

	/**
	 * @return the decremento
	 */
	public Boolean getDecremento() {
		return decremento;
	}
	
	/**
	 * Gets the descrizione tipo conto selector.
	 *
	 * @return the descrizione tipo conto selector
	 */
	public String getDescrizioneTipoContoSelector() {
		StringBuilder sb = new StringBuilder()
				;
		sb.append("il conto ")
		.append(name())
		.append(" deve avere le seguenti caratteristiche: ")
		.append(ottieniStringaCaratteristicheConto());
		return sb.toString();
	}

	/**
	 * @param sb
	 */
	private String ottieniStringaCaratteristicheConto() {
		StringBuilder sb = new StringBuilder();
		if(StringUtils.isNotBlank(getCodiceClassePiano())) {
			sb.append(" classe piano : ")
			.append(getCodiceClassePiano());
		}
		if(StringUtils.isNotBlank(getCodiceTipoConto())) {
			sb.append(" tipo conto : ")
			.append(getCodiceTipoConto());
		}
		
		sb.append(booleanValueToString("flag attivo",getAttivo()))
		   .append(booleanValueToString("flag conto foglia",getContoFoglia()))
		   .append(booleanValueToString("flag ammortamento",getAmmortamento()))
		   .append(booleanValueToString("flag fondo ammortamento",getFondoAmmortamento()))
		   .append(booleanValueToString("flag plusvalenza", getMinusValenza()))
		   .append(booleanValueToString("flag minusvalenza",getPlusvalenza()))
		   .append(booleanValueToString("flag incremento",getIncremento()))
		   .append(booleanValueToString("flag decremento",getDecremento()))
		   ;
		return sb.toString();
	}
	
	private String booleanValueToString(String etichetta, Boolean booleanValue) {
		if(booleanValue == null) {
			return "";
		}
		return new StringBuilder().append(" ")
				.append(etichetta).append(" : ")
				.append(booleanValue.booleanValue()? STRINGA_SI : STRINGA_NO)
				.toString();
	}
	

}
