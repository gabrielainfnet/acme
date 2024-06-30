package org.acme.model;

import java.util.List;

public class Funcionario {
    protected String nome;
    protected List<Telefone> telefones;
    protected Endereco endereco;
    protected Setor setor;
    protected Cargo cargo;
    protected double salario;

    protected Funcionario(Builder<?> builder) {
        this.nome = builder.nome;
        this.telefones = builder.telefones;
        this.endereco = builder.endereco;
        this.setor = builder.setor;
        this.cargo = builder.cargo;
        this.salario = builder.salario;
    }

    public static class Builder<T extends Builder<T>> {
        protected String nome;
        protected List<Telefone> telefones;
        protected Endereco endereco;
        protected Setor setor;
        protected Cargo cargo;
        protected double salario;

        public T nome(String nome) {
            this.nome = nome;
            return self();
        }

        public T telefones(List<Telefone> telefones) {
            this.telefones = telefones;
            return self();
        }

        public T endereco(Endereco endereco) {
            this.endereco = endereco;
            return self();
        }

        public T setor(Setor setor) {
            this.setor = setor;
            return self();
        }

        public T cargo(Cargo cargo) {
            this.cargo = cargo;
            return self();
        }

        public T salario(double salario) {
            this.salario = salario;
            return self();
        }

        @SuppressWarnings("unchecked")
        protected T self() {
            return (T) this;
        }

        public Funcionario build() {
            return new Funcionario(this);
        }
    }

    public void aumentarSalario(double percentual) {
        salario += salario * percentual / 100;
    }
}