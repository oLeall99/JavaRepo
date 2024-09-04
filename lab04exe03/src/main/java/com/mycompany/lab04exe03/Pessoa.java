package com.mycompany.lab04exe03;

/**
 *
 * @author unifamussio
 */
public class Pessoa {
    private String nome, telefone;
    private static int id = 0;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        
        this.id = id + 1;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static void setId(int id) {
        Pessoa.id = id;
    }
    
    

    @Override
    public String toString() {
        return "Pessoa: " + nome + ", telefone: " + telefone;
    }
    
    
}
