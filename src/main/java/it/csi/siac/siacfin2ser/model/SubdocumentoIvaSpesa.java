/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class SubdocumentoIvaSpesa extends SubdocumentoIva<DocumentoSpesa, SubdocumentoSpesa, SubdocumentoIvaSpesa> {
	
	private static final long serialVersionUID = 752195542434355565L;
	
	private SubdocumentoIvaEntrata subdocumentoIvaEntrata;

	/**
	 * @return the subdocumentoIvaEntrata
	 */
	@XmlTransient
	public SubdocumentoIvaEntrata getSubdocumentoIvaEntrata() {
		return subdocumentoIvaEntrata;
	}

	/**
	 * @param subdocumentoIvaEntrata the subdocumentoIvaEntrata to set
	 */
	public void setSubdocumentoIvaEntrata(
			SubdocumentoIvaEntrata subdocumentoIvaEntrata) {
		this.subdocumentoIvaEntrata = subdocumentoIvaEntrata;
	}
	
	/**
	 * @return the subdocumentoIvaEntrata
	 */
	public SubdocumentoIvaEntrata getSubdocumentoIvaEntrataControregistrazione() {
		return subdocumentoIvaEntrata;
	}

	/**
	 * @param subdocumentoIvaEntrata the subdocumentoIvaEntrata to set
	 */
	public void setSubdocumentoIvaEntrataControregistrazione(
			SubdocumentoIvaEntrata subdocumentoIvaEntrata) {
		this.subdocumentoIvaEntrata = subdocumentoIvaEntrata;
	}
	
	
	public void setDataProtocolloDefinitivoSI(Date dataProtocolloDefinitivo) {
		super.setDataProtocolloDefinitivo(dataProtocolloDefinitivo);
	}	
	
	
	
	public Date getDataProtocolloDefinitivoSI() {
		return super.getDataProtocolloDefinitivo();
	}
	
	
	public void setDataProtocolloProvvisorioSI(Date dataProtocolloProvvisorio) {
		super.setDataProtocolloProvvisorio(dataProtocolloProvvisorio);
	}
	
	
	public Date getDataProtocolloProvvisorioSI() {
		return super.getDataProtocolloProvvisorio();
	}
	
	
	public void setDataOrdinativoDocumentoSI(Date dataOrdinativoDocumento) {
		super.setDataOrdinativoDocumento(dataOrdinativoDocumento);
	}
	
	
	public Date getDataOrdinativoDocumentoSI() {
		return super.getDataOrdinativoDocumento();
	}
	
	
	public void setDataRegistrazioneSI(Date dataRegistrazione) {
		super.setDataRegistrazione(dataRegistrazione);
	}
	
	
	public Date getDataRegistrazioneSI() {
		return super.getDataRegistrazione();
	}
	
	
	public void setDataCassaDocumentoSI(Date dataCassaDocumento) {
		super.setDataCassaDocumento(dataCassaDocumento);
	}
	
	
	public Date getDataCassaDocumentoSI() {
		return super.getDataCassaDocumento();
	}
}
