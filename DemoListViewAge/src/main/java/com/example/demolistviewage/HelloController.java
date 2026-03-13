package com.example.demolistviewage;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtEdad;

    @FXML
    private ListView<Usuario> listUsuarios;

    @FXML
    public void agregarUsuario() {

        String nombre = txtNombre.getText().trim();
        String edadTexto = txtEdad.getText().trim();

        if (nombre.isEmpty() || edadTexto.isEmpty()) {
            System.out.println("Todos los campos son obligatorios");
            return;
        }

        try {

            int edad = Integer.parseInt(edadTexto);

            if (edad < 18) {
                System.out.println("Solo se aceptan mayores de 18 años");
                return;
            }

            Usuario usuario = new Usuario(nombre, edad);

            listUsuarios.getItems().add(usuario);
            txtNombre.clear();
            txtEdad.clear();

        } catch (NumberFormatException e) {

            System.out.println("La edad debe ser un número entero");

        }
    }
}