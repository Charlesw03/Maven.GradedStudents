package io.zipcoder;

import io.zipcoder.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = (int) (o2.getAverageExamScore() - o1.getAverageExamScore());
        if (result == 0) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        } else {
            return result;
        }
    }
}
