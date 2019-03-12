package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private List<Double> examScores;

    public Student() {
        this("charlie", "wilmer", new ArrayList<Double>());
    }

    public Student(String firstName, String lastName, List<Double> testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = testScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getExamScores() {
        Integer numberOfExamsTaken = 1;
        StringBuilder testScores = new StringBuilder("Exam Scores:\n");
        for (Double examGrade : examScores) {
            testScores.append("\tExam " + numberOfExamsTaken + " -> " + examGrade + "\n");
            numberOfExamsTaken++;
        }
        return testScores.toString();
    }


    public Double getAverageExamScore() {
        Double sum = 0.0;
        for (Double examScore : this.examScores) {
            sum += examScore;
        }
        Double average = sum / this.examScores.size();
        return average;
    }

    public void setExamScores(int examNumber, double newScore) {

            examScores.add(examNumber-1 ,newScore);
            examScores.remove(examNumber);


    }

    public Integer getNumberofTestTaken() {
        return this.examScores.size();

    }

    @Override
        public String toString(){
        String studentName = "Chalie";
        String studentLastName= "Wilmer";
        StringBuilder sb = new StringBuilder();
        sb.append(studentName);
        sb.append(studentLastName);
        sb.append(getExamScores());
        return sb.toString();

    }


}
