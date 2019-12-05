package dad.hola.jaxb;

import java.io.File;
import java.time.LocalDate;

import dad.hola.jaxb.model.Agenda;
import dad.hola.jaxb.model.Persona;
import dad.hola.jaxb.model.Telefono;
import dad.hola.jaxb.utils.JAXBUtil;

public class Main {

	public static void main(String[] args) throws Exception {
		
		// marshalling

		Persona p1 = new Persona();
		p1.setNombre("Chuck");
		p1.setApellidos("Norris");
		p1.setFechaNacimiento(LocalDate.of(1945, 12, 3));
		p1.getTelefonos().add(new Telefono(922000001L));
		p1.getTelefonos().add(new Telefono(922000002L));

		Persona p2 = new Persona();
		p2.setNombre("Sylvester");
		p2.setApellidos("Stallone");
		p2.setFechaNacimiento(LocalDate.of(1951, 7, 14));
		p2.getTelefonos().add(new Telefono(666000001L));
		p2.getTelefonos().add(new Telefono(666000002L));
		p2.getTelefonos().add(new Telefono(666000003L));

		Agenda agenda1 = new Agenda();
		agenda1.getContactos().add(p1);
		agenda1.getContactos().add(p2);
		
		JAXBUtil.save(agenda1, new File("agenda.xml"));
		
		// unmarshalling
		
		Agenda agenda2 = JAXBUtil.load(Agenda.class, new File("agenda.xml"));
		
		System.out.println(agenda2.getContactos());
		
	}

}
