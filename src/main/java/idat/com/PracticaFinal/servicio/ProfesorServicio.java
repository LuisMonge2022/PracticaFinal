package idat.com.PracticaFinal.servicio;

import java.util.List;

import idat.com.PracticaFinal.modelo.Profesor;

public interface ProfesorServicio {
	
	public List<Profesor> listarProfesor();
	public Profesor buscarProfesor(Integer idprofesor);
	public void eliminar(Integer idprofesor);		
	public void guardarProfesor(Profesor profesor);
	public void actualizarProfesor(Profesor profesor);
	
	
	

}
