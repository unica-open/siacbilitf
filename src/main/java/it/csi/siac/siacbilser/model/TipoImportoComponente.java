/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

public enum TipoImportoComponente {

	STANZIAMENTO("Stanziamento"),
	IMPEGNATO("Impegnato");
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private TipoImportoComponente(String nome){
		this.nome=nome;
	}
	
	
}
