module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.mail;
    requires java.prefs;
    requires java.desktop;
    requires java.logging;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}