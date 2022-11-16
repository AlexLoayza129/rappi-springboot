// Java Program to Illustrate DepartmentServiceImpl.java
// File

// Importing required packages
package com.rappi.project.service;

import com.rappi.project.entity.Usuario;
import com.rappi.project.repository.UsuarioRepository;
// Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
// Class implementing DepartmentService class
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	// Save operation
	@Override
	public Usuario saveUsuario(Usuario usuario)
	{
		return usuarioRepository.save(usuario);
	}

	// Read operation
	@Override public List<Usuario> fetchUsuarioList()
	{
		return (List<Usuario>)
				usuarioRepository.findAll();
	}
	
	// Read operation
    @Override public Usuario getUsuario(Long id)
    {
        return usuarioRepository.findById(id).get();
    }

	// Update operation
	@Override
	public Usuario
	updateUsuario(Usuario usuario,Long id)
	{

		Usuario Usuario = usuarioRepository.findById(id).get();

		if (Objects.nonNull(usuario.getNombres())
			&& !"".equalsIgnoreCase(
					usuario.getNombres())) {
			Usuario.setNombres(
					usuario.getNombres());
		}

		if (Objects.nonNull(
				usuario.getDireccion())
			&& !"".equalsIgnoreCase(
					usuario.getDireccion())) {
			Usuario.setDireccion(
					usuario.getDireccion());
		}

		// if (Objects.nonNull(usuario.getDepartmentCode())
		//	&& !"".equalsIgnoreCase(
		//		department.getDepartmentCode())) {
		//	depDB.setDepartmentCode(
		//		department.getDepartmentCode());
		//}

		return usuarioRepository.save(Usuario);
	}

	// Delete operation
	@Override
	public void deleteUsuarioById(Long id)
	{
		usuarioRepository.deleteById(id);
	}
}
