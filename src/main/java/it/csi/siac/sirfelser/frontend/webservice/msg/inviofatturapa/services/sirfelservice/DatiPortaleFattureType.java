/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DatiPortaleFattureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiPortaleFattureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificativoFEL" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IdentificativoSDI" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NomeFileFattura" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataRicezione" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EstremiEsito">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Utente" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Cognome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DataOra" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="StatoFattura">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="ACCETTATA"/>
 *                         &lt;enumeration value="RIFIUTATA"/>
 *                         &lt;enumeration value="DECORRENZA_TERMINI"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DescrizioneRifiuto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiPortaleFattureType", propOrder = {
    "identificativoFEL",
    "identificativoSDI",
    "nomeFileFattura",
    "dataRicezione",
    "estremiEsito"
})
public class DatiPortaleFattureType {

    @XmlElement(name = "IdentificativoFEL")
    protected long identificativoFEL;
    @XmlElement(name = "IdentificativoSDI")
    protected long identificativoSDI;
    @XmlElement(name = "NomeFileFattura", required = true)
    protected String nomeFileFattura;
    @XmlElement(name = "DataRicezione")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataRicezione;
    @XmlElement(name = "EstremiEsito", required = true)
    protected DatiPortaleFattureType.EstremiEsito estremiEsito;

    /**
     * Gets the value of the identificativoFEL property.
     * 
     */
    public long getIdentificativoFEL() {
        return identificativoFEL;
    }

    /**
     * Sets the value of the identificativoFEL property.
     * 
     */
    public void setIdentificativoFEL(long value) {
        this.identificativoFEL = value;
    }

    /**
     * Gets the value of the identificativoSDI property.
     * 
     */
    public long getIdentificativoSDI() {
        return identificativoSDI;
    }

    /**
     * Sets the value of the identificativoSDI property.
     * 
     */
    public void setIdentificativoSDI(long value) {
        this.identificativoSDI = value;
    }

    /**
     * Gets the value of the nomeFileFattura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFileFattura() {
        return nomeFileFattura;
    }

    /**
     * Sets the value of the nomeFileFattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFileFattura(String value) {
        this.nomeFileFattura = value;
    }

    /**
     * Gets the value of the dataRicezione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRicezione() {
        return dataRicezione;
    }

    /**
     * Sets the value of the dataRicezione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRicezione(XMLGregorianCalendar value) {
        this.dataRicezione = value;
    }

    /**
     * Gets the value of the estremiEsito property.
     * 
     * @return
     *     possible object is
     *     {@link DatiPortaleFattureType.EstremiEsito }
     *     
     */
    public DatiPortaleFattureType.EstremiEsito getEstremiEsito() {
        return estremiEsito;
    }

    /**
     * Sets the value of the estremiEsito property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiPortaleFattureType.EstremiEsito }
     *     
     */
    public void setEstremiEsito(DatiPortaleFattureType.EstremiEsito value) {
        this.estremiEsito = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Utente" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Cognome" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DataOra" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="StatoFattura">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="ACCETTATA"/>
     *               &lt;enumeration value="RIFIUTATA"/>
     *               &lt;enumeration value="DECORRENZA_TERMINI"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DescrizioneRifiuto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "utente",
        "dataOra",
        "statoFattura",
        "descrizioneRifiuto"
    })
    public static class EstremiEsito {

        @XmlElement(name = "Utente")
        protected DatiPortaleFattureType.EstremiEsito.Utente utente;
        @XmlElement(name = "DataOra", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dataOra;
        @XmlElement(name = "StatoFattura", required = true)
        protected String statoFattura;
        @XmlElement(name = "DescrizioneRifiuto")
        protected String descrizioneRifiuto;

        /**
         * Gets the value of the utente property.
         * 
         * @return
         *     possible object is
         *     {@link DatiPortaleFattureType.EstremiEsito.Utente }
         *     
         */
        public DatiPortaleFattureType.EstremiEsito.Utente getUtente() {
            return utente;
        }

        /**
         * Sets the value of the utente property.
         * 
         * @param value
         *     allowed object is
         *     {@link DatiPortaleFattureType.EstremiEsito.Utente }
         *     
         */
        public void setUtente(DatiPortaleFattureType.EstremiEsito.Utente value) {
            this.utente = value;
        }

        /**
         * Gets the value of the dataOra property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataOra() {
            return dataOra;
        }

        /**
         * Sets the value of the dataOra property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataOra(XMLGregorianCalendar value) {
            this.dataOra = value;
        }

        /**
         * Gets the value of the statoFattura property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatoFattura() {
            return statoFattura;
        }

        /**
         * Sets the value of the statoFattura property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatoFattura(String value) {
            this.statoFattura = value;
        }

        /**
         * Gets the value of the descrizioneRifiuto property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescrizioneRifiuto() {
            return descrizioneRifiuto;
        }

        /**
         * Sets the value of the descrizioneRifiuto property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescrizioneRifiuto(String value) {
            this.descrizioneRifiuto = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Cognome" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "codice",
            "nome",
            "cognome"
        })
        public static class Utente {

            @XmlElement(name = "Codice", required = true)
            protected String codice;
            @XmlElement(name = "Nome")
            protected String nome;
            @XmlElement(name = "Cognome", required = true)
            protected String cognome;

            /**
             * Gets the value of the codice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodice() {
                return codice;
            }

            /**
             * Sets the value of the codice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodice(String value) {
                this.codice = value;
            }

            /**
             * Gets the value of the nome property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNome() {
                return nome;
            }

            /**
             * Sets the value of the nome property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNome(String value) {
                this.nome = value;
            }

            /**
             * Gets the value of the cognome property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCognome() {
                return cognome;
            }

            /**
             * Sets the value of the cognome property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCognome(String value) {
                this.cognome = value;
            }

        }

    }

}
