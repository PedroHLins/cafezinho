package br.edu.up.cs.cafe.model.entidades;

public class Cliente extends Pessoa{
    private int id_Cliente;
    private String email;

    public Cliente(int id_Cliente, String email, String cpf, String nome, String senha){
        super(cpf, nome, "Mudar@123");
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

    @Override
    public void exibirDados() {
        System.out.println("Id do cliente: " + getId_Cliente() + ", nome: " + getNome() +
                ", cpf: " + getCpf() + ", email: " + getEmail());
    }
}
