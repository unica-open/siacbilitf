/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.frontend.webservice.msg.base.BaseComponenteImportiCapitoloResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AnnullaComponenteImportiCapitoloResponse extends BaseComponenteImportiCapitoloResponse {
	// Nothing to add
}
