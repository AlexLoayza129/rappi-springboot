// Java Program to Illustrate DepartmentController.java File

// Importing packages modules
package com.rappi.project.web.controller;

import com.rappi.project.entity.Usuario;
import com.rappi.project.service.UsuarioService;
import java.util.List;

// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Validate origin
@CrossOrigin(origins = {"http://localhost:8080"})

// Annotation
@RestController
// Class
public class UsuarioController {

	@Autowired private UsuarioService usuarioService;

	// Save operation
	@PostMapping("/api/usuarios")
	public Usuario saveUsuario(@RequestBody Usuario usuario)
	{
		return usuarioService.saveUsuario(usuario);
	}

	// Read operation
	@GetMapping("/api/usuarios")

	public List<Usuario> fetchUsuarioList()
	{
		return usuarioService.fetchUsuarioList();
	}
	
	// Read operation
    @GetMapping("/api/usuarios/{id}")

    public Usuario getUsuario(@PathVariable("id") Long id)
    {
        return usuarioService.getUsuario(id);
    }

	// Update operation
	@PutMapping("/api/usuarios/{id}")

	public Usuario
	updateUsuario(@RequestBody Usuario usuario,
					@PathVariable("id") Long id)
	{
		return usuarioService.updateUsuario(
			usuario, id);
	}

	// Delete operation
	@DeleteMapping("/api/usuarios/{id}")

	public String deleteUsuarioById(@PathVariable("id")
									Long id)
	{
		usuarioService.deleteUsuarioById(
			id);
		return "Deleted Successfully";
	}

}
