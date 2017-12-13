package convert;

import java.util.*;

public class Mass {
	public static void massIntro() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Mass converter!");
		System.out.println(
				"You may convert between: ounces (oz), pounds (lb), tons (US ton), (milligrams (mg), grams (g), kilgrams (kg)");
		System.out.println("What unit would you like to convert? (ex. lb): ");
		String firstUnit = sc.nextLine();
		System.out.println("How many of that unit do you want? (ex. 2): ");
		int firstValue = Integer.parseInt(sc.nextLine());
		System.out.println("What unit would you like to convert to? (ex. US ton): ");
		String finalUnit = sc.nextLine();
		double finalValue = convert(firstUnit, firstValue, finalUnit);
		System.out.println("The conversion is:" + finalValue + finalUnit);
	}

	public static double convert(final String firstUnit, final int firstValue, final String finalUnit) {
		String[] unit;
		double[] unitValue;
		unit = new String[] { "oz", "lb", "US ton", "mg", "g", "kg" };
		unitValue = new double[] { 16, 1, 0.0005, 453592, 453.592, 0.453592 };
		double finalValue = 0;
		int fromIndex = 0;
		int toIndex = 0;

		for (int i = 0; i < unit.length; i++) {
			if (unit[i].equals(firstUnit)) {
				fromIndex = i;
			}

			if (unit[i].equals(finalUnit)) {
				toIndex = i;
			}
		}
		finalValue = firstValue * unitValue[toIndex] / unitValue[fromIndex];

		return finalValue;
	}

}
