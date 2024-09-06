/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teoria06exe01;

/**
 *
 * @author unifamussio
 */
public class NavioDeGuerra extends Navio{
    protected double ataque, blindagem;

    
    public void poderDeFogo(){
        System.out.println("Poder de Fogo: " + ataque);
    }
    
    void exibirArmas(){
        exibirInfoGeral();
        System.out.println("Armamento: ");
        poderDeFogo();
        System.out.println("Blindagem: " + blindagem);
    }
    
    public double getAtaque() {
        return ataque;
    }
    public double getBlindagem() {
        return blindagem;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public void setBlindagem(double blindagem) {
        this.blindagem = blindagem;
    }
    
    
}
