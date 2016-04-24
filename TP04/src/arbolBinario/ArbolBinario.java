package arbolBinario;

import tp03.ejercicio5.Lista;
import tp03.ejercicio5.ListaEnlazada;
import tp03.ejercicio7.ColaGenerica;
import nodoBinario.NodoBinario;

public class ArbolBinario {

	private NodoBinario raiz;
	
	public ArbolBinario(){		
		this.raiz = null;
	}
	
	public ArbolBinario(Object dato){		
		this.raiz = new NodoBinario(dato);
	}	
	
	private ArbolBinario(NodoBinario nodo){		
		this.raiz = nodo;
	}
	
	private NodoBinario getRaiz(){		
		return raiz;
	}
	
	public Object getDatoRaiz(){
		if (this.getRaiz() != null){
			return this.getRaiz().getDato();
		}else{
			return null;
		}
	}
	
	public ArbolBinario getHijoIzquierdo(){		
		return new ArbolBinario(this.raiz.getHijoIzquierdo());
	}
	
	public ArbolBinario getHijoDerecho(){		
		return new ArbolBinario(this.raiz.getHijoDerecho());
	}	
	
	public void agregarHijoIzquierdo(ArbolBinario hijo){		
		this.raiz.setHijoIzquierdo(hijo.getRaiz());
	}

	public void agregarHijoDerecho(ArbolBinario hijo){		
		this.raiz.setHijoDerecho(hijo.getRaiz());
	}	
	
	public void eliminarHijoIzquierdo(){		
		this.raiz.setHijoIzquierdo(null);
	}
	
	public void eliminarHijoDerecho(){		
		this.raiz.setHijoDerecho(null);
	}	
	
	
	
	/*
	public boolean esMenor(ArbolBinario unArbol) {
		//Ejercicio quitado de la práctica
		return false;
	}
	*/
	
	public boolean esVacio() {
		// Falta implementar.
		return (this.raiz == null);
	}

	public boolean esHoja() {
		// Falta implementar.
		return (this.getHijoDerecho().getDatoRaiz() == null && this.getHijoIzquierdo().getDatoRaiz() == null);
	}
	
	public String toString() {
		// Falta implementar. 
		return "";
	}
	
	
	private Lista hojas(Lista l) {
		if (!this.esVacio()) {
			if (this.esHoja())
				l.agregarFinal(this.getDatoRaiz());
			else {
				this.getHijoIzquierdo().hojas(l);
				this.getHijoDerecho().hojas(l);
			}
		}
		return l;
	}
	
	public Lista frontera() {
		// Falta implementar. Ejercicio 2.a de la práctica
		Lista l = new ListaEnlazada();
		return this.hojas(l);
	}
	
	private boolean full (int[] tmp){
		int[] vizq = {0};
		int[] vder = {0};
		boolean ok = false;
		if (this.esHoja())
			tmp[0]++;
		else {
			if (!this.getHijoIzquierdo().esVacio()){
				if (this.getHijoIzquierdo().full(vizq))
					vizq[0]++;
			}
			if (!this.getHijoDerecho().esVacio()) {
				if (this.getHijoDerecho().full(vder))
					vder[0]++;
			}
		}
		ok = vizq[0] == vder[0];
		return ok;
	}
	
	/*
	
	private boolean full2 (int[] tmp){
		ColaGenerica<Integer> cola = new ColaGenerica<Integer>();
		//int[] vder = {0};
		boolean ok = false;
		if (this.esHoja())
			tmp[0]++;
		else
			if (!this.getHijoIzquierdo().esVacio()){
				vizq[0]++;
				this.getHijoIzquierdo().full2(vizq);
			}
			if (!this.getHijoDerecho().esVacio()){
				vder[0]++;
				this.getHijoDerecho().full2(vder);
			}
		ok = vizq[0] == vder[0];
		return ok;
	}
		
	*/ 
	
	public boolean lleno() {
		//Falta implementar. Ejercicio 2.b de la práctica
		int[] tmp = {0};
		return this.full(tmp);
	}
	
	public boolean completo() {
		//Falta implementar. Ejercicio 2.c de la práctica
		return true;

	}
	
	
}