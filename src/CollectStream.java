import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectStream {

	public static void main(String[] args) {
		// List 
		//List to Stream
		//save That stream into a New List using collection terminal operation
		
		List<String> names = Arrays.asList("Ali", "Ahemad", "Sami", "Aasif", "Abdullah");
		List <String> newList= names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(newList.get(0));

	}
}
