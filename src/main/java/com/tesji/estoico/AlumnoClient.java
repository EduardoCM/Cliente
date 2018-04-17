package com.tesji.estoico;

import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;

public class AlumnoClient {

	public static void main(String[] args) {

		List<Alumno> list = Client.create().resource("http://localhost:8080/HelloJersey/rest/alumnos/json")
				.get(new GenericType<List<Alumno>>() {});

		for (Alumno alumno : list) {
			System.out.println(" ============ ");
			System.out.println("Num Cuenta: " + alumno.getNumeroCuenta());
			System.out.println("Nombre: " + alumno.getNombre());
			System.out.println("Apellidos: " + alumno.getApellidos());
			System.out.println("Carrera: " + alumno.getCarrera());
		}

	}

}
