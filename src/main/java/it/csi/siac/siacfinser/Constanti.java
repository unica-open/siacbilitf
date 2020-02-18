/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser;


import java.util.ArrayList;
import java.util.List;

import it.csi.siac.siacfinser.model.MovimentoGestione.AttributoMovimentoGestione;
import it.csi.siac.siacfinser.model.carta.CartaContabile.StatoOperativoCartaContabile;
import it.csi.siac.siacfinser.model.codifiche.ModalitaAccreditoSoggetto;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione.StatoOperativoLiquidazione;
import it.csi.siac.siacfinser.model.movgest.ModificaMovimentoGestione.StatoOperativoModificaMovimentoGestione;
import it.csi.siac.siacfinser.model.mutuo.Mutuo.StatoOperativoMutuo;
import it.csi.siac.siacfinser.model.mutuo.Mutuo.TipoMutuo;
import it.csi.siac.siacfinser.model.mutuo.VariazioneImportoVoceMutuo.TipoVariazioneImportoVoceMutuo;
import it.csi.siac.siacfinser.model.mutuo.VoceMutuo.OrigineVoceMutuo;
import it.csi.siac.siacfinser.model.ordinativo.Ordinativo.StatoOperativoOrdinativo;
import it.csi.siac.siacfinser.model.ordinativo.Ordinativo.TipoAssociazioneEmissione;
import it.csi.siac.siacfinser.model.provvisoriDiCassa.ProvvisorioDiCassa.TipoProvvisorioDiCassa;
import it.csi.siac.siacfinser.model.soggetto.Soggetto.StatoOperativoAnagrafica;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto.TipoAccredito;
import it.csi.siac.siacfinser.model.soggetto.sedesecondaria.SedeSecondariaSoggetto.StatoOperativoSedeSecondaria;



public final class Constanti {
	
	
	public static final String AMBITO_FIN = "AMBITO_FIN";
	public static final String AMBITO_CEC = "AMBITO_CEC";
	
	public static final String MASCHIO = "MASCHIO";
	public static final String FEMMINA = "FEMMINA";
	public static final String SESSO_M = "M";
	public static final String SESSO_F = "F";
	
	public static final String GESTIONE_PARERE_FINANZIARIO="GESTIONE_PARERE_FINANZIARIO";
	public static final String GESTIONE_UEB="GESTIONE_UEB";
	public static final String GESTIONE_GSA="GESTIONE_GSA";
	public static final String AGGIORNA_IMPORTO_LIQ="AGGIORNA_IMPORTO_LIQ";
	
	
	public static final String STATO_VALIDO = "VALIDO";
	public static final String STATO_PROVVISORIO ="PROVVISORIO";
	public static final String STATO_ANNULLATO = "ANNULLATO";
	public static final String STATO_BLOCCATO = "BLOCCATO";
	public static final String STATO_IN_MODIFICA = "IN_MODIFICA";
	public static final String STATO_IN_MODIFICA_no_underscore = "IN MODIFICA";
	public static final String STATO_DEFINITIVO = "DEFINITIVO";
	public static final String STATO_DEFINITIVO_NON_LIQUIDABILE = "DEFINITIVO NON LIQUIDABILE";
	
	public static final String REGEX_IBAN_IT_VALIDO = "^IT[0-9]{2}[A-Z][0-9]{10}[0-9A-Z]{12}$";
	
	public static final String MODIFICA_CONTESTUALE_INSERIMENTO_ORDINATIVO = "Modifica contestuale all'inserimento dell'ordinativo";
	public static final String MODIFICA_CONTESTUALE_INSERIMENTO_MANUALE_ORDINATIVO = "Modifica contestuale all'inserimento manuale dell'ordinativo";
	public static final String MODIFICA_AUTOMATICA_PREDISPOSIZIONE_INCASSO = "Modifica automatica per predisposizione di incasso";
	
	public static final String CODE_TIPO_FAMIGLIA_CAUSALE_PREDOC_E = "PREDOC_E";
	
	//TIPO DEBITO SIOPE:
	public static final String SIOPE_CODE_COMMERCIALE = "CO";
	public static final String SIOPE_CODE_NON_COMMERCIALE = "NC";
	
	//MOTIVAZIONE ASSENZA CIG:
	public static final String ASSENZA_CIG_CODE_ACQUISTO_LOCAZIONE = "AL";
	public static final String ASSENZA_CIG_CODE_ARBITRATO = "AR";
	public static final String ASSENZA_CIG_CODE_SERVIZI_BNKIT = "SB";
	public static final String ASSENZA_CIG_CODE_CONTRATTI = "CO";
	public static final String ASSENZA_CIG_CODE_APPALTI = "AP";
	public static final String ASSENZA_CIG_CODE_APPALTI_ENERGIA = "AE";
	public static final String ASSENZA_CIG_CODE_SPONSORIZZAZIONE = "SP";
	public static final String ASSENZA_CIG_CODE_PRESTAZIONI = "PR";
	public static final String ASSENZA_CIG_CODE_SCELTA_SOCIO = "SS";
	public static final String ASSENZA_CIG_CODE_IN_CORSO_DI_DEFINIZIONE = "ID";
	public static final String ASSENZA_CIG_DA_DEFINIRE_IN_FASE_DI_LIQUIDAZIONE = "CL";
	
	private Constanti() {
		// Non permettere l'instanziazione
	}
	
	/**
	 * Ritorna il codice dello stato scritto esteso
	 * @param statoEsteso
	 * @return
	 */
	public static String convertiStatoMovgest(String statoEsteso){
		if(STATO_PROVVISORIO.equals(statoEsteso) || MOVGEST_STATO_PROVVISORIO.equals(statoEsteso)){
			
			return MOVGEST_STATO_PROVVISORIO;
			
		} else if(STATO_DEFINITIVO.equals(statoEsteso) || MOVGEST_STATO_DEFINITIVO.equals(statoEsteso)){
			
			return MOVGEST_STATO_DEFINITIVO;
			
		}else if(STATO_ANNULLATO.equals(statoEsteso) || MOVGEST_STATO_ANNULLATO.equals(statoEsteso)){
			
			return MOVGEST_STATO_ANNULLATO;
			
		}else if(STATO_DEFINITIVO_NON_LIQUIDABILE.equals(statoEsteso) || MOVGEST_STATO_DEFINITIVO_NON_LIQUIDABILE.equals(statoEsteso)){
			
			return MOVGEST_STATO_DEFINITIVO_NON_LIQUIDABILE;
		}
		//stato non riconoscuto
		return null;
	}
	
	public static StatoOperativoAnagrafica statoOperativoAnagraficaStringToEnum(String code){
		if(StatoOperativoAnagrafica.PROVVISORIO.name().equals(code)){
			return StatoOperativoAnagrafica.PROVVISORIO;
		} else if(StatoOperativoAnagrafica.VALIDO.name().equals(code)){
			return StatoOperativoAnagrafica.VALIDO;
		} else if(StatoOperativoAnagrafica.ANNULLATO.name().equals(code)){
			return StatoOperativoAnagrafica.ANNULLATO;
		} else if(StatoOperativoAnagrafica.BLOCCATO.name().equals(code)){
			return StatoOperativoAnagrafica.BLOCCATO;
		}else if(StatoOperativoAnagrafica.SOSPESO.name().equals(code)){
			return StatoOperativoAnagrafica.SOSPESO;
		}else if(StatoOperativoAnagrafica.IN_MODIFICA.name().equals(code)){
			return StatoOperativoAnagrafica.IN_MODIFICA;
		}
		return StatoOperativoAnagrafica.VALIDO;
	}
	
	public static StatoOperativoSedeSecondaria statoOperativoSediSecondarieStringToEnum(String code){
		if(StatoOperativoAnagrafica.PROVVISORIO.name().equals(code)){
			return StatoOperativoSedeSecondaria.PROVVISORIO;
		} else if(StatoOperativoAnagrafica.VALIDO.name().equals(code)){
			return StatoOperativoSedeSecondaria.VALIDO;
		} else if(StatoOperativoAnagrafica.ANNULLATO.name().equals(code)){
			return StatoOperativoSedeSecondaria.ANNULLATO;
		} else if(StatoOperativoAnagrafica.BLOCCATO.name().equals(code)){
			return StatoOperativoSedeSecondaria.BLOCCATO;
		}else if(StatoOperativoAnagrafica.SOSPESO.name().equals(code)){
			return StatoOperativoSedeSecondaria.SOSPESO;
		}else if(StatoOperativoAnagrafica.IN_MODIFICA.name().equals(code)){
			return StatoOperativoSedeSecondaria.IN_MODIFICA;
		}
		return StatoOperativoSedeSecondaria.VALIDO;
	}

