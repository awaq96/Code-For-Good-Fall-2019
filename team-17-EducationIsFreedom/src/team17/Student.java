package team17;

public class Student {
<<<<<<< HEAD
    private Company[] firstDesiredCompanies = new Company[5];
    private Company[] secondDesiredCompanies = new Company[5];
    private String email;
    private String[] interests;
    private int year;
    private double gpa;
    private String school;

    void setFirstDesiredCompanies(String companies) {

    }

    Company[] getFirstDesiredCompanies() {
        return firstDesiredCompanies;
    }

    void setSecondDesiredCompanies(String companies) {

    }

    Company[] getSecondDesiredCompanies() {
        return secondDesiredCompanies;
    }

    void setEmail(String email) {

    }
=======
    Position[] secondDesiredPositions = new Position[5];
    String email;
>>>>>>> 390669aa69f9f48d4ab3239cc5f4d02e07af3a02

    String getEmail() {
        return email;
    }

    Student(){
        for(int i = 0; i < 5; i++){
            secondDesiredPositions[i] = new Position();
        }
    }

}
