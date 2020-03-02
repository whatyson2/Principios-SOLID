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
public class CalcularTensao {

    private float tensao;
    private float corrente;
    private float resistencia;
    
    public float calcularTensao(float resistencia, float corrente){
            tensao = resistencia*corrente;
            System.out.println("Tensão: "+tensao);
            return tensao;
        }
         

    public CalcularTensao() {
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
