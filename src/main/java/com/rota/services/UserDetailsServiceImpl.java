package com.rota.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rota.domain.Funcionario;
import com.rota.repository.FuncionarioRepository;
import com.rota.security.UsuarioSS;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private FuncionarioRepository repo;

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Funcionario fun = repo.findByLogin(login);

		if (fun == null) {
			throw new UsernameNotFoundException(login);
		}

		return new UsuarioSS(fun.getId(), fun.getLogin(), fun.getSenha(), fun.getPerfis());
	}

}
