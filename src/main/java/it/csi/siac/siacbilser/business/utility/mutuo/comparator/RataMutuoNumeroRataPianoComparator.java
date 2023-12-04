/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.business.utility.mutuo.comparator;

import java.util.Comparator;

import it.csi.siac.siacbilser.model.mutuo.RataMutuo;

public class RataMutuoNumeroRataPianoComparator implements Comparator<RataMutuo>{

	@Override
	public int compare(RataMutuo arg0, RataMutuo arg1) {
		return arg0.getNumeroRataPiano().compareTo(arg1.getNumeroRataPiano());
	}
}
