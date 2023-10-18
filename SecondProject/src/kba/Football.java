package kba;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Football implements Sport 
{
	 private int[] playerIDs;
	 Football() { // default constructor of football class
			  playerIDs = new int[11];
		        Arrays.fill(playerIDs, 1);
		        System.out.println("A new football team has been formed");
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
	        if (playerIDs[id-1] == -1) {
	            System.out.println("Player has already retired");
	        } else {
	            playerIDs[id-1] = -1;
	            System.out.printf("Player with id: %d has retired%n", id);
	        }
	    }

		 public void playerTransfer(int fee, int id) {
		        if (playerIDs[id-1] == -1) {
		            System.out.println("Player has already retired");
		        } else {
		          //  playerIDs[id] = 0;
		            System.out.printf("Player with id: %d has been transferred with a fee of %d%n", id, fee);
		        }
		 }

}
