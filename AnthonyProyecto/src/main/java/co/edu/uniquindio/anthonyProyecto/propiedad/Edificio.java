package co.edu.uniquindio.anthonyProyecto.propiedad;


public class Edificio extends Propiedad {
	

	private int cantidadPisos;
	
	public Edificio(String direccion, double valor, float area,int cantidadPisos) {
		super(direccion, valor, area);
		this.cantidadPisos = cantidadPisos;
	}
	
	
	public int getCantidadPisos() {
		return cantidadPisos;
	}

	public void setCantidadPisos(int cantidadPisos) {
		this.cantidadPisos = cantidadPisos;
	}  

	
	

}
