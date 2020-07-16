package com.thoughtworks.basic;

public class Student extends Person{
    private int classNumber;

    public Student(String name, int age, int classNumber) {
        super(name,age);
        this.classNumber = classNumber;
    }

    public String introduce(){
        String studentIntroduce = "My name is " + name +". I am " + age + " years old. " + "I am a Student of Class " + classNumber + ".";
        return studentIntroduce;
    }
}
