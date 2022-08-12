package idat.com.PracticaFinal.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.PracticaFinal.modelo.Profesor;
import idat.com.PracticaFinal.repositorio.ProfesorRepositorio;

@Service
public class ProfesorServicioImpl implements ProfesorServicio {

	@Autowired
	public ProfesorRepositorio repositorio;
	
	@Override
	public List<Profesor> listarProfesor() {
		
		return repositorio.findAll();
	}

	@Override
	public Profesor buscarProfesor(Integer idprofesor) {
		// TODO Auto-generated method stub
		return repositorio.findById(idprofesor).orElse(null);
	}

	@Override
	public void eliminar(Integer idprofesor) {
		// TODO Auto-generated method stub
		repositorio.deleteById(idprofesor);
	}
	

	@Override
	public void guardarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		repositorio.save(profesor);
	}

	@Override
	public void actualizarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(profesor);
		
	}
	
	
	

}
