package org.acme.model;

public class FuncionarioTerceirizado extends Funcionario {
    private String empresaContratante;
    private Integer tempoContrato;

    private FuncionarioTerceirizado(Builder builder) {
        super(builder);
        this.empresaContratante = builder.empresaContratante;
        this.tempoContrato = builder.tempoContrato;
    }

    public static class Builder extends Funcionario.Builder<Builder> {
        private String empresaContratante;
        private Integer tempoContrato;

        public Builder empresaContratante(String empresaContratante) {
            this.empresaContratante = empresaContratante;
            return this;
        }

        public Builder tempoContrato(Integer tempoContrato) {
            this.tempoContrato = tempoContrato;
            return this;
        }

        @Override
        public FuncionarioTerceirizado build() {
            return new FuncionarioTerceirizado(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    @Override
    public void aumentarSalario(double percentual) {
        throw new UnsupportedOperationException("Funcionário terceirizado não pode receber aumento de salário");
    }

    public void renovarContrato(Integer novoTempoContrato) {
        this.tempoContrato = novoTempoContrato;
    }
}