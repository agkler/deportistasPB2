package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICiclista, ICorredor, INadador{

	private String distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados;
	private TipoDeBicicleta tipo;
	

	public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tipo) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida=distanciaPreferida;
		this.setTipoDeBicicleta(tipo);
	}

	

	



	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKilometrosEntrenados= km;
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return cantidadDeKilometrosEntrenados;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipo;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipo) {
		this.tipo = tipo;
	}

}
