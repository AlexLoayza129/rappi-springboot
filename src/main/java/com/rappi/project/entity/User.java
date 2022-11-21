// Java Program to Illustrate Department.java File
// Importing required package modules
package com.rappi.project.entity;
 
// Importing required classes
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.NoArgsConstructor;
 
@Entity
@Table(name = "Usuario")
 
// Class
public class User {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@Column(name = "rol_ID")
	private int rolId;

    @Column(name="nombres")
    private String nombres;
    
    @Column(name="apellidos")
    private String apellidos;
    
    @Column(name="correo")
    private String correo;
    
    @Column(name="contrasena")
    private String contrasena;
    
    @Column(name="telefono")
    private String telefono;
    
    @Column(name="direccion")
    private String direccion;
    
	public int getRolID(){
		return rolId;
	}

	public void setRolID(int rolId){
		this.rolId = rolId;
	}

	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
    
    
    @Override
	public String toString(){
		return "Usuario [id=" + id + ",rolId=" + rolId +", nombres=" + nombres + ", apellidos=" + apellidos + ", correo=" + correo + ", contrasena=" + contrasena + ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}
}