package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    @Test
    public void nullaryConstructorTest() {
        //given
        String expectedFirstName = "charlie";
        String expectedLastName = "wilmer";
        Integer expectedSize = 0;
        //when
        Student student = new Student();
        String actualName = student.getFirstName();
        String actualLastname = student.getLastName();
        Integer actualSize = student.getNumberofTestTaken();
        //then
        Assert.assertEquals(expectedFirstName, actualName);
        Assert.assertEquals(expectedLastName, actualLastname);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void StudentTest() {
        //given
        String expectedFirstName = "chalie";
        String expectedLastName = "wilmot";
        List<Double> expectedArrList = new ArrayList<>();
        expectedArrList.add(100.0);
        Integer expectedSize = 1;
        //when
        Student student = new Student(expectedFirstName, expectedLastName, expectedArrList);
        String actualName = student.getFirstName();
        String actualLastname = student.getLastName();
        Integer actualSize = student.getNumberofTestTaken();
        //then
        Assert.assertEquals(expectedFirstName, actualName);
        Assert.assertEquals(expectedLastName, actualLastname);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void setFirstNameTest() {
        //given
        String expectedfirstName = "Chuck";
        Student student = new Student();
        //when
        student.setFirstName(expectedfirstName);
        String actualfirstName = student.getFirstName();
        //then
        Assert.assertEquals(expectedfirstName, actualfirstName);

    }

    @Test
    public void setLastNameTest() {
        //given
        String expectedLastName = "Chuck";
        Student student = new Student();
        //when
        student.setLastName(expectedLastName);
        String actualLastName = student.getLastName();
        //then
        Assert.assertEquals(expectedLastName, actualLastName);
    }

    @Test
    public void testgetExamScores() {
        //given
        String expectedstring = "Exam Scores:\n" +
                "\tExam 1 -> 100.0\n";

        List<Double> expectedArrList = new ArrayList<>();
        expectedArrList.add(100.0);

        //when
        Student student = new Student("c", "w", expectedArrList);
        String actualString = student.getExamScores();

        //then
        Assert.assertEquals(expectedstring, actualString);


    }
    @Test
    public void testExamScoreswithNull(){
        //given
        String expectedstring = "Exam Scores:\n" +
                "\tExam 1 -> null\n";

        List<Double> expectedArrList = new ArrayList<>();
        expectedArrList.add(null);

        //when
        Student student = new Student("c", "w", expectedArrList);
        String actualString = student.getExamScores();

        //then
        Assert.assertEquals(expectedstring, actualString);

    }
    @Test
    public void testSetExamScores(){
        //given
        String expectedstring = "Exam Scores:\n" +
                "\tExam 1 -> 100.0\n";

        List<Double> expectedArrList = new ArrayList<>();
        expectedArrList.add(100.0);

        //when
        Student student = new Student("c", "w", expectedArrList);
        String actualString = student.getExamScores();

        //then
        Assert.assertEquals(expectedstring, actualString);


    }

}