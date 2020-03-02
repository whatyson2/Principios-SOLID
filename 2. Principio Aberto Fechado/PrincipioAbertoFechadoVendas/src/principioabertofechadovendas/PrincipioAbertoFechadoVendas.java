/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principioabertofechadovendas;

/**
 *
 * @author whaty
 */
public class PrincipioAbertoFechadoVendas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Funcionario teste = new Fotografo("José", 0.03, 18000);
    teste.Salario();
    Funcionario novo = new Vendedor("Marcos", 0.03 , 21000);
    novo.Salario();
    Funcionario teste3 = new Supervisor("Joaquim");
    teste3.Salario();
            
    
    }
    
}
