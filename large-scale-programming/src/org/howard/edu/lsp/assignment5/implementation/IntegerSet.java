package org.howard.edu.lsp.assignment5.implementation;

//The implementation file 
import java.util.*;

/**
 * @author Sydnie Sewell
 * This file is the implementation package.It is comprised of multiple functions that allow for the manipulation of sets.
 *
 */
public class IntegerSet{
  
   private ArrayList<Integer> listA= new ArrayList<>();
  
   public IntegerSet(ArrayList list) {
       this.listA=list;
   }
  
  
  
/**
 *   This function will clear the class
 */
  public void clear() {
       listA.clear();
   }
  
/**
 *  This function will return the length of set
 * @return
 */ 
  public int length() {
       return listA.size();
   }
  
/**
 * This funtion will return true if 2 lists are equal
 * @param b
 * @return
 */
   public boolean equals(IntegerSet b) {
	   boolean equal = true;
	   for(int num:listA)
	   {
		   if(b.contains(num))
		   {
			   equal=true;
		   }
		   else {
			   return false;
		   }
	   }
	   return equal;
      
   }
   
   
/**
 *  Returns true if the set contains the value, otherwise false
 * @param value
 * @return
 */
public boolean contains(int value) 
{
	if(this.listA.contains(value) == true)
	{
		return true;
	}
	else {
		return false;
	}
};    

  
  
/**
 * This function will return the largest item and throw exception if list is empty
 * @return
 * @throws IntegerSetException
 */ 
  public int largestelement() throws IntegerSetException{
      
      if(listA.size()==0) {
         IntegerSetException e= new IntegerSetException();
          throw e;
      }
      
       int max=0;
      
       for(int i=0;i<listA.size();i++) {
           if(listA.get(i)>max) {
               max=listA.get(i);
           }
       }
      
       return max;
      
   }
  
/**
 *  returns a smallest item and throw exception if list is empty
 * @return
 * @throws IntegerSetException
 */
   public int smallestelement() throws IntegerSetException {
      
      if(listA.size()==0) {
           IntegerSetException e= new IntegerSetException();
           throw e;
       }
      
       int min=Integer.MAX_VALUE;
      
       for(int i=0;i<listA.size();i++) {
           if(listA.get(i)<min) {
               min=listA.get(i);
           }
       }
      
       return min;
      
   }
  
/**
 *  This function will add a given item to the list, if already not exist in list
 * @param item
 */
  
  public void addItem(int item ) {
      
       boolean exist=false;
      
       for(int i=0;i<listA.size();i++) {
          
           if(listA.get(i)==item) {
               exist=true;
           }
       }
      
       if(exist==false) {
           listA.add(item);
       }
      
   }
  
/**
 * This function will remove the given item, if already not exist in list
 * @param item
 */
   public void removeItem(int item ) {
       for(int i=0;i<listA.size();i++) {
          
           if(listA.get(i)==item) {
               listA.remove(i);
           }
       }
      
   }
  
/**
 *This function will return the union of  2 sets
 * @param list2
 * @return
 */
   public IntegerSet union(IntegerSet list2) {
      
       ArrayList<Integer> temp=list2.getlist();
      
       Set<Integer> set = new HashSet<>();
       set.addAll(listA);
       set.addAll(temp);
      
       ArrayList<Integer> list3= new ArrayList<>(set);
      
       IntegerSet list4= new IntegerSet(list3);
      
       return list4;
      
   }
  
/**
 * This function will return the intersection of the 2 sets
 * @param list2
 * @return
 */
   public IntegerSet intersection(IntegerSet list2) {
      
       ArrayList<Integer> temp=list2.getlist();
      
       listA.retainAll(temp);
      
IntegerSet list4= new IntegerSet(listA);
      
       return list4;
   }
  
/** This function will return the difference of the 2 sets being manipulated
 * 
 * @param list2
 * @return
 */
   public IntegerSet difference (IntegerSet list2) 
   {
      
       ArrayList<Integer> temp=list2.getlist();
      
       // Remove all elements in list2 from list
       listA.removeAll(temp);
      
IntegerSet list4= new IntegerSet(listA);
      
       return list4;
      
   }
  
   public ArrayList<Integer> getlist(){
       return listA;
   }
  

/**
 * Returns true if the set is empty, false otherwise
 * @return
 */
public boolean isEmpty() {
	if(this.listA.isEmpty() == true)
	{
		return true;
	}
	else {
		return false;
	}
	
}; 

/**
 * Return String representation of your set
 */
public String toString() {
	return this.listA.toString();
	
}
}
