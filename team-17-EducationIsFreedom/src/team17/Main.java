package team17;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    static Student[] students;
    static Company[] companies;

    public static void main(String[] args) {
        setCompanies();
        setStudents();
        setStudentsInPositions();
    }

    static int getArrAmt(String filename){
        int count = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

            String input;

            while ((input = bufferedReader.readLine()) != null) {
                count++;
            }
        }
        catch(Exception e){

        }

        return count;
    }
    static void setStudents(){

        try {

            String filename = "Student_Info_CSV.csv";
            students = new Student[getArrAmt(filename) - 1];

            BufferedReader csvReader = new BufferedReader(new FileReader(filename));
            String row;

            row = csvReader.readLine();
            int n = 0;
            int m = 1;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(Character.toString('"')); //company rankings
                String[] data2 = data[0].split(",");
                String[] data3;
                // do something with the data
                students[n].email = data2[2];
                for(int i = 0; i < 5; i++) {
                    data3 = data[m].split(",");
                    students[n].secondDesiredPositions[i] = findPosition(data[3]);
                    m += 2;
                }

            }
        }
        catch(Exception e){

        }
    }

    static Position findPosition(String company){
        for(int i = 0; i < companies.length; i++){
            if(companies[i].name == company){
                return companies[i].positions[0];
            }
        }

        return null;
    }

    static Student findStudent(String name){
        for(int i = 0; i < students.length; i++){
            if(students[i].email == name)
                return students[i];
        }
        return null;
    }

    static void setCompanies(){
        try {

            String filename = "Company_Mock_Data_V2csv.csv";
            companies = new Company[getArrAmt(filename) - 1];

            BufferedReader csvReader = new BufferedReader(new FileReader(filename));
            String row = csvReader.readLine();

            int n = 0;
            while ((row = csvReader.readLine()) != null) {
                String[] data2 = row.split(Character.toString('"'));
                String[] data = data2[0].split(",");
                String[] data3 = data2[1].split(","); //student preferences
                // do something with the data
                companies[n].name = data[0];
                companies[n].setPositions(1);

                companies[n].positions[0].name = data[1];
                companies[n].positions[0].company = data[0];
                companies[n].positions[0].internAmt = Integer.parseInt(data[3]);
                companies[n].positions[0].setStudents(data3.length);

            }
        }
        catch(Exception e){

        }
    }

    static void setStudentsInPositions(){
        try {

            String filename = "Company_Mock_Data_V2csv.csv";
            companies = new Company[getArrAmt(filename) - 1];

            BufferedReader csvReader = new BufferedReader(new FileReader(filename));
            String row = csvReader.readLine();

            int n = 0;
            String[] data, data2;

            for(int i = 0; i < companies.length; i++){

                row = csvReader.readLine();
                data = row.split(Character.toString('"'));
                data2 = data[1].split(",");
                for(int j = 0; j < data2.length; j++){
                    companies[i].positions[0].secondDesiredStudents[j] = findStudent(data2[j]);
                }

            }
        }
        catch(Exception e){

        }

    }

}
