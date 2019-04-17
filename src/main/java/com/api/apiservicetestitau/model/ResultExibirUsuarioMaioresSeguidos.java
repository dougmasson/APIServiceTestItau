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
    name = "ExibirUsuarioComMaioresNumeroSeguidos", 
    procedureName = "ExibirUsuarioMaioresSeguidos", 
    resultClasses = { ResultExibirUsuarioMaioresSeguidos.class } ) 
})
public class ResultExibirUsuarioMaioresSeguidos implements Serializable {

	private static final long serialVersionUID = -6236359109890647011L;

	@Column(name="dataexecucao")
	private Date DataExecucao;

	@Id
	@Column(name="usuario")
	private String Usuario;
	
	@Column(name="qtdseguidores")
	private int QtdSeguidores;
	
	public Date getDataExecucao() {
		return DataExecucao;
	}
	public void setDataExecucao(Date dataExecucao) {
		DataExecucao = dataExecucao;
	}
	
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	
	public int getQtdSeguidores() {
		return QtdSeguidores;
	}
	public void setQtdSeguidores(int qtdSeguidores) {
		QtdSeguidores = qtdSeguidores;
	}
} 