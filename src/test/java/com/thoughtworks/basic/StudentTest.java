package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void should_return_studentIntroduce_given_student_when_introduce() {
        //given
        Student student = new Student("lily",24,1);

        //when
        String studentIntroduce = student.introduce();

        //then
        Assert.assertNotNull(studentIntroduce);
        Assert.assertEquals("My name is lily. I am 24 years old. I am a Student of Class 1.",studentIntroduce);
    }
}
