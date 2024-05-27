package com.fatec.cadastro_atleta.service;

import java.util.List;

import com.fatec.cadastro_atleta.model.Atleta;
import com.fatec.cadastro_atleta.model.AtletaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtletaService {

    @Autowired
    AtletaDAO aDao;

    public void inserirAtleta(Atleta a){
            aDao.inserirAtleta( a);
        }
    


}
