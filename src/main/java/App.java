import java.sql.Connection;
import java.util.List;

import dao.Dao;
import dao.TarefaDAO;
import model.Tarefa;

public class App {

    public static void main(String[] args) {
        System.out.println(Dao.getStatusConexao());
        Connection conexao = Dao.getConexao();
        System.out.println(Dao.getStatusConexao());

        TarefaDAO dao = new TarefaDAO();
        List<Tarefa> lista = dao.listar();

        lista.forEach(tarefa -> System.out.println(tarefa.getDescricao()));

        int consultarTarefar = 1;

        Tarefa tarefaConsulta = dao.consultarPorId(consultarTarefar);

        if (tarefaConsulta != null) {
            System.out.println("Tarefa encontrada:");
            System.out.println("ID: " + tarefaConsulta.getId());
            System.out.println("Descrição: " + tarefaConsulta.getDescricao());
            System.out.println("Status: " + tarefaConsulta.getStatus());
        } else {
            System.out.println("Tarefa não encontrada para: " + consultarTarefar);
        }

        /*Tarefa novaTarefa = new Tarefa(); 
        novaTarefa.setDescricao("Nova Tarefa");
        novaTarefa.setStatus(false);

        if (dao.incluir(novaTarefa)) { 
            System.out.println("Tarefa incluída com sucesso");
        } else {
            System.out.println("Tarefa não foi incluída");
        }*/

        /*Tarefa editarTarefa= new Tarefa(); 
        editarTarefa.setId(1);
        editarTarefa.setDescricao("Estudar para a prova");
        editarTarefa.setStatus(false);

        if (dao.editar(editarTarefa)) { 
            System.out.println("Tarefa editada com sucesso");
        } else {
            System.out.println("Não foi possível editar a tarefa");
        } */

        /*int excluirTarefa = 3;

        if (dao.excluir(excluirTarefa)) {
            System.out.println("Tarefa excluída com sucesso");
        } else {
            System.out.println("Não foi possível excluir a tarefa");
            System.out.println();
        } */
    }
}











