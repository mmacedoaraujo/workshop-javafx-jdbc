module com.mmacedo.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.mmacedo.javafx;
    opens com.mmacedo.javafx.gui to javafx.fxml;
    opens com.mmacedo.javafx.gui.util to javafx.fxml;
    opens com.mmacedo.javafx.model.entities to javafx.base;
    opens com.mmacedo.javafx.model.service to javafx.fxml;

}