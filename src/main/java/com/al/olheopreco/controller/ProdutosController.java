package com.al.olheopreco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.al.olheopreco.model.*;

@Controller
public class ProdutosController {

	@GetMapping("/produto/novo")
	public String novo(Model model){
		//cria objeto do tipo produto
		model.addAttribute(new Produto());
		//carregar o combo de unidadesMedidas
		model.addAttribute("unidadesMedida",UnidadeMedida.values());
		
		return "produto/cadastro-produto";
	}
	
	
	@PostMapping("/produto/novo")
	public String salvar(){
		return "teste";
	}
	
}
