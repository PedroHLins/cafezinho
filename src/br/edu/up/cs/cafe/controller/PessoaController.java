package br.edu.up.cs.cafe.controller;

import br.edu.up.cs.cafe.view.PessoaView;

public class PessoaController {
    PessoaView pessoaView = new PessoaView();
    ClienteController clienteController = new ClienteController();

    public void inicializar(){
        do{
            switch (pessoaView.mainMenu()){
                case 1:
                    break;
                case 2:
                    break;
                case 3: clienteController.cadastrarCliente();
                    break;
                case 0: pessoaView.print("Finalizando...");
                    return;
                default: pessoaView.print("Selecione uma opção válida");
            }
        } while (true);
    }
}
