package org.example;

public class ReturnTask implements Task {

    private Book livro;

    public ReturnTask(Book livro) {
        this.livro = livro;
    }

    public void executar() {
        this.livro.devolver();
    }

    public void cancelar() {
        this.livro.emprestar();
    }
}