	public static AttributoMovimentoGestione attributoMovimentoGestioneStringToEnum(String code){
		String codeTrimmed = "";
		if(code!=null){
			codeTrimmed = code.trim();
		}
		
		if(AttributoMovimentoGestione.annoCapitoloOrigine.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.annoCapitoloOrigine; 																	
		}else if(AttributoMovimentoGestione.annoOriginePlur.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.annoOriginePlur;								
		}else if(AttributoMovimentoGestione.annoRiaccertato.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.annoRiaccertato; 
		}else if(AttributoMovimentoGestione. numeroArticoloOrigine.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione. numeroArticoloOrigine; 
		}else if(AttributoMovimentoGestione. flagDaRiaccertamento.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione. flagDaRiaccertamento; 	
		}else if(AttributoMovimentoGestione.FlagCollegamentoAccertamentoFattura.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.FlagCollegamentoAccertamentoFattura; 	
		}else if(AttributoMovimentoGestione.FlagCollegamentoAccertamentoCorrispettivo.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.FlagCollegamentoAccertamentoCorrispettivo; 	
		}else if(AttributoMovimentoGestione.FlagAttivaGsa.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.FlagAttivaGsa; 	
		}else if(AttributoMovimentoGestione.numeroCapitoloOrigine.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.numeroCapitoloOrigine; 																									
		}else if(AttributoMovimentoGestione.numeroOriginePlur.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.numeroOriginePlur; 																											
		}else if(AttributoMovimentoGestione.numeroRiaccertato.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.numeroRiaccertato; 																													
		}else if(AttributoMovimentoGestione.numeroUEBOrigine.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.numeroUEBOrigine; 																															
		}else if(AttributoMovimentoGestione.annoFinanziamento.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.annoFinanziamento; 																																	
		}else if(AttributoMovimentoGestione.cig.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.cig; 
		}else if(AttributoMovimentoGestione.cup.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.cup; 
		}else if(AttributoMovimentoGestione.numeroAccFinanziamento.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.numeroAccFinanziamento; 
		}else if(AttributoMovimentoGestione.validato.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.validato; 
		}else if(AttributoMovimentoGestione.flagPrenotazione.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.flagPrenotazione; 
		}else if(AttributoMovimentoGestione.flagSoggettoDurc.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.flagSoggettoDurc; 
		}else if(AttributoMovimentoGestione.flagCassaEconomale.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.flagCassaEconomale; 
		}else if(AttributoMovimentoGestione.flagSDF.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.flagSDF; 
		}else if(AttributoMovimentoGestione.flagFrazionabile.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.flagFrazionabile; 
		}else if(AttributoMovimentoGestione.flagPrenotazioneLiquidabile.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.flagPrenotazioneLiquidabile; 
		}else if(AttributoMovimentoGestione.annoScritturaEconomicoPatrimoniale.name().equalsIgnoreCase(codeTrimmed)){
			return AttributoMovimentoGestione.annoScritturaEconomicoPatrimoniale; 
		}
		return AttributoMovimentoGestione.NON_RICONOSCIUTO;
	}

	public static final String PERSONA_FISICA = "PF";
	public static final String PERSONA_GIURIDICA = "PG";
	public static final String PERSONA_FISICA_I = "PFI";
	public static final String PERSONA_GIURIDICA_I = "PGI";

	//siac_t_attr:
	public static final String T_ATTR_ANNO_SCRITTURA_ECONOMICO_PATRIMONIALE="annoScritturaEconomicoPatrimoniale";
	public static final String T_ATTR_CODE_NOTE_SOGGETTO="NoteSoggetto";
	public static final String T_ATTR_CODE_FLAG_AVVISO_SOGGETTO="flagAvviso";
	public static final String T_ATTR_CODE_CIG="cig";
	public static final String T_ATTR_CODE_CUP="cup";
	public static final String T_ATTR_CODE_ANNO_CAPITOLO_ORIGINE="annoCapitoloOrigine"; 																	
	public static final String T_ATTR_CODE_ANNO_ORIGINE_PLUR="annoOriginePlur";								
	public static final String T_ATTR_CODE_ANNO_RIACCERTATO="annoRiaccertato"; 
	public static final String T_ATTR_CODE_NUMERO_ARTICOLO_ORIGINE="numeroArticoloOrigine"; 
	public static final String T_ATTR_CODE_FLAG_DA_RIACCERTAMENTO="flagDaRiaccertamento"; 
	public static final String T_ATTR_CODE_FLAG_SOGGETTO_DURC="flagSoggettoDurc"; 
	
	public static final String T_ATTR_CODE_FLAG_FRAZIONABILE="flagFrazionabile"; 
	public static final String T_ATTR_CODE_NUMERO_CAPITOLO_ORIGINE="numeroCapitoloOrigine"; 																									
	public static final String T_ATTR_CODE_NUMERO_ORIGINE_PLUR="numeroOriginePlur"; 																											
	public static final String T_ATTR_CODE_NUMERO_RIACCERTATO="numeroRiaccertato"; 																													
	public static final String T_ATTR_CODE_NUMERO_UEB_ORIGINE="numeroUEBOrigine"; 																															
	public static final String T_ATTR_CODE_ANNO_FINANZIAMENTO="annoFinanziamento"; 																																	
	public static final String T_ATTR_CODE_NUMERO_ACC_FINANZIAMENTO="numeroAccFinanziamento"; 
	public static final String T_ATTR_CODE_FLAG_VALIDATO="validato";
	public static final String T_ATTR_CODE_NOTE_ORDINATIVO="NOTE_ORDINATIVO";
	public static final String T_ATTR_CODE_FLAG_ALLEGATO_CARTACEO="flagAllegatoCartaceo";
	public static final String T_ATTR_CODE_ACC_AUTO="ACC_AUTO";
	public static final String T_ATTR_CODE_MOTIVO_URGENZA="motivo_urgenza"; 																											
	public static final String T_ATTR_CODE_MODALITA_ACCREDITO_BONIFICO="modalita_accredito_bonifico"; 																													
	public static final String T_ATTR_CODE_MODALITA_ACCREDITO_ASSEGNO="modalita_accredito_assegno"; 																															
	public static final String T_ATTR_CODE_MODALITA_ACCREDITO_ALTRO="modalita_accredito_altro"; 																																	
	public static final String T_ATTR_CODE_RECAPITOASSEGNO_CONSEGNA="recapitoassegno_consegna";
	public static final String T_ATTR_CODE_RECAPITOASSEGNO_SPEDIZIONE="recapitoassegno_spedizione";
	public static final String T_ATTR_CODE_NOTE_CC="note";
	public static final String T_ATTR_CODE_MATRICOLA = "Matricola";
	
	public static final String T_ATTR_FIRMA_1_CARTA_CONT="firma1";
	public static final String T_ATTR_FIRMA_2_CARTA_CONT="firma2";
	
	public static final String T_ATTR_CODE_FLAG_PREVISTA_FATTURA="FlagCollegamentoAccertamentoFattura";
	public static final String T_ATTR_CODE_FLAG_PREVISTO_CORRISPETTIVO="FlagCollegamentoAccertamentoCorrispettivo";
	public static final String T_ATTR_CODE_FLAG_ATTIVA_GSA="FlagAttivaGsa";
	
	public static final String T_ATTR_CODE_FLAG_PRENOTAZIONE="flagPrenotazione"; 
	public static final String T_ATTR_CODE_FLAG_CASSA_ECONOMALE="flagCassaEconomale"; 
	public static final String T_ATTR_CODE_FLAG_SDF="flagSDF"; 
	
	public static final String T_ATTR_CODE_FLAG_PRENOTAZIONE_LIQUIDABILE ="flagPrenotazioneLiquidabile"; 
	
		
	public static final Integer ATTRIBUTO_TIPO_TESTO_ID=5;
	
	public static final Integer NAZIONE_ITALIA_CODE = 1;
	
