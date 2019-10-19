package team17;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    static Student[] students;
    static Company[] companies;

    public static void main(String[] args) {

        students = new Student[10];
        for(int i = 0; i < students.length; i++){
            students[i] = new Student();
        }

        companies = new Company[20];
        for(int i = 0; i < companies.length; i++){
            companies[i] = new Company();
        }

    }

    public static void populateStudents(){
        students[0].email = "misherwood0@digg.com";

    }

}
