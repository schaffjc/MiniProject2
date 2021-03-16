/**
* Mini Project 2
* @author Group #1: Jamie Schaffer, Mariam Bahassi, Martin Manevski, Nicholas Warren
* @version 3/15/2021

* This class runs the egg hunt and provides statistics at the end of the hunt.
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   //allows user to enter in the number of players and stores it in a scanner
    System.out.println("How many players are in this Easter egg hunt? Enter a positive whole number:");
    boolean isInv = true;
    int num = 0;
    //checks to see if the user's number is negative or positive
    while(isInv){
      try{
        num = s.nextInt();
        isInv = false;
      } catch(InputMismatchException e){
        System.out.println("This number is not valid, please enter a new number:");
        s.next();
      }
    }
  //let's the user know their input was negative
  while (num < 0) {
    Scanner n = new Scanner(System.in);
    System.out.println("This number is negative, please enter a positive number:");
    num = n.nextInt();
    }
    //adds new players to the ArayList depending on the number that the user entered in    
    ArrayList<Player> players = new ArrayList<Player>();

    for(int i=0; i<num; i++) {
      players.add(new Player());
    }


    System.out.println("We have added " + num + " players to this hunt. Let's fund some eggs!");

    hunt(players);

    recap(players);

    stats(players);
    }

/**
* The hunt method is where the players actually "find" the eggs and a random number of eggs is determined 
* @param players ArrayList
*/
    public static void hunt(ArrayList<Player> thePlayers) {
      Random r = new Random();
      int eggsFound;
      //randomly determines how many eggs the players find
      for(int i=0; i<thePlayers.size(); i++) {
        eggsFound = r.nextInt(11);
        for(int b=0; b<eggsFound; b++) {
          thePlayers.get(i).foundEgg(new Egg());
        }
      }
    }

/**
* The recap method prints out how many eggs each player found
* @param players ArrayList
*/
    public static void recap(ArrayList<Player> thePlayers) {
      for(int i=0; i<thePlayers.size(); i++) {
        System.out.println("\nPlayer " + i + " found " + thePlayers.get(i).getNumberEggs() + " eggs");
        thePlayers.get(i).printBasket();
      }
    }

/**
* The stats method counts and displays the player who found the most eggs and then gives a total for each color egg
* @param players ArrayList
*/
    public static void stats(ArrayList<Player> thePlayers) {
      int mostEggsPlayer = 0;
      int mostEggsNumber = 0;

      //determines who had the most eggs
      for(int i=0; i<thePlayers.size(); i++) {
        if(thePlayers.get(i).getNumberEggs() > mostEggsNumber) {
          mostEggsNumber = thePlayers.get(i).getNumberEggs();
          mostEggsPlayer = i;
        }
      }

      //prints out who the winner is
      System.out.println("\n\nPlayer " + mostEggsPlayer + " found the most eggs, with " + mostEggsNumber + " eggs!");

      //counts the number of eggs for each color
      int[] colors = new int [4];
      for(int i=0; i<thePlayers.size(); i++) {
        for(int b=0; b<thePlayers.get(i).getNumberEggs(); b++){
           if(thePlayers.get(i).getBasket().get(b).getColor().equals("blue"))
            colors[0]++;  
          if(thePlayers.get(i).getBasket().get(b).getColor().equals("pink"))
            colors[1]++;
          if(thePlayers.get(i).getBasket().get(b).getColor().equals("yellow"))
            colors[2]++;
          if(thePlayers.get(i).getBasket().get(b).getColor().equals("green"))
            colors[3]++; 
      }
    }
    //prints out some stats
    System.out.println("\n\nTotal eggs found:");
    System.out.println("Blue eggs: " + colors[0]);
    System.out.println("Pink eggs: " + colors[1]);
    System.out.println("Yellow eggs: " + colors[2]);
    System.out.println("Green eggs: " + colors[3]);
  }
}