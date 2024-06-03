package com.fatec.cadastro_atleta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fatec.cadastro_atleta.model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

