package com.tesji.estoico;

import java.util.List;
import java.util.logging.Logger;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;

public class AlumnoClient {

	private static Logger LOG = Logger.getLogger(AlumnoClient.class.getName());
	
	public static void main(String[] args) {

		List<Alumno> list = Client.create().resource("http://localhost:8080/HelloJersey/rest/alumnos/json")
				.get(new GenericType<List<Alumno>>() {});

		for (Alumno alumno : list) {
			LOG.info(" ============ ");
			LOG.info("Num Cuenta: " + alumno.getNumeroCuenta());
			LOG.info("Nombre: " + alumno.getNombre());
			LOG.info("Apellidos: " + alumno.getApellidos());
			LOG.info("Carrera: " + alumno.getCarrera());
		}

	}

}
