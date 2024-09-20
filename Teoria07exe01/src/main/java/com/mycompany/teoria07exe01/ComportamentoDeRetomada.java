package com.mycompany.teoria07exe01;
import java.util.Scanner;
public class ComportamentoDeRetomada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
            try{
                System.out.println("> Digite um numero:");
                int num1 = input.nextInt();
                
                System.out.println("> Digite outro numero:");
                int num2 = input.nextInt();
                
                int quociente = num1 /num2;
                System.out.println("O quociente: " + quociente);
                break;
            }
            catch(Exception e){
                System.out.println("Erro: "+ e);
                input.nextLine();
            }
        }
    }
}
