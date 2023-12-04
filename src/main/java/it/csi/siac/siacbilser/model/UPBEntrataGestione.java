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
 * UnitaPrevisionaleBilancioEntrataGestione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class UPBEntrataGestione extends UnitaPrevisionaleBilancio {

	private static final long serialVersionUID = -6637841618054569608L;
	private List<ImportiUPBEntrataGest> listaImportiUPBEntrataGest = new ArrayList<ImportiUPBEntrataGest>();
	private ElementoPianoDeiConti elementoPdC;
	private StrutturaAmministrativoContabile strutturaAmmContabile;
	private TipoFinanziamento tipoFinanziamento;

	public List<ImportiUPBEntrataGest> getListaImportiUPBEntrataGest() {
		return listaImportiUPBEntrataGest;
	}

	public void setListaImportiUPBEntrataGest(
			List<ImportiUPBEntrataGest> listaImportiUPBEntrataGest) {
		this.listaImportiUPBEntrataGest = listaImportiUPBEntrataGest;
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
	

}
