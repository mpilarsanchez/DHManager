package com.DHManager.DHManager.entidades;

import java.util.Date;

public class Inscripcion {

	private Alumno alumno;
	private Curso curso;
	private Date fechaDeInscripcion;
	
	
	public Inscripcion(Alumno alumno, Curso curso) {
		super();
		this.alumno = alumno;
		this.curso = curso;
		this.fechaDeInscripcion = new Date();
	}


	public Alumno getAlumno() {
		return alumno;
	}


	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	public Date getFechaDeInscripcion() {
		return fechaDeInscripcion;
	}


	public void setFechaDeInscripcion(Date fechaDeInscripcion) {
		this.fechaDeInscripcion = fechaDeInscripcion;
	}


	@Override
	public String toString() {
		return "Inscripcion [alumno=" + alumno + ", curso=" + curso + ", fechaDeInscripcion=" + fechaDeInscripcion
				+ "]";
	}

   
	
	
}
