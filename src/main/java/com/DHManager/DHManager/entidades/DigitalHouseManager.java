package com.DHManager.DHManager.entidades;

import java.util.List;

public class DigitalHouseManager {

	private List<Alumno> listaAlumnos;
	private List<Profesor> listaProfesores;
	private List<Curso> listaDeCursos;
	private List<Inscripcion> listaDeInscripciones;
	
	
	public DigitalHouseManager(List<Alumno> listaAlumnos, List<Profesor> listaProfesores, List<Curso> listaDeCursos,
			List<Inscripcion> listaDeInscripciones) {
		super();
		this.listaAlumnos = listaAlumnos;
		this.listaProfesores = listaProfesores;
		this.listaDeCursos = listaDeCursos;
		this.listaDeInscripciones = listaDeInscripciones;
	}


	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}


	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}


	public List<Profesor> getListaProfesores() {
		return listaProfesores;
	}


	public void setListaProfesores(List<Profesor> listaProfesores) {
		this.listaProfesores = listaProfesores;
	}


	public List<Curso> getListaDeCursos() {
		return listaDeCursos;
	}


	public void setListaDeCursos(List<Curso> listaDeCursos) {
		this.listaDeCursos = listaDeCursos;
	}


	public List<Inscripcion> getListaDeInscripciones() {
		return listaDeInscripciones;
	}


	public void setListaDeInscripciones(List<Inscripcion> listaDeInscripciones) {
		this.listaDeInscripciones = listaDeInscripciones;
	}


	@Override
	public String toString() {
		return "DigitalHouseManager [listaAlumnos=" + listaAlumnos + ", listaProfesores=" + listaProfesores
				+ ", listaDeCursos=" + listaDeCursos + ", listaDeInscripciones=" + listaDeInscripciones + "]";
	}
	
	
	/**
	 * METODO QUE PERMITE DAR DE ALTA A UN CURSO
	 * @param nombre
	 * @param codigoCurso
	 * @param cupoMaximoDealumnos
	 */
	public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos) {
		Curso nuevoCurso = new Curso(nombre,codigoCurso,cupoMaximoDealumnos);
		
		
	}
	
	
}
