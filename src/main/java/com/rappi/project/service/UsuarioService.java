
// Java Program to Illustrate DepartmentService.java File
 
// Importing packages
package com.rappi.project.service;
import com.rappi.project.entity.Usuario;
// Importing required classes
import java.util.List;
 
// Class
public interface UsuarioService{
 
    // Save operation
	Usuario saveUsuario(Usuario usuario);
 
    // Read operation
    List<Usuario> fetchUsuarioList();
 
    // Update operation
    Usuario updateUsuario(Usuario usuario,
                                Long id);
 
    // Delete operation
    void deleteUsuarioById(Long id);

    Usuario getUsuario(Long id);
}