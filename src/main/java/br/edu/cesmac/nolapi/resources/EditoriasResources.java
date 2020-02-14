package br.edu.cesmac.nolapi.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.cesmac.nolapi.resources.domain.Editoria;

@RestController
public class EditoriasResources {

	@GetMapping(path = "/editorias")
	public List<Editoria> listarTodas() {
		Editoria e1 = new Editoria((long) 1, "Esportes");
		Editoria e2 = new Editoria((long) 2, "Cultura");

		Editoria[] editorias = { e1, e2 };

		return Arrays.asList(editorias);
	}

}
