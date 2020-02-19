package br.edu.cesmac.nolapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.cesmac.nolapi.repository.EditoriasRepository;
import br.edu.cesmac.nolapi.resources.domain.Editoria;

@RestController
public class EditoriasResources {
	
	@Autowired
	private EditoriasRepository editoriasRepository;

	@GetMapping(path = "/editorias")
	public List<Editoria> listarTodas() {
		return editoriasRepository.findAll();
	}
	
	@PostMapping(path = "/editorias")
	public void gravar(@RequestBody Editoria editoria) {
		editoriasRepository.save(editoria);
	}
	
	@PutMapping(path = "/editorias")
	public void editar(@RequestBody Editoria editoria) {
		editoriasRepository.update(editoria);
	}
	
	@DeleteMapping(path = "/editorias")
	public void delete(@RequestBody Editoria editoria) {
		editoriasRepository.delete(editoria);
	}
	
}