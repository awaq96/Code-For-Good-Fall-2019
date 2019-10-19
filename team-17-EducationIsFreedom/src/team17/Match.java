package team17;
import java.util.*;

public class Match {
    Map<Position, Student> report = new HashMap<Position, Student>();
    Map<String,String[]> interested = new HashMap<String,String[]>();

    void interviewScheduling(Student[] students, Company[] companies) {
       for(int n=0;n<students.length;n++){
        for(int i=0;i<5;i++){
            String name = students[n].firstDesiredPositions[i].company;
            String a[] = new String[2];
            a[0]=students[n].getEmail();
            a[1]=Integer.toString(i);
            interested.put(name,a);

        }}


    }

    void match1to1s(Student[] students, Company[] companies){
        for(int i = 0; i < companies.length; i++){
            for(int j = 0; j < companies[i].positions.length; j++){
                for(int m = 0; m < students.length; m++){
                    if(students[m] != null && companies[i].positions[j] != null){
                        if(students[m].firstDesiredPositions[0].company == companies[i].getName() &&
                                students[m].firstDesiredPositions[0] == companies[i].positions[j] &&
                                companies[i].positions[j].secondDesiredStudents[0] == students[m]){
                            report.put(companies[i].positions[j], students[m]);
                            students[m] = null;
                            companies[i].positions[j] = null;
                        }
                    }
                }
            }
        }
    }

    void matchEverythingElse(Student[] students, Company[] companies){
        for(int i = 0; i < companies.length; i++){ //iterate through companies
            for(int j = 0; j < companies[i].positions.length; j++){ //iterate through positions
//                for(int m = 0; m < 5; m++)
            }
        }
    }

    void companyStudentMatching(Student[] students, Company[] companies) {
        //case 1: student's #1 matches company's position #1
        match1to1s(students, companies);

    }
}
