package br.edu.up.cs.cafe.model.entidades;

public class Cliente {
    private int id_Cliente;
    private String email;

    public Cliente(int id_Cliente, String email){
        this.id_Cliente = id_Cliente;
        this.email = email;
    }

    public int getId_Cliente(){
        return id_Cliente;
    }

    public String getEmail(){
        return email;
    }

    public void setId_Cliente(int id_Cliente){
        this.id_Cliente = id_Cliente;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
