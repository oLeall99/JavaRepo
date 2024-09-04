/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03exe04;

/**
 *
 * @author unifamussio
 */
public class Aluno {
    private String nome, RA, curso;

    public Aluno(String nome, String RA, String curso) {
        this.nome = nome;
        this.RA = RA;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return  nome + ", RA: " + RA + ", curso: " + curso;
    }
    
    public String getNome() {
        return nome;
    }

    public String getRA() {
        return RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
