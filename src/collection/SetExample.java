package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	// Set is interface -> HashSet,TreeSet
	// Set can not store duplicate data
	// Set does not follow insertion order
	public static void main(String[] args) 
	{
		//Set obj=new HashSet();
		Set obj=new TreeSet();
		/*
		 * obj.add(101); obj.add(101); obj.add(101); obj.add(102);
		 */
		obj.add("Vandan");
		obj.add("Sumit");
		obj.add("Kamal");
		System.out.println(obj);
	}

}
