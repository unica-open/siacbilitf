/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.ric;

/**
 * Il segno da utilizzare per gli importi
 * @author Alessandro Marchino
 *
 */
public enum SegnoImporti {

	NEGATIVO("<"),
	NON_POSITIVO("<="),
	NULLO("="),
	NON_NEGATIVO(">="),
	POSITIVO(">");
	
	private final String operatore;

	private SegnoImporti(String operatore) {
		this.operatore = operatore;
	}
	
	/**
	 * @return the operatore
	 */
	public String getOperatore() {
		return operatore;
	}
	
	
}
