import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String args[]) {
		double NT;
		double NP;
		double NTR;
		double NF;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la nota de teoria: ");
		NT = sc.nextDouble();
		System.out.println("Introduce la nota de practica: ");
		NP = sc.nextDouble();
		System.out.println("Introduce la nota de los trabajos: ");
		NTR = sc.nextDouble();

		if (NP <= 4) {
			NF = 4;
		} else {
			if (NT < 4.5) {
				NF = NT;
			} else {
				NF = NT + NTR;
			}
			if (NF >= 10) {
				System.out.println("Matricula de honor.");
			}
		}
		sc.close();
		System.out.println("La nota final es: " + NF);
	}
}
