package br.edu.up.cs.cafe.model.servicos;

public class Produto {
    private String nome;
    private int estoque;
    private double preco;

    public Produto(String nome, int estoque, double preco){
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public int getEstoque(){
        return estoque;
    }
    public double getPreco(){
        return preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }


}
