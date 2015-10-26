package modelo;

public class Professor extends Usuario {
	
	private String especializacao;

	public Professor(long matricula, String nome, String especializacao) {
		super(matricula, nome);
		// TODO Auto-generated constructor stub
		this.especializacao = especializacao;
	}
	
	public Professor() {
		this(0, "", "");
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
}
