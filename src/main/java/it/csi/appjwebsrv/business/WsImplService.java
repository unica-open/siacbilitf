/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

/*
 * 
 */

package it.csi.appjwebsrv.business;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.12
 * Thu Jan 19 12:02:26 CET 2017
 * Generated source version: 2.2.12
 * 
 */


@WebServiceClient(name = "WsImplService", 
                  wsdlLocation = "https://tst-api-ent.ecosis.csi.it/wso007/registry/resource/_system/governance/apimgt/applicationdata/provider/bilancio-cre/BILANCIO_PROCUREMENT_CMTO_VerificaEvasione/1.0/documentation/files/bilancio-cre--BILANCIO_PROCUREMENT_CMTO_VerificaEvasione1.0.wsdl",
                  targetNamespace = "http://business.appjwebsrv.csi.it/") 
public class WsImplService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://business.appjwebsrv.csi.it/", "WsImplService");
    public final static QName WsImplPort = new QName("http://business.appjwebsrv.csi.it/", "WsImplPort");
    static {
        URL url = null;
        try {
            url = new URL("https://tst-api-ent.ecosis.csi.it/wso007/registry/resource/_system/governance/apimgt/applicationdata/provider/bilancio-cre/BILANCIO_PROCUREMENT_CMTO_VerificaEvasione/1.0/documentation/files/bilancio-cre--BILANCIO_PROCUREMENT_CMTO_VerificaEvasione1.0.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from https://tst-api-ent.ecosis.csi.it/wso007/registry/resource/_system/governance/apimgt/applicationdata/provider/bilancio-cre/BILANCIO_PROCUREMENT_CMTO_VerificaEvasione/1.0/documentation/files/bilancio-cre--BILANCIO_PROCUREMENT_CMTO_VerificaEvasione1.0.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public WsImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WsImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns WSInterface
     */
    @WebEndpoint(name = "WsImplPort")
    public WSInterface getWsImplPort() {
        return super.getPort(WsImplPort, WSInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSInterface
     */
    @WebEndpoint(name = "WsImplPort")
    public WSInterface getWsImplPort(WebServiceFeature... features) {
        return super.getPort(WsImplPort, WSInterface.class, features);
    }

}
