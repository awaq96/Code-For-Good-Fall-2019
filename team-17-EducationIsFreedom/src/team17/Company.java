package team17;

public class Company {
    private String name;
    private Student[] firstDesiredStudents;
    private Student[] secondDesiredStudents;
    private String[] industry;
    private InterviewSession[] interviewSessions = new InterviewSession[3];
    Position[] positions;
    public InterviewInterest[] interviewInterests = new InterviewInterest[500];
    void setName(String name) {

    }

    String getName() {
        return name;
    }


    void setIndustry(String industry) {

    }

    String[] getIndustry() {
        return industry;
    }

    void setInterviewSessions(String interviewSessions) {

    }

    InterviewSession[] getInterviewSessions() {
        return interviewSessions;
    }


}
