/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser;

import java.util.List;

import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoPagamento;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
import it.csi.siac.siacfinser.model.soggetto.SoggettoSedeModPagInfo;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;
import it.csi.siac.siacfinser.model.soggetto.sedesecondaria.SedeSecondariaSoggetto;

/**
 * Per raccogliere a fattor comune i metodi che rimaneggiano le entita di finitf
 * @author claudio.picco
 *
 */
public class EntitaUtils {

	/**
	 * 
	 * Messo qui a fattor comune tra finapp e bilserverilm.
	 * 
	 * Sono le contorte logiche per interpretare soggetto - sede secondaria - modalita pagamento
	 * di un ordinativo di pagamento resituito dal servizio di ricerca ordinativo pagamento per chiave.
	 * 
	 * @param ordPag
	 * @return
	 */
	public final static SoggettoSedeModPagInfo modalitaPagamentoOrdPag(OrdinativoPagamento ordPag){
	
		SoggettoSedeModPagInfo info = new SoggettoSedeModPagInfo();
		
		Soggetto soggetto = ordPag.getSoggetto();
		List<SedeSecondariaSoggetto> listaSedi = soggetto.getSediSecondarie();
		SedeSecondariaSoggetto sedeSelezionata = null;
		ModalitaPagamentoSoggetto modPagSelezionata = null;
		List<ModalitaPagamentoSoggetto> modPagsSog = null;
		if(listaSedi!=null && listaSedi.size()==1 && listaSedi.get(0)!=null){
			//CASO IN CUI LA MODALITA' PAGAMENTO E' DI UNA SEDE
			sedeSelezionata = listaSedi.get(0); 
			modPagsSog = sedeSelezionata.getModalitaPagamentoSoggettos();
		} else {
			//CASO IN CUI LA MODALITA' PAGAMENTO E' DEL SOGGETTO
			modPagsSog =  soggetto.getModalitaPagamentoList();
		}
		if(modPagsSog!=null && modPagsSog.size()==1){
			modPagSelezionata = modPagsSog.get(0);
		}
		
		info.setModalitaPagamento(modPagSelezionata);
		info.setSedeSecondaria(sedeSelezionata);
		info.setSoggetto(soggetto);
		
		return info;
	}
	
	public final static boolean entitaConUid(Entita entita) {
		return entita != null && entita.getUid() != 0;
	}
	
}
