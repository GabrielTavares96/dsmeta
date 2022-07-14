package com.devsuperior.dsmeta.domain;

public class TesteA {

    private String nome;
    private String street;
    private String bairro;
    private String complement;
    private String cidade;
    private String state;

    public TesteA(String nome, String street, String bairro, String complement) {
        this.nome = nome;
        this.street = street;
        this.bairro = bairro;
        this.complement = complement;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
