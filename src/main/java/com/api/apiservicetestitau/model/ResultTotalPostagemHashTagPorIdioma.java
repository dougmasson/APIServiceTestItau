package com.api.apiservicetestitau.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Result")
@NamedStoredProcedureQueries({
  @NamedStoredProcedureQuery(
    name = "TotalPostagemHashTagPorIdiomaPais", 
    procedureName = "TotalPostagemHashTagPorIdioma", 
    resultClasses = { ResultTotalPostagemHashTagPorIdioma.class } ) 
})
public class ResultTotalPostagemHashTagPorIdioma implements Serializable {
	private static final long serialVersionUID = -2166815681205844559L;

	@Column(name="dataexecucao")
	private Date DataExecucao;
	
	@Id
	@Column(name="descricao")
	private String Descricao;
	
	@Column(name="idioma")
	private String Idioma;
	
	@Column(name="total")
	private int Total;
		
	public Date getDataExecucao() {
		return DataExecucao;
	}

	public String getDescricao() {
		return Descricao;
	}

	public String getIdioma() {
		return Idioma;
	}

	public int getTotal() {
		return Total;
	}

	public void setDataExecucao(Date dataExecucao) {
		DataExecucao = dataExecucao;
	}

	public void setDescricao(String descricao) {
		this.Descricao = descricao;
	}

	public void setIdioma(String idioma) {
		this.Idioma = idioma;
	}

	public void setTotal(int total) {
		this.Total = total;
	}
}
