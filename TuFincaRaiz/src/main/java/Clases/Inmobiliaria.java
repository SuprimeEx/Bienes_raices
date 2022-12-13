package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class Inmobiliaria {
	private List<Usuario> usuarios;

	public Inmobiliaria() {
		usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Antonio","67890","holamundito"));
		usuarios.add(new Usuario("Andres", "12345", "holamundo"));
		usuarios.add(new Usuario("Miguel", "09876", "holamundoXD"));
		usuarios.add(new Usuario("Santiago", "54321", "holaalfredos"));
	}

	public Optional<Usuario> autenticar( String nombreUsuario, String clave ) {
		return usuarios.stream()
				.filter( u->u.getUsuario().equals(nombreUsuario) && u.getContraseña().equals(clave) )
				.findFirst();
		
	}
	public Optional<Usuario> autenticarPalabrasecreta(String nombreUsuario, String palabraSecreta) throws Exception {
		return usuarios.stream()
				.filter( u->u.getUsuario().equals(nombreUsuario) && u.getPalabraSecreta()
				.equals(palabraSecreta)).findFirst();
	}
}
