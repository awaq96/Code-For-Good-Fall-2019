package team17;
import java.util.*;

public class Match {
    Map<Position, Student> report = new HashMap<Position, Student>();

    void interviewScheduling(Student[] students, Company[] companies) {

    }

    void match1to1s(Student[] students, Company[] companies){
        for(int i = 0; i < companies.length; i++){
            for(int j = 0; j < companies[i].positions.length; j++){
                for(int m = 0; m < students.length; m++){
                    if(students[m] != null && companies[i].positions[j] != null){
                        if(students[m].secondDesiredPositions[0].company == companies[i].getName() &&
                                students[m].secondDesiredPositions[0] == companies[i].positions[j] &&
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
                for (int p = 0; p < students.length; p++){
                    for(int m = 0; m < 5; m++){ //iterate through student ranking
                        for(int n = 0; n < companies[i].positions[j].secondDesiredStudents.length; n++){
                            if(companies[i].positions[j] != null && students[p] != null &&
                                    companies[i].positions[j].secondDesiredStudents[n] == students[p] &&
                                    students[p].secondDesiredPositions[m] == companies[i].positions[j]){
                                report.put(companies[i].positions[j], students[p]);
                                students[p] = null;
                                companies[i].positions[j] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    void companyStudentMatching(Student[] students, Company[] companies) {
        //case 1: student's #1 matches company's position #1
        match1to1s(students, companies);

        //case 2: lol
        matchEverythingElse(students, companies);

    }
}
