package br.edu.up;

public class Programa {
    public static void main(String[] args) throws Exception {
        
        Ano ano2024 = new Ano(2024, false);

        Mes janeiro = new Mes(31, "Janeiro");
        ano2024.adicionarMes(janeiro);

        Compromisso comp1 = new Compromisso("João", "Escritório", "Reunião", 9);
        Compromisso comp2 = new Compromisso("Maria", "Café", "Encontro", 14);

        janeiro.adicionarCompromisso(comp1, 15);
        janeiro.adicionarCompromisso(comp2, 15);

        System.out.println("Compromissos do dia 15 de Janeiro:");
        System.out.println(janeiro.listarCompromissos(15));

        janeiro.excluirCompromisso(15, 9);

        System.out.println("Compromissos do dia 15 de Janeiro após exclusão:");
        System.out.println(janeiro.listarCompromissos(15));

        System.out.println("Todos os compromissos do mês de Janeiro:");
        System.out.println(ano2024.listarCompromissos("Janeiro"));
    }
}

