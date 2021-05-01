package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx 
{
	// Map is key value pair
	// you can not iterate map directly first you need to convert it into set
	// In map you can not store duplicate keys
	public static void main(String[] args) 
	{
		Map map=new HashMap();
		map.put("vandan","8869072061");
		map.put("sumit","8484968986");
		//System.out.println(map.get("sumit"));
		
		Set<String> set =  map.keySet();
		for (String string : set) {
			System.out.println(string +"="+map.get(string));
		}
	
	}
}
