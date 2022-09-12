package Enuns;

public enum TamanhoDemanda {
    MUITOPEQUENO("Muito pequeno"),
    PEQUENO("Pequeno"),
    MEDIO("Médio"),
    GRANDE("Grande"),
    MUITOGRANDE("Muito Grande");

    private String nome;

    TamanhoDemanda(String nome) {
        this.nome = nome;
    }
}
