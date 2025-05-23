package br.edu.up.cs.cafe.model.servicos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id_Pedido;
    private int id_Cliente;
    private int id_Vendedor;
    private List<ItemPedido> itens;

    public Pedido(int id_Pedido, int id_Cliente, int id_Vendedor){
        this.id_Pedido = id_Pedido;
        this.id_Cliente = id_Cliente;
        this.id_Vendedor = id_Vendedor;
        this.itens = new ArrayList<>();
    }

    public void setId_Pedido(int id_Pedido){
        this.id_Pedido = id_Pedido;
    }
    public void setId_Cliente(int id_Cliente){
        this.id_Cliente = id_Cliente;
    }
    public void setId_Vendedor(int id_Vendedor){
        this.id_Vendedor = id_Vendedor;
    }

    public int getId_Pedido(){
        return id_Pedido;
    }
    public int getId_Cliente(){
        return id_Cliente;
    }
    public int getId_Vendedor(){
        return id_Vendedor;
    }

    public void addProdutos(ItemPedido item){
        itens.add(item);
    }


}
