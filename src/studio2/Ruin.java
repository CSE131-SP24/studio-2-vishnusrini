package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("How much money did you bring into the casino?");
		double money = in.nextDouble();

		System.out.println("What is the (%) chance you will win? (0-1)");
		double winChance = in.nextDouble();

		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();

		System.out.println("How many days are you playing?");
		double days = in.nextDouble();

		while(days > 0) {	
			double startingMoney = money;
			while(money < winLimit && money > 0) {
				if (Math.random() < winChance) {
					System.out.println("You win");
					money++;
					System.out.println(money);
				}		
				else {
					System.out.println("You lose :(");
					money--;
					System.out.println(money);
				}
				
				if (money == winLimit || money == 0) {
					days--;
					System.out.println("NEXT DAY!");
					money = startingMoney;
				}
			}

		}




	}

}


