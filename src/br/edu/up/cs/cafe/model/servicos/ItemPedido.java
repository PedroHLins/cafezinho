package br.edu.up.cs.cafe.model.servicos;
import br.edu.up.cs.cafe.model.servicos.Produto;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto(){
        return produto;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

}
