package com.cts.demo2;

public class Main {

	public static void main(String[] args) {
// No compilation error because during
		// the compilation only parent child relationship
		// is checked and which is there
// But Runtime error will be there
   /*
    * Exception in thread "main" java.lang.ClassCastException: class com.cts.demo2.Base cannot be cast to class com.cts.demo2.Derived (com.cts.demo2.Base and com.cts.demo2.Derived are in unnamed module of loader 'app')
	at com.cts.demo2.Main.main(Main.java:11)

    */
		Base base=new Base();
     Derived derived=(Derived)base;

	}

}
