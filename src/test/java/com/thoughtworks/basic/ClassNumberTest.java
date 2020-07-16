package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ClassNumberTest {
    @Test
    public void should_return_allStudentsIntroduce_given_classNumber_2_and_a_teacher_and_some_students_when_calculateNumber() {
        //given
        Teacher teacher = new Teacher("Marry",30,"Teacher");

        ClassNumber classTwo = new ClassNumber(2,teacher);

        Student studentA = new Student("Bill",20,classTwo);
        Student studentB = new Student("Ben",22,classTwo);
        Student studentC = new Student("Mike",23,classTwo);

        //when
        List<Student> studentList = new ArrayList<>();
        studentList.add(studentA);
        studentList.add(studentB);
        studentList.add(studentC);
        String introduce = classTwo.enterStudent(studentList);

        //then
        System.out.println(introduce);
        Assert.assertNotNull(introduce);

    }
}
