package co.edu.uniquindio.Proyecto.Exeptions;

public class PersonaExisteException extends Exception{
    public PersonaExisteException() {
        super("La persona ya esta en el bus");
    }
}
