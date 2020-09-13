package com.company;


public class Main {
  public static void main(String[] args){
    Student Sami = new Student("Sami","Ben Yahia");
    Sami.addResult("Programmation 2",new Grade(20));
    Sami.addResult("Structure discrète",new Grade(20));
    Cohort L2 = new Cohort("L2 informatique");
    L2.addStudent(Sami);
    L2.printStudentsResults();



  }
}
