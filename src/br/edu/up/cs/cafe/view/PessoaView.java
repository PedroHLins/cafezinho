package br.edu.up.cs.cafe.view;

import java.util.Scanner;

public class PessoaView extends BaseView{
    public int mainMenu(){
        print("\n==================\nBem vindo ao Café!\n==================");
        print("\nSelecione uma opção para continuarmos: ");
        print("\n1.Entrar como cliente\n2.Entrar como funcionario\n3.Cadastrar cliente\n0.Sair\n");
        return sc.nextInt();
    }
}
