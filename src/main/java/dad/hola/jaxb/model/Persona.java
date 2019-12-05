package dad.hola.jaxb.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import dad.hola.jaxb.utils.LocalDateAdapter;

@XmlType
public class Persona {

	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private List<Telefono> telefonos = new ArrayList<Telefono>();

	@XmlAttribute
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlAttribute
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@XmlAttribute
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@XmlElement
	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefono) {
		this.telefonos = telefono;
	}

	@Override
	public String toString() {
		return getNombre() + " " + getApellidos() + " (" + getTelefonos().size() + " teléfonos registrados)";
	}

}
