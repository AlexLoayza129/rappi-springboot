// Java Program to Illustrate DepartmentController.java File

// Importing packages modules
package com.rappi.project.web.controller;

import com.rappi.project.entity.Usuario;
import com.rappi.project.service.UsuarioService;
import com.rappi.project.service.UsuarioServiceImpl;
import java.util.List;
// Importing required classes
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController
// Class
public class UsuarioController {

	@Autowired private UsuarioService usuarioService;

	// Save operation
	@PostMapping("/usuarios")

	public Usuario saveUsuario(
		@Valid @RequestBody Usuario usuario)
	{
		return usuarioService.saveUsuario(usuario);
	}

	// Read operation
	@GetMapping("/usuarios")

	public List<Usuario> fetchUsuarioList()
	{
		return usuarioService.fetchUsuarioList();
	}
	
	// Read operation
    @GetMapping("/usuarios/{id}")

    public Usuario getUsuario(@PathVariable("id") Long id)
    {
        return usuarioService.getUsuario(id);
    }

	// Update operation
	@PutMapping("/usuarios/{id}")

	public Usuario
	updateUsuario(@RequestBody Usuario usuario,
					@PathVariable("id") Long id)
	{
		return usuarioService.updateUsuario(
			usuario, id);
	}

	// Delete operation
	@DeleteMapping("/usuarios/{id}")

	public String deleteUsuarioById(@PathVariable("id")
									Long id)
	{
		usuarioService.deleteUsuarioById(
			id);
		return "Deleted Successfully";
	}
}
