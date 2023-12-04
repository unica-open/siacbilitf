/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacfinser.cig.utility;

import org.apache.commons.lang3.StringUtils;

/**
 * SIAC-8208
 * 
 * <p>Classe di utilita' per il controllo e la gestione del CIG.</p>
 * 
 * <pre>
 * Il dato del CIG avere una lunghezza di 10 caratteri, può contenere solo numeri o lettere dell'alfabeto latino 
 * e deve rispettare uno dei i seguenti formati:
 * 
 * CIG: 7 caratteri numerici seguiti da 3 caratteri numerici e/o alfabetici maiuscoli (valori da A ad F);
 * Smart CIG: 1 carattere alfabetico maiuscolo (valori da V a Z) seguito da 9 caratteri numerici e/o alfabetici maiuscoli (valori da A ad F);
 * CIG Unico: 1 carattere alfabetico maiuscolo (valori da A a U) seguito da 9 caratteri numerici e/o alfabetici maiuscoli (valori da A ad F). 
 * </pre>
 * 
 * @author todescoa
 *
 */
public class CigUtil {
	
	/** regex per il controllo del CIG */
	private final static String CIG = "[0-9]{7}[0-9ABCDEF]{3}";
	/** regex per il controllo dello SMART CIG */
	private final static String SMART_CIG = "[V-Z]{1}[0-9ABCDEF]{9}";
	/** regex per il controllo del CIG UNICO */
	private final static String CIG_UNICO = "[A-U]{1}[0-9ABCDEF]{9}";

	/**
	 * <p>Controllo per il CIG.</p>
	 * 
	 * <pre>
	 * CigUtil.controlloCIG("0123456ABC")	= true
	 * CigUtil.controlloCIG("0123456A1F")	= true
	 * CigUtil.controlloCIG("ABC0123456")	= false
	 * CigUtil.controlloCIG("0ABC123456")	= false
	 * CigUtil.controlloCIG("0abc12jK56")	= false
	 * </pre>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 */
	private static boolean controlloCIG(String cig) {
		return cig.matches(CIG);
	}

	/**
	 * <p>Controllo per lo Smart CIG.</p>
	 * 
	 * <pre>
	 * CigUtil.controlloSmartCIG("Z01AB34CD5")	= true
	 * CigUtil.controlloSmartCIG("01234567V")	= false
	 * CigUtil.controlloSmartCIG("Z0234uhkL")	= false
	 * </pre>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 */
	private static boolean controlloSmartCIG(String cig) {
		return cig.matches(SMART_CIG);
	}

	/**
	 * <p>Controllo per il CIG Unico.</p>
	 * 
	 * <pre>
	 * CigUtil.controlloCIGUnico("UBC0123456")	= true
	 * CigUtil.controlloCIGUnico("a234bklop")	= false
	 * CigUtil.controlloCIGUnico("0ABC123456")	= false
	 * </pre>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 */
	private static boolean controlloCIGUnico(String cig) {
		return cig.matches(CIG_UNICO);
	}
	
	/**
	 * <p>Controllo per il CIG.</p>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 */
	public static boolean controlloCIGValido(String cig) {
		return controlloCIG(cig);
	}
	
	/**
	 * <p>Controllo per lo Smart CIG.</p>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 */
	public static boolean controlloSmartCIGValido(String cig) {
		return controlloSmartCIG(cig);
	}

	/**
	 * <p>Controllo per il CIG Unico.</p>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 */
	public static boolean controlloCIGUnicoValido(String cig) {
		return controlloCIGUnico(cig);
	}
	
	/**
	 * <p>Metodo di utilita' per la validazione del CIG.</p>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 */
	public static boolean controlloFomatoValido(String cig) {
		if(StringUtils.isNotBlank(cig) && cig.length() == 10) {
			//CIG
			if(controlloCIG(cig)) return true;
			//SMART CIG
			if(controlloSmartCIG(cig)) return true;
			//CIG UNICO
			if(controlloCIGUnico(cig)) return true;
		}
		return false;
	}

	/**
	 * <p>Metodo di utilita' per la determina del tipo di CIG.</p>
	 * 
	 * @param 
	 * @return <TipoCig> la tipologia del CIG oppure null
	 */
	public static TipoCig getTipoCig(String cig) {
		if(StringUtils.isNotBlank(cig) && cig.length() == 10) {
			//CIG
			if(controlloCIG(cig)) return TipoCig.CIG;
			//SMART CIG
			if(controlloSmartCIG(cig)) return TipoCig.SMART_CIG;
			//CIG UNICO
			if(controlloCIGUnico(cig)) return TipoCig.CIG_UNICO;
		}
		return null;
	}
	
	/**
	 * <p>Metodo di utilita' per la determina del tipo di CIG.</p>
	 * 
	 * @param 
	 * @return <String> il nome della tipologia del CIG oppure null
	 */
	public static String getNameTipoCig(String cig) {
		if(StringUtils.isNotBlank(cig) && cig.length() == 10) {
			//CIG
			if(controlloCIG(cig)) return TipoCig.CIG.getName();
			//SMART CIG
			if(controlloSmartCIG(cig)) return TipoCig.SMART_CIG.getName();
			//CIG UNICO
			if(controlloCIGUnico(cig)) return TipoCig.CIG_UNICO.getName();
		}
		return null;
	}
	
}