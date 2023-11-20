module com.example.bdproyectofinalv2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bdproyectofinalv2 to javafx.fxml;
    exports com.example.bdproyectofinalv2;
    exports com.example.bdproyectofinalv2.negocio;
    opens com.example.bdproyectofinalv2.negocio to javafx.fxml;
}