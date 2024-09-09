import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream3 {

	public static void main(String[] args) {

		
		String[] array = { "Ali", "Ahemad", "Sami", "Aasif", "Abdullah"};
		System.out.println(array.length);
		//convert Arrays into list 
		List<String> list = Arrays.asList("Ali", "Ahemad", "Sami", "Aasif", "Abdullah");
		// filter the names which has last latter i
		 list.stream().filter(s->s.endsWith("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		// print names which starts as a with upper case in sorted way
		list.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		
		
		//Remove duplicate from list n make a stream with unique number		
		List<Integer> values=Arrays.asList(1,2,3,4,5,6,7,2,5,1,8,1,10);
		values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer>num=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(num);
		System.out.println(num.get(2));	
	}	
}
