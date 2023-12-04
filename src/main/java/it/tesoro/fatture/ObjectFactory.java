/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.tesoro.fatture package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReadElencoMovimentiErarioIvaRispostaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "readElencoMovimentiErarioIvaRispostaTipo");
    private final static QName _ReadDownloadDocumentoRispostaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "readDownloadDocumentoRispostaTipo");
    private final static QName _QueryDatiFatturaRichiestaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "queryDatiFatturaRichiestaTipo");
    private final static QName _ProxyPagamentoIvaRichiestaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "proxyPagamentoIvaRichiestaTipo");
    private final static QName _ProxyInserimentoFatturaRichiestaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "proxyInserimentoFatturaRichiestaTipo");
    private final static QName _QueryPagamentoIvaRichiestaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "queryPagamentoIvaRichiestaTipo");
    private final static QName _ReadDownloadDocumentoRichiestaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "readDownloadDocumentoRichiestaTipo");
    private final static QName _ReadStatoFatturaRispostaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "readStatoFatturaRispostaTipo");
    private final static QName _TestWsRispostaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "testWsRispostaTipo");
    private final static QName _ReadStatoFatturaRichiestaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "readStatoFatturaRichiestaTipo");
    private final static QName _QueryDatiFatturaRispostaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "queryDatiFatturaRispostaTipo");
    private final static QName _QueryInserimentoFatturaRichiestaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "queryInserimentoFatturaRichiestaTipo");
    private final static QName _QueryInterrogazioneEsitiRispostaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "queryInterrogazioneEsitiRispostaTipo");
    private final static QName _ReadElencoMovimentiErarioIvaRichiestaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "readElencoMovimentiErarioIvaRichiestaTipo");
    private final static QName _QueryDatiFattureRichiestaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "queryDatiFattureRichiestaTipo");
    private final static QName _ProxyRispostaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "proxyRispostaTipo");
    private final static QName _ProxyOperazioneContabileRichiestaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "proxyOperazioneContabileRichiestaTipo");
    private final static QName _ProxyDatiFattureRichiestaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "proxyDatiFattureRichiestaTipo");
    private final static QName _QueryOperazioneContabileRispostaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "queryOperazioneContabileRispostaTipo");
    private final static QName _QueryDatiFattureRispostaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "queryDatiFattureRispostaTipo");
    private final static QName _QueryInterrogazioneEsitiRichiestaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "queryInterrogazioneEsitiRichiestaTipo");
    private final static QName _QueryInserimentoFatturaRispostaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "queryInserimentoFatturaRispostaTipo");
    private final static QName _QueryOperazioneContabileRichiestaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "queryOperazioneContabileRichiestaTipo");
    private final static QName _QueryPagamentoIvaRispostaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "queryPagamentoIvaRispostaTipo");
    private final static QName _ProxyDatiFatturaRichiestaTipo_QNAME = new QName("http://www.tesoro.it/fatture", "proxyDatiFatturaRichiestaTipo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.tesoro.fatture
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StrutturaDatiOperazioneTipo }
     * 
     */
    public StrutturaDatiOperazioneTipo createStrutturaDatiOperazioneTipo() {
        return new StrutturaDatiOperazioneTipo();
    }

    /**
     * Create an instance of {@link TestataTransazioneTipo }
     * 
     */
    public TestataTransazioneTipo createTestataTransazioneTipo() {
        return new TestataTransazioneTipo();
    }

    /**
     * Create an instance of {@link DettaglioMovimentoErarioTipo }
     * 
     */
    public DettaglioMovimentoErarioTipo createDettaglioMovimentoErarioTipo() {
        return new DettaglioMovimentoErarioTipo();
    }

    /**
     * Create an instance of {@link DatiRichiestaOperazioneContabileProxyTipo }
     * 
     */
    public DatiRichiestaOperazioneContabileProxyTipo createDatiRichiestaOperazioneContabileProxyTipo() {
        return new DatiRichiestaOperazioneContabileProxyTipo();
    }

    /**
     * Create an instance of {@link IntervalloDateFatturaTipo }
     * 
     */
    public IntervalloDateFatturaTipo createIntervalloDateFatturaTipo() {
        return new IntervalloDateFatturaTipo();
    }

    /**
     * Create an instance of {@link TestataAsyncTipo }
     * 
     */
    public TestataAsyncTipo createTestataAsyncTipo() {
        return new TestataAsyncTipo();
    }

    /**
     * Create an instance of {@link ContabilizzazioneTipo }
     * 
     */
    public ContabilizzazioneTipo createContabilizzazioneTipo() {
        return new ContabilizzazioneTipo();
    }

    /**
     * Create an instance of {@link DettaglioDocumentoReadTipo }
     * 
     */
    public DettaglioDocumentoReadTipo createDettaglioDocumentoReadTipo() {
        return new DettaglioDocumentoReadTipo();
    }

    /**
     * Create an instance of {@link TestataBaseTipo }
     * 
     */
    public TestataBaseTipo createTestataBaseTipo() {
        return new TestataBaseTipo();
    }

    /**
     * Create an instance of {@link DettaglioPagamentoTipo }
     * 
     */
    public DettaglioPagamentoTipo createDettaglioPagamentoTipo() {
        return new DettaglioPagamentoTipo();
    }

    /**
     * Create an instance of {@link DatiGeneraliFatturaTipo }
     * 
     */
    public DatiGeneraliFatturaTipo createDatiGeneraliFatturaTipo() {
        return new DatiGeneraliFatturaTipo();
    }

    /**
     * Create an instance of {@link QueryOperazioneContabileRispostaTipo }
     * 
     */
    public QueryOperazioneContabileRispostaTipo createQueryOperazioneContabileRispostaTipo() {
        return new QueryOperazioneContabileRispostaTipo();
    }

    /**
     * Create an instance of {@link ReadElencoMovimentiErarioIvaRispostaTipo }
     * 
     */
    public ReadElencoMovimentiErarioIvaRispostaTipo createReadElencoMovimentiErarioIvaRispostaTipo() {
        return new ReadElencoMovimentiErarioIvaRispostaTipo();
    }

    /**
     * Create an instance of {@link DatiRichiestaDatiFatturaProxyTipo }
     * 
     */
    public DatiRichiestaDatiFatturaProxyTipo createDatiRichiestaDatiFatturaProxyTipo() {
        return new DatiRichiestaDatiFatturaProxyTipo();
    }

    /**
     * Create an instance of {@link ListaPagamentoStornoIvaTipo }
     * 
     */
    public ListaPagamentoStornoIvaTipo createListaPagamentoStornoIvaTipo() {
        return new ListaPagamentoStornoIvaTipo();
    }

    /**
     * Create an instance of {@link QueryDatiFattureRichiestaTipo }
     * 
     */
    public QueryDatiFattureRichiestaTipo createQueryDatiFattureRichiestaTipo() {
        return new QueryDatiFattureRichiestaTipo();
    }

    /**
     * Create an instance of {@link DatiDistintaTrasmissioneTipo }
     * 
     */
    public DatiDistintaTrasmissioneTipo createDatiDistintaTrasmissioneTipo() {
        return new DatiDistintaTrasmissioneTipo();
    }

    /**
     * Create an instance of {@link ListaEsitoTipo }
     * 
     */
    public ListaEsitoTipo createListaEsitoTipo() {
        return new ListaEsitoTipo();
    }

    /**
     * Create an instance of {@link QueryDatiFatturaRispostaTipo }
     * 
     */
    public QueryDatiFatturaRispostaTipo createQueryDatiFatturaRispostaTipo() {
        return new QueryDatiFatturaRispostaTipo();
    }

    /**
     * Create an instance of {@link QueryPagamentoIvaRispostaTipo }
     * 
     */
    public QueryPagamentoIvaRispostaTipo createQueryPagamentoIvaRispostaTipo() {
        return new QueryPagamentoIvaRispostaTipo();
    }

    /**
     * Create an instance of {@link MandatoPagamentoTipo }
     * 
     */
    public MandatoPagamentoTipo createMandatoPagamentoTipo() {
        return new MandatoPagamentoTipo();
    }

    /**
     * Create an instance of {@link DistribuzioneCupCigTipo }
     * 
     */
    public DistribuzioneCupCigTipo createDistribuzioneCupCigTipo() {
        return new DistribuzioneCupCigTipo();
    }

    /**
     * Create an instance of {@link PaginazioneTipo }
     * 
     */
    public PaginazioneTipo createPaginazioneTipo() {
        return new PaginazioneTipo();
    }

    /**
     * Create an instance of {@link ListaDettaglioFatturaTipo }
     * 
     */
    public ListaDettaglioFatturaTipo createListaDettaglioFatturaTipo() {
        return new ListaDettaglioFatturaTipo();
    }

    /**
     * Create an instance of {@link DatiPagamentoTipo }
     * 
     */
    public DatiPagamentoTipo createDatiPagamentoTipo() {
        return new DatiPagamentoTipo();
    }

    /**
     * Create an instance of {@link ComunicazioneScadenzaTipo }
     * 
     */
    public ComunicazioneScadenzaTipo createComunicazioneScadenzaTipo() {
        return new ComunicazioneScadenzaTipo();
    }

    /**
     * Create an instance of {@link ListaErroreElaborazioneOperazioneTipo }
     * 
     */
    public ListaErroreElaborazioneOperazioneTipo createListaErroreElaborazioneOperazioneTipo() {
        return new ListaErroreElaborazioneOperazioneTipo();
    }

    /**
     * Create an instance of {@link IntervalloDateTipo }
     * 
     */
    public IntervalloDateTipo createIntervalloDateTipo() {
        return new IntervalloDateTipo();
    }

    /**
     * Create an instance of {@link ProxyDatiFattureRichiestaTipo }
     * 
     */
    public ProxyDatiFattureRichiestaTipo createProxyDatiFattureRichiestaTipo() {
        return new ProxyDatiFattureRichiestaTipo();
    }

    /**
     * Create an instance of {@link QueryInterrogazioneEsitiRichiestaTipo }
     * 
     */
    public QueryInterrogazioneEsitiRichiestaTipo createQueryInterrogazioneEsitiRichiestaTipo() {
        return new QueryInterrogazioneEsitiRichiestaTipo();
    }

    /**
     * Create an instance of {@link ProxyPagamentoIvaRichiestaTipo }
     * 
     */
    public ProxyPagamentoIvaRichiestaTipo createProxyPagamentoIvaRichiestaTipo() {
        return new ProxyPagamentoIvaRichiestaTipo();
    }

    /**
     * Create an instance of {@link ProxyRispostaTipo }
     * 
     */
    public ProxyRispostaTipo createProxyRispostaTipo() {
        return new ProxyRispostaTipo();
    }

    /**
     * Create an instance of {@link ListaIdentificativoTransazionePCCTipo }
     * 
     */
    public ListaIdentificativoTransazionePCCTipo createListaIdentificativoTransazionePCCTipo() {
        return new ListaIdentificativoTransazionePCCTipo();
    }

    /**
     * Create an instance of {@link DatiRispostaProxyTipo }
     * 
     */
    public DatiRispostaProxyTipo createDatiRispostaProxyTipo() {
        return new DatiRispostaProxyTipo();
    }

    /**
     * Create an instance of {@link DatiRichiestaPagamentoIvaProxyTipo }
     * 
     */
    public DatiRichiestaPagamentoIvaProxyTipo createDatiRichiestaPagamentoIvaProxyTipo() {
        return new DatiRichiestaPagamentoIvaProxyTipo();
    }

    /**
     * Create an instance of {@link QueryDatiFatturaRichiestaTipo }
     * 
     */
    public QueryDatiFatturaRichiestaTipo createQueryDatiFatturaRichiestaTipo() {
        return new QueryDatiFatturaRichiestaTipo();
    }

    /**
     * Create an instance of {@link DatiRispostaDownloadDocumentoReadTipo }
     * 
     */
    public DatiRispostaDownloadDocumentoReadTipo createDatiRispostaDownloadDocumentoReadTipo() {
        return new DatiRispostaDownloadDocumentoReadTipo();
    }

    /**
     * Create an instance of {@link FiltroInterrogazioneTipo }
     * 
     */
    public FiltroInterrogazioneTipo createFiltroInterrogazioneTipo() {
        return new FiltroInterrogazioneTipo();
    }

    /**
     * Create an instance of {@link ReadDownloadDocumentoRichiestaTipo }
     * 
     */
    public ReadDownloadDocumentoRichiestaTipo createReadDownloadDocumentoRichiestaTipo() {
        return new ReadDownloadDocumentoRichiestaTipo();
    }

    /**
     * Create an instance of {@link ProxyDatiFatturaRichiestaTipo }
     * 
     */
    public ProxyDatiFatturaRichiestaTipo createProxyDatiFatturaRichiestaTipo() {
        return new ProxyDatiFatturaRichiestaTipo();
    }

    /**
     * Create an instance of {@link QueryInserimentoFatturaRichiestaTipo }
     * 
     */
    public QueryInserimentoFatturaRichiestaTipo createQueryInserimentoFatturaRichiestaTipo() {
        return new QueryInserimentoFatturaRichiestaTipo();
    }

    /**
     * Create an instance of {@link DatiRispostaOperazioneContabileQueryTipo }
     * 
     */
    public DatiRispostaOperazioneContabileQueryTipo createDatiRispostaOperazioneContabileQueryTipo() {
        return new DatiRispostaOperazioneContabileQueryTipo();
    }

    /**
     * Create an instance of {@link QueryInterrogazioneEsitiRispostaTipo }
     * 
     */
    public QueryInterrogazioneEsitiRispostaTipo createQueryInterrogazioneEsitiRispostaTipo() {
        return new QueryInterrogazioneEsitiRispostaTipo();
    }

    /**
     * Create an instance of {@link DettaglioMovimentoTipo }
     * 
     */
    public DettaglioMovimentoTipo createDettaglioMovimentoTipo() {
        return new DettaglioMovimentoTipo();
    }

    /**
     * Create an instance of {@link IntervalloDateMovErarioIvaTipo }
     * 
     */
    public IntervalloDateMovErarioIvaTipo createIntervalloDateMovErarioIvaTipo() {
        return new IntervalloDateMovErarioIvaTipo();
    }

    /**
     * Create an instance of {@link ListaDettaglioMovimentoTipo }
     * 
     */
    public ListaDettaglioMovimentoTipo createListaDettaglioMovimentoTipo() {
        return new ListaDettaglioMovimentoTipo();
    }

    /**
     * Create an instance of {@link ReadStatoFatturaRichiestaTipo }
     * 
     */
    public ReadStatoFatturaRichiestaTipo createReadStatoFatturaRichiestaTipo() {
        return new ReadStatoFatturaRichiestaTipo();
    }

    /**
     * Create an instance of {@link PagamentoTipo }
     * 
     */
    public PagamentoTipo createPagamentoTipo() {
        return new PagamentoTipo();
    }

    /**
     * Create an instance of {@link EsitoElabTransazTipo }
     * 
     */
    public EsitoElabTransazTipo createEsitoElabTransazTipo() {
        return new EsitoElabTransazTipo();
    }

    /**
     * Create an instance of {@link RipartizioneAttualeTipo }
     * 
     */
    public RipartizioneAttualeTipo createRipartizioneAttualeTipo() {
        return new RipartizioneAttualeTipo();
    }

    /**
     * Create an instance of {@link DatiCessionarioTipo }
     * 
     */
    public DatiCessionarioTipo createDatiCessionarioTipo() {
        return new DatiCessionarioTipo();
    }

    /**
     * Create an instance of {@link DatiAmministrazioneInsFattTipo }
     * 
     */
    public DatiAmministrazioneInsFattTipo createDatiAmministrazioneInsFattTipo() {
        return new DatiAmministrazioneInsFattTipo();
    }

    /**
     * Create an instance of {@link PianoComunicazioneScadenzaTipo }
     * 
     */
    public PianoComunicazioneScadenzaTipo createPianoComunicazioneScadenzaTipo() {
        return new PianoComunicazioneScadenzaTipo();
    }

    /**
     * Create an instance of {@link ErroreTipo }
     * 
     */
    public ErroreTipo createErroreTipo() {
        return new ErroreTipo();
    }

    /**
     * Create an instance of {@link ProxyOperazioneContabileRichiestaTipo }
     * 
     */
    public ProxyOperazioneContabileRichiestaTipo createProxyOperazioneContabileRichiestaTipo() {
        return new ProxyOperazioneContabileRichiestaTipo();
    }

    /**
     * Create an instance of {@link ErroreElaborazioneOperazioneTipo }
     * 
     */
    public ErroreElaborazioneOperazioneTipo createErroreElaborazioneOperazioneTipo() {
        return new ErroreElaborazioneOperazioneTipo();
    }

    /**
     * Create an instance of {@link Allegato }
     * 
     */
    public Allegato createAllegato() {
        return new Allegato();
    }

    /**
     * Create an instance of {@link DatiRispostaDatiFatturaQueryTipo }
     * 
     */
    public DatiRispostaDatiFatturaQueryTipo createDatiRispostaDatiFatturaQueryTipo() {
        return new DatiRispostaDatiFatturaQueryTipo();
    }

    /**
     * Create an instance of {@link IdentificativoTransazioneTipo }
     * 
     */
    public IdentificativoTransazioneTipo createIdentificativoTransazioneTipo() {
        return new IdentificativoTransazioneTipo();
    }

    /**
     * Create an instance of {@link RicezioneFatturaTipo }
     * 
     */
    public RicezioneFatturaTipo createRicezioneFatturaTipo() {
        return new RicezioneFatturaTipo();
    }

    /**
     * Create an instance of {@link ListaRiepilogoAliquoteTipo }
     * 
     */
    public ListaRiepilogoAliquoteTipo createListaRiepilogoAliquoteTipo() {
        return new ListaRiepilogoAliquoteTipo();
    }

    /**
     * Create an instance of {@link EsitoTipo }
     * 
     */
    public EsitoTipo createEsitoTipo() {
        return new EsitoTipo();
    }

    /**
     * Create an instance of {@link ReadStatoFatturaRispostaTipo }
     * 
     */
    public ReadStatoFatturaRispostaTipo createReadStatoFatturaRispostaTipo() {
        return new ReadStatoFatturaRispostaTipo();
    }

    /**
     * Create an instance of {@link DatiAmministrazioneTipo }
     * 
     */
    public DatiAmministrazioneTipo createDatiAmministrazioneTipo() {
        return new DatiAmministrazioneTipo();
    }

    /**
     * Create an instance of {@link DatiRichiestaDatiFattureProxyTipo }
     * 
     */
    public DatiRichiestaDatiFattureProxyTipo createDatiRichiestaDatiFattureProxyTipo() {
        return new DatiRichiestaDatiFattureProxyTipo();
    }

    /**
     * Create an instance of {@link DettaglioDocumentoTipo }
     * 
     */
    public DettaglioDocumentoTipo createDettaglioDocumentoTipo() {
        return new DettaglioDocumentoTipo();
    }

    /**
     * Create an instance of {@link PagamentoStornoIvaTipo }
     * 
     */
    public PagamentoStornoIvaTipo createPagamentoStornoIvaTipo() {
        return new PagamentoStornoIvaTipo();
    }

    /**
     * Create an instance of {@link ListaErroreTipo }
     * 
     */
    public ListaErroreTipo createListaErroreTipo() {
        return new ListaErroreTipo();
    }

    /**
     * Create an instance of {@link DatiRichiestaInserimentoFatturaProxyTipo }
     * 
     */
    public DatiRichiestaInserimentoFatturaProxyTipo createDatiRichiestaInserimentoFatturaProxyTipo() {
        return new DatiRichiestaInserimentoFatturaProxyTipo();
    }

    /**
     * Create an instance of {@link DettaglioFatturaTipo }
     * 
     */
    public DettaglioFatturaTipo createDettaglioFatturaTipo() {
        return new DettaglioFatturaTipo();
    }

    /**
     * Create an instance of {@link OperazioneContabilizzazioneTipo }
     * 
     */
    public OperazioneContabilizzazioneTipo createOperazioneContabilizzazioneTipo() {
        return new OperazioneContabilizzazioneTipo();
    }

    /**
     * Create an instance of {@link IdentificazioneGeneraleTipo }
     * 
     */
    public IdentificazioneGeneraleTipo createIdentificazioneGeneraleTipo() {
        return new IdentificazioneGeneraleTipo();
    }

    /**
     * Create an instance of {@link DatiRichiestaDownloadDocumentoReadTipo }
     * 
     */
    public DatiRichiestaDownloadDocumentoReadTipo createDatiRichiestaDownloadDocumentoReadTipo() {
        return new DatiRichiestaDownloadDocumentoReadTipo();
    }

    /**
     * Create an instance of {@link ReadElencoMovimentiErarioIvaRichiestaTipo }
     * 
     */
    public ReadElencoMovimentiErarioIvaRichiestaTipo createReadElencoMovimentiErarioIvaRichiestaTipo() {
        return new ReadElencoMovimentiErarioIvaRichiestaTipo();
    }

    /**
     * Create an instance of {@link RiepilogoAliquoteTipo }
     * 
     */
    public RiepilogoAliquoteTipo createRiepilogoAliquoteTipo() {
        return new RiepilogoAliquoteTipo();
    }

    /**
     * Create an instance of {@link CertificazioneTipo }
     * 
     */
    public CertificazioneTipo createCertificazioneTipo() {
        return new CertificazioneTipo();
    }

    /**
     * Create an instance of {@link DatiRichiestaElencoMovimentiErarioReadTipo }
     * 
     */
    public DatiRichiestaElencoMovimentiErarioReadTipo createDatiRichiestaElencoMovimentiErarioReadTipo() {
        return new DatiRichiestaElencoMovimentiErarioReadTipo();
    }

    /**
     * Create an instance of {@link ListaCertificazioneTipo }
     * 
     */
    public ListaCertificazioneTipo createListaCertificazioneTipo() {
        return new ListaCertificazioneTipo();
    }

    /**
     * Create an instance of {@link ListaOperazioneTipo }
     * 
     */
    public ListaOperazioneTipo createListaOperazioneTipo() {
        return new ListaOperazioneTipo();
    }

    /**
     * Create an instance of {@link QueryInserimentoFatturaRispostaTipo }
     * 
     */
    public QueryInserimentoFatturaRispostaTipo createQueryInserimentoFatturaRispostaTipo() {
        return new QueryInserimentoFatturaRispostaTipo();
    }

    /**
     * Create an instance of {@link QueryDatiFattureRispostaTipo }
     * 
     */
    public QueryDatiFattureRispostaTipo createQueryDatiFattureRispostaTipo() {
        return new QueryDatiFattureRispostaTipo();
    }

    /**
     * Create an instance of {@link ListaDettagliPagamentoTipo }
     * 
     */
    public ListaDettagliPagamentoTipo createListaDettagliPagamentoTipo() {
        return new ListaDettagliPagamentoTipo();
    }

    /**
     * Create an instance of {@link StatoContabileFatturaTipo }
     * 
     */
    public StatoContabileFatturaTipo createStatoContabileFatturaTipo() {
        return new StatoContabileFatturaTipo();
    }

    /**
     * Create an instance of {@link PagamentoIVATipo }
     * 
     */
    public PagamentoIVATipo createPagamentoIVATipo() {
        return new PagamentoIVATipo();
    }

    /**
     * Create an instance of {@link DatiFornitoreInsFattTipo }
     * 
     */
    public DatiFornitoreInsFattTipo createDatiFornitoreInsFattTipo() {
        return new DatiFornitoreInsFattTipo();
    }

    /**
     * Create an instance of {@link DatiRispostaInterrogazioneEsitiQueryTipo }
     * 
     */
    public DatiRispostaInterrogazioneEsitiQueryTipo createDatiRispostaInterrogazioneEsitiQueryTipo() {
        return new DatiRispostaInterrogazioneEsitiQueryTipo();
    }

    /**
     * Create an instance of {@link DatiRispostaStatoFatturaReadTipo }
     * 
     */
    public DatiRispostaStatoFatturaReadTipo createDatiRispostaStatoFatturaReadTipo() {
        return new DatiRispostaStatoFatturaReadTipo();
    }

    /**
     * Create an instance of {@link DatiRispostaElencoMovimentiErarioReadTipo }
     * 
     */
    public DatiRispostaElencoMovimentiErarioReadTipo createDatiRispostaElencoMovimentiErarioReadTipo() {
        return new DatiRispostaElencoMovimentiErarioReadTipo();
    }

    /**
     * Create an instance of {@link ListaPianoComunicazioneScadenzaTipo }
     * 
     */
    public ListaPianoComunicazioneScadenzaTipo createListaPianoComunicazioneScadenzaTipo() {
        return new ListaPianoComunicazioneScadenzaTipo();
    }

    /**
     * Create an instance of {@link ListaContabilizzazioneTipo }
     * 
     */
    public ListaContabilizzazioneTipo createListaContabilizzazioneTipo() {
        return new ListaContabilizzazioneTipo();
    }

    /**
     * Create an instance of {@link ReadDownloadDocumentoRispostaTipo }
     * 
     */
    public ReadDownloadDocumentoRispostaTipo createReadDownloadDocumentoRispostaTipo() {
        return new ReadDownloadDocumentoRispostaTipo();
    }

    /**
     * Create an instance of {@link DatiFornitoreTipo }
     * 
     */
    public DatiFornitoreTipo createDatiFornitoreTipo() {
        return new DatiFornitoreTipo();
    }

    /**
     * Create an instance of {@link DatiRispostaDatiFattureQueryTipo }
     * 
     */
    public DatiRispostaDatiFattureQueryTipo createDatiRispostaDatiFattureQueryTipo() {
        return new DatiRispostaDatiFattureQueryTipo();
    }

    /**
     * Create an instance of {@link EsitoBaseTipo }
     * 
     */
    public EsitoBaseTipo createEsitoBaseTipo() {
        return new EsitoBaseTipo();
    }

    /**
     * Create an instance of {@link DettagliPagamentoTipo }
     * 
     */
    public DettagliPagamentoTipo createDettagliPagamentoTipo() {
        return new DettagliPagamentoTipo();
    }

    /**
     * Create an instance of {@link IdentificazioneSDITipo }
     * 
     */
    public IdentificazioneSDITipo createIdentificazioneSDITipo() {
        return new IdentificazioneSDITipo();
    }

    /**
     * Create an instance of {@link QueryOperazioneContabileRichiestaTipo }
     * 
     */
    public QueryOperazioneContabileRichiestaTipo createQueryOperazioneContabileRichiestaTipo() {
        return new QueryOperazioneContabileRichiestaTipo();
    }

    /**
     * Create an instance of {@link ListaIdentificativoTransazioneTipo }
     * 
     */
    public ListaIdentificativoTransazioneTipo createListaIdentificativoTransazioneTipo() {
        return new ListaIdentificativoTransazioneTipo();
    }

    /**
     * Create an instance of {@link ListaDistribuzioneCupCigTipo }
     * 
     */
    public ListaDistribuzioneCupCigTipo createListaDistribuzioneCupCigTipo() {
        return new ListaDistribuzioneCupCigTipo();
    }

    /**
     * Create an instance of {@link ListaDettaglioPagamentoTipo }
     * 
     */
    public ListaDettaglioPagamentoTipo createListaDettaglioPagamentoTipo() {
        return new ListaDettaglioPagamentoTipo();
    }

    /**
     * Create an instance of {@link TestataQueryTipo }
     * 
     */
    public TestataQueryTipo createTestataQueryTipo() {
        return new TestataQueryTipo();
    }

    /**
     * Create an instance of {@link RifiutoFatturaTipo }
     * 
     */
    public RifiutoFatturaTipo createRifiutoFatturaTipo() {
        return new RifiutoFatturaTipo();
    }

    /**
     * Create an instance of {@link DatiRispostaInserimentoFatturaQueryTipo }
     * 
     */
    public DatiRispostaInserimentoFatturaQueryTipo createDatiRispostaInserimentoFatturaQueryTipo() {
        return new DatiRispostaInserimentoFatturaQueryTipo();
    }

    /**
     * Create an instance of {@link DatiRichiestaInterrogazioneEsitiQueryTipo }
     * 
     */
    public DatiRichiestaInterrogazioneEsitiQueryTipo createDatiRichiestaInterrogazioneEsitiQueryTipo() {
        return new DatiRichiestaInterrogazioneEsitiQueryTipo();
    }

    /**
     * Create an instance of {@link PagamentoStornoTipo }
     * 
     */
    public PagamentoStornoTipo createPagamentoStornoTipo() {
        return new PagamentoStornoTipo();
    }

    /**
     * Create an instance of {@link StornoPagamentoIVATipo }
     * 
     */
    public StornoPagamentoIVATipo createStornoPagamentoIVATipo() {
        return new StornoPagamentoIVATipo();
    }

    /**
     * Create an instance of {@link ListaUrlTipo }
     * 
     */
    public ListaUrlTipo createListaUrlTipo() {
        return new ListaUrlTipo();
    }

    /**
     * Create an instance of {@link EsitoFineElabTipo }
     * 
     */
    public EsitoFineElabTipo createEsitoFineElabTipo() {
        return new EsitoFineElabTipo();
    }

    /**
     * Create an instance of {@link OperazioneTipo }
     * 
     */
    public OperazioneTipo createOperazioneTipo() {
        return new OperazioneTipo();
    }

    /**
     * Create an instance of {@link ProxyInserimentoFatturaRichiestaTipo }
     * 
     */
    public ProxyInserimentoFatturaRichiestaTipo createProxyInserimentoFatturaRichiestaTipo() {
        return new ProxyInserimentoFatturaRichiestaTipo();
    }

    /**
     * Create an instance of {@link QueryPagamentoIvaRichiestaTipo }
     * 
     */
    public QueryPagamentoIvaRichiestaTipo createQueryPagamentoIvaRichiestaTipo() {
        return new QueryPagamentoIvaRichiestaTipo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadElencoMovimentiErarioIvaRispostaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "readElencoMovimentiErarioIvaRispostaTipo")
    public JAXBElement<ReadElencoMovimentiErarioIvaRispostaTipo> createReadElencoMovimentiErarioIvaRispostaTipo(ReadElencoMovimentiErarioIvaRispostaTipo value) {
        return new JAXBElement<ReadElencoMovimentiErarioIvaRispostaTipo>(_ReadElencoMovimentiErarioIvaRispostaTipo_QNAME, ReadElencoMovimentiErarioIvaRispostaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDownloadDocumentoRispostaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "readDownloadDocumentoRispostaTipo")
    public JAXBElement<ReadDownloadDocumentoRispostaTipo> createReadDownloadDocumentoRispostaTipo(ReadDownloadDocumentoRispostaTipo value) {
        return new JAXBElement<ReadDownloadDocumentoRispostaTipo>(_ReadDownloadDocumentoRispostaTipo_QNAME, ReadDownloadDocumentoRispostaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDatiFatturaRichiestaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "queryDatiFatturaRichiestaTipo")
    public JAXBElement<QueryDatiFatturaRichiestaTipo> createQueryDatiFatturaRichiestaTipo(QueryDatiFatturaRichiestaTipo value) {
        return new JAXBElement<QueryDatiFatturaRichiestaTipo>(_QueryDatiFatturaRichiestaTipo_QNAME, QueryDatiFatturaRichiestaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProxyPagamentoIvaRichiestaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "proxyPagamentoIvaRichiestaTipo")
    public JAXBElement<ProxyPagamentoIvaRichiestaTipo> createProxyPagamentoIvaRichiestaTipo(ProxyPagamentoIvaRichiestaTipo value) {
        return new JAXBElement<ProxyPagamentoIvaRichiestaTipo>(_ProxyPagamentoIvaRichiestaTipo_QNAME, ProxyPagamentoIvaRichiestaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProxyInserimentoFatturaRichiestaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "proxyInserimentoFatturaRichiestaTipo")
    public JAXBElement<ProxyInserimentoFatturaRichiestaTipo> createProxyInserimentoFatturaRichiestaTipo(ProxyInserimentoFatturaRichiestaTipo value) {
        return new JAXBElement<ProxyInserimentoFatturaRichiestaTipo>(_ProxyInserimentoFatturaRichiestaTipo_QNAME, ProxyInserimentoFatturaRichiestaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPagamentoIvaRichiestaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "queryPagamentoIvaRichiestaTipo")
    public JAXBElement<QueryPagamentoIvaRichiestaTipo> createQueryPagamentoIvaRichiestaTipo(QueryPagamentoIvaRichiestaTipo value) {
        return new JAXBElement<QueryPagamentoIvaRichiestaTipo>(_QueryPagamentoIvaRichiestaTipo_QNAME, QueryPagamentoIvaRichiestaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDownloadDocumentoRichiestaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "readDownloadDocumentoRichiestaTipo")
    public JAXBElement<ReadDownloadDocumentoRichiestaTipo> createReadDownloadDocumentoRichiestaTipo(ReadDownloadDocumentoRichiestaTipo value) {
        return new JAXBElement<ReadDownloadDocumentoRichiestaTipo>(_ReadDownloadDocumentoRichiestaTipo_QNAME, ReadDownloadDocumentoRichiestaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadStatoFatturaRispostaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "readStatoFatturaRispostaTipo")
    public JAXBElement<ReadStatoFatturaRispostaTipo> createReadStatoFatturaRispostaTipo(ReadStatoFatturaRispostaTipo value) {
        return new JAXBElement<ReadStatoFatturaRispostaTipo>(_ReadStatoFatturaRispostaTipo_QNAME, ReadStatoFatturaRispostaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "testWsRispostaTipo")
    public JAXBElement<String> createTestWsRispostaTipo(String value) {
        return new JAXBElement<String>(_TestWsRispostaTipo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadStatoFatturaRichiestaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "readStatoFatturaRichiestaTipo")
    public JAXBElement<ReadStatoFatturaRichiestaTipo> createReadStatoFatturaRichiestaTipo(ReadStatoFatturaRichiestaTipo value) {
        return new JAXBElement<ReadStatoFatturaRichiestaTipo>(_ReadStatoFatturaRichiestaTipo_QNAME, ReadStatoFatturaRichiestaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDatiFatturaRispostaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "queryDatiFatturaRispostaTipo")
    public JAXBElement<QueryDatiFatturaRispostaTipo> createQueryDatiFatturaRispostaTipo(QueryDatiFatturaRispostaTipo value) {
        return new JAXBElement<QueryDatiFatturaRispostaTipo>(_QueryDatiFatturaRispostaTipo_QNAME, QueryDatiFatturaRispostaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryInserimentoFatturaRichiestaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "queryInserimentoFatturaRichiestaTipo")
    public JAXBElement<QueryInserimentoFatturaRichiestaTipo> createQueryInserimentoFatturaRichiestaTipo(QueryInserimentoFatturaRichiestaTipo value) {
        return new JAXBElement<QueryInserimentoFatturaRichiestaTipo>(_QueryInserimentoFatturaRichiestaTipo_QNAME, QueryInserimentoFatturaRichiestaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryInterrogazioneEsitiRispostaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "queryInterrogazioneEsitiRispostaTipo")
    public JAXBElement<QueryInterrogazioneEsitiRispostaTipo> createQueryInterrogazioneEsitiRispostaTipo(QueryInterrogazioneEsitiRispostaTipo value) {
        return new JAXBElement<QueryInterrogazioneEsitiRispostaTipo>(_QueryInterrogazioneEsitiRispostaTipo_QNAME, QueryInterrogazioneEsitiRispostaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadElencoMovimentiErarioIvaRichiestaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "readElencoMovimentiErarioIvaRichiestaTipo")
    public JAXBElement<ReadElencoMovimentiErarioIvaRichiestaTipo> createReadElencoMovimentiErarioIvaRichiestaTipo(ReadElencoMovimentiErarioIvaRichiestaTipo value) {
        return new JAXBElement<ReadElencoMovimentiErarioIvaRichiestaTipo>(_ReadElencoMovimentiErarioIvaRichiestaTipo_QNAME, ReadElencoMovimentiErarioIvaRichiestaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDatiFattureRichiestaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "queryDatiFattureRichiestaTipo")
    public JAXBElement<QueryDatiFattureRichiestaTipo> createQueryDatiFattureRichiestaTipo(QueryDatiFattureRichiestaTipo value) {
        return new JAXBElement<QueryDatiFattureRichiestaTipo>(_QueryDatiFattureRichiestaTipo_QNAME, QueryDatiFattureRichiestaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProxyRispostaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "proxyRispostaTipo")
    public JAXBElement<ProxyRispostaTipo> createProxyRispostaTipo(ProxyRispostaTipo value) {
        return new JAXBElement<ProxyRispostaTipo>(_ProxyRispostaTipo_QNAME, ProxyRispostaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProxyOperazioneContabileRichiestaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "proxyOperazioneContabileRichiestaTipo")
    public JAXBElement<ProxyOperazioneContabileRichiestaTipo> createProxyOperazioneContabileRichiestaTipo(ProxyOperazioneContabileRichiestaTipo value) {
        return new JAXBElement<ProxyOperazioneContabileRichiestaTipo>(_ProxyOperazioneContabileRichiestaTipo_QNAME, ProxyOperazioneContabileRichiestaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProxyDatiFattureRichiestaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "proxyDatiFattureRichiestaTipo")
    public JAXBElement<ProxyDatiFattureRichiestaTipo> createProxyDatiFattureRichiestaTipo(ProxyDatiFattureRichiestaTipo value) {
        return new JAXBElement<ProxyDatiFattureRichiestaTipo>(_ProxyDatiFattureRichiestaTipo_QNAME, ProxyDatiFattureRichiestaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOperazioneContabileRispostaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "queryOperazioneContabileRispostaTipo")
    public JAXBElement<QueryOperazioneContabileRispostaTipo> createQueryOperazioneContabileRispostaTipo(QueryOperazioneContabileRispostaTipo value) {
        return new JAXBElement<QueryOperazioneContabileRispostaTipo>(_QueryOperazioneContabileRispostaTipo_QNAME, QueryOperazioneContabileRispostaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDatiFattureRispostaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "queryDatiFattureRispostaTipo")
    public JAXBElement<QueryDatiFattureRispostaTipo> createQueryDatiFattureRispostaTipo(QueryDatiFattureRispostaTipo value) {
        return new JAXBElement<QueryDatiFattureRispostaTipo>(_QueryDatiFattureRispostaTipo_QNAME, QueryDatiFattureRispostaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryInterrogazioneEsitiRichiestaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "queryInterrogazioneEsitiRichiestaTipo")
    public JAXBElement<QueryInterrogazioneEsitiRichiestaTipo> createQueryInterrogazioneEsitiRichiestaTipo(QueryInterrogazioneEsitiRichiestaTipo value) {
        return new JAXBElement<QueryInterrogazioneEsitiRichiestaTipo>(_QueryInterrogazioneEsitiRichiestaTipo_QNAME, QueryInterrogazioneEsitiRichiestaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryInserimentoFatturaRispostaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "queryInserimentoFatturaRispostaTipo")
    public JAXBElement<QueryInserimentoFatturaRispostaTipo> createQueryInserimentoFatturaRispostaTipo(QueryInserimentoFatturaRispostaTipo value) {
        return new JAXBElement<QueryInserimentoFatturaRispostaTipo>(_QueryInserimentoFatturaRispostaTipo_QNAME, QueryInserimentoFatturaRispostaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOperazioneContabileRichiestaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "queryOperazioneContabileRichiestaTipo")
    public JAXBElement<QueryOperazioneContabileRichiestaTipo> createQueryOperazioneContabileRichiestaTipo(QueryOperazioneContabileRichiestaTipo value) {
        return new JAXBElement<QueryOperazioneContabileRichiestaTipo>(_QueryOperazioneContabileRichiestaTipo_QNAME, QueryOperazioneContabileRichiestaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPagamentoIvaRispostaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "queryPagamentoIvaRispostaTipo")
    public JAXBElement<QueryPagamentoIvaRispostaTipo> createQueryPagamentoIvaRispostaTipo(QueryPagamentoIvaRispostaTipo value) {
        return new JAXBElement<QueryPagamentoIvaRispostaTipo>(_QueryPagamentoIvaRispostaTipo_QNAME, QueryPagamentoIvaRispostaTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProxyDatiFatturaRichiestaTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tesoro.it/fatture", name = "proxyDatiFatturaRichiestaTipo")
    public JAXBElement<ProxyDatiFatturaRichiestaTipo> createProxyDatiFatturaRichiestaTipo(ProxyDatiFatturaRichiestaTipo value) {
        return new JAXBElement<ProxyDatiFatturaRichiestaTipo>(_ProxyDatiFatturaRichiestaTipo_QNAME, ProxyDatiFatturaRichiestaTipo.class, null, value);
    }

}
