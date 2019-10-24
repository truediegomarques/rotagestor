package com.rota.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rota.domain.Usuario;
import com.rota.repository.UsuarioRepository;

@Service("userDetailsService")
public class ImplementsUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = repo.findByLogin(username);

		if (usuario == null) {
			throw new UsernameNotFoundException("usuário não encontrador");
		}

		return usuario;
	}

}
