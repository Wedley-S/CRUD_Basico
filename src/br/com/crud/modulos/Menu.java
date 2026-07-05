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
        System.out.println("Qual tarefa deseja remover?");
        String nomeTarefa_Remove = input.nextLine();
        this.tarefa.remove(nomeTarefa_Remove);
        System.out.println("Removendo tarefa...");
        System.out.println("Tarefa removida com sucesso!");
    }

    public void mudarTarefa() {
        System.out.println("Qual tarefa deseja mudar?");
        String nomeTarefa_Mudar = input.nextLine();
        this.tarefa.remove(nomeTarefa_Mudar);
        System.out.println("qual tarefa colocar no lugar de: " + "'" + nomeTarefa_Mudar + "'");
        String nomeTarefa_Mudar2 = input.nextLine();
        this.tarefa.add(nomeTarefa_Mudar2);
        System.out.println("Mudando tarefa...");
        System.out.println("Tarefa mudada com sucesso!");
    }

    public void sair() {
        System.out.println("Saindo...");
    }
}