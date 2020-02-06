
public class Arrays {
	public static void main(String[] args) {
		String name = "James2";
		String[] row2 = {name, "Tylor", "Juamal"};
		System.out.println(row2[1]);
		row2[1] = "Chris";
		System.out.println(row2[1] + (" ") + row2[2]);
		System.out.println(row2[3]); //- An error occurs because it is null
	}
}
