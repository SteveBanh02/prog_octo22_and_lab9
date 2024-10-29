import java.util.Scanner;
import java.io.*;
public class DriverLab {

    public static void main(String[] args) {

        Student [] studentArray = new Student[30];
        int i = 0;

        try{
            File myFile = new File("students.txt");
            Scanner input = new Scanner(myFile);

            while (input.hasNextLine()){
                String line = input.nextLine();
                String [] lineValues = line.split(" ");
                Student myStudent = new Student(lineValues[0]);
                myStudent.setTest1(Integer.parseInt(lineValues[1]));
                myStudent.setTest2(Integer.parseInt(lineValues[2]));
                myStudent.setTest3(Integer.parseInt(lineValues[3]));

                studentArray[i++] = myStudent;
            }
            input.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }   
        
        for(i = 0 ; i < studentArray.length; i++){
            System.out.println(studentArray[i].studentAverage());
        }

        // int counterPassed = 0;
        // int counterFailed = 0;
        // for(int j = 0 ; j < i; j++){

        //     double average2Test = (studentArray[j].getTest1() + studentArray[j].getTest2())/2;
        //     double totalAverage = studentArray[j].studentAverage();

        //     //System.out.println(studentArray[i].studentAverage());

        //     if(average2Test >= 60 ){
        //         System.out.println("Student name: " + studentArray[j].getName());
        //         System.out.println("Average of first 2 test " + average2Test);

        //         if(totalAverage >= 60){
        //             System.out.println("Overall average is " + totalAverage);
        //             System.out.println("Result: passed");
        //             counterPassed++;
                    
        //         }else{
        //             System.out.println("Overall average is " + totalAverage);
        //             System.out.println("Result: Failed"); 
        //             counterFailed++; 
        //         }
        //     }else{
        //         System.out.println("Student name: " + studentArray[j].getName());
        //         System.out.println("Average of first 2 test: " + average2Test);
        //         System.out.println("Result: Failed");
        //         counterFailed++; 
        //     }
        // }
        // System.out.println(counterPassed + " students have passed");
        // System.out.println(counterFailed + " student have failed");
        
        // //previous example
        // // PlayerData player1 = new PlayerData("john", 10);

        // // System.out.println(player1);

        // System.out.println("number of player: " + PlayerData.playerCount);

        // Student student1 = new Student("yaniv");
        // System.out.println("student 1: " + student1.getName());

        // student1.setTest1(68);
        // student1.setTest2(80);
        // student1.setTest3(90);

        // System.out.println(student1);
    }
}
