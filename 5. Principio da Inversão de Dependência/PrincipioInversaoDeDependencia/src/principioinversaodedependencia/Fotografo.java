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
public class Fotografo extends Funcionario {

    public Fotografo(String nome, double taxaComissao, double totalVendas) {
        super(nome, taxaComissao, totalVendas);
    }

    
    public Fotografo() {
    }
    
    
    @Override
    double Salario() {
    totalVendas = totalVendas * taxaComissao;
    totalVendas = totalVendas + 1200;
    System.out.println("Fotógrafo: " + this.nome+ "\nSalário: " + totalVendas);
    return totalVendas;
    }

    
}