	public static final String SEDE_SECONDARIA = "SEDE_SECONDARIA";
	
	
	//siac_d_indirizzo_tipo:
	public static final String SEDE_OPERATIVA = "SEDE_OPERATIVA";
	public static final String SEDE_LEGALE = "SEDE_LEGALE";
	
	public static final String TRUE = "S";
	public static final String FALSE = "N";
	public static final String STRING_TRUE = "true";
	public static final String STRING_FALSE = "false";
	
	public static final Integer MAX_RIGHE_ESTRAIBILI = 50;
	
	//siac_d_movgest_ts_tipo:
	public static final String MOVGEST_TS_TIPO_TESTATA = "T";
	public static final String MOVGEST_TS_TIPO_SUBIMPEGNO = "S";
	
	//siac_d_movgest_stato:
	public static final String MOVGEST_STATO_PROVVISORIO = "P";
	public static final String MOVGEST_STATO_DEFINITIVO = "D";
	public static final String MOVGEST_STATO_ANNULLATO = "A";
	public static final String MOVGEST_STATO_DEFINITIVO_NON_LIQUIDABILE = "N";
	
	//siac_d_atto_amm_stato:
	public static final String ATTO_AMM_STATO_PROVVISORIO = "PROVVISORIO";
	public static final String ATTO_AMM_STATO_DEFINITIVO = "DEFINITIVO";
	public static final String ATTO_AMM_STATO_ANNULLATO = "ANNULLATO";
	
	//siac_d_movgest_ts_det_tipo:
	public static final String MOVGEST_TS_DET_TIPO_INIZIALE = "I";
	public static final String MOVGEST_TS_DET_TIPO_ATTUALE = "A";
	public static final String MOVGEST_TS_DET_TIPO_UTILIZZABILE = "U";
	
	//siac_d_movgest_tipo:
	public static final String MOVGEST_TIPO_IMPEGNO = "I";
	public static final String MOVGEST_TIPO_ACCERTAMENTO = "A";
	
	//siac_d_bil_stato_op:
	public static final String BIL_STATO_OP_PREDISPOSIZIONE_CONSUNTIVO_ = "CO";
	
	//siac_d_fase_operativa
	public static final String BIL_FASE_OPERATIVA_PREVISIONE = "P";
	public static final String BIL_FASE_OPERATIVA_ESERCIZIO_PROVVISORIO = "E";
	public static final String BIL_FASE_OPERATIVA_GESTIONE = "G";
	public static final String BIL_FASE_OPERATIVA_ASSESTAMENTO = "A";
	public static final String BIL_FASE_OPERATIVA_PREDISPOSIZIONE_CONSUNTIVO = "O";
	public static final String BIL_FASE_OPERATIVA_CHIUSO = "C";	
	
	//siac_d_liquidazione_stato:
	public static final String LIQUIDAZIONE_STATO_PROVVISORIO = "P";
	public static final String LIQUIDAZIONE_STATO_VALIDO = "V";
	public static final String LIQUIDAZIONE_STATO_ANNULLATO = "A";
	
	//siac_d_movgest_tipo:
	public static final String PROVCASSA_TIPO_ENTRATA = "E";
	public static final String PROVCASSA_TIPO_SPESA = "S";
	
		
	// siac_d_bil_elem_tipo
	// "Capitolo entrata gestione"
	public static final String D_BIL_ELEM_TIPO_ELEM_TIPO_CODE_CAP_EG = "CAP-EG";
	// "Articolo entrata gestione"
	public static final String D_BIL_ELEM_TIPO_ELEM_TIPO_CODE_ART_EG = "ART-EG";
	// "Capitolo uscita gestione"
	public static final String D_BIL_ELEM_TIPO_ELEM_TIPO_CODE_CAP_UG = "CAP-UG";
	// "Articolo uscita gestione"
	public static final String D_BIL_ELEM_TIPO_ELEM_TIPO_CODE_ART_UG = "ART-UG";
	// "Capitolo entrata previsione"
	public static final String D_BIL_ELEM_TIPO_ELEM_TIPO_CODE_CAP_EP = "CAP-EP";
	// "Articolo entrata previsione"
	public static final String D_BIL_ELEM_TIPO_ELEM_TIPO_CODE_ART_EP = "ART-EP";
	// "Capitolo uscita previsione"
	public static final String D_BIL_ELEM_TIPO_ELEM_TIPO_CODE_CAP_UP = "CAP-UP";
	// "Articolo uscita previsione"
	public static final String D_BIL_ELEM_TIPO_ELEM_TIPO_CODE_ART_UP = "ART-UP";
	// "Unit??elementare bilancio entrata gestione"
	public static final String D_BIL_ELEM_TIPO_ELEM_TIPO_CODE_UEB_EG = "UEB-EG";
	// "Unit? elementare bilancio entrata previsione"
	public static final String D_BIL_ELEM_TIPO_ELEM_TIPO_CODE_UEB_EP = "UEB-EP";
	// "Unit? elementare bilancio uscita gestione"
	public static final String D_BIL_ELEM_TIPO_ELEM_TIPO_CODE_UEB_UG = "UEB-UG";
	// "Unit? elementare bilancio uscita previsione"
	public static final String D_BIL_ELEM_TIPO_ELEM_TIPO_CODE_UEB_UP = "UEB-UP";
	
	
	//siac_d_programma_stato
	public static final String D_PROGRAMMA_STATO_ANNULLATO = "AN";
	public static final String D_PROGRAMMA_STATO_VALIDO = "VA";
	
	//siac_d_class_tipo
	public static final String D_CLASS_TIPO_TRANSAZIONE_UE_SPESA = "TRANSAZIONE_UE_SPESA";
	public static final String D_CLASS_TIPO_TRANSAZIONE_UE_ENTRATA = "TRANSAZIONE_UE_ENTRATA";
	public static final String D_CLASS_TIPO_PROGRAMMA = "PROGRAMMA";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_STIPENDI = "CLASSIFICATORE_STIPENDI";
	public static final String D_CLASS_TIPO_MISSIONE = "MISSIONE";
	public static final String D_CLASS_TIPO_PROGRAMMA_POLITICHE_REGIONALI_UNITARIE = "POLITICHE_REGIONALI_UNITARIE";
	public static final String D_CLASS_TIPO_GRUPPO_COFOG = "GRUPPO_COFOG";
	public static final String D_CLASS_TIPO_DIVISIONE_COFOG = "DIVISIONE_COFOG";
	public static final String D_CLASS_TIPO_CLASSE_COFOG = "CLASSE_COFOG";
	public static final String D_CLASS_TIPO_CLASSE_RICORRENTE_SPESA = "RICORRENTE_SPESA";
	public static final String D_CLASS_TIPO_CLASSE_PERIMETRO_SANITARIO_SPESA = "PERIMETRO_SANITARIO_SPESA";
	public static final String D_CLASS_TIPO_CLASSE_RICORRENTE_ENTRATA = "RICORRENTE_ENTRATA";
	public static final String D_CLASS_TIPO_CLASSE_PERIMETRO_SANITARIO_ENTRATA = "PERIMETRO_SANITARIO_ENTRATA";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_1 = "CLASSIFICATORE_1";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_2 = "CLASSIFICATORE_2";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_3 = "CLASSIFICATORE_3";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_4 = "CLASSIFICATORE_4";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_5 = "CLASSIFICATORE_5";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_6 = "CLASSIFICATORE_6";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_7 = "CLASSIFICATORE_7";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_8 = "CLASSIFICATORE_8";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_9 = "CLASSIFICATORE_9";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_10 = "CLASSIFICATORE_10";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_11 = "CLASSIFICATORE_11";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_12 = "CLASSIFICATORE_12";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_13 = "CLASSIFICATORE_13";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_14 = "CLASSIFICATORE_14";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_15 = "CLASSIFICATORE_15";
	
	public static final String D_CLASS_TIPO_CLASSIFICATORE_16 = "CLASSIFICATORE_16";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_17 = "CLASSIFICATORE_17";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_18 = "CLASSIFICATORE_18";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_19 = "CLASSIFICATORE_19";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_20 = "CLASSIFICATORE_20";
	
	
	public static final String D_CLASS_TIPO_CLASSIFICATORE_21 = "CLASSIFICATORE_21";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_22 = "CLASSIFICATORE_22";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_23 = "CLASSIFICATORE_23";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_24 = "CLASSIFICATORE_24";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_25 = "CLASSIFICATORE_25";
	
