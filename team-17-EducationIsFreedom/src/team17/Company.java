package team17;

public class Company {
<<<<<<< HEAD
    private String name;
    private Student[] firstDesiredStudents;
    private Student[] secondDesiredStudents;
    private String[] industry;
    private int internAmt;
    private InterviewSession[] interviewSessions = new InterviewSession[3];

=======
    String name;
//    private Student[] firstDesiredStudents;
//    private Student[] secondDesiredStudents;
//    private String[] industry;
//    private InterviewSession[] interviewSessions = new InterviewSession[3];
    Position[] positions;
>>>>>>> 390669aa69f9f48d4ab3239cc5f4d02e07af3a02
    void setName(String name) {

    }

    String getName() {
        return name;
    }

    void setFirstDesiredStudents(String firstdesiredstudents) {

    }

    Student[] getFirstDesiredStudents() {
        return firstDesiredStudents;
    }

    void setSecondDesiredStudents(String seconddesiredstudents) {

    }

    Student[] getSecondDesiredStudents() {
        return secondDesiredStudents;
    }

    void setIndustry(String industry) {

    }

    void setPositions(int n){
        positions = new Position[n];
    }

    void setInternAmt(int internAmt) {

    }

    int getInternAmt() {
        return internAmt;
    }

    void setInterviewSessions(String interviewSessions) {

    }


}
