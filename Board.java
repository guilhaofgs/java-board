import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Tarefa> tarefas;

    public Board() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void listarTarefas() {
        System.out.println("=== Tarefas do Board ===");
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);
            System.out.println((i+1) + ". " + t.getDescricao() + " - " + (t.isConcluida() ? "Concluída" : "Pendente"));
        }
    }
}