package modelo;

public class Aluno extends Usuario {

	private double media;
	private int numFaltas;
	
	public Aluno(long matricula, String nome, double media, int numFaltas) {
		super(matricula, nome);
		this.media = media;
		this.numFaltas = numFaltas;
		// TODO Auto-generated constructor stub
	}
	
	public Aluno() {
		this(0, "", 0.00, 0);
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getNumFaltas() {
		return numFaltas;
	}

	public void setNumFaltas(int numFaltas) {
		this.numFaltas = numFaltas;
	}
	
	//compareTo
	public int compareTo (Aluno al) {
		return this.getNome().compareTo(al.getNome());
	}
	
	
	

}
