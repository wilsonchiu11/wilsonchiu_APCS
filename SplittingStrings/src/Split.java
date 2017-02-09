import java.util.Arrays;
public class Split 
{


	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		example1("I like apples!");
		example2("I really like really red apples");		
		task1("applespineapplesbreadlettustomatobaconmayohambreadcheese");
		//task2("apples pineapples bread lettus tomato bacon mayo ham bread cheese");
	}
	public static void example1(String likingapples){
		String[] split1 = likingapples.split(" ");
		System.out.println(Arrays.toString(split1));
	}	
	public static void example2(String reallylikingapples){
		String[] split2 = reallylikingapples.split(" really ");
		System.out.println(Arrays.toString(split2));
	}
	//Your task:
			/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
			 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
			 * What if it's a fancy sandwich with multiple pieces of bread?
			*/ 
	public static void task1(String sandwich){
		String[] split3 = sandwich.split("bread");
		System.out.println(Arrays.toString(split3));
	}	
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
	//public static void task2(String sandwichy){
		//String[] split4


	
}







