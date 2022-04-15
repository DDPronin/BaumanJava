module com.example.lesson_7_gui_square_equation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson_7_gui_square_equation to javafx.fxml;
    exports com.example.lesson_7_gui_square_equation;
}