import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class a extends Application{
    public static void main(String[] args) {
        launch();
    }

        @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("a");
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("a.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
