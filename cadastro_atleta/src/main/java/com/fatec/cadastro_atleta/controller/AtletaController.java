package com.fatec.cadastro_atleta.controller;

import com.fatec.cadastro_atleta.model.Atleta;
import com.fatec.cadastro_atleta.service.AtletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class AtletaController {

    @Autowired
    private AtletaService atletaService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Home");
        return "index";
    }

    @GetMapping("/cadastro-atleta")
    public String showCadastroForm(Model model) {
        model.addAttribute("pageTitle", "Cadastro de Atletas");
        model.addAttribute("atleta", new Atleta());
        return "cadastro-atleta";
    }

    @PostMapping("/cadastro-atleta")
    public String cadastrarAtleta(@ModelAttribute Atleta atleta, Model model) {
        atletaService.inserirAtleta(atleta);
        model.addAttribute("message", "Atleta cadastrado com sucesso!");
        return "result"; // Certifique-se de ter uma página HTML correspondente chamada "result.html"
    }

    @GetMapping("/atualizar-atleta/{id}")
    public String atualizarAtleta(@PathVariable Long id, Model model) {
        Optional<Atleta> atletaOptional = atletaService.buscarAtletaPorId(id);
        if (atletaOptional.isPresent()) {
            Atleta atleta = atletaOptional.get();
            model.addAttribute("pageTitle", "Atualização de Atletas");
            model.addAttribute("atleta", atleta);
            return "atualizar-atleta";
        } else {
            model.addAttribute("errorMessage", "Atleta não encontrado");
            return "error"; // Certifique-se de ter uma página de erro correspondente
        }
    }



    @GetMapping("/listar-atleta")
    public String listarAtletas(Model model) {
        model.addAttribute("pageTitle", "Lista de Atletas");
        model.addAttribute("atletas", atletaService.listarAtletas());
        return "listar-atleta";
    }
}
