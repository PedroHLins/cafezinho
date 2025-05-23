package br.edu.up.cs.cafe.view;

import java.util.Scanner;

public abstract class BaseView {
    Scanner sc = new Scanner(System.in);

    public void print(String msg){
        System.out.println(msg);
    }
    public String lerString(String msg){
        System.out.println(msg);
        return sc.next();
    }
    public int lerInt(String msg){
        System.out.println(msg);
        while (true){
            try{
                return Integer.parseInt(sc.next());
            } catch (NumberFormatException e){
                System.out.println("Valor invalido, tente novamente!");
            }
        }
    }

}
