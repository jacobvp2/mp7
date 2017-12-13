package convert;

import java.util.*;

public class Speed {
	public static void speedIntro() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Speed converter!");
		System.out.println(
				"You may convert between: feet per second (fps), miles per hour (mph), meters per second (mps), kilometer per hour (kph)");
		System.out.println("What unit would you like to convert? (ex. fps): ");
		String firstUnit = sc.nextLine();
		System.out.println("How many of that unit do you want? (ex. 100): ");
		int firstValue = Integer.parseInt(sc.nextLine());
		System.out.println("What unit would you like to convert to? (ex. mph): ");
		String finalUnit = sc.nextLine();
		double finalValue = convert(firstUnit, firstValue, finalUnit);
		System.out.println("The conversion is:" + finalValue + finalUnit);
	}

	public static double convert(final String firstUnit, final int firstValue, final String finalUnit) {
		String[] unit;
		double[] unitValue;
		unit = new String[] { "fps", "mph", "mps", "kph" };
		unitValue = new double[] { 1, 0.681818, 0.3048, 1.09728 };
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
