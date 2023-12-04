/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccecser.model.CECDataDictionary;
import it.csi.siac.siaccecser.model.CassaEconomale;

/**
 * Enumera tutti fields della classe {@link CassaEconomale} che possano essere gestiti come importi derivati.
 * 
 * @author Marchino Alessandro
 * @version 1.0.0 - 17/09/2015
 */
@XmlType(namespace = CECDataDictionary.NAMESPACE)
public enum ImportiCassaEconomaleEnum {
	
	disponibilitaCassaContanti(ImportoDerivatoFunctionEnum.disponibilitaCassaContanti),
	disponibilitaCassaContoCorrente(ImportoDerivatoFunctionEnum.disponibilitaCassaContoCorrente),
	;
	
	private final ImportoDerivatoFunctionEnum importoDerivatoFunctionEnum;
	
	private ImportiCassaEconomaleEnum(ImportoDerivatoFunctionEnum importoDerivatoFunctionEnum) {
		this.importoDerivatoFunctionEnum = importoDerivatoFunctionEnum;
	}

	/**
	 * @return the importoDerivatoFunctionEnum
	 */
	public ImportoDerivatoFunctionEnum getImportoDerivatoFunctionEnum() {
		return importoDerivatoFunctionEnum;
	}
	
}
