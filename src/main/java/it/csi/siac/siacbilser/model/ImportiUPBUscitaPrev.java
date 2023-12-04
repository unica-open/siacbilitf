/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * ImportiUPBUscitaPrev, rappresenta le voci relative agli importi dell'UPB di
 * uscita previsione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ImportiUPBUscitaPrev extends ImportiUPB {

	private static final long serialVersionUID = 4673788839558190713L;

	public ImportiUPBUscitaPrev() {
		super();

	}

}
