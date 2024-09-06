/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teoria06exe01;

/**
 *
 * @author unifamussio
 */
public class PortaAvioes extends NavioDeGuerra{
    private int numAvioes;
    
    @Override
    public void poderDeFogo(){
        System.out.println("Poder de Fogo: " + ataque * (numAvioes*numAvioes));
    }
}
