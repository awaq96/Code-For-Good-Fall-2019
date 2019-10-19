package team17;

public class Position {
    Student[] secondDesiredStudents;
    String name = "";
    String company = "";
    int internAmt = 0;

    Position(){

    }

    void setStudents(int n){
        secondDesiredStudents = new Student[n];
        for(int i = 0; i < secondDesiredStudents.length; i++)
            secondDesiredStudents[i] = new Student();
    }

}
