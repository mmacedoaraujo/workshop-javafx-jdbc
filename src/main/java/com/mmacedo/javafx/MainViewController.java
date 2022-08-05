package com.mmacedo.javafx;

import com.mmacedo.javafx.gui.DepartmentListController;
import com.mmacedo.javafx.gui.util.Alerts;
import com.mmacedo.javafx.model.service.DepartmentService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

        private DepartmentListController departmentListController;
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
                FXMLLoader loader = new FXMLLoader(getClass().getResource(fileName));
                VBox newVBox = loader.load();
                Node mainMenu = vBox.getChildren().get(0);
                vBox.getChildren().clear();
                vBox.getChildren().setAll(mainMenu);
                vBox.getChildren().addAll(newVBox.getChildren());
            } catch (IOException ex) {
                Alerts.showAlert("IOException", "Error loading view", ex.getMessage(), Alert.AlertType.ERROR);
            }
        }

    @Override
    public void initialize(URL uri, ResourceBundle resourceBundle) {

    }
}

