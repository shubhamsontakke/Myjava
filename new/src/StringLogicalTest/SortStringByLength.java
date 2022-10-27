package StringLogicalTest;

import java.util.Scanner;

public class SortStringByLength {
	 public static void main(String[] args) { 
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter String:"); 
		  String str=s.nextLine(); 
		  String str1[]=str.split("\\s"); 
		  for(int i=0;i<str1.length;i++) 
		  { 
			  for(int j=i+1;j<str1.length;j++) 
			  	{ 
			  
				  if(str1[i].length()<str1[j].length()) 
				  { 
					  String temp= str1[j]; 
					  str1[j]=str1[i]; 
					  str1[i]=temp; 
				  } 
			  	} 
		   } 
		  for(int i=0;i<str1.length;i++) 
		  { 
		  System.out.print(str1[i]+" ");  
		  } 
		  } 
		} 


