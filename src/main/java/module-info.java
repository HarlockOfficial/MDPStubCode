module it.unicam.cs.f1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.unicam.cs.f1 to javafx.fxml;
    exports it.unicam.cs.f1;
    exports it.unicam.cs.f1.agent;
    opens it.unicam.cs.f1.agent to javafx.fxml;
    exports it.unicam.cs.f1.track;
    opens it.unicam.cs.f1.track to javafx.fxml;
    exports it.unicam.cs.f1.manager;
    opens it.unicam.cs.f1.manager to javafx.fxml;
}