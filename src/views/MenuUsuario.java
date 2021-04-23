package views;

import java.util.Scanner;

import models.Usuario;

public class MenuUsuario {
	public static void menu(){
		Scanner sc = new Scanner (System.in);
		
		int escolha;
		
		do {	
			System.out.println("\n***SISTEMA DE LOCAÇÃO DE LIVROS***\n");
			System.out.println("1- Cadastro de usuário.");
			System.out.println("2- Listar usuários");
			System.out.println("3- Alugar livros");
			System.out.println("4- Listar livros");
			System.out.println("0- Sair");
			System.out.println("Escolha uma opção:");
			
			escolha = sc.nextInt();
			switch(escolha) {
				case 1:
					CadastrarUsuarios.renderizar();
					break;
				case 2:
					ListarUsuarios.renderizar();
					break;
				case 3:
					System.out.println("Locação de livros");
					break;
				case 4:
					System.out.println("Listagem de livros disponiveis");
					break;
				case 0:
					System.out.println("Saindo do Sistema...");
					break;
				default:
					System.out.println("Você escolheu uma opção inválida");
			}
			
		}while(escolha != 0);
		
		sc.close();
	}
}
