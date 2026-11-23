package Casa_Repaso;


import java.util.Scanner;


public class Ej_piramides {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("De cuanto quiere la piramide: ");
		int base = scanner.nextInt();
		
		
		
		scanner.close();
	}
	
	public static void piramide1(int num) {
		
		for(int i = 1; i<num;i++) {
			for(int o = i+1; o>=i;o--) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
		
	}
	
}
