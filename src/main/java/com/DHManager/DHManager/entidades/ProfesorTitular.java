package com.DHManager.DHManager.entidades;

public class ProfesorTitular extends Profesor{

	private String especialidad;
	
	public ProfesorTitular(String nombre, String apellido, Integer antiguedad, Integer codigo, String especialidad) {
		super(nombre, apellido, antiguedad, codigo);
		this.especialidad = especialidad;
		
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return super.toString() + "ProfesorTitular [especialidad=" + especialidad + "]";
	}
   
	
}
