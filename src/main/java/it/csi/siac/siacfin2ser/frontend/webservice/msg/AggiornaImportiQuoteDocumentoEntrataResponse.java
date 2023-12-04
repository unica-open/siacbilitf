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
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaImportiQuoteDocumentoEntrataResponse extends ServiceResponse {
	
	private List<SubdocumentoEntrata> subdocumentiEntrata = new ArrayList<SubdocumentoEntrata>();

	/**
	 * @return the subdocumentiEntrata
	 */
	public List<SubdocumentoEntrata> getSubdocumentiEntrata() {
		return subdocumentiEntrata;
	}

	/**
	 * @param subdocumentiEntrata the subdocumentiEntrata to set
	 */
	public void setSubdocumentiEntrata(List<SubdocumentoEntrata> subdocumentiEntrata) {
		this.subdocumentiEntrata = subdocumentiEntrata != null ? subdocumentiEntrata : new ArrayList<SubdocumentoEntrata>();
	}
	
	
	/**
	 * Ottiene l'elenco dei Documenti referenziati dall'elenco dei subdocumenti.
	 * @return
	 */
	public List<DocumentoEntrata> getDocumentiReferenziatiDaiSubdocumenti() {
		final Map<Integer, DocumentoEntrata> map = new HashMap<Integer, DocumentoEntrata>();
		for(SubdocumentoEntrata ss : subdocumentiEntrata) {
			if(ss.getDocumento()!=null) {
				map.put(ss.getDocumento().getUid(), ss.getDocumento());
			}
		}
		
		return new ArrayList<DocumentoEntrata>(map.values());
	}

}
