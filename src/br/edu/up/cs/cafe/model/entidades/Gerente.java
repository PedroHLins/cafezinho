package br.edu.up.cs.cafe.model.entidades;
import br.edu.up.cs.cafe.model.servicos.Produto;
import br.edu.up.cs.cafe.controller.ProdutoController;

public class Gerente extends Funcionario{
    public Gerente(int id_Funcionario, String cargo, String nome, String cpf, String senha){
        super(id_Funcionario, cargo, nome, cpf, senha);
    }
}
