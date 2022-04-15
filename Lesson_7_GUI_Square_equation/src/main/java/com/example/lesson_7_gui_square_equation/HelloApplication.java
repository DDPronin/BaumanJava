package com.example.lesson_7_gui_square_equation;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        Scene scene = new Scene(group, 640, 320);
        Label label = new Label("CALCULATE!!!!");
        label.setAlignment(Pos.CENTER);
        label.setLayoutX(0);
        label.setLayoutY(80);
        label.setStyle("-fx-border-color: blue;"); // способ выбрать цвет границы
        label.setMinHeight(80);
        label.setMaxHeight(80);
        label.setMinWidth(100);
        label.setMaxWidth(100);
        label.setFont(new Font(10)); // способ установить размер шрифта

        TextField A = new TextField();
        A.setMaxWidth(50);
        A.setLayoutX(0);
        A.setLayoutY(0);

        Label A_member = new Label("X^2");
        A_member.setLayoutX(60);
        A_member.setLayoutY(5);

        Label plus1 = new Label("+");
        plus1.setLayoutX(90);
        plus1.setLayoutY(5);

        TextField B = new TextField();
        B.setMaxWidth(50);
        B.setLayoutX(105);
        B.setLayoutY(0);

        Label B_member = new Label("X");
        B_member.setLayoutX(165);
        B_member.setLayoutY(5);

        Label plus2 = new Label("+");
        plus2.setLayoutX(180);
        plus2.setLayoutY(5);

        TextField C = new TextField();
        C.setMaxWidth(50);
        C.setLayoutX(195);
        C.setLayoutY(0);

        Label equals_zero = new Label(" = 0");
        equals_zero.setLayoutX(250);
        equals_zero.setLayoutY(5);

        Label Root1 = new Label();
        Root1.setLayoutX(180);
        Root1.setLayoutY(50);
        group.getChildren().add(Root1);

        Label Root2 = new Label();
        Root2.setLayoutX(180);
        Root2.setLayoutY(70);
        group.getChildren().add(Root2);


        Label error = new Label();
        error.setLayoutX(180);
        error.setLayoutY(50);
        group.getChildren().add(error);

        label.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                double a = 0;
                double b = 0;
                double c = 0;

                try {
                    a = Double.parseDouble(A.getText());
                    b = Double.parseDouble(B.getText());
                    c = Double.parseDouble(C.getText());

                    if (a == 0) {
                        Root1.setText("");
                        Root2.setText("");
                        error.setText("Square coef. equals zero!");
                    } else {

                        double D = b * b - 4 * a * c;

                        if (D > 0) {
                            double root1 = (-b + Math.sqrt(D)) / (2 * a);
                            double root2 = (-b - Math.sqrt(D)) / (2 * a);

                            Root1.setText("X1 = " + Double.toString(root1));
                            Root2.setText("X2 = " + Double.toString(root2));
                            error.setText("");

                        }
                        if (D == 0) {
                            double root = -b / (2 * a);
                            Root1.setText("X = " + Double.toString(root));
                            Root2.setText("");
                            error.setText("");
                        }
                        if (D < 0) {
                            double root1re = (-b) / (2 * a);
                            double root2re = (-b) / (2 * a);
                            double root1im = (Math.sqrt(-D)) / (2 * a);
                            double root2im = (Math.sqrt(-D)) / (2 * a);

                            Root1.setText("X1 = " + Double.toString(root1re) + " + " + Double.toString(root1im) + "i");
                            Root2.setText("X2 = " + Double.toString(root2re) + " + " + Double.toString(root2im) + "i");
                            error.setText("");
                        }
                    }
                } catch (Exception e) {
                    Root1.setText("");
                    Root2.setText("");
                    error.setText("Enter numbers in textfields!");
                }
            }
        });
        group.getChildren().add(label);
        group.getChildren().add(A);
        group.getChildren().add(A_member);
        group.getChildren().add(plus1);
        group.getChildren().add(B);
        group.getChildren().add(B_member);
        group.getChildren().add(plus2);
        group.getChildren().add(C);
        group.getChildren().add(equals_zero);


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}