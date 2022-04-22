package org.howard.edu.lsp.finalExam;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MapUtilitiesTest {

	//@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	//This will check if the maps passes in are null
	@Test
    @DisplayName("")
	public void test() throws NullMapException {
		Map<String, String> mapA = new HashMap<>();
		mapA.put("Alice","Healthy");
		mapA.put("Mary","Ecastic");
		mapA.put("Bob", "Happy");
		mapA.put("Chuck","Fine");
		mapA.put("Felix","Sick");
		
		Map<String, String> mapB = new HashMap<>();
		mapB.put("Mary","Ecastic");
		mapB.put("Bob","Happy");
		mapB.put("Tam","Fine");
		mapB.put("Felix","Healthy");
		mapB.put("Ricardo","Subperb");
		
		
		//Test Cases
		assertFalse(mapA.containsKey("j"));
		assertTrue(mapB.containsKey("Mary"));
		assertEquals(true,mapA.containsKey("Alice"));
		//Will print out the number of ones in common
    	System.out.println("The common amount is " +  MapUtilities.commonKeyValuePairs(mapA, mapB));	
    	
		
		
	
		
		
    	

	//NULL
	//IF 
}
}

	

	
