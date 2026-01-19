
package co.edu.unicauca.distribuidos.core.services.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.distribuidos.core.models.SolicitudEntity;
import co.edu.unicauca.distribuidos.core.repositories.SolicitudRepository;
import co.edu.unicauca.distribuidos.core.services.DTO.SolicitudDTO;

// @Service permite que spring cree automáticamente objetos de una clase.

@Service
public class SolicitudServiceImpl implements ISolicitudService {

	// @Autowired hace que spring inyecte automáticamente un objeto de la clase UsuarioRepository
	@Autowired
	private SolicitudRepository servicioAccesoBaseDatos;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<SolicitudDTO> findAll() {

		List<SolicitudEntity> solicitudesEntity = this.servicioAccesoBaseDatos.findAll();
		List<SolicitudDTO> solicitudesDTO = this.modelMapper.map(solicitudesEntity, new TypeToken<List<SolicitudDTO>>() {
		}.getType());
		return solicitudesDTO;
	}

	@Override
	public SolicitudDTO findById(Integer id) {
		SolicitudEntity objSolicitudEntity = this.servicioAccesoBaseDatos.findById(id);
		SolicitudDTO solicitudDTO = this.modelMapper.map(objSolicitudEntity, SolicitudDTO.class);
		return solicitudDTO;
	}

	@Override
	public SolicitudDTO save(SolicitudDTO solicitud) {
		SolicitudEntity solicitudEntity = this.modelMapper.map(solicitud, SolicitudEntity.class);
		SolicitudEntity objSolicitudEntity = this.servicioAccesoBaseDatos.save(solicitudEntity);
		SolicitudDTO solicitudDTO = this.modelMapper.map(objSolicitudEntity, SolicitudDTO.class);
		return solicitudDTO;
	}

	@Override
	public SolicitudDTO update(Integer id, SolicitudDTO solicitud) {
		SolicitudEntity solicitudEntity = this.modelMapper.map(solicitud, SolicitudEntity.class);
		SolicitudEntity solicitudEntityActualizado = this.servicioAccesoBaseDatos.update(id, solicitudEntity);
		SolicitudDTO solicitudDTO = this.modelMapper.map(solicitudEntityActualizado, SolicitudDTO.class);
		return solicitudDTO;
	}

	@Override
	public boolean delete(Integer id) {
		return this.servicioAccesoBaseDatos.delete(id);
	}
}
