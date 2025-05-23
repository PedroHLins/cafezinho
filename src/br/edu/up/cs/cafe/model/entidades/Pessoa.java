package br.edu.up.cs.cafe.model.entidades;

public abstract class Pessoa {
    private String cpf;
    private String nome;
    private String senha;

    public Pessoa(String cpf, String nome, String senha){
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
    }
    public String getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }

    public abstract void exibirDados();
}
