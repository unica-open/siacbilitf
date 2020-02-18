/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * Rappresente un insieme di dati correlati.
 * 
 * @author Domenico
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class FlatRecordData implements Serializable {

	private static final long serialVersionUID = 8156250449145146589L;
	
	@XmlElementWrapper(name="datas")
	@XmlElements({
		@XmlElement(name="s", type=String.class),
		@XmlElement(name="bd", type=BigDecimal.class),
		@XmlElement(name="i", type=Integer.class),
		@XmlElement(name="bd", type=Date.class),
		@XmlElement(name="l", type=Long.class),
		@XmlElement(name="o", type=Object.class),
		
	})
	@XmlElement(name="")
	private List<Object> datas;
	
	public FlatRecordData() {
		datas = new ArrayList<Object>();
	}
	

	public FlatRecordData(Object... objs) {
		this.datas = Arrays.asList(objs);
	}


	/**
	 * @return the datas
	 */
	@XmlTransient
	public List<Object> getDatas() {
		return datas;
	}


	/**
	 * @param datas the datas to set
	 */
	public void setDatas(List<Object> datas) {
		this.datas = datas;
	}
	
	
	
	

}
