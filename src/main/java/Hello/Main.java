package Hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Controller controller = new Controller();

    public void start(Stage primaryStage){

        Human.Human(primaryStage);
        GridPane root = new GridPane();
        controller.setGridPane(root);
        primaryStage.setScene(new Scene(root, 210, 280));
    }
    public static void main(String[] args) {
        launch(args);
    }
}
