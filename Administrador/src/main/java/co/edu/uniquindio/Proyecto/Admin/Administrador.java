package co.edu.uniquindio.Proyecto.Admin;

public class Administrador extends Person{
	private String usuarioEspecial;
	public Administrador(String nombre, String apellido, String id, int edad,String usuarioEspecial) {
		super(nombre, apellido, id, edad);
		this.usuarioEspecial=usuarioEspecial;
	}
	public String getUsuarioEspecial() {
		return usuarioEspecial;
	}

}
