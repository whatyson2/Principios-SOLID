/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principioinversaodedependenciaerrado;

/**
 *
 * @author whaty
 */
public class Funcionario {
    private int cargo;
    private String nome;
    private String cpf;
    private double taxaComissao;
    private double totalVendas;
    private boolean autentificacao;


    public double salario(){
        if(cargo == 1){ //fotografo
    totalVendas = totalVendas * taxaComissao;
    totalVendas = totalVendas + 1200;
    System.out.println("Fotógrafo: " + this.nome+ "\nSalário: " + totalVendas);
    return totalVendas;
        }
        
        else if(cargo == 2){//vendedor
    totalVendas = totalVendas * taxaComissao;
    totalVendas = totalVendas + 1400;
    System.out.println("Vendedor: " + this.nome+ "\nSalário: " + totalVendas);
    return totalVendas;
        }
        
        else if(cargo == 3){//supervisor
        totalVendas = 3000.00;
        System.out.println("Supervisor: " + this.nome+ "\nSalário: " + totalVendas);
        return totalVendas;
        }
        return 0;
    }

    public Funcionario(int cargo, String nome, double taxaComissao, double totalVendas) {
        this.cargo = cargo;
        this.nome = nome;
        this.taxaComissao = taxaComissao;
        this.totalVendas = totalVendas;
    }

    public Funcionario(int cargo, String nome) {
        this.cargo = cargo;
        this.nome = nome;
    }
    
        public boolean logar() {
        System.out.println(nome+": Logado");
        return true;
        }

    public boolean deslogar() {
        System.out.println(nome+": Deslogado");
        return false;
        }

    public boolean isAutentificacao() {
        return autentificacao;
    }

    public void setAutentificacao(boolean autentificacao) {
        this.autentificacao = autentificacao;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
    
    
    
    
}
