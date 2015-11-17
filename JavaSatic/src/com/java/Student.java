package com.java;

public class Student {
	
		   int sRollno;  
		   String name;  
		   static String school ="NYU";  
		     
		   Student(int r,String n){ 
		 
		   sRollno = r;  
		   name = n;  

		   }  

		 void display (){
			System.out.println(sRollno+" "+name+" "+school);
			}  
		  
		 public static void main(String args[]){ 
		 
		 Student sR1 = new Student(555,"Robat");  
		 Student sR2 = new Student(786,"Salman");  
		 Student sR3 = new Student(777, "Rahul Roy");
		   
		 sR1.display();  
		 sR2.display();  
		 sR3.display();

		 }  

		}  
