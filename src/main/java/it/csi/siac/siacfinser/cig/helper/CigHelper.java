/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacfinser.cig.helper;

import org.apache.commons.lang3.StringUtils;

import it.csi.siac.siaccorser.model.errore.ErroreCore;
import it.csi.siac.siacfin2ser.model.Documento;
import it.csi.siac.siacfinser.cig.exception.CigException;
import it.csi.siac.siacfinser.cig.utility.CigUtil;
import it.csi.siac.siacfinser.cig.utility.TipoCig;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoPagamento;


/**
 * SIAC-8208
 * 
 * <p>Helper per la gestione e l'implementazione dei controlli del CIG.</p>
 * 
 * @author todescoa
 *
 */
public class CigHelper {

	private static final String IMPEGNO = "L'impegno ";
	private static final String LIQUIDAZIONE = "La liquidazione ";
	private static final String DOCUMENTO = "Il documento ";
	private static final String ORDINATIVO = "L'ordinativo ";
	
	/**
	 * <P>Metodo di formattazione della descrizione di errore.</p>
	 * 
	 * @param 
	 * @return <String> la formattazione dell'eventuale codice di errore
	 */
	private static String getFormatImpengo(Impegno impegno) {
		return IMPEGNO + impegno.getAnnoMovimento() + "/" + impegno.getNumeroBigDecimal() + " con uid: [" + impegno.getUid() + "]";
	}

	/**
	 * <P>Metodo di formattazione della descrizione di errore.</p>
	 * 
	 * @param 
	 * @return <String> la formattazione dell'eventuale codice di errore
	 */
	private static String getFormatLiquidazione(Liquidazione liquidazione) {
		return LIQUIDAZIONE + liquidazione.getAnnoLiquidazione() + "/" + liquidazione.getNumeroLiquidazione() + " con uid: [" + liquidazione.getUid() + "]";
	}

	/**
	 * <P>Metodo di formattazione della descrizione di errore.</p>
	 * 
	 * @param 
	 * @return <String> la formattazione dell'eventuale codice di errore
	 */
	private static <D extends Documento<?, ?>> String getFormatDocumento(D documento) {
		return DOCUMENTO + documento.getAnno() + "/" + documento.getNumero() + " con uid: [" + documento.getUid() + "]";
	}

	/**
	 * <P>Metodo di formattazione della descrizione di errore.</p>
	 * 
	 * @param 
	 * @return <String> la formattazione dell'eventuale codice di errore
	 */
	private static String getFormatOrdinativo(OrdinativoPagamento ordinativo) {
		return ORDINATIVO + ordinativo.getAnno() + "/" + ordinativo.getNumero() + " con uid: [" + ordinativo.getUid() + "]";
	}
	
	/**
	 * <p>Metodo di controllo per il CIG associato all'impegno.</p>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 */
	public static boolean controlloCIGSuImpegno(Impegno impegno) {
		return impegno != null && impegno.getCig() != null ? 
				controllaCIG(impegno.getCig()) : false;
	}

	/**
	 * <p>Metodo di controllo per il CIG associato all'impegno.</p>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 * @throws BusinessException se non vengono rispettate le condizioni del formato CIG
	 */
	public static boolean controlloCIGSuImpegno(Impegno impegno, boolean toThrow) {
		return impegno != null && impegno.getCig() != null ? 
				controllaCIG(impegno.getCig(), getFormatImpengo(impegno), toThrow) : false;
	}
	
	/**
	 * <p>
	 * Metodo di controllo per il CIG associato alla liquidazione.
	 * Il metodo lancia 
	 * </p>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 */
	public static boolean controlloCIGSuLiquidazione(Liquidazione liquidazione) {
		return liquidazione != null && liquidazione.getCig() != null ? 
				controllaCIG(liquidazione.getCig()) : false;
	}

	/**
	 * <p>Metodo di controllo per il CIG associato alla liquidazione.</p>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 * @throws BusinessException se non vengono rispettate le condizioni del formato CIG
	 */
	public static boolean controlloCIGSuLiquidazione(Liquidazione liquidazione, boolean toThrow) {
		return liquidazione != null && liquidazione.getCig() != null ? 
				controllaCIG(liquidazione.getCig(), getFormatLiquidazione(liquidazione), toThrow) : false;
	}

