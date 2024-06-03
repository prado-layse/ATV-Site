package com.fatec.cadastro_atleta.service;

import com.fatec.cadastro_atleta.model.Atleta;
import com.fatec.cadastro_atleta.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtletaService {

    @Autowired
    private AtletaRepository atletaRepository;

    public Atleta inserirAtleta(Atleta atleta) {
        return atletaRepository.save(atleta);
    }

    public List<Atleta> listarAtletas() {
        return atletaRepository.findAll();
    }

    public List<Atleta> listarAtletas(String query) {
        if (query == null || query.isEmpty()) {
            return atletaRepository.findAll();
        } else {
            return atletaRepository.findByNmAtletaContainingIgnoreCaseOrNmSobrenomeContainingIgnoreCaseOrDsEmailContainingIgnoreCase(query, query, query);
        }
    }

    public Optional<Atleta> buscarAtletaPorId(Long id) {
        return atletaRepository.findById(id);
    }

    public Atleta atualizarAtleta(Long id, Atleta atletaAtualizado) {
        Optional<Atleta> optionalAtleta = atletaRepository.findById(id);
        if (optionalAtleta.isPresent()) {
            Atleta atleta = optionalAtleta.get();
            atleta.setNmAtleta(atletaAtualizado.getNmAtleta());
            atleta.setNmSobrenome(atletaAtualizado.getNmSobrenome());
            atleta.setDtNascimento(atletaAtualizado.getDtNascimento());
            atleta.setDsEndereco(atletaAtualizado.getDsEndereco());
            atleta.setSgEstado(atletaAtualizado.getSgEstado());
            atleta.setDsTelefone(atletaAtualizado.getDsTelefone());
            atleta.setDsEmail(atletaAtualizado.getDsEmail());
            return atletaRepository.save(atleta);
        } else {
            return null;
        }
    }

    public boolean deletarAtleta(Long id) {
        if (atletaRepository.existsById(id)) {
            atletaRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }


}
