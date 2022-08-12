package idat.com.PracticaFinal.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import idat.com.PracticaFinal.modelo.Profesor;
import idat.com.PracticaFinal.servicio.ProfesorServicio;


@Controller
@RequestMapping("/api/v1/profesor")
public class ProfesorControlador {

	@Autowired
    private ProfesorServicio service;
	
	@GetMapping("/listar")
    public @ResponseBody List<Profesor> listarProfesor(){
        return service.listarProfesor();
    }
    
    @GetMapping("/listar/{id}")
    public @ResponseBody Profesor obtenerProfesor(@PathVariable Integer id){
        return service.buscarProfesor(id);
    }
    
    @PostMapping("/guardar")
    public @ResponseBody void guardarProfesor(@RequestBody Profesor profesor) {
        service.guardarProfesor(profesor);
    }
    
    @PutMapping("/actualizar")
    public void actualizarProfesor(@RequestBody Profesor profesor) {
    	service.actualizarProfesor(profesor);
        
    }
    
    @DeleteMapping
    public @ResponseBody void elimnarProfesor(@RequestBody Integer idprofesor) {
        service.eliminar(idprofesor);
    }
    
    
    

}
