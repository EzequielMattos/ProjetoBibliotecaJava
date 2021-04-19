package views;

import java.util.ArrayList;
import java.util.Scanner;

import models.Usuario;

public class Principal {

	public static void main(String[] args) {
		int escolha;
		
		Scanner sc = new Scanner (System.in);
		Usuario usuario = new Usuario();
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		do {	
			System.out.println("\n***SISTEMA DE LOCA��O DE LIVROS***\n");
			System.out.println("1- Cadastro de usu�rio.");
			System.out.println("2- Listar usu�rios");
			System.out.println("3- Alugar livros");
			System.out.println("4- Listar livros");
			System.out.println("0- Sair");
			
			System.out.println("Escolha uma op��o:");
			escolha = (sc.nextInt());
			switch(escolha) {
				case 1:				
					System.out.println("\n***Cadastrar usu�rio***");						
					System.out.println("Digite o nome do usu�rio:");	
					usuario.setNome(sc.next());
					usuarios.add(usuario);
					System.out.println("Digite o CPF do usu�rio:");
					usuario.setCpf(sc.next());
					System.out.println("Digite o RG do usu�rio:");
					usuario.setRg(sc.next());
					System.out.println("Digite o Email do usu�rio:");
					usuario.setEmail(sc.next());
					System.out.println("Digite o telefone do usu�rio:");
					usuario.setTelefone(sc.next());
					System.out.println("Digite o endere�o do usu�rio:");
					usuario.setEndere�o(sc.next());
					System.out.println("Usu�rio cadastrado com sucesso.");
					break;
				case 2:
					System.out.println("Listagem de usu�rios");
					System.out.println(usuarios);
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
