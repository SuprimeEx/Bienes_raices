package co.edu.uniquindio.Proyecto.Exeptions;

public class ValorRequeridoException extends Exception{
    public ValorRequeridoException(String nombre) {
        super(String.format("El %s es requerido",nombre));
    }
}
