package convert;

import java.util.*;

public class Converter {
	public static void main(String[] args) {
		
		boolean works = false;
		Scanner sc = new Scanner(System.in); 
		String unitType = "";
		
		while (works == false) {
			System.out.println("1) Length");
			System.out.println("2) Mass");
			System.out.println("3) Speed");
			System.out.println("What type of conversion would you like to use?:");
			unitType = sc.nextLine(); 
			if (!(unitType.equals("Mass")) && !(unitType.equals("Length")) && !(unitType.equals("Speed"))) {
				works = false;
				System.out.println("Invalid Input");
				System.out.println();
			} else {
				works = true;
			}
			
		}
		
			if (unitType.equals("Length") && works == true) {
				Length.lengthIntro();
			}
			else if (unitType.equals("Mass") && works == true) {
				Mass.massIntro();
			}
			else if (unitType.equals("Speed") && works == true) {
				Speed.speedIntro();
			}
	}
}
