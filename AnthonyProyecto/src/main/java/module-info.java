module co.edu.uniquindio.anthonyProyecto.application {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;

    opens co.edu.uniquindio.anthonyProyecto.application to javafx.fxml;
    exports co.edu.uniquindio.anthonyProyecto.application;
}
