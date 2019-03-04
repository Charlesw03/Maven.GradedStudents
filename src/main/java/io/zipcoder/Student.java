package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private  String lastName;
    public ArrayList<Double> examScores;

        public Student (String firstName, String lastName, ArrayList<Double>testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(testScores);



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

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public String getNumberofTestTaken(){


    }
}
