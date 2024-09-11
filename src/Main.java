//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Teste de tarefa 1");
        listaTarefas.adicionarTarefa("Teste de tarefa 2");

        listaTarefas.obterDescricoesTodasTarefas();
        listaTarefas.imprimirQuantidadeTarefas(listaTarefas.obterQuantidadedeTarefas());

        listaTarefas.removerTarefaByDescricao("Teste de tarefa 1");


        listaTarefas.obterDescricoesTodasTarefas();
        listaTarefas.imprimirQuantidadeTarefas(listaTarefas.obterQuantidadedeTarefas());


    }
}