package io.zipcoder;

import sun.applet.resources.MsgAppletViewer;

import java.util.*;


public class Classroom {


    Student[] students;
    int maxNumberOfStudents;


    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore() {
        double examScore = 0.0;
        for (Student student : this.students) {
            examScore = student.getAverageExamScore();
        }

        return examScore;
    }


    public void addStudent(Student student) {
        // add a student to the student arraylist
        List<Student> listofStudents = new ArrayList<Student>(Arrays.asList(this.students));
        listofStudents.add(student);
        this.students = listofStudents.toArray(new Student[listofStudents.size()]);

    }

    public void removeStudent(String firstName, String lastName) {
        List<Student> listofStudents = new ArrayList<Student>(Arrays.asList(this.students));
        List<Student> studentToRemove = new ArrayList<>();
        for (Student student : listofStudents) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                studentToRemove.add(student);
            }
            studentToRemove.removeAll(studentToRemove);
            // since we removed a student we would have a null value so we re assigned student list to the [0] posititon.
            this.students = listofStudents.toArray(new Student[0]);

        }

    }

    public Student[] getStudentsByScore() {
        StudentComparator sc = new StudentComparator();
        Arrays.sort(students, sc);

        return students;
    }

    public String getGradeBook() {
        Map<String, String> gradeBook = new TreeMap<>();
        // students is sorted by grade or/and  name(alphabetically)
        students = getStudentsByScore();

        for (int i = 0; i < students.length; i++) {
            Double percentile = (double) students.length - i / students.length;
            String fullName = students[i].getFirstName() + " " + students[i].getLastName();
            //make a method that gets a string letter grade.
            gradeBook.put(fullName,getLetterGrade(percentile));
        }

        return gradeBook.toString();
    }

    public String getLetterGrade(Double percentile) {


        String letterGrade = "";
        if (percentile >= .9) {
            letterGrade += "A";
        } else if (percentile >= .8 && percentile <= .89) {
            letterGrade += "B";
        } else if (percentile >= .7 && percentile <= .79) {
            letterGrade += "C";
        } else if (percentile >= .6 && percentile <= .69) {
            letterGrade += "D";
        } else if (percentile >= .00 && percentile <= .59) {
            letterGrade += "F";
        }


        return letterGrade;
    }

}
