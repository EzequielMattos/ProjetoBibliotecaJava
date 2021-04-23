package views;

import java.util.Scanner;
import controllers.UsuarioController;
import models.Usuario;

public class CadastrarUsuarios {
	
	private static Scanner sc = new Scanner (System.in);
	
	public static void renderizar() {
		Usuario usuario = new Usuario();
		
		System.out.println("\n-- CADASTRAR USU�RIO --\n");
		
		System.out.println("\nDigite o nome do usu�rio:");	
		usuario.setNome(sc.next());
		
		System.out.println("\nDigite o CPF do usu�rio:");
		usuario.setCpf(sc.next());
		
		System.out.println("\nDigite o RG do usu�rio:");
		usuario.setRg(sc.next());
		
		System.out.println("\nDigite o Email do usu�rio:");
		usuario.setEmail(sc.next());
		
		System.out.println("\nDigite o telefone do usu�rio:");
		usuario.setTelefone(sc.next());
		
		System.out.println("\nDigite o endere�o do usu�rio:");
		usuario.setEndereco(sc.next());
		
		if(UsuarioController.cadastrar(usuario)) {
			System.out.println("\nUsu�rio cadastrado com sucesso.");
		}else {
			System.out.println("\nCPF j� cadastrado. Tente novamente.");
		}
	}
}
