/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leideohmerrado;


/**
 *
 * @author whaty
 */
public class LeiDeOhm {
    private float tensao;
    private float corrente;
    private float resistencia;

    public LeiDeOhm(float tensao, float corrente, float resistencia) {
        this.tensao = tensao;
        this.corrente = corrente;
        this.resistencia = resistencia;
    }

    public LeiDeOhm() {
        
    }

    public float calcularCorrente(float tensao, float resistencia){
            corrente = tensao/resistencia;
            System.out.println("Corrente: "+corrente);
            return corrente;
        }
    
    public float calcularResistencia(float tensao, float corrente){
            resistencia = tensao/corrente;
            System.out.println("Resistencia: "+resistencia);
            return resistencia;
        }
    
     public float calcularTensao(float resistencia, float corrente){
            tensao = resistencia*corrente;
            System.out.println("Tensão: "+tensao);
            return tensao;
        }
    

    public float getTensao() {
        return tensao;
    }

    public void setTensao(float tensao) {
        this.tensao = tensao;
    }

    public float getCorrente() {
        return corrente;
    }

    public void setCorrente(float corrente) {
        this.corrente = corrente;
    }

    public float getResistencia() {
        return resistencia;
    }

    public void setResistencia(float resistencia) {
        this.resistencia = resistencia;
    }

    

   
    
    
    
}
