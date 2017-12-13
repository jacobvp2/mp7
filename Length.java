package convert;

import java.util.*;

public class Length {
	public static void lengthIntro() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the length converter!");
		System.out.println(
				"You may convert between: inches (in), feet (ft), yards (yd), miles (mi), millimeters (mm), centimeters (cm), meters (m), and kilometers (km)");
		System.out.println("What unit would you like to convert? (ex. yd): ");
		String firstUnit = sc.nextLine();
		System.out.println("How many of that unit do you want? (ex. 5): ");
		int firstValue = Integer.parseInt(sc.nextLine());
		System.out.println("What unit would you like to convert to? (ex. ft): ");
		String finalUnit = sc.nextLine();
		double finalValue = convert(firstUnit, firstValue, finalUnit);
		System.out.println("The conversion is:" + finalValue + finalUnit);
	}

	public static double convert(final String firstUnit, final int firstValue, final String finalUnit) {
		String[] unit;
		double[] unitValue;
		unit = new String[] { "in", "ft", "yd", "mi", "mm", "cm", "m", "km" };
		unitValue = new double[] { 12, 1, 0.3333333333333333, 0.000189394, 304.8, 30.48, 0.3048, 0.0003048 };
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
