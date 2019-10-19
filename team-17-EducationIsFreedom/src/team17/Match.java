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

    void companyStudentMatching(Student[] students, Company[] companies) {

    }
}
