/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

/**
 * UnitaPrevisionaleBilancioUscitaGestione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class UPBUscitaGestione extends UnitaPrevisionaleBilancio {

	private static final long serialVersionUID = -6749507136263316920L;
	private boolean flagFondoPluriennaleVinc;
	private List<ImportiUPBUscitaGest> listaImportiUPBUscitaGest = new ArrayList<ImportiUPBUscitaGest>();
	private ElementoPianoDeiConti elementoPdC;
	private StrutturaAmministrativoContabile strutturaAmmContabile;
	private TipoFinanziamento tipoFinanziamento;

	public List<ImportiUPBUscitaGest> getListaImportiUPBUscitaGest() {
		return listaImportiUPBUscitaGest;
	}

	public void setListaImportiUPBUscitaGest(
			List<ImportiUPBUscitaGest> listaImportiUPBUscitaGest) {
		this.listaImportiUPBUscitaGest = listaImportiUPBUscitaGest;
	}

	public ElementoPianoDeiConti getElementoPdC() {
		return elementoPdC;
	}

	public void setElementoPdC(ElementoPianoDeiConti elementoPdC) {
		this.elementoPdC = elementoPdC;
	}

	public StrutturaAmministrativoContabile getStrutturaAmmContabile() {
		return strutturaAmmContabile;
	}

	public void setStrutturaAmmContabile(
			StrutturaAmministrativoContabile strutturaAmmContabile) {
		this.strutturaAmmContabile = strutturaAmmContabile;
	}

	public TipoFinanziamento getTipoFinanziamento() {
		return tipoFinanziamento;
	}

	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
		this.tipoFinanziamento = tipoFinanziamento;
	}

	public boolean isFlagFondoPluriennaleVinc() {
		return flagFondoPluriennaleVinc;
	}

	public void setFlagFondoPluriennaleVinc(boolean flagFondoPluriennaleVinc) {
		this.flagFondoPluriennaleVinc = flagFondoPluriennaleVinc;
	}

}
