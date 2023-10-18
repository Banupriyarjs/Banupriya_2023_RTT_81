package kba;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Cricket implements Sport {
	 private int[] playerIDs;

		Cricket() {

			playerIDs = new int[11];
	        Arrays.fill(playerIDs, 1);
	        System.out.println("A new cricket team has been formed");
		}

		@Override
		public void calculateAvgAge(int[] age) {
			double sum = 0;
			for (int age1 = 0; age1 < age.length; age1++) {

				sum = sum + age[age1];
			}
			// System.out.println("sum "+sum);
			double avg = sum / age.length;

			System.out.println("The average age of the team is " + new DecimalFormat("####.##").format(avg)); // we are
		}

		@Override
		public void retirePlayer(int id) {
			

			if (playerIDs[id] == -1) {
				System.out.println("Player has already retired");

			} else {
				System.out.println("Player with id: " + id + " has retired");
			}
		}

}
