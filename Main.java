/*
Mini Project 2
Group #1: Jamie Schaffer, Mariam Bahassi, Martin Manevski, Nicholas Warren
Date: 3/11/2021
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("How many players are in this Easter egg hung? Enter a positive whole number:");
    int num = s.nextInt();

    ArrayList<Player> players = new ArrayList<Player>();

    for(int i=o; i<num; i++) {
      players.add(new Player());

    System.out.println("We have added " + num + " players to this hunt. Let's fund some eggs!");

    hunt(players);

    recap(players);

    stats(players);
    }

    public static void hunt(ArrayList<Player> the Players) {
      Random r = new Random();
      int eggsFound;

      for(int i=0; i<thePlayers.size(); i++) {
        eggsFound = r.nextInt(11);
        for(int b=0; b<eggsFound; b++) {
          thePlayers.get(i).foundEgg(new Egg());
        }
      }
    }

    
  }
}