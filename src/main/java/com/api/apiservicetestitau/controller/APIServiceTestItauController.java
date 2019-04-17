package com.api.apiservicetestitau.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.apiservicetestitau.model.ResultExibirUsuarioMaioresSeguidos;
import com.api.apiservicetestitau.model.ResultTotalPostagemHashTagPorIdioma;
import com.api.apiservicetestitau.model.ResultTotalPostagemPorHora;

@RestController
@RequestMapping("/testeItau")
public class APIServiceTestItauController {

	@PersistenceContext
	EntityManager em;
	
	@RequestMapping("/ExibirUsuarioMaioresSeguidos")
	public ResultExibirUsuarioMaioresSeguidos[] ExibirUsuarioMaioresSeguidos() {

		StoredProcedureQuery pr_ExibirUsuarioMaioresSeguidos = em.createNamedStoredProcedureQuery("ExibirUsuarioComMaioresNumeroSeguidos");

		List elist = (List) pr_ExibirUsuarioMaioresSeguidos.getResultList();

		return (ResultExibirUsuarioMaioresSeguidos[])elist.toArray(new ResultExibirUsuarioMaioresSeguidos[elist.size()]);
	}

	@RequestMapping("/TotalPostagemPorHora")
	public ResultTotalPostagemPorHora[] TotalPostagemPorHora() {

		StoredProcedureQuery pr_ExibirUsuarioMaioresSeguidos = em.createNamedStoredProcedureQuery("TotalPostagemAgrupadaPorHora");

		List elist = (List) pr_ExibirUsuarioMaioresSeguidos.getResultList();

		return (ResultTotalPostagemPorHora[])elist.toArray(new ResultTotalPostagemPorHora[elist.size()]);
	}
	
	@RequestMapping("/TotalPostagemHashTagPorIdioma")
	public ResultTotalPostagemHashTagPorIdioma[] TotalPostagemHashTagPorIdioma() {

		StoredProcedureQuery pr_ExibirUsuarioMaioresSeguidos = em.createNamedStoredProcedureQuery("TotalPostagemHashTagPorIdiomaPais");

		List elist = (List) pr_ExibirUsuarioMaioresSeguidos.getResultList();

		return (ResultTotalPostagemHashTagPorIdioma[])elist.toArray(new ResultTotalPostagemHashTagPorIdioma[elist.size()]);
	}
}
