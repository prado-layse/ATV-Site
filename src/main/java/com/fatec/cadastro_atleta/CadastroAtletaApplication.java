package com.fatec.cadastro_atleta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class CadastroAtletaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroAtletaApplication.class, args);
	}
}

