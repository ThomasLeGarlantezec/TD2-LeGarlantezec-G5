import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//discriminant();
		//parite();
		//max();
		//min();
		//egaliteStr();
		//factorielle();
		//countDown();
		//carres();
		//tableMultiplication();
		//division();
		//regle();
		nombrePremier();
	}
	
	public static void discriminant() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quelle est la valeur de a ?");
		int a = scanner.nextInt();
		System.out.println("Quelle est la valeur de b ?");
		int b = scanner.nextInt();
		System.out.println("Quelle est la valeur de c ?");
		int c = scanner.nextInt();
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if (delta < 0) {
			float racineCUneRelle = (float)(-b)/(2*a);
			float racineCDeuxRelle = (float)(-b)/(2*a);
			double racineCUneIm = + (Math.sqrt(-delta)/(2*a));
			double racineCDeuxIm = - (Math.sqrt(-delta)/(2*a));
			System.out.println("Ce polynome a pour racines complexe :" + racineCUneRelle +"+("+ racineCUneIm +")i"+" et " + racineCDeuxRelle +"+("+ racineCDeuxIm+")i");
			}
		else if  (delta == 0) {
			int racineDouble = (-b)/(2*a);
			System.out.println("Ce polynome a pour racine reelle double :" + racineDouble);
			}
		else if (delta > 0) {
			double racineUne = ((-b) + Math.sqrt(delta))/(2*a);
			double racineDeux = ((-b) - Math.sqrt(delta))/(2*a);
			System.out.println("Ce polynome a pour racines reelles :" + racineUne +" et " + racineDeux);
			}
		}
	
	public static void parite() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quelle est la valeur de l'entier ?");
		int entier = scanner.nextInt();
		
		if (entier%2 == 0 ) {
			System.out.println("l'entier " + entier + " est pair");
			}
		else {
			System.out.println("l'entier " + entier + " est impair");
			}
		}
	
	public static void max() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quelle est la valeur du premier entier ?");
		int entierUn = scanner.nextInt();
		System.out.println("Quelle est la valeur du deuxième entier ?");
		int entierDeux = scanner.nextInt();
		
		if (entierUn < entierDeux) {
			System.out.println("l'entier " + entierDeux + " est le max");
			}
		else if (entierUn > entierDeux) {
			System.out.println("l'entier " + entierUn + " est le max");
			}
		else {
			System.out.println("les entiers sont égaux");
			}
		}
	
	public static void min() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quelle est la valeur du premier entier ?");
		int entierUn = scanner.nextInt();
		System.out.println("Quelle est la valeur du deuxième entier ?");
		int entierDeux = scanner.nextInt();
		
		if (entierUn < entierDeux) {
			System.out.println("l'entier " + entierUn + " est le min");
			}
		else if (entierUn > entierDeux) {
			System.out.println("l'entier " + entierDeux + " est le min");
			}
		else {
			System.out.println("les entiers sont égaux");
			}
		}
	
	public static void egaliteStr() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quelle est la première phrase ?");
		String phraseUn = scanner.nextLine();
		System.out.println("Quelle est la deuxième phrase ?");
		String phraseDeux = scanner.nextLine();
		 if (phraseUn.equals(phraseDeux)) {
			 System.out.println("Les phrases sont identiques");
		 	}
		 else {
			 System.out.println("Les phrases sont différentes");
		 	}
		 }
	
	public static void factorielle() {
		int factorielle = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir un entier positif ou nul");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			factorielle *= i;
			}
		System.out.println(n + "! = " + factorielle);
		}
	
	public static void countDown() {
		int stockage = 10;
		for (int i = 0; i < 11; i++) {
			System.out.println(stockage - i);
			}
		System.out.println("BOOM");
		}
	
	public static void carres() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quelle est la valeur du nombre ?");
		float n = scanner.nextFloat();
		System.out.println("le nombre " + n + " et son carré : " + n*n);
		}
	
	public static void tableMultiplication() {
		for (int j = 1; j < 11; j++) {
			for (int i = 1; i < 11; i++) {
				System.out.print(i*j + "\t");
				}
			System.out.println();
			}
		}
	
	public static void division() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quelle est la valeur du numérateur (entier) ?");
		int entierUn = scanner.nextInt();
		int entierDeux;
		do {
		System.out.println("Quelle est la valeur du denominateur (entier supérieur à 0)?");
		entierDeux = scanner.nextInt();
		}while(entierDeux <= 0);
		System.out.println("l'entier " + entierUn + " divisé par " + entierDeux + " donne : " + entierUn/entierDeux);
		}
	
	public static void regle() {
		Scanner scanner = new Scanner(System.in);
		int entier;
		do {
		System.out.println("Quelle est la longueur (entier supérieur à 0)?");
		entier = scanner.nextInt();
		}while(entier <= 0);
		
		for (int i = 0; i < entier; i++) {
			if (i%10 == 0) {
			System.out.print("!");
			}
		System.out.print("-");
		}
	}
	
	public static void nombrePremier() {
		Scanner scanner = new Scanner(System.in);
		int entier;
		do {
		System.out.println("Quelle est l'entier (strictement superieur à 0)?");
		entier = scanner.nextInt();
		}while(entier < 0);
		
		boolean save = true;
		for (int i = 2; i <= Math.sqrt(entier); i++) {
			if (entier%i == 0) {
				save = false;
				}
			}
		if (save) {
			System.out.print(entier + " est un nombre premier");
			}
		else {
			System.out.print(entier + " n'est pas un nombre premier");
			}
		}
	public static void initialisationTableau() {
		int min = 1000;
		int max = 0;
		int[] tableau = new int[20];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < tableau.length; i++) {
			System.out.println("Saisir un entier");
			int entier = scanner.nextInt();
			tableau[i] = entier;
			if (max < entier) {
				max = entier;
				}
			if (min > entier) {
				min = entier;
				}
			}
		}
}