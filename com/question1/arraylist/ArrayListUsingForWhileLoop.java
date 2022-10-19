package com.question1.arraylist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Java Program to Iterate ArrayList using For Loop,While Loop and
// Enhanced For Loop
public class ArrayListUsingForWhileLoop {
	
	//Creating an instance of ArrayList
	static ArrayList<Integer> num=new ArrayList<Integer>();
	static  int size;
	
	
	//This method will accept the colors from the standard input device(keyword)
	// from the user
  static void inputListOfNumbers() throws InputMismatchException
  {
	  Scanner sc=new Scanner(System.in);
	   size=sc.nextInt();
	   int i=1;
	   int element;
	   while(i<=size)
	   {
		   element=sc.nextInt();
		   num.add(element);
		   i++;
	   }
  
  }
	//displayArrayListUsingForLoop() method will iterate the ArrayList 
	//using  For loop
	static void displayArrayListUsingForLoop()
	{
		//This loop will iterate unless and until there are elements in the
		// for loop 
		for(int i=0;i<size;i++)
		{
			// al.get() method will take the index and will return 
			// the list element 
			// In the list the indexing starts with 0 till we reach the 
			// end so if we 5 elements in the Arraylist index start from 
			// 0 till 5-1=4
			  System.out.println(""+num.get(i));
		}
	}
	
	//displayArrayListUsingWhileLoop() method will iterate the ArrayList 
		//using  While loop
	static void displayArrayListUsingWhileLoop()
	{

		// iterator() method which belongs to iterable interface will return the instance of Iterator which
		// is actually the instance of implementation class of Iterator interface which will iterator the 
		// entire list elements
			Iterator it=num.iterator();	
			// it.hasNext() method checks whether next element available in the list or not for iteration 
			// if none of the elements presents the loop will be terminated
	        while(it.hasNext())
	        {
	    // it.next() method will return the element 
	    //(the return type of next() method is Object type which can be type casted to any type of Object)
	        	System.out.println(""+it.next());
	        }
	}

 //displayArrayListUsingForEachLoop() method will iterate the ArrayList 
 //using Enhanced or Advanced for loop for which it will implicitly iterate
// in forward direction.
// No need to use iterator or ListIterator which we use in While loop
//We don't need to calculate the size of List like we did in For loop
	static void displayArrayListUsingForEachLoop()
	{
		for(int n:num)
			System.out.println(""+n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputListOfNumbers();
		
		System.out.println(size);
		System.out.println("While Loop");	
		displayArrayListUsingWhileLoop();

		System.out.println("Advanced For Loop");
		displayArrayListUsingForEachLoop();
		
		System.out.println("For Loop");	
		displayArrayListUsingForLoop();

	}

}
