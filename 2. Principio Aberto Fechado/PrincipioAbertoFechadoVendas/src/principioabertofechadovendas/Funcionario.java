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
abstract class Funcionario {
    String nome;
    String cpf;
    double taxaComissao;
    double totalVendas;
  
    abstract double Salario();

    public Funcionario(String nome, double taxaComissao, double totalVendas) {
        this.nome = nome;
        this.taxaComissao = taxaComissao;
        this.totalVendas = totalVendas;
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    

    public Funcionario() {
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

    
    
    
    
    
    
}
