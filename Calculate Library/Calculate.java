/**
 * 
 */

/**
 * @author APCS2
 *
 */
public class Calculate {
	public static int square (int number1){
		return(number1*number1);
	}

	public static int cube (int number1){
		return(number1*number1*number1);
	}


	public static double average (double number1,double number2){
		return((number1+number2)/2);
	}
  	public static double average (double number1,double number2,double number3){
		return((number1+number2+number3)/3);
	}
  	public static double toDegrees (double number1){
		return((number1*180)/3.14159);
	}
  	public static double toRadians (double number1){
		return((number1*3.14159)/180);
	}
	public static double discriminant (double number1,double number2,double number3){
		return((number2*number2)-4*(number1)*(number3));
	}	
	public static String toImproperFrac (int number1,int number2,int number3){	
		return(((number1*number3)+number2)+"/"+number3);
	}
	public static String toMixedNum (int number1,int number2){
		return((number1/number2)+"_"+(number1%number2)+"/"+number2);
	}
	public static String foil (int number1,int number2,int number3,int number4,String n){
		return((number1*number3)+"n^2"+"+"+(number1*number4+number2*number3)+"n"+(number2*number4));
	}
	public static boolean isDivisibleBy (int number1,int number2){
		if (number1%number2 == 0){
			return (true);
			}else{
			return (false);
			}
	}
	public static double absValue (double number1){
		if (number1 <=0 ){
			return (number1 * -1);
		}
		return number1;
	}
	public static int max (int number1,int number2){
		if (number1 >= number2){
			return (number1);
		}
		return number2;
	}
	public static double max (double number1,double number2,double number3){
		if (number1 > number2 && number1 > number3){
			return (number1);
		}
		else if (number2 > number1 && number2 > number3){
			return (number2);
		}else{
			return (number3);
		}
	}
	public static int min (int number1,int number2){
		if (number1 < number2){
			return (number1);
		}
		return number2;
	}
	public static double round2 (double number1){ //round
		double answer=((number1*100)+0.5);
		answer = ((int)answer)/100.0;
		return (answer);
	}	
	public static double exponent (double base,int power){
		double answer= 1;
		for(int i= 1; i < power; i++) {
			answer= base*answer;	
		}
		return answer*base;
	}
	public static int factorial (int number1){
		int answer= number1;
		for(int i=number1-1;i > 1; i --){
			answer= (answer*i);
		}
		return answer;
	}
	public static boolean isPrime (int a){
		int i=2;
		while(a!=i){
			if(Calculate.isDivisibleBy(a, i)==true){
				return false;
			}else{ 
				i++;
			}
		}
		return true;
	}
	
	
			
			
		
