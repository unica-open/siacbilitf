/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.business.utility;

import it.csi.siac.siacbilser.model.TipoProgetto;
import it.csi.siac.siaccorser.model.FaseBilancio;

public class FaseBilancioTipoProgettoMapper {
	private FaseBilancioTipoProgettoMapper() {
	}

	public static TipoProgetto map(FaseBilancio faseBilancio) {
		return FaseBilancio.PREVISIONE.equals(faseBilancio) || FaseBilancio.ESERCIZIO_PROVVISORIO.equals(faseBilancio)?
				TipoProgetto.PREVISIONE
				: FaseBilancio.GESTIONE.equals(faseBilancio) ? 
						TipoProgetto.GESTIONE : null;
	}
}
