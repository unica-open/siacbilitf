/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public final class CodiciOperazioni {


	
	public static final String OP_ATTGESC001_inserisciProvvedimento = "OP-ATTGESC001-insProv"; 
	
	public static final String OP_SPE_gestisciImpegnoSDF = "OP-SPE-gestisciImpegnoSDF";
	
	
	public static final String OP_SOG_inserisciSoggDec = "OP-SOG-inserisciSoggDec"; 
	public static final String OP_SOG_gestisciSogg = "OP-SOG-gestisciSogg";
	public static final String OP_SOG_gestisciSoggDec = "OP-SOG-gestisciSoggDec";
	public static final String OP_SOG_leggiSoggDec = "OP-SOG-leggiSoggDec";
	
	// impegno
	public static final String OP_SPE_gestisciImpegno = "OP-SPE-gestisciImpegno";
	public static final String OP_SPE_gestisciImpegnoDecentrato = "OP-SPE-gestisciImpegnoDecentrato";
	public static final String OP_SPE_gestisciImpegnoDecentratoP = "OP-SPE-gestisciImpegnoDecentratoP";
	//SIAC-7360
	public static final String OP_SPE_GestisciModifica = "OP-SPE-GestisciModifica";
	public static final String OP_SPE_gestisciImpegnoRIACC = "OP-SPE-gestisciImpegnoRIACC";
	public static final String OP_SPE_gestisciImpegnoPluriennale = "OP-SPE-gestisciImpegnoPluriennale";
	public static final String OP_SPE_aggiornaImpegnoGSA = "OP-SPE-aggiornaImpegnoGsa";
	
	//parere sull'impegno
	public static final String OP_SPE_gestisciParere = "OP-SPE-gestisciParere";
	
	//accertamento
	public static final String OP_ENT_gestisciAccertamento = "OP-ENT-gestisciAccertamento";
	public static final String OP_ENT_gestisciAccertamentoDecentrato = "OP-ENT-gestisciAccertamentoDecentrato";
	public static final String OP_ENT_gestisciAccertamentoDecentratoP = "OP-ENT-gestisciAccertamentoDecentratoP";
	//SIAC-7360
	public static final String OP_ENT_GestisciModifica = "OP-ENT-GestisciModifica";
	public static final String OP_ENT_gestisciAccertamentoRIACC = "OP-ENT-gestisciAccertamentoRIACC";
	public static final String OP_ENT_gestisciAccertamentoPluriennale = "OP-ENT-gestisciAccertamentoPluriennale";
	public static final String OP_ENT_aggiornaAccertamentoGSA = "OP-ENT-aggiornaAccertamentoGsa";
	
	// mutuo
	public static final String OP_MUT_gestisciMutuo = "OP-MUT-gestisciMutuo";
	public static final String OP_MUT_leggiMutuo = "OP-MUT-leggiMutuo";
	public static final String OP_COM_gestisciCFG = "OP-COM-gestisciCFG";
	public static final String OP_SPE_insMan = "OP-SPE-insMan";
	public static final String OP_SPE_insManQuietanza = "OP-SPE-insManQuietanza";
	
	// lettore impegno / accertamento
	public static final String LEGGI_IMP = "OP-SPE-leggiImpegno";
	public static final String LEGGI_ACC="OP-ENT-leggiAccertamento";
	
	//liquidazione
	public static final String OP_SPE_insLiq = "OP-SPE-insLiq";
	// Ordinativo
	public static final String OP_SPE_RICMAN = "OP-SPE-ricMan";
	public static final String OP_SPE_insLiqMan = "OP-SPE-insLiqMan";
	
	public static final String OP_SPE_LEGGIPROVVCASSA = "OP-OIL-leggiProvvisoriCassa";
	public static final String OP_SPE_INSPROVVCASSA = "OP-OIL-InsProvvisorioCassa";
	public static final String OP_SPE_AGGPROVVCASSA = "OP-OIL-aggProvvisoriCassa";
	public static final String OP_SPE_GESTPROVVCASSA = "OP-OIL-GestProvvisorioCassa";
	public static final String OP_OIL_AGG_DEC_PROVV_CASSA = "OP-OIL-aggDecProvvisoriCassa";
	
	//Ordinativo pagamento:
	public static final String OP_SPE_aggMan = "OP-SPE-aggMan";
	public static final String OP_SPE_aggManQuietanza = "OP-SPE-aggManQuietanza";
	public static final String OP_SPE_varMan = "OP-SPE-varMan";
	public static final String OP_SPE_AGGMAN = "OP-SPE-aggMan";
	public static final String OP_SPE_REINTROITO_ORD_PAG = "OP-SPE-reintroitoOrdPag";
	
	//Ordinativo Incasso
	public static final String OP_ENT_INS_ORD_INC_QUIETANZA = "OP-ENT-insOrdIncQuietanza";
	public static final String OP_ENT_insOrdInc = "OP-ENT-insOrdInc";
	public static final String OP_ENT_insAcc = "OP-ENT-insAcc";
	public static final String OP_ENT_RICORDINC = "OP-ENT-ricOrdInc";
	public static final String OP_ENT_AGGORDINC = "OP-ENT-aggOrdInc";
	public static final String OP_ENT_VARORDINC = "OP-ENT-varOrdInc";

	// carta contabile
	public static final String OP_SPE_ricCarta = "OP-SPE-ricCarta";
	public static final String OP_SPE_INSCARTA = "OP-SPE-insCarta";
	public static final String OP_SPE_AGGCARTA = "OP-SPE-aggCarta";
	public static final String OP_SPE_AGGCARTARAGIO = "OP-SPE-aggCartaRagio";
	public static final String OP_SPE_regCarta = "OP-SPE-regCarta";
	
	
	public static final Map<String, List<String>> MAP_CORRISPONDENZE_DEC = new HashMap<String, List<String>>(0);
	public static final List<String> AZIONI_DECENTRATO = new ArrayList<String>(0);
	/*
	 *  Associazione delle operazione di decentrato in base 
	 *  all'azione di entrata
	 *  
	 *  ad esempio:
	 *  leggiImpegno --> gestisciImpegnoDEC
	 *  
	 */
	static {
		List<String> ls1 = new ArrayList<String>();
		ls1.add(CodiciOperazioni.OP_SPE_gestisciImpegnoDecentrato);
		MAP_CORRISPONDENZE_DEC.put(CodiciOperazioni.LEGGI_IMP, ls1);
		ls1 = new ArrayList<String>();
		ls1.add(CodiciOperazioni.OP_ENT_gestisciAccertamentoDecentrato);
		MAP_CORRISPONDENZE_DEC.put(CodiciOperazioni.LEGGI_ACC, ls1);
	
		AZIONI_DECENTRATO.add(OP_SPE_gestisciImpegnoDecentrato);
		AZIONI_DECENTRATO.add(OP_ENT_gestisciAccertamentoDecentrato);
		
		AZIONI_DECENTRATO.add(OP_SOG_inserisciSoggDec);
		AZIONI_DECENTRATO.add(OP_SOG_leggiSoggDec);
		
	}
	
	private CodiciOperazioni() {
		// Non permettere l'instanziazione
	}
}