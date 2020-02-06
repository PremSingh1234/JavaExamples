import java.util.Scanner;

public class JavaExamples {
	public static void main(String[] args) {
		int month = 2, year = 2016, num = 31;
		Scanner keyboard = new Scanner( System.in);
		System.out.println("Enter Year: ");
		month = keyboard.nextInt();
		switch(month)
		{
		case 4: case 6: case 9: case 11: num=30;
		break;
		case 2: num = (year%4==0) ?29:28;
		break;
		default: System.out.println(month + "/" + ":" + num + "days");
		}
	}

}
