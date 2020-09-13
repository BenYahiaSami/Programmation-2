package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * A group of students.
 */

public class Cohort {
  private final String name;
  private final List<Student> students;

  /**
   * Constructs a cohort with a name equals to the specified {@code name} and no students.
   * @param name the name of the constructed Cohort
   */

  public Cohort(String name) {
    this.name = name;
    this.students = new ArrayList<>();
  }

  /**
   * Add the specified {@code student} to the students of the cohort.
   * @param student the student to be added to the cohort
   */
  public void addStudent(Student student){
    this.students.add(students.size(),student);
  }

  /**
   * Returns the list of students of the cohort.
   * @return the list of students of the cohort.
   */
  public List<Student> getStudents(){
    return students;
  }

  /**
   * Print via the standard output the name of the cohort and all results associated to the students with their average
   * grade.
   */
  public void printStudentsResults(){
    System.out.println(this.toString());
    for(int i = 0;i<=students.size();i++){
      students.get(i).toString();
      students.get(i).printResults();
      System.out.println("\n");

    }
  }

  private void printName(){
  }

  /**
   * Returns the name of the cohort.
   * @return the name of the cohort
   */
  @Override
  public String toString() {
    return name;
  }
}
