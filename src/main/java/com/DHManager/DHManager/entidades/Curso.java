package com.DHManager.DHManager.entidades;

import java.util.ArrayList;
import java.util.List;

import com.DHManager.DHManager.ProfesorAdjunto;

public class Curso {

	private String nombre;
	private Integer codigo;
	private Integer cupoDisponible;

	private ProfesorTitular profesorTitular;
	private ProfesorAdjunto profesorAdjunto;

	private List<Alumno> listaAlumnosDelCurso;

	public Curso(String nombre, Integer codigo, Integer cupoDisponible) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.cupoDisponible = cupoDisponible;
		this.listaAlumnosDelCurso = new ArrayList<Alumno>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public ProfesorTitular getProfesorTitular() {
		return profesorTitular;
	}

	public void setProfesorTitular(ProfesorTitular profesorTitular) {
		this.profesorTitular = profesorTitular;
	}

	public ProfesorAdjunto getProfesorAdjunto() {
		return profesorAdjunto;
	}

	public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto) {
		this.profesorAdjunto = profesorAdjunto;
	}

	public List<Alumno> getListaAlumnosDelCurso() {
		return listaAlumnosDelCurso;
	}

	public void setListaAlumnosDelCurso(List<Alumno> listaAlumnosDelCurso) {
		this.listaAlumnosDelCurso = listaAlumnosDelCurso;
	}

	public Integer getCupoDisponible() {
		return cupoDisponible;
	}

	public void setCupoDisponible(Integer cupoDisponible) {
		this.cupoDisponible = cupoDisponible;
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
		Curso other = (Curso) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", codigo=" + codigo + "]";
	}

	/**
	 * metodo que permite agregar un un alumno a la lista
	 * 
	 * @param unAlumno
	 * @return
	 */

	public boolean saberDisponible() {
		if (this.getCupoDisponible() <= cupoDisponible) {
			return true;
		}
		return false;
	}

	public Boolean agregarUnAlumno(Alumno unAlumno) {

		if (saberDisponible()) {

			listaAlumnosDelCurso.add(unAlumno);
			return true;

		} else {
			return false;
		}
	}

	
	/**
	 * Método  que permite eliminar un alumno de la lista de alumnos del curso.
	 * @param unAlumno
	 */
	 public void eliminarAlumno(Alumno unAlumno) {
		listaAlumnosDelCurso.remove(unAlumno);
	}
	
}