	/**
	 * <p>Metodo di controllo per il CIG associato al documento.</p>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 * @throws BusinessException se non vengono rispettate le condizioni del formato CIG
	 */
	public static <D extends Documento<?, ?>> boolean controlloCIGSuDocumento(D documento) {
		return documento != null && documento.getCig() != null ? 
				controllaCIG(documento.getCig()) : false;
	}

	/**
	 * <p>Metodo di controllo per il CIG associato al documento.</p>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 * @throws BusinessException se non vengono rispettate le condizioni del formato CIG
	 */
	public static <D extends Documento<?, ?>> boolean controlloCIGSuDocumento(D documento, boolean toThrow) {
		return documento != null && documento.getCig() != null ? 
				controllaCIG(documento.getCig(), getFormatDocumento(documento), toThrow) : false;
	}

	/**
	 * <p>Metodo di controllo per il CIG associato all'ordinativo di pagamento.</p>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 */
	public static boolean controlloCIGSuOrdinativoDiPagamento(OrdinativoPagamento ordinativo) {
		return ordinativo != null && ordinativo.getCig() != null ? 
				controllaCIG(ordinativo.getCig()) : false;
	}
	
	/**
	 * <p>Metodo di controllo per il CIG associato all'ordinativo di pagamento.</p>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 * @throws BusinessException se non vengono rispettate le condizioni del formato CIG
	 */
	public static boolean controlloCIGSuOrdinativoDiPagamento(OrdinativoPagamento ordinativo, boolean toThrow) {
		return ordinativo != null && ordinativo.getCig() != null ? 
				controllaCIG(ordinativo.getCig(), getFormatOrdinativo(ordinativo), toThrow) : false;
	}

	/**
	 * <p>Metodo di controllo per il CIG</p>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 */
	private static boolean controllaCIG(String cig) {
		return CigUtil.controlloFomatoValido(cig);
	}
	
	/**
	 * <p>
	 * Metodo di utilita' per la validazione del CIG.
	 * Il Metodo lancia eccezioni se la 
	 * </p>
	 * 
	 * @param 
	 * @return <boolean> true se supera i controlli di validita' altrimenti <boolean> false
	 * @throws BusinessException se non vengono rispettate le condizioni del formato CIG
	 */
	private static boolean controlloFomatoValido(String cig, boolean toThrow) {
		boolean valido = false;
		
		if((StringUtils.isBlank(cig) || cig.length() != 10) && toThrow) {
			throw new CigException("controllare il numero di caratteri immessi");
		}
		
		valido = CigUtil.controlloFomatoValido(cig);
		
		if(!valido && toThrow) {
			throw new CigException("");
		}
		
		return valido;
	}
	
	/**
	 * <p>
	 * Metodo di controllo per il CIG data una entita' con gestione delle eccezioni.
	 * Utilizzabile in un metodo checkServiceParam()
	 * </p>
	 * 
	 * @param 
	 * @return <boolean> true or <boolean> false
	 * @throws BusinessException se non vengono rispettate le condizioni del formato CIG
	 */
	public static boolean controllaCIG(String cig, String entitaInEsame, boolean toThrow) {
		boolean valido = false;
		
		try {
			
			valido = controlloFomatoValido(cig, toThrow);

		} catch (CigException ce) {
			if(toThrow) {
				throw new CigException(ErroreCore.ENTITA_NON_COMPLETA.getErrore(entitaInEsame, 
						ce.getErrore().getDescrizione()));
			}
		}
		
		return valido;
	}
	
	/**
	 * <p>Metodo di utilita' per la determina del tipo di CIG.</p>
	 * 
	 * @param 
	 * @return <TipoCig> tipo
	 * @throws BusinessException se non vengono rispettate le condizioni del formato CIG
	 */
	public static TipoCig getTipoCig(String cig, boolean toThrow) {
		TipoCig tipo = CigUtil.getTipoCig(cig);
		
		if(tipo == null && toThrow) 
			throw new CigException("il formato del CIG non corrisponde ad uno dei tipi ammessi");
		
		return tipo;
	}
	
	/**
	 * <p>Metodo di utilita' per la determina del tipo di CIG.</p>
	 * 
	 * @param 
	 * @return <TipoCig> tipo
	 * @throws BusinessException se non vengono rispettate le condizioni del formato CIG
	 */
	public static String getNameTipoCig(String cig, boolean toThrow) {
		String cigName = CigUtil.getNameTipoCig(cig);
		
		if(cigName == null && toThrow) 
			throw new CigException("il formato del CIG non corrisponde ad uno dei tipi ammessi");
		
		return cigName;
	}

}