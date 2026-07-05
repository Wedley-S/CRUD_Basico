package br.com.crud.principal;

import br.com.crud.modulos.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        int op = 0;

        do {
            menu.exibirMenu();
            op = input.nextInt();

            switch (op) {
                case 1:
                    menu.adicionarTarefa();
                    break;
                case 2:
                    menu.exibirTarefa();
                    break;
                case 3:
                    menu.removerTarefa();
                    break;
                case 4:
                    menu.mudarTarefa();
                    break;
                case 5:
                    menu.sair();
                    break;
            }
        }while (op != 5);
    }
}