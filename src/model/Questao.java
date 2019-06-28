/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aluno
 */
public class Questao extends Perguntas {
    private String Texto;
    private boolean resposta;
    private int cont = 0;

    
    public Questao(String Texto, boolean resposta){
        this.Texto = Texto;
        this.resposta = resposta;
    } 

    
    public String getTexto() {
        return this.Texto;
    }
    
    public boolean getResposta() {
        return this.resposta;
    }
    
    
}
