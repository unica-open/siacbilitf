/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.pcc.marc.schema.marccommontypes_1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.siac.pcc.marc.schema.marccommontypes_1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.siac.pcc.marc.schema.marccommontypes_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParametriApiManagerType }
     * 
     */
    public ParametriApiManagerType createParametriApiManagerType() {
        return new ParametriApiManagerType();
    }

    /**
     * Create an instance of {@link ParametriApiManagerType.EndpointList }
     * 
     */
    public ParametriApiManagerType.EndpointList createParametriApiManagerTypeEndpointList() {
        return new ParametriApiManagerType.EndpointList();
    }

    /**
     * Create an instance of {@link EmbeddedXMLType }
     * 
     */
    public EmbeddedXMLType createEmbeddedXMLType() {
        return new EmbeddedXMLType();
    }

    /**
     * Create an instance of {@link EndpointType }
     * 
     */
    public EndpointType createEndpointType() {
        return new EndpointType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link ParametriApiManagerType.EndpointList.Endpoint }
     * 
     */
    public ParametriApiManagerType.EndpointList.Endpoint createParametriApiManagerTypeEndpointListEndpoint() {
        return new ParametriApiManagerType.EndpointList.Endpoint();
    }

}
