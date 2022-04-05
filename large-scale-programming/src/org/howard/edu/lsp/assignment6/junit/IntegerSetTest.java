package org.howard.edu.lsp.assignment6.junit;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class IntegerSetTest {

	
	//This will check if the IsEmpty test cases
	    @Test
	    @DisplayName("IntegerSet.IsEmpty test cases")
	    public void testIsEmpty() {
	    	ArrayList<Integer> List_two = new ArrayList<>();
	    	IntegerSet setA = new IntegerSet(List_two);
	    	
	    	
	    	setA.addItem(11);
	    	setA.addItem(20);
	    	setA.addItem(23);
	    	setA.addItem(50);
	    	
	    	assertTrue(setA.length()!=0);
	    	
	    	assertEquals(false ,setA.length()==0);
	    	
	    	assertTrue(setA.length()==4);
	    	
	    	
	    	setA.clear();
	    	
		 
		 
		 
	       // JUnit test case(s) for Union
	    }
	
	    @Test
	    @DisplayName("IntegerSet.Union test cases")
	    public void testUnion() {
	    	ArrayList<Integer> List_four = new ArrayList<>();
	    	IntegerSet setA = new IntegerSet(List_four);
	    	
	    	ArrayList<Integer> List_five = new ArrayList<>();
	    	IntegerSet setB= new IntegerSet(List_five);
	    	
	    	ArrayList<Integer> List_six = new ArrayList<>();
	    	IntegerSet setC= new IntegerSet(List_six);
	    	
	    	
	    	setA.addItem(11);
	    	setA.addItem(12);
	    	setA.addItem(13);
	    	
	    	
	    	
	    	setB.addItem(14);
	    	setB.addItem(15);
	    	setB.addItem(16);
	    	
	    	setC.addItem(11);
	    	setC.addItem(12);
	    	setC.addItem(13);
	    	setC.addItem(14);
	    	setC.addItem(15);
	    	setC.addItem(16);
	    	
	    	
	    	assertFalse(setA.union(setB) == setC);
	    	
	    	setA.clear();
	    	setB.clear();
	    	setC.clear();
	    	
	    	
	    	
		 
		 
	       // JUnit test case(s) for contains
	    }
	    
	    @Test
	    @DisplayName("IntegerSet.Contains test cases")
	    public void testcontains() {
		 
	    	ArrayList<Integer> ListA= new ArrayList<>();
	    	IntegerSet setA = new IntegerSet(ListA);
	    	
	    	
	    	setA.addItem(11);
	    	setA.addItem(20);
	    	setA.addItem(22);
	    	setA.addItem(30);
	    	
	    	
	    	assertTrue(setA.contains(20));
	    	
	    	assertFalse(setA.contains(0));
	    	
	    	assertFalse(setA.contains(13));
	    	setA.clear();
		 
	       
	    }
	    
	 // JUnit test case(s) for equal
	    @Test
	    @DisplayName("IntegerSet.setEquals test cases")
	    public void testsetEquals() {
		 
	    	ArrayList<Integer> list2= new ArrayList<>();
	    	IntegerSet setA = new IntegerSet(list2);
	    	
	    	setA.addItem(2);
	    	setA.addItem(5);
	    	setA.addItem(11);
	    	setA.addItem(19);
	    	
	    	
	    	ArrayList<Integer> list3= new ArrayList<>();
	    	IntegerSet setB = new IntegerSet(list3);
	    	
	    	setB.addItem(2);
	    	setB.addItem(5);
	    	setB.addItem(11);
	    	setB.addItem(19);
	    	
	  //Test Case for if the sets are equal to each other 
	    	assertTrue(true == setA.equals(setB));
	    	
//	    	setA.clear();
//	    	setB.clear();
	    	
	 //Test Case for if the sets are equals to each other
	    	assertTrue(false != setA.equals(setB));
	    	setA.clear();
	    	setB.clear();
	    } 


	       // JUnit test case(s) for adding an Item
	    
	    @Test
	    @DisplayName("IntegerSet.addItemtest cases")
	    public void testaddItem() {
	    	
	    	ArrayList<Integer>new_list= new ArrayList<>();
	    	IntegerSet setA = new IntegerSet(new_list);
	    	
	    	
	    	setA.addItem(11);
	    	
	    	
//	    	assertFalse(setA.toString().equals("11"));
//	    	setA.clear();
	    	
	    	assertTrue(setA.toString()!=("[11,20,30,50]"));
	    	
	    	setA.clear();
	    	
	    }
	    	
	    	
		 
		
	       // JUnit test case(s) for remove
	    
	    @Test
	    @DisplayName("IntegerSet.removeItem cases")
	    public void testremoveItem() {
	    	
	    	ArrayList<Integer> arrayList = new ArrayList<>();
	    	IntegerSet setA = new IntegerSet(arrayList);
	    	
	    	
	    	setA.addItem(11);
	    	setA.addItem(20);
	    	setA.addItem(50);
	    	setA.addItem(25);
	    	setA.addItem(70);
	    	
	    	
	    	setA.removeItem(11);
	    	setA.removeItem(20);
	    	
	    	//Will check to ensure that the set doesnt contain those removed values
	    	assertEquals(false,setA.contains(11));
	    	assertEquals(false,setA.contains(20));
	    	setA.clear();
		
	       
	    }

	    
    // JUnit test case(s) for difference
//	    
	    @Test
	    @DisplayName("IntegerSet.getDifference cases")
	    public void testgetDifference() {
    	ArrayList<Integer> List_set = new ArrayList<>();
    	IntegerSet setA = new IntegerSet(List_set);
    	
    	ArrayList<Integer> List_set1 = new ArrayList<>();
    	IntegerSet setB= new IntegerSet(List_set1);
    	
    	
    	ArrayList<Integer> List_set2 = new ArrayList<>();
    	IntegerSet setC= new IntegerSet(List_set2);
    	
    	
    	setA.addItem(11);
    	setA.addItem(12);
    	setA.addItem(13);
    	setB.addItem(14);
    	
    	
    	
    	setB.addItem(11);
    	setB.addItem(14);
    	setB.addItem(16);
    	setB.addItem(20);
    	
    	
    	setC.addItem(12);
    	setC.addItem(13);
    	setC.addItem(14);
    	setC.addItem(16);
    	setC.addItem(20);
    	
    	
    	assertFalse(setA.difference(setB) == setC);
    	
    	setA.clear();
    	setB.clear();
    	setC.clear();
    	
	    }
   
    	
         
//	    }
//	    
	    
	 // JUnit test case(s) for ToString
	    
	    @Test
	    @DisplayName("IntegerSet.ToStringcases")
	    public void testToString() 
	    {
	    	ArrayList<Integer> List_three = new ArrayList<>();
	    	IntegerSet setA = new IntegerSet(List_three);
	    	
	    	
	    	setA.addItem(11);
//	    	setA.addItem(20);
//	    	setA.addItem(13);
	    	
	    	String example;
	    	example = "11";
	    	
	    	assertTrue(toString() != example );
	    	setA.clear(); 
	    }
//	    
	    
	    
	 // JUnit test case(s) for LargestElement
	    
	    @Test
	    @DisplayName("IntegerSet.LargestElementcases")
	    public void testgetLargestElement() throws IntegerSetException {
	    	ArrayList<Integer> List_nine = new ArrayList<>();
	    	IntegerSet setA = new IntegerSet(List_nine);
	    	
	    	setA.addItem(4);
	    	setA.addItem(12);
	    	setA.addItem(15);
	    	setA.addItem(25);
	    	setA.addItem(30);
	    	setA.addItem(50);
	    	setA.addItem(60);
	    	setA.addItem(80);
	    	
	    	int max_num=80;
	    	
	    	assertTrue(setA.largestelement() == max_num);
	    	
	    	assertFalse(setA.largestelement() != max_num);
	    	assertFalse(setA.largestelement() == 12 );
	    	
	    	
		    }
		 
		
	       // JUnit test case(s) for SmallestElement
	    @Test
	    @DisplayName("IntegerSet.SmallestElementcases")
	    public void testgetSmallestElement() throws IntegerSetException {
	    
	    ArrayList<Integer> List_eight = new ArrayList<>();
    	IntegerSet setA = new IntegerSet(List_eight);
    	
    	setA.addItem(4);
    	setA.addItem(12);
    	setA.addItem(15);
    	setA.addItem(16);
    	setA.addItem(17);
    	setA.addItem(20);
    	
    	int min_num=4;
    	
    	assertTrue(setA.smallestelement() == min_num);
    	assertFalse(setA.smallestelement() != min_num);
    	
    	
    	
	    }

//	       
//	    }
//	    
	 // JUnit test case(s) for Clear
  
	    @Test
	    @DisplayName("IntegerSet.Clear test cases")
	    public void testClear() {
	    ArrayList<Integer> List_seven = new ArrayList<>();
    	IntegerSet setA = new IntegerSet(List_seven);
    	
    	setA.addItem(11);
    	setA.addItem(4);
    	
    	setA.clear();
    	
    	assertTrue(setA.length() == 0);
    	
    	assertFalse(setA.length() == 1);
   
    	
    }
	    
//	    
//	    // JUnit test case(s) for Intersect
	    @Test
	    @DisplayName("IntegerSet.Intersect test cases")
	    public void testIntersect() {
	    
	    ArrayList<Integer> List_setA = new ArrayList<>();
    	IntegerSet setA = new IntegerSet(List_setA);
    	
    	ArrayList<Integer> List_setA1 = new ArrayList<>();
    	IntegerSet setB= new IntegerSet(List_setA1);
    	
    	
    	ArrayList<Integer> List_setA2 = new ArrayList<>();
    	IntegerSet setC= new IntegerSet(List_setA2);
    	
    	
    	setA.addItem(11);
    	setA.addItem(12);
    	setA.addItem(13);
    	setB.addItem(14);
    	
    	
    	
    	setB.addItem(11);
    	setB.addItem(14);
    	setB.addItem(16);
    	setB.addItem(20);
    	
    	
    	setC.addItem(11);
    	setC.addItem(14);
    	
    	
    	assertTrue(setA.intersection(setB) != setC);
    	
    	setA.clear();
    	setB.clear();
    	setC.clear();
//		 
	} 
		
   
	    
	 // JUnit test case(s) for Length
	    @Test
	    @DisplayName("IntegerSet.Length test cases")
	    public void testLength() {
	    	ArrayList<Integer> List_one = new ArrayList<>();
	    	IntegerSet setA = new IntegerSet(List_one);
	    	
	    	
	    	setA.addItem(11);
	    	setA.addItem(20);
	    //Test for if the length of the set is true 
	    	assertTrue(setA.length()== 2);
	    	
	    	setA.clear();
	    	
	    //Test for if the length of the set isn't correct	
	    	setA.addItem(3);
	    	setA.addItem(9);
	    	setA.addItem(10);
	    	setA.addItem(12);
	    	
	    	assertFalse(setA.length()!=4);
	    	setA.clear();
	    	
	    }

	    	
	    	
//	    }
//			JUnit test case(s) for LargestException
//	    
	    @Test
	    @DisplayName("IntegerSet.LargestException cases")
	    public void testlargestException() {
			ArrayList<Integer> List_new1 = new ArrayList<>();
			IntegerSet setA = new IntegerSet(List_new1);
			
			int max_value;
			
			setA.addItem(4);
	    	setA.addItem(12);
	    	setA.addItem(15);
	    	setA.addItem(16);
	    	setA.addItem(17);
	    	setA.addItem(20);
	    	
	    	max_value= 20;
	    	
	    	try {
	    		try {
	    			assertEquals(true,max_value==setA.largestelement());
	    		}catch(org.howard.edu.lsp.assignment5.implementation.IntegerSetException e) {
	    			e.printStackTrace();
	    		
	    	}
	    	}
	    	finally {
	    		
	    	}
	    	setA.clear();
	    	}
	   
			
			
//			JUnit test case(s) for SmallestException
	    
	    @Test
	    @DisplayName("IntegerSet.SmallestException cases")
	    public void testsmallestException() {
		ArrayList<Integer> List_new = new ArrayList<>();
		IntegerSet setA = new IntegerSet(List_new);
		
		int min_value;
		
		setA.addItem(3);
    	setA.addItem(9);
    	setA.addItem(10);
    	setA.addItem(12);
    	
    	
    	min_value=3;
    	
    	try {
    		assertTrue(min_value == setA.smallestelement());
    	}catch(IntegerSetException e) {
    		e.printStackTrace();
    	}
	    
	    }
	    }
		


	    
	  
