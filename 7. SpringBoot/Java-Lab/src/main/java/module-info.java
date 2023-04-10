module com.example.javalab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javalab to javafx.fxml;
    exports com.example.javalab;
}