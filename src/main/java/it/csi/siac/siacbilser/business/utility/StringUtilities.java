/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.business.utility;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import it.csi.siac.siaccommon.util.CoreUtil;

/**
 * The Class StringUtilities.
 */
public final class StringUtilities {
	
	//private static final Pattern MESSAGE_FORMAT_PLACEHOLDER_PATTERN = Pattern.compile("\\{(\\d+)\\}");
	
	/** Costruttore privato per non instanziabilit&agrave; */
	private StringUtilities() {
		// Non permettere l'instanziazione
	}

	/**
	 * Formattazione di una stringa con dei rimpiazzamenti di default per i valori non specificati
	 * @param format il formato da usare
	 * @param defaultSubstitution la sostituzione di default
	 * @param replacements le sostituzioni da applicare
	 * @return la stringa formattata
	 */
	public static String formatStringWithDefaultReplacements(String format, String defaultSubstitution, Object... replacements) {
		return CoreUtil.formatStringWithDefaultReplacements(format, defaultSubstitution, replacements);
	}
	
	/**
	 * Replace dei placeholder forniti dal pattern in una stringa via le sostituzioni fornite
	 * @param pattern il pattern dei placeholder da sostituire
	 * @param stringToElaborate la stringa da elaborare
	 * @param replacements le sostituzioni da applicare
	 * @param throwException se sia da rilanciare un'eccezione nel caso in cui il placeholder non sia stato sostituito
	 * @return la stringa con i placeholder rimpiazzati
	 */
	public static String replacePlaceholders(Pattern pattern, String stringToElaborate, Map<String, String> replacements, boolean throwException) {
		// String buffer reso necessario dalla firma del matcher
		final StringBuffer stringBuffer = new StringBuffer();
		final Matcher matcher = pattern.matcher(stringToElaborate);
		while(matcher.find()) {
			String valoreDaSostituire  = replacements.get(matcher.group());
			if(valoreDaSostituire == null) {
				//ho trovato un placeholder nella forma di "%qualcosa%", ma nella mappa non ho trovato un valore con cui sostituirlo
				if(throwException) {
					// Lancio un eccezione come richiesto
					throw new IllegalArgumentException("Impossibile creare una chiave per l'elaborazione: non sono stati impostati i parametri necessari. Parametri non impostati: " + matcher.group());
				}
				// Se non lancio l'eccezione, tolgo il placeholder
				valoreDaSostituire = "";
			}
			//sostituisco il placeholder con il valore
			matcher.appendReplacement(stringBuffer, valoreDaSostituire);
		}
		//creo una stringa a partire dai valori sostituiti
		matcher.appendTail(stringBuffer);
		return stringBuffer.toString();
	}
}
