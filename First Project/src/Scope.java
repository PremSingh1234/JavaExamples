
public class Scope {
	static int number = 4;
	public static void main(String[] args) {
		int number = 6;
		System.out.println(number);
		printy();
	}
	public static void printy() {
		System.out.println(number);
	}

}
