package com.tnsif.assignmenttwo;

public class AssignmentMain 
{
	public static void main(String[] args) {
        // Part 1: Student object
        Student s1 = new Student(); // will print message

        // Part 2: Commission object
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}
