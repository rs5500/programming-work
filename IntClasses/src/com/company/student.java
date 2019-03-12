package com.company;

/**
 * Created by rs5500 on 3/12/2019.
 */
public class student {
    private int studentID;
    private String name;
    private double contentGrade;
    private double workHabitGrade;
    private double participation;
    private int age;
    public student(String Name,int ID,int Age){
        name = Name;
        studentID = ID;
        age = Age;
        contentGrade = 0;
        workHabitGrade = 0;
        participation = 0;
    }
    public student(){
        name = "TestStudent";
        studentID = -1;
        contentGrade = 0;
        workHabitGrade = 0;
        participation = 0;
        age = 18;
    }
    public void SetContentGrade(int grade){
        contentGrade = grade;
    }
    public void SetWorkHabitGrade(int grade){
        workHabitGrade = grade;
    }
    public void SetParticipation(int grade){
        participation = grade;
    }
}
