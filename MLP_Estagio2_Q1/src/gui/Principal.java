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
			
			//interação com o usuário
			System.out.println("Digite o códito do produto :");
			i.setCodItem(scan.nextInt());
			System.out.println("Digite a descrição do produto :");
			i.setDescitem(scan.next());
			
			//adicionando i na lista de produtos
			listaProdutos.add(i);
			
			//verificando se está vazia
			if(listaProdutos.isEmpty()) {
				System.out.println("\nEsse elemento não contém na lista de produtos.");
			}
			else {
				System.out.println("\nA lista de produtos não está vazia.");
			}
			
			//verificaindo se o item está na lista de produtos
			if(i.getCodItem()==(888)) {
				System.out.println("\nO valor que você pesquisou foi encontrado.");				
			} else {
				System.out.println("\nO valor que você pesquisou não foi encontrado.");
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
