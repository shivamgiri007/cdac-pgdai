package Day_7_Lambda_Functions_and_its_types;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class predicateLambdaCheckletter_a_IsInString {
	public static void main(String[] args) {
		Predicate<String> checkA = (s) ->  s.toLowerCase().contains("a");
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		for(String Fruit : arrayList) {
				if(checkA.test(Fruit)) {
					System.out.println("String Contains Letter a ");
				}
				else {
					System.out.println("String does not contains letter a .");
				}
		}	
	}
}
