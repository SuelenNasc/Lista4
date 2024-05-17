package br.edu.up.modelos;

class ClienteEmpresa extends Cliente {
    private String CNPJ;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa(String nome, String telefone, String email, Endereco endereco, double credito, String CNPJ, String inscEstadual, int anoFundacao) {
        super(nome, telefone, email, endereco, credito);
        this.CNPJ = CNPJ;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    @Override
    public String getDados() {
        return "Nome: " + getNome() + "\nCNPJ: " + CNPJ + "\nInscrição Estadual: " + inscEstadual + "\nAno de Fundação: " + anoFundacao + "\nEndereço: " + getEndereco() + "\nCrédito Disponível: R$" + getSaldo();
    }

    @Override
    public String toString() {
        return "Cliente Empresa: " + getNome();
    }
}

