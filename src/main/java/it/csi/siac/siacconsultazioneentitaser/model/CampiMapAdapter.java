/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * {@link XmlAdapter} per il binding della mappa dei campi di {@link EntitaConsultabile}.
 * 
 * @author Domenico Lisi
 *
 */
public class CampiMapAdapter extends XmlAdapter<CampiMapAdapter.ValueTypeMap<String, Object>, Map<String, Object>>{
	
	public static class ValueTypeMap<K,V> {
		@XmlElement(name="campo")
		public List<CampiMapAdapter.ValueTypeEntry<K, V>> entries = new ArrayList<CampiMapAdapter.ValueTypeEntry<K, V>>();
	}
	 
	public static class ValueTypeEntry<K,V> {
		@XmlElement(name="nome")
		public K key;
		@XmlElement(name="valore")
		public V value;
	}
	
	@Override
	public CampiMapAdapter.ValueTypeMap<String, Object> marshal(Map<String, Object> m /*bound type in Java*/) throws Exception {
		final CampiMapAdapter.ValueTypeMap<String, Object> am = new CampiMapAdapter.ValueTypeMap<String, Object>();
		for (Entry<String, Object> entry : m.entrySet()) {
			final CampiMapAdapter.ValueTypeEntry<String,Object> e = new CampiMapAdapter.ValueTypeEntry<String,Object>();
			e.key = entry.getKey();
			e.value = entry.getValue();
			am.entries.add(e);
		}
		// value type to xml
		return am;
	}
	
	@Override
	public Map<String, Object> unmarshal(CampiMapAdapter.ValueTypeMap<String, Object> am /* value type from xml*/) throws Exception {
		final Map<String,Object> m = new HashMap<String, Object>();
		if(am==null){
			return m;
		}
		for(CampiMapAdapter.ValueTypeEntry<String, Object> e : am.entries){
			m.put(e.key, normalizeValue(e.value));
		}
		// bound type in Java
		return m;
	}

	private Object normalizeValue(Object value) {
		if(value instanceof XMLGregorianCalendar){
			return ((XMLGregorianCalendar)value).toGregorianCalendar().getTime();
		}
		return value;
	}
	
}