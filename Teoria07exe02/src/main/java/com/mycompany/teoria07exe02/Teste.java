package com.mycompany.teoria07exe02;

/**
 *
 * @author unifamussio
 */
public class Teste {
    public static void main(String[] args) {
        try{
            Math calc = null;
            System.out.println("Soma: " + calc.soma(18, 2));
        }
        catch(Exception e){
            System.out.println("Erro: " + e);
        }
        
        System.out.println("O codigo ainda funciona");
    }
}
