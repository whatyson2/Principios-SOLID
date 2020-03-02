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
public class Vendedor extends Funcionario implements InterfaceLogin{

    public Vendedor(String nome, double taxaComissao, double totalVendas, boolean autentificacao) {
        super(nome, taxaComissao, totalVendas, autentificacao);
    }

    public Vendedor(String nome, double taxaComissao, double totalVendas) {
        super(nome, taxaComissao, totalVendas);
    }
    
    
    
    
    @Override
    double Salario() {
    totalVendas = totalVendas * taxaComissao;
    totalVendas = totalVendas + 1400;
    System.out.println("Vendedor: " + this.nome+ "\nSalário: " + totalVendas);
//    if(autentificacao){
//        logar();
//    }else{
//        deslogar();
//    }
    
    return totalVendas;
    }

    @Override
    public boolean logar() {
        if(!super.isAutentificacao()){
            super.setAutentificacao(true);
            System.out.println(nome+": Logado");
        }
        return super.isAutentificacao();
        }
        
    

    @Override
    public boolean deslogar() {
        if(super.isAutentificacao()){
            super.setAutentificacao(false);
            System.out.println(nome+": Deslogado");
        }
        return super.isAutentificacao();
    }
}
   
    
    
    