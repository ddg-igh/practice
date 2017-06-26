package practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Geben sie eine Zahl ein!");
		Scanner input = new Scanner(System.in); //Input lesen
		double nummber1 = input.nextInt();
		System.out.println("Enter an Operator");
		String operator = input.next();
		System.out.println("Geben sie eine Zahl ein!");
		double nummber2 = input.nextInt();
		
		switch(operator){
		case "+" : System.out.println("Das Ergebnis ist "+ (nummber1 + nummber2));
		break;
		case "-" : System.out.println("Das Ergebnis ist "+ (nummber1 - nummber2));
		break;
		case ":" : System.out.println("Das Ergebnis ist " + (nummber1 / nummber2));
		break;
		case "*" : System.out.println("Das Ergebnis ist" + (nummber1 * nummber2));
		break;
		
		default : System.out.println("error");
		}
	}

}
