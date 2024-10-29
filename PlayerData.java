import java.util.Scanner;
public class PlayerData{

    static int playerCount;
    String name;
    int age;

    public PlayerData(String tempName, int age){

        name = tempName;
        this.age = age;
        playerCount++; 

    }

    public String toString(){
        return "Player's name is " + name + ", player age is " + age;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.println("enter player's name: ");
            String tempName = input.nextLine();

            System.out.println("enter player's age: ");
            int tempAge = input.nextInt();
            input.nextLine();

            PlayerData player = new PlayerData(tempName, tempAge);
            System.out.println("number of player so far: " + playerCount + "player");

        }
        
    }
   
}