module com.mmacedo.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    requires java.sql;

    opens com.mmacedo.javafx to javafx.fxml, javafx.graphics, javafx.controls, javafx.base;
    opens com.mmacedo.javafx.gui.util;
    opens com.mmacedo.javafx.model.entities;
    opens com.mmacedo.javafx.model.service;
    opens com.mmacedo.javafx.gui;

}