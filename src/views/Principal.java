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
			System.out.println("\n***SISTEMA DE LOCAÇÃO DE LIVROS***\n");
			System.out.println("1- Cadastro de usuário.");
			System.out.println("2- Listar usuários");
			System.out.println("3- Alugar livros");
			System.out.println("4- Listar livros");
			System.out.println("0- Sair");
			
			System.out.println("Escolha uma opção:");
			escolha = (sc.nextInt());
			switch(escolha) {
				case 1:				
					System.out.println("\n***Cadastrar usuário***");						
					System.out.println("Digite o nome do usuário:");	
					usuario.setNome(sc.next());
					usuarios.add(usuario);
					System.out.println("Digite o CPF do usuário:");
					usuario.setCpf(sc.next());
					System.out.println("Digite o RG do usuário:");
					usuario.setRg(sc.next());
					System.out.println("Digite o Email do usuário:");
					usuario.setEmail(sc.next());
					System.out.println("Digite o telefone do usuário:");
					usuario.setTelefone(sc.next());
					System.out.println("Digite o endereço do usuário:");
					usuario.setEndereço(sc.next());
					System.out.println("Usuário cadastrado com sucesso.");
					break;
				case 2:
					System.out.println("Listagem de usuários");
					System.out.println(usuarios);
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
