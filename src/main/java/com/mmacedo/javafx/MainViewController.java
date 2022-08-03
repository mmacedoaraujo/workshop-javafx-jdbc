package com.mmacedo.javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MainViewController {

        @FXML
        private VBox vBox;
        @FXML
        private MenuItem menuItemSeller;
        @FXML
        private MenuItem menuItemDepartment;
        @FXML
        private MenuItem menuItemAbout;


        @FXML
        protected void menuItemSellerAction() {

        }
        @FXML
        protected void menuItemDepartmentAction() {

        }
        @FXML
        protected void menuItemAboutAction() throws IOException {
            VBox newVBox = FXMLLoader.load(getClass().getResource("About.fxml"));

            Node mainMenu = vBox.getChildren().get(0);
            vBox.getChildren().clear();
            vBox.getChildren().setAll(mainMenu);
            vBox.getChildren().addAll(newVBox.getChildren());
        }

}

