package com.rota.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.rota.domain.DetalhesErro;
import com.rota.services.exceptions.GrupoExisteException;
import com.rota.services.exceptions.GrupoNaoEncontradoException;

@ControllerAdvice
public class ResourceExcpetionHandler {

	@ExceptionHandler(GrupoNaoEncontradoException.class)
	public ResponseEntity<DetalhesErro> handleGrupoNaoEncontradoException(GrupoNaoEncontradoException e,
			HttpServletRequest request) {

		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404l);
		erro.setTitulo("O grupo não foi encontrado");
		erro.setMensagemDesenvolvedor("http://erros.exercicio.diego.com");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);

	}

	@ExceptionHandler(GrupoExisteException.class)
	public ResponseEntity<DetalhesErro> handleGrupoExistenteException(GrupoExisteException e,
			HttpServletRequest request) {

		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(409l);
		erro.setTitulo("Grupo já existente");
		erro.setMensagemDesenvolvedor("http://erros.exercicio.diego.com/409");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);

	}

}
