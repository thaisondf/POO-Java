package com.mycompany.composicao_agregacao;
import java.util.Scanner;
/**
 *
 * @author Thaison
 */
public class Main{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Sigla da Universidade: ");
        String siglaUniversidade = scanner.nextLine();
        
        System.out.print("Nome da universidade: ");
        String nomeUniversidade = scanner.nextLine();
        
        System.out.print("Sigla do Instituto: ");
        String siglaInstituto = scanner.nextLine();
        
        System.out.print("Nome do Instituto: ");
        String nomeInstituto = scanner.nextLine();
 
        Instituto instituto = new Instituto(siglaInstituto, nomeInstituto);

        Universidade universidade = new Universidade(siglaUniversidade, nomeUniversidade, instituto);
        
        System.out.print("Deseja adicionar um novo curso S/N? ");
        String resp = scanner.nextLine();
        
        if (resp.equalsIgnoreCase("S")) {
            System.out.print("Nome do curso: ");
            String nomeCurso = scanner.nextLine();
            
            System.out.print("código do curso: ");
            int codCurso = scanner.nextInt();  
            
            Curso curso = new Curso(nomeCurso);

            curso.setCodCurso(codCurso);

            instituto.setCurso(curso);
        }
        
        System.out.println("\nDADOS DA UNIVERSIDADE CADASTRADA\n");
        System.out.println("SIGLA DA UNIVERSIDADE: " + universidade.getSigla());
        System.out.println("NOME DA UNIVERSIDADE: " + universidade.getNome());
        System.out.println("SIGLA DO INSTITUTO: " + instituto.getSiglaInstituto());
        System.out.println("NOME DO INSTITUTO: " + instituto.getNomeInstituto());
        
        if (instituto.getCurso() != null) {
            System.out.println("Curso: " + instituto.getCurso().getNomeCurso() + " (" + instituto.getCurso().getCodCurso() + ")");
        } else {
            System.out.println("Nenhum curso associado ao instituto.");
        }

        scanner.close();
        
    
    }
    
}