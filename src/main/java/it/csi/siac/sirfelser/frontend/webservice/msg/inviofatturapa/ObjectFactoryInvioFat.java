/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.sirfel.inviofatturapa_1 package. 
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
public class ObjectFactoryInvioFat {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.sirfel.inviofatturapa_1
     * 
     */
    public ObjectFactoryInvioFat() {
    	// Default empty constructor (only for javadoc)
    }

    /**
     * Create an instance of {@link InvioFatturaPAResponse }
     * 
     */
    public InvioFatturaPAResponse createInvioFatturaPAResponse() {
        return new InvioFatturaPAResponse();
    }

    /**
     * Create an instance of {@link InvioFatturaPAResponse.Result }
     * 
     */
    public InvioFatturaPAResponse.Result createInvioFatturaPAResponseResult() {
        return new InvioFatturaPAResponse.Result();
    }

    /**
     * Create an instance of {@link InvioFatturaPA }
     * 
     */
    public InvioFatturaPA createInvioFatturaPA() {
        return new InvioFatturaPA();
    }

}
