module dk.easv.exercise403 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.exercise403 to javafx.fxml;
    exports dk.easv.exercise403;
    exports dk.easv.exercise403.controller;
    opens dk.easv.exercise403.controller to javafx.fxml;
}