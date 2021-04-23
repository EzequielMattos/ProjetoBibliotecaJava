package views;

import java.util.Scanner;
import controllers.UsuarioController;
import models.Usuario;

public class CadastrarUsuarios {
	
	private static Scanner sc = new Scanner (System.in);
	
	public static void renderizar() {
		Usuario usuario = new Usuario();
		
		System.out.println("\n-- CADASTRAR USUÁRIO --\n");
		
		System.out.println("\nDigite o nome do usuário:");	
		usuario.setNome(sc.next());
		
		System.out.println("\nDigite o CPF do usuário:");
		usuario.setCpf(sc.next());
		
		System.out.println("\nDigite o RG do usuário:");
		usuario.setRg(sc.next());
		
		System.out.println("\nDigite o Email do usuário:");
		usuario.setEmail(sc.next());
		
		System.out.println("\nDigite o telefone do usuário:");
		usuario.setTelefone(sc.next());
		
		System.out.println("\nDigite o endereço do usuário:");
		usuario.setEndereco(sc.next());
		
		if(UsuarioController.cadastrar(usuario)) {
			System.out.println("\nUsuário cadastrado com sucesso.");
		}else {
			System.out.println("\nCPF já cadastrado. Tente novamente.");
		}
	}
}
