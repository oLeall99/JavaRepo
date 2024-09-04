package com.mycompany.lab04exe01;

/**
 *
 * @author unifamussio
 */
public class Estudante {
    private String nome, sobrenome, identificador;
    private static int proximoId = 30;

    public Estudante() {
    }

    public Estudante(String nome, String sobrenome, String identificador) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getProximoId() {
        return proximoId;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setProximoId(int proximoId) {
        this.proximoId = proximoId;
    }
    
    
}

