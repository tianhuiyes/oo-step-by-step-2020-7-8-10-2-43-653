package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void should_return_selfIntroduce_given_person_when_introduce() {
        //given
        Person person = new Person("lily",24);

        //when
        String selfIntroduce = person.introduce();

        //then
        Assert.assertEquals("My name is lily. I am 24 years old.",selfIntroduce);
    }
}
