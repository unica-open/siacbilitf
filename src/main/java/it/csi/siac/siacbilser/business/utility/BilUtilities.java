/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.business.utility;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Utilities per la gestione del modulo BIL.
 * 
 * @author Marchino Alessandro
 * @version 1.0.0 - 10/02/2015
 *
 */
public final class BilUtilities {
	
	/** Il BigDecimal corrispondente al numero 100, da utilizzare nei calcoli sulle percentuali */
	public static final BigDecimal BIG_DECIMAL_ONE_HUNDRED = new BigDecimal("100");
	/** Il contesto da utilizzare nei calcoli con i BigDecimal: imposta due sole cifre decimali */
	public static final MathContext MATH_CONTEXT_TWO_HALF_DOWN = new MathContext(2, RoundingMode.HALF_DOWN);
	
	/**
	 * Instantiates a new bil utilities.
	 */
	private BilUtilities() {
		//costruttore vuoto, ma privato: non voglio che nessuno lo possa creare
	}	
	
	/**
	 * Arrotonda un numero passato in input alla seconda cifra decimale: se  il numero risulta essere equidistante dai due numeri piu' vicini,
	 *  viene arrotondato a quello pi&ugrave; basso.
	 *  
	 *  <pre>
	 *  0,012 -> 0,01
	 *  0,015 -> 0,01
	 *  0,017 -> 0,02
	 *	</pre>
	 * @param numeroDaArrotondare il numero da arrotondare
	 * @return il numero arrotondato alla seconda cifra
	 */
	public static BigDecimal arrotondaAllaSecondaCifra(BigDecimal numeroDaArrotondare) {
		if(numeroDaArrotondare == null) {
			//numero da arrotondare non presente, ritorno null.
			return null;
		}
		//arrotondo il numero
		return numeroDaArrotondare.setScale(MATH_CONTEXT_TWO_HALF_DOWN.getPrecision(), MATH_CONTEXT_TWO_HALF_DOWN.getRoundingMode());
	}
	
	
}
