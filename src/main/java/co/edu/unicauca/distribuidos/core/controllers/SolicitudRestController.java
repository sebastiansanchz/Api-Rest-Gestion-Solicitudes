
package co.edu.unicauca.distribuidos.core.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.distribuidos.core.services.DTO.SolicitudDTO;
import co.edu.unicauca.distribuidos.core.services.services.ISolicitudService;

// SWAGGER Annotations
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(
    name = "Solicitudes",
    description = "API para la gestión de solicitudes"
)

@RestController 
@RequestMapping("/api")
public class SolicitudRestController {

	@Autowired
	private ISolicitudService solicitudService;

	@Operation(
	    summary = "Obtener todas las solicitudes",
	    description = "Retorna la lista completa de solicitudes registradas"
	)
	@GetMapping("/solicitudes")
	public List<SolicitudDTO> index() {
		return solicitudService.findAll();
	}

	@Operation(
	    summary = "Obtener solicitud por ID",
	    description = "Retorna una solicitud específica según el ID proporcionado"
	)
	@GetMapping("/solicitudes/{id}")
	public SolicitudDTO show(@PathVariable Integer id) {
		SolicitudDTO objSolicitud = null;
		objSolicitud = solicitudService.findById(id);
		return objSolicitud;
	}


	@Operation(
	    summary = "Crear una nueva solicitud",
	    description = "Registra una nueva solicitud en el sistema"
	)
	@PostMapping("/solicitudes")
	public SolicitudDTO create(@RequestBody SolicitudDTO solicitud) {
		SolicitudDTO objSolicitud = null;
		objSolicitud = solicitudService.save(solicitud);
		return objSolicitud;
	}

	@Operation(
	    summary = "Actualizar una solicitud",
	    description = "Actualiza una solicitud existente según su ID"
	)
	@PutMapping("/solicitudes/{id}")
	public SolicitudDTO update(@RequestBody SolicitudDTO solicitud, @PathVariable Integer id) {
		SolicitudDTO objSolicitud = null;
		SolicitudDTO solicitudActual = solicitudService.findById(id);
		if (solicitudActual != null) {
			objSolicitud = solicitudService.update(id, solicitud);
		}
		return objSolicitud;
	}

	@Operation(
	    summary = "Eliminar una solicitud",
	    description = "Elimina una solicitud existente según su ID"
	)
	@DeleteMapping("/solicitudes/{id}")
	public Boolean delete(@PathVariable Integer id) {
		Boolean bandera = false;
		SolicitudDTO solicitudActual = solicitudService.findById(id);
		if (solicitudActual != null) {
			bandera = solicitudService.delete(id);
		}
		return bandera;

	}



}
