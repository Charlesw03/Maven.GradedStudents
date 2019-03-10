package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ClassroomTest {

    @Test
    public void testNullary() {
        //given
        Integer maxStudents = 30;

        //when
        Classroom classroom = new Classroom(maxStudents);
        Integer actual = classroom.getStudents().length;

        // then
        Assert.assertEquals(maxStudents, actual);

    }

    @Test
    public void testGetAverageExamScore() {
        //given
        String firstName = "Chaz";
        String lastName = "Winemer";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(0, 100.0);
        examScores.add(1, 159.9);
        examScores.add(2, 201.1);
        Double sum = 100.0 + 159.9 + 201.1;
        Double expectedDub = sum / examScores.size();

        Student student = new Student(firstName, lastName, examScores);
        //when
        Double actualDub = student.getAverageExamScore();
        //then
        Assert.assertEquals(expectedDub, actualDub);
    }

    @Test
    public void testRemoveTest() {
        //given
        List<String> listOfStudents = new ArrayList<>();
        Student student = new Student();
        String expected = "McTina";
        //when

        listOfStudents.add("McTina");
        listOfStudents.add("MarciInstructor");
        String actual = listOfStudents.remove(0);
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetGradeBook() {
        //given
        int maxNumberOfStudents= 4;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        List<Double> grades = new ArrayList<>();

        grades.add(0,100.0);
        grades.add(1,80.0);
        grades.add(2,70.0);
        grades.add(3,60.0);

        Student student = new Student("Romelu","Lukaku",grades);
        Student student1 = new Student("Edd","DubD",grades);
        Student student2 = new Student("Eddy","shortED",grades);
        Student student3 = new Student("Ed","tallED",grades);

        classroom.addStudent(student);
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        //when

        String actual = classroom.getGradeBook();
        //then



    }



}

