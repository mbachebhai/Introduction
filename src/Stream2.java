import java.util.ArrayList;

public class Stream2 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Ali");
		names.add("Ahemad");
		names.add("sami");
		names.add("Aasif");
		names.add("Abdullah");

		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

		// using limit to limit the results
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));

	}
}
