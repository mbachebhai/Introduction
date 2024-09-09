import java.util.ArrayList;

public class Stream1 {
	public static void main(String[] args) {
		
		// count the Numbers of names string starts with"A" in List
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ali");
		names.add("Ahemad");
		names.add("sami");
		names.add("Aasif");
		names.add("Abdullah");

		long counts = names.stream().filter(s -> s.toUpperCase().startsWith("A")).count();
		System.out.println(counts);
	}
}