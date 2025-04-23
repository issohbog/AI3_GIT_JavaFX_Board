module com.team4 {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires lombok;


    opens com.team4 to javafx.base, javafx.graphics, javafx.fxml;
    opens com.team4.Controller to javafx.fxml;
    opens com.team4.DTO to javafx.base;
    exports com.team4;

    
}
