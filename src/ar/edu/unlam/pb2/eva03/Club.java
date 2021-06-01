package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private ArrayList<Deportista> socios = new ArrayList<Deportista>();
	private ArrayList<Evento> competencias = new ArrayList<Evento>();
	private String nombre;

	public Club(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean agregarDeportista(Deportista nuevoDeportista) {
		if (existe(nuevoDeportista)) {
			return false;
		} else {
			this.socios.add(nuevoDeportista);
			return true;
		}

	}

	private Boolean existe(Deportista aBuscar) {
		for (Deportista actual : socios) {
			if (actual.equals(aBuscar)) {
				return true;
			}
		}
		return false;
	}

	public Integer getCantidadSocios() {
		return this.socios.size();
	}

	public void crearEvento(TipoDeEvento tipo, String nombreEvento) {
		Evento nuevoEvento = new Evento(tipo, nombreEvento);
		this.competencias.add(nuevoEvento);
	}
	
	
	//A PARTIR DE ACÁ ESTOY CONFUNDIDO

	public Integer inscribirEnEvento(String nombreEvento, Deportista nuevoDeportista) {
		Evento inscripcionEvento = getEvento(nombreEvento);
		Deportista nuevaInscripcion = getDeportista(nuevoDeportista);

		if (inscripcionEvento != null && nuevaInscripcion != null) {
			return inscripcionEvento.agregarParticipante(nuevaInscripcion);
		}
		return null;

	}

	private Evento getEvento(String nombreEvento) {
		for (Evento nuevoevento : competencias) {
			if (nuevoevento.equals(nombreEvento))
				return nuevoevento;
		}
		return null;
	}

	private Deportista getDeportista(Deportista nuevoDeportista) {
		for (Deportista actual : socios) {
			if (actual.equals(nuevoDeportista))
				return actual;
		}
		return null;
	}

}
