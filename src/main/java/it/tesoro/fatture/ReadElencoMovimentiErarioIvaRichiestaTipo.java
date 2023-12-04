/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readElencoMovimentiErarioIvaRichiestaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readElencoMovimentiErarioIvaRichiestaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testataRichiesta" type="{http://www.tesoro.it/fatture}testataTransazioneTipo"/>
 *         &lt;element name="datiRichiesta" type="{http://www.tesoro.it/fatture}datiRichiestaElencoMovimentiErarioReadTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readElencoMovimentiErarioIvaRichiestaTipo", propOrder = {
    "testataRichiesta",
    "datiRichiesta"
})
public class ReadElencoMovimentiErarioIvaRichiestaTipo {

    @XmlElement(required = true)
    protected TestataTransazioneTipo testataRichiesta;
    @XmlElement(required = true)
    protected DatiRichiestaElencoMovimentiErarioReadTipo datiRichiesta;

    /**
     * Gets the value of the testataRichiesta property.
     * 
     * @return
     *     possible object is
     *     {@link TestataTransazioneTipo }
     *     
     */
    public TestataTransazioneTipo getTestataRichiesta() {
        return testataRichiesta;
    }

    /**
     * Sets the value of the testataRichiesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestataTransazioneTipo }
     *     
     */
    public void setTestataRichiesta(TestataTransazioneTipo value) {
        this.testataRichiesta = value;
    }

    /**
     * Gets the value of the datiRichiesta property.
     * 
     * @return
     *     possible object is
     *     {@link DatiRichiestaElencoMovimentiErarioReadTipo }
     *     
     */
    public DatiRichiestaElencoMovimentiErarioReadTipo getDatiRichiesta() {
        return datiRichiesta;
    }

    /**
     * Sets the value of the datiRichiesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiRichiestaElencoMovimentiErarioReadTipo }
     *     
     */
    public void setDatiRichiesta(DatiRichiestaElencoMovimentiErarioReadTipo value) {
        this.datiRichiesta = value;
    }

}
