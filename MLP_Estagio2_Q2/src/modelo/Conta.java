package modelo;

public class Conta {
	private String nome;
	private String numero;
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public double setSaldo(double saldo) {
		return this.saldo = saldo;
	}
	
	//método sacar
	public double Saca(double valor) {
		return this.saldo -= valor;		
	}
	
	//método depositar
		public double Deposita(double valor) {
			return this.saldo += valor;			
		}
	
	

}
