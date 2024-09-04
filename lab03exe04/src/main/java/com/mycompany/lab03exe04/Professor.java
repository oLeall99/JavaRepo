/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03exe04;

/**
 *
 * @author unifamussio
 */
public class Professor {
    private String nome, departamento;

    public Professor(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return  nome + ", Departamento: " + departamento;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
