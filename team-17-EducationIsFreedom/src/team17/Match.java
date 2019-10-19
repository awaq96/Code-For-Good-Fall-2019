package team17;
import java.util.*;

public class Match {
    Map<Position, Student> report = new HashMap<Position, Student>();
    Map<String, String[]> interested = new HashMap<String, String[]>();

    void interviewScheduling(Student[] students, Company[] companies) {
        for (int n = 0; n < students.length; n++) {
            for (int i = 0; i < 5; i++) {
                String name = students[n].secondDesiredPositions[i].company;
                String a[] = new String[2];
                a[0] = students[n].getEmail();
                a[1] = Integer.toString(i);
                interested.put(name, a);

            }
        }


    }

    void assign(Student[] students, Company[] companies) {

        ArrayList<Student> arr = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < companies.length; i++) {
            for (int j = 0; j < companies[i].positions.length; j++) {
                if (companies[i].positions[j] != null) {
                    for (int n = 0; n < 5; n++) {
                        arr = getStudents(n, students, companies[i].positions[j]);

                        while (companies[i].positions[j].internAmt > 0 || !arr.isEmpty()) {
                            if (isOnList(arr.get(count), companies[i].positions[j])) {
                                report.put(companies[i].positions[j], arr.get(count));
                                arr.remove(count);
                                count++;
                                companies[i].positions[j].internAmt--;
                            }
                        }

                        if (companies[i].positions[j].internAmt < 0)
                            break;
                    }
                }
            }
        }
    }

    boolean isOnList(Student student, Position position) {
        for (int i = 0; i < position.secondDesiredStudents.length; i++) {
            if (student == position.secondDesiredStudents[i])
                return true;
        }

        return false;
    }

    ArrayList<Student> getStudents(int rank, Student[] students, Position position) {
        ArrayList<Student> returnArr = new ArrayList<Student>();

        for (int i = 0; i < students.length; i++) {
            if (!isNull(students[i]) && students[i].secondDesiredPositions[rank] == position)
                returnArr.add(students[i]);
        }

        return returnArr;
    }

    boolean isNull(Object o) {
        if (o == null)
            return true;

        return false;
    }

    void match1to1s(Student[] students, Company[] companies) {
        Student s;
        ArrayList<Student> arr = new ArrayList<>();

        for (int i = 0; i < companies.length; i++) {
            for (int j = 0; j < companies[i].positions.length; j++) {

                arr = getStudents(0, students, companies[i].positions[j]);
                for (int n = 0; n < arr.size(); n++) {
                    s = arr.get(n);
                    if (s == companies[i].positions[j].secondDesiredStudents[0]) {
                        report.put(companies[i].positions[j], s);
                        for (int x = 0; x < students.length; x++) {
                            if (s == students[x])
                                students[x] = null;
                        }
                        companies[i].positions[j].internAmt--;
                        break;
                    }
                }
            }
        }
    }

    void companyStudentMatching (Student[]students, Company[]companies){
        //case 1: student's #1 matches company's position #1
        match1to1s(students, companies);

        //case 2: lol
        assign(students, companies);

    }
}
