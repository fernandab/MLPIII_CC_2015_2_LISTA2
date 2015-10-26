package gui;

import java.util.Scanner;

import modelo.Aluno;
import modelo.Curso;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Curso curso = new Curso();
		int op;
		
		do {
			System.out.println("----- MENU -----\n");
			System.out.println("Digite as opções confirme a lista abaixo\n");
			
			System.out.println("1 Adicionar alunos.");
			System.out.println("2 Remover alunos.");
			System.out.println("3 Verificar se o aluno está matriculado.");
			System.out.println("4 Listar alunos aprovador.");
			System.out.println("5 Listar alunos reprovados por falta.");
			System.out.println("6 Listar alunos por ordem alfabética.");
			System.out.println("7 Sair.");
			op = scan.nextInt();
			
			switch(op) {
				case 1: {
					Aluno aluno = new Aluno();
					System.out.println("----- ADICIONAR ALUNO -----");
					System.out.println("Digite os seguintes campos:");
					System.out.println("MATRICULA: ");
					aluno.setMatricula(scan.nextLong());
					System.out.println("NOME: ");
					aluno.setNome(scan.next());
					System.out.println("MEDIA: ");
					aluno.setMedia(scan.nextDouble());
					System.out.println("NUMERO DE FALTAS: ");
					aluno.setNumFaltas(scan.nextInt());
					curso.addAluno(aluno);
					break;				
				}
				case 2: {
					System.out.println("----- REMOVER ALUNO -----");
					System.out.println("Digite o nome ou a matricula do aluno que deseja remover: ");
					String aux = scan.next();
					
					if((aux.charAt(0) >= '0') && (aux.charAt(0) <= '9')) {
						curso.removerAluno(Integer.parseInt(aux));
					}
					else {
						curso.removerAluno(aux);
					}
					break;
					
				}
				case 3: {
					System.out.println("----- VERIFICAR SE O ALUNO ESTÁ APROVADO -----");
					long matricula = scan.nextLong();
					System.out.printf("O aluno %s matriculado!", curso.containsAluno(matricula) ? "ESTÁ" : "NÃO ESTÁ");
					break;						
				}
				case 4: {
					System.out.println("----- LISTAR ALUNOS APROVADOS -----");
					curso.listarAprovados();
					break;					
				}
				case 5: {
					System.out.println("----- LISTAR ALUNOS REPROVADOS POR FALTA -----");
					curso.listarReprovados();
					break;
				}
				case 6: {
					System.out.println("----- LISTAR ALUNOS POR ORDEM ALFABÉTICA -----");
					curso.listarOrdem();	
					break;
				}
				default: {
					break;
				}
			}
			
		} while (op != 7);
		scan.close();
		
	}

}
