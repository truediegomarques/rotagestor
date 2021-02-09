package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.rota.domain.Funcionario;
import com.rota.repository.FuncionarioRepository;
import com.rota.services.exceptions.ExisteException;
import com.rota.services.exceptions.NaoEncontradoException;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repo;

	@Autowired
	private BCryptPasswordEncoder pe;

	public List<Funcionario> listar() {
		return repo.findAll();
	}

	public Funcionario salvar(Funcionario funcionario) {
		if (funcionario.getId() != null) {
			Optional<Funcionario> fn = repo.findById(funcionario.getId());

			if (!fn.isEmpty()) {
				throw new ExisteException("O funcionário já existe");
			}

		}

		funcionario.setSenha(pe.encode(funcionario.getSenha()));

		return repo.save(funcionario);
	}

	public Funcionario buscar(Long id) {
		Optional<Funcionario> funcionario = repo.findById(id);

		if (funcionario.isEmpty()) {
			throw new NaoEncontradoException("funcionário não encontrado!");
		}

		return funcionario.get();
	}

	public Funcionario buscar(String login) {
		Funcionario funcionario = repo.findByLogin(login);

		if (funcionario == null) {
			throw new NaoEncontradoException("funcionário não encontrado!");
		}

		return funcionario;
	}

	public void deletar(Long id) {
		try {
			repo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new NaoEncontradoException("O funcionário não foi encontrado");
		}

	}

	public void atualizar(Funcionario funcionario) {
		verificarExistencia(funcionario);

		// Gambiarra para não perder a senha
		if (funcionario.getSenha() == null) {
			Funcionario f = buscar(funcionario.getId());
			funcionario.setSenha(f.getSenha());
		}

		repo.save(funcionario);

	}

	private void verificarExistencia(Funcionario funcionario) {
		buscar(funcionario.getId());
	}

}
