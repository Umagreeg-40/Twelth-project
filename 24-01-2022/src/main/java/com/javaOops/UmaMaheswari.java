package com.javaOops;

/* class name is employee
 * 
 * class consists of state(variable) and behaviour(methods)
 */

public class UmaMaheswari 
{
	String name;
	int age;
	String add;
	
	public UmaMaheswari()
	{
		//state(variables)
		
		name = "UmaMaheswari";
		age = 24;
		add = "Tamilnadu";
	}
	
	//behaviour(methods)
	
	public void getinfo()
	{
		System.out.println("Name: "+name);
		System.out.println(("Age: "+age));
		System.out.println("Address: "+add);
	}
	
	
	public static void main(String[] args) 
	{
		UmaMaheswari s = new UmaMaheswari();
		s.getinfo();
		
		System.out.println("==================");
		
		System.out.println(s.hashCode());
		
		/*From the above instruction line 35
		 * 
		 * "UmaMaheswari" is a class name and it 
		 *       behave like user defined data type.
		 *       
		 * "s" is an object reference (any variable name)
		 * 
		 *  "new" is a keyword, use to create an object
		 *      and it allocates memory inside RAM.
		 *      
		 *  "UmaMaheswari()" is a constructor, use to initialize 
		 *      an object's state.s     
		 *   (i.e special memory called HEAP)
		 *        
		 */

	}

}
