package co.edu.uniquindio.anthonyProyecto.propiedad;

public class Propiedad {
	private String direccion;
	private double valor;
	private float area;


	public Propiedad(){
		
	}
	
	/**
	 * @param direccion
	 * @param valor
	 * @param area
	 */
	public Propiedad(String direccion, double valor, float area) {
		super();
		this.direccion = direccion;
		this.valor = valor;
		this.area = area;

	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}


}
