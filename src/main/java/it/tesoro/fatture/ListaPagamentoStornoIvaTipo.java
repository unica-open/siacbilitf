/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaPagamentoStornoIvaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaPagamentoStornoIvaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pagamentoStorniIva" type="{http://www.tesoro.it/fatture}pagamentoStornoIvaTipo" maxOccurs="240"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaPagamentoStornoIvaTipo", propOrder = {
    "pagamentoStorniIva"
})
public class ListaPagamentoStornoIvaTipo {

    @XmlElement(required = true)
    protected List<PagamentoStornoIvaTipo> pagamentoStorniIva;

    /**
     * Gets the value of the pagamentoStorniIva property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pagamentoStorniIva property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPagamentoStorniIva().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PagamentoStornoIvaTipo }
     * 
     * 
     */
    public List<PagamentoStornoIvaTipo> getPagamentoStorniIva() {
        if (pagamentoStorniIva == null) {
            pagamentoStorniIva = new ArrayList<PagamentoStornoIvaTipo>();
        }
        return this.pagamentoStorniIva;
    }

}
