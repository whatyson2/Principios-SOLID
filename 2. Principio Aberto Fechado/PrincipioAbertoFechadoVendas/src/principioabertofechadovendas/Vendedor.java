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
public class Vendedor extends Funcionario {
    
     public Vendedor(String nome, double taxaComissao, double totalVendas) {
        super(nome, taxaComissao, totalVendas);
    }

    @Override
    double Salario() {
    totalVendas = totalVendas * taxaComissao;
    totalVendas = totalVendas + 1400;
    System.out.println("Vendedor: " + this.nome+ "\nSalário: " + totalVendas);
    return totalVendas;
    }

   
    
    
    
}
