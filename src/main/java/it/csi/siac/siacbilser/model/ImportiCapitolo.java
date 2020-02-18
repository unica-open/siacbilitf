/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

/**
 * ImportiCapitolo, rappresenta le voci relative agli importi del capitolo
 * 
 * @author rmontuori 
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ImportiCapitolo extends Entita implements Cloneable {

	private static final long serialVersionUID = 1900646864202939329L;

	private Integer annoCompetenza;
	
	@ImportoPersistente private BigDecimal stanziamento = BigDecimal.ZERO;
	@ImportoPersistente private BigDecimal stanziamentoCassa = BigDecimal.ZERO;
	@ImportoPersistente private BigDecimal stanziamentoCassaIniziale = BigDecimal.ZERO;
	@ImportoPersistente private BigDecimal stanziamentoIniziale = BigDecimal.ZERO;
	@ImportoPersistente private BigDecimal stanziamentoProposto = BigDecimal.ZERO;
	// stanziamentoResiduo vale anche come stanziamentoPresunto
	@ImportoPersistente private BigDecimal stanziamentoResiduo = BigDecimal.ZERO;
	@ImportoPersistente private BigDecimal stanziamentoResiduoIniziale = BigDecimal.ZERO;
	@ImportoPersistente private BigDecimal fondoPluriennaleVinc = BigDecimal.ZERO;
	//attualmente NON utilizzato!  //derivato //TODO da verificare se è uguale a stanziamento (+3) ////default non caricato
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.impegnatoPlur) private BigDecimal impegnatoPlur = BigDecimal.ZERO;
	
//	@ImportoDerivato (value="fnc_siac_disponibilitavariare") private BigDecimal disponibilitaVariare = BigDecimal.ZERO; //derivato //eliminato 20150408
	
	//derivato
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaVariareAnno1, calcolareDiDefault=false) private BigDecimal disponibilitaVariareAnno1 = BigDecimal.ZERO;
	//derivato
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaVariareAnno2, calcolareDiDefault=false) private BigDecimal disponibilitaVariareAnno2 = BigDecimal.ZERO;
	//derivato
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaVariareAnno3, calcolareDiDefault=false) private BigDecimal disponibilitaVariareAnno3 = BigDecimal.ZERO;
	
	//derivato
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaVariareCassa, calcolareDiDefault=false) private BigDecimal disponibilitaVariareCassa = BigDecimal.ZERO;
	

	// SIAC-6881
	@XmlElementWrapper(name="listaComponenteImportiCapitolo")
	@XmlElement(name="componenteImportiCapitolo")
	private List<ComponenteImportiCapitolo> listaComponenteImportiCapitolo = new ArrayList<ComponenteImportiCapitolo>();
	
	private BigDecimal pagatoCassaIniziale = BigDecimal.ZERO;
	private BigDecimal residuoEffettivo = BigDecimal.ZERO;
	private BigDecimal residuoEffettivoIniziale = BigDecimal.ZERO;
	
	@Override
	public ImportiCapitolo clone() {
		final ImportiCapitolo ic = new ImportiCapitolo();
		ic.setAnnoCompetenza(annoCompetenza);
		ic.setStanziamento(stanziamento);
		ic.setStanziamentoCassa(stanziamentoCassa);
		ic.setStanziamentoCassaIniziale(stanziamentoCassaIniziale);
		ic.setStanziamentoIniziale(stanziamentoIniziale);
		ic.setStanziamentoProposto(stanziamentoProposto);
		ic.setStanziamentoResiduo(stanziamentoResiduo);
		ic.setStanziamentoResiduoIniziale(stanziamentoResiduoIniziale);
		ic.setFondoPluriennaleVinc(fondoPluriennaleVinc);
		
//		ic.setDisponibilitaVariare(disponibilitaVariare);
		ic.setDisponibilitaVariareAnno1(disponibilitaVariareAnno1);
		ic.setDisponibilitaVariareAnno2(disponibilitaVariareAnno2);
		ic.setDisponibilitaVariareAnno3(disponibilitaVariareAnno3);
		return ic;
	}
	
	/**
	 * Ottiene un ImportiCapitolo sommando gli importi della variazione passata come parametro.
	 * 
	 * @param dettVarImp
	 */
	public ImportiCapitolo addVariazione(DettaglioVariazioneImportoCapitolo dettVarImp){
		final ImportiCapitolo ic = this.clone();
		if(dettVarImp == null){
			return ic;
		}
		ic.addStanziamento(dettVarImp.getStanziamento());
		ic.addStanziamentoCassa(dettVarImp.getStanziamentoCassa());
		ic.addStanziamentoResiduo(dettVarImp.getStanziamentoResiduo());
		
		return ic;
	}
	
	/**
	 * Ottiene un ImportiCapitolo sottraendo gli importi della variazione passata come parametro.
	 * 
	 * @param dettVarImp
	 * @return 
	 */
	public ImportiCapitolo subtractVariazione(DettaglioVariazioneImportoCapitolo dettVarImp){
		final ImportiCapitolo ic = this.clone();
		if(dettVarImp == null){
			return ic;
		}
		ic.subtractStanziamento(dettVarImp.getStanziamento());
		ic.subtractStanziamentoCassa(dettVarImp.getStanziamentoCassa());
		ic.subtractStanziamentoResiduo(dettVarImp.getStanziamentoResiduo());
		
		return ic;
	}
	
