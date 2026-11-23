package Ejercicios_Repaso_antes_de_examen;

public class laboratorio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double suma = 0;
		double maxima = 0;

		System.out.print("Nota 1: ");
		double nota = sc.nextDouble();
		suma = suma + nota;
		if (nota > maxima) {
			maxima = nota;
		}

		System.out.print("Nota 2: ");
		nota = sc.nextDouble();
		suma = suma + nota;
		if (nota > maxima) {
			maxima = nota;
		}

		System.out.print("Nota 3: ");
		nota = sc.nextDouble();
		suma = suma + nota;
		if (nota > maxima) {
			maxima = nota;
		}

		System.out.printf("Media: %.2f%n", suma / 3);
		System.out.printf("Nota maxima: %.2f%n", maxima);
	}
}
