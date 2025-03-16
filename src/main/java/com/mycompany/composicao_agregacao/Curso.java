package com.mycompany.composicao_agregacao;
/**
 *
 * @author Thaison
 */
public class Curso {
    
    //Atributos
    private String nomeCurso;
    private int codCurso;
    
    //Metodo construtor do curso
    public Curso (String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public Curso(){
         this.nomeCurso = nomeCurso;
         nomeCurso = "Adefinir";
         codCurso = 0;
     }
    
    //Getters and Setters
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }
    
    
}