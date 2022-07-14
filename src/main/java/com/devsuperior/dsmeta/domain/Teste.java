package com.devsuperior.dsmeta.domain;

public class Teste {

    private String name;
    private String rua;
    private String bairro;
    private String complemento;
    private String city;
    private String estado;

    public Teste(String name, String rua, String bairro, String complemento, String city, String estado) {
        this.name = name;
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = complemento;
        this.city = city;
        this.estado = estado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
