package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void should_return_studentIntroduce_given_student_when_introduce() {
        //given
        ClassNumber classNumber = new ClassNumber(2);
        Student student = new Student("lily",24,classNumber);

        //when
        String studentIntroduce = student.introduce();

        //then
        Assert.assertEquals("My name is lily. I am 24 years old. I am a Student of Class 2.",studentIntroduce);
    }
}
