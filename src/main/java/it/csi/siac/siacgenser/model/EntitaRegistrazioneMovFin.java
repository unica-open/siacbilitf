/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoIncasso;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoPagamento;

/**

 * @version 1.0
 * @created 14-apr-2015
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class EntitaRegistrazioneMovFin extends EntitaEnte{

	
	private static final long serialVersionUID = 3717172309803270659L;
	
	@XmlElements({
		@XmlElement(name="impegno", type=Impegno.class),
		@XmlElement(name="accertamento", type=Accertamento.class), 
		@XmlElement(name="liquidazione", type=Liquidazione.class), 
		@XmlElement(name="documentoEntrata", type=DocumentoEntrata.class),
		@XmlElement(name="documentoSpesa", type=DocumentoSpesa.class),
		@XmlElement(name="ordinativoPagamento", type=OrdinativoPagamento.class),
		@XmlElement(name="ordinativoIncasso", type=OrdinativoIncasso.class),
		@XmlElement(name="primaNota", type=PrimaNota.class) 
	})
	private Entita movimento;
	
	private Tabella tabella;
	private Integer valorePkTabella;
	private Evento evento;
	private TipoEvento tipoEvento;
	
	
	@XmlTransient
	/**
	 * @return the movimento
	 */
	public Entita getMovimento() {
		return movimento;
	}
	/**
	 * @param movimento the movimento to set
	 */
	public void setMovimento(Entita movimento) {
		this.movimento = movimento;
	}
	/**
	 * @return the tabella
	 */
	public Tabella getTabella() {
		return tabella;
	}
	/**
	 * @param tabella the tabella to set
	 */
	public void setTabella(Tabella tabella) {
		this.tabella = tabella;
	}

	/**
	 * @return the valorePkTabella
	 */
	public Integer getValorePkTabella() {
		return valorePkTabella;
	}
	/**
	 * @param valorePkTabella the valorePkTabella to set
	 */
	public void setValorePkTabella(Integer valorePkTabella) {
		this.valorePkTabella = valorePkTabella;
	}
	/**
	 * @return the evento
	 */
	public Evento getEvento() {
		return evento;
	}
	/**
	 * @param evento the evento to set
	 */
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	/**
	 * @return the tipoEvento
	 */
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
	/**
	 * @param tipoEvento the tipoEvento to set
	 */
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	
	
	


}