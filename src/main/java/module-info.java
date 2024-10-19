module org.mavenproject1.slider_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;

    opens org.mavenproject1.slider_javafx to javafx.fxml;
    exports org.mavenproject1.slider_javafx;
}