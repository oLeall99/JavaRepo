package com.mycompany.teoria06exe02;
import java.util.Scanner;
/**
 *
 * @author unifamussio
 */
public class DemoOpeMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        OpeMath operacao = null;
        while(true){
            System.out.println("Digite o tipo de operacao:");
            System.out.println("1. Soma");
            System.out.println("2. Subtracao");
            System.out.println("3. Multiplicacao");
            System.out.println("4. Sair");
            int opcao = input.nextInt();
        
            if (opcao > 0 && opcao < 4){
                System.out.println("--------------------");
                System.out.println("Digite valor de A:");
                double a = input.nextDouble();
                System.out.println("Digite o valor de B:");
                double b = input.nextDouble();
                
                if(opcao == 1){
                    operacao = new Soma();
                }
                else if(opcao == 2){
                    operacao = new Subtracao();
                }
                else{
                    operacao = new Multiplicacao();
                }
                System.out.println("O valor da operacao é " + operacao.calcular(a, b));
            }
            else if(opcao == 4){
                System.out.println("Saindo...");
                break;
            }
            else{
                System.out.println("Opção inválida! tente novamente...");
            }
        }
    }
}
