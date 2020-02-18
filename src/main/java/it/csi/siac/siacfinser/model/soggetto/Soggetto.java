/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.soggetto;

import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.time.DateFormatUtils;

import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.codifiche.NaturaGiuridicaSoggetto;
import it.csi.siac.siacfinser.model.codifiche.TipoSoggetto;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;
import it.csi.siac.siacfinser.model.soggetto.sedesecondaria.SedeSecondariaSoggetto;

/**
 * Il paramentro tipoClassificazioneSoggettoId fa riferimento all'entit&agrave; di codifica del modulo FIN <code>ClasseSoggetto</code>; Si aspetta un Id il quale verr&agrave; mappato
 * con la lista di relazioni del ClassificatoreSoggetto.
 * La lista indirizzi contiene gli indirizi associati al Soggetto, verranno concatenati i campi sedime, via , numero civico, Comune e cap.
 * Nella lista delle Sedi Secondarie il sistema registra le informazioni relative alle Sede Secondarie del soggetto, indicate dall'operatore.
 * @author paolos
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Soggetto extends Entita {

	/**
	 *I valori possibili sono MASCHIO, FEMMINA, NON_DEFINITO.
	 * @author andrea.colombo
	 *
	 */
	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum Sesso{
		MASCHIO, FEMMINA, NON_DEFINITO
	}
	/**
	 * Valori possibili :PROVVISORIO,VALIDO, ANNULLATO, BLOCCATO, SOSPESO, IN_MODIFICA.
	 * @author andrea.colombo
	 *
	 */
	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum StatoOperativoAnagrafica{
		PROVVISORIO,VALIDO, ANNULLATO, BLOCCATO, SOSPESO, IN_MODIFICA
	}
	private static final long serialVersionUID = -4325438527828768334L;
	private String codiceFiscale;
	private String codiceFiscaleEstero;
	private String cognome;
	private String contattoRiferimento;
	//private boolean daFonteEsterna;
	private Date dataNascita;
	//private boolean flagSospeso;
	private String nome;
	private String note;
	private String partitaIva;
	
	
	private boolean residenteEstero;
	private String residenteEsteroStringa;
