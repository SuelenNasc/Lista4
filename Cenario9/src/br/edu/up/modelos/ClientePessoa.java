package br.edu.up.modelos;

class ClientePessoa extends Cliente {
    private String CPF;
    private double peso;
    private double altura;

    public ClientePessoa(String nome, String telefone, String email, Endereco endereco, double credito, String CPF, double peso, double altura) {
        super(nome, telefone, email, endereco, credito);
        this.CPF = CPF;
        this.peso = peso;
        this.altura = altura;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String getDados() {
        return "Nome: " + getNome() + "\nCPF: " + CPF + "\nPeso: " + peso + " kg\nAltura: " + altura + " m\nEndereço: " + getEndereco() + "\nCrédito Disponível: R$" + getSaldo();
    }

    @Override
    public String toString() {
        return "Cliente Pessoa: " + getNome();
    }
}

