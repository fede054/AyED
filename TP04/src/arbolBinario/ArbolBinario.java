package arbolBinario;

import tp03.ejercicio5.Lista;
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
		return true;
	}

	public boolean esHoja() {
		// Falta implementar. 
		return true;
	}
	
	public String toString() {
		// Falta implementar. 
		return "";
	}
	
	
	public Lista frontera() {
		// Falta implementar. Ejercicio 2.a de la práctica
		return null;
	}
	
	public boolean lleno() {
		//Falta implementar. Ejercicio 2.b de la práctica
		return true;

	}
	
	public boolean completo() {
		//Falta implementar. Ejercicio 2.c de la práctica
		return true;

	}
	
	
}