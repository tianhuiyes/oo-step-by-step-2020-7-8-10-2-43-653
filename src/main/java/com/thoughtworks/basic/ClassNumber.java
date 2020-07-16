package com.thoughtworks.basic;

import java.util.List;

public class ClassNumber {
    private int number;
    private Teacher teacher;

    public ClassNumber(int number, Teacher teacher) {
        this.number = number;
        this.teacher = teacher;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String enterStudent(List<Student> studentList) {
        String introduce = " ";
        for(int index = 0;index < studentList.size();index++){
            introduce += studentList.get(index).introduce() + "\n";
        }
        return introduce;
    }
}
