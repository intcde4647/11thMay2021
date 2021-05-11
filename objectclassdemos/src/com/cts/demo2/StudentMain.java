package com.cts.demo2;

public class StudentMain {

	public static void main(String[] args) {
		Student student1=new Student();
		Student student2=new Student();
		student1.setRoll(1);
		student1.setName("Raj");
		student1.setMarks(100);
		student2.setRoll(1);
		student2.setName("Raj");
		student2.setMarks(100);
		/* The hashcode value of student1 object 1159190947
The hashcode value of student2 object 925858445 */
		System.out.println("The hashcode value of student1 object "+student1.hashCode());
		System.out.println("The hashcode value of student2 object "+student2.hashCode());
        System.out.println(student1==student2); 
	    System.out.println(student1.equals(student2));
	    // Until unless we override to String it returns FQN@hexadecimal representation of 
	    // hashCode
	    //com.cts.demo2.Student@28ab29
	    //com.cts.demo2.Student@28ab29
	    // But if we override the toString method , our content is readable
	    System.out.println(student1.toString());
	    System.out.println(student2.toString());
	}

}
