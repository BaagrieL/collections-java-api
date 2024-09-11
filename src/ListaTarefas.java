import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefaByDescricao(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        tarefas.removeAll(tarefasParaRemover);
    }

    public int obterQuantidadedeTarefas() {
        return tarefas.size();
    }

    public void imprimirQuantidadeTarefas(int nTarefas) {
        System.out.println("Total de tarefas: "  + nTarefas);
    }

    public void obterDescricoesTodasTarefas() {
        List<Tarefa> listaDescricoes = new ArrayList<>();

        for (Tarefa t : tarefas) {
            System.out.println(t.getDescricao());
        }
    }
}
