package com.rota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rota.config.GeraArquivo;

@SpringBootApplication
public class RotaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RotaApplication.class, args);
		
		GeraArquivo ga = new GeraArquivo();
		ga.criaDiretorio("/home/diego/Público/tutorial2");
		ga.criaArquivo("tutorial22.txt");

		ga.listaArquivos();
	

		
	}

	
	
}
