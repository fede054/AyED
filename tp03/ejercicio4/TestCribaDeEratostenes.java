package tp03.ejercicio4;

import tp03.ejercicio1.*;
import tp03.ejercicio4.*;


public class TestCribaDeEratostenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long antes, despues;
		
		ListaDeEnterosEnlazada ldinamica = new ListaDeEnterosEnlazada();
		CribaDeEratostenes a = new CribaDeEratostenes();
		
		for (int i=1; i<=10000; i++)
			ldinamica.agregarEn(i,i);
		
		System.out.println("el tamaño al inicio es: " + ldinamica.tamanio());		
		
		ListaDeEnterosEnlazada lprimos1 = new ListaDeEnterosEnlazada();
		ListaDeEnterosEnlazada lprimos2 = new ListaDeEnterosEnlazada();
		
		antes = System.currentTimeMillis();
		lprimos1 = a.obtenerPrimos1(ldinamica);
		despues = System.currentTimeMillis() - antes;
		
		System.out.println ("Los elementos son (1): " + lprimos1.toString());
		System.out.println ("Tardó (1): " + despues);
		
		antes = System.currentTimeMillis();
		lprimos2 = a.obtenerPrimos2(ldinamica);
		despues = System.currentTimeMillis() - antes;
		
		System.out.println ("Los elementos son (2): " + lprimos2.toString());
		System.out.println ("Tardó (2): " + despues);
	}

}
