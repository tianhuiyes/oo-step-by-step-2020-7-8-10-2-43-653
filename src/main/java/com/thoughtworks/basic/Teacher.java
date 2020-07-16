package com.thoughtworks.basic;

public class Teacher extends Person{
    private String job;
    public Teacher(String name, int age, String job) {
        super(name,age);
        this.job = job;
    }

    public String introduce(){
        String teacherIntroduce = "My name is " + name +". I am " + age + " years old. " + "I am a " + job + ".";
        return teacherIntroduce;
    }
}
