package com.mycompany.composicao_agregacao;
/**
 *
 * @author Thaison
 */
public class Instituto {
    //Atributos
    private String siglaInstituto;
    private String nomeInstituto;
    
    
    //Agregação mais getter e setter
    private Curso curso;
    
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    //Método Construtor Paramétrico
    public Instituto (String siglaInstituto, String nomeInstituto){
        this.siglaInstituto = siglaInstituto;
        this.nomeInstituto =  nomeInstituto;
    }
    
    //Métodos
    public String verificarCurso () {
        //Validando se o curso está na grade ou não
        if(curso == null)
            return "Este curso não está na grade";
        else
            return curso.getNomeCurso();   
    }
    
    // Getters and Setters
    public String getSiglaInstituto() {
        return siglaInstituto;
    }

    public void setSiglaInstituto(String siglaInstituto) {
        this.siglaInstituto = siglaInstituto;
    }

    public String getNomeInstituto() {
        return nomeInstituto;
    }

    public void setNomeInstituto(String nomeInstituto) {
        this.nomeInstituto = nomeInstituto;
    }
   
}