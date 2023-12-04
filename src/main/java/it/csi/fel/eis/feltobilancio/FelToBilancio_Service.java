/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.fel.eis.feltobilancio;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "FelToBilancio", targetNamespace = "http://www.csi.it/fel/eis/FelToBilancio", wsdlLocation = "file:/C:/Progetti/CSI/siac/bilserveritf/src/main/resources/wsdl/FelToBilancio.wsdl")
public class FelToBilancio_Service
    extends Service
{

    private final static URL FELTOBILANCIO_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(it.csi.fel.eis.feltobilancio.FelToBilancio_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = it.csi.fel.eis.feltobilancio.FelToBilancio_Service.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/Progetti/CSI/siac/bilserveritf/src/main/resources/wsdl/FelToBilancio.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/Progetti/CSI/siac/bilserveritf/src/main/resources/wsdl/FelToBilancio.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        FELTOBILANCIO_WSDL_LOCATION = url;
    }

    public FelToBilancio_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FelToBilancio_Service() {
        super(FELTOBILANCIO_WSDL_LOCATION, new QName("http://www.csi.it/fel/eis/FelToBilancio", "FelToBilancio"));
    }

    /**
     * 
     * @return
     *     returns FelToBilancio
     */
    @WebEndpoint(name = "FelToBilancioSOAP")
    public FelToBilancio getFelToBilancioSOAP() {
        return super.getPort(new QName("http://www.csi.it/fel/eis/FelToBilancio", "FelToBilancioSOAP"), FelToBilancio.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FelToBilancio
     */
    @WebEndpoint(name = "FelToBilancioSOAP")
    public FelToBilancio getFelToBilancioSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.csi.it/fel/eis/FelToBilancio", "FelToBilancioSOAP"), FelToBilancio.class, features);
    }

}
