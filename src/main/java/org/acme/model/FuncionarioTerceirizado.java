package org.acme.model;

import java.util.List;

public class FuncionarioTerceirizado extends Funcionario {
    private String empresaContratante;
    private Integer tempoContrato;

    //bad smells: long parameter list
    //refactorings: padrão builder
    public FuncionarioTerceirizado(String nome, List<Telefone> telefones, Endereco endereco, Setor setor,
                                   Cargo cargo, double salario, String empresaContratante, Integer tempoContrato) {

        super(nome, telefones, endereco, setor, cargo, salario);
        this.empresaContratante = empresaContratante;
        this.tempoContrato = tempoContrato;
    }

    public String getEmpresaContratante() {
        return empresaContratante;
    }

    public Integer getTempoContrato() {
        return tempoContrato;
    }

    public void setEmpresaContratante(String empresaContratante) {
        this.empresaContratante = empresaContratante;
    }

    public void setTempoContrato(Integer tempoContrato) {
        this.tempoContrato = tempoContrato;
    }

    @Override
    public void aumentarSalario(double percentual) {
        throw new UnsupportedOperationException("Funcionário terceirizado não pode receber aumento de salário");
    }
}