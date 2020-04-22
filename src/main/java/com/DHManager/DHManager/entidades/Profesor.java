package com.DHManager.DHManager.entidades;

public class Profesor {

	
	private String nombre;
	private String apellido;
	private Integer antiguedad;
	private Integer codigo;
	
	
	public Profesor(String nombre, String apellido, Integer antiguedad, Integer codigo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Integer getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", antiguedad=" + antiguedad + ", codigo="
				+ codigo + "]";
	}
	
	
	
}
