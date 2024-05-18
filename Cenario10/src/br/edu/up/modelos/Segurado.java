package br.edu.up.modelos;

class Segurado {
    private String nome;
    private String RG;
    private String CPF;
    private Sexo sexo;
    private String telefone;
    private String endereco;
    private String CEP;
    private String cidade;

    @Override
    public String toString() {
        return "Segurado{" +
                "nome='" + nome + '\'' +
                ", RG='" + RG + '\'' +
                ", CPF='" + CPF + '\'' +
                ", sexo=" + sexo +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", CEP='" + CEP + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}

enum Sexo {
    MASCULINO,
    FEMININO
}

