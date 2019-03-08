package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ClassroomTest {
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

}
