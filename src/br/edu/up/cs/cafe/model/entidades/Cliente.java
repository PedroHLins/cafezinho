package br.edu.up.cs.cafe.model.entidades;

public class Cliente extends Pessoa{
    private int id_Cliente;
    private static int proxId = 1;

    public Cliente(String cpf, String nome, String senha){
        super(cpf, nome, "Mudar@123");
        this.id_Cliente = proxId++;
    }

    public int getId_Cliente(){
        return id_Cliente;
    }

    @Override
    public void exibirDados() {
        System.out.println("Id do cliente: " + getId_Cliente() + ", nome: " + getNome() +
                ", cpf: " + getCpf());
    }
}
