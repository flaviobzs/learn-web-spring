package br.edu.cesmac.nolapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.cesmac.nolapi.resources.domain.Editoria;

@Repository
public interface EditoriasRepository extends JpaRepository<Editoria, Long> {

}
