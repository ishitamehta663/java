import java.util.*;

public class Hashtable {

	public static void main(String[] args)
	{

		Map<String, Integer>
			table = new Hashtable<>();

		table.put("Pen", 10);
		table.put("Book", 500);
		table.put("Clothes", 400);
		table.put("Mobile", 5000);
		table.put("Booklet", 2500);
		
		table.forEach((k, v) -> {

			v = v + 100;
			table.replace(k, v);
		});

		table.forEach(
			(k, v) -> System.out.println("Key : " + k + ", Value : " + v));
	}
}
