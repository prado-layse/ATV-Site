package com.atv.siteatv.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtletaService {

    @Autowired
        AtletaDAO aDao;

        public void inserirAtleta(Atleta a){
            aDao.inserirAtleta(a);
        }
    
    public List<Map<String, Object>> listarAtletas(){
        return aDao.listarAtletas();
    }

}
