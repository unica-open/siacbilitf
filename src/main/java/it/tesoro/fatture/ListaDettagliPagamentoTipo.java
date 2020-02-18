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
 * <p>Java class for listaDettagliPagamentoTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaDettagliPagamentoTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dettagliPagamento" type="{http://www.tesoro.it/fatture}dettagliPagamentoTipo" maxOccurs="240"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaDettagliPagamentoTipo", propOrder = {
    "dettagliPagamento"
})
public class ListaDettagliPagamentoTipo {

    @XmlElement(required = true)
    protected List<DettagliPagamentoTipo> dettagliPagamento;

    /**
     * Gets the value of the dettagliPagamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettagliPagamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettagliPagamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DettagliPagamentoTipo }
     * 
     * 
     */
    public List<DettagliPagamentoTipo> getDettagliPagamento() {
        if (dettagliPagamento == null) {
            dettagliPagamento = new ArrayList<DettagliPagamentoTipo>();
        }
        return this.dettagliPagamento;
    }

}
