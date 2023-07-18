module com.example.systemvars {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.systemvars to javafx.fxml;
    exports com.example.systemvars;
}