package com.atv.siteatv.model;

public class Atleta {

    private int cdAtleta, dataNasc;
    private String nome, cpf, endereco, telefone, email;

    public Atleta(){

    }

    public Atleta(int cdAtleta, int dataNasc, String nome, String cpf, String endereco, String telefone, String email){
        this.cdAtleta = cdAtleta;
        this.dataNasc = dataNasc;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
//------------------------------------------------------
    //GETTERS e SETTERS
    public int getCD(){
        return cdAtleta;
    }

    public void setCD(int cdAtleta){
        this.cdAtleta = cdAtleta;
    }
//------------------------------------------------------
    public int getDataNasc(){
        return dataNasc;
    }

    public void setDataNasc(int dataNasc){
        this.dataNasc = dataNasc;
    }
//------------------------------------------------------
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
//------------------------------------------------------
    public String getCPF(){
        return cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }
//------------------------------------------------------
    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
//------------------------------------------------------
    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
//------------------------------------------------------
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
