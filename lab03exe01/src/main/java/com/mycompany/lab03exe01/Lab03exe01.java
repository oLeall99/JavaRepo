package com.mycompany.lab03exe01;

/**
 *
 * @author unifamussio
 */
public class Lab03exe01 {
    public static void main(String[] args) {
        Data data1 = new Data(24, 5, 2004);
        Data data2 = new Data(24, "agosto", 2024);
        Data data3 = new Data(145, 2004);
        
        System.out.println("Objeto 1: ");
        System.out.println(data1);
        System.out.println(data1.toString2());
        System.out.println(data1.toString3());
        System.out.println("--------------------");
        System.out.println("Objeto 2: ");
        System.out.println(data2);
        System.out.println(data2.toString2());
        System.out.println(data2.toString3());
        System.out.println("--------------------");
        System.out.println("Objeto 3: ");
        System.out.println(data3);
        System.out.println(data3.toString2());
        System.out.println(data3.toString3());
        System.out.println("--------------------");

    }
}
