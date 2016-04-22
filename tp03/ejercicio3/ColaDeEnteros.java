package tp03.ejercicio3;

import tp03.ejercicio1.ListaDeEnterosEnlazada;

public class ColaDeEnteros extends ListaDeEnterosEnlazada {

		private ListaDeEnterosEnlazada cola = new ListaDeEnterosEnlazada();
		
		public void encolar(Integer elem) {
			this.agregarInicio(elem);
		}
		
		public Integer desencolar() {
			this.comenzar();
			return (this.proximo());			
		}
		
		public Integer tope() {
			this.comenzar();
			return this.cola.elemento(1);
		}
		
		public boolean esVacia() {
			return (this.cola.esVacia());
		}
		
		
	
}