//	SIAC-6565-CR1215
	private String emailPec;
	private String codDestinatario;
	private String canalePA;
	
	//SIAC-6847
	private String codificaAmbito; 
	
	private int uidSoggettoPadre;
	private String codiceSoggettoPadre;
	
	private boolean avviso;
	private String matricola;
	// posso associare n classificazioni ad un soggetto
	private String[] tipoClassificazioneSoggettoId;
	/**
	 * La lista non deve essere obligatoria 
	 */
	private List<ClassificazioneSoggetto> elencoClass;
	// posso associare n oneri ad un soggetto
	private String[] tipoOnereId;
	/**
	 * ? necessario inserire la lista, per la corretta funzionalit? del metodo.
	 */
	private List<Onere> elencoOneri;
	
	/**
	 * La lista dei contatti non ? obbligatoriamente richiesta.
	 */
	private List<Contatto> contatti;
	
	/**
	 * La lista ? obbligatoria, inoltre deve essere presente almeno un?occorrenza.
	 */
	private List<IndirizzoSoggetto> indirizzi;
	
	private List<ModalitaPagamentoSoggetto> modalitaPagamentoList;
	
	private List<SedeSecondariaSoggetto> sediSecondarie;
	private List<ModalitaPagamentoSoggetto> elencoModalitaPagamento;
	
	
	private String denominazione;
	// private long codice;
	private String codiceSoggetto;
	
	private BigInteger codiceSoggettoNumber;
	
	private Date dataValidita;
	private Date dataBlocco;
	
	private Date dataAnnullamento;
	private Date dataProvvisorio;
	private Date dataSospensione;
	// private Date dataInizioValidita;
	// private Date dataFineValidita;
	// private Date dataCreazione;
	private Date dataModifica;
	// private Date dataCancellazione;
	private String loginCancellazione;
	
	private String loginCreazione;
	
	private String loginModifica;
	private String loginControlloPerModifica;
	private StatoOperativoAnagrafica statoOperativo;
	private String notaStatoOperativo;
	private String notaStatoSospesoPrecedente;
	//SIAC-7114
	private String notaStatoBloccoPrecedente;
	private String descrizioneStatoOperativoAnagrafica;
	
	private Integer idStatoOperativoAnagrafica;
	private Sesso sesso;
	private String sessoStringa;
	
	private String tipoLegame;
	
	private List<Integer> idsSoggettiSuccessivi;
	
	private List<Integer> idLegamiSoggettiSuccessivi;
	
	private List<Soggetto> elencoSoggettiSuccessivi;
	private List<Integer> idsSoggettiPrecedenti;
	private List<Integer> idLegamiSoggettiPrecedenti;
	
	private List<Soggetto> elencoSoggettiPrecedenti;
	// viene messo a true quando lancia la funzione save
	private boolean controlloSuSoggetto=true;
	// tipo soggetto
	private TipoSoggetto tipoSoggetto;
	
	/**
	 *Il campo non ? obbligatorio per la corretta funzionalit? del metodo. 
	 */
	// natura giuridica
	private NaturaGiuridicaSoggetto naturaGiuridicaSoggetto;
	
	private Date dataStato;
	
	
	private Date dataFineValiditaDurc;
	private Character tipoFonteDurc;
	private Integer fonteDurcClassifId;
	private String descrizioneFonteDurc;
	private String noteDurc;

	private String loginInserimentoDurc;
	private String loginModificaDurc;
	
	
	/**
	 * Il campo non ? obbligatorio per la corretta funzionalit? del metodo. 
	 */
	private ComuneNascita comuneNascita;

	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	
	public String getCodiceFiscaleEstero() {
		return codiceFiscaleEstero;
	}
	
	public String getCodiceSoggetto() {
		return codiceSoggetto;
	}
	
	public BigInteger getCodiceSoggettoNumber() {
		return codiceSoggettoNumber;
	}
	
	
	public String getCodiceSoggettoPadre() {
		return codiceSoggettoPadre;
	}
	public String getCognome() {
		return cognome;
	}
	public ComuneNascita getComuneNascita() {
		return comuneNascita;
	}
	public List<Contatto> getContatti() {
		return contatti;
	}
	public String getContattoRiferimento() {
		return contattoRiferimento;
	}
	@XmlSchemaType(name = "dateTime")
	public Date getDataAnnullamento() {
		return dataAnnullamento;
	}
	@XmlSchemaType(name = "dateTime")
	public Date getDataBlocco() {
		return dataBlocco;
	}
	@XmlSchemaType(name = "dateTime")
	public Date getDataModifica() {
		return dataModifica;
	}
	@XmlSchemaType(name = "dateTime")
	public Date getDataNascita() {
		return dataNascita;
	}
	@XmlSchemaType(name = "dateTime")
	public Date getDataProvvisorio() {
		return dataProvvisorio;
	}
	
	
	@XmlSchemaType(name = "dateTime")
	public Date getDataSospensione() {
		return dataSospensione;
	}
	public Date getDataStato() {
		return dataStato;
	}
	@XmlSchemaType(name = "dateTime")
	public Date getDataValidita() {
		return dataValidita;
	}
	public String getDenominazione() {
		return denominazione;
	}
	public String getDescrizioneStatoOperativoAnagrafica() {
		return descrizioneStatoOperativoAnagrafica;
	}
	public List<ClassificazioneSoggetto> getElencoClass() {
		return elencoClass;
	}
	public String getElencoClassString() {
		StringBuilder elencoStr = new StringBuilder();
		if (elencoClass != null) {
			for (Iterator<ClassificazioneSoggetto> iterator = elencoClass.iterator(); iterator.hasNext();) {
				ClassificazioneSoggetto cSogg = iterator.next();
				elencoStr.append(cSogg.getSoggettoClasseDesc());
				if (iterator.hasNext())
					elencoStr.append(", ");
			}
		}
		return elencoStr.toString();
	}
	public List<ModalitaPagamentoSoggetto> getElencoModalitaPagamento() {
		return elencoModalitaPagamento;
	}
	public List<Onere> getElencoOneri() {
		return elencoOneri;
	}
	public List<Soggetto> getElencoSoggettiPrecedenti() {
		return elencoSoggettiPrecedenti;
	}
	
	
	public List<Soggetto> getElencoSoggettiSuccessivi() {
		return elencoSoggettiSuccessivi;
	}
	public List<Integer> getIdLegamiSoggettiPrecedenti() {
		return idLegamiSoggettiPrecedenti;
	}
	
	public List<Integer> getIdLegamiSoggettiSuccessivi() {
		return idLegamiSoggettiSuccessivi;
	}
	public List<Integer> getIdsSoggettiPrecedenti() {
		return idsSoggettiPrecedenti;
	}
	
	public List<Integer> getIdsSoggettiSuccessivi() {
		return idsSoggettiSuccessivi;
	}
	public Integer getIdStatoOperativoAnagrafica() {
		return idStatoOperativoAnagrafica;
	}
	
	public List<IndirizzoSoggetto> getIndirizzi() {
		return indirizzi;
	}
	public String getLoginCancellazione() {
		return loginCancellazione;
	}
	
	public String getLoginControlloPerModifica() {
		return loginControlloPerModifica;
	}
	public String getLoginCreazione() {
		return loginCreazione;
	}
	public String getLoginModifica() {
		return loginModifica;
	}
	public String getMatricola() {
		return matricola;
	}
	public List<ModalitaPagamentoSoggetto> getModalitaPagamentoList() {
		return modalitaPagamentoList;
	}
	public NaturaGiuridicaSoggetto getNaturaGiuridicaSoggetto() {
		return naturaGiuridicaSoggetto;
	}
	public String getNome() {
		return nome;
	}
	public String getNote() {
		return note;
	}
	public String getPartitaIva() {
		return partitaIva;
	}
	public String getResidenteEsteroStringa() {
		return residenteEsteroStringa;
	}
	public List<SedeSecondariaSoggetto> getSediSecondarie() {
		return sediSecondarie;
	}
	public Sesso getSesso() {
		return sesso;
	}
	public String getSessoStringa() {
		return sessoStringa;
	}
	
	public StatoOperativoAnagrafica getStatoOperativo() {
		return statoOperativo;
	}
	public String[] getTipoClassificazioneSoggettoId() {
		return tipoClassificazioneSoggettoId;
	}
	

	public String getTipoLegame() {
		return tipoLegame;
	}
	public String[] getTipoOnereId() {
		return tipoOnereId;
	}
	/*
	public StatoOperativoAnagrafica getStatoOperativo() {
		return statoOperativo;
	}
	public void setStatoOperativo(StatoOperativoAnagrafica statoOperativo) {
		this.statoOperativo = statoOperativo;
	}
	*/
	public TipoSoggetto getTipoSoggetto() {
		return tipoSoggetto;
	}
	public int getUidSoggettoPadre() {
		return uidSoggettoPadre;
	}
	public boolean isAvviso() {
		return avviso;
	}
	public boolean isControlloSuSoggetto() {
		return controlloSuSoggetto;
	}
	
	public boolean isResidenteEstero() {
		return residenteEstero;
	}
	public void setAvviso(boolean avviso) {
		this.avviso = avviso;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public void setCodiceFiscaleEstero(String codiceFiscaleEstero) {
		this.codiceFiscaleEstero = codiceFiscaleEstero;
	}
	public void setCodiceSoggetto(String codiceSoggetto) {
		this.codiceSoggetto = codiceSoggetto;
	}
	public void setCodiceSoggettoNumber(BigInteger codiceSoggettoNumber) {
		this.codiceSoggettoNumber = codiceSoggettoNumber;
	}
	public void setCodiceSoggettoPadre(String codiceSoggettoPadre) {
		this.codiceSoggettoPadre = codiceSoggettoPadre;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public void setComuneNascita(ComuneNascita comuneNascita) {
		this.comuneNascita = comuneNascita;
	}
	public void setContatti(List<Contatto> contatti) {
		this.contatti = contatti;
	}
	public void setContattoRiferimento(String contattoRiferimento) {
		this.contattoRiferimento = contattoRiferimento;
	}
	
	public void setControlloSuSoggetto(boolean controlloSuSoggetto) {
		this.controlloSuSoggetto = controlloSuSoggetto;
	}
	public void setDataAnnullamento(Date dataAnnullamento) {
		this.dataAnnullamento = dataAnnullamento;
	}
	public void setDataBlocco(Date dataBlocco) {
		this.dataBlocco = dataBlocco;
	}
	public void setDataModifica(Date dataModifica) {
		this.dataModifica = dataModifica;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public void setDataProvvisorio(Date dataProvvisorio) {
		this.dataProvvisorio = dataProvvisorio;
	}
	public void setDataSospensione(Date dataSospensione) {
		this.dataSospensione = dataSospensione;
	}
	public void setDataStato(Date dataStato) {
		this.dataStato = dataStato;
	}
	
	public void setDataValidita(Date dataValidita) {
		this.dataValidita = dataValidita;
	}
	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}
	public void setDescrizioneStatoOperativoAnagrafica(
			String descrizioneStatoOperativoAnagrafica) {
		this.descrizioneStatoOperativoAnagrafica = descrizioneStatoOperativoAnagrafica;
	}
	public void setElencoClass(List<ClassificazioneSoggetto> elencoClass) {
		this.elencoClass = elencoClass;
	}
	public void setElencoModalitaPagamento(
			List<ModalitaPagamentoSoggetto> elencoModalitaPagamento) {
		this.elencoModalitaPagamento = elencoModalitaPagamento;
	}
	public void setElencoOneri(List<Onere> elencoOneri) {
		this.elencoOneri = elencoOneri;
	}
	public void setElencoSoggettiPrecedenti(List<Soggetto> elencoSoggettiPrecedenti) {
		this.elencoSoggettiPrecedenti = elencoSoggettiPrecedenti;
	}
	public void setElencoSoggettiSuccessivi(List<Soggetto> elencoSoggettiSuccessivi) {
		this.elencoSoggettiSuccessivi = elencoSoggettiSuccessivi;
	}
	public void setIdLegamiSoggettiPrecedenti(
			List<Integer> idLegamiSoggettiPrecedenti) {
		this.idLegamiSoggettiPrecedenti = idLegamiSoggettiPrecedenti;
	}
	public void setIdLegamiSoggettiSuccessivi(
			List<Integer> idLegamiSoggettiSuccessivi) {
		this.idLegamiSoggettiSuccessivi = idLegamiSoggettiSuccessivi;
	}
	public void setIdsSoggettiPrecedenti(List<Integer> idsSoggettiPrecedenti) {
		this.idsSoggettiPrecedenti = idsSoggettiPrecedenti;
	}
	public void setIdsSoggettiSuccessivi(List<Integer> idsSoggettiSuccessivi) {
		this.idsSoggettiSuccessivi = idsSoggettiSuccessivi;
	}
	public void setIdStatoOperativoAnagrafica(Integer idStatoOperativoAnagrafica) {
		this.idStatoOperativoAnagrafica = idStatoOperativoAnagrafica;
	}
	public void setIndirizzi(List<IndirizzoSoggetto> indirizzi) {
		this.indirizzi = indirizzi;
	}
	public void setLoginCancellazione(String loginCancellazione) {
		this.loginCancellazione = loginCancellazione;
	}
	public void setLoginControlloPerModifica(String loginControlloPerModifica) {
		this.loginControlloPerModifica = loginControlloPerModifica;
	}
	public void setLoginCreazione(String loginCreazione) {
		this.loginCreazione = loginCreazione;
	}
	public void setLoginModifica(String loginModifica) {
		this.loginModifica = loginModifica;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public void setModalitaPagamentoList(
			List<ModalitaPagamentoSoggetto> modalitaPagamentoList) {
		this.modalitaPagamentoList = modalitaPagamentoList;
	}
	public void setNaturaGiuridicaSoggetto(
			NaturaGiuridicaSoggetto naturaGiuridicaSoggetto) {
		this.naturaGiuridicaSoggetto = naturaGiuridicaSoggetto;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}
	public void setResidenteEstero(boolean residenteEstero) {
		this.residenteEstero = residenteEstero;
	}
	public void setResidenteEsteroStringa(String residenteEsteroStringa) {
		this.residenteEsteroStringa = residenteEsteroStringa;
	}
	public void setSediSecondarie(List<SedeSecondariaSoggetto> sediSecondarie) {
		this.sediSecondarie = sediSecondarie;
	}
	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}
	public void setSessoStringa(String sessoStringa) {
		this.sessoStringa = sessoStringa;
	}
	public void setStatoOperativo(StatoOperativoAnagrafica statoOperativo) {
		this.statoOperativo = statoOperativo;
	}
	public void setTipoClassificazioneSoggettoId(
			String[] tipoClassificazioneSoggettoId) {
		this.tipoClassificazioneSoggettoId = tipoClassificazioneSoggettoId;
	}
	public void setTipoLegame(String tipoLegame) {
		this.tipoLegame = tipoLegame;
	}
	public void setTipoOnereId(String[] tipoOnereId) {
		this.tipoOnereId = tipoOnereId;
	}
	public void setTipoSoggetto(TipoSoggetto tipoSoggetto) {
		this.tipoSoggetto = tipoSoggetto;
	}
	public void setUidSoggettoPadre(int uidSoggettoPadre) {
		this.uidSoggettoPadre = uidSoggettoPadre;
	}

	public String getNotaStatoOperativo() {
		return notaStatoOperativo;
	}

	public void setNotaStatoOperativo(String notaStatoOperativo) {
		this.notaStatoOperativo = notaStatoOperativo;
	}

	public String getNotaStatoSospesoPrecedente() {
		return notaStatoSospesoPrecedente;
	}

	public void setNotaStatoSospesoPrecedente(String notaStatoSospesoPrecedente) {
		this.notaStatoSospesoPrecedente = notaStatoSospesoPrecedente;
	}

	//SIAC-7114
	public String getNotaStatoBloccoPrecedente() {
		return notaStatoBloccoPrecedente;
	}
	
	//SIAC-7114
	public void setNotaStatoBloccoPrecedente(String notaStatoBloccoPrecedente) {
		this.notaStatoBloccoPrecedente = notaStatoBloccoPrecedente;
	}
	
	public Date getDataFineValiditaDurc() {
		return dataFineValiditaDurc;
	}
	

	public String getDataFineValiditaDurcStr() {
		if (dataFineValiditaDurc == null) {
			return null;
		}
		
		return DateFormatUtils.format(dataFineValiditaDurc, "dd/MM/yyyy", Locale.ITALY);
	}

//	public void setDataFineValiditaDurc(String dataFineValiditaDurcStr) {
//		this.dataFineValiditaDurc = StringUtils.isBlank(dataFineValiditaDurcStr) ? null : DateConverter.convertFromString(dataFineValiditaDurcStr);
//	}


	public void setDataFineValiditaDurc(Date dataFineValiditaDurc) {
		this.dataFineValiditaDurc = dataFineValiditaDurc;
	}

	public Character getTipoFonteDurc() {
		return tipoFonteDurc;
	}

	public void setTipoFonteDurc(Character tipoFonteDurc) {
		this.tipoFonteDurc = tipoFonteDurc;
	}

	public Integer getFonteDurcClassifId() {
		return fonteDurcClassifId;
	}

	public void setFonteDurcClassifId(Integer fonteDurcClassifId) {
		this.fonteDurcClassifId = fonteDurcClassifId;
	}

	public String getNoteDurc() {
		return noteDurc;
	}

	public void setNoteDurc(String noteDurc) {
		this.noteDurc = noteDurc;
	}

	public String getDescrizioneFonteDurc() {
		return descrizioneFonteDurc;
	}

	public void setDescrizioneFonteDurc(String descrizioneFonteDurc) {
		this.descrizioneFonteDurc = descrizioneFonteDurc;
	}

	public String getEmailPec() {
		return emailPec;
	}

	public void setEmailPec(String emailPec) {
		this.emailPec = emailPec;
	}

	public String getCodDestinatario() {
		return codDestinatario;
	}

	public void setCodDestinatario(String codDestinatario) {
		this.codDestinatario = codDestinatario;
	}

	public String getCanalePA() {
		return canalePA;
	}

	public void setCanalePA(String canalePA) {
		this.canalePA = canalePA;
	}

	/**
	 * @return the loginInserimentoDurc
	 */
	public String getLoginInserimentoDurc() {
		return loginInserimentoDurc;
	}

	/**
	 * @param loginInserimentoDurc the loginInserimentoDurc to set
	 */
	public void setLoginInserimentoDurc(String loginInserimentoDurc) {
		this.loginInserimentoDurc = loginInserimentoDurc;
	}

	/**
	 * @return the loginModificaDurc
	 */
	public String getLoginModificaDurc() {
		return loginModificaDurc;
	}

	/**
	 * @param loginModificaDurc the loginModificaDurc to set
	 */
	public void setLoginModificaDurc(String loginModificaDurc) {
		this.loginModificaDurc = loginModificaDurc;
	}

	// SIAC-6847
	public String getCodificaAmbito() {
		return codificaAmbito;
	}
	
	// SIAC-6847
	public void setCodificaAmbito(String codificaAmbito) {
		this.codificaAmbito = codificaAmbito;
	}
	
	
	
}
