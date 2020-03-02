/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principioinversaodedependencia;

/**
 *
 * @author whaty
 */
public class PrincipioInversaoDeDependencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Funcionario teste = new Fotografo("José", 0.03, 18000);
    teste.Salario();
    Vendedor novo = new Vendedor("Marcos", 0.03 , 21000);
    novo.Salario();
    
    Vendedor nov = new Vendedor("Carlos", 2, 5000);
    nov.Salario();
    nov.logar();
    nov.deslogar();
    
    Supervisor teste3 = new Supervisor("Joaquim");
    teste3.Salario();
    teste3.logar();
    teste3.deslogar();
        
    }
    
}
