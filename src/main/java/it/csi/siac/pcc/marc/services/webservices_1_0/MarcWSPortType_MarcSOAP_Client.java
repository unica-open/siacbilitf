/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.pcc.marc.services.webservices_1_0;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.GregorianCalendar;

import javax.xml.namespace.QName;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import it.csi.siac.pcc.marc.schema.marccommontypes_1.ResultType;
import it.csi.siac.pcc.marc.schema.marcservicestypes_1.InvioOperazioneContabile;
import it.tesoro.fatture.DatiRichiestaOperazioneContabileProxyTipo;
import it.tesoro.fatture.IdentificazioneGeneraleTipo;
import it.tesoro.fatture.IdentificazioneSDITipo;
import it.tesoro.fatture.ListaOperazioneTipo;
import it.tesoro.fatture.OperazioneTipo;
import it.tesoro.fatture.ProxyOperazioneContabileRichiestaTipo;
import it.tesoro.fatture.TestataAsyncTipo;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2015-11-03T15:32:08.089+01:00
 * Generated source version: 2.4.6
 * 
 */
public final class MarcWSPortType_MarcSOAP_Client {

//    private static final QName SERVICE_NAME = new QName("http://www.csi.it/marc/services/webservices-1.0", "MarcSOAPService");
    private static final QName SERVICE_NAME = new QName("http://www.csi.it/marc/services/webservices-1.0", "MarcProxyService");

    private MarcWSPortType_MarcSOAP_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = MarcSOAPService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        MarcSOAPService ss = new MarcSOAPService(wsdlURL, SERVICE_NAME);
        MarcWSPortType port = ss.getMarcSOAP();  
        
        {
        System.out.println("Invoking invioOperazioneContabile...");
        ProxyOperazioneContabileRichiestaTipo _invioOperazioneContabile_datiRichiestaOperazioneContabile = new ProxyOperazioneContabileRichiestaTipo();
        
        InvioOperazioneContabile _invioOperazioneContabile_parameters = new InvioOperazioneContabile();
        ProxyOperazioneContabileRichiestaTipo _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabile = new ProxyOperazioneContabileRichiestaTipo();
        TestataAsyncTipo _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileTestataRichiesta = new TestataAsyncTipo();
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileTestataRichiesta.setCodiceFiscaleTrasmittente("CodiceFiscaleTrasmittente-340725346");
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileTestataRichiesta.setTimestampTrasmissione(new GregorianCalendar());
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileTestataRichiesta.setVersioneApplicativa("VersioneApplicativa-209747513");
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileTestataRichiesta.setIdentificativoPCCAmministrazione(Long.valueOf(-4922710867463007090l));
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileTestataRichiesta.setIdentificativoTransazionePA("IdentificativoTransazionePA123982637");
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabile.setTestataRichiesta(_invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileTestataRichiesta);
        DatiRichiestaOperazioneContabileProxyTipo _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiesta = new DatiRichiestaOperazioneContabileProxyTipo();
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiesta.setIdentificazionePCC("IdentificazionePCC988556818");
        IdentificazioneSDITipo _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaIdentificazioneSDI = new IdentificazioneSDITipo();
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaIdentificazioneSDI.setLottoSDI(new java.math.BigDecimal("1482821702928294861.8752244679908954564"));
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaIdentificazioneSDI.setNumeroFattura("NumeroFattura-2096908264");
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiesta.setIdentificazioneSDI(_invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaIdentificazioneSDI);
        IdentificazioneGeneraleTipo _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaIdentificazioneGenerale = new IdentificazioneGeneraleTipo();
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaIdentificazioneGenerale.setNumeroFattura("NumeroFattura-1876064742");
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaIdentificazioneGenerale.setDataEmissione(new GregorianCalendar());
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaIdentificazioneGenerale.setImportoTotaleDocumento(new java.math.BigDecimal("2971195935217351501.7849205700165055937"));
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaIdentificazioneGenerale.setIdFiscaleIvaFornitore("IdFiscaleIvaFornitore-2003036946");
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiesta.setIdentificazioneGenerale(_invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaIdentificazioneGenerale);
        ListaOperazioneTipo _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaListaOperazione = new ListaOperazioneTipo();
        java.util.List<OperazioneTipo> _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaListaOperazioneOperazione = new java.util.ArrayList<OperazioneTipo>();
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaListaOperazione.getOperazione().addAll(_invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaListaOperazioneOperazione);
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiesta.setListaOperazione(_invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiestaListaOperazione);
        _invioOperazioneContabile_parametersDatiRichiestaOperazioneContabile.setDatiRichiesta(_invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiesta);
        _invioOperazioneContabile_parameters.setDatiRichiestaOperazioneContabile(_invioOperazioneContabile_parametersDatiRichiestaOperazioneContabile);
        
        
        _invioOperazioneContabile_datiRichiestaOperazioneContabile.setDatiRichiesta(_invioOperazioneContabile_parametersDatiRichiestaOperazioneContabileDatiRichiesta);
        
        
        ResultType _invioOperazioneContabile__return = port.invioOperazioneContabile(_invioOperazioneContabile_datiRichiestaOperazioneContabile);
        System.out.println("invioOperazioneContabile.result=" + _invioOperazioneContabile__return);

        System.out.println("Codice: "+_invioOperazioneContabile__return.getCodice());
        System.out.println("Messaggio: "+_invioOperazioneContabile__return.getMessaggio());
        

        }

        System.exit(0);
    }

}
