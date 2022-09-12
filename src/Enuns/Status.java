package Enuns;

public enum Status {
    BACKLOG("BackLog"),
    ASSESMENT("Assesment"),
    TODO("To Do"),
    BUSINESSCASE("Business Case"),
    DONE("Done");

    private String nome;

    Status(String nome) {this.nome = nome;}
}
