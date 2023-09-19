import java.util.Scanner;

public class Main {
	
		public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the value of N:");
				int n = scanner.nextInt();
		
				LukeNumber[] lukeNumbers = new LukeNumber[n];
				long sumOfSquares = 0;
				
		
				for (int i = 1; i <= n; i++) {
							lukeNumbers[i - 1] = new LukeNumber(i);
							sumOfSquares += lukeNumbers[i - 1].getSquare();
					}
			
					System.out.println("The sum of squares of first " + n + " Luke numbers is: " + sumOfSquares);
			
					scanner.close();
				}
			}
			
// public class Main {
// 	public static void main(String[] args) {
// 			System.out.println("Enter the value of N:");
// 	}	
// }