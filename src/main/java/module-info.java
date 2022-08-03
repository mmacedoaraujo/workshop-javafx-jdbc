module com.mmacedo.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mmacedo.javafx to javafx.fxml;
    exports com.mmacedo.javafx;
}