package com.rota.config;

import java.io.File;
import java.io.IOException;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class GeraArquivo {

	private File diretorio;

	public void criaDiretorio(String caminho) {

		diretorio = new File(caminho);
		boolean bdir = diretorio.mkdir();

	}

	public void criaArquivo(String nome) {

		try {
			File arquivo = new File(diretorio, nome);
			boolean arquivob = arquivo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Scheduled(fixedRate = 3000)
	public void listaArquivos() {

		File files = new File("/home/diego/Público/tutorial2");
		for (File file : files.listFiles()) {
			System.out.println(file);
		}

	}

	/*
	 * File diretorio = new File("/home/diego/Público/tutorial"); File arquivo = new
	 * File(diretorio, "teste.txt");
	 * 
	 * try { boolean status = diretorio.mkdir(); boolean arquivob =
	 * arquivo.createNewFile(); }catch( IOException e) { e.printStackTrace(); }
	 */
}
