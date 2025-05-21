package br.edu.up.cs.cafe.view;

import java.util.Scanner;

public class ViewMain {
    Scanner sc = new Scanner(System.in);

    public int mainMenu(){
        System.out.println("==================\nBem vindo ao Café!\n==================");
        System.out.println("\nSelecione uma opção para continuarmos: ");
        System.out.println("\n1.Entrar como cliente\n2.Entrar como funcionario\n3.Cadastrar cliente\n0.Sair\n");
        return sc.nextInt();
    }
}
