package co.edu.uniquindio.Proyecto.Admin;

public class Empleado extends Person {
	private String cargo;

	public Empleado(String nombre,String apellido, 
			String id, int edad,String cargo) {
		super(nombre,apellido,id,edad);;
		this.setCargo(cargo);
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	
	

}
