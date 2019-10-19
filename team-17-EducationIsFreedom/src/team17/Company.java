
package team17;

public class Company {
    String name;
    //    private Student[] firstDesiredStudents;
//    private Student[] secondDesiredStudents;
//    private String[] industry;
//    private InterviewSession[] interviewSessions = new InterviewSession[3];
    Position[] positions;
    void setName(String name) {

    }

    Company(){

    }

    String getName() {
        return name;
    }


    void setIndustry(String industry) {

    }

    void setPositions(int n){
        positions = new Position[n];
        for(int i = 0; i < positions.length; i++){
            positions[i] = new Position();
        }
    }

    void setInterviewSessions(String interviewSessions) {

    }


}
