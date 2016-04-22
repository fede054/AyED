package tp03.ejercicio1;

import java.util.Scanner;

public class TestListaDeEnterosEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaDeEnterosEnlazada ldinamica = new ListaDeEnterosEnlazada();
		ldinamica.comenzar();
		
		Scanner dato = new Scanner(System.in);
		for ( int i = 0; i < 10; i++) {
			System.out.println( "Ingrese un Nº (nros restantes: " + (10-i) + "): " );
			ldinamica.agregarFinal( dato.nextInt() );
		}
		dato.close();
		
		for ( int i = 1; i < ldinamica.tamanio(); i++) 
			System.out.println("Elemento Nº " + i + ": " + ldinamica.elemento(i));
	}

}
