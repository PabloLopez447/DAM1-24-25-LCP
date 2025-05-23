import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class App extends Application{
    static int contador = 0;
    public static void main(String[] args) throws Exception {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button btn = new Button("Púlsame");
        btn.setOnAction(e -> {
            System.out.println("Botón pulsado");
            contador++;
            if (contador > 1) {
            btn.setText("Botón pulsado " + contador + " veces");                
            }else{
            btn.setText("Botón pulsado");
            }
        });
        Scene scn = new Scene(btn,300,200);
        stage.setScene(scn);
        stage.setResizable(false);
        stage.show();
    }
}
