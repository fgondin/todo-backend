package model;

public class Tarefa {
	
	@Override
	public String toString() {
		return "Tarefa [id=" + id + ", descricao=" + descricao + ", status=" + status + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	private Integer id;
	private String descricao;
	private Boolean status;
}
