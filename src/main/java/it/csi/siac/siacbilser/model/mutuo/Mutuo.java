/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.mutuo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacbilser.business.utility.mutuo.MutuoUtil;
import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siacbilser.model.TipoFinanziamento;
import it.csi.siac.siaccommon.util.collections.CollectionUtil;
import it.csi.siac.siaccommon.util.collections.Predicate;
import it.csi.siac.siaccommon.util.date.DateUtil;
import it.csi.siac.siaccommon.util.number.BigDecimalUtil;
import it.csi.siac.siaccorser.model.EntitaEnteExt;
import it.csi.siac.siacfin2ser.model.ContoTesoreria;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class Mutuo extends EntitaEnteExt  {

	private static final long serialVersionUID = 5158964430078553496L;

	private Integer numero;
	private String oggetto;
	private TipoTassoMutuo tipoTasso;
	private StatoMutuo statoMutuo;
	private Date dataAtto;
	private List<RataMutuo> elencoRate = new ArrayList<RataMutuo>();
	private AttoAmministrativo attoAmministrativo;
	private BigDecimal sommaMutuataIniziale;
	private BigDecimal sommaMutuataEffettiva;
	private BigDecimal tassoInteresse;
	private BigDecimal tassoInteresseEuribor;
	private BigDecimal tassoInteresseSpread;
	private BigDecimal preammortamento;
	private BigDecimal debitoResiduo;
	private Integer durataAnni;
	private Integer annoInizio;
	private Integer annoFine;
	private Date scadenzaPrimaRata;
	private Soggetto soggetto;
	private ContoTesoreria contoTesoreria; 
	private BigDecimal annualita;
	private PeriodoRimborsoMutuo periodoRimborso;
	private Date dataInizioPianoAmmortamento;
	private Date scadenzaUltimaRata;
	private List<ImpegnoAssociatoMutuo> elencoImpegniAssociati = new ArrayList<ImpegnoAssociatoMutuo>();
	private List<AccertamentoAssociatoMutuo> elencoAccertamentiAssociati = new ArrayList<AccertamentoAssociatoMutuo>();
	private List<RipartizioneMutuo> elencoRipartizioneMutuo = new ArrayList<RipartizioneMutuo>();
	private List<ProgettoAssociatoMutuo> elencoProgettiAssociati = new ArrayList<ProgettoAssociatoMutuo>();
	
	private BigDecimal totaleImportoRata;
	private BigDecimal totaleImportoQuotaCapitaleRata;
	private BigDecimal totaleImportoQuotaInteressiRata;
	private BigDecimal totaleImportoQuotaOneriRata;
	
	private BigDecimal totaleImpegniAssociati;
	private BigDecimal totaleAccertamentiAssociati;
	private BigDecimal diffSommaMutuataImpegniAssociati;
	private BigDecimal diffSommaMutuataAccertamentiAssociati;
	
	private BigDecimal totaleRipartizioneInteressiImporto; 
	private BigDecimal totaleRipartizioneInteressiPercentuale; 
	
	
	private BigDecimal totaleProgettiAssociatiIniziale;
	private BigDecimal totaleProgettiAssociatiAttuale;
	private BigDecimal diffSommaMutuataProgettiAssociati;
	
	private TipoFinanziamento tipoFinanziamento;

	public BigDecimal getAnnualita() {
		return annualita;
	}

	public void setAnnualita(BigDecimal annualita) {
		this.annualita = annualita;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public TipoTassoMutuo getTipoTasso() {
		return tipoTasso;
	}

	public void setTipoTasso(TipoTassoMutuo tipoTasso) {
		this.tipoTasso = tipoTasso;
	}

	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}

	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}

	public BigDecimal getSommaMutuataIniziale() {
		return sommaMutuataIniziale;
	}

	public void setSommaMutuataIniziale(BigDecimal sommaMutuataIniziale) {
		this.sommaMutuataIniziale = sommaMutuataIniziale;
	}

	public BigDecimal getSommaMutuataEffettiva() {
		return sommaMutuataEffettiva;
	}

	public void setSommaMutuataEffettiva(BigDecimal sommaMutuataEffettiva) {
		this.sommaMutuataEffettiva = sommaMutuataEffettiva;
	}

	public BigDecimal getTassoInteresse() {
		return tassoInteresse;
	}

	public void setTassoInteresse(BigDecimal tassoInteresse) {
		this.tassoInteresse = tassoInteresse;
	}

	public BigDecimal getTassoInteresseEuribor() {
		return tassoInteresseEuribor;
	}

	public void setTassoInteresseEuribor(BigDecimal tassoInteresseEuribor) {
		this.tassoInteresseEuribor = tassoInteresseEuribor;
	}

	public BigDecimal getTassoInteresseSpread() {
		return tassoInteresseSpread;
	}

	public void setTassoInteresseSpread(BigDecimal tassoInteresseSpread) {
		this.tassoInteresseSpread = tassoInteresseSpread;
	}

	public Integer getDurataAnni() {
		return durataAnni;
	}

	public void setDurataAnni(Integer durataAnni) {
		this.durataAnni = durataAnni;
	}

	public Integer getAnnoInizio() {
		return annoInizio;
	}

	public void setAnnoInizio(Integer annoInizio) {
		this.annoInizio = annoInizio;
	}

	public Integer getAnnoFine() {
		return annoFine;
	}

	public void setAnnoFine(Integer annoFine) {
		this.annoFine = annoFine;
	}

	public Date getScadenzaPrimaRata() {
		return scadenzaPrimaRata;
	}

	public void setScadenzaPrimaRata(Date scadenzaPrimaRata) {
		this.scadenzaPrimaRata = scadenzaPrimaRata;
	}

	public String getOggetto() {
		return oggetto;
	}

	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}

	public StatoMutuo getStatoMutuo() {
		return statoMutuo;
	}

	public void setStatoMutuo(StatoMutuo statoMutuo) {
		this.statoMutuo = statoMutuo;
	}

	public Soggetto getSoggetto() {
		return soggetto;
	}

	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}

	public BigDecimal getPreammortamento() {
		return preammortamento;
	}

	public void setPreammortamento(BigDecimal preammortamento) {
		this.preammortamento = preammortamento;
	}

	public ContoTesoreria getContoTesoreria() {
		return contoTesoreria;
	}

	public void setContoTesoreria(ContoTesoreria contoTesoreria) {
		this.contoTesoreria = contoTesoreria;
	}

	public PeriodoRimborsoMutuo getPeriodoRimborso() {
		return periodoRimborso;
	}

	public void setPeriodoRimborso(PeriodoRimborsoMutuo periodoRimborso) {
		this.periodoRimborso = periodoRimborso;
	}

	public Date getDataAtto() {
		return dataAtto;
	}

	public void setDataAtto(Date dataAtto) {
		this.dataAtto = dataAtto;
	}

	public BigDecimal getDebitoResiduo() {
		return debitoResiduo;
	}

	public void setDebitoResiduo(BigDecimal debitoResiduo) {
		this.debitoResiduo = debitoResiduo;
	}

	

	

	public Date getDataInizioPianoAmmortamento() {
		return dataInizioPianoAmmortamento;
	}

	public void setDataInizioPianoAmmortamento(Date dataInizioPianoAmmortamento) {
		this.dataInizioPianoAmmortamento = dataInizioPianoAmmortamento;
	}

	public Date getScadenzaUltimaRata() {
		return scadenzaUltimaRata;
	}

	public void setScadenzaUltimaRata(Date scadenzaUltimaRata) {
		this.scadenzaUltimaRata = scadenzaUltimaRata;
	}

	public List<RataMutuo> getElencoRate() {
		return elencoRate;
	}

	public void setElencoRate(List<RataMutuo> elencoRate) {
		this.elencoRate = elencoRate;
	}

	public BigDecimal getTotaleImportoRata() {
		return totaleImportoRata;
	}

	public void setTotaleImportoRata(BigDecimal totaleImportoRata) {
		this.totaleImportoRata = totaleImportoRata;
	}

	public BigDecimal getTotaleImportoQuotaCapitaleRata() {
		return totaleImportoQuotaCapitaleRata;
	}

	public void setTotaleImportoQuotaCapitaleRata(BigDecimal totaleImportoQuotaCapitaleRata) {
		this.totaleImportoQuotaCapitaleRata = totaleImportoQuotaCapitaleRata;
	}

	public BigDecimal getTotaleImportoQuotaInteressiRata() {
		return totaleImportoQuotaInteressiRata;
	}

	public void setTotaleImportoQuotaInteressiRata(BigDecimal totaleImportoQuotaInteressiRata) {
		this.totaleImportoQuotaInteressiRata = totaleImportoQuotaInteressiRata;
	}

	public BigDecimal getTotaleImportoQuotaOneriRata() {
		return totaleImportoQuotaOneriRata;
	}

	public void setTotaleImportoQuotaOneriRata(BigDecimal totaleImportoQuotaOneriRata) {
		this.totaleImportoQuotaOneriRata = totaleImportoQuotaOneriRata;
	}

	public void setTotaliImporti() {
		setTotaleImportoRata(BigDecimal.ZERO);
		setTotaleImportoQuotaCapitaleRata(BigDecimal.ZERO);
		setTotaleImportoQuotaInteressiRata(BigDecimal.ZERO);
		setTotaleImportoQuotaOneriRata(BigDecimal.ZERO);
		
		CollectionUtil.apply(elencoRate, new Predicate<RataMutuo>() {
			@Override
			public void apply(RataMutuo source) {
				setTotaleImportoRata(BigDecimalUtil.sum(getTotaleImportoRata(), BigDecimalUtil.getDefaultZero(source.getImportoTotale())));
				setTotaleImportoQuotaCapitaleRata(BigDecimalUtil.sum(getTotaleImportoQuotaCapitaleRata(), BigDecimalUtil.getDefaultZero(source.getImportoQuotaCapitale())));
				setTotaleImportoQuotaInteressiRata(BigDecimalUtil.sum(getTotaleImportoQuotaInteressiRata(), BigDecimalUtil.getDefaultZero(source.getImportoQuotaInteressi())));
				setTotaleImportoQuotaOneriRata(BigDecimalUtil.sum(getTotaleImportoQuotaOneriRata(), BigDecimalUtil.getDefaultZero(source.getImportoQuotaOneri())));
			}
		});		
	}
	
	public Boolean isPrimaRataScaduta() {
		return DateUtil.dayBeforeToday(scadenzaPrimaRata) || CollectionUtil.isNotEmpty(elencoRate) && CollectionUtil.getFirst(elencoRate).isScaduta();
	}
	
	public Boolean isPianoAmmortamentoModificabile() {
		return statoMutuo.isBozza() || (statoMutuo.isPredefinitivo() || statoMutuo.isDefinitivo()) && !isPrimaRataScaduta();
	}

	public Boolean isImportiPianoAmmortamentoModificabili() {
		return statoMutuo.isBozza() || statoMutuo.isPredefinitivo();
	}

	public List<ImpegnoAssociatoMutuo> getElencoImpegniAssociati() {
		return elencoImpegniAssociati;
	}

	public void setElencoImpegniAssociati(List<ImpegnoAssociatoMutuo> elencoImpegniAssociati) {
		this.elencoImpegniAssociati = elencoImpegniAssociati;
	}

	public List<AccertamentoAssociatoMutuo> getElencoAccertamentiAssociati() {
		return elencoAccertamentiAssociati;
	}

	public void setElencoAccertamentiAssociati(List<AccertamentoAssociatoMutuo> elencoAccertamentiAssociati) {
		this.elencoAccertamentiAssociati = elencoAccertamentiAssociati;
	}

	public BigDecimal getTotaleImpegniAssociati() {
		return totaleImpegniAssociati;
	}

	public void setTotaleImpegniAssociati(BigDecimal totaleImpegniAssociati) {
		this.totaleImpegniAssociati = totaleImpegniAssociati;
	}

	public BigDecimal getTotaleAccertamentiAssociati() {
		return totaleAccertamentiAssociati;
	}

	public void setTotaleAccertamentiAssociati(BigDecimal totaleAccertamentiAssociati) {
		this.totaleAccertamentiAssociati = totaleAccertamentiAssociati;
	}

	public BigDecimal getDiffSommaMutuataImpegniAssociati() {
		return diffSommaMutuataImpegniAssociati;
	}

	public void setDiffSommaMutuataImpegniAssociati(BigDecimal diffSommaMutuataImpegniAssociati) {
		this.diffSommaMutuataImpegniAssociati = diffSommaMutuataImpegniAssociati;
	}

	public BigDecimal getDiffSommaMutuataAccertamentiAssociati() {
		return diffSommaMutuataAccertamentiAssociati;
	}

	public void setDiffSommaMutuataAccertamentiAssociati(BigDecimal diffSommaMutuataAccertamentiAssociati) {
		this.diffSommaMutuataAccertamentiAssociati = diffSommaMutuataAccertamentiAssociati;
	}

	public TipoFinanziamento getTipoFinanziamento() {
		return tipoFinanziamento;
	}

	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
		this.tipoFinanziamento = tipoFinanziamento;
	}

	public List<RipartizioneMutuo> getElencoRipartizioneMutuo() {
		return elencoRipartizioneMutuo;
	}

	public void setElencoRipartizioneMutuo(List<RipartizioneMutuo> elencoRipartizioneMutuo) {
		this.elencoRipartizioneMutuo = elencoRipartizioneMutuo;
	}
	
	public BigDecimal getTotaleRipartizioneInteressiImporto() {
		return totaleRipartizioneInteressiImporto;
	}

	public void setTotaleRipartizioneInteressiImporto(BigDecimal totaleRipartizioneInteressiImporto) {
		this.totaleRipartizioneInteressiImporto = totaleRipartizioneInteressiImporto;
	}

	public BigDecimal getTotaleRipartizioneInteressiPercentuale() {
		return totaleRipartizioneInteressiPercentuale;
	}

	public void setTotaleRipartizioneInteressiPercentuale(BigDecimal totaleRipartizioneInteressiPercentuale) {
		this.totaleRipartizioneInteressiPercentuale = totaleRipartizioneInteressiPercentuale;
	}

	public void setTotaliRipartizioneInteressi() {
		
		setTotaleRipartizioneInteressiImporto(BigDecimal.ZERO);
		setTotaleRipartizioneInteressiPercentuale(BigDecimal.ZERO);
		
		CollectionUtil.apply( 
//				CollectionUtil.filter(elencoRipartizioneMutuo, new Filter<RipartizioneMutuo>() {
//								@Override
//								public boolean isAcceptable(RipartizioneMutuo source) {
//									return TipoRipartizioneMutuo.Interessi.equals(source.getTipoRipartizioneMutuo());
//								};})
				MutuoUtil.getRipartizioneMutuoListFiltered(elencoRipartizioneMutuo, TipoRipartizioneMutuo.Interessi)
				, new Predicate<RipartizioneMutuo>() {
			@Override
			public void apply(RipartizioneMutuo source) {
				setTotaleRipartizioneInteressiImporto(BigDecimalUtil.sum(getTotaleRipartizioneInteressiImporto(), BigDecimalUtil.getDefaultZero(source.getRipartizioneImporto())));
				setTotaleRipartizioneInteressiPercentuale(BigDecimalUtil.sum(getTotaleRipartizioneInteressiPercentuale(), BigDecimalUtil.getDefaultZero(source.getRipartizionePercentuale())));
			}
		});		
	}

	public List<ProgettoAssociatoMutuo> getElencoProgettiAssociati() {
		return elencoProgettiAssociati;
	}

	public void setElencoProgettiAssociati(List<ProgettoAssociatoMutuo> elencoProgettiAssociati) {
		this.elencoProgettiAssociati = elencoProgettiAssociati;
	}

	public BigDecimal getTotaleProgettiAssociatiIniziale() {
		return totaleProgettiAssociatiIniziale;
	}

	public void setTotaleProgettiAssociatiIniziale(BigDecimal totaleProgettiAssociatiIniziale) {
		this.totaleProgettiAssociatiIniziale = totaleProgettiAssociatiIniziale;
	}

	public BigDecimal getTotaleProgettiAssociatiAttuale() {
		return totaleProgettiAssociatiAttuale;
	}

	public void setTotaleProgettiAssociatiAttuale(BigDecimal totaleProgettiAssociatiAttuale) {
		this.totaleProgettiAssociatiAttuale = totaleProgettiAssociatiAttuale;
	}

	public BigDecimal getDiffSommaMutuataProgettiAssociati() {
		return diffSommaMutuataProgettiAssociati;
	}

	public void setDiffSommaMutuataProgettiAssociati(BigDecimal diffSommaMutuataProgettiAssociati) {
		this.diffSommaMutuataProgettiAssociati = diffSommaMutuataProgettiAssociati;
	}
	
}
