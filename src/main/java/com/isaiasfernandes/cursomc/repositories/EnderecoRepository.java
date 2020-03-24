package com.isaiasfernandes.cursomc.repositories;

import com.isaiasfernandes.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
	
}
