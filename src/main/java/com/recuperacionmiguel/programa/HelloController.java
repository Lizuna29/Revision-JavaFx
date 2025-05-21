package com.recuperacionmiguel.programa;

import es.componente.ControladorComponente;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class HelloController extends Application {

  @FXML
  private TextArea outputArea;

  private ControladorComponente componenteController;

  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader Componentloader = new FXMLLoader(getClass().getResource("es/componente/Componente.fxml"));
    componenteController = Componentloader.getController();

    FXMLLoader AppLoader = new FXMLLoader(HelloApplication.class.getResource("com/recuperacionmiguel/programa/hello-view.fxml"));
    Scene scene = new Scene(AppLoader.load());

    stage.setTitle("Imagina que funciona y todo...");
    stage.setScene(scene);
    stage.show();
  }


  @FXML
  public void handleGet() {
    List<String> seleccionados = componenteController.getElementosSeleccionados();
    outputArea.setText("Seleccionados:\n" + String.join(", ", seleccionados));
  }

  @FXML
  public void handleSet() {
    componenteController.setElementosSeleccionados(Arrays.asList("Rojo", "Verde", "Azul"));
  }

  @FXML
  public void handleReset() {
    componenteController.reset();
    outputArea.clear();
  }

  public static void main(String[] args) {
    launch();
  }
}
