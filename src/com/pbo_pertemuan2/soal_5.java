package com.pbo_pertemuan2;
import java.io.*;
import java.util.*;

public class soal_5 {
	/**
	 * The elements of a String are called characters. The number of characters in a String is called
		the length, and it can be retrieved with the String.length() method.
		Given two strings of lower case English letters, A and B, perform the following operations:
		1. Sum the lengths of A and B.
		2. Determine if A is lexicographically larger than B (i.e: does B come before A in the
		dictionary?)
		3. Capitalize the first letter in A and B and print them on a single line, separated by a
		space.
	 * @param args
	 */
	
	public static void main(String[] args) { 
		Scanner scan=new Scanner(System.in);
	    String A=scan.next();
	    String B=scan.next();
	        
	    System.out.println(A.length() + B.length());
	    if(A.compareTo(B) > 0){
	        System.out.println("Yes");
	    } else {
	        System.out.println("No");
	    }
	
	    A = (A.substring(0,1)).toUpperCase() + A.substring(1);       
	    B = (B.substring(0,1)).toUpperCase() + B.substring(1);
	    System.out.println(A + " " + B);
	}
}
