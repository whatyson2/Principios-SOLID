/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leideohm;

/**
 *
 * @author whaty
 */
public class CalcularCorrente {

    private float tensao;
    private float corrente;
    private float resistencia;


    public CalcularCorrente() {
    }
    
    
     public float calcularCorrente(float tensao, float resistencia){
            corrente = tensao/resistencia;
            System.out.println("Corrente: "+corrente);
            return corrente;
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
