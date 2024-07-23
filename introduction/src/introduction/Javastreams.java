package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Javastreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList();
		names.add("Ajay");
		names.add("Aja");
		names.add("Gaurav");

		Long counting = names.stream().filter(s -> s.startsWith("A")).count();

		System.out.println(counting);

		names.stream().filter(s -> s.length() > 3).forEach(s -> System.out.println(s));

		Stream.of("AjaySharma", "GauravSharma", "JyotikaSharma").filter(s -> s.endsWith("ma")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		String[] array1 = { "Aja", "Pija", "Lija" };
		List<String>l1=Arrays.asList(array1);
		l1.stream().filter(s->s.endsWith("ja")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		Boolean flag=l1.stream().anyMatch(s->s.equalsIgnoreCase("Lija"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		List<String>newList=Stream.of("AjaySharma", "GauravSharma", "JyotikaSharma","PUJA").filter(s->s.endsWith("JA")).collect(Collectors.toList());
		System.out.println(newList.get(0));
		
		int[]values= {1,2,4,2,3};
		
	      /* List<Interger>a=Arrays.asList(values);
	       List<int[]>li=a.stream().distinct().sorted().collect(Collectors.toList());
	       System.out.println(li);*/
		
		
	}

}
