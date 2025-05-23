package br.edu.up.cs.cafe.controller;

import br.edu.up.cs.cafe.model.servicos.Produto;

import java.util.HashMap;
import java.util.Map;

public class ProdutoController {
    //id e produto
    Map<Integer, Produto> produtos = new HashMap<Integer, Produto>();

    public void addProduto(String nome, int estoque, double preco, int id){
        produtos.put(id, new Produto(nome, estoque, preco));
        System.out.println("Produto " + produtos.get(id).getNome() + " adicionado com sucesso");
    }
    public void removerProduto(int id){
        produtos.remove(id);
        System.out.println("Produto removido com sucesso");
    }


}
