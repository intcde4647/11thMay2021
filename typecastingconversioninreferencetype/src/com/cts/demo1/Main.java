package com.cts.demo1;

public class Main {

	public static void main(String[] args) {
		
		Base base1=new Base();
		// We will be able to call all the base class methods
		base1.baseDisplay();
		base1.display();
		Derived derived1=new Derived();
		// We will be able to call the protected and public methods of the base class as they are inherited
        derived1.baseDisplay();
        derived1.display(); // derived display will be called as it is method
        // overriding 
        derived1.derivedDisplay();
        // Type conversion where reference is of base type
        // and object is of derived type
        Base base2=new Derived();
	    // Which are the methods can be called
        //baseDisplay()? yes
        // display()? derived display will be called
        // derivedDisplay()? no
        // With the reference of the base class only those methods can be called 
        // which are present in the base class
        // If they are present in both the classes , then the derived one will be called
        base2.baseDisplay();
        base2.display();
        //base2.derivedDisplay();
        // Do we have any technique to call derivedDisplay() of the derived class
        //ans yes by type casting
        //((Derived)base2).derivedDisplay();
	     Derived derived2=(Derived)base2;
	     derived2.derivedDisplay();
	}

}
