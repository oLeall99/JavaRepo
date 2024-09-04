/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03exe02;

/**
 *
 * @author art5m
 */
public class Racional {
    private int numerador, denominador;

    public Racional() {
    }

    public Racional(int numerador, int denominador) {
        int mdc = calcularMDC(numerador, denominador);
        this.numerador   = numerador / mdc;
        this.denominador = denominador / mdc;
    }
    
    private int calcularMDC(int a, int b){
        while( b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    

    public void setNumerador(int numerador) {
        int mdc = calcularMDC(numerador, denominador);
        this.numerador = numerador / mdc;
    }

    public void setDenominador(int denominador) {
        int mdc = calcularMDC(numerador, denominador);
        this.denominador = denominador / mdc;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    
    public Racional somar(Racional outro){
        int novoNumerador = this.numerador * outro.denominador + outro.numerador * this.denominador;
        int novoDenominador = this.denominador * outro.denominador;
        int mdc = calcularMDC(novoNumerador, novoDenominador);
        novoNumerador /= mdc;
        novoDenominador /= mdc;
        
        return new Racional(novoNumerador, novoDenominador);
    }
    
    public Racional subtrair(Racional outro){
        int novoNumerador = this.numerador * outro.denominador - outro.numerador * this.denominador;
        int novoDenominador = this.denominador * outro.denominador;
        int mdc = calcularMDC(novoNumerador, novoDenominador);
        novoNumerador /= mdc;
        novoDenominador /= mdc;
        
        return new Racional(novoNumerador, novoDenominador);
    }
    
    public Racional multiplicar(Racional outro){
        int novoNumerador = this.numerador * outro.numerador;
        int novoDenominador = this.denominador * outro.denominador;
        int mdc = calcularMDC(novoNumerador, novoDenominador);
        novoNumerador /= mdc;
        novoDenominador /= mdc;
        
        return new Racional(novoNumerador, novoDenominador);
    }
    
    public Racional dividir(Racional outro){
        int novoNumerador = this.numerador * outro.denominador;
        int novoDenominador = this.denominador * outro.numerador;
        int mdc = calcularMDC(novoNumerador, novoDenominador);
        novoNumerador /= mdc;
        novoDenominador /= mdc;
        
        return new Racional(novoNumerador, novoDenominador);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
    
    public double toDouble() {
        return (double) numerador / denominador;
    }
    
    
}
