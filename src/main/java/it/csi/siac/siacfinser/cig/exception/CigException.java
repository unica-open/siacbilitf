/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacfinser.cig.exception;

import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.errore.ErroreCore;

/**
 * SIAC-8208
 * 
 * <p>Eccezione per gestire gli errori legati al CIG.</p>
 * 
 * @author todescoa
 *
 */
public class CigException extends RuntimeException {

	//La soluzione non e' molto pulita ma aiuta a non dover eseguire un refactoring omicida
	private static final long serialVersionUID = -3172047672687110161L;
	
	private static final String CIG = "CIG";
	private final Errore errore;
	
	public CigException(String msg){
		super(msg != null ? msg : null);
		this.errore = ErroreCore.FORMATO_NON_VALIDO.getErrore(CIG, msg);
	}
	
	public CigException(Throwable t){
		super(t.getMessage(), t);
		this.errore = new Errore(ErroreCore.ERRORE_DI_SISTEMA.getCodice(), t.getMessage());
	}
	
	public CigException(Errore errore) {
		super(errore != null ? errore.getTesto() : null);
		this.errore = errore;
	}
	
	public Errore getErrore() {
		return errore;
	}
	
}