package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.entities.Department;

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

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));

        tableViewDepartment.setItems(departmenList);
    }
}
