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
public class PrincipioResponsabilidadeUnica {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CalcularCorrente i = new CalcularCorrente();
        i.calcularCorrente(220, 20);

        CalcularResistencia r = new CalcularResistencia();
        r.calcularResistencia(220, 20);
        
        CalcularTensao v = new CalcularTensao();
        v.calcularTensao(100, 2);


    
    
    
    
    }
    

}
