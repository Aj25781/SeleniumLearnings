package corejavaconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaConcepts {

	public static void main(String[] args) {

	   // Array 
	    int[] aj = new int[2];
	    
	      aj[0] =2;	
	       aj[1]=3;
	    		 
	      
	      //System.out.println(aj[1]);
	    
	    
		//Iteration over array for loop
	       
	       for (int i =0 ; i < aj.length ; i++)
	       {
	    	   
	    	   System.out.println(aj[i]);
	    	   
	       }
	       
	       //String array 
	       
	       String[] name = {"Ajay","Rahul","Suman"};
	       
	       for(int i =0 ; i < name.length ; i++ ) {
	    	   
	    	   System.out.println(name[i]);
	       }
	       
	       
	       //Enhaced for lool 
	       
	       for(String s : name)
	       {
	    	   System.out.println(s);
	       }
	       
	       //if /else condition 
	       
	       int[] number = {1,2,3,4,5,6} ;
	       
	       for ( int i=0 ; i < number.length; i++) {
	    	   
	    	   
	    	   if(number[i] % 2==0)
	    	   {
	    		   System.out.print(number[i]);
	    	   }
	    	   else {}
	    	   
	    	   
	       }
	       
	       //Array list for dynamic size & it's a class 
	       ArrayList<String> a = new ArrayList<String>();
	       
		     a.add("ajay");
		     a.add("gaurav");
		    
		     
		     
		     System.out.println('\n');
		     
		     for (String i :a) {
		    	 
		    	 System.out.println(i);
		    	 
		     }
		     
		     // Convert array into arraylist 
		     List<String>name2=Arrays.asList(name);
		     
		     System.out.println(name2.contains("Suman"));
		     
		     //java strings 
		     //In java strings is a object 
		     
		     String Personname = "Ajay Sharma ";
		    String Objectname = "Ajay Sharma";
		    //Same memory will be allocated to both the objects as content is same 
		    
		    String myname = new String("Gaurav");
		    String Yourname=new String("Your name is Jyotika Sharma");
		    
		    //Print string in reverse order
		    
		    for(int i=Yourname.length()-1 ;i>=0 ; i-- )
		    {
		    	System.out.println(Yourname.charAt(i));
		    }
		    
		    
		     
		     

	}

}
