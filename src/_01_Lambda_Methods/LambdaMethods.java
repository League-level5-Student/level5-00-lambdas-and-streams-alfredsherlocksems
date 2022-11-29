package _01_Lambda_Methods;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
		StringBuilder b = new StringBuilder();
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) -> {
			b.append(s);
			b.reverse();
			System.out.println(b.toString());
		}, "word");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			System.out.println("String is : " + s);
			String[] c = s.split("");
			StringBuilder o = new StringBuilder();
			for (int i = 0; i < c.length; i++) {
				if (i % 2 == 0) {
					c[i] = c[i].toUpperCase();
				}
				else {
					c[i] = c[i].toLowerCase();
				}
					o.append(c[i]);
			}
			
			System.out.println(o.toString());
		
		}, "word");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) -> {
			
		}, "word");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s) -> {
			String[] arr = s.split("");
			Arrays.stream(arr).filter((letter) -> !letter.equals("a") && !letter.equals("o") && !letter.equals("u") && !letter.equals("e")
					&& !letter.equals("i"));
			StringBuilder a = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				a.append(arr[i]);
			}
			System.out.println(a.toString());
		}, "word");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
