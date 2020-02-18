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
 * UnitaPrevisionaleBilancioEntrataPrevisione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class UPBEntrataPrevisione extends UnitaPrevisionaleBilancio {

	private static final long serialVersionUID = 3820907799309760215L;
	private Boolean flagPerMemoria;
	private List<ImportiUPBEntrataPrev> listaImportiUPBEntrataPrev = new ArrayList<ImportiUPBEntrataPrev>();
	private ElementoPianoDeiConti elementoPdC;
	private StrutturaAmministrativoContabile strutturaAmmContabile;
	private TipoFinanziamento tipoFinanziamento;

	public List<ImportiUPBEntrataPrev> getListaImportiUPBEntrataPrev() {
		return listaImportiUPBEntrataPrev;
	}

	public void setListaImportiUPBEntrataPrev(
			List<ImportiUPBEntrataPrev> listaImportiUPBEntrataPrev) {
		this.listaImportiUPBEntrataPrev = listaImportiUPBEntrataPrev;
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

	public Boolean getFlagPerMemoria() {
		return flagPerMemoria;
	}

	public void setFlagPerMemoria(Boolean flagPerMemoria) {
		this.flagPerMemoria = flagPerMemoria;
	}

}
