/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04exe02;
import java.util.Scanner;
/**
 *
 * @author unifamussio
 */
public class Lab04exe02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Maior numero entre 3 valores:");
        System.out.println("1 Valor: ");
        int value1 = input.nextInt();
        
        System.out.println("2 Valor: ");
        int value2 = input.nextInt();
        
        System.out.println("3 Valor: ");
        int value3 = input.nextInt();
        
        System.out.println("O maior valor e " + Matematica.max3(value1, value2, value3));
        
        
        boolean value = Matematica.impar(true, false, false);
        System.out.println("A entrada de true e impar: " + value);
        
        boolean valueMaioria = Matematica.maioria(false, true, false);
        System.out.println("A maioria do valor e: " + valueMaioria);
        
    }
}
