package views;

import java.util.Scanner;

import models.Usuario;

public class MenuUsuario {
	public static void menu(){
		Scanner sc = new Scanner (System.in);
		
		int escolha;
		
		do {	
			System.out.println("\n***SISTEMA DE LOCA��O DE LIVROS***\n");
			System.out.println("1- Cadastro de usu�rio.");
			System.out.println("2- Listar usu�rios");
			System.out.println("3- Alugar livros");
			System.out.println("4- Listar livros");
			System.out.println("0- Sair");
			System.out.println("Escolha uma op��o:");
			
			escolha = sc.nextInt();
			switch(escolha) {
				case 1:
					CadastrarUsuarios.renderizar();
					break;
				case 2:
					ListarUsuarios.renderizar();
					break;
				case 3:
					System.out.println("Loca��o de livros");
					break;
				case 4:
					System.out.println("Listagem de livros disponiveis");
					break;
				case 0:
					System.out.println("Saindo do Sistema...");
					break;
				default:
					System.out.println("Voc� escolheu uma op��o inv�lida");
			}
			
		}while(escolha != 0);
		
		sc.close();
	}
}
