/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.wrapper;

import java.io.Serializable;

import it.csi.siac.siacbilser.model.DettaglioComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.TipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.TipoDettaglioComponenteImportiCapitolo;

public class ImportiCapitoloPerComponente implements Serializable {

	private static final long serialVersionUID = 2095450303172049012L;
	
	private TipoComponenteImportiCapitolo tipoComponenteImportiCapitolo;
	private TipoDettaglioComponenteImportiCapitolo tipoDettaglioComponenteImportiCapitolo;
	
	private DettaglioComponenteImportiCapitolo dettaglioAnnoPrec;
	private DettaglioComponenteImportiCapitolo dettaglioResidui;
	private DettaglioComponenteImportiCapitolo dettaglioAnno0;
	private DettaglioComponenteImportiCapitolo dettaglioAnno1;
	private DettaglioComponenteImportiCapitolo dettaglioAnno2;
	private DettaglioComponenteImportiCapitolo dettaglioAnniSucc;
	
	//SIAC-7159
	private boolean isPropostaDefault;
	
	public boolean isPropostaDefault() {
		return isPropostaDefault;
	}
	public void setPropostaDefault(boolean isPropostaDefault) {
		this.isPropostaDefault = isPropostaDefault;
	}
	
	/**
	 * @return the tipoComponenteImportiCapitolo
	 */
	public TipoComponenteImportiCapitolo getTipoComponenteImportiCapitolo() {
		return tipoComponenteImportiCapitolo;
	}
	/**
	 * @param tipoComponenteImportiCapitolo the tipoComponenteImportiCapitolo to set
	 */
	public void setTipoComponenteImportiCapitolo(TipoComponenteImportiCapitolo tipoComponenteImportiCapitolo) {
		this.tipoComponenteImportiCapitolo = tipoComponenteImportiCapitolo;
	}
	/**
	 * @return the tipoDettaglioComponenteImportiCapitolo
	 */
	public TipoDettaglioComponenteImportiCapitolo getTipoDettaglioComponenteImportiCapitolo() {
		return tipoDettaglioComponenteImportiCapitolo;
	}
	/**
	 * @param tipoDettaglioComponenteImportiCapitolo the tipoDettaglioComponenteImportiCapitolo to set
	 */
	public void setTipoDettaglioComponenteImportiCapitolo(
			TipoDettaglioComponenteImportiCapitolo tipoDettaglioComponenteImportiCapitolo) {
		this.tipoDettaglioComponenteImportiCapitolo = tipoDettaglioComponenteImportiCapitolo;
	}
	/**
	 * @return the dettaglioAnnoPrec
	 */
	public DettaglioComponenteImportiCapitolo getDettaglioAnnoPrec() {
		return dettaglioAnnoPrec;
	}
	/**
	 * @param dettaglioAnnoPrec the dettaglioAnnoPrec to set
	 */
	public void setDettaglioAnnoPrec(DettaglioComponenteImportiCapitolo dettaglioAnnoPrec) {
		this.dettaglioAnnoPrec = dettaglioAnnoPrec;
	}
	/**
	 * @return the dettaglioResidui
	 */
	public DettaglioComponenteImportiCapitolo getDettaglioResidui() {
		return dettaglioResidui;
	}
	/**
	 * @param dettaglioResidui the dettaglioResidui to set
	 */
	public void setDettaglioResidui(DettaglioComponenteImportiCapitolo dettaglioResidui) {
		this.dettaglioResidui = dettaglioResidui;
	}
	/**
	 * @return the dettaglioAnno0
	 */
	public DettaglioComponenteImportiCapitolo getDettaglioAnno0() {
		return dettaglioAnno0;
	}
	/**
	 * @param dettaglioAnno0 the dettaglioAnno0 to set
	 */
	public void setDettaglioAnno0(DettaglioComponenteImportiCapitolo dettaglioAnno0) {
		this.dettaglioAnno0 = dettaglioAnno0;
	}
	/**
	 * @return the dettaglioAnno1
	 */
	public DettaglioComponenteImportiCapitolo getDettaglioAnno1() {
		return dettaglioAnno1;
	}
	/**
	 * @param dettaglioAnno1 the dettaglioAnno1 to set
	 */
	public void setDettaglioAnno1(DettaglioComponenteImportiCapitolo dettaglioAnno1) {
		this.dettaglioAnno1 = dettaglioAnno1;
	}
	/**
	 * @return the dettaglioAnno2
	 */
	public DettaglioComponenteImportiCapitolo getDettaglioAnno2() {
		return dettaglioAnno2;
	}
	/**
	 * @param dettaglioAnno2 the dettaglioAnno2 to set
	 */
	public void setDettaglioAnno2(DettaglioComponenteImportiCapitolo dettaglioAnno2) {
		this.dettaglioAnno2 = dettaglioAnno2;
	}
	/**
	 * @return the dettaglioAnniSucc
	 */
	public DettaglioComponenteImportiCapitolo getDettaglioAnniSucc() {
		return dettaglioAnniSucc;
	}
	/**
	 * @param dettaglioAnniSucc the dettaglioAnniSucc to set
	 */
	public void setDettaglioAnniSucc(DettaglioComponenteImportiCapitolo dettaglioAnniSucc) {
		this.dettaglioAnniSucc = dettaglioAnniSucc;
	}
	
}
