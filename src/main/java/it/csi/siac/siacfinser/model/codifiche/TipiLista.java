/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.codifiche;

/**
 * 
 *  puo' assumere i seguenti valori
 *  NAZIONI,NATURA_GIURIDICA, GIURIDICA_SOGGETTO,CLASSE_SOGGETTO,TIPO_INDIRIZZO_SEDE,STATO_OPERATIVO_SOGGETTO,FORMA_GIURIDICA_TIPO,
 *	RECAPITO_MODO,TIPO_ONERE,TIPO_ACCREDITO,TIPO_LEGAME,STATO_MOVGEST,TIPO_IMPEGNO,TIPO_MOTIVO,STATO_ORDINATIVO,VALUTA,COMMISSIONI_ESTERO
 *
 */
public enum TipiLista {
	NAZIONI("nazioni"), 
	NATURA_GIURIDICA("natureGiuridiche"), 
	GIURIDICA_SOGGETTO("giuridicheSoggetto"),
	CLASSE_SOGGETTO("classiSoggetto"),
	TIPO_INDIRIZZO_SEDE("tipoIndirizzoSede"),
	STATO_OPERATIVO_SOGGETTO("statoOperativoSoggetto"),
	FORMA_GIURIDICA_TIPO("formaGiuridicaTipo"),
	RECAPITO_MODO("recapitoModo"),
	TIPO_ONERE("tipoOnere"),
	TIPO_ACCREDITO("tipoAccredito"),
	TIPO_LEGAME("tipoLegame"),
	STATO_MOVGEST("statoOperativoMovGest"),
	TIPO_IMPEGNO("tipoImpegno"),
	TIPO_MOTIVO("tipoMotivo"),
	TIPO_MOTIVO_ROR("tipoMotivoROR"),
	TIPO_MUTUO("tipoMutuo"),
	DISTINTA("distinta"),
	CONTO_TESORERIA("contoTesoreria"),
	CODICE_BOLLO("codiceBollo"),
	AVVISO("tipoAvviso"),
	NOTE_TESORIERE("noteTesoriere"),
	COMMISSIONI("commissioni"),
	STATO_ORDINATIVO("statoOrdinativo"),
	DISTINTA_ENTRATA("distintaEntrata"),
	STATO_OP_CARTA_CONTABILE("statoOpCartaContabile"),
	VALUTA("valuta"),
	COMMISSIONI_ESTERO("commissioniEstero"),
	TIPO_DOCUMENTO_SPESA("tipoDocumentoSpesa"),
	TIPO_LEGAME_SOGGETTO("tipoLegameSoggetto"),
	TIPO_SIOPE_SPESA_I("tipoSiopeSpesaI"),
	TIPO_SIOPE_ENTRATA_I("tipoSiopeEntrataI"),
	MOTIVAZIONE_ASSENZA_CIG("motivazioneAssenzaCig"),
	;
	
	private String attr;
	private boolean forceReload;
	private TipiLista(String attr) {
		this.attr = attr;
	}
	
	private TipiLista(String attr, boolean forceReload) {
		this.attr = attr;
		this.forceReload = forceReload;
	}
	
	public String getAttr() {
		return attr;
	}
	
	public boolean isForceReload() {
		return forceReload;
	}
}
