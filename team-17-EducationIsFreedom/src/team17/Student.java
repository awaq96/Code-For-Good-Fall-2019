package team17;

public class Student {
    Position[] secondDesiredPositions = new Position[5];
    String email;


    String getEmail() {
        return email;
    }

    Student(){
        for(int i = 0; i < 5; i++){
            secondDesiredPositions[i] = new Position();
        }
    }

}
