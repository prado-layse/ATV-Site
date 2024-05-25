package com.atv.siteatv.controller;

//importa LIST e MAP
import java.util.List;
import java.util.Map;

//importa os framework
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//importar classes
import com.atv.siteatv.model.Atleta;
import com.atv.siteatv.model.AtletaService;

@Controller
@ComponentScan("com.atv.siteatv.model")

public class IndexController {
    @Autowired
    private ApplicationContext context;
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/cadastro-atleta")
    public String cadastrar(Model model, @ModelAttribute Atleta atleta){
        AtletaService as = context.getBean(AtletaService.class);
        as.inserirAtleta(atleta);
        return "Atleta cadastrado com sucesso!";
    }

    @GetMapping("/listar-atletas")
    public String listar(Model model){
        AtletaService as = context.getBean(AtletaService.class);

        List<Map<String,Object>> lista = as.listarAtletas();
        model.addAttribute("lista", lista);
        return "listar";
    }
}