module jdbcFx {

	    requires transitive javafx.graphics;
	    requires javafx.base;
	    requires javafx.controls;
	    requires javafx.fxml;

	    opens application to javafx.graphics, javafx.fxml;
}
