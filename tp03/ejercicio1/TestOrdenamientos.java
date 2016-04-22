package tp03.ejercicio1;

import java.util.Random;

public class TestOrdenamientos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaDeEnterosEnlazada ldinamica = new ListaDeEnterosEnlazada();
	
		ldinamica.comenzar();
		
		System.out.println("Datos en lista: " + ldinamica.toString());
		System.out.println("Tama�o: " + ldinamica.tamanio());
		
		Random dato = new Random();
		int j = dato.nextInt(5000);
		int i = 0;
		while ( i < j ) {
			int tmp = dato.nextInt(50000);
			if ( !ldinamica.incluye(tmp) ) {
					ldinamica.agregarFinal(tmp);
					i++;
			}
		}
		
		
	
		
		
		System.out.println("Datos en lista antes de ordenar: " + ldinamica.toString());
		System.out.println("Tama�o: " + ldinamica.tamanio());
		
		
		
		ListaDeEnterosEnlazada ordenada = ldinamica.ordenar();
		
		System.out.println("Datos en lista original despu�s de ordenar: " + ldinamica.toString());
		System.out.println("Tama�o: " + ldinamica.tamanio());
		
		
		
		ListaDeEnterosEnlazada clonada = ldinamica.clonar();
		
		System.out.println("Datos en lista clonada:          " + clonada.toString());
		System.out.println("Tama�o: " + clonada.tamanio());
		
		
			
		System.out.println("Datos en lista nueva despues de ordenar: " + ordenada.toString());
		System.out.println("Tama�o: " + ordenada.tamanio());
		
		
		
		ldinamica.comenzar();
		while ( !ldinamica.fin() ) {
			//if ( !ldinamica.esVacia() )
				ldinamica.eliminarEn(1);
				ldinamica.comenzar();
		}	
		
		System.out.println("Datos en lista despu�s de borrar: " + ldinamica.toString());
		System.out.println("Tama�o: " + ldinamica.tamanio());
		
		System.out.println("Datos en lista ordenada despu�s de borrar: " + ordenada.toString());
		System.out.println("Tama�o: " + ordenada.tamanio());
		
		}

}
