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
 
@Entity
@Table(name = "Proveedor_producto")
// Class
public class Product {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@Column(name = "uid_sku")
	private String uid;

    @Column(name="proveedor_ID")
    private int proveedorId;
    
    @Column(name="nombre_del_producto")
    private String nombre;
    
    @Column(name="descripcion_del_producto")
    private String descripcion;
    
    @Column(name="precio_unitario")
    private Double precioUnitario;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getProveedorId() {
		return proveedorId;
	}

	public void setProveedorId(int proveedorId) {
		this.proveedorId = proveedorId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	
    @Override
	public String toString(){
		return "Usuario [id=" + id + ",proveedorID=" + proveedorId + ",rolId=" + uid +", nombres=" + nombre + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + "]";
	}

}