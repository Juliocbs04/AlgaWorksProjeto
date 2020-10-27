package com.algaworks.osworks.osworksapi.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.osworks.osworksapi.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{

	//é possivel implementar alguns métodos seguindo o padrão
	List<Cliente> findByNome(String nome);
	
	//Lógica do like
	List<Cliente> findByNomeContaining(String nome);
	Cliente findByEmail(String email);
}
