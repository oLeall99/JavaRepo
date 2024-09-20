/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teoria07exe04;

/**
 *
 * @author unifamussio
 */

class ErrorException extends Exception{
    public ErrorException(String message){
        super(message);
    }
}

public class Teoria07exe04 {

    
    public static void main(String[] args) {
        try{
            throw new ErrorException("Uma excecao que causa erro!");
        }
        catch(ErrorException e){
            System.out.println("Exception: " + e);
        }
    }
}
