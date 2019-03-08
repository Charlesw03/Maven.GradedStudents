package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


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
        listofStudents.remove(0);
        this.students = listofStudents.toArray(new Student[0]);

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

}
