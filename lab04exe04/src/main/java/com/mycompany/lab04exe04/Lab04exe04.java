package com.mycompany.lab04exe04;

import java.util.ArrayList;

/**
 *
 * @author art5m
 */
public class Lab04exe04 {

    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        Carro car1  = new Carro(), car2  = new Carro(), car3 = new Carro();
        
        car1.newSportCar("Vermelho");
        carros.add(car1);
        
        car2.newSUVCar("Azul");
        carros.add(car2);
        
        car3.newPicapeCar("Preto");
        carros.add(car3);
        
        for(Carro c: carros){
            System.out.println(c);
        }
        
    }
}
