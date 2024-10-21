package co.edu.uniquindio.ejerciciocoladeprioridad.viewController;

import co.edu.uniquindio.ejerciciocoladeprioridad.model.Paquete;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.PriorityQueue;

public class PaquetesViewController {

    @FXML
    private TextField destinoField;

    @FXML
    private TextField prioridadField;

    @FXML
    private ListView<String> listaPaquetes;

    @FXML
    private Label mensajeLabel;

    private PriorityQueue<Paquete> colaDePaquetes = new PriorityQueue<>();

    @FXML
    public void agregarPaquete() {
        String destino = destinoField.getText();
        String prioridadTexto = prioridadField.getText();

        try {
            int prioridad = Integer.parseInt(prioridadTexto);


            Paquete nuevoPaquete = new Paquete(destino, prioridad);
            colaDePaquetes.offer(nuevoPaquete);


            listaPaquetes.getItems().add(nuevoPaquete.toString());

            destinoField.clear();
            prioridadField.clear();
            mensajeLabel.setText("Paquete agregado correctamente.");
        } catch (NumberFormatException e) {
            mensajeLabel.setText("Error: La prioridad debe ser un número entero.");
        }
    }


    @FXML
    public void entregarPaquetes() {
        if (colaDePaquetes.isEmpty()) {
            mensajeLabel.setText("No hay paquetes para entregar.");
            return;
        }

        listaPaquetes.getItems().clear();
        while (!colaDePaquetes.isEmpty()) {
            Paquete paqueteActual = colaDePaquetes.poll();
            listaPaquetes.getItems().add("Entregado: " + paqueteActual);
        }
        mensajeLabel.setText("Todos los paquetes han sido entregados.");
    }
}