import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<String> row5 = new ArrayList<String>();
		row5.add("L");
		System.out.println(row5.size());
		row5.add("N");
		System.out.println(row5.size());
		row5.add("J");
		System.out.println(row5.size());
		row5.remove(2);
		row5.remove("J");
		System.out.println(row5.size());
		row5.stream().forEach(row -> System.out.println(row));
		List<String> passed = row5.stream().filter(row ->! (row.equals("L"))).map(row -> row + "is trash").collect(Collectors.toList());
		passed.parallelStream().forEach(row -> System.out.println(row));
	}
	
}
