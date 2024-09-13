package com.mycompany.teoria06exe03;

import java.util.Scanner;
/**
 *
 * @author unifamussio
 */
public class DemoFormas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);          
        Formas f = null;
        while(true){
            System.out.println("Formas Geometricas");
            System.out.println("------------------");
            System.out.println("Criar nova Forma:");
            System.out.println("1. Circulo");
            System.out.println("2. Retangulo");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção:");
            int opc = input.nextInt();
            
            if(opc == 3){
                System.out.println("Saindo...");
                break;
            }
            else if(opc == 1){
                System.out.println("Digite o raio do Circulo: ");
                double raio = input.nextDouble();
                f = new Circulo(raio);
                f.print();
            }
            else if(opc == 2){
                System.out.println("Digite o comprimento do Retangulo: ");
                double comprimento = input.nextDouble();
                System.out.println("Digite a largura do Retangulo: ");
                double largura = input.nextDouble();
                f = new Retangulo(comprimento, largura);
                f.print();
            }
            else{
                System.out.println("Opção inválida! tente novamente...");
            }
            System.out.println("Pressione enter para prosseguir");
            input.nextLine();
            String str = input.nextLine();
            
        }
    }
}
