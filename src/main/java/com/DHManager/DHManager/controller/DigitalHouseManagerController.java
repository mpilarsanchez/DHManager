package com.DHManager.DHManager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DHManager.DHManager.entidades.Alumno;
import com.DHManager.DHManager.entidades.DigitalHouseManager;






@RestController
@RequestMapping(value = "/")
public class DigitalHouseManagerController {

	@Autowired
	private DigitalHouseManager digitalHouseManagger;
	
	@Autowired
	private Alumno alumno;

	
	
	@PostMapping(value = "/crearTitular")
	public void crearTitular(@RequestParam String nombre, @RequestParam String apellido, @RequestParam Integer codigoProfesor, @RequestParam String especialidad){
		digitalHouseManagger.altaProfesorTitular(nombre, apellido, codigoProfesor, especialidad);
	
	}
	
	@PostMapping(value = "/crearAdjunto")
	public void crearAdjunto(@RequestParam String nombre, @RequestParam String apellido, @RequestParam Integer codigoProfesor, @RequestParam String especialidad){
		digitalHouseManagger.altaProfesorTitular(nombre, apellido, codigoProfesor, especialidad);
	
	}
	
	@PostMapping(value = "/crearCurso")
	public void creaCurso(@RequestParam String nombre, @RequestParam Integer codigoCurso, @RequestParam Integer cupoMaximoDealumnos){
		digitalHouseManagger.altaCurso(nombre, codigoCurso, cupoMaximoDealumnos);
	
	}
	
	@PostMapping(value = "/asignarProfesor")
	public void asignarProfesor(@RequestParam Integer codigoCurso, @RequestParam Integer codigoProfesorTitular, @RequestParam Integer codigoProfesorAdjunto){
		digitalHouseManagger.asignarProfesores(codigoCurso, codigoProfesorTitular, codigoProfesorAdjunto);
	
	}
	
	@PostMapping(value = "/altaAlumno")
	public void altaAlumno(@RequestParam String nombre, @RequestParam String apellido, @RequestParam Integer codigoAlumno){
		digitalHouseManagger.altaAlumno(nombre, apellido, codigoAlumno);
	
	}
	
	@PostMapping(value = "/inscribirAlumno")
	public void inscribirAlumno(@RequestParam Integer codigoAlumno, @RequestParam Integer codigoCurso){
		digitalHouseManagger.inscribirAlumno(codigoAlumno, codigoCurso);
	
	}
	
	@DeleteMapping(value = "/bajaProfesor")
	public void inscribirAlumno(@RequestParam Integer codigoProfesor){
		digitalHouseManagger.bajaProfesor(codigoProfesor);
	
	}
	
	@GetMapping(value = "/detalleAlumno")
	public void detalleAlumno(@RequestParam Alumno alumno) {
		alumno.toString();
	}
	
	@PutMapping(value = "/actualizarAlumno")
	public void actualizarAlumno(@RequestParam Alumno alumno, @RequestParam String nombre, @RequestParam String apellido, @RequestParam Integer codigoAlumno ) {
		alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setCodigo(codigoAlumno);
	}
	
	
	
	
	
	
	
}
