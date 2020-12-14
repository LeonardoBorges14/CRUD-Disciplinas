package com.leonardo.crud.controle;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.leonardo.crud.dao.DisciplinaDAO;
import com.leonardo.crud.dominio.Disciplina;

@Controller
public class DisciplinasControle {
	
	@GetMapping("/disciplinas")
	public String disciplinasTabela(Model modelo) {
		DisciplinaDAO dao = new DisciplinaDAO();
		List<Disciplina> lista = dao.todos();
		modelo.addAttribute("lista",lista);
		return "disciplinas"; 
	}
	
	@GetMapping("/cadastro")
	public String mostraFormulario(Model modelo) {
		modelo.addAttribute("disciplina", new Disciplina());
		return "form-disciplina";
	}
		
	@PostMapping("/cadastro")
	public String processaFormulario(Disciplina disciplina) {
	DisciplinaDAO dao = new DisciplinaDAO();
	dao.inserir(disciplina);
		return "redirect:/disciplinas";
	}


}
