/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfin2ser.model.TipoDocumento;
import it.csi.siac.sirfelser.model.FELDataDictionary;
import it.csi.siac.sirfelser.model.FatturaFEL;
 
/**
 * TipoDocFEL
 * 
 * @author FL
 * 
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class TipoDocFEL extends EntitaEnte{
	
	private static final long serialVersionUID = -3230927765534800289L;

	private FatturaFEL fattura;
	
	private String codice;
	private String descrizione;
	private String flagBilancio;
	
	//SIAC-7557 inizio FL
	private  TipoDocumento tipoDocContabiliaEntrata;
	private  TipoDocumento tipoDocContabiliaSpesa;
	//SIAC-7557 fine FL
	
	
	/**
	 * @return the fattura
	 */
	public FatturaFEL getFattura() {
		return fattura;
	}
	/**
	 * @return the tipoDocContabiliaEntrata
	 */
	public TipoDocumento getTipoDocContabiliaEntrata()
	{
		return tipoDocContabiliaEntrata;
	}
	/**
	 * @param tipoDocContabiliaEntrata the tipoDocContabiliaEntrata to set
	 */
	public void setTipoDocContabiliaEntrata(TipoDocumento tipoDocContabiliaEntrata)
	{
		this.tipoDocContabiliaEntrata = tipoDocContabiliaEntrata;
	}
	/**
	 * @return the tipoDocContabiliaSpesa
	 */
	public TipoDocumento getTipoDocContabiliaSpesa()
	{
		return tipoDocContabiliaSpesa;
	}
	/**
	 * @param tipoDocContabiliaSpesa the tipoDocContabiliaSpesa to set
	 */
	public void setTipoDocContabiliaSpesa(TipoDocumento tipoDocContabiliaSpesa)
	{
		this.tipoDocContabiliaSpesa = tipoDocContabiliaSpesa;
	}
	/**
	 * @param fattura the fattura to set
	 */
	public void setFattura(FatturaFEL fattura) {
		this.fattura = fattura;
	}
	 
	
	/**
	 * @return the codice
	 */
	public String getCodice()
	{
		return codice;
	}
	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice)
	{
		this.codice = codice;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione()
	{
		return descrizione;
	}
	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione)
	{
		this.descrizione = descrizione;
	}
	
	/**
	 * @return the flagBilancio
	 */
	public String getFlagBilancio()
	{
		return flagBilancio;
	}
	/**
	 * @param flagBilancio the flagBilancio to set
	 */
	public void setFlagBilancio(String flagBilancio)
	{
		this.flagBilancio = flagBilancio;
	}
	
	
	
	
}
