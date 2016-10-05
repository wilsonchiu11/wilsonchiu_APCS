//Wilson Chiu
//APCS 2nd Period
//10/5/2016
//PairProgramming finds the max, min, and sum and max of the even numbers


import java.util.*;

public class PairProgramming {
		
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);			
		System.out.println("How many integers are you going to enter?");
		int terms = userInput.nextInt();
		System.out.println("Enter " + terms+ " integers");
		int max = userInput.nextInt();
		int min =max;
			
		int inputNumber;
		int evenSum= 0;
		int evenMax=0;
			
		
		for(int i=1; i<terms;i++){
			inputNumber=userInput.nextInt();
			if(inputNumber<min){
				min=inputNumber;
			}
			if(inputNumber>max){
				max=inputNumber;
			}
		
			
			if(inputNumber%2==0){
				evenSum+=inputNumber;	
			}
				if(inputNumber>evenMax){
					evenMax=inputNumber;
				}
				
				
		}
			System.out.println("The smallest number is "+min);
			System.out.println("The largest number is "+max);
			System.out.println("The sum of all even numbers is "+evenSum);
			System.out.println("The largest even number is "+evenMax);
			userInput.close();
		
	}
}


