package es.componente;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextFlow;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ControladorComponente extends VBox {

  @FXML
  private TextArea textArea;
  @FXML
  private Button button;
  @FXML
  private TextFlow textFlow;

  static ControladorComponente controlador;

  public ControladorComponente() throws IOException {
    super();
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/es/componente/Componente.fxml"));
    loader.setRoot(this);
    loader.setController(this);
    Scene scene = new Scene(loader.load());
    ControladorComponente.controlador = this;
  }

  public ControladorComponente getControlador () {
    return controlador;
  }

  public List<String> getElementosSeleccionados() {
    List<String> seleccionados = new ArrayList<>();
    seleccionados.add("hola");
    seleccionados.add("me quedo");
    seleccionados.add("me voy");
    return seleccionados;
  }

  public void setElementosSeleccionados(List<String> elementos) {

  }

  public void reset() {

  }
}
