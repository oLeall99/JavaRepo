package com.mycompany.teoria06exe03;

/**
 *
 * @author unifamussio
 */
public class Retangulo extends Formas {
    private double comprimento, largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.tipo = "Retangulo";
    }
    
    public double area(){
        return comprimento*largura;
    }
        
    @Override
    public double perimetro(){
     return 2*(comprimento+largura);   
    };
    
    @Override
    public void print(){
        System.out.println(tipo + ":");
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Largura: " + largura);
        System.out.println("Area: " + this.area());
        System.out.println("Perimetro: " + this.perimetro());
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
