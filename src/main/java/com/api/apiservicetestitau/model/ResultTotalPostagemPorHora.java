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
    name = "TotalPostagemAgrupadaPorHora", 
    procedureName = "TotalPostagemPorHora", 
    resultClasses = { ResultTotalPostagemPorHora.class } ) 
})
public class ResultTotalPostagemPorHora implements Serializable {
	
	private static final long serialVersionUID = -1322886536971155282L;
	
	@Id
	@Column(name="dataexecucao")
	private Date DataExecucao;

	@Column(name="data")
	private String Data;
	
	@Id
	@Column(name="hora")
	private String Hora;
	
	@Id
	@Column(name="total")
	private int Total;

	public Date getDataExecucao() {
		return DataExecucao;
	}

	public String getData() {
		return Data;
	}

	public String getHora() {
		return Hora;
	}

	public int getTotal() {
		return Total;
	}

	public void setDataExecucao(Date dataExecucao) {
		DataExecucao = dataExecucao;
	}

	public void setData(String data) {
		Data = data;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public void setTotal(int total) {
		Total = total;
	}
}