	public static final String D_CLASS_TIPO_CLASSIFICATORE_26 = "CLASSIFICATORE_26";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_27 = "CLASSIFICATORE_27";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_28 = "CLASSIFICATORE_28";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_29 = "CLASSIFICATORE_29";
	public static final String D_CLASS_TIPO_CLASSIFICATORE_30 = "CLASSIFICATORE_30";
	
	
	//PIANO DEI CONTI
	public static final String D_CLASS_TIPO_PIANO_DEI_CONTI_I = "PDC_I";
	public static final String D_CLASS_TIPO_PIANO_DEI_CONTI_II = "PDC_II";
	public static final String D_CLASS_TIPO_PIANO_DEI_CONTI_III = "PDC_III";
	public static final String D_CLASS_TIPO_PIANO_DEI_CONTI_IV = "PDC_IV";
	public static final String D_CLASS_TIPO_PIANO_DEI_CONTI_V = "PDC_V";
	//PIANO DEI CONTI ECONOMICO:
	public static final String D_CLASS_TIPO_PIANO_CONTO_ECONOMICO_I = "PCE_I";
	public static final String D_CLASS_TIPO_PIANO_CONTO_ECONOMICO_II = "PCE_II";
	public static final String D_CLASS_TIPO_PIANO_CONTO_ECONOMICO_III = "PCE_III";
	public static final String D_CLASS_TIPO_PIANO_CONTO_ECONOMICO_IV = "PCE_IV";
	public static final String D_CLASS_TIPO_PIANO_CONTO_ECONOMICO_V = "PCE_V";
	
	
	//STILO SIAC-6929
	public static final String D_CLASS_TIPO_MACROAGGREGATO = "MACROAGGREGATO";
	public static final String D_CLASS_TIPO_TIPOLOGIA = "TIPOLOGIA";
	public static final String D_CLASS_TIPO_TITOLO_SPESA = "TITOLO_SPESA";
	public static final String D_CLASS_TIPO_TITOLO_ENTRATA = "TITOLO_ENTRATA";
	public static final String D_CLASS_TIPO_TIPO_FINANZIAMENTO = "TIPO_FINANZIAMENTO";
	public static final String D_CLASS_TIPO_CATEGORIA = "CATEGORIA";
	
	
	
	
	
	// ORDINATIVO : TIPO_AVVISO
	public static final String D_CLASS_TIPO_TIPO_AVVISO = "TIPO_AVVISO";
	//elenchi:
	public static List<String> getCodiciPianoDeiConti(){
		List<String> codici = new ArrayList<String>();
		codici.add(D_CLASS_TIPO_PIANO_DEI_CONTI_I);
		codici.add(D_CLASS_TIPO_PIANO_DEI_CONTI_II);
		codici.add(D_CLASS_TIPO_PIANO_DEI_CONTI_III);
		codici.add(D_CLASS_TIPO_PIANO_DEI_CONTI_IV);
		codici.add(D_CLASS_TIPO_PIANO_DEI_CONTI_V);
		return codici;
	}
	
	
	public static List<String> getCodiciPianoDeiContiEconomico(){
		List<String> codici = new ArrayList<String>();
		codici.add(D_CLASS_TIPO_PIANO_CONTO_ECONOMICO_I);
		codici.add(D_CLASS_TIPO_PIANO_CONTO_ECONOMICO_II);
		codici.add(D_CLASS_TIPO_PIANO_CONTO_ECONOMICO_III);
		codici.add(D_CLASS_TIPO_PIANO_CONTO_ECONOMICO_IV);
		codici.add(D_CLASS_TIPO_PIANO_CONTO_ECONOMICO_V);
		return codici;
	}

	//SIOPE
	 public static final String D_CLASS_TIPO_SIOPE_ENTRATA = "SIOPE_ENTRATA";
	 public static final String D_CLASS_TIPO_SIOPE_SPESA = "SIOPE_SPESA";
	 public static final String D_CLASS_TIPO_SIOPE_ENTRATA_I = "SIOPE_ENTRATA_I";
	 public static final String D_CLASS_TIPO_SIOPE_ENTRATA_II = "SIOPE_ENTRATA_II";
	 public static final String D_CLASS_TIPO_SIOPE_ENTRATA_III = "SIOPE_ENTRATA_III";
	 public static final String D_CLASS_TIPO_SIOPE_SPESA_I = "SIOPE_SPESA_I";
	 public static final String D_CLASS_TIPO_SIOPE_SPESA_II = "SIOPE_SPESA_II";
	 public static final String D_CLASS_TIPO_SIOPE_SPESA_III = "SIOPE_SPESA_III";
		 
	 public static List<String> getCodiciSiopeEntrata(){
	  List<String> codici = new ArrayList<String>();
	  codici.add(D_CLASS_TIPO_SIOPE_ENTRATA);
	  codici.add(D_CLASS_TIPO_SIOPE_ENTRATA_I);
	  codici.add(D_CLASS_TIPO_SIOPE_ENTRATA_II);
	  codici.add(D_CLASS_TIPO_SIOPE_ENTRATA_III);
	  return codici;
	 }
		 
	 public static List<String> getCodiciSiopeSpesa(){
	  List<String> codici = new ArrayList<String>();
	  codici.add(D_CLASS_TIPO_SIOPE_SPESA);
	  codici.add(D_CLASS_TIPO_SIOPE_SPESA_I);
	  codici.add(D_CLASS_TIPO_SIOPE_SPESA_II);
	  codici.add(D_CLASS_TIPO_SIOPE_SPESA_III);
	  return codici;
	 }
	
	public static final String D_CLASS_TIPO_TIPO_IMPEGNO = "TIPO_IMPEGNO";	
	
	// siac_d_modifica_stato;
	public static final String D_MODIFICA_STATO_VALIDO = "V";
	public static final String D_MODIFICA_STATO_ANNULLATO = "A";	
	
	public static StatoOperativoModificaMovimentoGestione statoOperativoModificaMovimentoGestioneStringToEnum(String code){
		if(Constanti.D_MODIFICA_STATO_VALIDO.equals(code)){
			return StatoOperativoModificaMovimentoGestione.VALIDO;
		} else if(Constanti.D_MODIFICA_STATO_ANNULLATO.equals(code)){
			return StatoOperativoModificaMovimentoGestione.ANNULLATO;
		}
		return StatoOperativoModificaMovimentoGestione.VALIDO;
	}

	// siac_d_modifica_tipo;
	public static final String MODIFICA_TIPO_IMP = "IMP";
	public static final String MODIFICA_TIPO_SIM = "SIM";
	public static final String MODIFICA_TIPO_ACC = "ACC";
	public static final String MODIFICA_TIPO_SAC = "SAC";
	
//	public static TipoModificaMovimentoGestione tipoModificaMovimentoGestioneStringToEnum(String code){
//		if(TipoModificaMovimentoGestione.IMP.name().equals(code)){
//			return TipoModificaMovimentoGestione.IMP;
//		} else if(TipoModificaMovimentoGestione.SIM.name().equals(code)){
//			return TipoModificaMovimentoGestione.SIM;
//		} else if(TipoModificaMovimentoGestione.RIAC.name().equals(code)){
//			return TipoModificaMovimentoGestione.RIAC;
//		} else if(TipoModificaMovimentoGestione.ECON.name().equals(code)){
//			return TipoModificaMovimentoGestione.ECON;
//		} else if(TipoModificaMovimentoGestione.RIU.name().equals(code)){
//			return TipoModificaMovimentoGestione.RIU;
//		}
//		return TipoModificaMovimentoGestione.IMP;
//	}

	/*
	 * MUTUI
	 */
	
	// siac_d_mutuo_stato;
	public static final String D_MUTUO_STATO_DEFINITIVO = "D";
	public static final String D_MUTUO_STATO_ANNULLATO = "A";
	public static final String D_MUTUO_STATO_PROVVISORIO = "P";
	public static final String D_MUTUO_STATO_ESTINTO = "E";
	
