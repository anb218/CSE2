import java.util.Scanner;

public class rockPaperScissors{
  public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    int AI= (int)((3*Math.random())+1);
    String compChoice = "";
    
    System.out.println("Please choose Rock, Paper or Scissors:" );
    String choice = myScanner.next();
    choice = choice.toLowerCase();
    choice = choice.substring(0,1).toUpperCase() + choice.substring(1);
    
    if (AI==1){
      compChoice = "Rock";
    }
    if (AI==2){
      compChoice = "Paper";
    }
    if (AI==3){
      compChoice = "Scissors";
    }
    System.out.printf("The computer has chosen: %s\n",compChoice);
    System.out.printf("You have chosen: %s\n\n", choice);
    
    if (choice.equals("Rock") && compChoice.equals("Rock")){
      System.out.println("This match has resulted into a draw");
    }
    else if (choice.equals("Rock") && compChoice.equals("Scissors")){
      System.out.println("You have won this round! But beware of the next!");
    }
    else if (choice.equals("Rock") && compChoice.equals("Paper")){
      System.out.println("Oh, I'm sorry, do you want a rematch?");
    }
    else if (choice.equals("Paper") && compChoice.equals("Paper")){
      System.out.println("This match has resulted into a draw");
    } 
    else if (choice.equals("Paper") && compChoice.equals("Rock")){
      System.out.println("You have won this round! But beware of the next!");
    }
    else if (choice.equals("Paper") && compChoice.equals("Scissors")){
      System.out.println("HA! This round is mine my young Padawan");
    }
    else if (choice.equals("Scissors") && compChoice.equals("Scissors")){
      System.out.println("This match has resulted into a draw");
    }
    else if (choice.equals("Scissors") && compChoice.equals("Rock")){
      System.out.println("YOU LITTLE MOTHERFUCKER, IM THE KING");
    }
    else if (choice.equals("Scissors") && compChoice.equals("Paper")){
      System.out.println("You have won this round! But beware of the next!");
    }
    else{
      System.out.println("Error: You must have miss-typed your choice"); 
    }
  } 
}