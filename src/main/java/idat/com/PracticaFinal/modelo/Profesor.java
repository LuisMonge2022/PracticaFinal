package idat.com.PracticaFinal.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profesor")
public class Profesor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idprofesor;	
	
	private String nombre;	
	private String direcccion;
	
	
	public Integer getIdprofesor() {
		return idprofesor;
	}
	public void setIdprofesor(Integer idprofesor) {
		this.idprofesor = idprofesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirecccion() {
		return direcccion;
	}
	public void setDirecccion(String direcccion) {
		this.direcccion = direcccion;
	}
	public Profesor(Integer idprofesor, String nombre, String direcccion) {
		super();
		this.idprofesor = idprofesor;
		this.nombre = nombre;
		this.direcccion = direcccion;
	}
	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
