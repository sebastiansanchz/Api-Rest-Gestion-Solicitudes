
package co.edu.unicauca.distribuidos.core.repositories;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;


import co.edu.unicauca.distribuidos.core.models.SolicitudEntity;

@Repository
public class SolicitudRepository {
	
	private ArrayList<SolicitudEntity> listaDeSolicitudes;
	
	public SolicitudRepository()
	{
		this.listaDeSolicitudes= new ArrayList<SolicitudEntity>();
		cargarSolicitudes();
	}
	
   public List<SolicitudEntity> findAll()
   {
	   System.out.println("Invocando a listarsolicitudes");
	   return this.listaDeSolicitudes;	
   }
	
   public SolicitudEntity findById(Integer id)
   {
	   System.out.println("Invocando a consultar una solicitud");
		SolicitudEntity objSolicitud=null;
		
		for (SolicitudEntity solicitud : listaDeSolicitudes) {
			if(solicitud.getId()==id)
			{
				objSolicitud=solicitud;
				break;
			}
		}
		
		return objSolicitud;
	}
	
	public SolicitudEntity save(SolicitudEntity solicitud)	
	{
		System.out.println("Invocando a almacenar solicitud");
		 SolicitudEntity objSolicitud=null;
		 if (this.listaDeSolicitudes.add(solicitud))
		 {
			 objSolicitud=solicitud;
		 }
		 
		 return objSolicitud;
	}
	
	public SolicitudEntity update(Integer id, SolicitudEntity solicitud)
	{
		 System.out.println("Invocando a actualizar un solicitud");
		 SolicitudEntity objSolicitud=null;
		 
		 for (int i = 0; i < this.listaDeSolicitudes.size(); i++) {
			if(this.listaDeSolicitudes.get(i).getId()==id)
			{				
				this.listaDeSolicitudes.set(i,solicitud);
				objSolicitud=solicitud;
				break;
			}
		}
		 
		 return objSolicitud;
	}
	
	public boolean delete(Integer id)
	{
		System.out.println("Invocando a eliminar un solicitud");
		boolean bandera=false;
		 
		 for (int i = 0; i < this.listaDeSolicitudes.size(); i++) {
			if(this.listaDeSolicitudes.get(i).getId()==id)
			{
				this.listaDeSolicitudes.remove(i);
				bandera=true;
				break;
			}
		}
		 
		 return bandera;
	}
	
	private void cargarSolicitudes()
	{
		SolicitudEntity objSolicitud1= new SolicitudEntity( 1, "Electronica", new Date(), 1,"Solicitud 1","redes");
		this.listaDeSolicitudes.add(objSolicitud1);
 		SolicitudEntity objSolicitud2= new SolicitudEntity(2, "Electronica", new Date(), 6, "Solicitud 2", "ciencias computacionales");
		this.listaDeSolicitudes.add(objSolicitud2);
		SolicitudEntity objSolicitud3= new SolicitudEntity(3, "Electronica", new Date(), 4, "Solicitud 3", "area 3 ");
		this.listaDeSolicitudes.add(objSolicitud3);
 		SolicitudEntity objSolicitud4= new SolicitudEntity(4, "Electronica", new Date(), 2, "Solicitud 4", "area 4");
		this.listaDeSolicitudes.add(objSolicitud4);
	}

}
