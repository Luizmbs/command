package org.example;

public class Book {

    private String titulo;
    private String situacao;

    public Book(String titulo) {
        this.titulo = titulo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void emprestar() {
        this.situacao = "Livro emprestado";
    }

    public void devolver() {
        this.situacao = "Livro devolvido";
    }
}
