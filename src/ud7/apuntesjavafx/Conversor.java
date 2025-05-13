package ud7.apuntesjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Conversor extends Application {

    Label lblResultado = new Label();
    TextField txtNum1 = new TextField("Cantidad a convertir...");
    TextField txtNum2 = new TextField("Factor de conversión...");

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        txtNum1.setOnKeyTyped(e -> convertir());
        txtNum2.setOnKeyTyped(e -> convertir());

        VBox vbox = new VBox(txtNum1, txtNum2, lblResultado);
        Scene scene = new Scene(vbox, 300, 150);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Conversor");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();

    }

    public void convertir() {
        double resultado;
        double unit = 0, fact = 0;
        try {
            unit = Double.parseDouble(txtNum1.getText());
            fact = Double.parseDouble(txtNum2.getText());
            resultado = unit * fact;
            lblResultado.setText(String.valueOf(resultado));
        } catch (Exception ex) {
            lblResultado.setText("ERROR: Algún operando no es nu número");
        }
    }
}