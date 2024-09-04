/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03exe01;

/**
 *
 * @author unifamussio
 */
public class Data {
    private int mes, dia, ano, dia_do_ano;

    public Data(int dia, int mes, int ano) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        
        findDiaAno();
    }

    public Data(int dia, String mes,int ano) {
        this.ano = ano;
        this.dia = dia;
        this.mes = verifyMes(mes);
        
        findDiaAno();
    }
    
    public Data(int dia_do_ano, int ano) {
        this.ano = ano;
        this.dia_do_ano = dia_do_ano;
        findMesAndDia(dia_do_ano);
    }


    @Override
    public String toString() {
        return  dia + "/" + mes + "/" + ano;
    }
    
    public String toString2() {
        return  verifyIntMes(mes) + " " + dia + ", " + ano;
    }
    
    public String toString3(){
        return dia_do_ano + " " + ano;
    }
    
    private boolean isAnoBisexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    
    
    private void findMesAndDia(int dias_ano){
        int[] meses_dias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (isAnoBisexto(ano)) {
            meses_dias[1] = 29; 
        }
        int soma = 0;
        for (int i = 0; i < meses_dias.length; i++){
            soma += meses_dias[i];
            if ( dias_ano <= soma){
                this.dia = dias_ano - soma + meses_dias[i];
                this.mes = i + 1;
                break;
            }
        }
    }
    
    private void findDiaAno(){
        int[] meses_dias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (isAnoBisexto(ano)) {
            meses_dias[1] = 29; 
        }
        int soma = 0;
        for (int i = 0; i < mes - 1; i++){
            soma += meses_dias[i];
        }
        soma += dia;
        this.dia_do_ano = soma;
    }
    
    private int verifyMes(String mes){
        String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho",
                           "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" 
        };
        for(int i = 0; i < meses.length; i++){
            if(mes.equals(meses[i])){
                return i + 1;
            }
        }
        return 5;
    } 
        
    private String verifyIntMes(int mes){
        String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho",
                           "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" 
        };
        if( mes <= 12 && mes >= 1){
            return meses[mes - 1];
        }
        return meses[5];
    } 

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }

    public int getDia_do_ano() {
        return dia_do_ano;
    }
    
    

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia_do_ano(int dia_do_ano) {
        this.dia_do_ano = dia_do_ano;
    }
    
    
}
