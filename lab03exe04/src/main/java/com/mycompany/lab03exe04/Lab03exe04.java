/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03exe04;
import java.util.ArrayList;
/**
 *
 * @author unifamussio
 */
public class Lab03exe04 {
    public static void main(String[] args) {
        // Utilizei Composição na qual:
        // Disciplina detém 1 ou muitos professores e pode ter 1 ou muitos alunos
        
        ArrayList<Aluno> alunos = new ArrayList<>(); 
        
        alunos.add(new Aluno("Arthur Leal", "222230179", "Ciencia da computacao"));
        
        
        ArrayList<Professor> professores = new ArrayList<>();
        
        professores.add(new Professor("Gabriela Biondi", "Ciencia da computacao"));
        professores.add(new Professor("Luciano Rossi", "Ciencia da computacao")); 
        professores.add(new Professor("Isaac Jesus da Silva","Ciencia da computacao"));
        
        Disciplina poo = new Disciplina(
                "CC3642", 
                "Orientação a Objetos",
                alunos,
                professores
        );
        
        
        System.out.println(poo);
    }
}
