module co.edu.uniquindio.ProyectoFinal.application.App {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires java.desktop;
	requires java.sql;

    opens co.edu.uniquindio.ProyectoFinal.application to javafx.fxml;
    exports co.edu.uniquindio.ProyectoFinal.application;
    opens co.edu.uniquindio.Login.controllers to javafx.fxml;
    exports co.edu.uniquindio.Login.controllers;
}
