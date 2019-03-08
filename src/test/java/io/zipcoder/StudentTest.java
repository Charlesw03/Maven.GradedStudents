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
    public void testExamScoreswithNull() {
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
    public void testSetExamScores() {
        String expectedstring = "Exam Scores:\n" +
                "\tExam 1 -> 100.0\n";

        List<Double> expectedArrList = new ArrayList<>();
        expectedArrList.add(60.0);

        //when
        Student student = new Student("c", "w", expectedArrList);
        student.setExamScores(1, 100.0);
        String actualString = student.getExamScores();

        //then
        Assert.assertEquals(expectedstring, actualString);
    }

    @Test
    public void testSetExamScoreLastExam() {
        String expectedstring = "Exam Scores:\n" +
                "\tExam 1 -> 75.0\n" +
                "\tExam 2 -> 67.0\n" +
                "\tExam 3 -> 100.0\n";

        List<Double> expectedArrList = new ArrayList<>();
        expectedArrList.add(75.0);
        expectedArrList.add(67.0);
        expectedArrList.add(80.0);


        //when
        Student student = new Student("c", "w", expectedArrList);
        student.setExamScores(3, 100.0);
        String actualString = student.getExamScores();

        //then
        Assert.assertEquals(expectedstring, actualString);


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
    public void toStringOverride(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(lastName);
        sb.append(examScores);
        String expected = sb.toString();

        // When
        String actual = sb.toString();

        // Then
        Assert.assertEquals(expected,actual);


    }

}