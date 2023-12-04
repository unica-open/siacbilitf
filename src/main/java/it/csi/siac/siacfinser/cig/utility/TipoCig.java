/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacfinser.cig.utility;

/**
 * SIAC-8208
 * 
 * <p>Enumearazione per i tipi di CIG.</p>
 * 
 * <pre>
 * Tipi ammessi: 
 * 
 * CIG
 * SMART CIG
 * CIG UNICO
 * </pre>
 * 
 * @author todescoa
 *
 */
public enum TipoCig {

	CIG("CIG"),
	SMART_CIG("SMART_CIG"),
	CIG_UNICO("CIG_UNICO")
	;
	
	private final String name;
	
	TipoCig(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
}