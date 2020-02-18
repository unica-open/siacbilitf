/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.codifiche.CodificaExtFin;
import it.csi.siac.siacfinser.model.codifiche.CodificaFin;
import it.csi.siac.siacfinser.model.codifiche.TipiLista;



/**
 * Messaggio di response per il caricamento generico delle liste
 * 
 * @author 
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ListeResponse extends ServiceResponse {
	private TipiLista[] tipi;
	private List<? extends CodificaFin> nazioni;
	private List<CodificaExtFin> natureGiuridiche;
	private List<CodificaExtFin> giuridicheSoggetto;
	private List<CodificaExtFin> classiSoggetto;
	private List<? extends CodificaFin> tipoIndirizzoSede;
	private List<? extends CodificaFin> statoOperativoSoggetto;
	private List<? extends CodificaFin> statoOperativoMovGest;
	private List<? extends CodificaFin> formaGiuridicaTipo;
	private List<? extends CodificaFin> recapitoModo;
	private List<? extends CodificaFin> tipoOnere;
	private List<? extends CodificaFin> tipoAccredito;
	private List<CodificaFin> tipoLegame;
	private List<CodificaFin> tipoImpegno;
	private List<? extends CodificaFin> tipoMotivo;
	private List<? extends CodificaFin> tipoMotivoROR;
	private List<? extends CodificaFin> tipoMutuo;
	private List<? extends CodificaFin> contoTesoreria;
	private List<? extends CodificaFin> distinta;
	private List<? extends CodificaFin> codiceBollo;
	private List<? extends CodificaFin> commissioni;
	private List<? extends CodificaFin> tipoAvviso;
	private List<? extends CodificaFin> noteTesoriere;
	private List<? extends CodificaFin> statoOrdinativo;
	private List<? extends CodificaFin> distintaEntrata;
	private List<? extends CodificaFin> statoOpCartaContabile;
	private List<? extends CodificaFin> valuta;
	private List<? extends CodificaFin> commissioniEstero;
	private List<? extends CodificaFin> tipoDocumentoSpesa;
	private List<? extends CodificaFin> tipoLegameSoggetto;
	
	private List<CodificaFin> tipoSiopeSpesaI;
	private List<CodificaFin> tipoSiopeEntrataI;
	
	//PER SIOPE PLUS:
	private List<CodificaFin> motivazioneAssenzaCig;
	
	
	
	
	public List<? extends CodificaFin> getTipoIndirizzoSede() {
		return tipoIndirizzoSede;
	}
	public void setTipoIndirizzoSede(
			List<? extends CodificaFin> tipoIndirizzoSede) {
		this.tipoIndirizzoSede = tipoIndirizzoSede;
	}
	public TipiLista[] getTipi() {
		return tipi;
	}
	public void setTipi(TipiLista[] tipi) {
		this.tipi = tipi;
	}
	public List<? extends CodificaFin> getNazioni() {
		return nazioni;
	}
	public void setNazioni(List<? extends CodificaFin> nazioni) {
		this.nazioni = nazioni;
	}
	public List<CodificaExtFin> getNatureGiuridiche() {
		return natureGiuridiche;
	}
	public void setNatureGiuridiche(List<CodificaExtFin> natureGiuridiche) {
		this.natureGiuridiche = natureGiuridiche;
	}
	public List<CodificaExtFin> getGiuridicheSoggetto() {
		return giuridicheSoggetto;
	}
	public void setGiuridicheSoggetto(List<CodificaExtFin> giuridicheSoggetto) {
		this.giuridicheSoggetto = giuridicheSoggetto;
	}
	
	
	public List<? extends CodificaFin> getStatoOperativoSoggetto() {
		return statoOperativoSoggetto;
	}
	public void setStatoOperativoSoggetto(
			List<? extends CodificaFin> statoOperativoSoggetto) {
		this.statoOperativoSoggetto = statoOperativoSoggetto;
	}
	
	
	public List<? extends CodificaFin> getFormaGiuridicaTipo() {
		return formaGiuridicaTipo;
	}
	public void setFormaGiuridicaTipo(
			List<? extends CodificaFin> formaGiuridicaTipo) {
		this.formaGiuridicaTipo = formaGiuridicaTipo;
	}
	
	
	
	public void addTipiLista(TipiLista tipo) {
		if (tipo != null) {
			if (tipi == null) {
				tipi = new TipiLista[1];
				tipi[0] = tipo;
			} else {
				TipiLista[] swp = new TipiLista[tipi.length + 1];
				System.arraycopy(tipi, 0, swp, 0, tipi.length);
				swp[tipi.length] = tipo;
				tipi = swp;
			}
		}
	}
	
	
	
	public List<? extends CodificaFin> getStatoOperativoMovGest() {
		return statoOperativoMovGest;
	}
	public void setStatoOperativoMovGest(
			List<? extends CodificaFin> statoOperativoMovGest) {
		this.statoOperativoMovGest = statoOperativoMovGest;
	}
	public List<? extends CodificaFin> getRecapitoModo() {
		return recapitoModo;
	}
	public void setRecapitoModo(List<? extends CodificaFin> recapitoModo) {
		this.recapitoModo = recapitoModo;
	}
	public List<? extends CodificaFin> getTipoOnere() {
		return tipoOnere;
	}
	public void setTipoOnere(List<? extends CodificaFin> tipoOnere) {
		this.tipoOnere = tipoOnere;
	}
	public List<CodificaExtFin> getClassiSoggetto() {
		return classiSoggetto;
	}
	public void setClassiSoggetto(List<CodificaExtFin> classiSoggetto) {
		this.classiSoggetto = classiSoggetto;
	}
	public List<? extends CodificaFin> getTipoAccredito() {
		return tipoAccredito;
	}
	public void setTipoAccredito(List<? extends CodificaFin> tipoAccredito) {
		this.tipoAccredito = tipoAccredito;
	}
	public List<CodificaFin> getTipoLegame() {
		return tipoLegame;
	}
	public void setTipoLegame(List<CodificaFin> tipoLegame) {
		this.tipoLegame = tipoLegame;
	}
	public List<CodificaFin> getTipoImpegno() {
		return tipoImpegno;
	}
	public void setTipoImpegno(List<CodificaFin> tipoImpegno) {
		this.tipoImpegno = tipoImpegno;
	}
	public List<? extends CodificaFin> getTipoMotivo() {
		return tipoMotivo;
	}
	public void setTipoMotivo(List<? extends CodificaFin> tipoMotivo) {
		this.tipoMotivo = tipoMotivo;
	}
	public List<? extends CodificaFin> getTipoMutuo() {
		return tipoMutuo;
	}
	public void setTipoMutuo(List<? extends CodificaFin> tipoMutuo) {
		this.tipoMutuo = tipoMutuo;
	}
	public List<? extends CodificaFin> getContoTesoreria() {
		return contoTesoreria;
	}
	public void setContoTesoreria(List<? extends CodificaFin> contoTesoreria) {
		this.contoTesoreria = contoTesoreria;
	}
	public List<? extends CodificaFin> getDistinta() {
		return distinta;
	}
	public void setDistinta(List<? extends CodificaFin> distinta) {
		this.distinta = distinta;
	}
	public List<? extends CodificaFin> getCodiceBollo() {
		return codiceBollo;
	}
	public void setCodiceBollo(List<? extends CodificaFin> codiceBollo) {
		this.codiceBollo = codiceBollo;
	}
	public List<? extends CodificaFin> getCommissioni() {
		return commissioni;
	}
	public void setCommissioni(List<? extends CodificaFin> commissioni) {
		this.commissioni = commissioni;
	}
	public List<? extends CodificaFin> getTipoAvviso() {
		return tipoAvviso;
	}
	public void setTipoAvviso(List<? extends CodificaFin> tipoAvviso) {
		this.tipoAvviso = tipoAvviso;
	}
	public List<? extends CodificaFin> getNoteTesoriere() {
		return noteTesoriere;
	}
	public void setNoteTesoriere(List<? extends CodificaFin> noteTesoriere) {
		this.noteTesoriere = noteTesoriere;
	}
	public List<? extends CodificaFin> getStatoOrdinativo() {
		return statoOrdinativo;
	}
	public void setStatoOrdinativo(List<? extends CodificaFin> statoOrdinativo) {
		this.statoOrdinativo = statoOrdinativo;
	}
	public List<? extends CodificaFin> getDistintaEntrata() {
		return distintaEntrata;
	}
	public void setDistintaEntrata(List<? extends CodificaFin> distintaEntrata) {
		this.distintaEntrata = distintaEntrata;
	}
	public List<? extends CodificaFin> getStatoOpCartaContabile() {
		return statoOpCartaContabile;
	}
	public void setStatoOpCartaContabile(
			List<? extends CodificaFin> statoOpCartaContabile) {
		this.statoOpCartaContabile = statoOpCartaContabile;
	}
	public List<? extends CodificaFin> getValuta() {
		return valuta;
	}
	public void setValuta(List<? extends CodificaFin> valuta) {
		this.valuta = valuta;
	}
	public List<? extends CodificaFin> getCommissioniEstero() {
		return commissioniEstero;
	}
	public void setCommissioniEstero(
			List<? extends CodificaFin> commissioniEstero) {
		this.commissioniEstero = commissioniEstero;
	}
	public List<? extends CodificaFin> getTipoDocumentoSpesa() {
		return tipoDocumentoSpesa;
	}
	public void setTipoDocumentoSpesa(
			List<? extends CodificaFin> tipoDocumentoSpesa) {
		this.tipoDocumentoSpesa = tipoDocumentoSpesa;
	}
	public List<? extends CodificaFin> getTipoLegameSoggetto() {
		return tipoLegameSoggetto;
	}
	public void setTipoLegameSoggetto(
			List<? extends CodificaFin> tipoLegameSoggetto) {
		this.tipoLegameSoggetto = tipoLegameSoggetto;
	}
	public List<CodificaFin> getTipoSiopeSpesaI() {
		return tipoSiopeSpesaI;
	}
	public void setTipoSiopeSpesaI(List<CodificaFin> tipoSiopeSpesaI) {
		this.tipoSiopeSpesaI = tipoSiopeSpesaI;
	}
	public List<CodificaFin> getTipoSiopeEntrataI() {
		return tipoSiopeEntrataI;
	}
	public void setTipoSiopeEntrataI(List<CodificaFin> tipoSiopeEntrataI) {
		this.tipoSiopeEntrataI = tipoSiopeEntrataI;
	}
	public List<CodificaFin> getMotivazioneAssenzaCig() {
		return motivazioneAssenzaCig;
	}
	public void setMotivazioneAssenzaCig(List<CodificaFin> motivazioneAssenzaCig) {
		this.motivazioneAssenzaCig = motivazioneAssenzaCig;
	}
	
	/**
	 * @return the tipoMotivoROR
	 */
	public List<? extends CodificaFin> getTipoMotivoROR() {
		return tipoMotivoROR;
	}
	/**
	 * @param tipoMotivoROR the tipoMotivoROR to set
	 */
	public void setTipoMotivoROR(List<? extends CodificaFin> tipoMotivoROR) {
		this.tipoMotivoROR = tipoMotivoROR;
	}
	
}
