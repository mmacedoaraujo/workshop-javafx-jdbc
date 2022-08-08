package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {

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
		loadView("/gui/DepartmentList.fxml");

	}

	@FXML
	protected synchronized void menuItemAboutAction() throws IOException {
		loadView("/gui/About.fxml");
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
		}
	}

	@Override
	public void initialize(URL uri, ResourceBundle resourceBundle) {

	}
}
