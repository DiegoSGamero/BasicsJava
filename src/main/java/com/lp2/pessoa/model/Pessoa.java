package com.lp2.pessoa.model;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    
    // construtor padrao
    public Pessoa(){};

    // construtor alternativo 1
    public Pessoa(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    };

    // construtor alternativo 2
    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.endereco = "São Paulo";
        this.telefone = telefone;
    };

    // getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    };

    public String getNome() {
        return nome;
    };

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    };

    public String getEndereco() {
        return endereco;
    };

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    };

    public String getTelefone() {
        return telefone;
    };
}
