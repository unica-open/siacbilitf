/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.pcc.marc.services.webservices_1_0;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2015-11-03T15:32:08.139+01:00
 * Generated source version: 2.4.6
 * 
 */
 
public class MarcWSPortType_MarcSOAP_Server{

    protected MarcWSPortType_MarcSOAP_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new MarcWSPortTypeImpl();
        String address = "http://www.example.org/";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new MarcWSPortType_MarcSOAP_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
