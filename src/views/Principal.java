package views;

import java.util.Scanner;

//import views.MenuUsuario;

public class Principal {
		public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
	
		int escolha;
			
		do {
		System.out.println("\n***SISTEMA DE LOCA��O DE LIVROS***\n");
		System.out.println("Voc� Deseja Entar Como Administrador Ou Usu�rio?");
		System.out.println("Tecle 1 Para Administrador e 2 Para Usu�rio Ou 0 Para Sair!");
	
		escolha = sc.nextInt();
		switch (escolha) {
			case 1: {
				MenuAdministrador.menu();
			}
			case 2:{
				MenuUsuario.menu();
			}
			case 0:{
				System.out.println("Saindo do Sistema...");
				break;
			}
			default:
				System.out.println("Voc� escolheu uma op��o inv�lida");
			}
		}while(escolha != 0);
		sc.close();
	}
}
