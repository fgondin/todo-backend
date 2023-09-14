package service;

import java.util.List;

import dao.TarefaDAO;
import model.Tarefa;

public class TarefaService {
	TarefaDAO dao = new TarefaDAO();
	
	public Tarefa buscarTarefaPorId(Integer id) {
		return dao.consultarPorId(id);
	}
	
	public List<Tarefa> listarTarefas(){
		return dao.listar();
	}
	
	public Boolean incluirTarefa(Tarefa tarefa) {
		return dao.incluir(tarefa);
	}
	
	public Boolean alterarTarefa(Tarefa tarefa) {
		return dao.editar(tarefa);
	}
	
	public Boolean excluirTarefa(Integer id) {
		return dao.excluir(id);
	}

}