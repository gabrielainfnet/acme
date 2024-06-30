package org.acme.model;

public class Endereco {
    private String rua;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;
    private Integer cep;

    private Endereco(Builder builder) {
        this.rua = builder.rua;
        this.numero = builder.numero;
        this.bairro = builder.bairro;
        this.cidade = builder.cidade;
        this.estado = builder.estado;
        this.cep = builder.cep;
    }

    public static class Builder {
        private String rua;
        private Integer numero;
        private String bairro;
        private String cidade;
        private String estado;
        private Integer cep;

        public Builder rua(String rua) {
            this.rua = rua;
            return this;
        }

        public Builder numero(Integer numero) {
            this.numero = numero;
            return this;
        }

        public Builder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public Builder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public Builder estado(String estado) {
            this.estado = estado;
            return this;
        }

        public Builder cep(Integer cep) {
            this.cep = cep;
            return this;
        }

        public Endereco build() {
            return new Endereco(this);
        }
    }
}