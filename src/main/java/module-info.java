module it.unicam.cs.f1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.unicam.cs.f1 to javafx.fxml;
    exports it.unicam.cs.f1;
}