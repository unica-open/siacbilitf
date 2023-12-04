/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.business.utility.mutuo.filter;

import it.csi.siac.siacbilser.model.mutuo.RataMutuo;
import it.csi.siac.siaccommon.util.collections.Filter;

public class RataMutuoNonScadutaFilter implements Filter<RataMutuo> {

	@Override
	public boolean isAcceptable(RataMutuo source) {
		return !source.isScaduta();
	}

}
