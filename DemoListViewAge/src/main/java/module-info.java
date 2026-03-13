module com.example.demolistviewage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demolistviewage to javafx.fxml;
    exports com.example.demolistviewage;
}