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
 * UnitaPrevisionaleBilancioUscitaPrevisione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class UPBUscitaPrevisione extends UnitaPrevisionaleBilancio {

	private static final long serialVersionUID = -4979128718610417317L;

	private Boolean flagPerMemoria;
//	private UPBEntrataPrevisione upbEntrataPrevisione;

	private List<ImportiUPBUscitaPrev> listaImportiUPBUscitaPrev = new ArrayList<ImportiUPBUscitaPrev>();
	private ElementoPianoDeiConti elementoPdC;
	private StrutturaAmministrativoContabile strutturaAmmContabile;
	private TipoFinanziamento tipoFinanziamento;

	public TipoFinanziamento getTipoFinanziamento() {
		return tipoFinanziamento;
	}

	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
		this.tipoFinanziamento = tipoFinanziamento;
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

	public List<ImportiUPBUscitaPrev> getListaImportiUPBUscitaPrev() {
		return listaImportiUPBUscitaPrev;
	}

	public void setListaImportiUPBUscitaPrev(
			List<ImportiUPBUscitaPrev> listaImportiUPBUscitaPrev) {
		this.listaImportiUPBUscitaPrev = listaImportiUPBUscitaPrev;
	}

	public Boolean getFlagPerMemoria() {
		return flagPerMemoria;
	}

	public void setFlagPerMemoria(Boolean flagPerMemoria) {
		this.flagPerMemoria = flagPerMemoria;
	}

//	public UPBEntrataPrevisione getUpbEntrataPrevisione() {
//		return upbEntrataPrevisione;
//	}
//
//	public void setUpbEntrataPrevisione(
//			UPBEntrataPrevisione upbEntrataPrevisione) {
//		this.upbEntrataPrevisione = upbEntrataPrevisione;
//	}

}
