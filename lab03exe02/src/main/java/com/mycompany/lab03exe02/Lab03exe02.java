/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab03exe02;
import java.util.Scanner;
/**
 *
 * @author art5m
 */
public class Lab03exe02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Fração 1:");
        System.out.println("Numerador: ");
        int num1 = input.nextInt();
        System.out.println("Denominador: ");
        int den1 = input.nextInt();
        System.out.println("-------------------------");
        System.out.println("Fração 2:");
        System.out.println("Numerador: ");
        int num2 = input.nextInt();
        System.out.println("Denominador: ");
        int den2 = input.nextInt();
        
        // Criando Objetos
        Racional frac1 = new Racional(num1, den1);
        Racional frac2 = new Racional(num2, den2);
        
        Racional resSoma = frac1.somar(frac2);
        System.out.println("--------------------------------");
        System.out.println("Fracao 1: " + frac1 + " ( " + frac1.toDouble() + " ) " );
        System.out.println("Fracao 2: " + frac2 + " ( " + frac2.toDouble() + " ) " );
        System.out.println("--------------------------------");
        System.out.println("Soma: ");
        System.out.println(frac1 + " + " + frac2);
        System.out.println("Resultado: " + resSoma + " ( " + resSoma.toDouble() + " ) ");
        System.out.println("--------------------------------");
        
        Racional resSubtracao = frac1.subtrair(frac2);
        System.out.println("Subtrair: ");
        System.out.println(frac1 + " - " + frac2);
        System.out.println("Resultado: " + resSubtracao + " ( " + resSubtracao.toDouble() + " ) ");
        System.out.println("--------------------------------");
        
        Racional resMultiplicacao = frac1.multiplicar(frac2);
        System.out.println("Multiplicar: ");
        System.out.println(frac1 + " * " + frac2);
        System.out.println("Resultado: " + resMultiplicacao + " ( " + resMultiplicacao.toDouble() + " ) " );
        System.out.println("--------------------------------");
        
        Racional resDivisao = frac1.dividir(frac2);
        System.out.println("Dividir: ");
        System.out.println(frac1 + " / " + frac2);
        System.out.println("Resultado: " + resDivisao + " ( " + resDivisao.toDouble() + " ) ");
        System.out.println("--------------------------------");
    }
}
