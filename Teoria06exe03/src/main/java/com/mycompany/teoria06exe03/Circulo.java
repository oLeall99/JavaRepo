package com.mycompany.teoria06exe03;

/**
 *
 * @author unifamussio
 */
public class Circulo extends Formas{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
        this.tipo = "Circulo";
    }
    
    public double area(){
     return pi * (raio*raio);   
    }
    
    @Override
    public double perimetro(){
     return 2*pi*raio;   
    };
    
    @Override
    public void print(){
        System.out.println(tipo + ":");
        System.out.println("Raio: " + raio);
        System.out.println("Area: " + this.area());
        System.out.println("Perimetro: " + this.perimetro());
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }

    public String getTipo() {
        return tipo;
    }
}