/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teoria07exe05;

/**
 *
 * @author unifamussio
 */

class Exception1 extends Exception{
    public Exception1(String message){
        super(message);
    }
}
class Exception2 extends Exception{
    public Exception2(String message){
        super(message);
    }
}
class Exception3 extends Exception{
    public Exception3(String message){
        super(message);
    }
}

public class Teoria07exe05 {
    public static void main(String[] args) {
        try{
            int num = 3;
            if(num == 1){
                throw new Exception1("Excecao 1");
            }
            if(num == 2){
                throw new Exception2("Excecao 2");
            }
            if(num == 3){
                throw new Exception3("Excecao 3");
            }
        }
        catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
