package br.com.crud.modulos;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<String> tarefa = new ArrayList<String>();
    Scanner input = new Scanner(System.in);


    public Menu(ArrayList<String> tarefa) {
        this.tarefa = tarefa;
    }

     public Menu(){}

    String mensagem = """
                \n*************************
                1- Adicionar tarefas
                2- Exibir tarefas
                3- Remover tarefas
                4- Mudar tarefas
                5- Sair
                *************************
                """;

    public void exibirMenu() {
        System.out.println(this.mensagem);
    }

    public void adicionarTarefa() {
        System.out.println("Adicione a tarefa:");
        String nomeTarefa = input.nextLine();
        tarefa.add(nomeTarefa);
        System.out.println("Adicionando tarefa...");
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void exibirTarefa() {
        System.out.println("Lista de tarefas Adicionado recentemente!");
        for (String menuLista : this.tarefa) {
            System.out.println("Lista: '" + menuLista + "'");
        }
    }

    public void removerTarefa() {
        for(String menuLista : this.tarefa) {
            System.out.println("Lista: '" + menuLista + "'");
        }

        this.tarefa.remove(this);
    }
}