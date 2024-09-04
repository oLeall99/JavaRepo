package com.mycompany.lab04exe01;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab04exe01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Estudante> turma = new ArrayList<>();
        
        for(int i = 1; i <= 30; i++){
            System.out.println("Dados do Aluno " + i + ":");
            System.out.println("Nome: ");
            String nome = input.nextLine();
            System.out.println("Sobrenome: ");
            String sobrenome = input.nextLine();
            System.out.println("Identificador: ");
            String identificador = input.nextLine();
            turma.add(new Estudante(nome, sobrenome , identificador));
            System.out.println("---------------------------");
        }
        System.out.println("");
        
        int cont = 1;
        for(Estudante e: turma){
           System.out.println("Dados do Aluno " + cont + ":");
           System.out.println("Nome: " + e.getNome());
           System.out.println("Sobrenome: " + e.getSobrenome());
           System.out.println("Identificador: " + e.getIdentificador());
           System.out.println("ProximoId: " + e.getProximoId());
           System.out.println("---------------------------");
           cont++;
        }
    }
}
