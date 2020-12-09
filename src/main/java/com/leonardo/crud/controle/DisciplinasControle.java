package com.leonardo.crud.controle;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

}