	public static StatoOperativoMutuo statoOperativoMutuoStringToEnum(String code){
		if(Constanti.D_MUTUO_STATO_DEFINITIVO.equals(code)){
			return StatoOperativoMutuo.DEFINITIVO;
		} else if(Constanti.D_MUTUO_STATO_ANNULLATO.equals(code)){
			return StatoOperativoMutuo.ANNULLATO;
		} else if(Constanti.D_MUTUO_STATO_PROVVISORIO.equals(code)){
			return StatoOperativoMutuo.PROVVISORIO;
		} else if(Constanti.D_MUTUO_STATO_ESTINTO.equals(code)){
			return StatoOperativoMutuo.ESTINTO;
		}
		return StatoOperativoMutuo.PROVVISORIO;
	}	
	
	public static String statoOperativoMutuoEnumToString(StatoOperativoMutuo stato) {
		String codifica = null;
		if (stato != null) {
			if (StatoOperativoMutuo.PROVVISORIO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_MUTUO_STATO_PROVVISORIO;
			} else if (StatoOperativoMutuo.DEFINITIVO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_MUTUO_STATO_DEFINITIVO;
			} else if (StatoOperativoMutuo.ESTINTO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_MUTUO_STATO_ESTINTO;
			} else if (StatoOperativoMutuo.ANNULLATO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_MUTUO_STATO_ANNULLATO;
			} 
		}
		return codifica;
	}

	// siac_d_mutuo_tipo;
	public static final String D_MUTUO_TIPO_RISCOSSIONE_COMPLETA = "RIS";
	public static final String D_MUTUO_TIPO_AVANZAMENTO_LAVORI = "AVL";
	public static final String D_MUTUO_TIPO_BOC = "BOC";
	public static final String D_MUTUO_TIPO_FIDEIUSSIONE = "FID";
	public static final String D_MUTUO_TIPO_GARANZIE = "GAR";
	public static final String D_MUTUO_TIPO_PRESTITO_FLESSIBILE = "PRE";

	public static TipoMutuo tipoMutuoStringToEnum(String code){
		if(Constanti.D_MUTUO_TIPO_RISCOSSIONE_COMPLETA.equals(code)){
			return TipoMutuo.RIS;
		} else if(Constanti.D_MUTUO_TIPO_AVANZAMENTO_LAVORI.equals(code)){
			return TipoMutuo.AVL;
		} else if(Constanti.D_MUTUO_TIPO_BOC.equals(code)){
			return TipoMutuo.BOC;
		} else if(Constanti.D_MUTUO_TIPO_FIDEIUSSIONE.equals(code)){
			return TipoMutuo.FID;
		} else if(Constanti.D_MUTUO_TIPO_GARANZIE.equals(code)){
			return TipoMutuo.GAR;
		} else if(Constanti.D_MUTUO_TIPO_PRESTITO_FLESSIBILE.equals(code)){
			return TipoMutuo.PRE;
		}
		return TipoMutuo.RIS;
	}	

	// siac_d_mutuo_var_tipo
	public static final String D_MUTUO_VAR_TIPO_ECONOMIA = "ECO";
	public static final String D_MUTUO_VAR_TIPO_RIDUZIONE = "RID";
	public static final String D_MUTUO_VAR_TIPO_STORNO = "STO";
	public static final String D_MUTUO_VAR_TIPO_A_RESIDUO = "RES";
	public static final String D_MUTUO_VAR_TIPO_RETTIFICA = "RET";
	
	public static TipoVariazioneImportoVoceMutuo tipoVariazioneImportoVoceMutuoStringToEnum(String code){
		if(Constanti.D_MUTUO_VAR_TIPO_ECONOMIA.equals(code)){
			return TipoVariazioneImportoVoceMutuo.ECONOMIA;
		} else if(Constanti.D_MUTUO_VAR_TIPO_RIDUZIONE.equals(code)){
			return TipoVariazioneImportoVoceMutuo.RIDUZIONE;
		}  else if(Constanti.D_MUTUO_VAR_TIPO_STORNO.equals(code)){
			return TipoVariazioneImportoVoceMutuo.STORNO;
		} else if(Constanti.D_MUTUO_VAR_TIPO_A_RESIDUO.equals(code)){
			return TipoVariazioneImportoVoceMutuo.A_RESIDUO;
		} else if(Constanti.D_MUTUO_VAR_TIPO_RETTIFICA.equals(code)){
			return TipoVariazioneImportoVoceMutuo.RETTIFICA;
		}
		return TipoVariazioneImportoVoceMutuo.ECONOMIA;
	}
	
	public static String tipoVariazioneImportoVoceMutuoEnumToString(TipoVariazioneImportoVoceMutuo tipoVariazioneImportoVoceMutuo){
		if(tipoVariazioneImportoVoceMutuo.name().equalsIgnoreCase(TipoVariazioneImportoVoceMutuo.STORNO.name())){
			return D_MUTUO_VAR_TIPO_STORNO;
		} else if(tipoVariazioneImportoVoceMutuo.name().equalsIgnoreCase(TipoVariazioneImportoVoceMutuo.ECONOMIA.name())){
			return D_MUTUO_VAR_TIPO_ECONOMIA;
		} else if(tipoVariazioneImportoVoceMutuo.name().equalsIgnoreCase(TipoVariazioneImportoVoceMutuo.RIDUZIONE.name())){
			return D_MUTUO_VAR_TIPO_RIDUZIONE;
		} else if(tipoVariazioneImportoVoceMutuo.name().equalsIgnoreCase(TipoVariazioneImportoVoceMutuo.A_RESIDUO.name())){
			return D_MUTUO_VAR_TIPO_A_RESIDUO;
		} else if(tipoVariazioneImportoVoceMutuo.name().equalsIgnoreCase(TipoVariazioneImportoVoceMutuo.RETTIFICA.name())){
			return D_MUTUO_VAR_TIPO_RETTIFICA;
		}
		return D_MUTUO_VAR_TIPO_STORNO;
	}

	// siac_d_mutuo_voce_tipo
	public static final String D_MUTUO_VOCE_TIPO_ORIGINALE = "01";
	public static final String D_MUTUO_VOCE_TIPO_STORNO = "02";
	public static final String D_MUTUO_VOCE_TIPO_DA_RESIDUO = "03";
	
	public static OrigineVoceMutuo origineVoceMutuoStringToEnum(String code){
		if(Constanti.D_MUTUO_VOCE_TIPO_ORIGINALE.equals(code)){
			return OrigineVoceMutuo.ORIGINALE;
		} else if(Constanti.D_MUTUO_VOCE_TIPO_STORNO.equals(code)){
			return OrigineVoceMutuo.STORNO;
		}  else if(Constanti.D_MUTUO_VOCE_TIPO_DA_RESIDUO.equals(code)){
			return OrigineVoceMutuo.DA_RESIDUO;
		}
		return OrigineVoceMutuo.ORIGINALE;
	}
	
	public static String origineVoceMutuoEnumToString(OrigineVoceMutuo enumOrigineVoceMutuo){
		if(enumOrigineVoceMutuo.name().equalsIgnoreCase(OrigineVoceMutuo.ORIGINALE.name())){
			return D_MUTUO_VOCE_TIPO_ORIGINALE;
		} else if(enumOrigineVoceMutuo.name().equalsIgnoreCase(OrigineVoceMutuo.STORNO.name())){
			return D_MUTUO_VOCE_TIPO_STORNO;
		} else if(enumOrigineVoceMutuo.name().equalsIgnoreCase(OrigineVoceMutuo.DA_RESIDUO.name())){
			return D_MUTUO_VOCE_TIPO_DA_RESIDUO;
		}
		return D_MUTUO_VOCE_TIPO_ORIGINALE;
	}
	
	/*
	 * LIQUIDAZIONI	
	 */
	
	
	public static final String LIQUIDAZIONE_MAUALE_CODE = "M";
	public static final String LIQUIDAZIONE_AUTOMATICA_CODE = "A";
	public static final String LIQUIDAZIONE_MAUALE = "manuale";
	public static final String LIQUIDAZIONE_AUTOMATICA = "automatico";
	
	public static final String LIQUIDAZIONE_LIQ_AUTOMATICA_SI = "S";
	public static final String LIQUIDAZIONE_LIQ_AUTOMATICA_NO = "N";
	public static final String TIPO_RICERCA_DA_ORDINATIVO = "TIPO_RICERCA_DA_ORDINATIVO";
	public static final String TIPO_RICERCA_DA_LIQUIDAZIONE = "TIPO_RICERCA_DA_LIQUIDAZIONE";
	public static final String TIPO_RICERCA_DA_CONSULTA_LIQUIDAZIONE = "TIPO_RICERCA_DA_CONSULTA_LIQUIDAZIONE";
	public static final String TIPO_RICERCA_DA_EMISSIONE_ORDINATIVO = "TIPO_RICERCA_DA_EMISSIONE_ORDINATIVO";
	
