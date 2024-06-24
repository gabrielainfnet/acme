package org.acme.model;

import java.util.List;

public class Funcionario {

    private String nome;
    private List<Telefone> telefones;
    private Endereco endereco;
    private Setor setor;
    private Cargo cargo;
    private double salario;

    public Funcionario(String nome, List<Telefone> telefones, Endereco endereco, Setor setor, Cargo cargo,
                       double salario) {

        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.setor = setor;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Setor getSetor() {
        return setor;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * percentual / 100;
    }

}
