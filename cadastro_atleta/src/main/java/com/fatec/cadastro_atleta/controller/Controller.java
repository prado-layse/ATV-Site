package com.fatec.cadastro_atleta.controller;

import com.fatec.cadastro_atleta.model.Atleta;
import com.fatec.cadastro_atleta.service.AtletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/atletas")
public class Controller {

    @Autowired
    private AtletaService atletaService;



    @GetMapping("/{id}")
    public ResponseEntity<Atleta> buscarAtletaPorId(@PathVariable Long id) {
        Optional<Atleta> atleta = atletaService.buscarAtletaPorId(id);
        return atleta.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Atleta> inserirAtleta(@RequestBody Atleta atleta) {
        Atleta novoAtleta = atletaService.inserirAtleta(atleta);
        return ResponseEntity.ok(novoAtleta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Atleta> atualizarAtleta(@PathVariable Long id, @RequestBody Atleta atletaAtualizado) {
        Atleta atleta = atletaService.atualizarAtleta(id, atletaAtualizado);
        if (atleta != null) {
            return ResponseEntity.ok(atleta);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAtleta(@PathVariable Long id) {
        boolean deletado = atletaService.deletarAtleta(id);
        if (deletado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
