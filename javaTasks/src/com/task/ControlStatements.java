package com.task;

public class ControlStatements {
	public static void main(String[] args) {
	    int x = 12;
		int y = 30;
//if
		if( x < y) {
			System.out.println("x is equal to y");
		}
		System.out.println("---------------------");
//if-else		
		if( x > y) {
			System.out.println("statement is  true");	
		}
		else {
			System.out.println("statement is false");
		}
		System.out.println("---------------------");
//else-if		
		int a = 34;
		
		if( a == 40 ) {
			System.out.println("true");
			}
		else if ( a < 50) {
			System.out.println("false");
		}
		else {
			System.out.println("default");
		}	
		System.out.println("---------------------");
//Switch		
		int month = 4;
		switch(month) {
		
		case 1:
			System.out.println("janauary");
			break;
		case 2:
			System.out.println("february");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		default:
			System.out.println("may");
			break;
			
		}
	
	System.out.println("---------------------");
	

//for-loop	(Entry control)	
	/*syntax
	for(initialization, condition, increment/decrement) {    
//block of statements    
}    
	*/
		int i = 1;
		for(i=0;i<=5;i++) {
			System.out.println(i);
			//System.out.println("for is an Entry Control");
		}
		System.out.println("---------------------");
//while  (Entry control)
		
	/*syntax	
		while(condition){    
			//looping statements    
			}  
			*/
		
		int j=1;
		while(j<=3) {
			System.out.println("while is an Entry Control");
			j++;
		}
		System.out.println("---------------------");
//do while (Exit control)
	/*syntax	
		do     
		{    
		//statements    
		} while (condition);  
		*/  
		int k = 10;
		do
		{
			System.out.println("do while is an exit control");
			k++;
		}while(k <= 5);
		System.out.println("---------------------");
		
//		for-each loop
		/*syntax
		for(data_type var : array_name/collection_name){    
			//statements    
			} 
			*/
		String[] names = {"C","C++","JAVA","PYTHON"};    
		System.out.println("Print the names :");    
		for(String name:names) {    
		System.out.println(name);    
		}    
		System.out.println("---------------------");

//break	
		for(int b = 0; b<= 10; b++) {  
			System.out.println(b);  
			if(b==5) {  
			break;  
			}  
			}  
		System.out.println("---------------------");

//continue
		for (int c = 0; c < 5; c++) {
			  if (c == 3) {
			    continue;
			  }
			  System.out.println(c);
			}
}
}
