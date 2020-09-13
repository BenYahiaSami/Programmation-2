package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * A students with results.
 */

public class Student {
  private final String firstName;
  private final String lastName;
  private final List<TeachingUnitResult> results;

  /**
   * Constructs a student with the specified first name and last name and no associated results.
   *
   * @param firstName the first name of the constructed student
   * @param lastName the last name of the constructed student
   */

  public Student(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.results = new ArrayList<>();
  }

  /**
   * Add a grade associated to a teaching unit to the results of the student.
   *
   * @param teachingUnitName the name of the teaching unit of the added result
   * @param grade the grade of the added result
   */
  public void addResult(String teachingUnitName, Grade grade){
    results.add(results.size(),new TeachingUnitResult(teachingUnitName,grade));
  }

  /**
   * Returns a string representation of the student in the format first name last name.
   * @return a string representation of the student
   */
  @Override
  public String toString() {
    return this.firstName +" "+ this.lastName;
  }


  /**
   * Returns the grades of the student.
   *
   * @return the grades of the student
   */
  public List<Grade> getGrades(){
    List<Grade> Grade_result = null;
    for(int i=0;i<=Grade_result.size();i++) {
      Grade_result.add(i,new Grade(this.results.get(i).getGrade().getValue()));
    }
    return Grade_result;
  }
  /**
   * Returns the average grade of the student.
   *
   * @return the average grade of the student
   */
  public Grade getAverageGrade() {
    return Grade.averageGrade(this.getGrades());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Student student = (Student) o;

    if (!firstName.equals(student.firstName)) return false;
    return lastName.equals(student.lastName);
  }

  @Override
  public int hashCode() {
    int result = firstName.hashCode();
    result = 31 * result + lastName.hashCode();
    return result;
  }

  /**
   * Print via the standard output the name of the student, all results associated to the students and
   * the average grade of the student.
   */
  public void printResults(){
    System.out.println(this.toString() + "\n" );
    for(int i =0;i<=results.size();i++){
      System.out.println(results.get(i).toString());
    }

  }

  private void printName() {
  }

  private void printAverageGrade() {
  }

}
