/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * Indica che il field annotato è un importo che viene effettivamente salvato su database.
 * Serve per distinguere gli importi da salvare dagli importi derivanti da un calcolo.
 * 
 * @author Domenico Lisi
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ImportoPersistente {
	// Nothing to add
}
