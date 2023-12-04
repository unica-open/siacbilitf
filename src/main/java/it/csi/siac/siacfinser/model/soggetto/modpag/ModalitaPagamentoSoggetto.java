/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.soggetto.modpag;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.StringUtils;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.codifiche.ModalitaAccreditoSoggetto;
import it.csi.siac.siacfinser.model.soggetto.ComuneNascita;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ModalitaPagamentoSoggetto extends EntitaEnte {

	private static final long serialVersionUID = -3659783940885013287L;

	private Integer codiceSoggettoAssociato;
	private String bic;

	private String contoCorrente;
	private Integer uidOrigine;
	private Date dataInizioValidita;
	private Date dataFineValidita;
	private Date dataCreazione;
	private Date dataModifica;
	private Date dataUltimaModifica;
	private Date dataCancellazione;
	private String loginCancellazione;
	private String loginCreazione;
	private String loginModifica;

	private String loginUltimaModifica;
	private String iban;
	private String denominazioneBanca;
	private String note;

	private String codiceFiscaleQuietanzante;
	private String soggettoQuietanzante;
	private String dataNascitaQuietanzante;
	private String luogoNascitaQuietanzante;
	private String statoNascitaQuietanzante;

	private String utenteCancellazione;
	private String utenteCreazione;
	private String utenteModifica;

	private String cessioneCodModPag;
	private String cessioneCodSoggetto;

	private String denominazioneSede;
	private String descrizione;
	private boolean inModifica;
	private String utentePropostaModifica;
	private boolean modificaPropriaOccorrenza;
	
	private DescrizioneInfoModPagSog descrizioneInfo;

	private ModalitaPagamentoSoggetto modalitaOriginale;

	private ModalitaAccreditoSoggetto modalitaAccreditoSoggetto;

	private TipoAccredito tipoAccredito;

	private TipoAccredito gestioneTipoAccredito;

	private Integer idStatoModalitaPagamento;
	private String codiceStatoModalitaPagamento;
	private String descrizioneStatoModalitaPagamento;

	private String associatoA;

	private ModalitaPagamentoSoggettoCessioni modalitaPagamentoSoggettoCessione;
	private ModalitaPagamentoSoggetto modalitaPagamentoSoggettoCessione2;
	private Soggetto soggettoCessione = new Soggetto();

	// per la gestione dei nuovi campi di mdp
	private ComuneNascita comuneNascita;
	private String intestazioneConto;

	// nuovo numeratore
	private String codiceModalitaPagamento;
	
	private Date dataScadenza;
	
	private Boolean perStipendi;

	public ModalitaPagamentoSoggetto() {
		super();
	}

	public ModalitaPagamentoSoggetto(Integer uid) {
		this();
		setUid(uid);
	}

	public String getIntestazioneConto() {
		return intestazioneConto;
	}

	public void setIntestazioneConto(String intestazioneConto) {
		this.intestazioneConto = intestazioneConto;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getCodiceFiscaleQuietanzante() {
		return codiceFiscaleQuietanzante;
	}

	public void setCodiceFiscaleQuietanzante(String codiceFiscaleQuietanzante) {
		this.codiceFiscaleQuietanzante = codiceFiscaleQuietanzante;
	}

	public String getContoCorrente() {
		return contoCorrente;
	}

	public void setContoCorrente(String contoCorrente) {
		this.contoCorrente = contoCorrente;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSoggettoQuietanzante() {
		return soggettoQuietanzante;
	}

	public void setSoggettoQuietanzante(String soggettoQuietanzante) {
		this.soggettoQuietanzante = soggettoQuietanzante;
	}

	public String getUtenteCancellazione() {
		return utenteCancellazione;
	}

	public void setUtenteCancellazione(String utenteCancellazione) {
		this.utenteCancellazione = utenteCancellazione;
	}

	public String getUtenteCreazione() {
		return utenteCreazione;
	}

	public void setUtenteCreazione(String utenteCreazione) {
		this.utenteCreazione = utenteCreazione;
	}

	public String getUtenteModifica() {
		return utenteModifica;
	}

	public void setUtenteModifica(String utenteModifica) {
		this.utenteModifica = utenteModifica;
	}

	public String getDenominazioneSede() {
		return denominazioneSede;
	}

	public void setDenominazioneSede(String denominazioneSede) {
		this.denominazioneSede = denominazioneSede;
	}

	
	public String getDescrizione(){
		
		List<String> tmp = new ArrayList<String>();

		if (StringUtils.isNotBlank(iban))
			tmp.add("IBAN: " + iban);

		if (StringUtils.isNotBlank(bic))
			tmp.add("BIC: " + bic);

		if (StringUtils.isNotBlank(contoCorrente)) {
			StringBuilder sb = new StringBuilder();
			sb.append("Conto: ");
			sb.append(contoCorrente);

			if (StringUtils.isNotBlank(intestazioneConto)) {
				// Aggiungo l'intestazione 
				sb.append(" intestato a ");
				sb.append(intestazioneConto);
			}

			tmp.add(sb.toString());
		}
		
		
		if (getModalitaAccreditoSoggetto() != null) {
			StringBuilder sb = new StringBuilder();
			sb.append("Tipo accredito: ");
			sb.append(getModalitaAccreditoSoggetto().getCodice());

			if (StringUtils.isNotBlank(getModalitaAccreditoSoggetto().getDescrizione())) {
				// Aggungo la modalita' di accredito
				sb.append(" - ");
				sb.append(getModalitaAccreditoSoggetto().getDescrizione());
			}

			tmp.add(sb.toString());
		}

		if (StringUtils.isNotBlank(soggettoQuietanzante)) {
			StringBuilder sb = new StringBuilder();
			sb.append("Quietanzante: ");
			sb.append(soggettoQuietanzante);

			if (StringUtils.isNotBlank(codiceFiscaleQuietanzante)) {
				// Agigungo il CF del quietanzante
				sb.append(" (CF: ");
				sb.append(codiceFiscaleQuietanzante);
				sb.append(")");
			}

			if (StringUtils.isNotBlank(dataNascitaQuietanzante)) {
				// Aggiungo la data di nascita del quietanzante
				sb.append(", nato il ");
				sb.append(dataNascitaQuietanzante);
			}

			if (StringUtils.isNotBlank(luogoNascitaQuietanzante)) {
				// Aggiungo il luogo di nascita del quietanzante;
				sb.append(" a ");
				sb.append(luogoNascitaQuietanzante);
				if(StringUtils.isNotBlank(statoNascitaQuietanzante)) {
					// Aggiungo lo stato di nascita del quietanzante
					sb.append(", ");
					sb.append(statoNascitaQuietanzante);
				}
			}

			tmp.add(sb.toString());
		}

		if (modalitaPagamentoSoggettoCessione2 != null) {
			if (StringUtils.isNotBlank(cessioneCodSoggetto)) {
				StringBuilder sb = new StringBuilder();
				sb.append("Soggetto ricevente: ");
				sb.append(cessioneCodSoggetto);

				if (StringUtils.isNotBlank(modalitaPagamentoSoggettoCessione2.soggettoQuietanzante)) {
					// Aggiungo il quietanzante
					sb.append(" - ");
					sb.append(modalitaPagamentoSoggettoCessione2.soggettoQuietanzante);
				}

				tmp.add(sb.toString());
			}

			if (modalitaPagamentoSoggettoCessione2.getModalitaAccreditoSoggetto() != null) {
				StringBuilder sb = new StringBuilder();
				sb.append("Tipo accredito: ");
				sb.append(modalitaPagamentoSoggettoCessione2.getModalitaAccreditoSoggetto().getCodice());

				if (StringUtils.isNotBlank(modalitaPagamentoSoggettoCessione2.getModalitaAccreditoSoggetto().getDescrizione())) {
					// Aggiungo la modalita' di accredito del soggetto
					sb.append(" - ");
					sb.append(modalitaPagamentoSoggettoCessione2.getModalitaAccreditoSoggetto().getDescrizione());
				}

				tmp.add(sb.toString());
			}
		}

		return StringUtils.join(tmp, " - ");
	}

	
	public String getDescrizioneModalitaPagamento(){
		
		List<String> tmp = new ArrayList<String>();
		
		if (modalitaAccreditoSoggetto != null){
			
				String s = "(" + modalitaAccreditoSoggetto.getCodice() + " - " + modalitaAccreditoSoggetto.getDescrizione() + ")";
				
				tmp.add(s);
			
		}
		
		if (StringUtils.isNotBlank(iban))
			tmp.add("iban: " + iban);

		if (StringUtils.isNotBlank(bic))
			tmp.add(" bic: " + bic);

		if (StringUtils.isNotBlank(contoCorrente)) {
			StringBuilder sb = new StringBuilder();
			sb.append(" Conto: ");
			sb.append(contoCorrente);

			if (StringUtils.isNotBlank(intestazioneConto)) {
				// Aggiungo l'intestazione del conto
				sb.append(" intestato a ");
				sb.append(intestazioneConto);
			}

			tmp.add(sb.toString());
		}

		if (StringUtils.isNotBlank(soggettoQuietanzante)) {
			StringBuilder sb = new StringBuilder();
			sb.append(" quietanzante: ");
			sb.append(soggettoQuietanzante);

			if (StringUtils.isNotBlank(codiceFiscaleQuietanzante)) {
				// Aggiungo il CF del quietanzante
				sb.append(" CF: ");
				sb.append(codiceFiscaleQuietanzante);
			}

			if (StringUtils.isNotBlank(dataNascitaQuietanzante)) {
				// Aggiungo la data di nascita del quietanzante
				sb.append(" nato il ");
				sb.append(dataNascitaQuietanzante);
			}

			if (StringUtils.isNotBlank(luogoNascitaQuietanzante)) {
				// Aggiungo il luogo di nascita del quietanzante
				sb.append(" a ");
				sb.append(luogoNascitaQuietanzante);
				if(StringUtils.isNotEmpty(statoNascitaQuietanzante)) {
					sb.append(", ");
					sb.append(statoNascitaQuietanzante);
				}
			}

			tmp.add(sb.toString());
		}
		
		if (modalitaPagamentoSoggettoCessione2 != null) {
			if (StringUtils.isNotBlank(modalitaPagamentoSoggettoCessione2.getIban()))
				tmp.add("iban: " + modalitaPagamentoSoggettoCessione2.getIban());

			if (StringUtils.isNotBlank(modalitaPagamentoSoggettoCessione2.getBic()))
				tmp.add(" bic: " + modalitaPagamentoSoggettoCessione2.getBic());
			
			
			if (StringUtils.isNotBlank(modalitaPagamentoSoggettoCessione2.getContoCorrente())) {
				StringBuilder sb = new StringBuilder();
				sb.append(" Conto: ");
				sb.append(modalitaPagamentoSoggettoCessione2.getContoCorrente());

				if (StringUtils.isNotBlank(modalitaPagamentoSoggettoCessione2.getIntestazioneConto())) {
					// Aggiungo l'intestazione del conto
					sb.append(" intestato a ");
					sb.append(modalitaPagamentoSoggettoCessione2.getIntestazioneConto());
				}

				tmp.add(sb.toString());
			}
			
			
			if (StringUtils.isNotBlank(modalitaPagamentoSoggettoCessione2.getSoggettoQuietanzante())) {
				StringBuilder sb = new StringBuilder();
				sb.append(" quietanzante: ");
				sb.append(modalitaPagamentoSoggettoCessione2.getSoggettoQuietanzante());

				if (StringUtils.isNotBlank(modalitaPagamentoSoggettoCessione2.getCodiceFiscaleQuietanzante())) {
					// Aggiungo il CF del quietanzante
					sb.append(" CF: ");
					sb.append(modalitaPagamentoSoggettoCessione2.getCodiceFiscaleQuietanzante());
				}

				if (StringUtils.isNotBlank(modalitaPagamentoSoggettoCessione2.getDataNascitaQuietanzante())) {
					// Aggiungo la data di nascita del quietanzante
					sb.append(" nato il ");
					sb.append(modalitaPagamentoSoggettoCessione2.getDataNascitaQuietanzante());
				}

				if (StringUtils.isNotBlank(modalitaPagamentoSoggettoCessione2.getLuogoNascitaQuietanzante())) {
					// Agigungo il luogo di nascita del quietanzante
					sb.append(" a ");
					sb.append(modalitaPagamentoSoggettoCessione2.getLuogoNascitaQuietanzante());
					if(StringUtils.isNotEmpty(modalitaPagamentoSoggettoCessione2.getStatoNascitaQuietanzante())) {
						// Aggiungo lo stato di nascita del quietanzante
						sb.append(", ");
						sb.append(modalitaPagamentoSoggettoCessione2.getStatoNascitaQuietanzante());
					}
				}

				tmp.add(sb.toString());
			}
			
			
		}

		return StringUtils.join(tmp, " - ");
	}
	
	public void setDescrizione(String descrizione){
		this.descrizione = descrizione;
	}

	public boolean isInModifica(){
		return inModifica;
	}

	public void setInModifica(boolean inModifica){
		this.inModifica = inModifica;
	}

	public String getUtentePropostaModifica(){
		return utentePropostaModifica;
	}

	public void setUtentePropostaModifica(String utentePropostaModifica){
		this.utentePropostaModifica = utentePropostaModifica;
	}

	public ModalitaAccreditoSoggetto getModalitaAccreditoSoggetto(){
		return modalitaAccreditoSoggetto;
	}

	public void setModalitaAccreditoSoggetto(ModalitaAccreditoSoggetto modalitaAccreditoSoggetto){
		this.modalitaAccreditoSoggetto = modalitaAccreditoSoggetto;
	}

	public TipoAccredito getTipoAccredito(){
		return tipoAccredito;
	}

	public void setTipoAccredito(TipoAccredito tipoAccredito){
		this.tipoAccredito = tipoAccredito;
	}

	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum TipoAccredito {
		CB, CO, CBI, CCP, CSC, CSI, ASS, FA, GE, PI, SU, CPT, CSIG
	}

	public Integer getIdStatoModalitaPagamento() {
		return idStatoModalitaPagamento;
	}

	public void setIdStatoModalitaPagamento(Integer idStatoModalitaPagamento){
		this.idStatoModalitaPagamento = idStatoModalitaPagamento;
	}

	public String getCodiceStatoModalitaPagamento() {
		return codiceStatoModalitaPagamento;
	}

	public void setCodiceStatoModalitaPagamento(String codiceStatoModalitaPagamento) {
		this.codiceStatoModalitaPagamento = codiceStatoModalitaPagamento;
	}

	public String getDescrizioneStatoModalitaPagamento() {
		return descrizioneStatoModalitaPagamento;
	}

	public void setDescrizioneStatoModalitaPagamento(String descrizioneStatoModalitaPagamento) {
		this.descrizioneStatoModalitaPagamento = descrizioneStatoModalitaPagamento;
	}

	public String getAssociatoA() {
		return associatoA;
	}

	public void setAssociatoA(String associatoA) {
		this.associatoA = associatoA;
	}

	public String getCessioneCodModPag() {
		return cessioneCodModPag;
	}

	public void setCessioneCodModPag(String cessioneCodModPag) {
		this.cessioneCodModPag = cessioneCodModPag;
	}

	public String getCessioneCodSoggetto() {
		return cessioneCodSoggetto;
	}

	public void setCessioneCodSoggetto(String cessioneCodSoggetto) {
		this.cessioneCodSoggetto = cessioneCodSoggetto;
	}

	public Integer getCodiceSoggettoAssociato() {
		return codiceSoggettoAssociato;
	}

	public void setCodiceSoggettoAssociato(Integer codiceSoggettoAssociato) {
		this.codiceSoggettoAssociato = codiceSoggettoAssociato;
	}

	public Date getDataInizioValidita() {
		return dataInizioValidita;
	}

	public void setDataInizioValidita(Date dataInizioValidita) {
		this.dataInizioValidita = dataInizioValidita;
	}

	public Date getDataFineValidita() {
		return dataFineValidita;
	}

	public void setDataFineValidita(Date dataFineValidita) {
		this.dataFineValidita = dataFineValidita;
	}

	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public Date getDataModifica() {
		return dataModifica;
	}

	public void setDataModifica(Date dataModifica) {
		this.dataModifica = dataModifica;
	}

	public Date getDataCancellazione() {
		return dataCancellazione;
	}

	public void setDataCancellazione(Date dataCancellazione) {
		this.dataCancellazione = dataCancellazione;
	}

	public String getLoginCancellazione() {
		return loginCancellazione;
	}

	public void setLoginCancellazione(String loginCancellazione) {
		this.loginCancellazione = loginCancellazione;
	}

	public String getLoginCreazione() {
		return loginCreazione;
	}

	public void setLoginCreazione(String loginCreazione) {
		this.loginCreazione = loginCreazione;
	}

	public String getLoginModifica() {
		return loginModifica;
	}

	public void setLoginModifica(String loginModifica) {
		this.loginModifica = loginModifica;
	}

	public ModalitaPagamentoSoggetto getModalitaPagamentoSoggettoCessione2() {
		return modalitaPagamentoSoggettoCessione2;
	}

	public void setModalitaPagamentoSoggettoCessione2(ModalitaPagamentoSoggetto modalitaPagamentoSoggettoCessione2){
		this.modalitaPagamentoSoggettoCessione2 = modalitaPagamentoSoggettoCessione2;
	}

	public boolean isModificaPropriaOccorrenza() {
		return modificaPropriaOccorrenza;
	}

	public void setModificaPropriaOccorrenza(boolean modificaPropriaOccorrenza) {
		this.modificaPropriaOccorrenza = modificaPropriaOccorrenza;
	}

	public TipoAccredito getGestioneTipoAccredito() {
		return gestioneTipoAccredito;
	}

	public void setGestioneTipoAccredito(TipoAccredito gestioneTipoAccredito) {
		this.gestioneTipoAccredito = gestioneTipoAccredito;
	}

	public Integer getUidOrigine() {
		return uidOrigine;
	}

	public void setUidOrigine(Integer uidOrigine) {
		this.uidOrigine = uidOrigine;
	}

	public Date getDataUltimaModifica() {
		return dataUltimaModifica;
	}

	public void setDataUltimaModifica(Date dataUltimaModifica) {
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getLoginUltimaModifica() {
		return loginUltimaModifica;
	}

	public void setLoginUltimaModifica(String loginUltimaModifica) {
		this.loginUltimaModifica = loginUltimaModifica;
	}

	public ModalitaPagamentoSoggetto getModalitaOriginale() {
		return modalitaOriginale;
	}

	public void setModalitaOriginale(ModalitaPagamentoSoggetto modalitaOriginale) {
		this.modalitaOriginale = modalitaOriginale;
	}

	public String getDescrizioneFormattata() {
		StringBuilder support = new StringBuilder();
		if (iban != null && !"".equalsIgnoreCase(iban)) {
			support.append("  iban: ");
			support.append(iban);
			support.append("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
		}
		if (bic != null && !"".equalsIgnoreCase(bic)) {
			support.append("bic ");
			support.append(bic);
			support.append("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
		}
		if (contoCorrente != null && !"".equalsIgnoreCase(contoCorrente)) {
			support.append("conto ");
			support.append(contoCorrente);
			support.append("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
		}
		if (soggettoQuietanzante != null && !"".equalsIgnoreCase(soggettoQuietanzante)) {
			support.append(soggettoQuietanzante);
			support.append("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;");
		}
		if (codiceFiscaleQuietanzante != null && !"".equalsIgnoreCase(codiceFiscaleQuietanzante)) {
			support.append(codiceFiscaleQuietanzante);
		}

		if (modalitaPagamentoSoggettoCessione2 != null) {
			support.append(String.format("Soggetto ricevente: %s ", cessioneCodSoggetto));
			support.append(" &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ");
			support.append(String.format("Tipo accredito: %s - %s", 
							modalitaPagamentoSoggettoCessione2.getModalitaAccreditoSoggetto().getCodice(),
							modalitaPagamentoSoggettoCessione2.getModalitaAccreditoSoggetto().getDescrizione()));
		}

		return support.toString();
	}

	public String getDescrizioneForPopOver() {
		StringBuilder support = new StringBuilder();
		if (iban != null && !"".equalsIgnoreCase(iban)) {
			// Aggiungo l'IBAN
			String ibanconcat = iban.replaceAll("  +", " ");
			support.append("iban: ");
			support.append(ibanconcat);
			support.append("&nbsp;<br/>");
		}
		if (bic != null && !"".equalsIgnoreCase(bic)) {
			// Aggiungo il BIC
			support.append("bic: ");
			support.append(bic.trim());
			support.append("&nbsp;<br/>");
		}
		if (contoCorrente != null && !"".equalsIgnoreCase(contoCorrente)) {
			// Aggiungo il conto corrente
			support.append("conto: ");
			support.append(contoCorrente.trim());
			support.append("&nbsp;<br/>");
		}
		if (soggettoQuietanzante != null && !"".equalsIgnoreCase(soggettoQuietanzante)) {
			// Aggiungo il quietanzante
			support.append(soggettoQuietanzante.trim());
			support.append("&nbsp;<br/>");
		}
		if (codiceFiscaleQuietanzante != null && !"".equalsIgnoreCase(codiceFiscaleQuietanzante)) {
			// Aggiungo il codice fiscale del quietanzante
			support.append(codiceFiscaleQuietanzante);
		}
		return support.toString();
	}

	public ModalitaPagamentoSoggettoCessioni getModalitaPagamentoSoggettoCessione() {
		return modalitaPagamentoSoggettoCessione;
	}

	public void setModalitaPagamentoSoggettoCessione(ModalitaPagamentoSoggettoCessioni modalitaPagamentoSoggettoCessione){
		this.modalitaPagamentoSoggettoCessione = modalitaPagamentoSoggettoCessione;
	}

	public String getDataNascitaQuietanzante() {
		return dataNascitaQuietanzante;
	}

	public void setDataNascitaQuietanzante(String dataNascitaQuietanzante) {
		this.dataNascitaQuietanzante = dataNascitaQuietanzante;
	}

	public ComuneNascita getComuneNascita() {
		return comuneNascita;
	}

	public void setComuneNascita(ComuneNascita comuneNascita) {
		this.comuneNascita = comuneNascita;
	}

	public String getCodiceModalitaPagamento() {
		return codiceModalitaPagamento;
	}

	public void setCodiceModalitaPagamento(String codiceModalitaPagamento) {
		this.codiceModalitaPagamento = codiceModalitaPagamento;
	}

	/**
	 * @return the statoNascitaQuietanzante
	 */
	public String getStatoNascitaQuietanzante() {
		return statoNascitaQuietanzante;
	}

	/**
	 * @param statoNascitaQuietanzante
	 *            the statoNascitaQuietanzante to set
	 */
	public void setStatoNascitaQuietanzante(String statoNascitaQuietanzante) {
		this.statoNascitaQuietanzante = statoNascitaQuietanzante;
	}

	/**
	 * @return the luogoNascitaQuietanzante
	 */
	public String getLuogoNascitaQuietanzante() {
		return luogoNascitaQuietanzante;
	}

	/**
	 * @param luogoNascitaQuietanzante
	 *            the luogoNascitaQuietanzante to set
	 */
	public void setLuogoNascitaQuietanzante(String luogoNascitaQuietanzante) {
		this.luogoNascitaQuietanzante = luogoNascitaQuietanzante;
	}

	public boolean isTipoCessione() {
		return cessioneCodSoggetto != null;
	}

	public String getDenominazioneBanca() {
		return denominazioneBanca;
	}

	public void setDenominazioneBanca(String denominazioneBanca) {
		this.denominazioneBanca = denominazioneBanca;
	}

	public void cleanFields() {
		iban =  StringUtils.upperCase(iban);
		iban = StringUtils.replace(iban, " " , "");

		bic = StringUtils.replace(bic, " " , "");
		
		contoCorrente = StringUtils.replace(contoCorrente, " " , "");
		
		denominazioneBanca = StringUtils.trim(denominazioneBanca);
	}

	/**
	 * @return the dataScadenza
	 */
	public Date getDataScadenza() {
		return dataScadenza;
	}

	/**
	 * @param dataScadenza the dataScadenza to set
	 */
	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	/**
	 * @return the soggettoCessione
	 */
	public Soggetto getSoggettoCessione() {
		return soggettoCessione;
	}

	/**
	 * @param soggettoCessione the soggettoCessione to set
	 */
	public void setSoggettoCessione(Soggetto soggettoCessione) {
		this.soggettoCessione = soggettoCessione;
	}

	public Boolean getPerStipendi() {
		return perStipendi;
	}

	public void setPerStipendi(Boolean perStipendi) {
		this.perStipendi = perStipendi;
	}

	public DescrizioneInfoModPagSog getDescrizioneInfo() {
		return descrizioneInfo;
	}

	public void setDescrizioneInfo(DescrizioneInfoModPagSog descrizioneInfo) {
		this.descrizioneInfo = descrizioneInfo;
	}
	
	
}
