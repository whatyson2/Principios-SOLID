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
public class Supervisor extends Funcionario implements InterfaceLogin{
    
    @Override
    double Salario() {
        totalVendas = 3000.00;
        System.out.println("Supervisor: " + this.nome+ "\nSalário: " + totalVendas);
        logar();
        return totalVendas;
    }

    public Supervisor(String nome) {
        super(nome);
    }

    public Supervisor() {
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
