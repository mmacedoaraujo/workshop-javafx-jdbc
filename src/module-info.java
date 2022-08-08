module workshop_javafx_jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml, javafx.base, javafx.controls;
	opens gui to javafx.graphics, javafx.fxml, javafx.base, javafx.controls;
	exports gui to javafx.graphics, javafx.fxml, javafx.base, javafx.controls;
}
