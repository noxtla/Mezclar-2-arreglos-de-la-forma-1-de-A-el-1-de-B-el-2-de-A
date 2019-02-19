package arreglo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int arregloA [] = new int [5];
		int arregloB [] = new int [5];
		int arregloC [] = new int [10];

		
		for(int i=0; i<5; i++) {
			System.out.println("Ingresa el numero para la A " + (i+1));
			arregloA[i] = entrada.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("Ingresa el numero para la B " + (i+1));
			arregloB[i] = entrada.nextInt();
		}
		
		int j = 0;
		for(int i=0; i<5; i++) {
			arregloC[j] = arregloA[i];
			j++;
			arregloC[j] = arregloB[i];
			j++;
		}
		

		
		System.out.println("Mostrando");
		for(int i = 0; i<10; i++) {
			System.out.println(arregloC[i] + " ");
		}
	}

}
