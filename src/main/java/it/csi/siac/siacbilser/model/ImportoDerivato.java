/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * Indica che l'importo è derivato da un calcolo
 * 
 * @author Domenico Lisi
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ImportoDerivato {

	/**
	 * Nome dell Function su database da invocare per ricavare l'importo
	 * Se impostato vuol dire che il calcolo verrà demandato ad una Function 
	 * su database il cui nome  è specificato da questo attributo.
	 * 
	 * @return nome della function
	 */
	ImportoDerivatoFunctionEnum value();
	
	/**
	 * Indica se il field a cui e' applicata l'annotazione viene calcolato 
	 * o meno quando non viene specificata la lista degli importi richiesti (caso di default).
	 * 
	 * @return true se da calcolare di default
	 */
	boolean calcolareDiDefault() default true;

}
