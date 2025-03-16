package com.mycompany.composicao_agregacao;
/**
 *
 * @author Thaison
 */
public class Universidade {
    
    //Atributos
    private String sigla;
    private String nome;

    //Composição mais getter e setter
    private Instituto instituto;

    public Instituto getInstituto() {
        return instituto;
    }   

    public void setInstituto(Instituto instituto) {
        this.instituto = instituto;
    }


    //Metodos construtores
    public Universidade (String sigla, String nome, Instituto instituto){
        this.nome = nome;
        this.sigla = sigla;
        this.instituto = instituto;
    }
    
    public Universidade (Instituto instituto) {
        this.instituto = instituto;
    }
    

    //Getters and Setters
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}