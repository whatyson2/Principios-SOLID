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
public class LeiDeOhmErrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        LeiDeOhm formula1 = new LeiDeOhm();
        formula1.calcularCorrente(220, 20);
        formula1.calcularResistencia(220, 10);
        formula1.calcularTensao(100, 2);
                
                
    }
    
}
