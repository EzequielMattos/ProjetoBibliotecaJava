package views;

import controllers.UsuarioController;

import models.Usuario;

public class ListarUsuarios {
	
	public static void renderizar() {
		System.out.println("\n-- LISTAR USU�RIOS --\n");
		for(Usuario listaUsuarios : UsuarioController.listar()) {
			System.out.println(listaUsuarios);
		}
	}
	
}
