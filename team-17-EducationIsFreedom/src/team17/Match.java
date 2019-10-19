package team17;
import java.util.*;

public class Match {
    Map<Company, Student> report = new HashMap<Company, Student>();

    void interviewScheduling(Student[] students, Company[] companies) {
<<<<<<< HEAD
=======
       for(int n=0;n<students.length;n++){
        for(int i=0;i<5;i++){
            String name = students[n].secondDesiredPositions[i].company;
            String a[] = new String[2];
            a[0]=students[n].getEmail();
            a[1]=Integer.toString(i);
            interested.put(name,a);
>>>>>>> 390669aa69f9f48d4ab3239cc5f4d02e07af3a02

    }

    void companyStudentMatching(Student[] students, Company[] companies) {

    }
}