//	/**
//	 * Modifica gli importi del capitolo sommando gli importi in valore assoluto della variazione passata come parametro.
//	 * 
//	 * @param dettVarImp
//	 */
//	public void addVariazioneAbs(DettaglioVariazioneImportoCapitolo dettVarImp){
//		if(dettVarImp == null){
//			return;
//		}
//		addStanziamento(dettVarImp.getStanziamento()!=null?dettVarImp.getStanziamento().abs():null);
//		addStanziamentoCassa(dettVarImp.getStanziamentoCassa()!=null?dettVarImp.getStanziamentoCassa().abs():null);
//		addStanziamentoResiduo(dettVarImp.getStanziamentoResiduo()!=null?dettVarImp.getStanziamentoResiduo().abs():null);
//	}
	
	
	
	

	public Integer getAnnoCompetenza() {
		return annoCompetenza;
	}

	public void setAnnoCompetenza(Integer annoCompetenza) {
		this.annoCompetenza = annoCompetenza;
	}

	public BigDecimal getFondoPluriennaleVinc() {
		return fondoPluriennaleVinc;
	}

	public void setFondoPluriennaleVinc(BigDecimal fondoPluriennaleVinc) {
		this.fondoPluriennaleVinc = fondoPluriennaleVinc;
	}

	public BigDecimal getStanziamento() {
		return stanziamento;
	}
	
	public void setStanziamento(BigDecimal stanziamento) {
		this.stanziamento = stanziamento;
	}

	public BigDecimal getStanziamentoCassa() {
		return stanziamentoCassa;
	}

	public void setStanziamentoCassa(BigDecimal stanziamentoCassa) {
		this.stanziamentoCassa = stanziamentoCassa;
	}
	
	public BigDecimal getStanziamentoCassaIniziale() {
		return stanziamentoCassaIniziale;
	}

	public void setStanziamentoCassaIniziale(BigDecimal stanziamentoCassaIniziale) {
		this.stanziamentoCassaIniziale = stanziamentoCassaIniziale;
	}	

	@Deprecated
	public BigDecimal getDisponibilitaVariare() {
		return getDisponibilitaVariareAnno1();
	}

	@Deprecated
	public void setDisponibilitaVariare(BigDecimal disponibilitaVariare) {
		//setDisponibilitaVariareAnno1(disponibilitaVariare);
	}

	public BigDecimal getStanziamentoIniziale() {
		return stanziamentoIniziale;
	}

	public void setStanziamentoIniziale(BigDecimal stanziamentoIniziale) {
		this.stanziamentoIniziale = stanziamentoIniziale;
	}	

	public BigDecimal getStanziamentoProposto() {
		return stanziamentoProposto;
	}

	public void setStanziamentoProposto(BigDecimal stanziamentoProposto) {
		this.stanziamentoProposto = stanziamentoProposto;
	}
	
	public void addStanziamentoProposto(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamentoProposto==null){
			this.stanziamentoProposto = BigDecimal.ZERO;
		}
		this.stanziamentoProposto = this.stanziamentoProposto.add(value);
	}

	public BigDecimal getStanziamentoResiduo() {
		return stanziamentoResiduo;
	}

	public void setStanziamentoResiduo(BigDecimal stanziamentoResiduo) {
		this.stanziamentoResiduo = stanziamentoResiduo;
	}
	
	

	public BigDecimal getStanziamentoResiduoIniziale() {
		return stanziamentoResiduoIniziale;
	}

	public void setStanziamentoResiduoIniziale(BigDecimal stanziamentoResiduoIniziale) {
		this.stanziamentoResiduoIniziale = stanziamentoResiduoIniziale;
	}
	
	
	public void addStanziamento(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamento==null){
			this.stanziamento = BigDecimal.ZERO;
		}
		this.stanziamento = this.stanziamento.add(value);
	}
	
	public void addStanziamentoCassa(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamentoCassa==null){
			this.stanziamentoCassa = BigDecimal.ZERO;
		}
		this.stanziamentoCassa = this.stanziamentoCassa.add(value);
	}
	
	public void addStanziamentoCassaIniziale(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamentoCassaIniziale==null){
			this.stanziamentoCassaIniziale = BigDecimal.ZERO;
		}
		this.stanziamentoCassaIniziale = this.stanziamentoCassaIniziale.add(value);
	}
	
	public void addStanziamentoIniziale(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamentoIniziale==null){
			this.stanziamentoIniziale = BigDecimal.ZERO;
		}
		this.stanziamentoIniziale = this.stanziamentoIniziale.add(value);
	}
	
	public void addStanziamentoResiduo(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamentoResiduo==null){
			this.stanziamentoResiduo = BigDecimal.ZERO;
		}
		this.stanziamentoResiduo = this.stanziamentoResiduo.add(value);
	}
	
	public void addStanziamentoResiduoIniziale(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamentoResiduoIniziale==null){
			this.stanziamentoResiduoIniziale = BigDecimal.ZERO;
		}
		this.stanziamentoResiduoIniziale = this.stanziamentoResiduoIniziale.add(value);
	}
	
	
	
	//-------------------------------
	
	public void subtractStanziamento(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamento==null){
			this.stanziamento = BigDecimal.ZERO;
		}
		this.stanziamento = this.stanziamento.subtract(value);
	}
	
	public void subtractStanziamentoCassa(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamentoCassa==null){
			this.stanziamentoCassa = BigDecimal.ZERO;
		}
		this.stanziamentoCassa = this.stanziamentoCassa.subtract(value);
	}
	
	public void subtractStanziamentoCassaIniziale(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamentoCassaIniziale==null){
			this.stanziamentoCassaIniziale = BigDecimal.ZERO;
		}
		this.stanziamentoCassaIniziale = this.stanziamentoCassaIniziale.subtract(value);
	}
	
	public void subtractStanziamentoIniziale(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamentoIniziale==null){
			this.stanziamentoIniziale = BigDecimal.ZERO;
		}
		this.stanziamentoIniziale = this.stanziamentoIniziale.subtract(value);
	}
	
	public void subtractStanziamentoResiduo(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamentoResiduo==null){
			this.stanziamentoResiduo = BigDecimal.ZERO;
		}
		this.stanziamentoResiduo = this.stanziamentoResiduo.subtract(value);
	}
	
	public void subtractStanziamentoResiduoIniziale(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamentoResiduoIniziale==null){
			this.stanziamentoResiduoIniziale = BigDecimal.ZERO;
		}
		this.stanziamentoResiduoIniziale = this.stanziamentoResiduoIniziale.subtract(value);
	}

	public BigDecimal getImpegnatoPlur() {
		return impegnatoPlur;
	}

	public void setImpegnatoPlur(BigDecimal impegnatoPlur) {
		this.impegnatoPlur = impegnatoPlur;
	}

	/**
	 * @return the disponibilitaVariareAnno1
	 */
	public BigDecimal getDisponibilitaVariareAnno1() {
		return disponibilitaVariareAnno1;
	}

	/**
	 * @param disponibilitaVariareAnno1 the disponibilitaVariareAnno1 to set
	 */
	public void setDisponibilitaVariareAnno1(BigDecimal disponibilitaVariareAnno1) {
		this.disponibilitaVariareAnno1 = disponibilitaVariareAnno1;
	}

	/**
	 * @return the disponibilitaVariareAnno2
	 */
	public BigDecimal getDisponibilitaVariareAnno2() {
		return disponibilitaVariareAnno2;
	}

	/**
	 * @param disponibilitaVariareAnno2 the disponibilitaVariareAnno2 to set
	 */
	public void setDisponibilitaVariareAnno2(BigDecimal disponibilitaVariareAnno2) {
		this.disponibilitaVariareAnno2 = disponibilitaVariareAnno2;
	}

	/**
	 * @return the disponibilitaVariareAnno3
	 */
	public BigDecimal getDisponibilitaVariareAnno3() {
		return disponibilitaVariareAnno3;
	}

	/**
	 * @param disponibilitaVariareAnno3 the disponibilitaVariareAnno3 to set
	 */
	public void setDisponibilitaVariareAnno3(BigDecimal disponibilitaVariareAnno3) {
		this.disponibilitaVariareAnno3 = disponibilitaVariareAnno3;
	}

	/**
	 * @return the disponibilitaVariareCassa
	 */
	public BigDecimal getDisponibilitaVariareCassa() {
		return disponibilitaVariareCassa;
	}

	/**
	 * @param disponibilitaVariareCassa the disponibilitaVariareCassa to set
	 */
	public void setDisponibilitaVariareCassa(BigDecimal disponibilitaVariareCassa) {
		this.disponibilitaVariareCassa = disponibilitaVariareCassa;
	}

	/**
	 * @return the listaComponenteImportiCapitolo
	 */
	@XmlTransient
	public List<ComponenteImportiCapitolo> getListaComponenteImportiCapitolo() {
		return listaComponenteImportiCapitolo;
	}

	/**
	 * @param listaComponenteImportiCapitolo the listaComponenteImportiCapitolo to set
	 */
	public void setListaComponenteImportiCapitolo(List<ComponenteImportiCapitolo> listaComponenteImportiCapitolo) {
		this.listaComponenteImportiCapitolo = listaComponenteImportiCapitolo == null ? 
				new ArrayList<ComponenteImportiCapitolo>() : listaComponenteImportiCapitolo;
	}

	/**
	 * @return the pagatoCassaIniziale
	 */
	public BigDecimal getPagatoCassaIniziale() {
		return this.pagatoCassaIniziale;
	}

	/**
	 * @param pagatoCassaIniziale the pagatoCassaIniziale to set
	 */
	public void setPagatoCassaIniziale(BigDecimal pagatoCassaIniziale) {
		this.pagatoCassaIniziale = pagatoCassaIniziale;
	}

	/**
	 * @return the residuoEffettivo
	 */
	public BigDecimal getResiduoEffettivo() {
		return this.residuoEffettivo;
	}

	/**
	 * @param residuoEffettivo the residuoEffettivo to set
	 */
	public void setResiduoEffettivo(BigDecimal residuoEffettivo) {
		this.residuoEffettivo = residuoEffettivo;
	}

	/**
	 * @return the residuoEffettivoIniziale
	 */
	public BigDecimal getResiduoEffettivoIniziale() {
		return this.residuoEffettivoIniziale;
	}

	/**
	 * @param residuoEffettivoIniziale the residuoEffettivoIniziale to set
	 */
	public void setResiduoEffettivoIniziale(BigDecimal residuoEffettivoIniziale) {
		this.residuoEffettivoIniziale = residuoEffettivoIniziale;
	}

}
