package gui;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import db.DbConnector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import model.entities.Department;

public class DepartmentListController extends MainViewController implements Initializable {

	MainViewController main = new MainViewController();
	private Department department;
	DbConnector dbConnector = new DbConnector();

	@FXML
	private VBox vBox;
	@FXML
	private Button btnNew;
	@FXML
	private TableView<Department> tableViewDepartment;
	@FXML
	private TableColumn<Department, Integer> tableColumnId;
	@FXML
	private TableColumn<Department, String> tableColumnName;

	ObservableList<Department> departmentList = FXCollections.observableArrayList();

	@FXML
	protected void btnNewAction(ActionEvent event) throws IOException {
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resourceBundle) {
		try {
			Connection connection = DbConnector.getConnection();
			ResultSet resultSet = connection.createStatement().executeQuery("select * from department ");

			while (resultSet.next()) {
				departmentList.add(new Department(resultSet.getInt("Id"), resultSet.getString("Name")));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));

		tableViewDepartment.setItems(departmentList);
	}

}
