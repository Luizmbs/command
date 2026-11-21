package org.example;

import java.util.ArrayList;
import java.util.List;

public class Librarian {

    private List<Task> tarefas = new ArrayList<Task>();

    public void executarTarefa(Task tarefa) {
        this.tarefas.add(tarefa);
        tarefa.executar();
    }

    public void cancelarUltimaTarefa() {
        if (tarefas.size() != 0) {
            Task tarefa = this.tarefas.get(this.tarefas.size() - 1);
            tarefa.cancelar();
            this.tarefas.remove(this.tarefas.size() - 1);
        }
    }

}
