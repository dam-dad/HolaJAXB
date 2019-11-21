package dad.hola.jaxb.model;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class Telefono {

	private Long numero;

	public Telefono() {
	}

	public Telefono(Long numero) {
		this.numero = numero;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "" + getNumero();
	}

}
