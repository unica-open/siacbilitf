/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.business.utility.mutuo;

import it.csi.siac.siacbilser.model.mutuo.RataMutuo;
import it.csi.siac.siaccommon.util.date.DateUtil;
import it.csi.siac.siaccommon.util.fileparser.LineMapper;
import it.csi.siac.siaccommon.util.number.NumberUtil;

public class RataMutuoLineMapper implements LineMapper<RataMutuo>{

	@Override
	public RataMutuo mapValues(String[] values) {
		
		if (values.length < 1) {
			return null;
		}
		
		RataMutuo rataMutuo = new RataMutuo();
		
		int i = 0;
		
		i++; // skip first column
		rataMutuo.setAnno(new Integer(values[i++]));
		rataMutuo.setNumeroRataAnno(new Integer(values[i++]));
		rataMutuo.setDataScadenza(DateUtil.parseDate(values[i++]));
		rataMutuo.setImportoTotale(NumberUtil.decimalToBigDecimal(values[i++]));
		rataMutuo.setImportoQuotaCapitale(NumberUtil.decimalToBigDecimal(values[i++]));
		rataMutuo.setImportoQuotaInteressi(NumberUtil.decimalToBigDecimal(values[i++]));
		rataMutuo.setImportoQuotaOneri(NumberUtil.decimalToBigDecimal(values[i++]));
		rataMutuo.setDebitoIniziale(NumberUtil.decimalToBigDecimal(values[i++]));
		rataMutuo.setDebitoResiduo(NumberUtil.decimalToBigDecimal(values[i++]));
		
		return rataMutuo;
	}
	
}
