/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principioabertofechadoerrado;

/**
 *
 * @author whaty
 */
public class PrincipioAbertoFechadoErrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Funcionario teste = new Funcionario(1,"Marcio");
    teste.salario();
    Funcionario teste2 = new Funcionario(1, "Jose", 0.07, 23000);
    teste2.salario();

    
    }
    
}
