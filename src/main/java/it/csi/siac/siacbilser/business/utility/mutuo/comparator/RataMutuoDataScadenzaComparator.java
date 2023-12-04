/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.business.utility.mutuo.comparator;

import java.util.Comparator;

import it.csi.siac.siacbilser.model.mutuo.RataMutuo;
import it.csi.siac.siaccommon.util.date.DateUtil;

public class RataMutuoDataScadenzaComparator implements Comparator<RataMutuo>{

	@Override
	public int compare(RataMutuo arg0, RataMutuo arg1) {
		return DateUtil.compareTo(arg0.getDataScadenza(), arg1.getDataScadenza());
	}
}
