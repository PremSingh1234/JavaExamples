
public class MultiArrays {
	public static void main(String[] args) {
		String[] row6 = {"Doug", "Josh", "Sam", "Jeevan"};
	    String[] row5 = {"Nisha", "Lanrance", "Jessica"};
	    String[] row7 = {"Mumba", "Prem"};
	    String[][] room = {row6, row5, row7};
	    
	    System.out.println(room[0][1] + (" ") + room[1][2] + (" ") + room[2][0]);
	    row5[1] = "ashima";
	    System.out.println(room[1][1]);
	}
}
