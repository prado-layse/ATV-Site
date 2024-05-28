package com.fatec.cadastro_atleta.controller;

import com.fatec.cadastro_atleta.service.AtletaService;
import org.springframework.beans.factory.annotation.Autowired;
import com.fatec.cadastro_atleta.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/atletas")
public class Controller {

    @Autowired
    private AtletaService atletaService;

    @GetMapping("/{id}")
    public ResponseEntity<Atleta> buscarAtletaPorId(@PathVariable Long id) {
        Atleta atleta = new Atleta();
        if (atleta != null) {
            return ResponseEntity.ok(atleta);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Atleta> atualizarAtleta(@PathVariable Long id, @RequestBody Atleta atletaAtualizado) {
        Atleta atleta = new Atleta();
        if (atleta != null) {
            return ResponseEntity.ok(atleta);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAtleta(@PathVariable Long id) {
        boolean deleted = false;
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

