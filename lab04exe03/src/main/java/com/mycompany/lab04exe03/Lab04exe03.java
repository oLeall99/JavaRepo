package com.mycompany.lab04exe03;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab04exe03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pessoa> agenda = new ArrayList<>();
        
        while(true){
            // loop principal da aplicação
            System.out.println("> Agenda:");
            System.out.println("  N. Add Contato");
            System.out.println("  D. Delete Contato");
            System.out.println("  P. Print todos contatos");
            System.out.println("  Q. Sai do programa");
            System.out.println("opcao:");
            String option = input.nextLine();
            
            // realiza a opção desejada pelo usuário
            if(option.toLowerCase().equals("n") ){ // Adiciona um novo usuário
                System.out.println("-------------------------");
                System.out.println("Nome do Contato:");
                String nome = input.nextLine();
                System.out.println("Telefone do Contato:");
                String tel = input.nextLine();
                agenda.add(new Pessoa(nome, tel));
                System.out.println("Contato Criado!");
                System.out.println("-------------------------");
            }
            else if(option.toLowerCase().equals("d")){ // Deleta um usuário pelo nome
                System.out.println("-------------------------");
                System.out.println("Nome do Contato a ser Deletado:");
                String nome = input.nextLine();
                
                int index = 0, isDeleted = 0;
                for(Pessoa p: agenda){
                    if(p.getNome().equals(nome)){
                        agenda.remove(index);
                        isDeleted = 1;
                        System.out.println("Contato deletado!");
                        break;
                    }
                    index++;
                }
                
                if(isDeleted == 0){
                    System.out.println("Contato não encontrado!");
                }
                System.out.println("-------------------------");
            }
            else if(option.toLowerCase().equals("p")){ // lista todos os usuários
                System.out.println("-------------------------");
                if(agenda.isEmpty()){
                    System.out.println("Agenda Vazia...");
                }
                else{
                    for(Pessoa p: agenda){
                    System.out.println(p);
                }
                }
                System.out.println("-------------------------");
            }
            else if(option.toLowerCase().equals("q")){ // encerra o loop principal
                System.out.println("-------------------------");
                System.out.println("Encerrando...");
                break;
            }
            else{ // caso o usuário entre com uma opção inválida
                System.out.println("Opcao inválida, tente novamente");
            }
        }
    }
}
