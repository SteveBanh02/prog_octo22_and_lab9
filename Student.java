import java.util.Scanner;
public class Student{

    private String name;
    private int test1, test2, test3;

    //previous constructor example
    // int age;
    // static int totalStudent;
    // String address;

    public double studentAverage(){
        return (test1 + test2 + test3)/3;
    }

    //getters
    public String getName(){
        return name;
    }

    public int getTest1(){
        return test1;
    }

    public int getTest2(){
        return test2;
    }

    //setters
    public void setTest1(int score1){
        test1 = score1;
    }

    public void setTest2(int score2){
        test2 = score2;
    }

    public void setTest3(int score3){
        test3 = score3;
    }


    public Student (String tempName){

        name = tempName;
        //previous example
        //age = tempAge;
        //this.address = address;

    }

    public String toString(){
        return "Student name is " + name + ",test 1 " + test1 + ", test 2 " + test2 + ", test 3" + test3;
    }

    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);

    //     for (int i = 0; i < 3; i++){
            
    //         System.out.println("enter student's name");
    //         String tempName = input.nextLine();

    //         Student student = new Student(tempName);

    //         System.out.println("enter test 1 grade for student:");
    //         int score1 = input. nextInt();
    //         student.setTest1(score1);

    //         System.out.println("enter test 2 grade for student:");
    //         int score2 = input.nextInt();
    //         student.setTest2(score2);


    //         System.out.println("enter test 3 grade for student:");
    //         int score3 = input.nextInt();
    //         student.setTest3(score3);

    //         System.out.println("student " + tempName + " average is " + student.studentAverage());
    //         input.nextLine(); 

    //         //System.out.println("number of player so far: " + playerCount + "player");
    //     } 
    // }
}