	// siac_d_LIQUIDAZIONE_stato;
	public static final String D_LIQUIDAZIONE_STATO_VALIDO = "V";
	public static final String D_LIQUIDAZIONE_STATO_ANNULLATO = "A";
	public static final String D_LIQUIDAZIONE_STATO_PROVVISORIO = "P";
	
	public static StatoOperativoLiquidazione statoOperativoLiquidazioneStringToEnum(String code){
		if(Constanti.D_LIQUIDAZIONE_STATO_VALIDO.equals(code)){
			return StatoOperativoLiquidazione.VALIDO;
		} else if(Constanti.D_LIQUIDAZIONE_STATO_ANNULLATO.equals(code)){
			return StatoOperativoLiquidazione.ANNULLATO;
		} else if(Constanti.D_LIQUIDAZIONE_STATO_PROVVISORIO.equals(code)){
			return StatoOperativoLiquidazione.PROVVISORIO;
		}
		return StatoOperativoLiquidazione.PROVVISORIO;
	}	
	
	public static String statoOperativoLiquidazioneEnumToString(StatoOperativoLiquidazione stato) {
		String codifica = null;
		if (stato != null) {
			if (StatoOperativoLiquidazione.PROVVISORIO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_LIQUIDAZIONE_STATO_PROVVISORIO;
			} else if (StatoOperativoLiquidazione.VALIDO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_LIQUIDAZIONE_STATO_VALIDO;
			} else if (StatoOperativoLiquidazione.ANNULLATO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_LIQUIDAZIONE_STATO_ANNULLATO;
			} 
		}
		return codifica;
	}

	// ORDINATIVI	
	

    // siac_d_ordinativo_stato;
	public static final String D_ORDINATIVO_STATO_INSERITO = "I";
	public static final String D_ORDINATIVO_STATO_TRASMESSO = "T";
	public static final String D_ORDINATIVO_STATO_FIRMATO = "F";
	public static final String D_ORDINATIVO_STATO_QUIETANZATO = "Q";
	public static final String D_ORDINATIVO_STATO_ANNULLATO = "A";
		
	public static StatoOperativoOrdinativo statoOperativoOrdinativoStringToEnum(String code){
			
		if(Constanti.D_ORDINATIVO_STATO_INSERITO.equals(code)){
			return StatoOperativoOrdinativo.INSERITO;
		} else if(Constanti.D_ORDINATIVO_STATO_TRASMESSO.equals(code)){
			return StatoOperativoOrdinativo.TRASMESSO;
		} else if(Constanti.D_ORDINATIVO_STATO_FIRMATO.equals(code)){
			return StatoOperativoOrdinativo.FIRMATO;
		} else if(Constanti.D_ORDINATIVO_STATO_QUIETANZATO.equals(code)){
			return StatoOperativoOrdinativo.QUIETANZATO;
		}else if(Constanti.D_ORDINATIVO_STATO_ANNULLATO.equals(code)){
			return StatoOperativoOrdinativo.ANNULLATO;
		}
		return null;
	}	
		
	public static String statoOperativoOrdinativoEnumToString(StatoOperativoOrdinativo stato) {
		String codifica = null;
		if (stato != null) {
			if (StatoOperativoOrdinativo.INSERITO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_ORDINATIVO_STATO_INSERITO;
			} else if (StatoOperativoOrdinativo.TRASMESSO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_ORDINATIVO_STATO_TRASMESSO;
			} else if (StatoOperativoOrdinativo.FIRMATO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_ORDINATIVO_STATO_FIRMATO;
			} else if (StatoOperativoOrdinativo.QUIETANZATO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_ORDINATIVO_STATO_QUIETANZATO;
			} else if (StatoOperativoOrdinativo.ANNULLATO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_ORDINATIVO_STATO_ANNULLATO;
			} 
		}
		return codifica;
	}
	
	public static final String ORDINATIVO_TIPO_PAGAMENTO = "OP";
	public static final String ORDINATIVO_TIPO_INCASSO = "OI";

	
	// siac_d_ordinativo_tipo	
	public static final String D_ORDINATIVO_TIPO_PAGAMENTO = "P";
	public static final String D_ORDINATIVO_TIPO_INCASSO = "I";

	// siac_d_distinta_tipo	
	public static final String D_ORDINATIVO_DISTINTA_TIPO_SPESA = "S";
	public static final String D_ORDINATIVO_DISTINTA_TIPO_ENTRATA = "E";
	public static final String D_DISTINTA_TIPO_SPESA = "S";
	
	
	// siac_d_commissione_tipo
	public static final String D_ORDINATIVO_COMMISSIONE_TIPO_BENEFICIARIO = "BN";
	public static final String D_ORDINATIVO_COMMISSIONE_TIPO_ESENTE = "ES";
	public static final String D_ORDINATIVO_COMMISSIONE_TIPO_CARICO_ENTE = "CE";
	
	// siac_d_relaz_tipo
	public static final String D_ORDINATIVO_SUBORDINATO = "SUB_ORD";
	public static final String D_ORDINATIVO_SUBORDINATO_RITENUTE = "RIT_ORD";
	public static final String D_SOSTITUZIONE_ORDINATIVO = "SOS_ORD";
	public static final String D_ORDINATIVO_SPLIT_REVERSE = "SPR";
	public static final String D_ORDINATIVO_REINTROITI = "REI_ORD";
	
	//class
	public static final String CLASS_RITENUTE_STIPENDI = "RT-STI";
	public static final String CLASS_STIPENDI = "STI";
	
	
	public static TipoAssociazioneEmissione tipoAssociazioneEmissioneStringToEnum(String code){
		
		if(Constanti.D_ORDINATIVO_SUBORDINATO.equals(code)){
			return TipoAssociazioneEmissione.SUB_ORD;
		} else if(Constanti.D_ORDINATIVO_SUBORDINATO_RITENUTE.equals(code)){
			return TipoAssociazioneEmissione.RIT_ORD;
		} else if(Constanti.D_SOSTITUZIONE_ORDINATIVO.equals(code)){
			return TipoAssociazioneEmissione.SOS_ORD;
		} else if(Constanti.D_ORDINATIVO_SPLIT_REVERSE.equals(code)){
			return TipoAssociazioneEmissione.SPR;
		} else if(Constanti.D_ORDINATIVO_REINTROITI.equals(code)){
			return TipoAssociazioneEmissione.REI_ORD;
		}
		
		return null;
	}	
		
	public static String tipoAssociazioneEmissioneEnumToString(TipoAssociazioneEmissione tipo) {
		String codifica = null;
		if (tipo != null) {
			if (TipoAssociazioneEmissione.SUB_ORD.name().equalsIgnoreCase(tipo.name())) {
				codifica = Constanti.D_ORDINATIVO_SUBORDINATO;
			} else if (TipoAssociazioneEmissione.RIT_ORD.name().equalsIgnoreCase(tipo.name())) {
				codifica = Constanti.D_ORDINATIVO_SUBORDINATO_RITENUTE;
			} else if (TipoAssociazioneEmissione.SOS_ORD.name().equalsIgnoreCase(tipo.name())) {
				codifica = Constanti.D_SOSTITUZIONE_ORDINATIVO;
			} 
		}
		return codifica;
	}

//	public static CommissioneDocumento commissioneDocumentoOrdinativoStringToEnum(String code){
//		if(Constanti.D_ORDINATIVO_COMMISSIONE_TIPO_BENEFICIARIO.equals(code)){
//			return CommissioneDocumento.BN;
//		} else if(Constanti.D_ORDINATIVO_COMMISSIONE_TIPO_ESENTE.equals(code)){
//			return CommissioneDocumento.ES;
//		}  else if(Constanti.D_ORDINATIVO_COMMISSIONE_TIPO_CARICO_ENTE.equals(code)){
//			return CommissioneDocumento.CE;
//		}
//		return null;
//	}
//	
//	public static String commissioneDocumentoOrdinativoEnumToString(CommissioneDocumento commissioneDocumento){
//		if(commissioneDocumento.name().equalsIgnoreCase(CommissioneDocumento.BN.name())){
//			return D_ORDINATIVO_COMMISSIONE_TIPO_BENEFICIARIO;
//		} else if(commissioneDocumento.name().equalsIgnoreCase(CommissioneDocumento.ES.name())){
//			return D_ORDINATIVO_COMMISSIONE_TIPO_ESENTE;
//		} else if(commissioneDocumento.name().equalsIgnoreCase(CommissioneDocumento.CE.name())){
//			return D_ORDINATIVO_COMMISSIONE_TIPO_CARICO_ENTE;
//		}
//		return null;
//	}
	
