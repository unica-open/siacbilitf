/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.srvpers.rapws.interfaccecxf.services.missioni;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.6
 * 2016-01-22T12:53:03.406+01:00
 * Generated source version: 2.4.6
 */

@WebFault(name = "MissioniServiceFault", targetNamespace = "http://missioni.services.interfaccecxf.rapws.srvpers.csi.it/")
public class MissioniFaultException extends Exception {
    
    private it.csi.srvpers.rapws.interfaccecxf.services.missioni.MissioniServiceFault missioniServiceFault;

    public MissioniFaultException() {
        super();
    }
    
    public MissioniFaultException(String message) {
        super(message);
    }
    
    public MissioniFaultException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissioniFaultException(String message, it.csi.srvpers.rapws.interfaccecxf.services.missioni.MissioniServiceFault missioniServiceFault) {
        super(message);
        this.missioniServiceFault = missioniServiceFault;
    }

    public MissioniFaultException(String message, it.csi.srvpers.rapws.interfaccecxf.services.missioni.MissioniServiceFault missioniServiceFault, Throwable cause) {
        super(message, cause);
        this.missioniServiceFault = missioniServiceFault;
    }

    public it.csi.srvpers.rapws.interfaccecxf.services.missioni.MissioniServiceFault getFaultInfo() {
        return this.missioniServiceFault;
    }
}
