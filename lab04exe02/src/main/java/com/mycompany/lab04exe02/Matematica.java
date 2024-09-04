package com.mycompany.lab04exe02;

/**
 *
 * @author unifamussio
 */
public class Matematica {
    public static int max3(int value1, int value2, int value3){
        int maior = value1;
        
        if(value2 > maior){
            maior = value2;
        }
        
        if(value3 > maior){
            maior = value3;
        }
        
        return maior;
    }
    
    public static boolean impar(boolean value1, boolean value2, boolean value3){
        int cont = 0;
        
        if(value1){
            cont++;
        }
        if(value2){
            cont++;
        }
        if(value3){
            cont++;
        }
        
        if(cont % 2 != 0){
            return true;
        }
        
        return false;
    }
    
    public static boolean maioria(boolean value1, boolean value2, boolean value3){
        return (value1 && value2) || (value1 && value3) || (value3 && value2);  
    }
}
