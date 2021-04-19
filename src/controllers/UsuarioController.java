package controllers;

import java.util.ArrayList;

import models.Usuario;

public class UsuarioController {
	
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public static ArrayList<Usuario> listar(){
		return usuarios;
	}
	
	public static boolean cadastrar(Usuario usuario) {
		for(Usuario usuarioCadastrado : usuarios) {
			if(usuarioCadastrado.getCpf().equals(usuario.getCpf())) {
				return false;
			}
		}
		usuarios.add(usuario);
		return true;
	}

}
