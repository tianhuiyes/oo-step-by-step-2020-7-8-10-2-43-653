package com.thoughtworks.basic;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        String selfIntroduce = "My name is " + name +". I am " + age + " years old.";
        return selfIntroduce;
    }
}
