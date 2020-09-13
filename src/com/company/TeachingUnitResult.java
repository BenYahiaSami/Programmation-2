package com.company;

/**
 * A result corresponding to a grade associated with a teaching unit.
 */

public class TeachingUnitResult {
  private final String teachingUnitName;
  private final Grade grade;


  /**
   * Constructs an instance of TeachingUnitResult with a grade equals to the specified {@code grade}
   * and a teaching unit name equals to the specified {@code teachingUnitName}.
   *
   * @param teachingUnitName the name of the teaching unit of the constructed TeachingUnitResult
   * @param grade the grade of the constructed TeachingUnitResult
   */

  public TeachingUnitResult(String teachingUnitName, Grade grade) {
    this.teachingUnitName = teachingUnitName;
    this.grade = grade;
  }

  /**
   * Returns the grade associated to the result.
   *
   * @return the grade associated to the result
   */
  public Grade getGrade() {
    return this.grade;
  }

  /**
   * Returns a string representation of the result in the format Name of the teaching unit : X.X.
   * @return a string representation of the result
   */

  public String toString(Grade grade) {
    String Value = String.valueOf(grade.getValue());
    String final_value = teachingUnitName+" : " + Value + "/20";
    return final_value;
  }
}
