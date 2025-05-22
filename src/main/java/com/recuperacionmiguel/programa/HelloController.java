package com.recuperacionmiguel.programa;

import es.componente.ControladorComponente;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.stage.Stage;

public class HelloController extends Application {

  private List<String> seleccion = new ArrayList<>();
  @FXML
  private TextArea outputArea;

  @FXML
  private ControladorComponente componente1;

  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader AppLoader = new FXMLLoader(HelloController.class.getResource("hello-view.fxml"));
    Parent root = AppLoader.load();
    Scene scene = new Scene(root);
    stage.setTitle("Imagina que funciona y todo...");
    stage.setScene(scene);
    stage.show();
  }


  @FXML
  public void handleGet() {
    seleccion = componente1.getElementosSeleccionados();
    outputArea.setText("Seleccionados:\n" + String.join(", ", seleccion));
  }

  @FXML
  public void handleSet() {
    seleccion = componente1.setElementosSeleccionados(seleccion);
    outputArea.setText("Seleccionados:\n" + String.join(", ", seleccion));
  }

  @FXML
  public void handleReset() {
    componente1.reset();
    outputArea.clear();
  }

  public static void main(String[] args) {
    launch();
  }
}
