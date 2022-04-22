package org.howard.edu.lsp.finalExam;


//import java.util.HashMap;
//
//import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;
/*
 * The code willThe above should return the number of common key/value pairs between the two HashMaps. 
 *  In addition, your implementation should:
 */

public class MapUtilities {    
	public static int commonKeyValuePairs(Map<String, String> mapA, Map<String, String> mapB)
			throws NullMapException {
		   	
		String ptr = null;
		 
        // Checking if ptr is null using try catch.
        try
        {
            if (mapA.equals(ptr) && mapB.equals(ptr))
                return 0;           
        }
        catch(NullPointerException e)
        {
            System.out.print("One or both maps are null!");
        }

		//The throw exception
			int count = 0;
			for (Map.Entry<String, String> mapElement : mapA.entrySet()) 
			{
				//.entrySet is used to create a set out of the same elements contained in the hash map.
				
			String key = mapElement.getKey();
			String value = mapElement.getValue();
			
			
			if (mapB.containsKey(key)) 
			{
			String value2 = mapB.get(key);
			
			if (value.equals(value2)) 
			{
			count++;
			}
			}
			
			}
			return count;
			}

//	public static String commonKeyValuePairs(Map<String, String> mapA, Map<String, String> mapB) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
