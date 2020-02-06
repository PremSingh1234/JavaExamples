
public class MyFirstClass {
	public static void main(String[] args) {
		//isDivisable(7, 3);
		//isDivisable(8, 4);
		
		int a = 10;
		int b = 3;
		if(isDivisable(a, b)) {
			System.out.println("is divisable");
		} else {
		
		}
				System.out.println("is not divisable");
		}
		//System.out.println("Is " + a + " divisable by " + b + " : " + isDivisable(a,b)); - use in 11 example
	
		//System.out.print("Hello World");
		//System.out.println("1 + 2 " + "+ 3" + " = 6");
		//System.out.println(" I want this program to compile");
		//int a = 48;
		//int b =19;
		//System.out.println(a + b);
		
		//String greeting = "Thanks for Question";
		//System.out.println(greeting);
		
		//int num = 3;
		//System.out.println(num == 4);
		
		//int num = 19;
		//System.out.println(num % 4); % = Remainder
		
		//int num = 22; is the same num = num+1
		//num ++;
		//System.out.println(num);
		
		//int num = 22;
		//System.out.println(++num) = 23 (num++) = 22;
		//System.out.println(num); = 23
		
		//int num = 22;
		//System.out.println(--num); = 21 (num--) = 22
		//System.out.println(num); = 21
		
		//char letter = 'e';
		//letter ++;
		//System.out.println(letter);
	//}
		//public static void isdivisablebyfour(int num) {
			//int num = 37; - Not need when you have a method
			//System.out.println(num % 4 == 0);
	
	//public static void isdivisable(int number, int divider) {
	   //int num = 37; - Not need when you have a method
	   //System.out.println(number % divider == 0);
	//}
      
     public static boolean isDivisable (int number, int divider) {
    	 return number % divider == 0; 
     } //- 11 example

	//if(true) {
		//System.out.println("yes");
		//if (false) {
			//System.out.println("no");
        //}
	    //}
	//}
				
}