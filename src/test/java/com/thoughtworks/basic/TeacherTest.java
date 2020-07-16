package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class TeacherTest {
    @Test
    public void should_return_teacherIntroduce_given_teacher_when_introduce() {
        //given
        Teacher teacher = new Teacher("Marry",30,"Teacher");

        //when
        String teacherIntroduce = teacher.introduce();

        //then
        Assert.assertEquals("My name is Marry. I am 30 years old. I am a Teacher.",teacherIntroduce);
    }
}
