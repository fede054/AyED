package tp03.ejercicio2;

import tp03.ejercicio1.ListaDeEnterosEnlazada;

public class PilaDeEnteros extends ListaDeEnterosEnlazada {

	private ListaDeEnterosEnlazada pila = new ListaDeEnterosEnlazada();
	
	public void apilar (int elem) {
		this.pila.agregarInicio(elem);
	}
	
	public int desapilar () {
		int tmp = this.tope();
		this.pila.eliminarEn(1);
		return tmp;
	}
	
	public int tope () {
		return this.pila.elemento(1);
	}
	
	public boolean esVacia () {
		return this.pila.esVacia();
	}
	
	
}
