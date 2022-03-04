/**
 * 
 */
package org.howard.edu.lsp.assignment5.test;

import java.util.*;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;


/**
 * This file is the Test file that will allow for the information in the implementation file to run 
 * @author Sydnie Sewell
 *
 */
public class Driver {


	   public static void main(String[] args)  {
	      
	ArrayList<Integer> list1= new ArrayList<>();
	ArrayList<Integer> list2= new ArrayList<>();
	  
	  
	/**
	 *  make 2 instance of integerset class for implementation
	 */
	IntegerSet setA= new IntegerSet(list1);
	IntegerSet setB= new IntegerSet(list2);
	
	/**
	 * Will add each of these integers into their respective sets
	 */
	setA.addItem(1);
	setA.addItem(6);
	setA.addItem(7);
	setA.addItem(8);
	setA.addItem(9);
	setA.addItem(11);
	setA.addItem(12);
	  
	setB.addItem(2);
	setB.addItem(3);
	setB.addItem(6);
	setB.addItem(7);
	setB.addItem(8);
	setB.addItem(11);
	setB.addItem(13);
	
	
	System.out.println("Set A : "+setA.getlist());
	System.out.println("Set B : "+setB.getlist());
	  
	System.out.println("Is equal : "+setA.equals(setB));
	System.out.println("Does Set A contain 5?" + setA.contains(5));
	System.out.println("Is SetA empty?" + setA.isEmpty());
	System.out.println("Set A string representation is :" + setA.toString());
	  
	try {
		System.out.println("Largest element in setA : "+setA.largestelement());
	} catch (IntegerSetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	try {
		System.out.println("Smallest element in setB : "+setB.smallestelement());
	} catch (IntegerSetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	IntegerSet setUnion= setA.union(setB);
	  
	System.out.println("Union : "+setUnion.getlist() );
	  
	IntegerSet setIntersect= setA.intersection(setB);
	  
	System.out.println("Intersection : "+setIntersect.getlist() );
	  

	      
	   }
	

}
