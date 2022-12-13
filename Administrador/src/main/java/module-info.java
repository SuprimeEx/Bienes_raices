module co.edu.uniquindio.test.Proyecto_Final {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.desktop;
	requires javafx.graphics;
	
	opens co.edu.uniquindio.Proyecto.Admin;
	exports co.edu.uniquindio.Proyecto.Admin;
    opens co.edu.uniquindio.test.Proyecto_Final;
    exports co.edu.uniquindio.test.Proyecto_Final;
    opens co.edu.uniquindio.Proyecto.controllers;
    exports co.edu.uniquindio.Proyecto.controllers;
    
}
