package co.edu.unicauca.distribuidos.core.services.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class SolicitudDTO {

	private Integer id;		
	private String nombreFacultad;	
	private Date fechaSolicitud;	
	private String numeroTotalAutores;	
	private String titulo;
	private String areaDisciplinar; 
	
	public SolicitudDTO()
	{
		
	}
}