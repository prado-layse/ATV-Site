package com.fatec.cadastro_atleta.controller;

import com.fatec.cadastro_atleta.model.Atleta;
import com.fatec.cadastro_atleta.service.AtletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AtletaController {

    @Autowired
    private AtletaService atletaService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/cadastro-atleta")
    public String showCadastroForm() {
        return "cadastro_atleta";
    }

    @PostMapping("/cadastro-atleta")
    public String cadastrarAtleta(@ModelAttribute Atleta atleta, Model model) {
        atletaService.inserirAtleta(atleta);
        model.addAttribute("message", "Atleta cadastrado com sucesso!");
        return "result";
    }

    @GetMapping("/listar-atletas")
    public String listarAtletas(Model model) {
        model.addAttribute("atletas", atletaService.listarAtletas());
        return "listar";
    }
}
