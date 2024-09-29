/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author art5m
 */
public class Pessoa {
    private final String nome, sobrenome, cpf, sexo;
    private final int idade;

    public Pessoa(String nome, String sobrenome, String cpf, String sexo, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Dados:\n    nome.......: " + nome 
                + "\n    sobrenome..: " + sobrenome 
                + "\n    CPF........: " + cpf 
                + "\n    idade......: " + idade 
                + "\n    sexo.......: " + sexo;
    }
    
    
}
