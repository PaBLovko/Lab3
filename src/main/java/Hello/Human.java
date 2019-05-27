package Hello;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class Human
{
    public static void Human(Stage Human)
    {

        Stage stage = new Stage();
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root,300,300);

        root.getRowConstraints().add(new RowConstraints(40,40,40));
        root.getRowConstraints().add(new RowConstraints(0));
        root.getRowConstraints().add(new RowConstraints(80));

        Button evaluatedExpression = new Button("Input");
        root.add(evaluatedExpression,0,2);
        evaluatedExpression.setMinWidth(150);

        TextField nameHuman = new TextField();
        root.add(nameHuman,0,1);

        Label label = new Label();
        label.setText("Введите имя пользователя");
        root.add(label,0,0);

        evaluatedExpression.setOnAction(event -> {
            stage.close();
            Human.show();
            Human.setTitle(nameHuman.getText());
        });

        stage.setTitle("Calculating complex number");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
}