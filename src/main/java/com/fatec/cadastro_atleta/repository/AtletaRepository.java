package com.fatec.cadastro_atleta.repository;

import com.fatec.cadastro_atleta.model.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtletaRepository extends JpaRepository<Atleta, Long> {
    List<Atleta> findByNmAtletaContainingIgnoreCaseOrNmSobrenomeContainingIgnoreCaseOrDsEmailContainingIgnoreCase(String nome, String sobrenome, String email);
}
