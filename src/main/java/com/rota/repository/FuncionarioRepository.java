package com.rota.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.rota.domain.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	@Transactional(readOnly = true)
	Funcionario findByLogin(String login);
	
	
}
