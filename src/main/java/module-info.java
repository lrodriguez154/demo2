module eus.ehu.demo2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens eus.ehu.demo2 to javafx.fxml;
    exports eus.ehu.demo2;
}