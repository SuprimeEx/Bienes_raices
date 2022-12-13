package Clases;

import java.util.Objects;


public class Usuario {
	private String usuario;
	private String contaseña;
	private String PalabraSecreta;
	
	public Usuario(String usuario, String contaseña,String PalabraSecreta) {
		this.usuario = usuario ;
		this.contaseña = contaseña;
		this.PalabraSecreta = PalabraSecreta;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getContraseña() {
		return contaseña;
	}
	public String getPalabraSecreta() {
		return PalabraSecreta ;
	}	
}

	