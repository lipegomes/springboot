package gomes.filipe.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import gomes.filipe.forum.domain.Curso;
import gomes.filipe.forum.domain.Topico;
import gomes.filipe.forum.dto.TopicoDTO;

@Controller
public class TopicosController {

	@RequestMapping("/topicos")
	@ResponseBody
	public List<TopicoDTO> lista() {
		Topico topico = new Topico("Dúvida", "Qual a função da anotação @Controller", new Curso("Spring Boot", "Programação"));
		
		return TopicoDTO.converte(Arrays.asList(topico, topico, topico));
	}
	
}
