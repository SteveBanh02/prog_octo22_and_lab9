import java.util.Scanner;
import java.io.*;
public class Driver {

    public static void main(String[] args) {

        //create an array of 30 student
        Student [] studentArray = new Student[30];
        int i = 0;
        try{
            File myFile = new File("students.txt");//open the file .txt
            Scanner input = new Scanner(myFile);//set it to the scanner

            while (input.hasNextLine()){ //checks if there is another line to read in .txt
                String line = input.nextLine(); //reads the next line from the file and stores it in the line variable.

                //split line into student name, test1, test2, test3
                String [] lineValues = line.split(" ");

                //set the name of student, the first value in lineValues
                Student myStudent = new Student(lineValues[0]);

                /*sets the first test score by converting the second value
                in lineValues to an integer and passing it to setTest1.
                because the computer reads the info in .txt as a string
                */
                myStudent.setTest1(Integer.parseInt(lineValues[1]));
                myStudent.setTest2(Integer.parseInt(lineValues[2]));
                myStudent.setTest3(Integer.parseInt(lineValues[3]));

                /*Stores the Student: It puts the myStudent object (representing one student) into the studentArray
                so that we can keep track of this student's information. Moves to the Next Spot: The i++ part increases i by 1,
                so the next time a new student is created, it will go into the next spot in the array.
                
                essential to build a collection of all Student objects
                in the file, allowing the program to process each student’s
                information independently after reading the file.
                */
                studentArray[i++] = myStudent;
            }
            input.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }   

        int counterPassed = 0;
        int counterFailed = 0;
        for(int j = 0 ; j < i; j++){

            double average2Test = (studentArray[j].getTest1() + studentArray[j].getTest2())/2;
            double totalAverage = studentArray[j].studentAverage();

            if(average2Test >= 60 ){
                System.out.println("Student name: " + studentArray[j].getName());

                if(totalAverage >= 60){
                    System.out.println("Average of all 3 tests: " + totalAverage);
                    System.out.println("Result: Passed");
                    counterPassed++;
                    
                }else{
                    System.out.println("Average of 3 tests: " + totalAverage);
                    System.out.println("Result: Failed"); 
                    counterFailed++; 
                }
            }else{
                System.out.println("Student name: " + studentArray[j].getName());
                System.out.println("Average of first 2 tests: " + average2Test);
                System.out.println("Result: Failed");
                counterFailed++; 
            }
        }
        System.out.println(counterPassed + " students have passed");
        System.out.println(counterFailed + " student have failed");
        
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
