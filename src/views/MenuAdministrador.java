package views;

import java.util.Scanner;

public class MenuAdministrador {
	public static void menu(){
		Scanner sc = new Scanner (System.in);
		
		int escolha;
		int login;
		System.out.println("POR FAVOR FA�A LOGON");
		System.out.println("Login:");
		System.out.println("Senha:");
		
		login = sc.nextInt();
		if (login == 1) {
			do {	
				System.out.println("\n***SISTEMA DE LOCA��O DE LIVROS***\n");
				System.out.println("1- Cadastro de Usu�rio.");
				System.out.println("2- Cadastro de Livros.");
				System.out.println("3- Listar Usu�rios");
				System.out.println("4- Alugar Livros");
				System.out.println("5- Listar Livros");
				System.out.println("0- Sair");
				System.out.println("Escolha uma op��o:");
				
				escolha = sc.nextInt();
				switch(escolha) {
					case 1:
						CadastrarUsuarios.renderizar();
						break;
					case 2:
						System.out.println("ESPERANDO A FUN��O");
					case 3:
						ListarUsuarios.renderizar();
						break;
					case 4:
						System.out.println("Loca��o de livros");
						break;
					case 5:
						System.out.println("Listagem de livros disponiveis");
						break;
					case 0:
						System.out.println("Saindo do Sistema...");
						break;
					default:
						System.out.println("Voc� escolheu uma op��o inv�lida");
				}
			
			}while(escolha != 0);
		
		}else {
			System.out.println("Tente Novamente");
		}
		sc.close();
	}
}
