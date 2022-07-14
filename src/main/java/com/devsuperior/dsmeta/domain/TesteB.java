package com.devsuperior.dsmeta.domain;

public class TesteB {
    private String nome;
    private String rua;
    private String bairro;
    private String complemento;
    private String city;
    private String state;

    public TesteB(String nome, String rua, String bairro, String complemento) {
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = complemento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
