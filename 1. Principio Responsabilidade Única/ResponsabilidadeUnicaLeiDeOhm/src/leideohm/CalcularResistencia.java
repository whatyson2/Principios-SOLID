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
public class CalcularResistencia {

    private float tensao;
    private float corrente;
    private float resistencia;
    
    public CalcularResistencia() {
    }
    
    

    public float calcularResistencia(float tensao, float corrente){
            resistencia = tensao/corrente;
            System.out.println("Resistencia: "+resistencia);
            return resistencia;
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
