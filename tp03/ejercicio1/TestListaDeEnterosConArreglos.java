package tp03.ejercicio1;

import java.util.Scanner;

public class TestListaDeEnterosConArreglos {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaDeEnterosConArreglos lfija = new ListaDeEnterosConArreglos();
		lfija.comenzar();
		
		Scanner dato = new Scanner(System.in);
		for ( int i = 0; i < 10; i++) {
			System.out.println( "Ingrese un Nº (nros restantes: " + (10-i) + "): " );
			lfija.agregarFinal( dato.nextInt() );
		}
		
		dato.close();
		for ( int i = 1; i <= lfija.tamanio(); i++) 
			System.out.println("Elemento Nº " + i + ": " + lfija.elemento(i));
		
	}

}
