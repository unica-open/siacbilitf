/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacfinser.model.Accertamento;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaAccertamentiAssociabiliMutuo extends RicercaMovimentiGestioneMutuo {

}
