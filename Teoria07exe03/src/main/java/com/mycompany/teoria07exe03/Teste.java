package com.mycompany.teoria07exe03;

/**
 *
 * @author unifamussio
 */
public class Teste {
    public static void main(String[] args) {
        try{
            throw new Exception("ErroLancadoPeloTry");
        }
        catch(Exception e){
            System.out.println("Erro:" + e);
        }
        
        finally{
            System.out.println("Codigo continua");
        }
    }
}
