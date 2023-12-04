/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.TipoAtto;
import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.GenereVincolo;
import it.csi.siac.siacbilser.model.ModalitaAffidamentoProgetto;
import it.csi.siac.siacbilser.model.RisorsaVincolata;
import it.csi.siac.siaccecser.model.MezziDiTrasporto;
import it.csi.siac.siaccecser.model.ModalitaAccreditoCassaEconomale;
import it.csi.siac.siaccecser.model.ModalitaPagamentoDipendente;
import it.csi.siac.siaccecser.model.TipoGiustificativo;
import it.csi.siac.siaccecser.model.TipoRichiestaEconomale;
import it.csi.siac.siaccespser.model.CategoriaCespiti;
import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.model.CausalePCC;
import it.csi.siac.siacfin2ser.model.CausaleSospensione;
import it.csi.siac.siacfin2ser.model.CodiceSommaNonSoggetta;
import it.csi.siac.siacfin2ser.model.StatoDebito;
import it.csi.siac.siacfin2ser.model.TipoOperazionePCC;
import it.csi.siac.siacfin2ser.model.Valuta;
import it.csi.siac.siacfinser.model.codifiche.ModalitaAccreditoSoggetto;
import it.csi.siac.siacfinser.model.siopeplus.SiopeAssenzaMotivazione;
import it.csi.siac.siacfinser.model.siopeplus.SiopeDocumentoTipo;
import it.csi.siac.siacfinser.model.siopeplus.SiopeDocumentoTipoAnalogico;
import it.csi.siac.siacfinser.model.siopeplus.SiopeScadenzaMotivo;
import it.csi.siac.siacfinser.model.siopeplus.SiopeTipoDebito;
import it.csi.siac.siacgenser.model.ClassePiano;
import it.csi.siac.siacgenser.model.Evento;
import it.csi.siac.siacgenser.model.TipoConto;
import it.csi.siac.siacgenser.model.TipoEvento;
import it.csi.siac.siacgenser.model.TipoLegame;
import it.csi.siac.siacgenser.model.TipoRelazionePrimaNota;


/**
 * The Class RicercaCodificheResponse.
 * 
 * @author Domenico
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaCodificheResponse extends ServiceResponse {
	
	

	@XmlElements({
		
			//CassaEconomale
			@XmlElement(name="tipoGiustificativo", type=TipoGiustificativo.class),
			@XmlElement(name="mezziDiTrasporto", type=MezziDiTrasporto.class),
			@XmlElement(name="tipoAtto", type=TipoAtto.class),
			@XmlElement(name="tipoRichiestaEconomale", type=TipoRichiestaEconomale.class),
			@XmlElement(name="modalitaPagamentoDipendente", type=ModalitaPagamentoDipendente.class),
			@XmlElement(name="modalitaAccreditoSoggetto", type=ModalitaAccreditoSoggetto.class),
			@XmlElement(name="modalitaAccreditoCassaEconomale", type=ModalitaAccreditoCassaEconomale.class),
			@XmlElement(name="valuta", type=Valuta.class),
			
			//ContabilitaGenerale
			@XmlElement(name="tipoConto", type=TipoConto.class),
			@XmlElement(name="categoriaCespiti", type=CategoriaCespiti.class),
			@XmlElement(name="tipoLegame", type=TipoLegame.class),
			@XmlElement(name="classePiano", type=ClassePiano.class),
			@XmlElement(name="tipoEvento", type=TipoEvento.class),
			@XmlElement(name="evento", type=Evento.class),
			@XmlElement(name="tipoRelazionePrimaNota", type=TipoRelazionePrimaNota.class),
			
			// PCC
			@XmlElement(name="tipoOperazionePCC", type=TipoOperazionePCC.class),
			@XmlElement(name="statoDebito", type=StatoDebito.class),
			@XmlElement(name="causalePCC", type=CausalePCC.class),
			
			@XmlElement(name="codiceSommaNonSoggetta", type=CodiceSommaNonSoggetta.class),
			
			// SIAC-4679
			@XmlElement(name="causaleSospensione", type=CausaleSospensione.class),
			
			// SIAC-5076
			@XmlElement(name="genereVincolo", type=GenereVincolo.class),
			// SIAC-7192
			@XmlElement(name="risorsaVincolata", type=RisorsaVincolata.class),
			
			// SIAC-5311 SIOPE+
			@XmlElement(name="siopeDocumentoTipo", type=SiopeDocumentoTipo.class),
			@XmlElement(name="siopeDocumentoTipoAnalogico", type=SiopeDocumentoTipoAnalogico.class),
			@XmlElement(name="siopeAssenzaMotivazione", type=SiopeAssenzaMotivazione.class),
			@XmlElement(name="siopeScadenzaMotivo", type=SiopeScadenzaMotivo.class),
			@XmlElement(name="siopeTipoDebito", type=SiopeTipoDebito.class),
			//SIAC-6255
			@XmlElement(name="modalitaAffidamentoProgetto", type=ModalitaAffidamentoProgetto.class),
			
			
			//Attenzione: Se aggiungi codifiche qui aggiungile anche in RicercaCodificaResponse

			// Generico (Da lasciare per ULTIMO!)
			@XmlElement(name="codifica", type=Codifica.class),
			
			
			
		})
	private List<Codifica> codifiche = new ArrayList<Codifica>();
	
	/**
	 * Gets the codifiche.
	 *
	 * @return the codifiche
	 */
	@XmlTransient
	public List<Codifica> getCodifiche() {
		return codifiche;
	}

	/**
	 * Sets the codifiche.
	 *
	 * @param classificatori the new codifiche
	 */
	public void setCodifiche(List<Codifica> classificatori) {
		this.codifiche = classificatori != null ? classificatori : new ArrayList<Codifica>();
	}
	
	
	/**
	 * Adds the codifica.
	 *
	 * @param codifica the codifica
	 */
	public void addCodifica(Codifica codifica) {
		this.codifiche.add(codifica);
	}
	
	/**
	 * Adds the codifiche.
	 *
	 * @param codifiche the codifiche
	 */
	public void addCodifiche(List<? extends Codifica> codifiche) {
		this.getCodifiche().addAll(codifiche);
	}
	
	/**
	 * Ottiene le codifiche di un determinato tipo.
	 *
	 * @param <T> the generic type
	 * @param classifClazz - Classe della codifica
	 * @return lisa delle codifiche del tipo specificato
	 */
	@SuppressWarnings("unchecked")
	public<T extends Codifica> List<T> getCodifiche(Class<T> classifClazz) {
		
		final List<T> result = new ArrayList<T>();
		
		for (Codifica c : codifiche) {			
			if(classifClazz.isInstance(c)){				
				result.add((T)c);
			}
		}
		
		return result;
	}

//	/**
//	 * Gets the codifiche tipo giustificativo.
//	 *
//	 * @return the codifiche tipo giustificativo
//	 */
//	public List<TipoGiustificativo> getCodificheTipoGiustificativo() {
//		return getCodifiche(TipoGiustificativo.class);
//	}
//	
//	/**
//	 * Gets the codifiche mezzi di trasporto.
//	 *
//	 * @return the codifiche mezzi di trasporto
//	 */
//	public List<MezziDiTrasporto> getCodificheMezziDiTrasporto() {
//		return getCodifiche(MezziDiTrasporto.class);
//	}
	

}
