// Rock, Paper and Scissor

import java.io.*;
import java.util.*;
public class Task1 {
    // method to check who is winner 
    static int checkWinner(char computer, char user){
        if(computer == user)
            return 0;
        if(user == 'r'){
            if(computer == 's')
                return 1;
            else
                return 2;
        }
        else if(user == 'p'){
            if(computer == 'r')
                return 1;
            else
                return 2;
        }
        else if(user == 's'){
            if(computer == 'p')
                return 1;
            else
                return 2;
        }
        else
            return 404;
            //wrong input


    }
    public static void main(String[] args) {
        // for generating random number
        Random num = new Random();
        Scanner sc = new Scanner(System.in);
        char computer = ' ';
        int comp_w = 0, user_w = 0, hScore = 0;
        String el[] = {"Rock","Paper","Scissor"};

        //fetching the High Score 
        try {
            File file = new File("Score.txt");
            Scanner myReader = new Scanner(file);
                String data = myReader.nextLine();
                hScore = Integer.valueOf(data);
                System.out.println("Last High Score is : "+hScore);
                myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("There is no high Score");
        }

        // Choice based game
        while (true){

            System.out.println("\t\t\tPress e for exit");
            System.out.println("------------------------------------------");
            //taking user's input
            System.out.print("your term : Rock(r),Paper(p),Scissor(s)?");
            char user = sc.nextLine().charAt(0);
            if(user == 'e')
                break;
            System.out.print("Computers term, ");
            int n = num.nextInt(3);
            if (n == 0)
                computer = 'r';
            else if (n == 1)
                computer = 'p';
            else if (n == 2)
                computer = 's';
            System.out.println("Computer chose : " + el[n]);
            
            // method call to check winner
            int status = checkWinner(computer, user);

            if (status == 0)
                System.out.println("Match tie");
            else if (status == 2){
                System.out.println("Computer Won!");
                comp_w+=1;
            }
            else if (status == 1) {
                System.out.println("You Won!");
                user_w+=1;
            }
            else if (status == 404){
                System.out.println("Wrong Choice Please Choose correct option");
            }

            System.out.println("Score ---> Computer : "+comp_w+" You : "+user_w);
            System.out.println("------------------------------------------");
        }
        System.out.println("Thank You for Playing Game");

        // Update High Score in file
        if(comp_w > hScore || user_w > hScore)
        {
            try {
                FileWriter Writer = new FileWriter("Score.txt");
                if(comp_w > user_w)
                    Writer.write(String.valueOf(comp_w));
                else
                    Writer.write(String.valueOf(user_w));
                Writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

}
