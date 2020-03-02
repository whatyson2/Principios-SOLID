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
public class Supervisor extends Funcionario {
    
    @Override
    double Salario() {
        totalVendas = 3000.00;
        System.out.println("Supervisor: " + this.nome+ "\nSalário: " + totalVendas);
        return totalVendas;
    }

    public Supervisor(String nome) {
        super(nome);
    }

    public Supervisor() {
    }

   
    
}
