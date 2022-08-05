package com.mmacedo.javafx.gui;

import com.mmacedo.javafx.db.DbConnector;
import com.mmacedo.javafx.model.entities.Department;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DepartmentListController implements Initializable {

    private Department department;

    @FXML
    private Button btnNew;
    @FXML
    private TableView<Department> tableViewDepartment;
    @FXML
    private TableColumn<Department, Integer> id;
    @FXML
    private TableColumn<Department, String> name;

    ObservableList<Department> departmenList = FXCollections.observableArrayList();
    @FXML
    protected void btnNewAction() {
        System.out.println("Aloha");
    }

    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
        try {
            Connection connection = DbConnector.getConnection();
            ResultSet resultSet = connection.createStatement().executeQuery("select * from department");

            while (resultSet.next()) {
                departmenList.add(new Department(resultSet.getString("Name"), resultSet.getInt("Id")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));

        tableViewDepartment.setItems(departmenList);
    }
}