	// campi metadatati per ordinativo : siac_t_attr
	public static final String ORDINATIVO_T_ATTR_FLAG_ALLEGATO_CARTACEO = "flagAllegatoCartaceo";
	public static final String ORDINATIVO_T_ATTR_NOTE = "NOTE_ORDINATIVO";
	
	// siac_d_ordinativo_ts_det_tipo
	public static final String D_ORDINATIVO_TS_DET_TIPO_IMPORTO_INIZIALE = "I";
	public static final String D_ORDINATIVO_TS_DET_TIPO_IMPORTO_ATTUALE = "A";
	
	// PROVVISORI DI CASSA
	
    // siac_d_prov_cassa_tipo;
	public static final String D_PROV_CASSA_TIPO_SPESA = "S";
	public static final String D_PROV_CASSA_TIPO_ENTRATA = "E";
		
	public static TipoProvvisorioDiCassa tipoProvvisorioDiCassaStringToEnum(String code){
		if(Constanti.D_PROV_CASSA_TIPO_SPESA.equals(code)){
			return TipoProvvisorioDiCassa.S;
		} else if(Constanti.D_PROV_CASSA_TIPO_ENTRATA.equals(code)){
			return TipoProvvisorioDiCassa.E;
		} 
		return null;
	}	
		
	public static String tipoProvvisorioDiCassaEnumToString(TipoProvvisorioDiCassa tipoProvvisorioDiCassa) {
		String codifica = null;
		if (tipoProvvisorioDiCassa != null) {
			if (TipoProvvisorioDiCassa.S.name().equalsIgnoreCase(tipoProvvisorioDiCassa.name())) {
				codifica = Constanti.D_PROV_CASSA_TIPO_SPESA;
			} else if (TipoProvvisorioDiCassa.E.name().equalsIgnoreCase(tipoProvvisorioDiCassa.name())) {
				codifica = Constanti.D_PROV_CASSA_TIPO_ENTRATA;
			} 
		}
		return codifica;
	}
	
	//TIPI ATTR:
	public static final String TIPO_ATTR_TESTO = "testo";
	public static final String TIPO_ATTR_NUMERICO = "numerico";
	public static final String TIPO_ATTR_BOOLEAN = "boolean";
	public static final String TIPO_ATTR_PERCENTUALE = "percentuale";
	public static final String TIPO_ATTR_TABELLA = "tabella";
	
	
	//costanti relative a siac_d_accredito_tipo
	public static final String D_ACCREDITO_TIPO_CIRCUITO_BANCARIO = "Circuito bancario";
	public static final String D_ACCREDITO_TIPO_CIRCUITO_BANCA_ITALIA = "Circuito Banca d'Italia";
	public static final String D_ACCREDITO_TIPO_CIRCUITO_POSTALE = "Circuito postale";
	public static final String D_ACCREDITO_TIPO_CONTANTI = "Contanti";
	public static final String D_ACCREDITO_TIPO_CESSIONE_CREDITO = "Cessione del credito";
	public static final String D_ACCREDITO_TIPO_CESSIONE_INCASSO = "Cessione dell'incasso";
	public static final String D_ACCREDITO_TIPO_ASSEGNO_BANCARIO = "Assegno bancario";
	public static final String D_ACCREDITO_TIPO_ASSEGNO_FALLIMENTO= "Fallimento";
	
	public static final String D_ACCREDITO_TIPO_CODE_CONTO_CORRENTE_POSTALE = "CP";
	public static final String D_ACCREDITO_TIPO_CODE_QUIETANZA_DIRETTA = "CT";
	public static final String D_ACCREDITO_TIPO_CODE_Circuito_Postale = "CCP";
	public static final String D_ACCREDITO_TIPO_CODE_Cessione_dell_incasso = "CSI";
	public static final String D_ACCREDITO_TIPO_CODE_RID = "RI";
	public static final String D_ACCREDITO_TIPO_CODE_GIRO_FONDI = "GF";
	//public static final String D_ACCREDITO_TIPO_CODE_Pignoramento = "PI";
	public static final String D_ACCREDITO_TIPO_CODE_Cessione_del_credito = "CSC";
	public static final String D_ACCREDITO_TIPO_CODE_ASSEGNO_CIRCOLARE = "AS";
	public static final String D_ACCREDITO_TIPO_CODE_Circuito_Banca_d_Italia = "CBI";
	public static final String D_ACCREDITO_TIPO_CODE_MANDATO_A_COPERTURA_MODELLO_F24_F24EP = "F2";
	public static final String D_ACCREDITO_TIPO_CODE_Circuito_bancario = "CB";
	public static final String D_ACCREDITO_TIPO_CODE_BONIFICO_POSTALE = "BP";
//	public static final String D_ACCREDITO_TIPO_CODE_ASSEGNO_CIRCOLARE = "AC";
	public static final String D_ACCREDITO_TIPO_CODE_Contanti = "CO";
	public static final String D_ACCREDITO_TIPO_CODE_Generico = "GE";
	public static final String D_ACCREDITO_TIPO_CODE_ASSEGNO_DI_TRAENZA = "AB";
	public static final String D_ACCREDITO_TIPO_CODE_Fallimento = "FA";
	public static final String D_ACCREDITO_TIPO_CODE_A_COPERTURA_MODELLO_F24_TERRITORIALE = "F3";
	public static final String D_ACCREDITO_TIPO_CODE_BENEFICIARIO_AMMINISTRATIVO = "CC";
	public static final String D_ACCREDITO_TIPO_CODE_MODELLO_F23 = "FI";
	public static final String D_ACCREDITO_TIPO_CODE_PIGNORAMENTO = "PI";
	public static final String D_ACCREDITO_TIPO_CODE_CESSIONE_PRESSO_TERZI = "CPT";
	public static final String D_ACCREDITO_TIPO_CODE_CESSIONE_INCASSO_GENERICA = "CSIG";
	public static final String D_ACCREDITO_TIPO_CODE_SUCCESSIONE = "SU";
	
	public static final String ATTO_AMMINISTRATIVO_PROVENIENZA_MANUALE = "MANUALE";
	
	
	public static ModalitaAccreditoSoggetto componiModalitaAccreditoDalTipo(TipoAccredito accr){
		ModalitaAccreditoSoggetto modAccrSogg = new ModalitaAccreditoSoggetto();
		modAccrSogg.setCodice(accr.toString());
		
		switch (accr) {
		case CB:
			modAccrSogg.setDescrizione(D_ACCREDITO_TIPO_CIRCUITO_BANCARIO);
			break;

		case CBI:
			modAccrSogg.setDescrizione(D_ACCREDITO_TIPO_CIRCUITO_BANCA_ITALIA);
			break;
		case CCP:
			modAccrSogg.setDescrizione(D_ACCREDITO_TIPO_CIRCUITO_POSTALE);
			break;
		case CO:
			modAccrSogg.setDescrizione(D_ACCREDITO_TIPO_CONTANTI);
			break;
		case CSC:
			modAccrSogg.setDescrizione(D_ACCREDITO_TIPO_CESSIONE_CREDITO);
			break;
		case CSI:
			modAccrSogg.setDescrizione(D_ACCREDITO_TIPO_CESSIONE_INCASSO);
			break;
		case ASS:
			modAccrSogg.setDescrizione(D_ACCREDITO_TIPO_ASSEGNO_BANCARIO);
			break;		
		case FA:
			modAccrSogg.setDescrizione(D_ACCREDITO_TIPO_ASSEGNO_FALLIMENTO);
			break;	
		case PI:
			modAccrSogg.setDescrizione(D_ACCREDITO_TIPO_CODE_PIGNORAMENTO);
			break;		
		case CPT:
			modAccrSogg.setDescrizione(D_ACCREDITO_TIPO_CODE_CESSIONE_PRESSO_TERZI);
			break;		
		case CSIG:
			modAccrSogg.setDescrizione(D_ACCREDITO_TIPO_CODE_CESSIONE_PRESSO_TERZI);
			break;		
		case SU:
			modAccrSogg.setDescrizione(D_ACCREDITO_TIPO_CODE_SUCCESSIONE);
			break;		
		default:
			throw new IllegalStateException("Impossibile ricavare ModalitaAccreditoSoggetto da TipoAccredito = " + accr);
		}
		return modAccrSogg;
	}
	
