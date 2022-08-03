module com.mmacedo.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mmacedo.javafx to javafx.fxml;
    exports com.mmacedo.javafx;
    exports com.mmacedo.javafx.gui;
    opens com.mmacedo.javafx.gui to javafx.fxml;
}