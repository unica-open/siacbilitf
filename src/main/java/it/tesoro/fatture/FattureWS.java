/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "fattureWS", targetNamespace = "http://www.tesoro.it/fatture")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    org.xmlsoap.schemas.soap.envelope.ObjectFactory.class,
    it.tesoro.fatture.ObjectFactory.class
})
public interface FattureWS {


    /**
     * metodo di test
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "testWsRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "return")
    public String testWS();

    /**
     * 
     * @param proxyOperazioneContabileRichiestaTipo
     * @return
     *     returns it.tesoro.fatture.ProxyRispostaTipo
     */
    @WebMethod
    @WebResult(name = "proxyRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "proxyRispostaTipo")
    public ProxyRispostaTipo wSProxyOperazioneContabile(
        @WebParam(name = "proxyOperazioneContabileRichiestaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "proxyOperazioneContabileRichiestaTipo")
        ProxyOperazioneContabileRichiestaTipo proxyOperazioneContabileRichiestaTipo);

    /**
     * 
     * @param queryOperazioneContabileRichiestaTipo
     * @return
     *     returns it.tesoro.fatture.QueryOperazioneContabileRispostaTipo
     */
    @WebMethod
    @WebResult(name = "queryOperazioneContabileRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "queryOperazioneContabileRispostaTipo")
    public QueryOperazioneContabileRispostaTipo wSQueryOperazioneContabile(
        @WebParam(name = "queryOperazioneContabileRichiestaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "queryOperazioneContabileRichiestaTipo")
        QueryOperazioneContabileRichiestaTipo queryOperazioneContabileRichiestaTipo);

    /**
     * 
     * @param proxyPagamentoIvaRichiestaTipo
     * @return
     *     returns it.tesoro.fatture.ProxyRispostaTipo
     */
    @WebMethod
    @WebResult(name = "proxyRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "proxyRispostaTipo")
    public ProxyRispostaTipo wSProxyPagamentoIva(
        @WebParam(name = "proxyPagamentoIvaRichiestaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "proxyPagamentoIvaRichiestaTipo")
        ProxyPagamentoIvaRichiestaTipo proxyPagamentoIvaRichiestaTipo);

    /**
     * 
     * @param queryPagamentoIvaRichiestaTipo
     * @return
     *     returns it.tesoro.fatture.QueryPagamentoIvaRispostaTipo
     */
    @WebMethod
    @WebResult(name = "queryPagamentoIvaRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "queryPagamentoIvaRispostaTipo")
    public QueryPagamentoIvaRispostaTipo wSQueryPagamentoIva(
        @WebParam(name = "queryPagamentoIvaRichiestaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "queryPagamentoIvaRichiestaTipo")
        QueryPagamentoIvaRichiestaTipo queryPagamentoIvaRichiestaTipo);

    /**
     * 
     * @param proxyDatiFatturaRichiestaTipo
     * @return
     *     returns it.tesoro.fatture.ProxyRispostaTipo
     */
    @WebMethod
    @WebResult(name = "proxyRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "proxyRispostaTipo")
    public ProxyRispostaTipo wSProxyDatiFattura(
        @WebParam(name = "proxyDatiFatturaRichiestaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "proxyDatiFatturaRichiestaTipo")
        ProxyDatiFatturaRichiestaTipo proxyDatiFatturaRichiestaTipo);

    /**
     * 
     * @param queryDatiFatturaRichiestaTipo
     * @return
     *     returns it.tesoro.fatture.QueryDatiFatturaRispostaTipo
     */
    @WebMethod
    @WebResult(name = "queryDatiFatturaRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "queryDatiFatturaRispostaTipo")
    public QueryDatiFatturaRispostaTipo wSQueryDatiFattura(
        @WebParam(name = "queryDatiFatturaRichiestaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "queryDatiFatturaRichiestaTipo")
        QueryDatiFatturaRichiestaTipo queryDatiFatturaRichiestaTipo);

    /**
     * 
     * @param proxyInserimentoFatturaRichiestaTipo
     * @return
     *     returns it.tesoro.fatture.ProxyRispostaTipo
     */
    @WebMethod
    @WebResult(name = "proxyRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "proxyRispostaTipo")
    public ProxyRispostaTipo wSProxyInserimentoFattura(
        @WebParam(name = "proxyInserimentoFatturaRichiestaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "proxyInserimentoFatturaRichiestaTipo")
        ProxyInserimentoFatturaRichiestaTipo proxyInserimentoFatturaRichiestaTipo);

    /**
     * 
     * @param queryInserimentoFatturaRichiestaTipo
     * @return
     *     returns it.tesoro.fatture.QueryInserimentoFatturaRispostaTipo
     */
    @WebMethod
    @WebResult(name = "queryInserimentoFatturaRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "queryInserimentoFatturaRispostaTipo")
    public QueryInserimentoFatturaRispostaTipo wSQueryInserimentoFattura(
        @WebParam(name = "queryInserimentoFatturaRichiestaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "queryInserimentoFatturaRichiestaTipo")
        QueryInserimentoFatturaRichiestaTipo queryInserimentoFatturaRichiestaTipo);

    /**
     * 
     * @param readStatoFatturaRichiestaTipo
     * @return
     *     returns it.tesoro.fatture.ReadStatoFatturaRispostaTipo
     */
    @WebMethod
    @WebResult(name = "readStatoFatturaRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "readStatoFatturaRispostaTipo")
    public ReadStatoFatturaRispostaTipo wSReadStatoFattura(
        @WebParam(name = "readStatoFatturaRichiestaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "readStatoFatturaRichiestaTipo")
        ReadStatoFatturaRichiestaTipo readStatoFatturaRichiestaTipo);

    /**
     * 
     * @param queryInterrogazioneEsitiRichiestaTipo
     * @return
     *     returns it.tesoro.fatture.QueryInterrogazioneEsitiRispostaTipo
     */
    @WebMethod
    @WebResult(name = "queryInterrogazioneEsitiRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "queryInterrogazioneEsitiRispostaTipo")
    public QueryInterrogazioneEsitiRispostaTipo wSQueryInterrogazioneEsiti(
        @WebParam(name = "queryInterrogazioneEsitiRichiestaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "queryInterrogazioneEsitiRichiestaTipo")
        QueryInterrogazioneEsitiRichiestaTipo queryInterrogazioneEsitiRichiestaTipo);

    /**
     * 
     * @param readElencoMovimentiErarioIvaRichiestaTipo
     * @return
     *     returns it.tesoro.fatture.ReadElencoMovimentiErarioIvaRispostaTipo
     */
    @WebMethod
    @WebResult(name = "readElencoMovimentiErarioIvaRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "readElencoMovimentiErarioIvaRispostaTipo")
    public ReadElencoMovimentiErarioIvaRispostaTipo wSReadElencoMovimentiErarioIva(
        @WebParam(name = "readElencoMovimentiErarioIvaRichiestaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "readElencoMovimentiErarioIvaRichiestaTipo")
        ReadElencoMovimentiErarioIvaRichiestaTipo readElencoMovimentiErarioIvaRichiestaTipo);

    /**
     * 
     * @param readDownloadDocumentoRichiestaTipo
     * @return
     *     returns it.tesoro.fatture.ReadDownloadDocumentoRispostaTipo
     */
    @WebMethod
    @WebResult(name = "readDownloadDocumentoRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "readDownloadDocumentoRispostaTipo")
    public ReadDownloadDocumentoRispostaTipo wSReadDownloadDocumento(
        @WebParam(name = "readDownloadDocumentoRichiestaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "readDownloadDocumentoRichiestaTipo")
        ReadDownloadDocumentoRichiestaTipo readDownloadDocumentoRichiestaTipo);

    /**
     * 
     * @param proxyDatiFattureRichiestaTipo
     * @return
     *     returns it.tesoro.fatture.ProxyRispostaTipo
     */
    @WebMethod
    @WebResult(name = "proxyRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "proxyRispostaTipo")
    public ProxyRispostaTipo wSProxyDatiFatture(
        @WebParam(name = "proxyDatiFattureRichiestaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "proxyDatiFattureRichiestaTipo")
        ProxyDatiFattureRichiestaTipo proxyDatiFattureRichiestaTipo);

    /**
     * 
     * @param queryDatiFattureRichiestaTipo
     * @return
     *     returns it.tesoro.fatture.QueryDatiFattureRispostaTipo
     */
    @WebMethod
    @WebResult(name = "queryDatiFattureRispostaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "queryDatiFattureRispostaTipo")
    public QueryDatiFattureRispostaTipo wSQueryDatiFatture(
        @WebParam(name = "queryDatiFattureRichiestaTipo", targetNamespace = "http://www.tesoro.it/fatture", partName = "queryDatiFattureRichiestaTipo")
        QueryDatiFattureRichiestaTipo queryDatiFattureRichiestaTipo);

}