	public static TipoAccredito codeToTipoAccredito(String idTipoAccredito){
		TipoAccredito ta = null;
		if("COORDINATE BANCARIE".equalsIgnoreCase(idTipoAccredito)){
			ta = TipoAccredito.CB;
		} else if(D_ACCREDITO_TIPO_CODE_Contanti.equalsIgnoreCase(idTipoAccredito)){
			ta = TipoAccredito.CO;
		} else if(D_ACCREDITO_TIPO_CODE_Fallimento.equalsIgnoreCase(idTipoAccredito)){
			ta = TipoAccredito.FA;
//		} else if(idTipoAccredito.equalsIgnoreCase(-)){
//			ta = TipoAccredito.CO;
//		} else if(idTipoAccredito.equalsIgnoreCase(-)){
//			ta = TipoAccredito.CO;
		} else if(D_ACCREDITO_TIPO_CODE_Generico.equalsIgnoreCase(idTipoAccredito)){
			ta = TipoAccredito.GE;
		} else if(D_ACCREDITO_TIPO_CODE_Circuito_Banca_d_Italia.equalsIgnoreCase(idTipoAccredito)){
			ta = TipoAccredito.CBI;
		} else if(D_ACCREDITO_TIPO_CODE_Circuito_Postale.equalsIgnoreCase(idTipoAccredito)){
			ta = TipoAccredito.CCP;
		} else if(D_ACCREDITO_TIPO_CODE_Cessione_del_credito.equalsIgnoreCase(idTipoAccredito)){
			ta = TipoAccredito.CSC;
		} else if(D_ACCREDITO_TIPO_CODE_Cessione_dell_incasso.equalsIgnoreCase(idTipoAccredito)){
			ta = TipoAccredito.CSI;
		} else if(D_ACCREDITO_TIPO_CODE_Circuito_bancario.equalsIgnoreCase(idTipoAccredito)){
			ta = TipoAccredito.CB;
		} else if("CONTANTI".equalsIgnoreCase(idTipoAccredito)){
			ta = TipoAccredito.CO;
		} else if("ASSEGNO BANCARIO".equalsIgnoreCase(idTipoAccredito)){
			ta = TipoAccredito.CB;
		} else if("ASSEGNO CIRCOLARE".equals(idTipoAccredito)){
			ta = TipoAccredito.CB;
		} else if("FALLIMENTO".equalsIgnoreCase(idTipoAccredito)){
			ta = TipoAccredito.FA;
		}
		return ta;
	}
	
	/*
	 * CARTE CONTABILI
	 *  
	 */

	// TIPO DOCUMENTO
	// siac_d_doc_tipo
	public static final String D_DOC_TIPO_CARTA_CONTABILE_CODE = "CCN";
	public static final String D_DOC_TIPO_CARTA_CONTABILE_FAMIGLIA_SPESA = "S";
	public static final String D_DOC_TIPO_CARTA_CONTABILE_FAMIGLIA_ENTRATA = "E";

	// CODICE_BOLLO
	// siac_d_codice_bollo
	public static final String D_CODICE_BOLLO_ESENTE_DA_BOLLO_CODE = "99";
	
	// STATO OPERATIVO DOCUMENTO
	// siac_d_doc_stato
	public static final String D_DOC_STATO_INCOMPLETO = "I";
	public static final String D_DOC_STATO_VALIDO = "V";
	public static final String D_DOC_STATO_LIQUIDATO = "L";
	public static final String D_DOC_STATO_PARZIALMENTE_LIQUIDATO = "PL";
	public static final String D_DOC_STATO_PARZIALMENTE_EMESSO = "PE";
	public static final String D_DOC_STATO_EMESSO = "EM";
	public static final String D_DOC_STATO_ANNULLATO = "A";
	public static final String D_DOC_STATO_STORNATO = "ST";
	
	// COMMISSIONE DOCUMENTO
	// siac_d_commissione_tipo
	public static final String D_DOC_COMMISSIONE_TIPO_BENEFICIARIO = "BN";
	public static final String D_DOC_COMMISSIONE_TIPO_ESENTE = "ES";
	public static final String D_DOC_COMMISSIONE_TIPO_CARICO_ENTE = "CE";

	// STATO OPERATIVO CARTA CONTABILE
	// siac_d_cartacont_stato
	public static final String D_CARTA_CONTABILE_STATO_PROVVISORIO = "P";
	public static final String D_CARTA_CONTABILE_STATO_ANNULLATO = "A";
	public static final String D_CARTA_CONTABILE_STATO_COMPLETATO = "C";
	public static final String D_CARTA_CONTABILE_STATO_TRASMESSO = "T";
	
	// attributo programma rilevanteFPV
	public static final String PROGRAMMA_T_ATTR_RILEVANTE_FPV = "FlagRilevanteFPV";
	//valore complessivo:
	public static final String PROGRAMMA_T_ATTR_VALORE_COMPLESSIVO = "ValoreComplessivoProgramma";
	
	public static final int CODICE_AVVISO_PAGO_PA_LENGTH = 18;
	
	public static StatoOperativoCartaContabile statoOperativoCartaContabileStringToEnum(String code){
		if(Constanti.D_CARTA_CONTABILE_STATO_PROVVISORIO.equals(code)){
			return StatoOperativoCartaContabile.PROVVISORIO;
		} else if(Constanti.D_CARTA_CONTABILE_STATO_ANNULLATO.equals(code)){
			return StatoOperativoCartaContabile.ANNULLATO;
		} else if(Constanti.D_CARTA_CONTABILE_STATO_COMPLETATO.equals(code)){
			return StatoOperativoCartaContabile.COMPLETATO;
		} else if(Constanti.D_CARTA_CONTABILE_STATO_TRASMESSO.equals(code)){
			return StatoOperativoCartaContabile.TRASMESSO;
		}
		return StatoOperativoCartaContabile.PROVVISORIO;
	}	
	
	public static String statoOperativoCartaContabileEnumToString(StatoOperativoCartaContabile stato) {
		String codifica = null;
		if (stato != null) {
			if (StatoOperativoCartaContabile.PROVVISORIO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_CARTA_CONTABILE_STATO_PROVVISORIO;
			} else if (StatoOperativoCartaContabile.TRASMESSO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_CARTA_CONTABILE_STATO_TRASMESSO;
			} else if (StatoOperativoCartaContabile.COMPLETATO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_CARTA_CONTABILE_STATO_COMPLETATO;
			} else if (StatoOperativoCartaContabile.ANNULLATO.name().equalsIgnoreCase(stato.name())) {
				codifica = Constanti.D_CARTA_CONTABILE_STATO_ANNULLATO;
			} 
		}
		return codifica;
	}
	
	//STILO SIAC-6929
	public static final String STILO_MOVGEST_TIPO_IMPEGNO = "Impegno";
	public static final String STILO_MOVGEST_TIPO_ACCERTAMENTO = "Accertamento";
	public static final String STILO_MOVGEST_TIPO_SUB_IMPEGNO = "Sub Impegno";
	public static final String STILO_MOVGEST_TIPO_SUB_ACCERTAMENTO = "Sub Accertamento";
	public static final String STILO_MOVGEST_TIPO_MODIFICA_IMPEGNO = "Modifica Impegno";
	public static final String STILO_MOVGEST_TIPO_MODIFICA_ACCERTAMENTO = "Modifica Accertamento";
	public static final String STILO_MOVGEST_TIPO_MODIFICA_SUB_IMPEGNO = "Modifica Sub Impegno";
	public static final String STILO_MOVGEST_TIPO_MODIFICA_SUB_ACCERTAMENTO = "Modifica Sub Accertamento";
	
	//SIAC 6884
	public static final String AGG_VAR_FROM_CHIUDI_PROPOSTA = "CHIUDI_PROPOSTA";

}