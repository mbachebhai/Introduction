import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class ConcatStream {

	public static void main(String[] args) {

		// concatenation of two list into one stream
		List<String> men = Arrays.asList("Ali", "Ahemad", "Sami", "Aasif", "Abdullah");
		List<String> women = Arrays.asList("Aaliya", "Asifa", "Zeba", "Arshiya", "Sana");
		
		//Merge two Stream through using stream Concat method;
		Stream<String> newStream = Stream.concat(men.stream(), women.stream());
		newStream.sorted().forEach(s -> System.out.println(s));

		/* validate the specific given name is present or not
		 if present then return true if not then return False*/
		Stream<String> neewStream = Stream.concat(men.stream(), women.stream());
		boolean falg = neewStream.anyMatch(s->s.equalsIgnoreCase("Ali"));
		System.out.println(falg);
		Assert.assertTrue(falg);
	}
}
