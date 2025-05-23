package br.edu.up.cs.cafe.main;

import br.edu.up.cs.cafe.controller.PessoaController;

public class Main {
    public static void main(String[] args) {
        PessoaController pessoaController =  new PessoaController();
        pessoaController.inicializar();
    }
}
