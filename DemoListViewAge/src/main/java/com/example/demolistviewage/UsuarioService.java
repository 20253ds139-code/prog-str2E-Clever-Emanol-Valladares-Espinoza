package com.example.demolistviewage;

import javafx.collections.ObservableList;

public class UsuarioService {

    private UsuarioRepository repository = new UsuarioRepository();

    public ObservableList<Usuario> obtenerUsuarios() {
        return repository.obtenerUsuarios();
    }

    public void agregarUsuario(Usuario usuario) {
        repository.agregarUsuario(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        repository.eliminarUsuario(usuario);
    }
}