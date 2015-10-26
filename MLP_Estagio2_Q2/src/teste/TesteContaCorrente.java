package teste;

import java.util.ArrayList;

import org.junit.Test;

import modelo.Conta;
import modelo.ContaCorrente;
import junit.framework.TestCase;

public class TesteContaCorrente extends TestCase {
	private Conta conta;
	private ArrayList listaContas;
	
	@Test
	protected void SetUp() {
		listaContas = new ArrayList();
		conta = new Conta();		
	}
	
	//teste de depósito
	public void testDeposita() {
		
		double result = conta.setSaldo(800.00);
		conta.Deposita(800.00);
		System.out.println(conta.getSaldo());
		
		assertEquals(conta.getSaldo(), 500.00);
		assertFalse(conta);
		assertTrue(conta);
		assertNotNull(conta);
	}
	
	//teste de saque
	protected void testSaca() {
		double result = conta.setSaldo(300.00);
		conta.Saca(50.00);
		System.out.println(conta.getSaldo());
		
		assertEquals(conta.getSaldo(), 250.00);
		assertFalse(conta);
		assertTrue(conta);
		assertNotNull(conta);
	}
	
	protected void tearDown() {
		listaContas.clear();
	}
	
	protected void setUp2() {
		listaContas = new ArrayList();
		conta = new ContaCorrente();		
	}
	
	private void assertFalse(Conta conta2) {
		
	}
	
	private void assertTrue(Conta conta2) {
		
	}
	
	
}
