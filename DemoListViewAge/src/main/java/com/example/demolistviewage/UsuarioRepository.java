package com.example.demolistviewage;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class UsuarioRepository {

    private ObservableList<Usuario> usuarios = FXCollections.observableArrayList();

    public ObservableList<Usuario> obtenerUsuarios(){
        return usuarios;
    }

    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario){
        usuarios.remove(usuario);
    }
}