package co.edu.uniquindio.anthonyProyecto.propiedad;

public enum AppFRController {
	  INSTANCE;
    private final FincaRaiz FincaRaiz;

    AppFRController() {
        FincaRaiz = new FincaRaiz();
    }

    public FincaRaiz getFincaRaiz() {
        return FincaRaiz;
    }
}
