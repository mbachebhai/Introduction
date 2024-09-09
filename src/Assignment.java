import java.util.ArrayList;
import java.util.OptionalDouble;

public class Assignment {

	public static void main(String[] args) {
		
		ArrayList<Integer> num= new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		OptionalDouble average=num.stream().mapToDouble(Integer::doubleValue).average();
		System.out.println(average);
		

	}
}
