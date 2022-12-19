package BC03.P2;

import java.util.InputMismatchException;
import java.util.Scanner;

import BC03.P2.Triangulo.ErrorException;

public class Main {

	final static Scanner sn = new Scanner (System.in);
	
public static void main(String[] args) throws ErrorException {
		int [] valor = new int[6];
		try {
			for (int i = 0; i<6; i++) {

				System.out.println("Dame un dato (números)");
				valor[i] = sn.nextInt();
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Solo números...");
			System.exit(1);
		}
		Triangulo t = new Triangulo(valor[0],valor[1],valor[2],valor[3],valor[4],valor[5]);
		String tipo = t.tipoTriangulo();
		System.out.println(tipo);
//	
		
	}

}
