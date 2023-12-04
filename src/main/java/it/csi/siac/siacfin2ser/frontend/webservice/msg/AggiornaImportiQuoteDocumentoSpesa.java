/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaImportiQuoteDocumentoSpesa extends ServiceRequest {
	
	@XmlElementWrapper(name="subdocumentiSpesa")
	@XmlElement(name="subdocumento")
	private List<SubdocumentoSpesa> subdocumentiSpesa = new ArrayList<SubdocumentoSpesa>();
	
	private Bilancio bilancio;

	/**
	 * @return the subdocumentiSpesa
	 */
	@XmlTransient
	public List<SubdocumentoSpesa> getSubdocumentiSpesa() {
		return subdocumentiSpesa;
	}

	/**
	 * @param subdocumentiSpesa the subdocumentiSpesa to set
	 */
	public void setSubdocumentiSpesa(List<SubdocumentoSpesa> subdocumentiSpesa) {
		this.subdocumentiSpesa = subdocumentiSpesa != null ? subdocumentiSpesa : new ArrayList<SubdocumentoSpesa>();
	}
	
	
	/**
	 * Ottiene l'elenco dei Documenti referenziati dall'elenco dei subdocumenti.
	 * @return
	 */
	public List<DocumentoSpesa> getDocumentiReferenziatiDaiSubdocumenti() {
		final Map<Integer, DocumentoSpesa> map = new HashMap<Integer, DocumentoSpesa>();
		for(SubdocumentoSpesa ss : subdocumentiSpesa) {
			if(ss.getDocumento()!=null) {
				map.put(ss.getDocumento().getUid(), ss.getDocumento());
			}
		}
		
		return new ArrayList<DocumentoSpesa>(map.values());
	}

	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	
}
