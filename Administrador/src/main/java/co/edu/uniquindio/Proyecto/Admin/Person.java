package co.edu.uniquindio.Proyecto.Admin;


public class Person {
	private String nombre,apellido,id;
	private int  edad;
	
	public Person(String nombre, String apellido, String id,int edad) {	
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.edad = edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getId() {
		return id;
	}
	public int getEdad() {
		return edad;
	}
		
}
