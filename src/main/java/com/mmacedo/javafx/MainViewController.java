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
        protected void menuItemDepartmentAction() throws IOException {
            loadView("DepartmentList.fxml");
        }
        @FXML
        protected synchronized void menuItemAboutAction() throws IOException {
            loadView("About.fxml");
        }

        protected void loadView(String fileName) {
            try {
                VBox newVBox = FXMLLoader.load(getClass().getResource(fileName));

                Node mainMenu = vBox.getChildren().get(0);
                vBox.getChildren().clear();
                vBox.getChildren().setAll(mainMenu);
                vBox.getChildren().addAll(newVBox.getChildren());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

}

