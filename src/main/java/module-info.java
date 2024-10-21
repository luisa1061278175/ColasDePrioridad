module co.edu.uniquindio.ejerciciocoladeprioridad {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.ejerciciocoladeprioridad to javafx.fxml;
    opens co.edu.uniquindio.ejerciciocoladeprioridad.viewController to javafx.fxml;
    opens co.edu.uniquindio.ejerciciocoladeprioridad.model to javafx.fxml;
    exports co.edu.uniquindio.ejerciciocoladeprioridad;
    exports co.edu.uniquindio.ejerciciocoladeprioridad.viewController;
    exports co.edu.uniquindio.ejerciciocoladeprioridad.model;
}