/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import it.csi.siac.siaccorser.model.ServiceRequest;


/**
 * 
 * Annota un metodo di una {@link ServiceRequest}.
 * Se il metodo restituisce Boolean.TRUE allora verra' saltata l'esecuzione del servizio e 
 * verra' effettuato solamente il controllo di elaborazione attiva. 
 * 
 * @author Domenico
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface CheckOnlyElaborazioneAttiva {
	// Nothing to add
}
