package br.edu.cesmac.nolapi.resources;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.cesmac.nolapi.repository.EditoriasRepository;
import br.edu.cesmac.nolapi.repository.JornalistasRepository;
import br.edu.cesmac.nolapi.resources.domain.Editoria;
import br.edu.cesmac.nolapi.resources.domain.Jornalista;

@RestController
@RequestMapping("/jornalistas")
public class JornalistasResources {
	
	@Autowired
	private JornalistasRepository JornalistasRepository;
	
	@GetMapping
	public List<Jornalista> listarTodas() {
		return JornalistasRepository.findAll();
	}
	
	@PostMapping
	public void gravar(@RequestBody Jornalista jornalista) {
		JornalistasRepository.save(jornalista);
	}
	
	@PutMapping
	public void alterar(@RequestBody Jornalista jornalista) {
		JornalistasRepository.save(jornalista);
	}
	
	@DeleteMapping
	public void excluir (Jornalista jornalista) {
		JornalistasRepository.delete(jornalista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Jornalista> buscarPorId(@PathVariable("id") Long idJornalista) {
	 return JornalistasRepository.findById(idJornalista).map(jornalista ->
	 ResponseEntity.ok(jornalista)).orElse(ResponseEntity.notFound().build());
	}
}
