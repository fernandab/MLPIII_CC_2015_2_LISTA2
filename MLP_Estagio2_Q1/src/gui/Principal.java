package gui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import modelo.Item;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Item> listaProdutos = new ArrayList<Item>();
		
		String aux;
		
		do {
			Item i = new Item();
			
			//intera��o com o usu�rio
			System.out.println("Digite o c�dito do produto :");
			i.setCodItem(scan.nextInt());
			System.out.println("Digite a descri��o do produto :");
			i.setDescitem(scan.next());
			
			//adicionando i na lista de produtos
			listaProdutos.add(i);
			
			//verificando se est� vazia
			if(listaProdutos.isEmpty()) {
				System.out.println("\nEsse elemento n�o cont�m na lista de produtos.");
			}
			else {
				System.out.println("\nA lista de produtos n�o est� vazia.");
			}
			
			//verificaindo se o item est� na lista de produtos
			if(i.getCodItem()==(888)) {
				System.out.println("\nO valor que voc� pesquisou foi encontrado.");				
			} else {
				System.out.println("\nO valor que voc� pesquisou n�o foi encontrado.");
			}
			System.out.println("\nDeseja adicionar outro produto?\n[S/N]");
			aux = scan.next();
			
		} while (aux.equals ("S"));
		
		//ordenando com collections
		Collections.sort(listaProdutos);		
		//imprimindo
		System.out.println(listaProdutos);
		
	}

}
