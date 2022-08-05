package com.mmacedo.javafx.gui;

import com.mmacedo.javafx.model.entities.Department;
import com.mmacedo.javafx.model.service.DepartmentService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class DepartmentListController implements Initializable {


    @FXML
    private Button btnNew;
    @FXML
    private TableView<Department> tableViewDepartment;
    @FXML
    private TableColumn<Department, Integer> id;
    @FXML
    private TableColumn<Department, String> name;

    @FXML
    protected void btnNewAction() {
        System.out.println("Aloha");
    }

    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));

        tableViewDepartment.setItems(departmentList);
    }

    ObservableList<Department> departmentList = FXCollections.observableArrayList(new Department("Books", 1), new Department("Computers", 2), new Department("Electronics", 3));





}
