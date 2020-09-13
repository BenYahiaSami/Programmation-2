package com.company;

import java.util.ArrayList;

public class TestGrade {
    public static void main(String[] args){
	TestGrade test = new TestGrade();
	if(test.testGetValue() == true)
	    System.out.println("testGradeValue : correct");
	else
	    System.out.println("testGradeValue : incorrect"); 

	if(test.testToString() == true)
	    System.out.println("testToString : correct");
	else
	    System.out.println("testToString : incorrect");
	
	if(test.testAverageGrade() == true)
	    System.out.println("testAverageGrade : correct");
	else
	    System.out.println("testAverageGrade : incorrect"); 
    }

    public boolean testGetValue(){
	Grade grade =  new Grade(12.5);
	double val = grade.getValue();
	if(val == 12.5)
	    return true;
	else
	    return false;
    }

    public boolean testToString(){
	Grade grade = new Grade(13.7);
	String gradeString = grade.toString();
	if(gradeString.equals("13.7/20"))
	    return true;
	else
	    return false;
    }

    public boolean testAverageGrade(){
	ArrayList<Grade> list = new ArrayList<Grade>();
	list.add(new Grade(10));
	list.add(new Grade(8));
	list.add(new Grade(12));
	list.add(new Grade(20));
	list.add(new Grade(6));
	Grade average = Grade.averageGrade(list);
	if(average.getValue() == 11.2)
	    return true;
	else
	    return false;
		
    }
    

    
    
    
}
