/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03exe04;

import java.util.ArrayList;
/**
 *
 * @author unifamussio
 */
public class Disciplina {
    private String codigo, nome;
    private ArrayList<Aluno> aluno;
    private ArrayList<Professor> professor;

    public Disciplina(String codigo, String nome, ArrayList<Aluno> aluno, ArrayList<Professor> professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.aluno = aluno;
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Disciplina: " + codigo + " - " + nome + ":\n" + "- Professores:\n" + professor + "\n------------------\n" + "- Alunos:\n" + aluno + '}';
    }
    
    public void addProfessor(Professor professor) {
        this.professor.add(professor);
    }
    
    public void addAluno(Aluno aluno) {
        this.aluno.add(aluno);
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    public ArrayList<Professor> getProfessor() {
        return professor;
    }

    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }

    public void setProfessor(ArrayList<Professor> professor) {
        this.professor = professor;
    }
    
}
