package introduction;

import java.util.ArrayList;

public class Javastreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		ArrayList<String>names=new ArrayList();
		names.add("Ajay");
		names.add("Aja");
		names.add("Gaurav");
		
		Long counting=names.stream().filter(s->s.startsWith("A")).count();
		
		System.out.println(counting);
		
		
		
	}

}
