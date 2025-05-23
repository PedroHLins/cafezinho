package br.edu.up.cs.cafe.model.entidades;

public class Funcionario extends Pessoa{
    private int id_Funcionario;
    private String cargo;

    public Funcionario(int id_Funcionario, String cargo, String nome, String cpf, String senha) {
        super(cpf, nome, "Mudar@123");
        this.id_Funcionario = id_Funcionario;
        this.cargo = cargo;
    }
    public int getId_Funcionario(){
        return id_Funcionario;
    }
    public String getCargo(){
        return cargo;
    }

    public void setId_Funcionario(int id_Funcionario){
        this.id_Funcionario = id_Funcionario;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    @Override
    public void exibirDados() {
        System.out.println("id do funcionário: " + getId_Funcionario() +
                ", nome: " + super.getNome() + ", cargo: " + getCargo());
    }
}
