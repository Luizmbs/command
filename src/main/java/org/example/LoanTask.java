package org.example;

public class LoanTask implements Task {

    private Book livro;

    public LoanTask(Book livro) {
        this.livro = livro;
    }

    public void executar() {
        this.livro.emprestar();
    }

    public void cancelar() {
        this.livro.devolver();
    }
}
