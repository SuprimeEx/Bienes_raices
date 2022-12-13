package co.edu.uniquindio.Proyecto.Exeptions;

public class PersonaNoExisteException extends Exception {
    public PersonaNoExisteException() {
        super("La persona no existe");
    }
}
