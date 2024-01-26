package mastermind;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class mastermind {
	 public static void main(String[] args) {
	        Scanner invoer = new Scanner(System.in);
	        List<Integer> compCode = new ArrayList<>();
	        List<Integer> code = new ArrayList<>();

	        System.out.println("Geef vier getallen in tussen 1 en 6");

	        for (int i = 0; i < 4; i++) {
	            int randomCode = (int) (Math.random() * 6) + 1;
	            compCode.add(randomCode);
	        }

	        int zwartepinnen = 0;

	        System.out.println("Voer vier getallen in:");

	        for (int i = 0; i < 4; i++) {
	            int userInput = invoer.nextInt();
	            code.add(userInput);

	            if (userInput == compCode.get(i)) {
	                zwartepinnen++;
	            }
	        }

	        System.out.println("Aantal zwarte pinnen: " + zwartepinnen);

	        System.out.println("ComputerCode:");

	        for (int i = 0; i < compCode.size(); i++) {
	            System.out.println("ComputerCode[" + i + "]: " + compCode.get(i));
	        }
	    }
	}
	
	
	
	

