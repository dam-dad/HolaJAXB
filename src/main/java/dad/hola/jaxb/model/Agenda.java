package dad.hola.jaxb.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement
public class Agenda {
	
	private List<Persona> contactos = new ArrayList<>();

	@XmlElement
	public List<Persona> getContactos() {
		return contactos;
	}
	
}
