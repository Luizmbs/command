package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibrarianTest {

    @Test
    void deveEmprestarLivro() {
        Librarian bibliotecario = new Librarian();
        Book livro = new Book("Livro A");
        Task emprestimo = new LoanTask(livro);
        bibliotecario.executarTarefa(emprestimo);

        assertEquals("Livro emprestado", livro.getSituacao());
    }

    @Test
    void deveDevolverLivro() {
        Librarian bibliotecario = new Librarian();
        Book livro = new Book("Livro A");
        Task devolucao = new ReturnTask(livro);
        bibliotecario.executarTarefa(devolucao);

        assertEquals("Livro devolvido", livro.getSituacao());
    }

    @Test
    void deveCancelarDevolucaoLivro() {
        Librarian bibliotecario = new Librarian();
        Book livro = new Book("Livro A");
        Task emprestimo = new LoanTask(livro);
        Task devolucao = new ReturnTask(livro);

        bibliotecario.executarTarefa(emprestimo);
        bibliotecario.executarTarefa(devolucao);

        bibliotecario.cancelarUltimaTarefa();

        assertEquals("Livro emprestado", livro.getSituacao());
    }

}
