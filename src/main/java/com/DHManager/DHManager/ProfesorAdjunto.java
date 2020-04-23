package com.DHManager.DHManager;

import com.DHManager.DHManager.entidades.Profesor;

public class ProfesorAdjunto extends Profesor {
  

	Integer cantidadHorasConsulta;
	
	public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigo, Integer cantidadHorasConsulta) {
		super(nombre, apellido, antiguedad, codigo);
		this.cantidadHorasConsulta = cantidadHorasConsulta;
	}

	public Integer getCantidadHorasConsulta() {
		return cantidadHorasConsulta;
	}

	public void setCantidadHorasConsulta(Integer cantidadHorasConsulta) {
		this.cantidadHorasConsulta = cantidadHorasConsulta;
	}

	@Override
	public String toString() {
		return super.toString() + "ProfesorAdjunto [cantidadHorasConsulta=" + cantidadHorasConsulta + "]";
	}
	
	
}
