/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teoria06exe01;

/**
 *
 * @author unifamussio
 */
public class NavioMercante extends Navio {
    private double capacidadeCarga, carga;

    
    void carregamento(){
        exibirInfoGeral();
        System.out.println("Carregamento: ");
        System.out.println("Carga: " + carga);
        System.out.println("Capacidade de Carga: " + capacidadeCarga);
        System.out.println("Volume: " + carga / capacidadeCarga + "%");
    }
}
