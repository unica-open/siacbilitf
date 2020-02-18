/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum TipologiaAttributo {
	//Trasversali
	NOTE("Note"),
	
	//Capitoli
	FLAG_ASSEGNABILE("Assegnabile"),
	FLAG_FONDO_SVALUTAZIONE_CREDITI("FSC"),
	FLAG_FUNZIONI_DELEGATE("Funzioni delegate regione"),
	FLAG_PER_MEMORIA("Corsivo per memoria"),
	FLAG_RILEVANTE_IVA("Rilevante IVA"),
	FLAG_TRASFERIMENTO_ORGANI_COMUNITARI("Trasferimento organi comunitari"),
	FLAG_ENTRATE_RICORRENTI("Entrate ricorrenti"),
	FLAG_FONDO_PLURIENNALE_VINC("FPV"),	
	FLAG_TRASFERIMENTI_VINCOLATI("Trasferimenti vincolati"),
	FLAG_IMPEGNABILE("Impegnabile"),
	// SIAC-5582
	FLAG_ACCERTATO_PER_CASSA("Accertato per cassa"),
	//Progetto e cronoprogramma
	VALORE_COMPLESSIVO_PROGETTO("Valore complessivo progetto"),
	FLAG_RILEVANTE_FPV("Rilevante FPV"),
	
	//Documenti	
	NUMERO_REPERTORIO("numero repertorio"),
	DATA_REPERTORIO("data repertorio"),
	ANNO_REPERTORIO("anno repertorio"),
	REGISTRO_REPERTORIO("registro repertorio"),
	ARROTONDAMENTO("arrotondamento"),
	TERMINE_PAGAMENTO("termine pagamento"),
	CAUSALE_SOSPENSIONE("Causale sospensione"),
	DATA_SOSPENSIONE("Data sospensione"),
	DATA_RIATTIVAZIONE("Data riattivazione"),
	CODICE_FISCALE_PIGNORATO("codice fiscale pignorato"),
	DATA_RICEZIONE_PORTALE("Data ricezione portale fatture"),
	DATA_SCADENZA_DOPO_SOSPENSIONE("Data scadenza dopo sospensione"),
	FLAG_DISABILITA_REGISTRAZIONE_RESIDUI("Flag disabilita registrazione residui"),

	// SIAC-4749
	// Dati fattura pagata/incassata
	FLAG_PAGATA_INCASSATA("pagata/incassata"),
	NOTE_PAGAMENTO_INCASSO("note pagamento/incasso"),
	DATA_OPERAZIONE_PAGAMENTO_INCASSO("data pagamento/incasso"),
	
	
	//Flag TipiDocumento
	FLAG_RITENUTE("Ritenute"),
	FLAG_NOTA_CREDITO("Nota credito"),
	FLAG_PENALE_ALTRO("Penale/Altro"),
	FLAG_SPESA_COLLEGATA("Spesa collegata"),
	FLAG_IVA("IVA"),
	FLAG_SUBORDINATO("Subordinato"),
	FLAG_REGOLARIZZAZIONE("Regolarizzazione"),
	FLAG_ATTIVA_GEN("Integrazione con Contabilita Generale"),
	FLAG_AGGIORNA_QUOTE_DA_ELENCO("Aggiorna quote da Elenco"),
	FLAG_SENZA_NUMERO("Documento con numerazione automatica"),
	FLAG_COMUNICA_PCC("Integrazione con PCC"),
	FLAG_REGISTRO_UNICO("Iscrizione nel registro unico"),
	//SIAC 6677
	FLAG_NUMERAZIONE_AUTOMATICA_DA_IVA("Numerazione automatica da IVA"),
	
	//RitenuteDocumento
	IMPORTO_CASSA_PENSIONI("Importo cassa pensioni"),
	IMPORTO_ESENTE("Importo esente"),
	IMPORTO_IVA("Importo IVA"),
	IMPORTO_RIVALSA("Importo rivalsa"),
	
	
	//Subdocumento
	FLAG_AVVISO,
	FLAG_ESPROPRIO,
	FLAG_ORDINATIVO_MANUALE,
	FLAG_ORDINATIVO_SINGOLO,
	FLAG_CAUSALE_ORDINATIVO,
	CIG,
	CUP,
	NUMERO_MUTUO,
	DATA_ESECUZIONE_PAGAMENTO,
	
	//Subdocumento.datiCertificazioneCrediti
	ANNOTAZIONE,
	NOTE_CERTIFICAZIONE,
	NUMERO_CERTIFICAZIONE,
	DATA_CERTIFICAZIONE,
	FLAG_CERTIFICAZIONE,
	
	//Attributi legati a TipoOnere
	ALIQUOTA_CARICO_ENTE,
	ALIQUOTA_CARICO_SOGGETTO,
	QUADRO770,
	
	// Attributi legati a AttivitaIva
	FLAG_RILEVANTE_IRAP,
	FLAG_REGISTRAZIONE_IVA,
	FLAG_INTRACOMUNITARIO,
	
	ANNO_CAPITOLO_ORIGINE,
	FLAG_ATTIVA_GSA,
	
	INTESTAZIONE_DIREZIONE,
	INTESTAZIONE_SETTORE,
	INTESTAZIONE_UFFICIO,
	INTESTAZIONE_CITTA,
	FLAG_CRONOPROGRAMMA_DA_DEFINIRE,
	
	// AttibutiBilancio
	FLAG_REIMPUTA_SPESE,
	FLAG_REIMPUTA_ENTRATE,
	ACCANTONAMENTO_GRADUALE,
	RISCOSSIONE_VIRTUOSA,
	MEDIA_APPLICATA,
	PERCENTUALE_ACCANTONAMENTO_ANNO,
	PERCENTUALE_ACCANTONAMENTO_ANNO_1,
	PERCENTUALE_ACCANTONAMENTO_ANNO_2,
	ULTIMO_ANNO_APPROVATO,
	
	;
	
	private String descrizione;
	
	private TipologiaAttributo() {
		this.descrizione = "";
	}

	private TipologiaAttributo(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDescrizione() {
		return descrizione;
	}
	
	public static String toStringDescrizione(List<TipologiaAttributo> l) {
		return toStringDescrizione(l, ", ");
	}
	
	public static String toStringDescrizione(List<TipologiaAttributo> l, String delimiter) {
		final StringBuilder sb = new StringBuilder();
		for (TipologiaAttributo ta : l) {
			sb.append(ta.getDescrizione()).append(delimiter);
		}
		if(sb.length() > delimiter.length()){
			sb.setLength(sb.length() - delimiter.length());
		}
		return sb.toString();
	}

}
