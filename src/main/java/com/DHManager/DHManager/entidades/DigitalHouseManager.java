package com.DHManager.DHManager.entidades;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

	private List<Alumno> listaAlumnos;
	private List<Profesor> listaProfesores;
	private List<Curso> listaDeCursos;
	private List<Inscripcion> listaDeInscripciones;

	public DigitalHouseManager() {
		super();
		this.listaAlumnos = new ArrayList<Alumno>();
		this.listaProfesores = new ArrayList<Profesor>();
		this.listaDeCursos = new ArrayList<Curso>();
		this.listaDeInscripciones = new ArrayList<Inscripcion>();
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
	 * 
	 * @param nombre
	 * @param codigoCurso
	 * @param cupoMaximoDealumnos
	 */
	public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos) {
		Curso nuevoCurso = new Curso(nombre, codigoCurso, cupoMaximoDealumnos);
		listaDeCursos.add(nuevoCurso);

	}

	/**
	 * METODO QUE PERMITE DAR DE BAJA A UN CURSO El método debe utilizar el código
	 * del curso para buscarlo en la lista de cursos y eliminarlo de la lista.
	 * 
	 * @param codigoCurso
	 */
	public void bajaCurso(Integer codigoCurso) {

		for (Curso c : listaDeCursos) {
			if (c.getCodigo().equals(codigoCurso)) {
				listaDeCursos.remove(c);
			}
		}
	}

	/**
	 * METODO QUE PERMITE DAR DE ALTA A UN PROFESOR ADJUNTO El método debe crear un
	 * profesor adjunto con los datos correspondientes y agregarlo a la lista de
	 * profesores.
	 * 
	 * @param nombre
	 * @param apellido
	 * @param codigoProfesor
	 * @param cantidadDeHoras
	 */
	public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
		ProfesorAdjunto profesorAdjunto = new ProfesorAdjunto(nombre, apellido, 0, codigoProfesor, cantidadDeHoras);
		listaProfesores.add(profesorAdjunto);
	}

	/**
	 * METODO PARA DAR DE ALTA A UN PROFESOR TITULAR
	 * 
	 * @param nombre
	 * @param apellido
	 * @param codigoProfesor
	 * @param especialidad
	 */

	public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
		ProfesorTitular profesorTitular = new ProfesorTitular(nombre, apellido, 0, codigoProfesor, especialidad);
		listaProfesores.add(profesorTitular);
	}

	/**
	 * METODO QUE PERMITE ELIMINAR UN PROFESOR DE LA LISTA DE PROFESORES El método
	 * debe utilizar el código del profesor para buscarlo en la lista de profesores
	 * y eliminarlo de la lista.
	 * 
	 * @param codigoProfesor
	 */
	public void bajaProfesor(Integer codigoProfesor) {
		for (Profesor p : listaProfesores) {
			if (p.getCodigo().equals(codigoProfesor)) {
				listaDeCursos.remove(p);
			}
		}
	}

	/**
	 * METODO QUE PERMITE DAR DE ALTA A UN ALUMNO
	 * 
	 * @param nombre
	 * @param apellido
	 * @param codigoAlumno
	 */
	public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
		Alumno alumnoNuevo = new Alumno(nombre, apellido, codigoAlumno);
		listaAlumnos.add(alumnoNuevo);
	}

	/**
	 * METODO QUE PERMITE INSCRIBIR UN ALUMNO EN UN CURSO
	 * 
	 * @param codigoAlumno
	 * @param codigoCurso
	 */
	public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {

		Curso cursoAInscribir = null;
		Alumno alumnoAInscribir = null;

		for (Curso c : listaDeCursos) {
			if (c.getCodigo().equals(codigoCurso)) {
				cursoAInscribir = c;
			}

			for (Alumno a : listaAlumnos) {
				if (a.getCodigo().equals(codigoAlumno)) {
					alumnoAInscribir = a;
				}
			}

			if (cursoAInscribir.agregarUnAlumno(alumnoAInscribir)) {
				Inscripcion nuevaInscripcion = new Inscripcion(alumnoAInscribir, cursoAInscribir);
				listaDeInscripciones.add(nuevaInscripcion);
				System.out.println("La inscripcion se realizó con exito");
			} else {
				System.out.println("no se pudo inscribir porque no hay cupo");
			}

		}
	}

	/**
	 * METODO QUE PERMITE ASIGNAR UN CURSO A SUS PROFESORES
	 * 
	 * @param codigoCurso
	 * @param codigoProfesorTitular
	 * @param codigoProfesorAdjunto
	 */
	public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {

		ProfesorTitular profesorTitular = null;
		ProfesorAdjunto profesorAdjunto = null;
        Curso cursoAAsignar = null;
        
        for (Curso c : listaDeCursos) {
			if (c.getCodigo().equals(codigoCurso)) {
				cursoAAsignar = c;
			}
        
		for (Profesor p : listaProfesores) {
			if (p.getCodigo().equals(codigoProfesorTitular)) {
				profesorTitular = (ProfesorTitular) p;
			} else if (p.getCodigo().equals(codigoProfesorAdjunto)) {
				profesorAdjunto = (ProfesorAdjunto) p;
			}
		}
		
		cursoAAsignar.setProfesorTitular(profesorTitular);
		cursoAAsignar.setProfesorAdjunto(profesorAdjunto);
	}
}
}