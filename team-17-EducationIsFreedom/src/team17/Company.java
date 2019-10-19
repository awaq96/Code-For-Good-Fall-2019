
package team17;

public class Company {
    String name;
    Position[] positions;
    void setName(String name) {

    }

    Company(){

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
