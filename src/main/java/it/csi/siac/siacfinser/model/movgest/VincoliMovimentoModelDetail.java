/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacfinser.model.movgest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;
import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
* The Enum RicercaSinteticaModulareVincoliMovimentoModelDetail.
* 
* @author Alessandro Todesco
*/
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public enum VincoliMovimentoModelDetail implements ModelDetailEnum {

	Impegno,
	Accertamento,
	AvanzoVincolo,
	SommaImportiModVincoloAccertamento,
	SommaImportiModVincoloImpegno,
	BilancioAccertamento,
	BilancioImpegno,
	ImportoAccertamento,
	ImportoImpegno,
	DiCuiPending;
	
	public static VincoliMovimentoModelDetail[] getAllModelDetailFromEnum() {
		List<VincoliMovimentoModelDetail> list = new ArrayList<VincoliMovimentoModelDetail>(
			EnumSet.allOf(VincoliMovimentoModelDetail.class)
		);
		return list.toArray(new VincoliMovimentoModelDetail[list.size()]);
	}

	public static VincoliMovimentoModelDetail[] getAllModelDetailForVincoliAccertamento() {
		return (VincoliMovimentoModelDetail[]) Arrays.asList(
				Impegno, 
				BilancioImpegno, 
				ImportoImpegno,
				SommaImportiModVincoloAccertamento
			).toArray();
	}
	
	public static VincoliMovimentoModelDetail[] getAllModelDetailForVincoliImpegno() {
		return (VincoliMovimentoModelDetail[]) Arrays.asList(
				Accertamento, 
				AvanzoVincolo, 
				BilancioAccertamento, 
				ImportoAccertamento, 
				SommaImportiModVincoloImpegno
			).toArray();
	}

}
