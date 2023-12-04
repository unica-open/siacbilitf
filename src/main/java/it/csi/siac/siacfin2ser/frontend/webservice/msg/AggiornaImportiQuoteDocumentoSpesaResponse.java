/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaImportiQuoteDocumentoSpesaResponse extends ServiceResponse {
	
	private List<SubdocumentoSpesa> subdocumentiSpesa = new ArrayList<SubdocumentoSpesa>();

	/**
	 * @return the subdocumentiSpesa
	 */
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

}
