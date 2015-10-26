package modelo;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Curso {
	
	private String codigo;
	private String nome;
	private Professor prof;
	private List<Aluno> listaAlunos;
	
	public Curso(String codigo, String nome, Professor prof, List<Aluno> listaAlunos) {
		this.codigo = codigo;
		this.nome = nome;
		this.prof = prof;
		this.listaAlunos = listaAlunos;
	}
	
	public Curso(String codigo, String nome) {
		this(codigo, nome, new Professor(), new ArrayList<Aluno>());		
	}
	
	public Curso() {
		this("", "");		
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Professor getProf() {
		return prof;
	}
	
	public void setProf(Professor prof) {
		this.prof = prof;
	}
	
	//método de adicionar aluno
	public void addAluno (Aluno al) {
		boolean result = true;
		
		for(int i =0; i < this.listaAlunos.size(); i++) {
			if(al.getMatricula() == this.listaAlunos.get(i).getMatricula()) {
				result = false;
				break;
			}
			if (result) {
				this.listaAlunos.add(al);
			}			
		}
	}
		
	public Aluno getAluno (int index) {
		return this.listaAlunos.get(index);
	}
	
	//método de contém aluno
	public boolean containsAluno (long matricula) {
		boolean result = false;
		
		for(int i = 0; i < this.listaAlunos.size(); i++) {
			if(matricula == this.listaAlunos.get(i).getMatricula()) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	//removendo aluno pela matricula
	public void removerAluno (long matricula) {
		for (int i = 0; i < this.listaAlunos.size(); i++) {
			if (matricula == this.listaAlunos.get(i).getMatricula()) {
				this.listaAlunos.remove(i);
				break;
			}
		}
	}
	
	//removendo aluno pelo nome
	public void removerAluno (String nome) {
		for (int i = 0; i < this.listaAlunos.size(); i++) {
			if (nome.equals(this.listaAlunos.get(i).getNome())) {
				this.listaAlunos.remove(i);
				break;
			}
		}
	}
	
	//método listar alunos aprovados
	public void listarAprovados() {
		for(int i = 0; i < this.listaAlunos.size(); i++) {
			if((this.listaAlunos.get(i).getMedia() > 7.00) && (this.listaAlunos.get(i).getNumFaltas() <= 15)) {
				System.out.printf("MATRICULA: %d \nNOME: %s\n", this.listaAlunos.get(i).getMatricula(), this.listaAlunos.get(i).getNome());
			}
		}
	}
	
	//método listar reprovados
	public void listarReprovados() {
		for(int i = 0; i < this.listaAlunos.size(); i++) {
			if(this.listaAlunos.get(i).getNumFaltas() > 15) {
				System.out.printf("MATRICULA: %d \nNOME: %s\n", this.listaAlunos.get(i).getMatricula(), this.listaAlunos.get(i).getNome());
			}
		}
	}
	
	//método listar ordenadamente
	public void listarOrdem() {
		Collections.sort(this.listaAlunos);
		for(int i = 0; i < this.listaAlunos.size(); i++) {
			System.out.printf("MATRICULA: %d \nNOME: %s\n", this.listaAlunos.get(i).getMatricula(), this.listaAlunos.get(i).getNome());
		}
	}
	
}


