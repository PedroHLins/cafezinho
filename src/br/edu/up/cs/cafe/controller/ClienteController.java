package br.edu.up.cs.cafe.controller;

import br.edu.up.cs.cafe.model.entidades.Cliente;
import br.edu.up.cs.cafe.view.ClienteView;

import java.util.ArrayList;

public class ClienteController {
    ClienteView clienteView = new ClienteView();
    public ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente() {
        Cliente novoCliente = clienteView.dadosCadastro();
        this.clientes.add(novoCliente);
        clienteView.print("\nCliente cadastrado com sucesso!");
    }
}
