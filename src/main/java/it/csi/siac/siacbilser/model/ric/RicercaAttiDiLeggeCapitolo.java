/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.ric;

import it.csi.siac.siacattser.model.AttoDiLegge;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siaccorser.model.Entita;

public class RicercaAttiDiLeggeCapitolo extends Entita {
	
	private static final long serialVersionUID = 5447195758214531070L;

	private Bilancio bilancio = null;
	
	private Capitolo<?, ?> capitolo = null;
	
	private AttoDiLegge attoDiLegge;

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}

	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}

	public AttoDiLegge getAttoDiLegge() {
		return attoDiLegge;
	}

	public void setAttoDiLegge(AttoDiLegge attoDiLegge) {
		this.attoDiLegge = attoDiLegge;
	}
}
