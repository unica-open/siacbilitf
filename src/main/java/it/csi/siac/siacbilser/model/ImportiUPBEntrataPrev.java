/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * ImportiUPBEntrataPrev, rappresenta le voci relative agli importi dell'UPB di
 * entrata previsione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ImportiUPBEntrataPrev extends ImportiUPB {

	private static final long serialVersionUID = -8157739379486156883L;

	public ImportiUPBEntrataPrev() {
		super();

	}

}
