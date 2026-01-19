package co.edu.unicauca.distribuidos.core.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class SolicitudEntity {  
	private Integer id;		
	private String nombreFacultad;	
	private Date fechaSolicitud;	
	private Integer numeroTotalAutores;	
	private String titulo;
	private String areaDisciplinar;  
	
	public SolicitudEntity()
	{
		
	}
}
