/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teoria06exe01;

/**
 *
 * @author unifamussio
 */
public class Navio {
    protected int numTripulantes;
    protected String nome;

    public Navio() {
    }
    
    
    public Navio(int numTripulantes, String nome) {
        this.numTripulantes = numTripulantes;
        this.nome = nome;
    }
    
    void exibirInfoGeral(){
        System.out.println("--------------------------------------");
        System.out.println("Informações Navio:");
        System.out.println("Nome navio: " + getNome());
        System.out.println("Qtd. Tripulantes: " + getNumTripulantes());
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}


